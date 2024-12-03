/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
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
    
    public List<AlbumColeccion> obtenerCancionesPorBusquedaGeneros(String filtro, List<GeneroColeccion> especificados) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerCancionesPorFecha(int anio, List<GeneroColeccion> restringidos) throws PersistenciaException;
        
    public List<AlbumColeccion> obtenerCancionesPorFechaGeneros(int anio, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorBusquedaGeneros(String filtro, List<GeneroColeccion> especificados) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorFechaGeneros(int anio, List<GeneroColeccion> especificados) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorFecha(int anio, List<GeneroColeccion> restringidos) throws PersistenciaException;
    
    public List<AlbumColeccion> obtenerAlbumesPorArtista(ArtistaColeccion artista) throws PersistenciaException;

    public List<GeneroColeccion> obtenerGenerosPorCancion(CancionDoc cancion) throws PersistenciaException;
            
    public AlbumColeccion obtenerAlbumPorCancion(CancionDoc cancion) throws PersistenciaException;
    
}
