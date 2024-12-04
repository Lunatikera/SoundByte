/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase FAVS DOC
 * @author santi
 */
public class FavoritoDoc {
    
    /**
     * Declaración de variables
     */
    private List<ArtistaColeccion> Artistas;
    private List<CancionDoc> Canciones;
    private List<AlbumColeccion> albumes;

    /**
     * Constructor por omisión
     */
    public FavoritoDoc() {
    }

    /**
     * Método para obtener artistas
     * @return regresa los artistas
     */
    public List<ArtistaColeccion> getArtistas() {
        return Artistas;
    }

    /**
     * Mpetodo para asignar artistas
     * @param Artistas artistar
     */
    public void setArtistas(List<ArtistaColeccion> Artistas) {
        this.Artistas = Artistas;
    }
    
    
    /**
     * Método para obtener canciones
     * @return canciones obtenidas
     */
    public List<CancionDoc> getCanciones() {
        return Canciones;
    }

    /**
     * Asignas canciones
     * @param Canciones canciones a asignar
     */
    public void setCanciones(List<CancionDoc> Canciones) {
        this.Canciones = Canciones;
    }

    /**
     * Obtiene losa albumes
     * @return regresa los albumes
     */
    public List<AlbumColeccion> getAlbumes() {
        return albumes;
    }

    /**
     * Asigna los albumes
     * @param albumes a asignar
     */
    public void setAlbumes(List<AlbumColeccion> albumes) {
        this.albumes = albumes;
    }

    /**
     * Método toString
     * @return regresa los valores en una cadena
     */
    @Override
    public String toString() {
        return "FavoritoDoc{" + "Artistas=" + Artistas + ", Canciones=" + Canciones + ", albumes=" + albumes + '}';
    }
    
}
