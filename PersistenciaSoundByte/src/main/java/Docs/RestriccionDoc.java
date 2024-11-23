/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import Colecciones.GeneroColeccion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class RestriccionDoc {
    

    private List<GeneroColeccion> generos;

    public RestriccionDoc() {
    }

    public List<GeneroColeccion> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroColeccion> generos) {
        this.generos = generos;
    }


    
}
