/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import DAO.AlbumDAO;
import DAO.ArtistaDAO;
import DAO.DatosDAO;
import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import InterfacesDAO.IAlbumDAO;
import InterfacesDAO.IArtistaDAO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import InterfacesDAO.IUsuarioDAO;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

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
            IAlbumDAO albumDAO = new AlbumDAO(conexionDB);
            IArtistaDAO artistaDAO = new ArtistaDAO(conexionDB);
            
            DatosDAO datos = new DatosDAO(conexionDB);
            
            generoDAO.buscarGeneroPorNombre("Prog");

//            System.out.println(albumDAO.obtenerCancionesPorBusqueda("p",  generoDAO.buscarGeneroPorNombre("pock")));
//            ArtistaColeccion artista = artistaDAO.obtenerArtistasPorBusquedaGeneros("Geordie", generoDAO.buscarTodosGeneros()).get(0);
            
//            System.out.println(generoDAO.buscarGeneroPorNombre("Rock").toString());

//            List<ObjectId> ids = new ArrayList<>();
//            for(GeneroColeccion genero : generoDAO.buscarTodosGeneros()){
//            
//                ids.add(genero.getId());
//            }
//
            System.out.println(artistaDAO.obtenerArtistasPorBusquedaGeneros("Luis", generoDAO.buscarTodosGeneros()));

            datos.insercionMasiva();
//            System.out.println(albumDAO.obtenerAlbumesPorArtista(artista).toString());

        } catch (PersistenciaException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
