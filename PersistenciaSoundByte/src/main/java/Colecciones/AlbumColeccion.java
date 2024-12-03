/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import Docs.CancionDoc;
import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class AlbumColeccion {
    
    /**
     * Declaración de variables
     */    
    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String imagen;
    private ArtistaColeccion artista;
    private List<CancionDoc> canciones;

    /**
     * Constructor por omisión
     */
    public AlbumColeccion() {
    }

    /**
     * Método para obtener el id
     * @return El id del álbum.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para asignar el id del álbum.
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
     * Método para asignar la fecha de lanzamiento del álbum.
     * @param fechaLanzamiento La fecha de lanzamiento del álbum.
     * 
     */
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Método para obtener la lista de canciones del álbum.
     * @return La lista de canciones.
     * 
     */
    public List<CancionDoc> getCanciones() {
        return canciones;
    }

    /**
     * Método para asignar la lista de canciones al álbum.
     * @param canciones La lista de canciones del álbum.
     * 
     */
    public void setCanciones(List<CancionDoc> canciones) {
        this.canciones = canciones;
    }

    /**
     * Método para obtener el artista que creó el álbum.
     * @return El artista que creó el álbum.
     */
    public ArtistaColeccion getArtista() {
        return artista;
    }

    /**
     * Método para asignar el artista que creó el álbum.
     * @param artista El artista que creó el álbum.
     * 
     */
    public void setArtista(ArtistaColeccion artista) {
        this.artista = artista;
    }

    /**
     * Método para obtener la URL o ruta de la imagen del álbum.
     * @return La URL o ruta de la imagen del álbum.
     * 
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método para asignar la imagen del álbum.
     * @param imagen La URL o ruta de la imagen del álbum.
     * 
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Método para representar el objeto AlbumColeccion como una cadena.
     * @return Una cadena con los detalles del álbum.
     * 
     */
    @Override
    public String toString() {
        return "AlbumColeccion{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", imagen=" + imagen + ", artista=" + artista + ", canciones=" + canciones + '}';
    }



    
}
