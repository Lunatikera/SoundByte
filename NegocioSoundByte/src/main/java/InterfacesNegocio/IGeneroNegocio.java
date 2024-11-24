/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.GeneroColeccion;
import DTO.GeneroDTO;
import excepciones.INegocioException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IGeneroNegocio {
    
    public List<GeneroDTO> buscarTodosGeneros() throws INegocioException;
    
    public List<GeneroColeccion> convertirListaGenerosDTO(List<GeneroDTO> generos);
    
    public List<GeneroDTO> convertirListaGenerosColeccion(List<GeneroColeccion> generos);
}
