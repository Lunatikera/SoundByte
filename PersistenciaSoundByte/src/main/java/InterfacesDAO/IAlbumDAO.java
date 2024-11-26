/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.GeneroColeccion;
import Docs.CancionDoc;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IAlbumDAO {
    
    public List<CancionDoc> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
}
