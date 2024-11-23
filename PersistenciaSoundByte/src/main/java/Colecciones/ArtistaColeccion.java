/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones;

import Docs.IntegranteDoc;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class ArtistaColeccion {
    
    private ObjectId id;
    private String nombre;
    private List<GeneroColeccion> generos;
    private Boolean esBanda;
    private IntegranteDoc integrante;
    private String imagen;

    public ArtistaColeccion() {
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

    public List<GeneroColeccion> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroColeccion> generos) {
        this.generos = generos;
    }

    public Boolean getEsBanda() {
        return esBanda;
    }

    public void setEsBanda(Boolean esBanda) {
        this.esBanda = esBanda;
    }

    public IntegranteDoc getIntegrante() {
        return integrante;
    }

    public void setIntegrante(IntegranteDoc integrante) {
        this.integrante = integrante;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "ArtistaColeccion{" + "id=" + id + ", nombre=" + nombre + ", generos=" + generos + ", esBanda=" + esBanda + ", integrante=" + integrante + '}';
    }


    
    
}
