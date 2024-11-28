/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.ArtistaColeccion;
import InterfacesDAO.IArtistaDAO;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author santi
 */
public class ArtistaDAO implements IArtistaDAO{

    private final MongoCollection<ArtistaColeccion> coleccion;
    
    public ArtistaDAO(IConexionDB conexionDB) {
        
        MongoDatabase database = conexionDB.getDatabase();  // MongoDB o MySQL dependiendo de la implementación
        this.coleccion = database.getCollection("Artistas", ArtistaColeccion.class);
    }
    
    
    
}
