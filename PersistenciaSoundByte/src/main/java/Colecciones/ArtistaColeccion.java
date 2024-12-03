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
    
    /**
     * Declaración de variables
     */
    private ObjectId id;
    private String nombre;
    private List<GeneroColeccion> generos;
    private Boolean esBanda;
    private List<IntegranteDoc> integrante;
    private String imagen;
    private List<String> redesSociales;

    /** 
     * Constructor vacío. Se utiliza para crear una instancia vacía del artista o banda.
     */

    public ArtistaColeccion() {
    }

    /**
     * Método para obtener el id del artista o banda.
     * @return El identificador único del artista o banda.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Método para asignar el id del artista o banda.
     * @param id El identificador único del artista o banda.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Método para obtener el nombre del artista o banda.
     * @return El nombre del artista o banda.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar el nombre al artista o banda.
     * @param nombre El nombre del artista o banda.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la lista de géneros musicales del artista o banda.
     * @return La lista de géneros musicales asociados al artista o banda.
     */
    public List<GeneroColeccion> getGeneros() {
        return generos;
    }

    /**
     * Método para asignar los géneros musicales al artista o banda.
     * @param generos La lista de géneros musicales del artista o banda.
     */
    public void setGeneros(List<GeneroColeccion> generos) {
        this.generos = generos;
    }

    /**
     * Método para saber si el artista es una banda.
     * @return Verdadero si el artista es una banda, falso si es un artista solista.
     */
    public Boolean getEsBanda() {
        return esBanda;
    }

    /**
     * Método para asignar si el artista es una banda.
     * @param esBanda Indica si el artista es una banda.
     */
    public void setEsBanda(Boolean esBanda) {
        this.esBanda = esBanda;
    }

    /**
     * Método para obtener la lista de integrantes del artista o banda (si aplica).
     * @return La lista de integrantes (si el artista es una banda).
     */
    public List<IntegranteDoc> getIntegrante() {
        return integrante;
    }

    /**
     * Método para asignar los integrantes del artista o banda.
     * @param integrante La lista de integrantes del artista o banda.
     */
    public void setIntegrante(List<IntegranteDoc> integrante) {
        this.integrante = integrante;
    }
    
    /**
     * Método para obtener la imagen del artista o banda (generalmente una foto o el logo).
     * @return La URL o ruta de la imagen.
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Método para asignar la imagen del artista o banda.
     * @param imagen La URL o ruta de la imagen.
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Método para obtener las redes sociales asociadas al artista o banda.
     * @return La lista de redes sociales del artista o banda.
     */
    public List<String> getRedesSociales() {
        return redesSociales;
    }

    /**
     * Método para asignar las redes sociales del artista o banda.
     * @param redesSociales La lista de redes sociales del artista o banda.
     */
    public void setRedesSociales(List<String> redesSociales) {
        this.redesSociales = redesSociales;
    }
    
    /**
     * Método para representar el objeto ArtistaColeccion como una cadena.
     * @return Una cadena con los detalles del artista o banda.
     */
    @Override
    public String toString() {
        return "ArtistaColeccion{" + "id=" + id + ", nombre=" + nombre + ", generos=" + generos + ", esBanda=" + esBanda + ", integrante=" + integrante + '}';
    }


    
    
}
