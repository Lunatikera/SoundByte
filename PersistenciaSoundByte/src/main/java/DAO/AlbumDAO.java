/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.GeneroColeccion;
import InterfacesDAO.IAlbumDAO;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.in;
import static com.mongodb.client.model.Filters.not;
import static com.mongodb.client.model.Projections.computed;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 * CLase Album DOA
 * @author santi
 */
public class AlbumDAO implements IAlbumDAO{
    
    /**
     * Declaracion de variable
     */
    private final MongoCollection<AlbumColeccion> coleccion;

    /**
     * Constructor 
     * @param conexionDB conexionDB
     */
    public AlbumDAO(IConexionDB conexionDB) {
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Albumes", AlbumColeccion.class);
    }

    /**
     * Método para obtener las canciones filtradas
     * @param filtro condiciones de búsqueda
     * @param restringidos géneros no deseados
     * @return regresa las canciones obtenidas
     * @throws PersistenciaException lanza excepción de tipo
     * persistencia
     */
    @Override
    public List<AlbumColeccion> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException{
        try{
        List<AlbumColeccion> albumes = new ArrayList<>();

        Bson filtroArtista = match(not(in("artista.generos", restringidos)));
        
        
        Bson filtroProyeccion = project(fields(
                computed("artista", "$artista"), 
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
    
    /**
     * Método para obtener los álbumes filtrados
     * @param filtro condiciones de búsqueda
     * @param restringidos géneros no deseados
     * @return regresa los álbumes
     * @throws PersistenciaException lanza excepción tipo
     * persistencia
     */
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
    
}
