/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Conexion.ConexionDB;
import DAO.AlbumDAO;
import DAO.UsuarioDAO;
import InterfacesDAO.IAlbumDAO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.AlbumNegocio;
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
        
        
        FrmLogIn logIn = new FrmLogIn(usuarioNegocio, albumNegocio);
        logIn.setVisible(true);

    }

}
