/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IAlbumNegocio {
    
    /**
     * Método para obtener las canciones
     * @param filtro condiciones de la búsqueda
     * @param restringidos generos restringidos
     * @return regresa las cancione obtenidas
     * @throws NegocioException lanza una excepción tipo negocio 
     */
    public List<AlbumDTO> obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
    
    /**
     * Método para obtener los álbumes de acuerdo a los filtros
     * @param filtro condiciones de la búsqueda
     * @param restringidos
     * @return
     * @throws NegocioException 
     */
    public List<AlbumDTO> obtenerAlbumesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
}
