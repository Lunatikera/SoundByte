/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.ArtistaColeccion;
import DTO.ArtistaDTO;
import InterfacesDAO.IArtistaDAO;
import InterfacesNegocio.IArtistaNegocio;

/**
 *
 * @author santi
 */
public class ArtistaNegocio implements IArtistaNegocio{

    private final IArtistaDAO artistaDAO;
    
    public ArtistaNegocio(IArtistaDAO artistaDAO) {
        
        this.artistaDAO = artistaDAO;
        
    }
    
    public ArtistaDTO convertirArtistaColeccion(ArtistaColeccion artistaC){
    
        ArtistaDTO artistaD = new ArtistaDTO();
        
        artistaD.setId(artistaC.getId());
        
        return artistaD;
        
    }
}
