/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.ArtistaColeccion;
import DTO.ArtistaDTO;

/**
 *
 * @author santi
 */
public class ArtistaNegocio {

    /**
     * Método por omisión
     */
    public ArtistaNegocio() {
    }
    
    /**
     * Método para convertir artista a DTO
     * @param artistaC artista de la Colección
     * @return regresa el astrista DTO
     */
    public ArtistaDTO convertirArtistaColeccion(ArtistaColeccion artistaC){
    
        ArtistaDTO artistaD = new ArtistaDTO();
        
        artistaD.setId(artistaC.getId());
        
        return artistaD;
        
    }
}
