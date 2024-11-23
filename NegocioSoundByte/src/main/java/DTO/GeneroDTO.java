/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class GeneroDTO {
    
    private ObjectId id;
    private String nombre;
    private String imagenGenero;
    private String descripcion;

    public GeneroDTO() {
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "GeneroDTO{" + "id=" + id + ", nombre=" + nombre + ", imagenGenero=" + imagenGenero + ", descripcion=" + descripcion + '}';
    }
    
}
