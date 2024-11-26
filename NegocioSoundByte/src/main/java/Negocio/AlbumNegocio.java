/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.AlbumColeccion;
import Colecciones.GeneroColeccion;
import DTO.AlbumDTO;
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
 *
 * @author santi
 */
public class AlbumNegocio implements IAlbumNegocio{
    
    private final IAlbumDAO albumDAO;

    public AlbumNegocio(IAlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }
    
    @Override
    public AlbumDTO obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            AlbumDTO album = new AlbumDTO();
            
            album.setCanciones(albumDAO.obtenerCancionesPorBusqueda(filtro, restringidos.getRestringidos().getGeneros()));
            
            return album;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    @Override
    public List<AlbumDTO> obtenerAlbumesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException{
        
        try {
            
            List<AlbumDTO> albumes = new ArrayList<>();
            
            for(AlbumColeccion album : albumDAO.obtenerAlbumesPorBusqueda(filtro, restringidos.getRestringidos().getGeneros())){
            
                
                
            }
            
            return albumes;
            
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error en negocio al buscar canciones por filtro en la base de datos", ex);
        }
        
    }
    
    public AlbumDTO convertirAlbumDTO(AlbumColeccion albumC){
    
        AlbumDTO albumD = new AlbumDTO();
        
        albumD.setId(albumC.getId());

        
        return albumD;
    }
}
