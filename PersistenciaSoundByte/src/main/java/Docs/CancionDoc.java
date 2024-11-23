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
    
    private String nombre;

    public CancionDoc() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CancionDoc{" + "nombre=" + nombre + '}';
    }

}
