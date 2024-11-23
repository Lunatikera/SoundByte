/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import Docs.Favoritos;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author SantiagoSanchez
 */
public class UsuarioColeccion {

    private ObjectId id;
    private String username;
    private String correoElectronico;
    private String contraseña;
    private byte[] imagenPerfil;
    private Favoritos favoritos;
    private List<ObjectId> restringidos;



    public UsuarioColeccion() {
    }

    public UsuarioColeccion(ObjectId id, String username, String correoElectronico, String contraseña, byte[] imagenPerfil) {
        this.id = id;
        this.username = username;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.imagenPerfil = imagenPerfil;
    }

    public UsuarioColeccion(String username, String correoElectronico, String contraseña, byte[] imagenPerfil) {
        this.username = username;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.imagenPerfil = imagenPerfil;
    }

    public UsuarioColeccion(String username, String correoElectronico, String contraseña) {
        this.username = username;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    public UsuarioColeccion(ObjectId id, String username, String correoElectronico, String contraseña) {
        this.id = id;
        this.username = username;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    public UsuarioColeccion(ObjectId id, String username, String correoElectronico, String contraseña, byte[] imagenPerfil, Favoritos favoritos, List<ObjectId> restringidos) {
        this.id = id;
        this.username = username;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.imagenPerfil = imagenPerfil;
        this.favoritos = favoritos;
        this.restringidos = restringidos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public byte[] getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(byte[] imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public Favoritos getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(Favoritos favoritos) {
        this.favoritos = favoritos;
    }
    
    public List<ObjectId> getRestringidos() {
        return restringidos;
    }

    public void setRestringidos(List<ObjectId> restringidos) {
        this.restringidos = restringidos;
    }

    @Override
    public String toString() {
        return "UsuarioColeccion{" + "id=" + id + ", username=" + username + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + ", imagenPerfil=" + imagenPerfil + ", favoritos=" + favoritos.toString() + ", restringidos=" + restringidos + '}';
    }
    
    


    
}
