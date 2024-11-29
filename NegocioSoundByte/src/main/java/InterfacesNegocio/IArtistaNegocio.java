/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesNegocio;

import Colecciones.ArtistaColeccion;
import DTO.ArtistaDTO;

/**
 *
 * @author santi
 */
public interface IArtistaNegocio {
    
    public ArtistaDTO convertirArtistaColeccion(ArtistaColeccion artistaC);
    
}
