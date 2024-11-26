/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.AlbumColeccion;
import Colecciones.GeneroColeccion;
import Docs.CancionDoc;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IAlbumDAO {
    
    public List<AlbumColeccion> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
}
