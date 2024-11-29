/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import InterfacesDAO.IArtistaDAO;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;

/**
 *
 * @author santi
 */
public class ArtistaDAO implements IArtistaDAO{

    private final MongoCollection<ArtistaColeccion> coleccion;
    
    public ArtistaDAO(IConexionDB conexionDB) {
        
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Artistas", ArtistaColeccion.class);
    }
    
    @Override
    public List<ArtistaColeccion> obtenerArtistasPorBusqueda(String filtro, List<GeneroColeccion> restringidos) throws PersistenciaException{
        try{
        List<ArtistaColeccion> artistas = new ArrayList<>();

        Bson filtroArtista1 = Filters.nin("artista.generos", restringidos);
        Bson filtroArtista2 = Filters.regex("nombre", "^" +filtro, "i");
        
        Bson filtrosCombinados = Filters.and(filtroArtista1,filtroArtista2);
        
        for(ArtistaColeccion artista : coleccion.find(filtrosCombinados)){

            artistas.add(artista);
            
        }

        if(artistas.isEmpty())
            return null;
        
        return artistas;
        
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar los artistas por filtro en la base de datos", e);
        } 
    }
    
    
}
