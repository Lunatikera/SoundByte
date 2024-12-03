/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public interface IArtistaDAO {
    
    public List<ArtistaColeccion> obtenerArtistasPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    public List<ArtistaColeccion> obtenerArtistasPorBusquedaGeneros(String filtro, List<GeneroColeccion> especificados) throws PersistenciaException;

    
    
}
