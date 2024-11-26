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

    public ArtistaNegocio() {
    }
    
    public ArtistaDTO convertirArtistaColeccion(ArtistaColeccion artistaC){
    
        ArtistaDTO artistaD = new ArtistaDTO();
        
        artistaD.setId(artistaC.getId());
        
        return artistaD;
        
    }
}
