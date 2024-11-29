/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IArtistaDAO {
    
    public List<ArtistaColeccion> obtenerArtistasPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
            
}
