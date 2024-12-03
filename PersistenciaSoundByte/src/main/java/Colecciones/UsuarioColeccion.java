/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import Docs.FavoritoDoc;
import Docs.RestriccionDoc;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioColeccion {

    /**
     * Declaración de variables
     */
    private ObjectId id;
    private String username;
    private String correoElectronico;
    private String contraseña;
    private byte[] imagenPerfil;
    private FavoritoDoc favoritos;
    private RestriccionDoc restringidos;


    /**
     * Método constructor
     */
    public UsuarioColeccion() {
    }

    /**
     * Método para obtener el identificador único del usuario.
     * 
     * @return El id del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para establecer el identificador único del usuario.
     * 
     * @param id El id a asignar al usuario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre de usuario del usuario.
     * 
     * @return El nombre de usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Método para establecer el nombre de usuario del usuario.
     * 
     * @param username El nombre de usuario a asignar.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return 
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Método para obtener la dirección de correo electrónico del usuario.
     * 
     * @return El correo electrónico del usuario.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Método para establecer la dirección de correo electrónico del usuario.
     * 
     * @param correoElectronico El correo electrónico a asignar.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método para obtener la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Método para obtener la imagen de perfil del usuario en formato byte[].
     * 
     * @return Un arreglo de bytes que representa la imagen de perfil.
     */
    public byte[] getImagenPerfil() {
        return imagenPerfil;
    }

    /**
     * Método para establecer la imagen de perfil del usuario.
     * 
     * @param imagenPerfil Un arreglo de bytes que representa la imagen de perfil.
     */
    public void setImagenPerfil(byte[] imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    /**
     * Método para obtener los favoritos del usuario.
     * 
     * @return La instancia de FavoritoDoc que representa los favoritos del usuario.
     */
    public FavoritoDoc getFavoritos() {
        return favoritos;
    }

    /**
     * Método para establecer los favoritos del usuario.
     * 
     * @param favoritos Una instancia de FavoritoDoc que representa los favoritos del usuario.
     */
    public void setFavoritos(FavoritoDoc favoritos) {
        this.favoritos = favoritos;
    }

    /**
     * Método para obtener las restricciones del usuario.
     * 
     * @return La instancia de RestriccionDoc que representa las restricciones del usuario.
     */
    public RestriccionDoc getRestringidos() {
        return restringidos;
    }

    /**
     * Método para establecer las restricciones del usuario.
     * 
     * @param restringidos Una instancia de RestriccionDoc que representa las restricciones del usuario.
     */
    public void setRestringidos(RestriccionDoc restringidos) {
        this.restringidos = restringidos;
    }

    /**
     * Sobrescribe el método toString() para representar la información del usuario en un formato legible.
     * 
     * @return Una cadena de texto que representa al usuario con todos sus atributos.
     */
    @Override
    public String toString() {
        return "UsuarioColeccion{" + "id=" + id + ", username=" + username + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + ", imagenPerfil=" + imagenPerfil + ", favoritos=" + favoritos + ", restringidos=" + restringidos + '}';
    }
    
}
