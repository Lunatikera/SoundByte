/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.GeneroColeccion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 * interfaz ed género
 * @author santi
 */
public interface IGeneroDAO {
    
    /**
     * Método que busca todos los géneros
     * @return regresa los géneros obtenidos
     * @throws PersistenciaException lanza una excepcion 
     * tipo persistencia
     */
    public List<GeneroColeccion> buscarTodosGeneros() throws PersistenciaException;
    
    /**
     * Método de búsqueda de género por nombre
     * @param nombre nombre del género a buscar
     * @return regresa el género obteido
     * @throws PersistenciaException lanza la excepcion tipo 
     * persistencia
     */
    public List<GeneroColeccion> buscarGeneroPorNombre(String nombre) throws PersistenciaException;
    
}
