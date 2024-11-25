/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Conexion.ConexionDB;
import DAO.AlbumDAO;
import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import InterfacesDAO.IUsuarioDAO;
import excepciones.PersistenciaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author santi
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
            IUsuarioDAO usuarioDAO = new UsuarioDAO(conexionDB);
            IGeneroDAO generoDAO = new GeneroDAO(conexionDB);
            AlbumDAO albumDAO = new AlbumDAO(conexionDB);
            
            generoDAO.buscarGeneroPorNombre("Prog");
            
            System.out.println(albumDAO.obtenerCancionesPorBusqueda("Salir",  null));
            
        } catch (PersistenciaException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
