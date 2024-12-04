/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.UsuarioColeccion;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IUsuarioDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import excepciones.PersistenciaException;
import org.bson.conversions.Bson;

/**
 * Clase usuarioDAO
 * @author SantiagoSanchez
 */

public class UsuarioDAO implements IUsuarioDAO {
    
    private final MongoCollection<UsuarioColeccion> coleccion;

    /**
     * Creamos la conexion en el constructor
     * @param conexionDB usamos la conexion de parametro para obtener la bd
     */
    public UsuarioDAO(IConexionDB conexionDB) {
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Usuarios", UsuarioColeccion.class);
    }

    /**
     * Método para crear un usuario, inserta ala colección con .insertOne
     * @param usuario de tipo UsuarioColeccion
     * 
     * @throws PersistenciaException lanza una excepción en cado de tener un error 
     * al crear el usuario
     */
    @Override
    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException {
        try {
            coleccion.insertOne(usuario);  // Inserta un nuevo usuario en la colección
        } catch (Exception e) {
            throw new PersistenciaException("Error al crear el usuario en la base de datos", e);
        }
    }

    /**
     * Actualiza el usuario por medio de _id para buscar el usuario a actualizar
     * @param usuarioNuevo parámetro que se usará para actualizar y tener el nuevo usuario
     * 
     * @throws PersistenciaException lanzamos una excepcion de tipo persistencia 
     * en caso de que exista un error
     * 
     */
    @Override
    public void actualizarUsuario( UsuarioColeccion usuarioNuevo) throws PersistenciaException {
          try {
        // Usamos el ID del usuarioNuevo para encontrar el usuario a actualizar
        Bson filtro = Filters.eq("_id", usuarioNuevo.getId());  

        // Realizamos el reemplazo del usuario completo
        coleccion.replaceOne(filtro, usuarioNuevo);
    } catch (Exception e) {
        throw new PersistenciaException("Error al actualizar el usuario en la base de datos", e);
    }
}
    

    /**
     * Usamos una credencial, en este caso el Correo Electrónico para obtener el usuario deseado
     * @param correoElectronico por medio de este parámetro obtenemos el usuario de requerido
     * @return regresamos el usuario filtrado
     * @throws PersistenciaException lanzamos una excepcion tipo persistencia en caso de obtener un error en el 
     * proceso
     */
    @Override
    public UsuarioColeccion obtenerUsuarioPorCredenciales(String correoElectronico) throws PersistenciaException {
        try {
            Bson filtro = Filters.regex("correoElectronico", "^" + correoElectronico + "$", "i");  // Filtro para buscar por correo electrónico
            UsuarioColeccion documentoUsuario = coleccion.find(filtro).first();  // Busca el primer usuario que coincida con el filtro

            return documentoUsuario;  // Retorna el usuario encontrado o null si no hay coincidencias
        } catch (Exception e) {
            throw new PersistenciaException("Error al obtener el usuario por credenciales", e);
        }
    }
}
