/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Conexion.ConexionDB;
import DAO.AlbumDAO;
import DAO.ArtistaDAO;
import DAO.DatosPruebaDAO;
import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import InterfacesDAO.IAlbumDAO;
import InterfacesDAO.IArtistaDAO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IDatosPruebaDAO;
import InterfacesDAO.IGeneroDAO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IArtistaNegocio;
import InterfacesNegocio.IDatosPruebaNegocio;
import InterfacesNegocio.IGeneroNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.AlbumNegocio;
import Negocio.ArtistaNegocio;
import Negocio.DatosPruebaNegocio;
import Negocio.GeneroNegocio;
import Negocio.UsuarioNegocio;
import frames.FrmLogIn;

/**
 *
 * @author carli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        
        IUsuarioDAO usuarioDAO = new UsuarioDAO(conexionDB);
        IUsuarioNegocio usuarioNegocio = new UsuarioNegocio(usuarioDAO);
        
        IAlbumDAO albumDAO = new AlbumDAO(conexionDB);
        IAlbumNegocio albumNegocio = new AlbumNegocio(albumDAO);
        
        IArtistaDAO artistaDAO = new ArtistaDAO(conexionDB);
        IArtistaNegocio artistaNegocio = new ArtistaNegocio(artistaDAO);
        
        IGeneroDAO generoDAO = new GeneroDAO(conexionDB);
        IGeneroNegocio generoNegocio = new GeneroNegocio(generoDAO);
        
        IDatosPruebaDAO datosPruebaDAO= new DatosPruebaDAO(conexionDB);
        IDatosPruebaNegocio datosPruebaNegocio= new DatosPruebaNegocio(datosPruebaDAO);
        
        FrmLogIn logIn = new FrmLogIn(usuarioNegocio, albumNegocio, generoNegocio, artistaNegocio, datosPruebaNegocio);
        logIn.setVisible(true);

    }

}
