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
 * Clase de ÁlbumDTO
 * @author santi Autor
 */
public class AlbumDTO {
    
    /**
     * Declaración de variables
     */
    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String imagen;
    private ArtistaDTO artista;
    private List<CancionDoc> canciones;

    /**
     * Constructor por omisión
     */
    public AlbumDTO() {
    }

    /**
     * Método para obtener el id del álbum.
     * @return El identificador único del álbum.
     * 
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para asignar el id al álbum.
     * @param id El identificador único del álbum.
     * 
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del álbum.
     * @return El nombre del álbum.
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre al álbum.
     * @param nombre El nombre del álbum.
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la fecha de lanzamiento del álbum.
     * @return La fecha de lanzamiento del álbum.
     * 
     */
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Método para asignar la fecha de lanzamiento al álbum.
     * @param fechaLanzamiento La fecha de lanzamiento del álbum.
     * 
     */
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Método para obtener la lista de canciones que contiene el álbum.
     * @return La lista de canciones que pertenecen al álbum.
     * 
     */
    public List<CancionDoc> getCanciones() {
        return canciones;
    }

    /**
     * Método para asignar las canciones al álbum.
     * @param canciones La lista de canciones que pertenecen al álbum.
     * 
     */
    public void setCanciones(List<CancionDoc> canciones) {
        this.canciones = canciones;
    }

    /**
     * Método para obtener el artista que interpreta el álbum.
     * @return El artista que interpretó el álbum. 
     * 
     */
    public ArtistaDTO getArtista() {
        return artista;
    }

    /**
     * Método para asignar el artista al álbum.
     * @param artista El artista que interpreta el álbum.
     * 
     */
    public void setArtista(ArtistaDTO artista) {
        this.artista = artista;
    }

    /**
     * Método para obtener la imagen asociada al álbum.
     * @return La URL o ruta de la imagen del álbum.
     * 
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método para asignar la imagen al álbum.
     * @param imagen La URL o ruta de la imagen asociada al álbum.
     * 
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Método para representar el objeto AlbumDTO como una cadena.
     * @return Una cadena con los detalles del álbum, como el id, nombre, fecha de lanzamiento, imagen, artista y canciones.
     * 
     */
    @Override
    public String toString() {
        return "AlbumDTO{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", imagen=" + imagen + ", artista=" + artista + ", canciones=" + canciones + '}';
    }



    
}
