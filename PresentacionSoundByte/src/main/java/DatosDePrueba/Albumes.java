/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDePrueba;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import Docs.CancionDoc;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class Albumes {

    public Albumes() {
    }

    public void insertarAlbumesSantiago() {

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<AlbumColeccion> albumColeccion = database.getCollection("Albumes", AlbumColeccion.class);
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);

        ArtistaColeccion artista1 = new ArtistaColeccion();

        Bson filtro1 = Filters.eq("nombre", "Serú Girán");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro1)) {

            artista1 = artista;

        }

        CancionDoc cancion1 = new CancionDoc();
        cancion1.setId(new ObjectId());
        cancion1.setNombre("Peperina");
        cancion1.setRutaCancion("");

        CancionDoc cancion2 = new CancionDoc();
        cancion2.setId(new ObjectId());
        cancion2.setNombre("Llorando en el espejo");

        CancionDoc cancion3 = new CancionDoc();
        cancion3.setId(new ObjectId());
        cancion3.setNombre("Parado en el medio de la vida");

        CancionDoc cancion4 = new CancionDoc();
        cancion4.setId(new ObjectId());
        cancion4.setNombre("Cara De Velocidad");

        CancionDoc cancion5 = new CancionDoc();
        cancion5.setId(new ObjectId());
        cancion5.setNombre("Esperando nacer");

        CancionDoc cancion6 = new CancionDoc();
        cancion6.setId(new ObjectId());
        cancion6.setNombre("Veinte trajes verdes");

        CancionDoc cancion7 = new CancionDoc();
        cancion7.setId(new ObjectId());
        cancion7.setNombre("Cinema verité");

        CancionDoc cancion8 = new CancionDoc();
        cancion8.setId(new ObjectId());
        cancion8.setNombre("En la verda del sol");

        CancionDoc cancion9 = new CancionDoc();
        cancion9.setId(new ObjectId());
        cancion9.setNombre("José Mercado");

        CancionDoc cancion10 = new CancionDoc();
        cancion10.setId(new ObjectId());
        cancion10.setNombre("Salir de la melancolía");

        CancionDoc cancion11 = new CancionDoc();
        cancion11.setId(new ObjectId());
        cancion11.setNombre("Lo que dice la lluvia");

        List<CancionDoc> canciones1 = new ArrayList<>();

        canciones1.add(cancion1);
        canciones1.add(cancion2);
        canciones1.add(cancion3);
        canciones1.add(cancion4);
        canciones1.add(cancion5);
        canciones1.add(cancion6);
        canciones1.add(cancion7);
        canciones1.add(cancion8);
        canciones1.add(cancion9);
        canciones1.add(cancion10);
        canciones1.add(cancion11);

        AlbumColeccion album1 = new AlbumColeccion();

        album1.setNombre("Peperina");
        album1.setImagen("albums/Peperina.jpg");
        album1.setFechaLanzamiento(LocalDate.of(1978, 1, 1));
        album1.setCanciones(canciones1);
        album1.setArtista(artista1);

        albumColeccion.insertOne(album1);

        
        ArtistaColeccion artista2 = new ArtistaColeccion();

        Bson filtro2 = Filters.eq("nombre", "Geordie Greep");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro2)) {

            artista2 = artista;

        }


        AlbumColeccion album2 = new AlbumColeccion();

        album2.setNombre("The new Sound");
        album2.setImagen("albums/TheNewSound.jpg");
        album2.setFechaLanzamiento(LocalDate.of(2024, 1, 1));
        album2.setArtista(artista2);

        albumColeccion.insertOne(album2);
    }

}
