/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.UsuarioColeccion;
import DTO.UsuarioDTO;
import excepciones.NegocioException;
import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author SantiagoSanchez
 */
public interface IUsuarioNegocio {

    void crearUsuario(UsuarioDTO usuario) throws NegocioException;
    
    void actualizarUsuario(UsuarioDTO usuarioViejo, UsuarioDTO usuarioNuevo) throws NegocioException;
    
    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws NegocioException;

}
