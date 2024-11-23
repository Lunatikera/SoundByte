/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.UsuarioColeccion;
import Conexion.ConexionDB;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IUsuarioDAO;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import excepciones.PersistenciaException;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;


/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioDAO implements IUsuarioDAO {

    CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),fromProviders(PojoCodecProvider.builder().automatic(true).build()));
    IConexionDB conexionDB = new ConexionDB();
    MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte").withCodecRegistry(pojoCodecRegistry);    

    private final MongoCollection<UsuarioColeccion> coleccion;

    public UsuarioDAO() {

    
    this.coleccion = database.getCollection("Usuarios", UsuarioColeccion.class);
        
    }
    
    public void abrirConexion(){
    }

    @Override
    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException {
        try
        {
            coleccion.insertOne(usuario);

        } catch (Exception e)
        {
            throw new PersistenciaException("Error al crear el usuario en la base de datos", e);
        }
    }
    

    @Override
    public void actualizarUsuario(UsuarioColeccion usuarioViejo, UsuarioColeccion usuarioNuevo) throws PersistenciaException {
        try
        {
            
            Bson filtro = Filters.eq("_id", usuarioViejo.getId());

            coleccion.replaceOne(filtro, usuarioNuevo);


        } catch (Exception e)
        {
            throw new PersistenciaException("Error al editar el usuario en la base de datos", e);
        }
    }

    @Override
    public UsuarioColeccion obtenerUsuarioPorCredenciales(String correoElectronico) throws PersistenciaException {

        try
        {
            
            Bson filtro = Filters.regex("correoElectronico", correoElectronico, "i");
            UsuarioColeccion documentoUsuario = coleccion.find(filtro).first();

            return documentoUsuario;
        
        } catch (Exception e)
        {
            throw new PersistenciaException("Error al crear el usuario en la base de datos", e);
        }

        }
    }



