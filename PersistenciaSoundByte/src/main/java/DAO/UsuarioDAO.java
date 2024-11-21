/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.UsuarioColeccion;
import Conexion.ConexionDB;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IUsuarioDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import excepciones.PersistenciaException;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.Binary;
import org.bson.types.ObjectId;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioDAO implements IUsuarioDAO {


    IConexionDB conexionDB = new ConexionDB();
    MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte");    

    private final MongoCollection<Document> coleccion;

    public UsuarioDAO() {

    
    this.coleccion = database.getCollection("Usuario");
        
    }
    
    public void abrirConexion(){
    }

    @Override
    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException {
        try
        {
            
            Document doc = new Document()
                    .append("username", usuario.getUsername())                    
                    .append("correoElectronico", usuario.getCorreoElectronico())
                    .append("contraseña", usuario.getContraseña())
                    .append("imagenPerfil", usuario.getImagenPerfil());

            coleccion.insertOne(doc);


        } catch (Exception e)
        {
            throw new PersistenciaException("Error al crear el usuario en la base de datos", e);
        }
    }

    @Override
    public UsuarioColeccion obtenerUsuarioPorCredenciales(String correoElectronico, String contraseña) throws PersistenciaException {
        try
        {
            Bson filtro = Filters.eq("correoElectronico", correoElectronico);
            Bson filtro2 = Filters.eq("contraseña", contraseña);
            Bson combinedFilter = Filters.and(filtro, filtro2);
            Document documentoUsuario = coleccion.find(combinedFilter).first();

            if (documentoUsuario != null)
            {
                UsuarioColeccion usuario = new UsuarioColeccion();
                usuario.setId(documentoUsuario.getObjectId("_id"));
                usuario.setUsername(documentoUsuario.getString("username"));
                usuario.setCorreoElectronico(documentoUsuario.getString("correoElectronico"));
                usuario.setContraseña(documentoUsuario.getString("contraseña"));

                if (documentoUsuario.containsKey("imagenPerfil"))
                {
                    Binary imagenPerfil = documentoUsuario.get("imagenPerfil", Binary.class);
                    if (imagenPerfil != null)
                    {
                        usuario.setImagenPerfil(imagenPerfil.getData());
                    } else
                    {
                        usuario.setImagenPerfil(null);
                    }
                } else
                {
                    usuario.setImagenPerfil(null);
                }



                return usuario;
            } else
            {
                return null;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }


}
