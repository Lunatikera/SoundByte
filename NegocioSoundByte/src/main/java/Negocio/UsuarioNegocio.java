/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.UsuarioColeccion;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import InterfacesNegocio.IUsuarioNegocio;
import excepciones.NegocioException;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioNegocio implements IUsuarioNegocio {

    private final UsuarioDAO usuarioDAO;

    public UsuarioNegocio(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public void crearUsuario(UsuarioDTO usuario) throws NegocioException {
        try
        {
            UsuarioColeccion usuarioColeccion = this.convertirUsuarioDTO(usuario);
            usuarioDAO.crearUsuario(usuarioColeccion);
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
            String contraseña = dto.getContraseña();
            return convertirUsuarioDTO(usuarioDAO.obtenerUsuarioPorCredenciales(correoElectronico, contraseña));
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

        return u;
        
        }
        
        else
            return null;

        

    }

}
