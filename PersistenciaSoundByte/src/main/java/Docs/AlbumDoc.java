/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import Colecciones.GeneroColeccion;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author santi
 */
public class AlbumDoc {
    
    private String nombre;
    private LocalDate fechaLanzamiento;
    private List<GeneroColeccion> generos;
    private Byte[] imagenPortada;

    public AlbumDoc() {
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

    public List<GeneroColeccion> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroColeccion> generos) {
        this.generos = generos;
    }

    public Byte[] getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(Byte[] imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    @Override
    public String toString() {
        return "AlbumDoc{" + "nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", generos=" + generos + ", imagenPortada=" + imagenPortada + '}';
    }
    
    
    
}
