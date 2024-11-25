/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.GeneroColeccion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IGeneroDAO {
    
    public List<GeneroColeccion> buscarTodosGeneros() throws PersistenciaException;
    
    public List<GeneroColeccion> buscarGeneroPorNombre(String nombre) throws PersistenciaException;
    
}
