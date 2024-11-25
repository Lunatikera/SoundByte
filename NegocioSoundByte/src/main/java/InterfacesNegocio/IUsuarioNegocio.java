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
 *
 * @author SantiagoSanchez
 */
public interface IUsuarioNegocio {

    public void crearUsuario(UsuarioDTO usuario) throws NegocioException;

    public void actualizarUsuario(UsuarioDTO usuarioNuevo) throws NegocioException;

    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws NegocioException;

}
