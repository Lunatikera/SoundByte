/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import Conexion.ConexionDB;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author santi
 */
public class GeneroDAO implements IGeneroDAO{

    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    IConexionDB conexionDB = new ConexionDB();
    MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte").withCodecRegistry(pojoCodecRegistry);    

    private final MongoCollection<GeneroColeccion> coleccion;

    public GeneroDAO() {

    this.coleccion = database.getCollection("Generos", GeneroColeccion.class);
        
    }
    
    @Override
    public List<GeneroColeccion> buscarTodosGeneros() throws PersistenciaException {
    
        try
        {
            List<GeneroColeccion> todosLosGeneros = new ArrayList<>();

            for(GeneroColeccion genero : coleccion.find()){

                todosLosGeneros.add(genero);

            }

            return todosLosGeneros;
            
        } catch (Exception e)
        {
            throw new PersistenciaException("Error en persistencia al buscar todos los géneros en la base de datos", e);
        }
    }
    
    
}
