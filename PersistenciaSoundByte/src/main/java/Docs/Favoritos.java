/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docs;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class Favoritos {
    
    private List<ObjectId> bandas;
    private List<ObjectId> Artistas;
    private List<ObjectId> Canciones;

    public Favoritos() {
    }

    public Favoritos(List<ObjectId> bandas, List<ObjectId> Artistas, List<ObjectId> Canciones) {
        this.bandas = bandas;
        this.Artistas = Artistas;
        this.Canciones = Canciones;
    }

    public List<ObjectId> getBandas() {
        return bandas;
    }

    public void setBandas(List<ObjectId> bandas) {
        this.bandas = bandas;
    }

    public List<ObjectId> getArtistas() {
        return Artistas;
    }

    public void setArtistas(List<ObjectId> Artistas) {
        this.Artistas = Artistas;
    }

    public List<ObjectId> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<ObjectId> Canciones) {
        this.Canciones = Canciones;
    }

    @Override
    public String toString() {
        return "Favoritos{" + "bandas=" + bandas + ", Artistas=" + Artistas + ", Canciones=" + Canciones + '}';
    }
    
}
