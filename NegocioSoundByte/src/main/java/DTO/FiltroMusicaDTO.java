/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 *
 * @author santi
 */
public class FiltroMusicaDTO {
    
    private Boolean canciones;
    private Boolean albumes;
    private Boolean artistas;
    private String busqueda;
    private List<GeneroDTO> generos;

    public FiltroMusicaDTO() {
    }

    public Boolean getCanciones() {
        return canciones;
    }

    public void setCanciones(Boolean canciones) {
        this.canciones = canciones;
    }

    public Boolean getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Boolean albumes) {
        this.albumes = albumes;
    }

    public Boolean getArtistas() {
        return artistas;
    }

    public void setArtistas(Boolean artistas) {
        this.artistas = artistas;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public List<GeneroDTO> getGeneros() {
        return generos;
    }

    public void setGeneros(List<GeneroDTO> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "FiltroMusicaDTO{" + "canciones=" + canciones + ", albumes=" + albumes + ", artistas=" + artistas + ", busqueda=" + busqueda + ", generos=" + generos + '}';
    }
    
}
