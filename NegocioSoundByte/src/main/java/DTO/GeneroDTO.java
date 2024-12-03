/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import org.bson.types.ObjectId;

/**
 * Clase de Genero DTO
 * @author santi
 */
public class GeneroDTO {
    
    /**
     * Declaración de variables
     */
    private ObjectId id;
    private String nombre;
    private String imagenGenero;
    private String descripcion;

    /**
     * Construtor por omisión
     */
    public GeneroDTO() {
    }

    /**
     * Método para obtener el id del género musical.
     * @return El identificador único del género musical.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para asignar el id al género musical.
     * @param id El identificador único del género musical.
     * 
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del género musical.
     * @return El nombre del género musical.
     * 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre al género musical.
     * @param nombre El nombre del género musical.
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la URL o ruta de la imagen asociada al género musical.
     * @return La URL o ruta de la imagen del género musical.
     * 
     */
    public String getImagenGenero() {
        return imagenGenero;
    }

    /**
     * Método para asignar la imagen al género musical.
     * @param imagenGenero La URL o ruta de la imagen asociada al género musical. 
     */
    public void setImagenGenero(String imagenGenero) {
        this.imagenGenero = imagenGenero;
    }

    /**
     * Método para obtener la descripción del género musical.
     * @return La descripción del género musical.
     * 
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método para asignar la descripción al género musical.
     * @param descripcion La descripción del género musical.
     * 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método para representar el objeto GeneroDTO como una cadena.
     * @return Una cadena con los detalles del género musical.
     */
    @Override
    public String toString() {
        return "GeneroDTO{" + "id=" + id + ", nombre=" + nombre + ", imagenGenero=" + imagenGenero + ", descripcion=" + descripcion + '}';
    }
    
}
