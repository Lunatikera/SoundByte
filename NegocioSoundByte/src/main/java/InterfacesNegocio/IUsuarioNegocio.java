/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import excepciones.INegocioException;
import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author SantiagoSanchez
 */
public interface IUsuarioNegocio {

    void crearUsuario(UsuarioDTO usuario) throws INegocioException;
    
    void actualizarUsuario(UsuarioDTO usuarioViejo, UsuarioDTO usuarioNuevo) throws INegocioException;
    
    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws INegocioException;


}
