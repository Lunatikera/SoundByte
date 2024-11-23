/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Docs.CancionDoc;
import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class AlbumDTO {
    
    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String imagen;
    private ArtistaDTO artista;
    private List<CancionDoc> canciones;

    public AlbumDTO() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public List<CancionDoc> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CancionDoc> canciones) {
        this.canciones = canciones;
    }

    public ArtistaDTO getArtista() {
        return artista;
    }

    public void setArtista(ArtistaDTO artista) {
        this.artista = artista;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "AlbumColeccion{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", imagen=" + imagen + ", artista=" + artista + ", canciones=" + canciones + '}';
    }



    
}
