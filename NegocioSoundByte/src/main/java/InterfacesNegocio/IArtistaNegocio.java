/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.ArtistaColeccion;
import DTO.ArtistaDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IArtistaNegocio {
    
    public ArtistaDTO convertirArtistaDTO(ArtistaColeccion artistaC);
    
    public List<ArtistaDTO> obtenerArtistasPorBusqueda(String filtro, UsuarioDTO restringidos) throws NegocioException;
    
    public List<ArtistaDTO> obtenerArtistasPorBusquedaGeneros(String filtro, List<GeneroDTO> generos) throws NegocioException;
    
    public ArtistaColeccion convertirArtistaColeccion(ArtistaDTO artistaDTO);
    
}
