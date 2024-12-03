/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.AlbumColeccion;
import Colecciones.GeneroColeccion;
import DTO.AlbumDTO;
import DTO.ArtistaDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import InterfacesDAO.IAlbumDAO;
import InterfacesNegocio.IAlbumNegocio;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de lógica de álbum
 * @author santi
 */
public class AlbumNegocio implements IAlbumNegocio{
    
    /**
     * Declaración de variable
     */
    private final IAlbumDAO albumDAO;

    /**
     * Método constructor
     * @param albumDAO valor a inicializar 
     */
    public AlbumNegocio(IAlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }
    
    /**
     * Método para obtener canciones 
     * @param filtro condiciones de búsqueda
     * @param restringidos géneros restringidos
     * @return regresa las canciones
     * @throws NegocioException lanza una excepción de negocio
     */
    @Override
    public List<AlbumDTO> obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            
            if(albumDAO.obtenerCancionesPorBusqueda(filtro, restringidos.getRestringidos().getGeneros()) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerCancionesPorBusqueda(filtro, restringidos.getRestringidos().getGeneros())){
            
                albumes.add(convertirAlbumDTO(album));
                
            }
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    /**
     * Obtiene los álbumes con filtros
     * @param filtro condiciones de búsqueda
     * @param restringidos géneros no deseados
     * @return regresa los álbumes obtenidos
     * @throws NegocioException lanza una excepción tipo negocio
     */
    @Override
    public List<AlbumDTO> obtenerAlbumesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            
            for(AlbumColeccion album : albumDAO.obtenerAlbumesPorBusqueda(filtro, restringidos.getRestringidos().getGeneros())){
            
                if(!album.getCanciones().isEmpty())
                albumes.add(convertirAlbumDTO(album));
                
            }
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    /**
     * Método qeu convierte a DTO
     * @param albumC album de la colección
     * @return regresa el AlbumDTO
     */
    public AlbumDTO convertirAlbumDTO(AlbumColeccion albumC){
    
        AlbumDTO albumD = new AlbumDTO();
        
        albumD.setId(albumC.getId());
        
        if(albumC.getArtista() != null){
        
            ArtistaDTO artD = new ArtistaDTO();
            
            artD.setId(albumC.getArtista().getId());
            
            if (albumC.getArtista().getGeneros() != null){
        
                List<GeneroDTO> generos = new ArrayList<>();
                
                for(GeneroColeccion genero : albumC.getArtista().getGeneros()){
                
                    GeneroDTO generoD = new GeneroDTO();
                    
                    generoD.setId(genero.getId());
                    generoD.setImagenGenero(genero.getImagenGenero());
                    generoD.setNombre(genero.getNombre());
                    
                    generos.add(generoD);
                    
                }
                
                artD.setGeneros(generos);
                
            } else
                artD.setGeneros(null);
            
            artD.setNombre(albumC.getArtista().getNombre());
            artD.setImagen(albumC.getArtista().getImagen());
            artD.setId(albumC.getArtista().getId());
//            artD.setRedesSociales(albumC.getRedesSociales());
            artD.setEsBanda(albumC.getArtista().getEsBanda());
            
            if(albumC.getArtista().getEsBanda()){
            
                artD.setIntegrante(albumC.getArtista().getIntegrante());
                
            } else{
            
                artD.setIntegrante(null);
                
            }
            
            albumD.setArtista(artD);
            
        } else
            albumD.setArtista(null);
        
        albumD.setFechaLanzamiento(albumC.getFechaLanzamiento());
        albumD.setNombre(albumC.getNombre());
        albumD.setImagen(albumC.getImagen());
        albumD.setCanciones(albumC.getCanciones());
        
        
        
        return albumD;
    }
}
