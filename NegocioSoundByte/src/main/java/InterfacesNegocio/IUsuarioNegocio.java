/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import excepciones.NegocioException;
import org.bson.types.ObjectId;
import java.util.List;

/**
 * Interfaz de usuario
 * @author SantiagoSanchez
 */
public interface IUsuarioNegocio {

    /**
     * Método para crear un usuario en la colección
     * @param usuario usuario a crear en la colección
     * @throws NegocioException  lanza una excepcion de tipo negocio
     */
    public void crearUsuario(UsuarioDTO usuario) throws NegocioException;

    /**
     * Método para actualizar un usuario en la colección
     * @param usuarioNuevo usuario a actualizar
     * @throws NegocioException lanza una excepcion de tipo negocio
     */
    
    public void actualizarUsuario(UsuarioDTO usuarioNuevo) throws NegocioException;

    /**
     * Método Método para obtener usuario por medio de correo electronico
     * @param dto UsuarioDto
     * @return regresa el usaurio loggeado
     * @throws NegocioException lanza una excepcion de tipo negocio
     */
    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws NegocioException;

}
