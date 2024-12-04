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
 * Interfaces album
 * @author santi
 */
public interface IAlbumDAO {
    
    /**
     * obtiene canciones por busqueda
     * @param filtro condiciones
     * @param restringidos no deseados
     * @return lista de canciones
     * @throws PersistenciaException excepcion
     */
    public List<AlbumColeccion> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    /**
     * obtiene albumes
     * @param filtro condiciones
     * @param restringidos no deseados
     * @return regresa albumes
     * @throws PersistenciaException excepcion
     */
    public List<AlbumColeccion> obtenerAlbumesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
}
