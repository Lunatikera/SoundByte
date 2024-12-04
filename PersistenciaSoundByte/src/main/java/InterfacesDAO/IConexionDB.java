/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesDAO;

import com.mongodb.client.MongoDatabase;

/**
 * interfaz de conexion
 * @author SantiagoSanchez
 */
public interface IConexionDB {

    /**
     * obtiene la bd
     * @return la bd
     */
    public MongoDatabase getDatabase();

    /**
     * cierra la conexion
     */
    public void close();
}
