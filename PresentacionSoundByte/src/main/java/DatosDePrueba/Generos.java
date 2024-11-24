/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DatosDePrueba;

import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;

/**
 *
 * @author santi
 */
public class Generos {

    public Generos() {
    }

    public void insertarGeneros(){
    
        IConexionDB conexionDB = new ConexionDB();
        MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte");    
    
        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);


        GeneroColeccion genero1 = new GeneroColeccion();
        genero1.setNombre("Rock");
        genero1.setImagenGenero("resources/generos/rock.jpg");
        genero1.setDescrpicion("El Rock es un género musical que surgió en la década de 1950 y se caracteriza por el uso predominante de guitarras eléctricas, bajo y batería.");

        GeneroColeccion genero2 = new GeneroColeccion();
        genero2.setNombre("Jazz");
        genero2.setImagenGenero("resources/generos/jazz.jpg");
        genero2.setDescrpicion("El Jazz es un género nacido en Nueva Orleans a finales del siglo XIX, basado en la improvisación y con influencias del blues y la música clásica.");

        GeneroColeccion genero3 = new GeneroColeccion();
        genero3.setNombre("Pop");
        genero3.setImagenGenero("resources/generos/pop.jpg");
        genero3.setDescrpicion("El Pop es un género musical popular que se caracteriza por su enfoque en melodías pegajosas y estructuras simples.");

        GeneroColeccion genero4 = new GeneroColeccion();
        genero4.setNombre("Reggae");
        genero4.setImagenGenero("resources/generos/reggae.jpg");
        genero4.setDescrpicion("El Reggae es un género originado en Jamaica en la década de 1960, conocido por sus ritmos sincopados y letras frecuentemente sociales.");

        GeneroColeccion genero5 = new GeneroColeccion();
        genero5.setNombre("Blues");
        genero5.setImagenGenero("resources/generos/blues.jpg");
        genero5.setDescrpicion("El Blues es un género musical nacido en las comunidades afroamericanas del sur de los Estados Unidos, marcado por su estructura de doce compases y melodías melancólicas.");

        GeneroColeccion genero6 = new GeneroColeccion();
        genero6.setNombre("Country");
        genero6.setImagenGenero("resources/generos/country.jpg");
        genero6.setDescrpicion("El Country es un género originado en el sur de Estados Unidos que mezcla influencias del folk, blues y gospel.");

        GeneroColeccion genero7 = new GeneroColeccion();
        genero7.setNombre("Metal");
        genero7.setImagenGenero("resources/generos/metal.jpg");
        genero7.setDescrpicion("El Metal es un género derivado del Rock, caracterizado por guitarras distorsionadas, baterías potentes y voces agresivas.");

        GeneroColeccion genero8 = new GeneroColeccion();
        genero8.setNombre("Hip-Hop");
        genero8.setImagenGenero("resources/generos/hiphop.jpg");
        genero8.setDescrpicion("El Hip-Hop es un género nacido en los años 70 en los barrios afroamericanos y latinos de Nueva York, caracterizado por el rap, el breakdance y el graffiti.");

        GeneroColeccion genero9 = new GeneroColeccion();
        genero9.setNombre("Clásica");
        genero9.setImagenGenero("resources/generos/clasica.jpg");
        genero9.setDescrpicion("La música Clásica es un género basado en tradiciones de la música occidental, con compositores como Beethoven, Mozart y Bach.");

        GeneroColeccion genero10 = new GeneroColeccion();
        genero10.setNombre("Soul");
        genero10.setImagenGenero("resources/generos/soul.jpg");
        genero10.setDescrpicion("El Soul es un género que combina elementos del gospel y el rhythm and blues, conocido por sus emotivas interpretaciones vocales.");

        GeneroColeccion genero11 = new GeneroColeccion();
        genero11.setNombre("Punk");
        genero11.setImagenGenero("resources/generos/punk.jpg");
        genero11.setDescrpicion("El Punk es un género caracterizado por canciones cortas, rápidas y con letras que critican el sistema y promueven el individualismo.");

        GeneroColeccion genero12 = new GeneroColeccion();
        genero12.setNombre("Funk");
        genero12.setImagenGenero("resources/generos/funk.jpg");
        genero12.setDescrpicion("El Funk es un género que se centra en grooves rítmicos y bailables, mezclando elementos del soul, jazz y R&B.");

        GeneroColeccion genero13 = new GeneroColeccion();
        genero13.setNombre("Cumbia");
        genero13.setImagenGenero("resources/generos/cumbia.jpg");
        genero13.setDescrpicion("La Cumbia es un género musical latinoamericano con raíces africanas, indígenas y españolas, popular en países como Colombia y México.");

        GeneroColeccion genero14 = new GeneroColeccion();
        genero14.setNombre("Salsa");
        genero14.setImagenGenero("resources/generos/salsa.jpg");
        genero14.setDescrpicion("La Salsa es un género nacido en el Caribe que mezcla ritmos afrocaribeños con jazz y otros estilos.");

        GeneroColeccion genero15 = new GeneroColeccion();
        genero15.setNombre("R&B");
        genero15.setImagenGenero("resources/generos/rnb.jpg");
        genero15.setDescrpicion("El R&B es un género que combina el soul y el pop con ritmos contemporáneos, destacando por sus melodías y letras románticas.");

        GeneroColeccion genero16 = new GeneroColeccion();
        genero16.setNombre("Trap");
        genero16.setImagenGenero("resources/generos/trap.jpg");
        genero16.setDescrpicion("El Trap es un subgénero del Hip-Hop que se caracteriza por sus ritmos repetitivos y líricas introspectivas.");

        GeneroColeccion genero17 = new GeneroColeccion();
        genero17.setNombre("Electrónica");
        genero17.setImagenGenero("resources/generos/electronica.jpg");
        genero17.setDescrpicion("La Electrónica es un género que utiliza sonidos sintéticos generados con computadoras y sintetizadores.");

        GeneroColeccion genero18 = new GeneroColeccion();
        genero18.setNombre("Bolero");
        genero18.setImagenGenero("resources/generos/bolero.jpg");
        genero18.setDescrpicion("El Bolero es un género latinoamericano de música romántica, caracterizado por su ritmo lento y letras emotivas.");

        GeneroColeccion genero19 = new GeneroColeccion();
        genero19.setNombre("Prog");
        genero19.setImagenGenero("resources/generos/tango.jpg");
        genero19.setDescrpicion("El Rock progresivo es un subgénero del Rock que nació a fines de los 60 en el Reino Unido y era la expresión de músicos influenciados por la cultura del Rock, con una formación musical de conservatorio o clásica, con contenidos pretenciosos, de alto vuelo filosófico o literario en su lírica.");

        GeneroColeccion genero20 = new GeneroColeccion();
        genero20.setNombre("Reggaetón");
        genero20.setImagenGenero("resources/generos/reggaeton.jpg");
        genero20.setDescrpicion("El Reggaetón es un género musical urbano que combina ritmos latinos con el rap y el dancehall.");

        List<GeneroColeccion> generos = new ArrayList<>();
        
        generos.add(genero1);
        generos.add(genero2);        
        generos.add(genero3);
        generos.add(genero4);        
        generos.add(genero5);
        generos.add(genero6);        
        generos.add(genero7);
        generos.add(genero8);        
        generos.add(genero9);
        generos.add(genero10);        
        generos.add(genero11);
        generos.add(genero12);        
        generos.add(genero13);
        generos.add(genero14);        
        generos.add(genero15);
        generos.add(genero16);        
        generos.add(genero17);
        generos.add(genero18);        
        generos.add(genero19);
        generos.add(genero20);

        generoColeccion.insertMany(generos);
        
    }
    
    public Boolean existe(){
        
        IConexionDB conexionDB = new ConexionDB();
        MongoDatabase database = conexionDB.conexion("mongodb://localhost:27017", "SoundByte");    
    
        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);
        
        return generoColeccion.countDocuments() != 0;
            
    }
    
    
}
