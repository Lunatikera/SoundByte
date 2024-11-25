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
 *
 * @author SantiagoSanchez
 */

public class UsuarioDAO implements IUsuarioDAO {
    
    private final MongoCollection<UsuarioColeccion> coleccion;

    public UsuarioDAO(IConexionDB conexionDB) {
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Usuarios", UsuarioColeccion.class);
    }

    @Override
    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException {
        try {
            coleccion.insertOne(usuario);  // Inserta un nuevo usuario en la colección
        } catch (Exception e) {
            throw new PersistenciaException("Error al crear el usuario en la base de datos", e);
        }
    }

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
