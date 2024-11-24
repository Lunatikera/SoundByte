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
import excepciones.INegocioException;
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
    public void crearUsuario(UsuarioDTO usuario) throws INegocioException {
        try
        {
            UsuarioColeccion usuarioColeccion = this.convertirUsuarioDTO(usuario);
            usuarioColeccion.setContraseña(Encriptacion.encriptarPassword(usuarioColeccion.getContraseña()));
            usuarioDAO.crearUsuario(usuarioColeccion);
        } catch (Exception e)
        {
            throw new INegocioException(e.getMessage());
        }
    }
    
    @Override
    public void actualizarUsuario(UsuarioDTO usuarioViejo, UsuarioDTO usuarioNuevo) throws INegocioException {
        try
        {
            UsuarioColeccion usuarioColeccionViejo = this.convertirUsuarioDTO(usuarioViejo);
            UsuarioColeccion usuarioColeccionNuevo = this.convertirUsuarioDTO(usuarioNuevo);
            usuarioDAO.actualizarUsuario(usuarioColeccionViejo, usuarioColeccionNuevo);
        } catch (Exception e)
        {
            throw new INegocioException(e.getMessage());
        }
    }

    @Override
    public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO dto) throws INegocioException {
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
            throw new INegocioException(e.getMessage());
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
    
    @Override
    public List<GeneroColeccion> convertirListaGenerosDTO(List<GeneroDTO> generos){
    
        List<GeneroColeccion> generosColeccion = new ArrayList<>();
        
        for(GeneroDTO genero : generos){
        
            GeneroColeccion generoC = new GeneroColeccion();
            
            generoC.setId(genero.getId());
            generoC.setNombre(genero.getNombre());
            generoC.setImagenGenero(genero.getImagenGenero());
            generoC.setDescrpicion(genero.getDescripcion());
            
            generosColeccion.add(generoC);
            
        }
        
        return generosColeccion;
        
    }

}
