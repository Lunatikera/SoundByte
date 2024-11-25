/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDePrueba;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import Docs.IntegranteDoc;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;

/**
 *
 * @author santi
 */
public class Artistas {

    public Artistas() {
    }
    
    public void insertarArtistasSantiago(){

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
    MongoDatabase database = conexionDB.getDatabase();    

    MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);
    MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);
    
    ArtistaColeccion artista1 = new ArtistaColeccion();    


    List<GeneroColeccion> genArt1 = new ArrayList<>();
    
    Bson A1filtro1 = Filters.eq("nombre", "Rock");
    Bson A1filtro2 = Filters.eq("nombre", "Jazz");
    Bson A1filtroCombinado = Filters.or(A1filtro1, A1filtro2);
    
    for (GeneroColeccion genero : generoColeccion.find(A1filtroCombinado)){
    
        System.out.println(genero.toString());
        genArt1.add(genero);
        
    }
    
    artista1.setNombre("Geordie Greep");
    artista1.setGeneros(genArt1);
    artista1.setEsBanda(false);
    artista1.setIntegrante(null);
    artista1.setImagen("/resources/artistas/Geordie.jpg");
    
    
    
    artistaColeccion.insertOne(artista1);
            
        
    ArtistaColeccion artista2 = new ArtistaColeccion();

    List<GeneroColeccion> genArt2 = new ArrayList<>();
    
    Bson A2filtro1 = Filters.eq("nombre", "Rock");
    
    for (GeneroColeccion genero : generoColeccion.find(A2filtro1)){
    
        genArt2.add(genero);
        
    }
    

    
    IntegranteDoc A2integrante1 = new IntegranteDoc();
    
    A2integrante1.setNombre("Charly García");
    A2integrante1.setEsActivo(Boolean.TRUE);
    A2integrante1.setInstrumento("Teclado");
    A2integrante1.setFechaIngreso(LocalDate.of(1978, 1, 1));
    A2integrante1.setFechaEgreso(null);
    
    IntegranteDoc A2integrante2 = new IntegranteDoc();
    
    A2integrante2.setNombre("Pedro Aznar");
    A2integrante2.setEsActivo(Boolean.TRUE);
    A2integrante2.setInstrumento("Guitarra");
    A2integrante2.setFechaIngreso(LocalDate.of(1978, 1, 1));
    A2integrante2.setFechaEgreso(null);
    
    List<IntegranteDoc> integrantes1 = new ArrayList<>();
    
    integrantes1.add(A2integrante1);
    integrantes1.add(A2integrante2);

    artista2.setNombre("Serú Girán");
    artista2.setGeneros(genArt2);
    artista2.setEsBanda(true);
    artista2.setIntegrante(integrantes1);
    artista2.setImagen("/resources/artistas/SeruGiran.jpg");
    
    artista2.setIntegrante(integrantes1);
    
    
    
    artistaColeccion.insertOne(artista2);
        
    }
    

    
}
