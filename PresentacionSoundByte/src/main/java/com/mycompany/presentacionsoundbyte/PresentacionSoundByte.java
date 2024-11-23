/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.presentacionsoundbyte;

import Conexion.ConexionDB;
import DTO.UsuarioDTO;
import Docs.Favoritos;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;


/**
 *
 * @author carli
 */
public class PresentacionSoundByte {

    public static void main(String[] args) {
    
    IConexionDB conexionDB = new ConexionDB();
    MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte");    
    MongoCollection<Document> coleccion;
    
        MongoCollection<Document> generoCollection = database.getCollection("Generos");

        // Lista de géneros musicales
        List<Document> genres = Arrays.asList(
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Rock"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Pop"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Jazz"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Hip-Hop"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Clásica"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Reggae"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Blues"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Electrónica"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Metal"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Salsa"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Country"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Funk"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "R&B"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Punk"),
                new Document("_id", new org.bson.types.ObjectId()).append("genero", "Prog")
        );


        generoCollection.insertMany(genres);

        Document genero1 = generoCollection.find(new Document("genero", "Prog")).first();

            ObjectId generoId1 = genero1.getObjectId("_id");
            
        Document genero2 = generoCollection.find(new Document("genero", "Rock")).first();

            ObjectId generoId2 = genero2.getObjectId("_id");
            
        Document genero3 = generoCollection.find(new Document("genero", "Country")).first();

            ObjectId generoId3 = genero3.getObjectId("_id");
            
        Document genero4 = generoCollection.find(new Document("genero", "Reggae")).first();

            ObjectId generoId4 = genero4.getObjectId("_id");
            
    coleccion = database.getCollection("Solistas");
    
        Document album = new Document("nombre", "The New Sound")
                                .append("fechaLanzamiento", new Date()) 
                                .append("genero", generoId1)
                                .append("imagenPortada", null);
        
                    Document solista = new Document()
                    .append("nombre", "Geordie Greep")                    
                    .append("generoMusical", generoId1)
                    .append("imagenPerfil", null)
                    .append("albumes", album);

            coleccion.insertOne(solista);
           
    coleccion = database.getCollection("Bandas");
    
            Document album1 = new Document("nombre", "Peperina")
                                .append("fechaLanzamiento", LocalDate.of(1981, Month.JANUARY, 1))      
                                .append("genero", generoId1)
                                .append("imagenPortada", null);
            Document album2 = new Document("nombre", "La grasa de las capitales")
                                .append("fechaLanzamiento", LocalDate.of(1978, Month.JANUARY, 1))  
                                .append("genero", generoId1)
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
                    .append("generoMusical", generoId1)
                    .append("imagenPerfil", null)
                    .append("integrantes", integrantes)
                    .append("albumes", albumes);

            coleccion.insertOne(bandas);
            
            
                    
    coleccion = database.getCollection("Usuarios");
    
        Document favorito1 = new Document("genero", generoId1);
        Document favorito2 = new Document("genero", generoId2);
        Document restriccion1 = new Document ("restriccion", generoId3);
        Document restriccion2 = new Document ("restriccion", generoId4);
        
        List<Document> favoritos = new ArrayList<>();
        favoritos.add(favorito1);        favoritos.add(favorito2);
        List<Document> restricciones = new ArrayList<>();
        restricciones.add(restriccion1);        restricciones.add(restriccion2);


        UsuarioDTO uDTO = new UsuarioDTO();
        Favoritos f = new Favoritos();
        
        
        
        uDTO.setUsername("Chavirez");
        uDTO.setCorreoElectronico("santiagosanchezch@gmail.com");
        uDTO.setContraseña("12345");
        uDTO.setImagenPerfil(null);
        uDTO.setFavoritos(f);
        
                    Document user = new Document()
                    .append("username", "Chavirez")                    
                    .append("correoElectronico", "santiagosanchezch@gmail.com")
                    .append("contraseña", "12345")
                    .append("imagenPerfil", null)
                    .append("favoritos", favoritos)
                    .append("restricciones", restricciones);

            coleccion.insertOne(user);
            
    }
}
