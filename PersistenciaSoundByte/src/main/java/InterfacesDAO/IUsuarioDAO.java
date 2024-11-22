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

    public void crearUsuario(UsuarioColeccion usuario) throws PersistenciaException;
    
    public void actualizarUsuario(UsuarioColeccion usuarioViejo, UsuarioColeccion usuarioNuevo) throws PersistenciaException;
    
    public UsuarioColeccion obtenerUsuarioPorCredenciales(String telefono, String contraseña)throws PersistenciaException;



}
