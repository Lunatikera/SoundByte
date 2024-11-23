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
 *
 * @author santi
 */
public class FavoritoDoc {
    
    private List<ArtistaColeccion> Artistas;
    private List<CancionDoc> Canciones;
    private List<AlbumColeccion> albumes;

    public FavoritoDoc() {
    }

    public List<ArtistaColeccion> getArtistas() {
        return Artistas;
    }

    public void setArtistas(List<ArtistaColeccion> Artistas) {
        this.Artistas = Artistas;
    }

    public List<CancionDoc> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<CancionDoc> Canciones) {
        this.Canciones = Canciones;
    }

    public List<AlbumColeccion> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<AlbumColeccion> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return "FavoritoDoc{" + "Artistas=" + Artistas + ", Canciones=" + Canciones + ", albumes=" + albumes + '}';
    }
    
}
