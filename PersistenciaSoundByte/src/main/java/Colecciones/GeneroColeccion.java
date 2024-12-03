/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class GeneroColeccion {
    
    /**
     * Declaración de variables
     */
    private ObjectId id;
    private String nombre;
    private String imagenGenero;
    private String descrpicion;

    /**
     * Constructor por omisión
     */
    public GeneroColeccion() {
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
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del género musical.
     * @return El nombre del género musical.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre al género musical.
     * @param nombre El nombre del género musical.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la URL o ruta de la imagen representativa del género.
     * @return La URL o ruta de la imagen asociada al género musical.
     */
    public String getImagenGenero() {
        return imagenGenero;
    }

    /**
     * Método para asignar la imagen representativa al género musical.
     * @param imagenGenero La URL o ruta de la imagen asociada al género musical.
     */
    public void setImagenGenero(String imagenGenero) {
        this.imagenGenero = imagenGenero;
    }

    /**
     * Método para obtener la descripción del género musical.
     * @return La descripción del género musical.
     */
    public String getDescrpicion() {
        return descrpicion;
    }

    /**
     * Método para asignar la descripción al género musical.
     * @param descrpicion La descripción del género musical.
     */
    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }

    /**
     * Método para representar el objeto GeneroColeccion como una cadena.
     * @return Una cadena con los detalles del género musical. 
     */
    @Override
    public String toString() {
        return "GeneroColeccion{" + "id=" + id + ", nombre=" + nombre + ", imagenGenero=" + imagenGenero + ", descrpicion=" + descrpicion + '}';
    }


    
}
