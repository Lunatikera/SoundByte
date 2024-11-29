/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import DTO.ArtistaDTO;
import DTO.GeneroDTO;
import InterfacesDAO.IArtistaDAO;
import InterfacesNegocio.IArtistaNegocio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class ArtistaNegocio implements IArtistaNegocio{

    private final IArtistaDAO artistaDAO;
    
    public ArtistaNegocio(IArtistaDAO artistaDAO) {
        
        this.artistaDAO = artistaDAO;
        
    }
    
    @Override
    public ArtistaDTO convertirArtistaColeccion(ArtistaColeccion artistaC){
    
        ArtistaDTO artD = new ArtistaDTO();
            
        artD.setId(artistaC.getId());

        if (artistaC.getGeneros() != null){

            List<GeneroDTO> generos = new ArrayList<>();

            for(GeneroColeccion genero : artistaC.getGeneros()){

                GeneroDTO generoD = new GeneroDTO();

                generoD.setId(genero.getId());
                generoD.setImagenGenero(genero.getImagenGenero());
                generoD.setNombre(genero.getNombre());

                generos.add(generoD);

            }

            artD.setGeneros(generos);

        } else
            artD.setGeneros(null);

        artD.setNombre(artistaC.getNombre());
        artD.setImagen(artistaC.getImagen());
//        artD.setRedesSociales(albumC.getRedesSociales());
//        artD.setEsBanda(albumC.getArtista().getEsBanda());

        if(artistaC.getIntegrante() != null){

            artD.setIntegrante(artistaC.getIntegrante());

        } else{

            artD.setIntegrante(null);

        }
        
        return artD;
        
    }
}
