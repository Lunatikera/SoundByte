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
    
    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private Byte[] imagen;
    private List<CancionDoc> canciones;

    public AlbumColeccion() {
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

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }

    public List<CancionDoc> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CancionDoc> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "Albumes{" + "id=" + id + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", imagen=" + imagen + ", canciones=" + canciones + '}';
    }
    
}
