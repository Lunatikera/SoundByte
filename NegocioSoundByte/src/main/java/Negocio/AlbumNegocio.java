/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import DTO.AlbumDTO;
import DTO.ArtistaDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import Docs.RestriccionDoc;
import InterfacesDAO.IAlbumDAO;
import InterfacesNegocio.IAlbumNegocio;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author santi
 */
public class AlbumNegocio implements IAlbumNegocio{
    
    private final IAlbumDAO albumDAO;

    public AlbumNegocio(IAlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }
    
    @Override
    public List<AlbumDTO> obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            List<GeneroColeccion> generosRestringidos = new ArrayList<>();
            
            if(restringidos.getRestringidos() != null)
                if(restringidos.getRestringidos().getGeneros() != null)
                    generosRestringidos = restringidos.getRestringidos().getGeneros();
            
            if(albumDAO.obtenerCancionesPorBusqueda(filtro, generosRestringidos) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerCancionesPorBusqueda(filtro, generosRestringidos)){
            
                albumes.add(convertirAlbumDTO(album));
                
            }
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    @Override
    public List<AlbumDTO> obtenerCancionesPorFecha(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            List<GeneroColeccion> generosRestringidos = new ArrayList<>();
            
            if(restringidos.getRestringidos() != null)
                if(restringidos.getRestringidos().getGeneros() != null)
                    generosRestringidos = restringidos.getRestringidos().getGeneros();
            
            if(!StringUtils.isNumeric(filtro))
                return null;
            
            int anio = Integer.parseInt(filtro);
            
            if(anio > 2050 || anio < 1800)
                return null;
            
            
            if(albumDAO.obtenerCancionesPorFecha(anio, generosRestringidos) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerCancionesPorFecha(anio, generosRestringidos)){
            
                albumes.add(convertirAlbumDTO(album));
                
            }
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    @Override
    public List<AlbumDTO> obtenerAlbumesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            List<GeneroColeccion> generosRestringidos = new ArrayList<>();

            
            if(restringidos.getRestringidos() != null)
                if(restringidos.getRestringidos().getGeneros() != null)
                    generosRestringidos = restringidos.getRestringidos().getGeneros();
            
            
            
            if(albumDAO.obtenerAlbumesPorBusqueda(filtro, generosRestringidos) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerAlbumesPorBusqueda(filtro, generosRestringidos))
                albumes.add(convertirAlbumDTO(album));
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }    
    @Override
    public List<AlbumDTO> obtenerCancionesPorBusquedaGeneros(String filtro, List<GeneroDTO> generos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            List<GeneroColeccion> generosEspecificados = new ArrayList<>();
            
            for(GeneroDTO genero : generos){
            
                GeneroColeccion generoC = new GeneroColeccion();
                
                generoC.setId(genero.getId());
                generoC.setNombre(genero.getNombre());
                generoC.setDescrpicion(genero.getDescripcion());
                generoC.setImagenGenero(genero.getImagenGenero());
                
                generosEspecificados.add(generoC);
                
            }
            
            if(albumDAO.obtenerCancionesPorBusquedaGeneros(filtro, generosEspecificados) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerCancionesPorBusquedaGeneros(filtro, generosEspecificados))
                albumes.add(convertirAlbumDTO(album));
              
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    @Override
    public List<AlbumDTO> obtenerAlbumesPorBusquedaGeneros(String filtro, List<GeneroDTO> generos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            List<GeneroColeccion> generosEspecificados = new ArrayList<>();

            
            for(GeneroDTO genero : generos){
            
                GeneroColeccion generoC = new GeneroColeccion();
                
                generoC.setId(genero.getId());
                generoC.setNombre(genero.getNombre());
                generoC.setDescrpicion(genero.getDescripcion());
                generoC.setImagenGenero(genero.getImagenGenero());
                
                generosEspecificados.add(generoC);
                
            }
            
            
            if(albumDAO.obtenerAlbumesPorBusquedaGeneros(filtro, generosEspecificados) == null)
                return null;
            
            for(AlbumColeccion album : albumDAO.obtenerAlbumesPorBusquedaGeneros(filtro, generosEspecificados))
                albumes.add(convertirAlbumDTO(album));
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    
    
    @Override
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
    
    @Override
    public AlbumColeccion convertirAlbumColeccion(AlbumDTO albumDTO){

            AlbumColeccion albumColeccion = new AlbumColeccion();

            albumColeccion.setId(albumDTO.getId());

            if(albumDTO.getArtista() != null){

                ArtistaColeccion artColeccion = new ArtistaColeccion();

                artColeccion.setId(albumDTO.getArtista().getId());

                if (albumDTO.getArtista().getGeneros() != null){

                    List<GeneroColeccion> generos = new ArrayList<>();

                    for(GeneroDTO genero : albumDTO.getArtista().getGeneros()){

                        GeneroColeccion generoColeccion = new GeneroColeccion();

                        generoColeccion.setId(genero.getId());
                        generoColeccion.setImagenGenero(genero.getImagenGenero());
                        generoColeccion.setNombre(genero.getNombre());

                        generos.add(generoColeccion);

                    }

                    artColeccion.setGeneros(generos);

                } else
                    artColeccion.setGeneros(null);

                artColeccion.setNombre(albumDTO.getArtista().getNombre());
                artColeccion.setImagen(albumDTO.getArtista().getImagen());
                artColeccion.setId(albumDTO.getArtista().getId());
    //            artD.setRedesSociales(albumC.getRedesSociales());
                artColeccion.setEsBanda(albumDTO.getArtista().getEsBanda());

                if(albumDTO.getArtista().getEsBanda()){

                    artColeccion.setIntegrante(albumDTO.getArtista().getIntegrante());

                } else{

                    artColeccion.setIntegrante(null);

                }

                albumColeccion.setArtista(artColeccion);

            } else
                albumColeccion.setArtista(null);

            albumColeccion.setFechaLanzamiento(albumDTO.getFechaLanzamiento());
            albumColeccion.setNombre(albumDTO.getNombre());
            albumColeccion.setImagen(albumDTO.getImagen());
            albumColeccion.setCanciones(albumDTO.getCanciones());



            return albumColeccion;
        }
    
    
}
