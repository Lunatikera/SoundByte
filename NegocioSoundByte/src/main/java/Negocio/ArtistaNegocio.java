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
import InterfacesDAO.IArtistaDAO;
import InterfacesNegocio.IArtistaNegocio;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ArtistaNegocio implements IArtistaNegocio{

    private final IArtistaDAO artistaDAO;

    public ArtistaNegocio(IArtistaDAO artistaDAO) {
        
        this.artistaDAO = artistaDAO;
        
    }
    
    @Override
    public List<ArtistaDTO> obtenerArtistasPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<ArtistaDTO> artistas = new ArrayList<>();
            List<GeneroColeccion> generosRestringidos = new ArrayList<>();

            
            if(restringidos.getRestringidos() != null)
                if(restringidos.getRestringidos().getGeneros() != null)
                    generosRestringidos = restringidos.getRestringidos().getGeneros();
            
            
            
            if(artistaDAO.obtenerArtistasPorBusqueda(filtro, generosRestringidos) == null)
                return null;
            
            for(ArtistaColeccion artista : artistaDAO.obtenerArtistasPorBusqueda(filtro, generosRestringidos))
                artistas.add(convertirArtistaDTO(artista));
            
            return artistas;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }    
    
    @Override
    public List<ArtistaDTO> obtenerArtistasPorBusquedaGeneros(String filtro, List<GeneroDTO> generos) throws NegocioException{
        
        try {
            
            List<ArtistaDTO> artistas = new ArrayList<>();
            List<GeneroColeccion> generosEspecificados = new ArrayList<>();
            
            for(GeneroDTO genero : generos){
            
                GeneroColeccion generoC = new GeneroColeccion();
                
                generoC.setId(genero.getId());
                generoC.setNombre(genero.getNombre());
                generoC.setDescrpicion(genero.getDescripcion());
                generoC.setImagenGenero(genero.getImagenGenero());
                
                generosEspecificados.add(generoC);
                
            }
            

            if(artistaDAO.obtenerArtistasPorBusquedaGeneros(filtro, generosEspecificados) == null)
                return null;
            
            for(ArtistaColeccion artista : artistaDAO.obtenerArtistasPorBusquedaGeneros(filtro, generosEspecificados))
                artistas.add(convertirArtistaDTO(artista));
            
            return artistas;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    @Override
    public ArtistaDTO convertirArtistaDTO(ArtistaColeccion artistaC){
    
        ArtistaDTO artD = new ArtistaDTO();
            
        artD.setId(artistaC.getId());

        if (artistaC.getGeneros() != null){

            List<GeneroDTO> generos = new ArrayList<>();

            for(GeneroColeccion genero : artistaC.getGeneros()){

                GeneroDTO generoD = new GeneroDTO();

                generoD.setId(genero.getId());
                generoD.setImagenGenero(genero.getImagenGenero());
                generoD.setNombre(genero.getNombre());

                generos.add(generoD);

            }

            artD.setGeneros(generos);

        } else
            artD.setGeneros(null);

        artD.setNombre(artistaC.getNombre());
        artD.setImagen(artistaC.getImagen());
        artD.setRedesSociales(artistaC.getRedesSociales());
        artD.setEsBanda(artistaC.getEsBanda());

        if(artistaC.getIntegrante() != null){

            artD.setIntegrante(artistaC.getIntegrante());

        } else{

            artD.setIntegrante(null);

        }
        
        return artD;
        
    }
    
    @Override
    public ArtistaColeccion convertirArtistaColeccion(ArtistaDTO artistaDTO){
    
        ArtistaColeccion artColeccion = new ArtistaColeccion();
            
        artColeccion.setId(artistaDTO.getId());

        if (artistaDTO.getGeneros() != null){

            List<GeneroColeccion> generos = new ArrayList<>();

            for(GeneroDTO genero : artistaDTO.getGeneros()){

                GeneroColeccion generoD = new GeneroColeccion();

                generoD.setId(genero.getId());
                generoD.setImagenGenero(genero.getImagenGenero());
                generoD.setNombre(genero.getNombre());

                generos.add(generoD);

            }

            artColeccion.setGeneros(generos);

        } else
            artColeccion.setGeneros(null);

        artColeccion.setNombre(artistaDTO.getNombre());
        artColeccion.setImagen(artistaDTO.getImagen());
        artColeccion.setRedesSociales(artistaDTO.getRedesSociales());
        artColeccion.setEsBanda(artistaDTO.getEsBanda());

        if(artistaDTO.getIntegrante() != null){

            artColeccion.setIntegrante(artistaDTO.getIntegrante());

        } else{

            artColeccion.setIntegrante(null);

        }
        
        return artColeccion;
        
    }
}
