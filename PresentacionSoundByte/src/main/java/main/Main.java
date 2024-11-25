/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Conexion.ConexionDB;
import DAO.UsuarioDAO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IUsuarioNegocio;
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
        FrmLogIn logIn = new FrmLogIn(usuarioNegocio);
        logIn.setVisible(true);

    }

}
