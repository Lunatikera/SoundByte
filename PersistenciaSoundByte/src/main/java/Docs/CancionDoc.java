/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import org.bson.types.ObjectId;

/**
 * doc de canciones
 * @author santi
 */
public class CancionDoc {
    
    /**
     * DECLARACION DE VARIABLES
     */
    private ObjectId id;
    private String nombre;
    private String rutaCancion;

    /**
     * Método por omision
     */
    public CancionDoc() {
    }

    /**
     * Mpetodo constructor
     * @param id id de la cancion
     * @param nombre de la cancion
     * @param rutaCancion de cancion
     */
    public CancionDoc(ObjectId id, String nombre, String rutaCancion) {
        this.id = id;
        this.nombre = nombre;
        this.rutaCancion = rutaCancion;
    }
    
    /**
     * obtiene el ida
     * @return regresa el id
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Asigna el id
     * @param id a asignar
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de cancion
     * @return regresa el nombre de cancion
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre
     * @param nombre nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene ruta
     * @return ruta
     */
    public String getRutaCancion() {
        return rutaCancion;
    }

    /**
     * Asigna ruta
     * @param rutaCancion ruta
     */
    public void setRutaCancion(String rutaCancion) {
        this.rutaCancion = rutaCancion;
    }

    /**
     * ToString
     * @return cadena de strings
     */
    @Override
    public String toString() {
        return "CancionDoc{" + "id=" + id + ", nombre=" + nombre + ", rutaCancion=" + rutaCancion + '}';
    }    
    
}
