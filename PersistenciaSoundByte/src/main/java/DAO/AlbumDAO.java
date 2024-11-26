/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import Docs.CancionDoc;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.elemMatch;
import com.mongodb.client.model.Projections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class AlbumDAO {
    
    private final MongoCollection<AlbumColeccion> coleccion;

    public AlbumDAO(IConexionDB conexionDB) {
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Albumes", AlbumColeccion.class);
    }

    public List<CancionDoc> obtenerCancionesPorBusqueda(String filtro, List<GeneroColeccion> restringidos){
    
        List<CancionDoc> canciones = new ArrayList<>();
        
        Bson filtroBusqueda1 = elemMatch("canciones", Filters.regex("nombre", filtro, "i"));
        Bson filtroBusqueda2 = Filters.nin("artistas.generos", restringidos);
        Bson filtrosCombinados = Filters.and(filtroBusqueda1, filtroBusqueda2);
        Bson filtroProjection = Projections.fields(Projections.include("artista"),Projections.elemMatch("canciones", Filters.regex("nombre", filtro, "i")));
        
//        if(!coleccion.find(filtroBusqueda1).projection(filtrosCombinados).iterator().hasNext())
//            return null;
//        
//        int counterRestringidos = 0;
//        
//        HashMap<Integer, ObjectId> generosRestringidos = new HashMap<>();
//        for(GeneroColeccion generoARestringir : restringidos){
//        
//            generosRestringidos.put(0, generoARestringir.getId());
//            counterRestringidos++;
//        }
//        
        for(AlbumColeccion album : coleccion.find(filtrosCombinados).projection(filtroProjection)){
            
//            List<GeneroColeccion> generosAValidar = album.getArtista().getGeneros();
//            
//            HashMap<Integer, ObjectId> generosEncontrados = new HashMap<>();
//            int counterEncontrado = 0;
//            
//            for(GeneroColeccion generoAValidar : generosAValidar){
//
//                generosEncontrados.put(0, generoAValidar.getId());
//                counterEncontrado++;
//            }

//            boolean hayCoincidencia = false;
//            
//            for (Map.Entry<Integer, ObjectId> entry : generosRestringidos.entrySet()) {
//            if (generosEncontrados.containsKey(entry.getKey()) && generosEncontrados.get(entry.getKey()).equals(entry.getValue())) {
//                hayCoincidencia = true;
//                break; // Si encontramos una coincidencia, salimos del bucle
//            }}
//            
//            if(hayCoincidencia)
//                continue;
            
            for(CancionDoc cancionEncontrada : album.getCanciones()){
                
                canciones.add(cancionEncontrada);
                
            }
            
        }

        if(canciones.isEmpty())
            return null;
        
        return canciones;
        
    }
    
    
}
