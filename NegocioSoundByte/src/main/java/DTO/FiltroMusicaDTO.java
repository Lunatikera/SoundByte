/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 * Clase de Filtro DTO
 * @author santi
 */
public class FiltroMusicaDTO {
    
    /**
     * Declaración de variables
     */
    private Boolean canciones;
    private Boolean albumes;
    private Boolean artistas;
    private String busqueda;
    private List<GeneroDTO> generos;

    /**
     * Constructor por omisión
     */
    public FiltroMusicaDTO() {
    }

    /**
     * Método para obtener si el filtro debe incluir canciones.
     * @return Verdadero si se deben incluir canciones en la búsqueda, falso en caso contrario.
     */
    public Boolean getCanciones() {
        return canciones;
    }

    /**
     * Método para asignar si se deben incluir canciones en el filtro.
     * @param canciones Verdadero si se deben incluir canciones en la búsqueda, falso en caso contrario. 
     */
    public void setCanciones(Boolean canciones) {
        this.canciones = canciones;
    }

    /**
     * Método para obtener si el filtro debe incluir álbumes.
     * @return Verdadero si se deben incluir álbumes en la búsqueda, falso en caso contrario.
     */
    public Boolean getAlbumes() {
        return albumes;
    }

    /**
     * Método para asignar si se deben incluir álbumes en el filtro.
     * @param albumes Verdadero si se deben incluir álbumes en la búsqueda, falso en caso contrario.
     */
    public void setAlbumes(Boolean albumes) {
        this.albumes = albumes;
    }

    /**
     * Método para obtener si el filtro debe incluir artistas.
     * @return Verdadero si se deben incluir artistas en la búsqueda, falso en caso contrario. 
     */
    public Boolean getArtistas() {
        return artistas;
    }

    /**
     * Método para asignar si se deben incluir artistas en el filtro.
     * @param artistas Verdadero si se deben incluir artistas en la búsqueda, falso en caso contrario. 
     */
    public void setArtistas(Boolean artistas) {
        this.artistas = artistas;
    }

    /**
     * Método para obtener la cadena de búsqueda general (por ejemplo, un nombre).
     * @return La cadena de búsqueda.
     */
    public String getBusqueda() {
        return busqueda;
    }

    /**
     * Método para asignar la cadena de búsqueda general (por ejemplo, un nombre).
     * @param busqueda La cadena de búsqueda. 
     */
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    /**
     * Método para obtener la lista de géneros musicales utilizados en el filtro.
     * @return La lista de géneros musicales.
     */
    public List<GeneroDTO> getGeneros() {
        return generos;
    }

    /**
     * Método para asignar la lista de géneros musicales utilizados en el filtro.
     * @param generos La lista de géneros musicales. 
     */
    public void setGeneros(List<GeneroDTO> generos) {
        this.generos = generos;
    }

    /**
     * Método para representar el objeto FiltroMusicaDTO como una cadena.
     * @return Una cadena con los detalles del filtro de música.
     */
    @Override
    public String toString() {
        return "FiltroMusicaDTO{" + "canciones=" + canciones + ", albumes=" + albumes + ", artistas=" + artistas + ", busqueda=" + busqueda + ", generos=" + generos + '}';
    }
    
}
