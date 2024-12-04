/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import Colecciones.GeneroColeccion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Doc para resticcion
 * @author santi
 */
public class RestriccionDoc {
    

    /**
     * Declaracion variables
     */
    private List<GeneroColeccion> generos;

    /**
     * Constructor 
     */
    public RestriccionDoc() {
    }

    /**
     * Método para obtener géneros
     * @return regresa los géneros
     */
    public List<GeneroColeccion> getGeneros() {
        return generos;
    }

    /**
     * Asignar géneros
     * @param generos géneros  
     */
    public void setGeneros(List<GeneroColeccion> generos) {
        this.generos = generos;
    }


    
}
