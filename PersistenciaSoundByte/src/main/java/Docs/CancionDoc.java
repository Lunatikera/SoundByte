/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class CancionDoc {
    
    private ObjectId id;
    private String nombre;
    private String rutaCancion;

    public CancionDoc() {
    }

    public CancionDoc(ObjectId id, String nombre, String rutaCancion) {
        this.id = id;
        this.nombre = nombre;
        this.rutaCancion = rutaCancion;
    }

    public CancionDoc(String nombre) {
        this.id = new ObjectId();
        this.nombre = nombre;
        this.rutaCancion = "";
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

    public String getRutaCancion() {
        return rutaCancion;
    }

    public void setRutaCancion(String rutaCancion) {
        this.rutaCancion = rutaCancion;
    }

    @Override
    public String toString() {
        return "CancionDoc{" + "id=" + id + ", nombre=" + nombre + ", rutaCancion=" + rutaCancion + '}';
    }    
    
}
