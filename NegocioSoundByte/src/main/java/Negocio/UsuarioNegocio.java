/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import DAO.UsuarioDAO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IUsuarioNegocio;
import at.favre.lib.crypto.bcrypt.BCrypt;
import excepciones.NegocioException;
import java.util.ArrayList;
import java.util.List;
import util.Encriptacion;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioNegocio implements IUsuarioNegocio {

    private final IUsuarioDAO usuarioDAO;

    public UsuarioNegocio(IUsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void crearUsuario(UsuarioDTO usuario) throws NegocioException {
        try
        {
            UsuarioColeccion usuarioColeccion = this.convertirUsuarioDTO(usuario);
            usuarioColeccion.setContraseña(Encriptacion.encriptarPassword(usuarioColeccion.getContraseña()));
            usuarioDAO.crearUsuario(usuarioColeccion);
        } catch (Exception e)
        {
            throw new NegocioException(e.getMessage());
        }
    }
    
    @Override
    public void actualizarUsuario( UsuarioDTO usuario)throws NegocioException {
        try
        {
            UsuarioColeccion usuarioNuevo = this.convertirUsuarioDTO(usuario);
            usuarioDAO.actualizarUsuario(usuarioNuevo);
        } catch (Exception e)
        {
            throw new NegocioException(e.getMessage());
        }
    }

    @Override
    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws NegocioException {
        try
        {
            String correoElectronico = dto.getCorreoElectronico();
            UsuarioDTO loggedUser = convertirUsuarioDTO(usuarioDAO.obtenerUsuarioPorCredenciales(correoElectronico));

            
            if (loggedUser == null)
                return null;
            else if(BCrypt.verifyer().verify(dto.getContraseña().toCharArray(), loggedUser.getContraseña()).verified)
                return loggedUser;
            else
                return null;
            
            
        } catch (Exception e)
        {
            throw new NegocioException(e.getMessage());
        }
    }
    

    // Método para convertir UsuarioDTO a UsuarioColeccion
    private UsuarioColeccion convertirUsuarioDTO(UsuarioDTO dto) {
        UsuarioColeccion usuario = new UsuarioColeccion();

        // Asignar los valores simples
        usuario.setId(dto.getId()); // Si es necesario convertir a ObjectId
        usuario.setUsername(dto.getUsername());
        usuario.setContraseña(dto.getContraseña());
        usuario.setCorreoElectronico(dto.getCorreoElectronico());
        usuario.setImagenPerfil(dto.getImagenPerfil());
        usuario.setFavoritos(dto.getFavoritos());
        usuario.setRestringidos(dto.getRestringidos());

        return usuario;

    }

    // Método para convertir UsuarioColeccion a UsuarioDTO
    public UsuarioDTO convertirUsuarioDTO(UsuarioColeccion usuario) {
        UsuarioDTO u = new UsuarioDTO();

        if(usuario != null){
        // Asignar los valores simples
        u.setId(usuario.getId()); // Si es necesario convertir a ObjectId
        u.setUsername(usuario.getUsername());
        u.setContraseña(usuario.getContraseña());
        u.setCorreoElectronico(usuario.getCorreoElectronico());
        u.setImagenPerfil(usuario.getImagenPerfil());
        u.setFavoritos(usuario.getFavoritos());
        u.setRestringidos(usuario.getRestringidos());

        return u;
        
        }
        
        else
            return null;

        

    }
    


}
