/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Docs.FavoritoDoc;
import Docs.RestriccionDoc;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioDTO {

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
     * Constructor por omisión
     */
    public UsuarioDTO() {
    }

    /**
     * Método para obtener el id del usuario.
     * @return El identificador único del usuario. 
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para asignar el id al usuario.
     * @param id El identificador único del usuario.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre de usuario.
     * @return El nombre de usuario del usuario.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Método para asignar el nombre de usuario.
     * @param username El nombre de usuario del usuario.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Método para obtener el correo electrónico del usuario.
     * @return El correo electrónico del usuario.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Método para asignar el correo electrónico al usuario.
     * @param correoElectronico El correo electrónico del usuario.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Método para obtener la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Método para asignar la contraseña al usuario.
     * @param contraseña La contraseña del usuario.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Método para obtener la imagen de perfil del usuario.
     * @return La imagen de perfil del usuario representada como un arreglo de bytes.
     */
    public byte[] getImagenPerfil() {
        return imagenPerfil;
    }

    /**
     * Método para asignar la imagen de perfil al usuario.
     * @param imagenPerfil La imagen de perfil del usuario, representada como un arreglo de bytes.
     */
    public void setImagenPerfil(byte[] imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    /**
     * Método para obtener los favoritos del usuario.
     * @return El objeto FavoritoDoc que representa los favoritos del usuario.
     */
    public FavoritoDoc getFavoritos() {
        return favoritos;
    }

    /**
     * Método para asignar los favoritos al usuario.
     * @param favoritos El objeto FavoritoDoc que representa los favoritos del usuario.

     */
    public void setFavoritos(FavoritoDoc favoritos) {
        this.favoritos = favoritos;
    }

    /**
     * Método para obtener las restricciones del usuario.
     * @return El objeto RestriccionDoc que representa las restricciones del usuario.
     */
    public RestriccionDoc getRestringidos() {
        return restringidos;
    }

    /**
     * Método para asignar las restricciones al usuario.
     * @param restringidos El objeto RestriccionDoc que representa las restricciones del usuario.
     */
    public void setRestringidos(RestriccionDoc restringidos) {
        this.restringidos = restringidos;
    }

    /**
     * Método para representar el objeto UsuarioDTO como una cadena.
     * @return Una cadena con los detalles del usuario.
     */
    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", username=" + username + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + ", imagenPerfil=" + imagenPerfil + ", favoritos=" + favoritos + ", restringidos=" + restringidos + '}';
    }
}
