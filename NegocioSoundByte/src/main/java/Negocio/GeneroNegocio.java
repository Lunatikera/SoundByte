/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.GeneroColeccion;
import DTO.GeneroDTO;
import InterfacesDAO.IGeneroDAO;
import InterfacesNegocio.IGeneroNegocio;
import excepciones.NegocioException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class GeneroNegocio implements IGeneroNegocio{
    
    private final IGeneroDAO generoDAO;

    public GeneroNegocio(IGeneroDAO generoDAO) {
        this.generoDAO = generoDAO;
    }

    @Override
    public List<GeneroDTO> buscarTodosGeneros() throws NegocioException {
    
        try {
            
            List<GeneroDTO> generosDTO = new ArrayList<>();
            
            for(GeneroColeccion genero : generoDAO.buscarTodosGeneros()){
            
                generosDTO.add(convertirAGeneroDTO(genero));
                
            }
            
            return generosDTO;
            
        } catch (PersistenciaException ex) {
             throw new NegocioException("Error en negocio al buscar todos los géneros en la base de datos", ex);
        }
        
    } 
    
    public GeneroDTO convertirAGeneroDTO(GeneroColeccion gen){
    
        GeneroDTO gDTO = new GeneroDTO();
        
        gDTO.setDescripcion(gen.getDescrpicion());
        gDTO.setImagenGenero(gen.getImagenGenero());
        gDTO.setNombre(gen.getNombre());
        gDTO.setId(gen.getId());
        
        return gDTO;
        
    }
    
    @Override
    public List<GeneroColeccion> convertirListaGenerosDTO(List<GeneroDTO> generos){
    
        List<GeneroColeccion> generosColeccion = new ArrayList<>();
        
        for(GeneroDTO genero : generos){
        
            GeneroColeccion generoC = new GeneroColeccion();
            
            generoC.setId(genero.getId());
            generoC.setNombre(genero.getNombre());
            generoC.setImagenGenero(genero.getImagenGenero());
            generoC.setDescrpicion(genero.getDescripcion());
            
            generosColeccion.add(generoC);
            
        }
        
        return generosColeccion;
        
    }
    
    @Override
    public List<GeneroDTO> convertirListaGenerosColeccion(List<GeneroColeccion> generos){
    
        List<GeneroDTO> generosDTO = new ArrayList<>();
        
        for(GeneroColeccion genero : generos){
        
            GeneroDTO generoDTO = new GeneroDTO();
            
            generoDTO.setId(genero.getId());
            generoDTO.setNombre(genero.getNombre());
            generoDTO.setImagenGenero(genero.getImagenGenero());
            generoDTO.setDescripcion(genero.getDescrpicion());
            
            generosDTO.add(generoDTO);
            
        }
        
        return generosDTO;
        
    }
    
}
