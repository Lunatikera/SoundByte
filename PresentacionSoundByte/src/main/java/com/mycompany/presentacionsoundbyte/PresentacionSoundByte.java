/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.presentacionsoundbyte;

import Conexion.ConexionDB;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;

/**
 *
 * @author carli
 */
public class PresentacionSoundByte {

    public static void main(String[] args) {
    IConexionDB conexionDB = new ConexionDB();
    MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte");    
    MongoCollection<Document> coleccion;


    coleccion = database.getCollection("Usuarios");
    
        Document favorito1 = new Document("genero", "prog");
        Document favorito2 = new Document("genero", "rock");
        Document restriccion1 = new Document ("restriccion", "reggaeton");
        Document restriccion2 = new Document ("restriccion", "clasica");
        
        List<Document> favoritos = new ArrayList<>();
        favoritos.add(favorito1);        favoritos.add(favorito2);
        List<Document> restricciones = new ArrayList<>();
        restricciones.add(restriccion1);        restricciones.add(restriccion2);



    
                    Document user = new Document()
                    .append("username", "Chavirez")                    
                    .append("correoElectronico", "santiagosanchezch@gmail.com")
                    .append("contraseña", "12345")
                    .append("imagenPerfil", null)
                    .append("favoritos", favoritos)
                    .append("restricciones", restricciones);

            coleccion.insertOne(user);
            
    coleccion = database.getCollection("Solistas");
    
        Document album = new Document("nombre", "The New Sound")
                                .append("fechaLanzamiento", new Date()) 
                                .append("genero", "prog")
                                .append("imagenPortada", null);
        
                    Document solista = new Document()
                    .append("nombre", "Geordie Greep")                    
                    .append("generoMusical", "Prog")
                    .append("imagenPerfil", null)
                    .append("albumes", album);

            coleccion.insertOne(solista);
           
    coleccion = database.getCollection("Bandas");
    
            Document album1 = new Document("nombre", "Peperina")
                                .append("fechaLanzamiento", LocalDate.of(1981, Month.JANUARY, 1))      
                                .append("genero", "prog")
                                .append("imagenPortada", null);
            Document album2 = new Document("nombre", "La grasa de las capitales")
                                .append("fechaLanzamiento", LocalDate.of(1978, Month.JANUARY, 1))  
                                .append("genero", "prog")
                                .append("imagenPortada", null);
    
        Document integrante1 = new Document("nombre", "Charly García")
                                .append("instrumento", "Teclados")
                                .append("fechaIngreso", LocalDate.of(1978, Month.JANUARY, 1))                                
                                .append("fechaSalida", null)
                                .append("estado", true);
        Document integrante2 = new Document("nombre", "David Lebón")
                                .append("instrumento", "Guitarra")
                                .append("fechaIngreso", LocalDate.of(1978, Month.JANUARY, 1))
                                .append("fechaSalida", new Date())
                                .append("estado", false);

        List<Document> integrantes = new ArrayList<>();
        List<Document> albumes = new ArrayList<>();

        integrantes.add(integrante1);        integrantes.add(integrante2);
        albumes.add(album1);        albumes.add(album2);


        

                    Document bandas = new Document()
                    .append("nombre", "Serú Girán")                    
                    .append("generoMusical", "Prog")
                    .append("imagenPerfil", null)
                    .append("integrantes", integrantes)
                    .append("albumes", albumes);

            coleccion.insertOne(bandas);
            
    }
}
