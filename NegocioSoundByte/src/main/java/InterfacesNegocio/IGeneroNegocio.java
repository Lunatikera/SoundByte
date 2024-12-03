/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.GeneroColeccion;
import DTO.GeneroDTO;
import excepciones.NegocioException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IGeneroNegocio {
    
    /**
     * Métdos que buscan todos lo géneros
     * @return regresa los géneros encontrados
     * @throws NegocioException lanza una excepción de tipo negocio
     */
    public List<GeneroDTO> buscarTodosGeneros() throws NegocioException;
    
    /**
     * Método para convertir GenerosDTO
     * @param generos lista de géneros
     * @return Regresa los géneros convertidos
     */
    public List<GeneroColeccion> convertirListaGenerosDTO(List<GeneroDTO> generos);
    
    /**
     * Método para converitr los Géneros
     * @param generos lista de generos
     * @return regresa la nueva lista
     */
    public List<GeneroDTO> convertirListaGenerosColeccion(List<GeneroColeccion> generos);
}
