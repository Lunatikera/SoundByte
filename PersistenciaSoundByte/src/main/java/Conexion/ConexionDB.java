/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import InterfacesDAO.IConexionDB;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 *
 * @author SantiagoSanchez
 */
public class ConexionDB implements IConexionDB {

    private MongoClient mongoClient;
    private MongoDatabase database;

    // Constructor que recibe parámetros de conexión
    public ConexionDB(String connectionString, String databaseName) {
        // Configurar el CodecRegistry para POJOs
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        ConnectionString connString = new ConnectionString(connectionString);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .codecRegistry(pojoCodecRegistry)
                .build();

        mongoClient = MongoClients.create(settings); // Crear cliente MongoDB
        this.database = mongoClient.getDatabase(databaseName); // Obtener base de datos
    }

    @Override
    public MongoDatabase getDatabase() {
        return this.database;
    }

    @Override
    public void close() {
        if (mongoClient != null) {
            mongoClient.close(); // Cerrar la conexión
        }
    }
}
