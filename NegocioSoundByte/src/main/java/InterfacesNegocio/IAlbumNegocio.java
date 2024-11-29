/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.AlbumColeccion;
import DTO.AlbumDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IAlbumNegocio {
    
    public List<AlbumDTO> obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
    
    public List<AlbumDTO> obtenerAlbumesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
        
    public List<AlbumDTO> obtenerCancionesPorBusquedaGeneros(String filtro, List<GeneroDTO>  generos) throws NegocioException;
    
    public List<AlbumDTO> obtenerAlbumesPorBusquedaGeneros(String filtro, List<GeneroDTO>  generos) throws NegocioException;
    
    public AlbumDTO convertirAlbumDTO(AlbumColeccion albumC);
    
    public AlbumColeccion convertirAlbumColeccion(AlbumDTO albumDTO);
    
}
