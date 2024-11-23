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
    
    private ObjectId id;
    private String nombre;
    private String imagenGenero;
    private String descrpicion;

    public GeneroColeccion() {
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

    public String getImagenGenero() {
        return imagenGenero;
    }

    public void setImagenGenero(String imagenGenero) {
        this.imagenGenero = imagenGenero;
    }

    public String getDescrpicion() {
        return descrpicion;
    }

    public void setDescrpicion(String descrpicion) {
        this.descrpicion = descrpicion;
    }

    @Override
    public String toString() {
        return "GeneroColeccion{" + "id=" + id + ", nombre=" + nombre + ", imagenGenero=" + imagenGenero + ", descrpicion=" + descrpicion + '}';
    }


    
}
