/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.presentacionsoundbyte;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Colecciones.UsuarioColeccion;
import Conexion.ConexionDB;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import Docs.RestriccionDoc;
import InterfacesDAO.IConexionDB;
import Negocio.UsuarioNegocio;
import com.mongodb.client.*;
import excepciones.NegocioException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);


        GeneroColeccion genero1 = new GeneroColeccion();
        genero1.setNombre("prog");
        GeneroColeccion genero2 = new GeneroColeccion();
        genero2.setNombre("Bachata");


        generoColeccion.insertOne(genero1);
        generoColeccion.insertOne(genero2);
   
    MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);
    
    ArtistaColeccion geordie = new ArtistaColeccion();

    List<GeneroColeccion> generos = new ArrayList<>();
    generos.add(genero1);

    geordie.setNombre("Geordie Greep");
    geordie.setGeneros(generos);
    geordie.setEsBanda(false);
    geordie.setIntegrante(null);
    geordie.setImagen("/resources/artistas/Geordie.jpg");
    
    artistaColeccion.insertOne(geordie);
    

    MongoCollection<AlbumColeccion> albumColeccion = database.getCollection("Albumes", AlbumColeccion.class);

    CancionDoc c1 = new CancionDoc();
    CancionDoc c2 = new CancionDoc();
    c1.setId(new ObjectId());
    c1.setNombre("Salir de la melancolía");
    c2.setId(new ObjectId());
    c2.setNombre("Peperina");
    
    List<CancionDoc> canciones = new ArrayList<>();
    canciones.add(c2);
    canciones.add(c1);


    AlbumColeccion album1 = new AlbumColeccion();
    album1.setNombre("Peperina");
    album1.setArtista(geordie);
    album1.setFechaLanzamiento(LocalDate.of(1981, Month.MARCH, 12));
    album1.setImagen("resources/albums/Peperina.jpg");
    album1.setCanciones(canciones);
    
    albumColeccion.insertOne(album1);


        UsuarioDTO uDTO = new UsuarioDTO();
        FavoritoDoc f = new FavoritoDoc();
        
        List<AlbumColeccion> albumes = new ArrayList<>();
        albumes.add(album1);
        f.setAlbumes(albumes);
        
        List<CancionDoc> cancionesFav = new ArrayList<>();
        cancionesFav.add(c2);
        cancionesFav.add(c1);
        f.setCanciones(canciones);
        
        List<ArtistaColeccion> artistas = new ArrayList<>();
        artistas.add(geordie);
        f.setArtistas(artistas);
        
        RestriccionDoc r = new RestriccionDoc();
        
        List<GeneroColeccion> generosR = new ArrayList<>();
        generosR.add(genero2);
        r.setGeneros(generosR);
        
        List<RestriccionDoc> rList = new ArrayList<>();
        rList.add(r);
            
        
        
        uDTO.setUsername("Chavirez");
        uDTO.setCorreoElectronico("santiagosanchezch@gmail.com");
        uDTO.setContraseña("12345");
        uDTO.setImagenPerfil(null);
        uDTO.setFavoritos(f);
        uDTO.setRestringidos(rList);
        
        UsuarioDAO uDAO = new UsuarioDAO();
        UsuarioNegocio uNeg = new UsuarioNegocio(uDAO);
        
        try {
            uNeg.crearUsuario(uDTO);
        } catch (NegocioException ex) {
            Logger.getLogger(PresentacionSoundByte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
       
            
    }
}
