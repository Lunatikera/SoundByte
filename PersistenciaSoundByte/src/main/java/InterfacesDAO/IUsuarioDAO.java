/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import Colecciones.UsuarioColeccion;
import excepciones.PersistenciaException;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author SantiagoSanchez
 */
public interface IUsuarioDAO {

    /**
     * Método para crear usuario en la coleccion
     * @param usuario usuario a crear
     * @throws PersistenciaException 
     */
    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException;
    
    /**
     * Actualiza el usuario deseado en la colección
     * @param usuarioNuevo usuario actualizado en la colección
     * @throws PersistenciaException se lanza una peristenciaException 
     * en caso de encontrar un error en el proceso de actualización
     */
    public void actualizarUsuario( UsuarioColeccion usuarioNuevo) throws PersistenciaException;
    
    /**
     * Obtenemos un usuario por medio de las credenciales
     * @param telefono usamos telefono para obtener el usuario
     * @return regresa el usuario filtrado
     * @throws PersistenciaException lanzamos una excepcion tipo persistencia
     * en caso de obtener error en el proceso
     */
    public UsuarioColeccion obtenerUsuarioPorCredenciales(String telefono)throws PersistenciaException;



}
