/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Docs.CancionDoc;
import InterfacesDAO.IAlbumDAO;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.in;
import static com.mongodb.client.model.Filters.not;
import static com.mongodb.client.model.Projections.*;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class AlbumDAO implements IAlbumDAO{
    
    private final MongoCollection<AlbumColeccion> coleccion;

    public AlbumDAO(IConexionDB conexionDB) {
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Albumes", AlbumColeccion.class);
    }

    @Override
    public List<AlbumColeccion> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();
        
        Bson filtroArtista = match(not(in("artista.generos", restringidos)));
        
        
        Bson filtroProyeccion = project(fields(
                computed("artista", "$artista"), 
                computed("fechaLanzamiento", "$fechaLanzamiento"), 
                computed("canciones", new Document("$filter", new Document()
                        .append("input", "$canciones")
                        .append("as", "cancion") 
                        .append("cond",  new Document("$and", Arrays.asList(
                                new Document("$regexMatch", new Document() // Condición $regexMatch
                                        .append("input", "$$cancion.nombre")
                                        .append("regex", "^" + filtro)
                                        .append("options", "i"))
                        ))
                ))), include("nombre"), include("imagen")
        ));
        
        if(!coleccion.aggregate(Arrays.asList(filtroArtista,filtroProyeccion)).iterator().hasNext())
            return null;
        
        for(AlbumColeccion album : coleccion.aggregate(Arrays.asList(filtroArtista,filtroProyeccion))){
            
                albumes.add(album);
                
        }

        
        if(!albumes.isEmpty())
            return albumes;
        else    
            return null;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar las canciones por filtro en la base de datos", e);
        }
    }
    
    @Override
    public List<AlbumColeccion> obtenerCancionesPorBusquedaGeneros(String filtro, List<GeneroColeccion> especificados) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();
            
        Bson filtroArtista = match(in("artista.generos", especificados));
        
        Bson filtroProyeccion = project(fields(
                computed("artista", "$artista"), 
                computed("fechaLanzamiento", "$fechaLanzamiento"), 
                computed("canciones", new Document("$filter", new Document()
                        .append("input", "$canciones")
                        .append("as", "cancion") 
                        .append("cond",  new Document("$and", Arrays.asList(
                                new Document("$regexMatch", new Document() // Condición $regexMatch
                                        .append("input", "$$cancion.nombre")
                                        .append("regex", "^" + filtro)
                                        .append("options", "i"))
                        ))
                ))), include("nombre"), include("imagen")
        ));
        
        if(!coleccion.aggregate(Arrays.asList(filtroArtista,filtroProyeccion)).iterator().hasNext())
            return null;
        
        for(AlbumColeccion album : coleccion.aggregate(Arrays.asList(filtroArtista,filtroProyeccion))){
            
                albumes.add(album);
                
        }

        
        if(!albumes.isEmpty())
            return albumes;
        else    
            return null;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar las canciones por filtro en la base de datos", e);
        }
    }
    @Override
    public List<AlbumColeccion> obtenerCancionesPorFecha(int anio, List<GeneroColeccion> restringidos) throws PersistenciaException{
  
        
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();
        
        Bson filtroArtista = Filters.nin("artista.generos", restringidos);
        
        Bson filtroArtista2 = Filters.expr(
                new Document("$eq", Arrays.asList(
                new Document("$year", "$fechaLanzamiento"), 
                anio                
            ))
        );
        
        Bson filtrosCombinados = Filters.and(filtroArtista, filtroArtista2);
        
        
        if(!coleccion.find(filtrosCombinados).iterator().hasNext())
            return null;
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){
            
                albumes.add(album);
                
        }
        
        if(!albumes.isEmpty())
            return albumes;
        else    
            return null;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar las canciones por filtro en la base de datos", e);
        }
    }
    
    @Override
    public List<AlbumColeccion> obtenerCancionesPorFechaGeneros(int anio, List<GeneroColeccion> especificados) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();
            
        Bson filtroArtista = Filters.in("artista.generos", especificados);
        
        Bson filtroArtista2 = Filters.expr(         
                new Document("$eq", Arrays.asList(
                new Document("$year", "$fechaLanzamiento"), 
                anio                
            )));
        
        Bson filtrosCombinados = Filters.and(filtroArtista, filtroArtista2);
        
        if(!coleccion.find(filtrosCombinados).iterator().hasNext())
            return null;
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){
            
                albumes.add(album);
                
        }


        
        if(!albumes.isEmpty())
            return albumes;
        else    
            return null;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar las canciones por filtro en la base de datos", e);
        }
    }
    
    @Override
    public List<AlbumColeccion> obtenerAlbumesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();

        Bson filtroArtista1 = Filters.nin("artista.generos", restringidos);
        Bson filtroArtista2 = Filters.regex("nombre", "^" +filtro, "i");
        
        Bson filtrosCombinados = Filters.and(filtroArtista1,filtroArtista2);
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){

            albumes.add(album);
            
        }

        if(albumes.isEmpty())
            return null;
        
        return albumes;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los albumes por filtro en la base de datos", e);
        } 
    }
        
    @Override
    public List<AlbumColeccion> obtenerAlbumesPorBusquedaGeneros(String filtro, List<GeneroColeccion> especificados) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();

        Bson filtroArtista1 = Filters.in("artista.generos", especificados);
        Bson filtroArtista2 = Filters.regex("nombre", "^" +filtro, "i");
        
        Bson filtrosCombinados = Filters.and(filtroArtista1,filtroArtista2);
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){

            albumes.add(album);
            
        }

        if(albumes.isEmpty())
            return null;
        
        return albumes;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los albumes por filtro en la base de datos", e);
        } 
    }
        
    @Override
    public List<AlbumColeccion> obtenerAlbumesPorFecha(int anio, List<GeneroColeccion> restringidos) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();

        Bson filtroArtista1 = Filters.nin("artista.generos", restringidos);
        
        Bson filtroArtista2 = Filters.expr(         
                new Document("$eq", Arrays.asList(
                new Document("$year", "$fechaLanzamiento"), 
                anio                
            )));
        
        Bson filtrosCombinados = Filters.and(filtroArtista1,filtroArtista2);
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){

            albumes.add(album);
            
        }

        if(albumes.isEmpty())
            return null;
        
        return albumes;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los albumes por filtro en la base de datos", e);
        } 
    }
        
    @Override
    public List<AlbumColeccion> obtenerAlbumesPorFechaGeneros(int anio, List<GeneroColeccion> especificados) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();

        Bson filtroArtista1 = Filters.in("artista.generos", especificados);
        
        Bson filtroArtista2 = Filters.expr(         
                new Document("$eq", Arrays.asList(
                new Document("$year", "$fechaLanzamiento"), 
                anio                
            )));
        
        Bson filtrosCombinados = Filters.and(filtroArtista1,filtroArtista2);
        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados)){

            albumes.add(album);
            
        }

        if(albumes.isEmpty())
            return null;
        
        return albumes;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los albumes por filtro en la base de datos", e);
        } 
    }
    
    @Override
    public List<AlbumColeccion> obtenerAlbumesPorArtista(ArtistaColeccion artista) throws PersistenciaException{
    
        try{
            
        List<AlbumColeccion> albumes = new ArrayList<>();
        
        Bson filtroArtista = Filters.eq("artista._id", artista.getId());
        
        for(AlbumColeccion album : coleccion.find(filtroArtista)){

            albumes.add(album);
            
        }

        if(albumes.isEmpty())
            return null;
        
        return albumes;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los albumes por filtro en la base de datos", e);
        } 
        
    }
    
    @Override
    public List<GeneroColeccion> obtenerGenerosPorCancion(CancionDoc cancion) throws PersistenciaException{
    
        AlbumColeccion album;
        
        Bson filtroCancion = Filters.in("canciones", cancion);
        
        album = coleccion.find(filtroCancion).first();
        
        return album.getArtista().getGeneros();
        
    }
    
    @Override
    public AlbumColeccion obtenerAlbumPorCancion(CancionDoc cancion) throws PersistenciaException{
    
        AlbumColeccion album;
        
        Bson filtroCancion = Filters.in("canciones", cancion);
        
        album = coleccion.find(filtroCancion).first();
        
        return album;
        
    }
    
}
