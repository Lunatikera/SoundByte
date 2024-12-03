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
import com.mongodb.client.model.Filters;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

/**
 *
 * @author santi
 */
public class GeneroDAO implements IGeneroDAO {

    private final CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    private final IConexionDB conexionDB;

    private final MongoCollection<GeneroColeccion> coleccion;

    // Constructor con inyección de dependencia para la conexión
    public GeneroDAO(IConexionDB conexionDB) {
        this.conexionDB = conexionDB;
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Generos", GeneroColeccion.class);
    }

    @Override
    public List<GeneroColeccion> buscarTodosGeneros() throws PersistenciaException {
        try {
            List<GeneroColeccion> todosLosGeneros = new ArrayList<>();
            // Recorremos todos los documentos de la colección y los agregamos a la lista
            coleccion.find().into(todosLosGeneros);
            return todosLosGeneros;
        } catch (Exception e) {
            // En caso de error, lanzamos una PersistenciaException con el mensaje adecuado
            throw new PersistenciaException("Error al buscar todos los géneros en la base de datos", e);
        }
    }

    // Ejemplo de método adicional para búsqueda por nombre
    @Override
    public GeneroColeccion buscarGeneroPorNombre(String nombre) throws PersistenciaException {
        try {
            Bson filtro = Filters.regex("nombre", "^" + nombre + "$", "i");

            return coleccion.find(filtro).first();
        } catch (Exception e) {
            throw new PersistenciaException("Error al buscar el género por nombre en la base de datos", e);
        }
    }
}
