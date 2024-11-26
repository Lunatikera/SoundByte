/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import excepciones.NegocioException;

/**
 *
 * @author santi
 */
public interface IAlbumNegocio {
    
    public AlbumDTO obtenerCancionesPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
    
}
