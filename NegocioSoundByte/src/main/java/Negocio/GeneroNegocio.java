/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Colecciones.GeneroColeccion;
import DTO.GeneroDTO;
import InterfacesDAO.IGeneroDAO;
import excepciones.IGeneroNegocio;
import excepciones.INegocioException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class GeneroNegocio implements IGeneroNegocio{
    
    private final IGeneroDAO generoDAO;

    public GeneroNegocio(IGeneroDAO usuarioDAO) {
        this.generoDAO = usuarioDAO;
    }
    
    @Override
    public List<GeneroDTO> buscarTodosGeneros() throws INegocioException {
    
        try {
            
            List<GeneroDTO> generosDTO = new ArrayList<>();
            
            for(GeneroColeccion genero : generoDAO.buscarTodosGeneros()){
            
                generosDTO.add(convertirAGeneroDTO(genero));
                
            }
            
            return generosDTO;
            
        } catch (PersistenciaException ex) {
             throw new INegocioException("Error en negocio al buscar todos los géneros en la base de datos", ex);
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
    
}
