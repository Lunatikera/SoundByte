/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import Docs.CancionDoc;
import Docs.IntegranteDoc;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IDatosDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Clase Datos
 * @author stae
 */
public class DatosDAO implements IDatosDAO{

    /**
     * Constructor por omisión
     */
    public DatosDAO() {

    }

    /**
     * Método de inserción de géneros
     */
    public void insertarGenerosS() {
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

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
        genero11.setNombre("Punk Ska");
        genero11.setImagenGenero("resources/generos/punkSka.jpg");
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
        genero19.setDescrpicion("El Rock progresivo es un subgénero del Rock que nació a fines de los 60 en el Reino Unido y era la expresión de músicos influenciados por la cultura del Rock.");

        GeneroColeccion genero20 = new GeneroColeccion();
        genero20.setNombre("Reggaetón");
        genero20.setImagenGenero("resources/generos/reggaeton.jpg");
        genero20.setDescrpicion("El Reggaetón es un género musical urbano que combina ritmos latinos con el rap y el dancehall.");

        GeneroColeccion genero21 = new GeneroColeccion();
        genero21.setNombre("Alternativo");
        genero21.setImagenGenero("resources/generos/alternativo.jpg");
        genero21.setDescrpicion("El Alternativo es un género musical que engloba una variedad de estilos, todos caracterizados por su enfoque experimental y diverso.");

        GeneroColeccion genero22 = new GeneroColeccion();
        genero22.setNombre("Techno");
        genero22.setImagenGenero("resources/generos/techno.jpg");
        genero22.setDescrpicion("El Techno es un género de música electrónica originado en los años 80, basado en la creación de sonidos sintetizados y ritmos repetitivos.");

        GeneroColeccion genero23 = new GeneroColeccion();
        genero23.setNombre("House");
        genero23.setImagenGenero("resources/generos/house.jpg");
        genero23.setDescrpicion("El House es un subgénero de la música electrónica de baile, con raíces en el disco y el funk.");

        GeneroColeccion genero24 = new GeneroColeccion();
        genero24.setNombre("Indie");
        genero24.setImagenGenero("resources/generos/indie.jpg");
        genero24.setDescrpicion("El Indie es un género que se refiere tanto a un estilo de música como a la forma en que se producen y distribuyen los discos de artistas independientes.");

        GeneroColeccion genero25 = new GeneroColeccion();
        genero25.setNombre("Bossa Nova");
        genero25.setImagenGenero("resources/generos/bossa_nova.jpg");
        genero25.setDescrpicion("La Bossa Nova es un género de música brasileña que fusiona samba con jazz y fue popularizado por artistas como João Gilberto.");

        GeneroColeccion genero26 = new GeneroColeccion();
        genero26.setNombre("Folk");
        genero26.setImagenGenero("resources/generos/folk.jpg");
        genero26.setDescrpicion("El Folk es un género musical que tiene sus raíces en la música popular tradicional y suele estar asociado con canciones narrativas.");

        GeneroColeccion genero27 = new GeneroColeccion();
        genero27.setNombre("Disco");
        genero27.setImagenGenero("resources/generos/disco.jpg");
        genero27.setDescrpicion("El Disco es un género que se popularizó en los años 70, caracterizado por su ritmo pegajoso, el uso de bajos profundos y la música de baile.");

        GeneroColeccion genero28 = new GeneroColeccion();
        genero28.setNombre("Trance");
        genero28.setImagenGenero("resources/generos/trance.jpg");
        genero28.setDescrpicion("El Trance es un subgénero de la música electrónica, conocido por sus melodías hipnóticas y largas construcciones de efectos sonoros.");

        GeneroColeccion genero29 = new GeneroColeccion();
        genero29.setNombre("Tango Argentino");
        genero29.setImagenGenero("resources/generos/tango_argentino.jpg");
        genero29.setDescrpicion("El Tango es un género de música y danza originario de Argentina, con un ritmo lento y sensual.");

        GeneroColeccion genero30 = new GeneroColeccion();
        genero30.setNombre("Chillout");
        genero30.setImagenGenero("resources/generos/chillout.jpg");
        genero30.setDescrpicion("El Chillout es un género que se caracteriza por su música relajante y tranquila, ideal para momentos de descanso o relajación.");

        // Añadir los géneros a la lista
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
        generos.add(genero21);
        generos.add(genero22);
        generos.add(genero23);
        generos.add(genero24);
        generos.add(genero25);
        generos.add(genero26);
        generos.add(genero27);
        generos.add(genero28);
        generos.add(genero29);
        generos.add(genero30);

        generoColeccion.insertMany(generos);

    }

    /**
     * Método de inserción de géneros
     */
    public void insertarGenerosC() {
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);

        GeneroColeccion genero31 = new GeneroColeccion();
        genero31.setNombre("Ska");
        genero31.setImagenGenero("resources/generos/ska.jpg");
        genero31.setDescrpicion("El Ska es un género musical originario de Jamaica en la década de 1960, que combina elementos del jazz, el rhythm and blues y la música caribeña.");

        GeneroColeccion genero32 = new GeneroColeccion();
        genero32.setNombre("Gospel");
        genero32.setImagenGenero("resources/generos/gospel.jpg");
        genero32.setDescrpicion("El Gospel es un género musical de raíces afroamericanas, caracterizado por sus letras espirituales y coros cantados con mucha emotividad.");

        GeneroColeccion genero33 = new GeneroColeccion();
        genero33.setNombre("Folk");
        genero33.setImagenGenero("resources/generos/folk.jpg");
        genero33.setDescrpicion("El Folk es un género musical que tiene sus raíces en la música popular tradicional y suele estar asociado con canciones narrativas.");

        GeneroColeccion genero34 = new GeneroColeccion();
        genero34.setNombre("Bossa Nova Jazz");
        genero34.setImagenGenero("resources/generos/bossa_nova_jazz.jpg");
        genero34.setDescrpicion("La Bossa Nova es un género brasileño que fusiona samba con jazz y es conocido por sus ritmos suaves y sus letras románticas.");

        GeneroColeccion genero35 = new GeneroColeccion();
        genero35.setNombre("Blues");
        genero35.setImagenGenero("resources/generos/blues.jpg");
        genero35.setDescrpicion("El Blues es un género musical nacido en las comunidades afroamericanas del sur de los Estados Unidos, marcado por su estructura de doce compases y melodías melancólicas.");

        GeneroColeccion genero36 = new GeneroColeccion();
        genero36.setNombre("Hardcore");
        genero36.setImagenGenero("resources/generos/hardcore.jpg");
        genero36.setDescrpicion("El Hardcore es un subgénero del Punk caracterizado por su ritmo rápido, agresivo y su actitud rebelde.");

        GeneroColeccion genero37 = new GeneroColeccion();
        genero37.setNombre("Samba");
        genero37.setImagenGenero("resources/generos/samba.jpg");
        genero37.setDescrpicion("La Samba es un género de música y danza originario de Brasil, conocido por su ritmo rápido y contagioso.");

        GeneroColeccion genero38 = new GeneroColeccion();
        genero38.setNombre("Trance");
        genero38.setImagenGenero("resources/generos/trance.jpg");
        genero38.setDescrpicion("El Trance es un subgénero de la música electrónica, conocido por sus melodías hipnóticas y largas construcciones de efectos sonoros.");

        GeneroColeccion genero39 = new GeneroColeccion();
        genero39.setNombre("K-Pop");
        genero39.setImagenGenero("resources/generos/kpop.jpg");
        genero39.setDescrpicion("El K-Pop es un género musical originario de Corea del Sur que ha ganado popularidad mundial, caracterizado por su mezcla de pop, rap y elementos de la cultura coreana.");

        GeneroColeccion genero40 = new GeneroColeccion();
        genero40.setNombre("Post-Rock");
        genero40.setImagenGenero("resources/generos/post_rock.jpg");
        genero40.setDescrpicion("El Post-Rock es un género experimental que utiliza la instrumentación del rock para crear atmósferas abstractas y emocionales.");

        GeneroColeccion genero41 = new GeneroColeccion();
        genero41.setNombre("Swing");
        genero41.setImagenGenero("resources/generos/swing.jpg");
        genero41.setDescrpicion("El Swing es un subgénero del jazz que se caracteriza por su ritmo bailable y sus improvisaciones melodiosas.");

        GeneroColeccion genero42 = new GeneroColeccion();
        genero42.setNombre("Salsa");
        genero42.setImagenGenero("resources/generos/salsa.jpg");
        genero42.setDescrpicion("La Salsa es un género nacido en el Caribe que mezcla ritmos afrocaribeños con jazz y otros estilos.");

        GeneroColeccion genero43 = new GeneroColeccion();
        genero43.setNombre("Dubstep");
        genero43.setImagenGenero("resources/generos/dubstep.jpg");
        genero43.setDescrpicion("El Dubstep es un subgénero de la música electrónica que se caracteriza por sus graves potentes, ritmos rotos y efectos de sonido dub.");

        GeneroColeccion genero44 = new GeneroColeccion();
        genero44.setNombre("Ranchera");
        genero44.setImagenGenero("resources/generos/ranchera.jpg");
        genero44.setDescrpicion("La Ranchera es un género mexicano tradicional que suele expresar temas de amor, desamor y la vida rural, con un ritmo enérgico y melodioso.");

        GeneroColeccion genero45 = new GeneroColeccion();
        genero45.setNombre("Celtic");
        genero45.setImagenGenero("resources/generos/celtic.jpg");
        genero45.setDescrpicion("La Música Celta es originaria de los pueblos de Europa Occidental, con un estilo que incorpora instrumentos tradicionales como el violín, la gaita y la flauta.");

        GeneroColeccion genero46 = new GeneroColeccion();
        genero46.setNombre("Fado");
        genero46.setImagenGenero("resources/generos/fado.jpg");
        genero46.setDescrpicion("El Fado es un género de música tradicional de Portugal, conocido por su estilo melancólico y lírico, con temas de amor, destino y saudade.");

        GeneroColeccion genero47 = new GeneroColeccion();
        genero47.setNombre("Emo");
        genero47.setImagenGenero("resources/generos/emo.jpg");
        genero47.setDescrpicion("El Emo es un subgénero del Punk caracterizado por sus letras introspectivas y emotivas, y por un estilo musical melódico y emocional.");

        GeneroColeccion genero48 = new GeneroColeccion();
        genero48.setNombre("Grunge");
        genero48.setImagenGenero("resources/generos/grunge.jpg");
        genero48.setDescrpicion("El Grunge es un subgénero del rock alternativo que surgió a principios de los 90, conocido por su sonido distorsionado y sus letras sombrías.");

        GeneroColeccion genero49 = new GeneroColeccion();
        genero49.setNombre("Lo-Fi Hip-Hop");
        genero49.setImagenGenero("resources/generos/lofi_hiphop.jpg");
        genero49.setDescrpicion("El Lo-Fi Hip-Hop es un subgénero del Hip-Hop que se caracteriza por sus ritmos relajados y el uso de sonidos ambientales y suaves.");

        GeneroColeccion genero50 = new GeneroColeccion();
        genero50.setNombre("Bluegrass");
        genero50.setImagenGenero("resources/generos/bluegrass.jpg");
        genero50.setDescrpicion("El Bluegrass es un subgénero de la música country que se caracteriza por el uso de instrumentos como el banjo, el violín y la mandolina.");

        GeneroColeccion genero51 = new GeneroColeccion();
        genero51.setNombre("Reggae");
        genero51.setImagenGenero("resources/generos/reggae.jpg");
        genero51.setDescrpicion("El Reggae es un género originado en Jamaica en la década de 1960, conocido por sus ritmos sincopados y letras frecuentemente sociales.");

        GeneroColeccion genero52 = new GeneroColeccion();
        genero52.setNombre("Música Mexicana");
        genero52.setImagenGenero("resources/generos/mexicana.jpg");
        genero52.setDescrpicion("La Música Mexicana es un término amplio que engloba una variedad de géneros, como el mariachi, ranchera, y la música norteña.");

        GeneroColeccion genero53 = new GeneroColeccion();
        genero53.setNombre("Indie Rock");
        genero53.setImagenGenero("resources/generos/indie_rock.jpg");
        genero53.setDescrpicion("El Indie Rock es un subgénero del rock alternativo que surgió en la década de 1990 y se caracteriza por su estilo experimental y su enfoque independiente.");

        GeneroColeccion genero54 = new GeneroColeccion();
        genero54.setNombre("Música Ambiental");
        genero54.setImagenGenero("resources/generos/ambient.jpg");
        genero54.setDescrpicion("La Música Ambiental es un género que se enfoca en crear atmósferas sonoras, usando sonidos suaves y tranquilos que no siguen una estructura musical definida.");

        GeneroColeccion genero55 = new GeneroColeccion();
        genero55.setNombre("Tango");
        genero55.setImagenGenero("resources/generos/tango.jpg");
        genero55.setDescrpicion("El Tango es un género musical y de danza originario de Argentina y Uruguay, conocido por su ritmo sensual y su melodía apasionada.");

        GeneroColeccion genero56 = new GeneroColeccion();
        genero56.setNombre("Punk");
        genero56.setImagenGenero("resources/generos/punk.jpg");
        genero56.setDescrpicion("El Punk es un género caracterizado por canciones cortas, rápidas y con letras que critican el sistema y promueven el individualismo.");

        GeneroColeccion genero57 = new GeneroColeccion();
        genero57.setNombre("Hard Rock");
        genero57.setImagenGenero("resources/generos/hard_rock.jpg");
        genero57.setDescrpicion("El Hard Rock es un subgénero del Rock, caracterizado por guitarras eléctricas pesadas, baterías potentes y letras a menudo rebeldes.");

        GeneroColeccion genero58 = new GeneroColeccion();
        genero58.setNombre("Cumbia");
        genero58.setImagenGenero("resources/generos/cumbia.jpg");
        genero58.setDescrpicion("La Cumbia es un género musical latinoamericano con raíces africanas, indígenas y españolas, popular en países como Colombia y México.");

        GeneroColeccion genero59 = new GeneroColeccion();
        genero59.setNombre("Vallenato");
        genero59.setImagenGenero("resources/generos/vallenato.jpg");
        genero59.setDescrpicion("El Vallenato es un género colombiano tradicional que utiliza instrumentos como el acordeón y la caja, y se caracteriza por sus temas de amor y desamor.");

        GeneroColeccion genero60 = new GeneroColeccion();
        genero60.setNombre("Bebop");
        genero60.setImagenGenero("resources/generos/bebop.jpg");
        genero60.setDescrpicion("El Bebop es un estilo de jazz que surgió en la década de 1940, conocido por su complejidad armónica y su ritmo rápido y virtuoso.");

        // Añadir los géneros a la lista
        List<GeneroColeccion> generos = new ArrayList<>();
        generos.add(genero31);
        generos.add(genero32);
        generos.add(genero33);
        generos.add(genero34);
        generos.add(genero35);
        generos.add(genero36);
        generos.add(genero37);
        generos.add(genero38);
        generos.add(genero39);
        generos.add(genero40);
        generos.add(genero41);
        generos.add(genero42);
        generos.add(genero43);
        generos.add(genero44);
        generos.add(genero45);
        generos.add(genero46);
        generos.add(genero47);
        generos.add(genero48);
        generos.add(genero49);
        generos.add(genero50);
        generos.add(genero51);
        generos.add(genero52);
        generos.add(genero53);
        generos.add(genero54);
        generos.add(genero55);
        generos.add(genero56);
        generos.add(genero57);
        generos.add(genero58);
        generos.add(genero59);
        generos.add(genero60);

        generoColeccion.insertMany(generos);

    }
    
    /**
     * Método de inserción de géneros
     */
    public void insertarGenerosO() {
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);

        GeneroColeccion genero61 = new GeneroColeccion();
        genero61.setNombre("Chanson Française");
        genero61.setImagenGenero("resources/generos/chanson_francaise.jpg");
        genero61.setDescrpicion("La Chanson Française es un estilo de música popular francesa que pone énfasis en las letras poéticas, la narrativa y la interpretación vocal emotiva.");

        GeneroColeccion genero62 = new GeneroColeccion();
        genero62.setNombre("Musette");
        genero62.setImagenGenero("resources/generos/musette.jpg");
        genero62.setDescrpicion("El Musette es un estilo de música popular francesa influenciado por la música folclórica, especialmente de la región de París, con una fuerte presencia de acordeón.");

        GeneroColeccion genero63 = new GeneroColeccion();
        genero63.setNombre("Électro Swing");
        genero63.setImagenGenero("resources/generos/electro_swing.jpg");
        genero63.setDescrpicion("El Electro Swing es una mezcla de jazz, swing y música electrónica moderna, con una estética retro y un ritmo bailable.");

        GeneroColeccion genero64 = new GeneroColeccion();
        genero64.setNombre("French House");
        genero64.setImagenGenero("resources/generos/french_house.jpg");
        genero64.setDescrpicion("El French House es un subgénero de la música electrónica que se caracteriza por su sonido funky y el uso de samples de disco y soul.");

        GeneroColeccion genero65 = new GeneroColeccion();
        genero65.setNombre("Yé-yé");
        genero65.setImagenGenero("resources/generos/ye_ye.jpg");
        genero65.setDescrpicion("El Yé-yé es un estilo de música pop francesa que fue popular en la década de 1960, influenciado por el pop británico y estadounidense, pero con un toque francés.");

        GeneroColeccion genero66 = new GeneroColeccion();
        genero66.setNombre("Nouvelle Chanson");
        genero66.setImagenGenero("resources/generos/nouvelle_chanson.jpg");
        genero66.setDescrpicion("La Nouvelle Chanson es un movimiento musical que surgió en Francia en los años 2000, fusionando el pop, el rock y la chanson tradicional francesa.");

        GeneroColeccion genero67 = new GeneroColeccion();
        genero67.setNombre("Salsa Chachachá");
        genero67.setImagenGenero("resources/generos/salsa_chachacha.jpg");
        genero67.setDescrpicion("Aunque originalmente latinoamericana, en Francia se desarrolló una versión muy popular de la Salsa y el Chachachá, especialmente en la escena de baile y en el Caribe francés.");

        GeneroColeccion genero68 = new GeneroColeccion();
        genero68.setNombre("Rap Francés");
        genero68.setImagenGenero("resources/generos/rap_frances.jpg");
        genero68.setDescrpicion("El Rap Francés es un subgénero del rap que pone un énfasis en las letras poéticas, a menudo políticas, y las influencias del hip-hop estadounidense adaptadas a la cultura francesa.");

        GeneroColeccion genero69 = new GeneroColeccion();
        genero69.setNombre("Folk Francés");
        genero69.setImagenGenero("resources/generos/folk_frances.jpg");
        genero69.setDescrpicion("El Folk Francés es un estilo que se basa en las tradiciones musicales de las regiones rurales de Francia, a menudo tocado con guitarra, acordeón y violín.");

        GeneroColeccion genero70 = new GeneroColeccion();
        genero70.setNombre("Zouk");
        genero70.setImagenGenero("resources/generos/zouk.jpg");
        genero70.setDescrpicion("El Zouk es un género de música popular originario de las Antillas francesas, conocido por sus ritmos rápidos y su influencia en la música caribeña.");

        GeneroColeccion genero71 = new GeneroColeccion();
        genero71.setNombre("Italo Disco");
        genero71.setImagenGenero("resources/generos/italo_disco.jpg");
        genero71.setDescrpicion("El Italo Disco es un subgénero del disco que se originó en Italia en los años 80, caracterizado por su sonido electrónico y melódico, ideal para la pista de baile.");

        GeneroColeccion genero72 = new GeneroColeccion();
        genero72.setNombre("Canzone Napoletana");
        genero72.setImagenGenero("resources/generos/canzone_napoletana.jpg");
        genero72.setDescrpicion("La Canzone Napoletana es un género musical tradicional de Nápoles, conocido por sus melodías melancólicas y letras románticas sobre la vida en el sur de Italia.");

        GeneroColeccion genero73 = new GeneroColeccion();
        genero73.setNombre("Opera Italiana");
        genero73.setImagenGenero("resources/generos/opera_italiana.jpg");
        genero73.setDescrpicion("La Ópera Italiana es un género musical clásico que ha sido fundamental para el desarrollo de la ópera mundial, con compositores destacados como Verdi y Puccini.");

        GeneroColeccion genero74 = new GeneroColeccion();
        genero74.setNombre("Tarantella");
        genero74.setImagenGenero("resources/generos/tarantella.jpg");
        genero74.setDescrpicion("La Tarantella es una danza tradicional del sur de Italia que se caracteriza por un ritmo rápido y alegre, normalmente acompañada de música de mandolina y tambor.");

        GeneroColeccion genero75 = new GeneroColeccion();
        genero75.setNombre("Canzone d'Autore");
        genero75.setImagenGenero("resources/generos/canzone_autore.jpg");
        genero75.setDescrpicion("La Canzone d'Autore es un género de música popular italiana que pone énfasis en las letras poéticas y profundas, con una fuerte influencia de la música folclórica.");

        GeneroColeccion genero76 = new GeneroColeccion();
        genero76.setNombre("Bossa Nova Italiana");
        genero76.setImagenGenero("resources/generos/bossa_nova_italiana.jpg");
        genero76.setDescrpicion("La Bossa Nova Italiana es una versión italiana del famoso género brasileño, combinando jazz y samba con influencias de la música italiana.");

        GeneroColeccion genero77 = new GeneroColeccion();
        genero77.setNombre("Pop Italiano");
        genero77.setImagenGenero("resources/generos/pop_italiano.jpg");
        genero77.setDescrpicion("El Pop Italiano es la versión italiana de la música pop, con artistas conocidos que dominan las listas de éxitos en Italia y en todo el mundo.");

        GeneroColeccion genero78 = new GeneroColeccion();
        genero78.setNombre("Funk Italiano");
        genero78.setImagenGenero("resources/generos/funk_italiano.jpg");
        genero78.setDescrpicion("El Funk Italiano es un subgénero que fusiona el funky con el estilo italiano, creando ritmos bailables con un toque único de la cultura musical de Italia.");

        GeneroColeccion genero79 = new GeneroColeccion();
        genero79.setNombre("Eurodance Italiano");
        genero79.setImagenGenero("resources/generos/eurodance_italiano.jpg");
        genero79.setDescrpicion("El Eurodance Italiano es un subgénero de música electrónica que surgió en Italia en los 90s, mezclando house, techno y dance pop con una estética muy bailable.");

        GeneroColeccion genero80 = new GeneroColeccion();
        genero80.setNombre("Trap Italiano");
        genero80.setImagenGenero("resources/generos/trap_italiano.jpg");
        genero80.setDescrpicion("El Trap Italiano es un subgénero del trap que tiene sus raíces en la escena del hip-hop italiano, influenciado por la música trap estadounidense pero con letras adaptadas al contexto cultural italiano.");

        GeneroColeccion genero81 = new GeneroColeccion();
        genero81.setNombre("Rock Italiano");
        genero81.setImagenGenero("resources/generos/rock_italiano.jpg");
        genero81.setDescrpicion("El Rock Italiano es un estilo de rock que ha sido muy popular en Italia, con bandas y artistas que integran el rock clásico con influencias del pop y la música tradicional italiana.");

        GeneroColeccion genero82 = new GeneroColeccion();
        genero82.setNombre("Ragtime Italiano");
        genero82.setImagenGenero("resources/generos/ragtime_italiano.jpg");
        genero82.setDescrpicion("El Ragtime Italiano es una interpretación italiana del género estadounidense ragtime, combinando sus características rítmicas con una influencia clásica italiana.");

        GeneroColeccion genero83 = new GeneroColeccion();
        genero83.setNombre("Folk Italiano");
        genero83.setImagenGenero("resources/generos/folk_italiano.jpg");
        genero83.setDescrpicion("El Folk Italiano es un estilo que abarca diversas tradiciones musicales de Italia, con énfasis en instrumentos tradicionales como la mandolina, la guitarra y el acordeón.");

        GeneroColeccion genero84 = new GeneroColeccion();
        genero84.setNombre("Cumbia Italiana");
        genero84.setImagenGenero("resources/generos/cumbia_italiana.jpg");
        genero84.setDescrpicion("La Cumbia Italiana es una versión de la tradicional cumbia latina, adaptada a la escena musical italiana, especialmente en el sur del país.");

        GeneroColeccion genero85 = new GeneroColeccion();
        genero85.setNombre("Jazz Italiano");
        genero85.setImagenGenero("resources/generos/jazz_italiano.jpg");
        genero85.setDescrpicion("El Jazz Italiano es un estilo de jazz que se ha desarrollado en Italia, fusionando el jazz estadounidense con influencias de la música clásica y la tradición italiana.");

        GeneroColeccion genero86 = new GeneroColeccion();
        genero86.setNombre("Canto a Tenore");
        genero86.setImagenGenero("resources/generos/canto_tenore.jpg");
        genero86.setDescrpicion("El Canto a Tenore es una tradición vocal de Cerdeña, caracterizada por un estilo polifónico único y con voces profundas, utilizado para expresar temas de la vida cotidiana.");

        GeneroColeccion genero87 = new GeneroColeccion();
        genero87.setNombre("Guitarre Française");
        genero87.setImagenGenero("resources/generos/guitarre_francaise.jpg");
        genero87.setDescrpicion("La Guitarre Française es un género de música de guitarra que destaca la interpretación técnica y emotiva, típicamente francesa, con influencias de la música clásica y jazz.");

        GeneroColeccion genero88 = new GeneroColeccion();
        genero88.setNombre("Jazz Manouche");
        genero88.setImagenGenero("resources/generos/jazz_manouche.jpg");
        genero88.setDescrpicion("El Jazz Manouche es una forma de jazz gitano originaria de Francia, popularizada por el guitarrista Django Reinhardt, conocida por su ritmo rápido y su improvisación.");

        GeneroColeccion genero89 = new GeneroColeccion();
        genero89.setNombre("Vino e Musica");
        genero89.setImagenGenero("resources/generos/vino_musica.jpg");
        genero89.setDescrpicion("El Vino e Musica es un género que celebra la cultura vinícola italiana, combinando música tradicional con la alegría de los festivales de vino.");

        GeneroColeccion genero90 = new GeneroColeccion();
        genero90.setNombre("Sicilian Folk");
        genero90.setImagenGenero("resources/generos/sicilian_folk.jpg");
        genero90.setDescrpicion("El Sicilian Folk es un género musical tradicional de Sicilia, conocido por sus melodías alegres y sus temas relacionados con la vida rural y la historia de la isla.");

// Lista con los géneros para insertar
        List<GeneroColeccion> generosFrancesesEItalianos = new ArrayList<>();
        generosFrancesesEItalianos.add(genero61);
        generosFrancesesEItalianos.add(genero62);
        generosFrancesesEItalianos.add(genero63);
        generosFrancesesEItalianos.add(genero64);
        generosFrancesesEItalianos.add(genero65);
        generosFrancesesEItalianos.add(genero66);
        generosFrancesesEItalianos.add(genero67);
        generosFrancesesEItalianos.add(genero68);
        generosFrancesesEItalianos.add(genero69);
        generosFrancesesEItalianos.add(genero70);
        generosFrancesesEItalianos.add(genero71);
        generosFrancesesEItalianos.add(genero72);
        generosFrancesesEItalianos.add(genero73);
        generosFrancesesEItalianos.add(genero74);
        generosFrancesesEItalianos.add(genero75);
        generosFrancesesEItalianos.add(genero76);
        generosFrancesesEItalianos.add(genero77);
        generosFrancesesEItalianos.add(genero78);
        generosFrancesesEItalianos.add(genero79);
        generosFrancesesEItalianos.add(genero80);
        generosFrancesesEItalianos.add(genero81);
        generosFrancesesEItalianos.add(genero82);
        generosFrancesesEItalianos.add(genero83);
        generosFrancesesEItalianos.add(genero84);
        generosFrancesesEItalianos.add(genero85);
        generosFrancesesEItalianos.add(genero86);
        generosFrancesesEItalianos.add(genero87);
        generosFrancesesEItalianos.add(genero88);
        generosFrancesesEItalianos.add(genero89);
        generosFrancesesEItalianos.add(genero90);

// Inserción en la colección
        generoColeccion.insertMany(generosFrancesesEItalianos);

    }

    /**
     * Método de inserción de artistas
     */
    public void insertarArtistasSolo() {

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);

        List<String> nombresArtistas = List.of(
                "Michael Jackson", "The Weeknd", "Freddie Mercury", "Beyoncé", "Bob Marley",
                "Elvis Presley", "Lady Gaga", "Madonna", "Prince", "David Bowie",
                "Aretha Franklin", "John Lennon", "Adele", "Stevie Wonder", "Amy Winehouse",
                "Paul McCartney", "Bruce Springsteen", "Jimi Hendrix", "Whitney Houston", "Rihanna",
                "Kurt Cobain", "Tina Turner", "James Brown", "Johnny Cash", "Billie Eilish",
                "Carlos Santana", "Marvin Gaye", "Chuck Berry", "Patti Smith", "Eminem",
                "Drake", "Kendrick Lamar", "Shakira", "Jay-Z", "Taylor Swift",
                "Lana Del Rey", "Billie Holiday", "Sia", "Elton John", "Diana Ross",
                "Frank Sinatra", "Celine Dion", "Kate Bush", "The Rolling Stones", "Ariana Grande"
        );

        // Obtener los géneros de la colección "Generos"
        List<GeneroColeccion> listaGeneros = generoColeccion.find().into(new ArrayList<>());

        // Si tienes menos géneros que artistas, repetimos los géneros cíclicamente
        int totalGeneros = listaGeneros.size();

        for (int i = 0; i < 45; i++) {
            // Crear un nuevo artista
            ArtistaColeccion artista = new ArtistaColeccion();

            // Asignar nombre real al artista
            String nombreArtista = nombresArtistas.get(i);
            artista.setNombre(nombreArtista);

            // Asignar un solo género de manera secuencial (cíclica)
            GeneroColeccion generoArtista = listaGeneros.get(i % totalGeneros); // Asigna géneros de forma cíclica
            List<GeneroColeccion> generosArtista = new ArrayList<>();
            generosArtista.add(generoArtista);

            // Configurar el objeto ArtistaColeccion
            artista.setGeneros(generosArtista);
            artista.setEsBanda(false);  // Este artista no es una banda
            artista.setIntegrante(null);  // No tiene integrantes
            artista.setImagen("/resources/artistas/" + nombreArtista.replace(" ", "") + ".jpg");

            // Insertar el artista en la base de datos
            artistaColeccion.insertOne(artista);

            System.out.println("Insertado: " + nombreArtista);
        }

        System.out.println("45 artista insertados");
    }

    /**
     * Método de inserción de artistas
     */
    public void insertarArtistasBanda() {

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<GeneroColeccion> generoColeccion = database.getCollection("Generos", GeneroColeccion.class);
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);

        List<String> nombresBandas = List.of(
                "The Beatles", "Queen", "The Rolling Stones", "Led Zeppelin", "Pink Floyd",
                "AC/DC", "The Doors", "The Who", "The Clash", "Nirvana",
                "Red Hot Chili Peppers", "Metallica", "U2", "Green Day", "Fleetwood Mac",
                "Imagine Dragons", "The Killers", "Coldplay", "Muse", "Linkin Park",
                "Maroon 5", "The Police", "Eagles", "Paramore", "Fall Out Boy",
                "Black Sabbath", "Radiohead", "The Smashing Pumpkins", "The Beach Boys", "Rage Against the Machine",
                "Oasis", "The White Stripes", "Kiss", "Soundgarden", "Panic! At The Disco",
                "The Strokes", "The Cranberries", "My Chemical Romance", "Kings of Leon", "Foo Fighters",
                "The Cure", "R.E.M.", "Alter Bridge", "The Arctic Monkeys", "Bon Jovi",
                "The Chainsmokers", "Kings of Leon", "Thirty Seconds to Mars"
        );

        // Lista de los integrantes reales de algunas bandas con sus instrumentos
        List<List<String>> integrantesBandas = List.of(
                // The Beatles
                List.of("John Lennon (Voz, Guitarra)", "Paul McCartney (Bajo, Voz)", "George Harrison (Guitarra, Voz)", "Ringo Starr (Batería)"),
                // Queen
                List.of("Freddie Mercury (Voz)", "Brian May (Guitarra, Voz)", "John Deacon (Bajo)", "Roger Taylor (Batería, Voz)"),
                // The Rolling Stones
                List.of("Mick Jagger (Voz)", "Keith Richards (Guitarra)", "Charlie Watts (Batería)", "Ronnie Wood (Guitarra)"),
                // Led Zeppelin
                List.of("Robert Plant (Voz)", "Jimmy Page (Guitarra)", "John Paul Jones (Bajo, Teclados)", "John Bonham (Batería)"),
                // Pink Floyd
                List.of("Roger Waters (Bajo, Voz)", "David Gilmour (Guitarra, Voz)", "Nick Mason (Batería)", "Richard Wright (Teclados, Voz)"),
                // AC/DC
                List.of("Angus Young (Guitarra)", "Malcolm Young (Guitarra)", "Brian Johnson (Voz)", "Cliff Williams (Bajo)", "Phil Rudd (Batería)"),
                // The Doors
                List.of("Jim Morrison (Voz)", "Ray Manzarek (Teclados)", "Robby Krieger (Guitarra)", "John Densmore (Batería)"),
                // The Who
                List.of("Roger Daltrey (Voz)", "Pete Townshend (Guitarra)", "John Entwistle (Bajo)", "Keith Moon (Batería)"),
                // Nirvana
                List.of("Kurt Cobain (Voz, Guitarra)", "Krist Novoselic (Bajo)", "Dave Grohl (Batería)"),
                // Red Hot Chili Peppers
                List.of("Anthony Kiedis (Voz)", "Flea (Bajo)", "John Frusciante (Guitarra)", "Chad Smith (Batería)"),
                // Otros integran de forma similar para otras bandas...
                List.of("Integrante 1", "Integrante 2", "Integrante 3", "Integrante 4") // Rellenar para otras bandas
        );

        // Obtener los géneros de la colección "Generos"
        List<GeneroColeccion> listaGeneros = generoColeccion.find().into(new ArrayList<>());
        int totalGeneros = listaGeneros.size();

        // Iterar sobre las bandas para crear e insertar en la colección
        for (int i = 0; i < 45; i++) {
            String nombreBanda = nombresBandas.get(i);

            // Verificar si la banda ya existe
            if (artistaColeccion.find(Filters.eq("nombre", nombreBanda)).first() != null) {
                System.out.println("La banda " + nombreBanda + " ya existe.");
                continue;
            }

            ArtistaColeccion banda = new ArtistaColeccion();
            banda.setNombre(nombreBanda);
            GeneroColeccion generoBanda = listaGeneros.get(i % totalGeneros);
            List<GeneroColeccion> generosBanda = new ArrayList<>();
            generosBanda.add(generoBanda);

            // Crear la lista de integrantes con los nombres e instrumentos reales
            List<IntegranteDoc> integrantesBanda = new ArrayList<>();
            for (String integranteInfo : integrantesBandas.get(i)) {
                IntegranteDoc integrante = new IntegranteDoc();

                // El nombre del integrante y su instrumento están separados por paréntesis
                String[] partes = integranteInfo.split(" \\(");
                integrante.setNombre(partes[0]);
                integrante.setInstrumento(partes[1].replace(")", ""));
                integrante.setEsActivo(Boolean.TRUE);

                // Asignar una fecha de ingreso aleatoria
                int randomYear = 1980 + (int) (Math.random() * 40); // Año entre 1980 y 2020
                integrante.setFechaIngreso(LocalDate.of(randomYear, (int) (Math.random() * 12) + 1, 1));
                integrante.setFechaEgreso(null); // Banda activa, no tiene fecha de egreso

                // Agregar el integrante a la lista
                integrantesBanda.add(integrante);
            }

            banda.setGeneros(generosBanda);
            banda.setEsBanda(true);
            banda.setIntegrante(integrantesBanda);
            banda.setImagen("/resources/artistas/" + nombreBanda.replace(" ", "") + ".jpg");

            // Insertar la banda
            artistaColeccion.insertOne(banda);
            System.out.println("Insertada banda: " + nombreBanda);
        }

        System.out.println("¡Se han insertado 45 bandas!");
    }

    /**
     * Método de inserción de álbumes artistas
     */
    public void insertarAlbumesArtistas() {

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<AlbumColeccion> albumColeccion = database.getCollection("Albumes", AlbumColeccion.class);
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);

        // Artista: Michael Jackson
        ArtistaColeccion artista1 = new ArtistaColeccion();
        Bson filtro1 = Filters.eq("nombre", "Michael Jackson");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro1)) {
            artista1 = artista;
        }

        // Álbum 1: Thriller
        CancionDoc cancion1_1 = new CancionDoc();
        cancion1_1.setId(new ObjectId());
        cancion1_1.setNombre("Billie Jean");

        CancionDoc cancion1_2 = new CancionDoc();
        cancion1_2.setId(new ObjectId());
        cancion1_2.setNombre("Thriller");

        CancionDoc cancion1_3 = new CancionDoc();
        cancion1_3.setId(new ObjectId());
        cancion1_3.setNombre("Beat It");

        List<CancionDoc> canciones1 = new ArrayList<>();
        canciones1.add(cancion1_1);
        canciones1.add(cancion1_2);
        canciones1.add(cancion1_3);

        AlbumColeccion album1_1 = new AlbumColeccion();
        album1_1.setNombre("Thriller");
        album1_1.setImagen("albums/Thriller.jpg");
        album1_1.setFechaLanzamiento(LocalDate.of(1982, 11, 30));
        album1_1.setCanciones(canciones1);
        album1_1.setArtista(artista1);
        albumColeccion.insertOne(album1_1);

        // Álbum 2: Bad
        CancionDoc cancion2_1 = new CancionDoc();
        cancion2_1.setId(new ObjectId());
        cancion2_1.setNombre("Smooth Criminal");

        CancionDoc cancion2_2 = new CancionDoc();
        cancion2_2.setId(new ObjectId());
        cancion2_2.setNombre("Bad");

        CancionDoc cancion2_3 = new CancionDoc();
        cancion2_3.setId(new ObjectId());
        cancion2_3.setNombre("The Way You Make Me Feel");

        List<CancionDoc> canciones2 = new ArrayList<>();
        canciones2.add(cancion2_1);
        canciones2.add(cancion2_2);
        canciones2.add(cancion2_3);

        AlbumColeccion album1_2 = new AlbumColeccion();
        album1_2.setNombre("Bad");
        album1_2.setImagen("albums/Bad.jpg");
        album1_2.setFechaLanzamiento(LocalDate.of(1987, 8, 31));
        album1_2.setCanciones(canciones2);
        album1_2.setArtista(artista1);
        albumColeccion.insertOne(album1_2);

        // Artista2: The Weeknd
        ArtistaColeccion artista2 = new ArtistaColeccion();
        Bson filtro2 = Filters.eq("nombre", "The Weeknd");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro2)) {
            artista2 = artista;
        }

        // Álbum 1: After Hours
        CancionDoc cancion3_1 = new CancionDoc();
        cancion3_1.setId(new ObjectId());
        cancion3_1.setNombre("Blinding Lights");

        CancionDoc cancion3_2 = new CancionDoc();
        cancion3_2.setId(new ObjectId());
        cancion3_2.setNombre("Save Your Tears");

        CancionDoc cancion3_3 = new CancionDoc();
        cancion3_3.setId(new ObjectId());
        cancion3_3.setNombre("Heartless");

        List<CancionDoc> canciones3 = new ArrayList<>();
        canciones3.add(cancion3_1);
        canciones3.add(cancion3_2);
        canciones3.add(cancion3_3);

        AlbumColeccion album2_1 = new AlbumColeccion();
        album2_1.setNombre("After Hours");
        album2_1.setImagen("albums/AfterHours.jpg");
        album2_1.setFechaLanzamiento(LocalDate.of(2020, 3, 20));
        album2_1.setCanciones(canciones3);
        album2_1.setArtista(artista2);
        albumColeccion.insertOne(album2_1);

        // Álbum 2: Starboy
        CancionDoc cancion4_1 = new CancionDoc();
        cancion4_1.setId(new ObjectId());
        cancion4_1.setNombre("Starboy");

        CancionDoc cancion4_2 = new CancionDoc();
        cancion4_2.setId(new ObjectId());
        cancion4_2.setNombre("I Feel It Coming");

        CancionDoc cancion4_3 = new CancionDoc();
        cancion4_3.setId(new ObjectId());
        cancion4_3.setNombre("Party Monster");

        List<CancionDoc> canciones4 = new ArrayList<>();
        canciones4.add(cancion4_1);
        canciones4.add(cancion4_2);
        canciones4.add(cancion4_3);

        AlbumColeccion album2_2 = new AlbumColeccion();
        album2_2.setNombre("Starboy");
        album2_2.setImagen("albums/Starboy.jpg");
        album2_2.setFechaLanzamiento(LocalDate.of(2016, 11, 25));
        album2_2.setCanciones(canciones4);
        album2_2.setArtista(artista2);
        albumColeccion.insertOne(album2_2);

        // Artista3: Freddie Mercury
        ArtistaColeccion artista3 = new ArtistaColeccion();
        Bson filtro3 = Filters.eq("nombre", "Freddie Mercury");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro3)) {
            artista3 = artista;
        }

        // Álbum 1: Mr. Bad Guy
        CancionDoc cancion5_1 = new CancionDoc();
        cancion5_1.setId(new ObjectId());
        cancion5_1.setNombre("Living on My Own");

        CancionDoc cancion5_2 = new CancionDoc();
        cancion5_2.setId(new ObjectId());
        cancion5_2.setNombre("I Was Born to Love You");

        CancionDoc cancion5_3 = new CancionDoc();
        cancion5_3.setId(new ObjectId());
        cancion5_3.setNombre("Mr. Bad Guy");

        List<CancionDoc> canciones5 = new ArrayList<>();
        canciones5.add(cancion5_1);
        canciones5.add(cancion5_2);
        canciones5.add(cancion5_3);

        AlbumColeccion album3_1 = new AlbumColeccion();
        album3_1.setNombre("Mr. Bad Guy");
        album3_1.setImagen("albums/MrBadGuy.jpg");
        album3_1.setFechaLanzamiento(LocalDate.of(1985, 4, 16));
        album3_1.setCanciones(canciones5);
        album3_1.setArtista(artista3);
        albumColeccion.insertOne(album3_1);

        // Álbum 2: Barcelona
        CancionDoc cancion6_1 = new CancionDoc();
        cancion6_1.setId(new ObjectId());
        cancion6_1.setNombre("Barcelona");

        CancionDoc cancion6_2 = new CancionDoc();
        cancion6_2.setId(new ObjectId());
        cancion6_2.setNombre("How Can I Go On");

        CancionDoc cancion6_3 = new CancionDoc();
        cancion6_3.setId(new ObjectId());
        cancion6_3.setNombre("The Golden Boy");

        List<CancionDoc> canciones6 = new ArrayList<>();
        canciones6.add(cancion6_1);
        canciones6.add(cancion6_2);
        canciones6.add(cancion6_3);

        AlbumColeccion album3_2 = new AlbumColeccion();
        album3_2.setNombre("Barcelona");
        album3_2.setImagen("albums/Barcelona.jpg");
        album3_2.setFechaLanzamiento(LocalDate.of(1988, 11, 9));
        album3_2.setCanciones(canciones6);
        album3_2.setArtista(artista3);
        albumColeccion.insertOne(album3_2);

        // Artista4: Beyoncé
        ArtistaColeccion artista4 = new ArtistaColeccion();
        Bson filtro4 = Filters.eq("nombre", "Beyoncé");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro4)) {
            artista4 = artista;
        }

        // Álbum 1: Dangerously in Love
        CancionDoc cancion7_1 = new CancionDoc();
        cancion7_1.setId(new ObjectId());
        cancion7_1.setNombre("Crazy in Love");

        CancionDoc cancion7_2 = new CancionDoc();
        cancion7_2.setId(new ObjectId());
        cancion7_2.setNombre("Baby Boy");

        CancionDoc cancion7_3 = new CancionDoc();
        cancion7_3.setId(new ObjectId());
        cancion7_3.setNombre("Naughty Girl");

        List<CancionDoc> canciones7 = new ArrayList<>();
        canciones7.add(cancion7_1);
        canciones7.add(cancion7_2);
        canciones7.add(cancion7_3);

        AlbumColeccion album4_1 = new AlbumColeccion();
        album4_1.setNombre("Dangerously in Love");
        album4_1.setImagen("albums/DangerouslyInLove.jpg");
        album4_1.setFechaLanzamiento(LocalDate.of(2003, 6, 24));
        album4_1.setCanciones(canciones7);
        album4_1.setArtista(artista4);
        albumColeccion.insertOne(album4_1);

        // Álbum 2: Lemonade
        CancionDoc cancion8_1 = new CancionDoc();
        cancion8_1.setId(new ObjectId());
        cancion8_1.setNombre("Formation");

        CancionDoc cancion8_2 = new CancionDoc();
        cancion8_2.setId(new ObjectId());
        cancion8_2.setNombre("Sorry");

        CancionDoc cancion8_3 = new CancionDoc();
        cancion8_3.setId(new ObjectId());
        cancion8_3.setNombre("Hold Up");

        List<CancionDoc> canciones8 = new ArrayList<>();
        canciones8.add(cancion8_1);
        canciones8.add(cancion8_2);
        canciones8.add(cancion8_3);

        AlbumColeccion album4_2 = new AlbumColeccion();
        album4_2.setNombre("Lemonade");
        album4_2.setImagen("albums/Lemonade.jpg");
        album4_2.setFechaLanzamiento(LocalDate.of(2016, 4, 23));
        album4_2.setCanciones(canciones8);
        album4_2.setArtista(artista4);
        albumColeccion.insertOne(album4_2);

        // Artista5: Bob Marley
        ArtistaColeccion artista5 = new ArtistaColeccion();
        Bson filtro5 = Filters.eq("nombre", "Bob Marley");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro5)) {
            artista5 = artista;
        }

        // Álbum 1: Legend
        CancionDoc cancion9_1 = new CancionDoc();
        cancion9_1.setId(new ObjectId());
        cancion9_1.setNombre("No Woman, No Cry");

        CancionDoc cancion9_2 = new CancionDoc();
        cancion9_2.setId(new ObjectId());
        cancion9_2.setNombre("Buffalo Soldier");

        CancionDoc cancion9_3 = new CancionDoc();
        cancion9_3.setId(new ObjectId());
        cancion9_3.setNombre("Redemption Song");

        List<CancionDoc> canciones9 = new ArrayList<>();
        canciones9.add(cancion9_1);
        canciones9.add(cancion9_2);
        canciones9.add(cancion9_3);

        AlbumColeccion album5_1 = new AlbumColeccion();
        album5_1.setNombre("Legend");
        album5_1.setImagen("albums/Legend.jpg");
        album5_1.setFechaLanzamiento(LocalDate.of(1984, 5, 8));
        album5_1.setCanciones(canciones9);
        album5_1.setArtista(artista5);
        albumColeccion.insertOne(album5_1);

        // Álbum 2: Catch a Fire
        CancionDoc cancion10_1 = new CancionDoc();
        cancion10_1.setId(new ObjectId());
        cancion10_1.setNombre("Concrete Jungle");

        CancionDoc cancion10_2 = new CancionDoc();
        cancion10_2.setId(new ObjectId());
        cancion10_2.setNombre("Stir It Up");

        CancionDoc cancion10_3 = new CancionDoc();
        cancion10_3.setId(new ObjectId());
        cancion10_3.setNombre("Catch a Fire");

        List<CancionDoc> canciones10 = new ArrayList<>();
        canciones10.add(cancion10_1);
        canciones10.add(cancion10_2);
        canciones10.add(cancion10_3);

        AlbumColeccion album5_2 = new AlbumColeccion();
        album5_2.setNombre("Catch a Fire");
        album5_2.setImagen("albums/CatchAFire.jpg");
        album5_2.setFechaLanzamiento(LocalDate.of(1973, 4, 13));
        album5_2.setCanciones(canciones10);
        album5_2.setArtista(artista5);
        albumColeccion.insertOne(album5_2);

        // Artista6: Elvis Presley
        ArtistaColeccion artista6 = new ArtistaColeccion();
        Bson filtro6 = Filters.eq("nombre", "Elvis Presley");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro6)) {
            artista6 = artista;
        }

        // Álbum 1: Elvis Presley (Debut)
        CancionDoc cancion11_1 = new CancionDoc();
        cancion11_1.setId(new ObjectId());
        cancion11_1.setNombre("Blue Suede Shoes");

        CancionDoc cancion11_2 = new CancionDoc();
        cancion11_2.setId(new ObjectId());
        cancion11_2.setNombre("Heartbreak Hotel");

        CancionDoc cancion11_3 = new CancionDoc();
        cancion11_3.setId(new ObjectId());
        cancion11_3.setNombre("I Love You Because");

        List<CancionDoc> canciones11 = new ArrayList<>();
        canciones11.add(cancion11_1);
        canciones11.add(cancion11_2);
        canciones11.add(cancion11_3);

        AlbumColeccion album6_1 = new AlbumColeccion();
        album6_1.setNombre("Elvis Presley");
        album6_1.setImagen("albums/ElvisPresley.jpg");
        album6_1.setFechaLanzamiento(LocalDate.of(1956, 3, 23));
        album6_1.setCanciones(canciones11);
        album6_1.setArtista(artista6);
        albumColeccion.insertOne(album6_1);

        // Álbum 2: 30 #1 Hits
        CancionDoc cancion12_1 = new CancionDoc();
        cancion12_1.setId(new ObjectId());
        cancion12_1.setNombre("Suspicious Minds");

        CancionDoc cancion12_2 = new CancionDoc();
        cancion12_2.setId(new ObjectId());
        cancion12_2.setNombre("Can't Help Falling in Love");

        CancionDoc cancion12_3 = new CancionDoc();
        cancion12_3.setId(new ObjectId());
        cancion12_3.setNombre("Burning Love");

        List<CancionDoc> canciones12 = new ArrayList<>();
        canciones12.add(cancion12_1);
        canciones12.add(cancion12_2);
        canciones12.add(cancion12_3);

        AlbumColeccion album6_2 = new AlbumColeccion();
        album6_2.setNombre("30 #1 Hits");
        album6_2.setImagen("albums/30Number1Hits.jpg");
        album6_2.setFechaLanzamiento(LocalDate.of(2002, 9, 24));
        album6_2.setCanciones(canciones12);
        album6_2.setArtista(artista6);
        albumColeccion.insertOne(album6_2);

        // Artista7: Lady Gaga
        ArtistaColeccion artista7 = new ArtistaColeccion();
        Bson filtro7 = Filters.eq("nombre", "Lady Gaga");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro7)) {
            artista7 = artista;
        }

        // Álbum 1: The Fame
        CancionDoc cancion13_1 = new CancionDoc();
        cancion13_1.setId(new ObjectId());
        cancion13_1.setNombre("Just Dance");

        CancionDoc cancion13_2 = new CancionDoc();
        cancion13_2.setId(new ObjectId());
        cancion13_2.setNombre("Poker Face");

        CancionDoc cancion13_3 = new CancionDoc();
        cancion13_3.setId(new ObjectId());
        cancion13_3.setNombre("Lovegame");

        List<CancionDoc> canciones13 = new ArrayList<>();
        canciones13.add(cancion13_1);
        canciones13.add(cancion13_2);
        canciones13.add(cancion13_3);

        AlbumColeccion album7_1 = new AlbumColeccion();
        album7_1.setNombre("The Fame");
        album7_1.setImagen("albums/TheFame.jpg");
        album7_1.setFechaLanzamiento(LocalDate.of(2008, 8, 19));
        album7_1.setCanciones(canciones13);
        album7_1.setArtista(artista7);
        albumColeccion.insertOne(album7_1);

        // Álbum 2: Born This Way
        CancionDoc cancion14_1 = new CancionDoc();
        cancion14_1.setId(new ObjectId());
        cancion14_1.setNombre("Born This Way");

        CancionDoc cancion14_2 = new CancionDoc();
        cancion14_2.setId(new ObjectId());
        cancion14_2.setNombre("Judas");

        CancionDoc cancion14_3 = new CancionDoc();
        cancion14_3.setId(new ObjectId());
        cancion14_3.setNombre("Marry the Night");

        List<CancionDoc> canciones14 = new ArrayList<>();
        canciones14.add(cancion14_1);
        canciones14.add(cancion14_2);
        canciones14.add(cancion14_3);

        AlbumColeccion album7_2 = new AlbumColeccion();
        album7_2.setNombre("Born This Way");
        album7_2.setImagen("albums/BornThisWay.jpg");
        album7_2.setFechaLanzamiento(LocalDate.of(2011, 5, 23));
        album7_2.setCanciones(canciones14);
        album7_2.setArtista(artista7);
        albumColeccion.insertOne(album7_2);

        // Artista8: Madonna
        ArtistaColeccion artista8 = new ArtistaColeccion();
        Bson filtro8 = Filters.eq("nombre", "Madonna");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro8)) {
            artista8 = artista;
        }

        // Álbum 1: Like a Virgin
        CancionDoc cancion15_1 = new CancionDoc();
        cancion15_1.setId(new ObjectId());
        cancion15_1.setNombre("Like a Virgin");

        CancionDoc cancion15_2 = new CancionDoc();
        cancion15_2.setId(new ObjectId());
        cancion15_2.setNombre("Material Girl");

        CancionDoc cancion15_3 = new CancionDoc();
        cancion15_3.setId(new ObjectId());
        cancion15_3.setNombre("Dress You Up");

        List<CancionDoc> canciones15 = new ArrayList<>();
        canciones15.add(cancion15_1);
        canciones15.add(cancion15_2);
        canciones15.add(cancion15_3);

        AlbumColeccion album8_1 = new AlbumColeccion();
        album8_1.setNombre("Like a Virgin");
        album8_1.setImagen("albums/LikeAVirgin.jpg");
        album8_1.setFechaLanzamiento(LocalDate.of(1984, 11, 12));
        album8_1.setCanciones(canciones15);
        album8_1.setArtista(artista8);
        albumColeccion.insertOne(album8_1);

        // Álbum 2: True Blue
        CancionDoc cancion16_1 = new CancionDoc();
        cancion16_1.setId(new ObjectId());
        cancion16_1.setNombre("Papa Don't Preach");

        CancionDoc cancion16_2 = new CancionDoc();
        cancion16_2.setId(new ObjectId());
        cancion16_2.setNombre("Open Your Heart");

        CancionDoc cancion16_3 = new CancionDoc();
        cancion16_3.setId(new ObjectId());
        cancion16_3.setNombre("La Isla Bonita");

        List<CancionDoc> canciones16 = new ArrayList<>();
        canciones16.add(cancion16_1);
        canciones16.add(cancion16_2);
        canciones16.add(cancion16_3);

        AlbumColeccion album8_2 = new AlbumColeccion();
        album8_2.setNombre("True Blue");
        album8_2.setImagen("albums/TrueBlue.jpg");
        album8_2.setFechaLanzamiento(LocalDate.of(1986, 6, 30));
        album8_2.setCanciones(canciones16);
        album8_2.setArtista(artista8);
        albumColeccion.insertOne(album8_2);

        // Artista: Prince
        ArtistaColeccion artista9 = new ArtistaColeccion();
        Bson filtro9 = Filters.eq("nombre", "Prince");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro9)) {
            artista9 = artista;
        }

// Álbum 1: Purple Rain
        CancionDoc cancion17_1 = new CancionDoc();
        cancion17_1.setId(new ObjectId());
        cancion17_1.setNombre("Let's Go Crazy");

        CancionDoc cancion17_2 = new CancionDoc();
        cancion17_2.setId(new ObjectId());
        cancion17_2.setNombre("Purple Rain");

        CancionDoc cancion17_3 = new CancionDoc();
        cancion17_3.setId(new ObjectId());
        cancion17_3.setNombre("When Doves Cry");

        List<CancionDoc> canciones17 = new ArrayList<>();
        canciones17.add(cancion17_1);
        canciones17.add(cancion17_2);
        canciones17.add(cancion17_3);

        AlbumColeccion album9_1 = new AlbumColeccion();
        album9_1.setNombre("Purple Rain");
        album9_1.setImagen("albums/PurpleRain.jpg");
        album9_1.setFechaLanzamiento(LocalDate.of(1984, 6, 25));
        album9_1.setCanciones(canciones17);
        album9_1.setArtista(artista9);
        albumColeccion.insertOne(album9_1);

// Álbum 2: 1999
        CancionDoc cancion18_1 = new CancionDoc();
        cancion18_1.setId(new ObjectId());
        cancion18_1.setNombre("1999");

        CancionDoc cancion18_2 = new CancionDoc();
        cancion18_2.setId(new ObjectId());
        cancion18_2.setNombre("Little Red Corvette");

        CancionDoc cancion18_3 = new CancionDoc();
        cancion18_3.setId(new ObjectId());
        cancion18_3.setNombre("Delirious");

        List<CancionDoc> canciones18 = new ArrayList<>();
        canciones18.add(cancion18_1);
        canciones18.add(cancion18_2);
        canciones18.add(cancion18_3);

        AlbumColeccion album9_2 = new AlbumColeccion();
        album9_2.setNombre("1999");
        album9_2.setImagen("albums/1999.jpg");
        album9_2.setFechaLanzamiento(LocalDate.of(1982, 10, 27));
        album9_2.setCanciones(canciones18);
        album9_2.setArtista(artista9);
        albumColeccion.insertOne(album9_2);

// Artista: David Bowie
        ArtistaColeccion artista10 = new ArtistaColeccion();
        Bson filtro10 = Filters.eq("nombre", "David Bowie");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro10)) {
            artista10 = artista;
        }

// Álbum 1: The Rise and Fall of Ziggy Stardust and the Spiders from Mars
        CancionDoc cancion19_1 = new CancionDoc();
        cancion19_1.setId(new ObjectId());
        cancion19_1.setNombre("Starman");

        CancionDoc cancion19_2 = new CancionDoc();
        cancion19_2.setId(new ObjectId());
        cancion19_2.setNombre("Suffragette City");

        CancionDoc cancion19_3 = new CancionDoc();
        cancion19_3.setId(new ObjectId());
        cancion19_3.setNombre("Rock 'n' Roll Suicide");

        List<CancionDoc> canciones19 = new ArrayList<>();
        canciones19.add(cancion19_1);
        canciones19.add(cancion19_2);
        canciones19.add(cancion19_3);

        AlbumColeccion album10_1 = new AlbumColeccion();
        album10_1.setNombre("The Rise and Fall of Ziggy Stardust and the Spiders from Mars");
        album10_1.setImagen("albums/ZiggyStardust.jpg");
        album10_1.setFechaLanzamiento(LocalDate.of(1972, 6, 16));
        album10_1.setCanciones(canciones19);
        album10_1.setArtista(artista10);
        albumColeccion.insertOne(album10_1);

// Álbum 2: Heroes
        CancionDoc cancion20_1 = new CancionDoc();
        cancion20_1.setId(new ObjectId());
        cancion20_1.setNombre("Heroes");

        CancionDoc cancion20_2 = new CancionDoc();
        cancion20_2.setId(new ObjectId());
        cancion20_2.setNombre("Beauty and the Beast");

        CancionDoc cancion20_3 = new CancionDoc();
        cancion20_3.setId(new ObjectId());
        cancion20_3.setNombre("The Secret Life of Arabia");

        List<CancionDoc> canciones20 = new ArrayList<>();
        canciones20.add(cancion20_1);
        canciones20.add(cancion20_2);
        canciones20.add(cancion20_3);

        AlbumColeccion album10_2 = new AlbumColeccion();
        album10_2.setNombre("Heroes");
        album10_2.setImagen("albums/Heroes.jpg");
        album10_2.setFechaLanzamiento(LocalDate.of(1977, 10, 14));
        album10_2.setCanciones(canciones20);
        album10_2.setArtista(artista10);
        albumColeccion.insertOne(album10_2);

// Artista: Aretha Franklin
        ArtistaColeccion artista11 = new ArtistaColeccion();
        Bson filtro11 = Filters.eq("nombre", "Aretha Franklin");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro11)) {
            artista11 = artista;
        }

// Álbum 1: I Never Loved a Man the Way I Love You
        CancionDoc cancion21_1 = new CancionDoc();
        cancion21_1.setId(new ObjectId());
        cancion21_1.setNombre("Respect");

        CancionDoc cancion21_2 = new CancionDoc();
        cancion21_2.setId(new ObjectId());
        cancion21_2.setNombre("Drown in My Own Tears");

        CancionDoc cancion21_3 = new CancionDoc();
        cancion21_3.setId(new ObjectId());
        cancion21_3.setNombre("I Never Loved a Man (The Way I Love You)");

        List<CancionDoc> canciones21 = new ArrayList<>();
        canciones21.add(cancion21_1);
        canciones21.add(cancion21_2);
        canciones21.add(cancion21_3);

        AlbumColeccion album11_1 = new AlbumColeccion();
        album11_1.setNombre("I Never Loved a Man the Way I Love You");
        album11_1.setImagen("albums/INeverLovedAman.jpg");
        album11_1.setFechaLanzamiento(LocalDate.of(1967, 3, 10));
        album11_1.setCanciones(canciones21);
        album11_1.setArtista(artista11);
        albumColeccion.insertOne(album11_1);

// Álbum 2: Amazing Grace
        CancionDoc cancion22_1 = new CancionDoc();
        cancion22_1.setId(new ObjectId());
        cancion22_1.setNombre("Amazing Grace");

        CancionDoc cancion22_2 = new CancionDoc();
        cancion22_2.setId(new ObjectId());
        cancion22_2.setNombre("How I Got Over");

        CancionDoc cancion22_3 = new CancionDoc();
        cancion22_3.setId(new ObjectId());
        cancion22_3.setNombre("Precious Lord, Take My Hand");

        List<CancionDoc> canciones22 = new ArrayList<>();
        canciones22.add(cancion22_1);
        canciones22.add(cancion22_2);
        canciones22.add(cancion22_3);

        AlbumColeccion album11_2 = new AlbumColeccion();
        album11_2.setNombre("Amazing Grace");
        album11_2.setImagen("albums/AmazingGrace.jpg");
        album11_2.setFechaLanzamiento(LocalDate.of(1972, 6, 1));
        album11_2.setCanciones(canciones22);
        album11_2.setArtista(artista11);
        albumColeccion.insertOne(album11_2);

// Artista: John Lennon
        ArtistaColeccion artista12 = new ArtistaColeccion();
        Bson filtro12 = Filters.eq("nombre", "John Lennon");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro12)) {
            artista12 = artista;
        }

// Álbum 1: Imagine
        CancionDoc cancion23_1 = new CancionDoc();
        cancion23_1.setId(new ObjectId());
        cancion23_1.setNombre("Imagine");

        CancionDoc cancion23_2 = new CancionDoc();
        cancion23_2.setId(new ObjectId());
        cancion23_2.setNombre("Crippled Inside");

        CancionDoc cancion23_3 = new CancionDoc();
        cancion23_3.setId(new ObjectId());
        cancion23_3.setNombre("Jealous Guy");

        List<CancionDoc> canciones23 = new ArrayList<>();
        canciones23.add(cancion23_1);
        canciones23.add(cancion23_2);
        canciones23.add(cancion23_3);

        AlbumColeccion album12_1 = new AlbumColeccion();
        album12_1.setNombre("Imagine");
        album12_1.setImagen("albums/Imagine.jpg");
        album12_1.setFechaLanzamiento(LocalDate.of(1971, 9, 9));
        album12_1.setCanciones(canciones23);
        album12_1.setArtista(artista12);
        albumColeccion.insertOne(album12_1);

// Álbum 2: Double Fantasy
        CancionDoc cancion24_1 = new CancionDoc();
        cancion24_1.setId(new ObjectId());
        cancion24_1.setNombre("Starting Over");

        CancionDoc cancion24_2 = new CancionDoc();
        cancion24_2.setId(new ObjectId());
        cancion24_2.setNombre("Woman");

        CancionDoc cancion24_3 = new CancionDoc();
        cancion24_3.setId(new ObjectId());
        cancion24_3.setNombre("I'm Losing You");

        List<CancionDoc> canciones24 = new ArrayList<>();
        canciones24.add(cancion24_1);
        canciones24.add(cancion24_2);
        canciones24.add(cancion24_3);

        AlbumColeccion album12_2 = new AlbumColeccion();
        album12_2.setNombre("Double Fantasy");
        album12_2.setImagen("albums/DoubleFantasy.jpg");
        album12_2.setFechaLanzamiento(LocalDate.of(1980, 11, 17));
        album12_2.setCanciones(canciones24);
        album12_2.setArtista(artista12);
        albumColeccion.insertOne(album12_2);

// Artista: Adele
        ArtistaColeccion artista13 = new ArtistaColeccion();
        Bson filtro13 = Filters.eq("nombre", "Adele");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro13)) {
            artista13 = artista;
        }

// Álbum 1: 21
        CancionDoc cancion25_1 = new CancionDoc();
        cancion25_1.setId(new ObjectId());
        cancion25_1.setNombre("Rolling in the Deep");

        CancionDoc cancion25_2 = new CancionDoc();
        cancion25_2.setId(new ObjectId());
        cancion25_2.setNombre("Someone Like You");

        CancionDoc cancion25_3 = new CancionDoc();
        cancion25_3.setId(new ObjectId());
        cancion25_3.setNombre("Set Fire to the Rain");

        List<CancionDoc> canciones25 = new ArrayList<>();
        canciones25.add(cancion25_1);
        canciones25.add(cancion25_2);
        canciones25.add(cancion25_3);

        AlbumColeccion album13_1 = new AlbumColeccion();
        album13_1.setNombre("21");
        album13_1.setImagen("albums/21.jpg");
        album13_1.setFechaLanzamiento(LocalDate.of(2011, 1, 24));
        album13_1.setCanciones(canciones25);
        album13_1.setArtista(artista13);
        albumColeccion.insertOne(album13_1);

// Álbum 2: 25
        CancionDoc cancion26_1 = new CancionDoc();
        cancion26_1.setId(new ObjectId());
        cancion26_1.setNombre("Hello");

        CancionDoc cancion26_2 = new CancionDoc();
        cancion26_2.setId(new ObjectId());
        cancion26_2.setNombre("Send My Love (To Your New Lover)");

        CancionDoc cancion26_3 = new CancionDoc();
        cancion26_3.setId(new ObjectId());
        cancion26_3.setNombre("When We Were Young");

        List<CancionDoc> canciones26 = new ArrayList<>();
        canciones26.add(cancion26_1);
        canciones26.add(cancion26_2);
        canciones26.add(cancion26_3);

        AlbumColeccion album13_2 = new AlbumColeccion();
        album13_2.setNombre("25");
        album13_2.setImagen("albums/25.jpg");
        album13_2.setFechaLanzamiento(LocalDate.of(2015, 11, 20));
        album13_2.setCanciones(canciones26);
        album13_2.setArtista(artista13);
        albumColeccion.insertOne(album13_2);

// Artista: Stevie Wonder
        ArtistaColeccion artista14 = new ArtistaColeccion();
        Bson filtro14 = Filters.eq("nombre", "Stevie Wonder");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro14)) {
            artista14 = artista;
        }

// Álbum 1: Songs in the Key of Life
        CancionDoc cancion27_1 = new CancionDoc();
        cancion27_1.setId(new ObjectId());
        cancion27_1.setNombre("Sir Duke");

        CancionDoc cancion27_2 = new CancionDoc();
        cancion27_2.setId(new ObjectId());
        cancion27_2.setNombre("Isn't She Lovely");

        CancionDoc cancion27_3 = new CancionDoc();
        cancion27_3.setId(new ObjectId());
        cancion27_3.setNombre("Pastime Paradise");

        List<CancionDoc> canciones27 = new ArrayList<>();
        canciones27.add(cancion27_1);
        canciones27.add(cancion27_2);
        canciones27.add(cancion27_3);

        AlbumColeccion album14_1 = new AlbumColeccion();
        album14_1.setNombre("Songs in the Key of Life");
        album14_1.setImagen("albums/SongsInTheKeyOfLife.jpg");
        album14_1.setFechaLanzamiento(LocalDate.of(1976, 9, 28));
        album14_1.setCanciones(canciones27);
        album14_1.setArtista(artista14);
        albumColeccion.insertOne(album14_1);

// Álbum 2: Innervisions
        CancionDoc cancion28_1 = new CancionDoc();
        cancion28_1.setId(new ObjectId());
        cancion28_1.setNombre("Higher Ground");

        CancionDoc cancion28_2 = new CancionDoc();
        cancion28_2.setId(new ObjectId());
        cancion28_2.setNombre("Living for the City");

        CancionDoc cancion28_3 = new CancionDoc();
        cancion28_3.setId(new ObjectId());
        cancion28_3.setNombre("Don't You Worry 'Bout a Thing");

        List<CancionDoc> canciones28 = new ArrayList<>();
        canciones28.add(cancion28_1);
        canciones28.add(cancion28_2);
        canciones28.add(cancion28_3);

        AlbumColeccion album14_2 = new AlbumColeccion();
        album14_2.setNombre("Innervisions");
        album14_2.setImagen("albums/Innervisions.jpg");
        album14_2.setFechaLanzamiento(LocalDate.of(1973, 8, 3));
        album14_2.setCanciones(canciones28);
        album14_2.setArtista(artista14);
        albumColeccion.insertOne(album14_2);

        // Artista: Amy Winehouse
        ArtistaColeccion artista15 = new ArtistaColeccion();
        Bson filtro15 = Filters.eq("nombre", "Amy Winehouse");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro15)) {
            artista15 = artista;
        }

// Álbum 1: Back to Black
        CancionDoc cancion29_1 = new CancionDoc();
        cancion29_1.setId(new ObjectId());
        cancion29_1.setNombre("Rehab");

        CancionDoc cancion29_2 = new CancionDoc();
        cancion29_2.setId(new ObjectId());
        cancion29_2.setNombre("You Know I'm No Good");

        CancionDoc cancion29_3 = new CancionDoc();
        cancion29_3.setId(new ObjectId());
        cancion29_3.setNombre("Back to Black");

        List<CancionDoc> canciones29 = new ArrayList<>();
        canciones29.add(cancion29_1);
        canciones29.add(cancion29_2);
        canciones29.add(cancion29_3);

        AlbumColeccion album15_1 = new AlbumColeccion();
        album15_1.setNombre("Back to Black");
        album15_1.setImagen("albums/BackToBlack.jpg");
        album15_1.setFechaLanzamiento(LocalDate.of(2006, 10, 27));
        album15_1.setCanciones(canciones29);
        album15_1.setArtista(artista15);
        albumColeccion.insertOne(album15_1);

// Álbum 2: Frank
        CancionDoc cancion30_1 = new CancionDoc();
        cancion30_1.setId(new ObjectId());
        cancion30_1.setNombre("Stronger Than Me");

        CancionDoc cancion30_2 = new CancionDoc();
        cancion30_2.setId(new ObjectId());
        cancion30_2.setNombre("Take the Box");

        CancionDoc cancion30_3 = new CancionDoc();
        cancion30_3.setId(new ObjectId());
        cancion30_3.setNombre("In My Bed");

        List<CancionDoc> canciones30 = new ArrayList<>();
        canciones30.add(cancion30_1);
        canciones30.add(cancion30_2);
        canciones30.add(cancion30_3);

        AlbumColeccion album15_2 = new AlbumColeccion();
        album15_2.setNombre("Frank");
        album15_2.setImagen("albums/Frank.jpg");
        album15_2.setFechaLanzamiento(LocalDate.of(2003, 10, 20));
        album15_2.setCanciones(canciones30);
        album15_2.setArtista(artista15);
        albumColeccion.insertOne(album15_2);

// Artista: Paul McCartney
        ArtistaColeccion artista16 = new ArtistaColeccion();
        Bson filtro16 = Filters.eq("nombre", "Paul McCartney");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro16)) {
            artista16 = artista;
        }

// Álbum 1: Band on the Run
        CancionDoc cancion31_1 = new CancionDoc();
        cancion31_1.setId(new ObjectId());
        cancion31_1.setNombre("Band on the Run");

        CancionDoc cancion31_2 = new CancionDoc();
        cancion31_2.setId(new ObjectId());
        cancion31_2.setNombre("Jet");

        CancionDoc cancion31_3 = new CancionDoc();
        cancion31_3.setId(new ObjectId());
        cancion31_3.setNombre("Bluebird");

        List<CancionDoc> canciones31 = new ArrayList<>();
        canciones31.add(cancion31_1);
        canciones31.add(cancion31_2);
        canciones31.add(cancion31_3);

        AlbumColeccion album16_1 = new AlbumColeccion();
        album16_1.setNombre("Band on the Run");
        album16_1.setImagen("albums/BandOnTheRun.jpg");
        album16_1.setFechaLanzamiento(LocalDate.of(1973, 12, 7));
        album16_1.setCanciones(canciones31);
        album16_1.setArtista(artista16);
        albumColeccion.insertOne(album16_1);

// Álbum 2: McCartney
        CancionDoc cancion32_1 = new CancionDoc();
        cancion32_1.setId(new ObjectId());
        cancion32_1.setNombre("Maybe I'm Amazed");

        CancionDoc cancion32_2 = new CancionDoc();
        cancion32_2.setId(new ObjectId());
        cancion32_2.setNombre("Every Night");

        CancionDoc cancion32_3 = new CancionDoc();
        cancion32_3.setId(new ObjectId());
        cancion32_3.setNombre("Junk");

        List<CancionDoc> canciones32 = new ArrayList<>();
        canciones32.add(cancion32_1);
        canciones32.add(cancion32_2);
        canciones32.add(cancion32_3);

        AlbumColeccion album16_2 = new AlbumColeccion();
        album16_2.setNombre("McCartney");
        album16_2.setImagen("albums/McCartney.jpg");
        album16_2.setFechaLanzamiento(LocalDate.of(1970, 4, 17));
        album16_2.setCanciones(canciones32);
        album16_2.setArtista(artista16);
        albumColeccion.insertOne(album16_2);

// Artista: Bruce Springsteen
        ArtistaColeccion artista17 = new ArtistaColeccion();
        Bson filtro17 = Filters.eq("nombre", "Bruce Springsteen");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro17)) {
            artista17 = artista;
        }

// Álbum 1: Born to Run
        CancionDoc cancion33_1 = new CancionDoc();
        cancion33_1.setId(new ObjectId());
        cancion33_1.setNombre("Born to Run");

        CancionDoc cancion33_2 = new CancionDoc();
        cancion33_2.setId(new ObjectId());
        cancion33_2.setNombre("Tenth Avenue Freeze-Out");

        CancionDoc cancion33_3 = new CancionDoc();
        cancion33_3.setId(new ObjectId());
        cancion33_3.setNombre("Jungleland");

        List<CancionDoc> canciones33 = new ArrayList<>();
        canciones33.add(cancion33_1);
        canciones33.add(cancion33_2);
        canciones33.add(cancion33_3);

        AlbumColeccion album17_1 = new AlbumColeccion();
        album17_1.setNombre("Born to Run");
        album17_1.setImagen("albums/BornToRun.jpg");
        album17_1.setFechaLanzamiento(LocalDate.of(1975, 8, 25));
        album17_1.setCanciones(canciones33);
        album17_1.setArtista(artista17);
        albumColeccion.insertOne(album17_1);

// Álbum 2: The River
        CancionDoc cancion34_1 = new CancionDoc();
        cancion34_1.setId(new ObjectId());
        cancion34_1.setNombre("The River");

        CancionDoc cancion34_2 = new CancionDoc();
        cancion34_2.setId(new ObjectId());
        cancion34_2.setNombre("Hungry Heart");

        CancionDoc cancion34_3 = new CancionDoc();
        cancion34_3.setId(new ObjectId());
        cancion34_3.setNombre("Sherry Darling");

        List<CancionDoc> canciones34 = new ArrayList<>();
        canciones34.add(cancion34_1);
        canciones34.add(cancion34_2);
        canciones34.add(cancion34_3);

        AlbumColeccion album17_2 = new AlbumColeccion();
        album17_2.setNombre("The River");
        album17_2.setImagen("albums/TheRiver.jpg");
        album17_2.setFechaLanzamiento(LocalDate.of(1980, 10, 17));
        album17_2.setCanciones(canciones34);
        album17_2.setArtista(artista17);
        albumColeccion.insertOne(album17_2);

// Artista: Jimi Hendrix
        ArtistaColeccion artista18 = new ArtistaColeccion();
        Bson filtro18 = Filters.eq("nombre", "Jimi Hendrix");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro18)) {
            artista18 = artista;
        }

// Álbum 1: Are You Experienced
        CancionDoc cancion35_1 = new CancionDoc();
        cancion35_1.setId(new ObjectId());
        cancion35_1.setNombre("Purple Haze");

        CancionDoc cancion35_2 = new CancionDoc();
        cancion35_2.setId(new ObjectId());
        cancion35_2.setNombre("Hey Joe");

        CancionDoc cancion35_3 = new CancionDoc();
        cancion35_3.setId(new ObjectId());
        cancion35_3.setNombre("The Wind Cries Mary");

        List<CancionDoc> canciones35 = new ArrayList<>();
        canciones35.add(cancion35_1);
        canciones35.add(cancion35_2);
        canciones35.add(cancion35_3);

        AlbumColeccion album18_1 = new AlbumColeccion();
        album18_1.setNombre("Are You Experienced");
        album18_1.setImagen("albums/AreYouExperienced.jpg");
        album18_1.setFechaLanzamiento(LocalDate.of(1967, 5, 12));
        album18_1.setCanciones(canciones35);
        album18_1.setArtista(artista18);
        albumColeccion.insertOne(album18_1);

// Álbum 2: Electric Ladyland
        CancionDoc cancion36_1 = new CancionDoc();
        cancion36_1.setId(new ObjectId());
        cancion36_1.setNombre("Voodoo Child (Slight Return)");

        CancionDoc cancion36_2 = new CancionDoc();
        cancion36_2.setId(new ObjectId());
        cancion36_2.setNombre("All Along the Watchtower");

        CancionDoc cancion36_3 = new CancionDoc();
        cancion36_3.setId(new ObjectId());
        cancion36_3.setNombre("Crosstown Traffic");

        List<CancionDoc> canciones36 = new ArrayList<>();
        canciones36.add(cancion36_1);
        canciones36.add(cancion36_2);
        canciones36.add(cancion36_3);

        AlbumColeccion album18_2 = new AlbumColeccion();
        album18_2.setNombre("Electric Ladyland");
        album18_2.setImagen("albums/ElectricLadyland.jpg");
        album18_2.setFechaLanzamiento(LocalDate.of(1968, 10, 25));
        album18_2.setCanciones(canciones36);
        album18_2.setArtista(artista18);
        albumColeccion.insertOne(album18_2);

// Artista: Whitney Houston
        ArtistaColeccion artista19 = new ArtistaColeccion();
        Bson filtro19 = Filters.eq("nombre", "Whitney Houston");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro19)) {
            artista19 = artista;
        }

// Álbum 1: Whitney Houston
        CancionDoc cancion37_1 = new CancionDoc();
        cancion37_1.setId(new ObjectId());
        cancion37_1.setNombre("I Will Always Love You");

        CancionDoc cancion37_2 = new CancionDoc();
        cancion37_2.setId(new ObjectId());
        cancion37_2.setNombre("Saving All My Love for You");

        CancionDoc cancion37_3 = new CancionDoc();
        cancion37_3.setId(new ObjectId());
        cancion37_3.setNombre("How Will I Know");

        List<CancionDoc> canciones37 = new ArrayList<>();
        canciones37.add(cancion37_1);
        canciones37.add(cancion37_2);
        canciones37.add(cancion37_3);

        AlbumColeccion album19_1 = new AlbumColeccion();
        album19_1.setNombre("Whitney Houston");
        album19_1.setImagen("albums/WhitneyHouston.jpg");
        album19_1.setFechaLanzamiento(LocalDate.of(1985, 2, 14));
        album19_1.setCanciones(canciones37);
        album19_1.setArtista(artista19);
        albumColeccion.insertOne(album19_1);

// Álbum 2: The Bodyguard: Original Soundtrack Album
        CancionDoc cancion38_1 = new CancionDoc();
        cancion38_1.setId(new ObjectId());
        cancion38_1.setNombre("I Will Always Love You");

        CancionDoc cancion38_2 = new CancionDoc();
        cancion38_2.setId(new ObjectId());
        cancion38_2.setNombre("I'm Every Woman");

        CancionDoc cancion38_3 = new CancionDoc();
        cancion38_3.setId(new ObjectId());
        cancion38_3.setNombre("Run to You");

        List<CancionDoc> canciones38 = new ArrayList<>();
        canciones38.add(cancion38_1);
        canciones38.add(cancion38_2);
        canciones38.add(cancion38_3);

        AlbumColeccion album19_2 = new AlbumColeccion();
        album19_2.setNombre("The Bodyguard: Original Soundtrack Album");
        album19_2.setImagen("albums/TheBodyguard.jpg");
        album19_2.setFechaLanzamiento(LocalDate.of(1992, 11, 17));
        album19_2.setCanciones(canciones38);
        album19_2.setArtista(artista19);
        albumColeccion.insertOne(album19_2);

// Artista: Rihanna
        ArtistaColeccion artista20 = new ArtistaColeccion();
        Bson filtro20 = Filters.eq("nombre", "Rihanna");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro20)) {
            artista20 = artista;
        }

// Álbum 1: Good Girl Gone Bad
        CancionDoc cancion39_1 = new CancionDoc();
        cancion39_1.setId(new ObjectId());
        cancion39_1.setNombre("Umbrella");

        CancionDoc cancion39_2 = new CancionDoc();
        cancion39_2.setId(new ObjectId());
        cancion39_2.setNombre("Shut Up and Drive");

        CancionDoc cancion39_3 = new CancionDoc();
        cancion39_3.setId(new ObjectId());
        cancion39_3.setNombre("Don't Stop the Music");

        List<CancionDoc> canciones39 = new ArrayList<>();
        canciones39.add(cancion39_1);
        canciones39.add(cancion39_2);
        canciones39.add(cancion39_3);

        AlbumColeccion album20_1 = new AlbumColeccion();
        album20_1.setNombre("Good Girl Gone Bad");
        album20_1.setImagen("albums/GoodGirlGoneBad.jpg");
        album20_1.setFechaLanzamiento(LocalDate.of(2007, 5, 31));
        album20_1.setCanciones(canciones39);
        album20_1.setArtista(artista20);
        albumColeccion.insertOne(album20_1);

// Álbum 2: Anti
        CancionDoc cancion40_1 = new CancionDoc();
        cancion40_1.setId(new ObjectId());
        cancion40_1.setNombre("Work");

        CancionDoc cancion40_2 = new CancionDoc();
        cancion40_2.setId(new ObjectId());
        cancion40_2.setNombre("Love on the Brain");

        CancionDoc cancion40_3 = new CancionDoc();
        cancion40_3.setId(new ObjectId());
        cancion40_3.setNombre("Kiss It Better");

        List<CancionDoc> canciones40 = new ArrayList<>();
        canciones40.add(cancion40_1);
        canciones40.add(cancion40_2);
        canciones40.add(cancion40_3);

        AlbumColeccion album20_2 = new AlbumColeccion();
        album20_2.setNombre("Anti");
        album20_2.setImagen("albums/Anti.jpg");
        album20_2.setFechaLanzamiento(LocalDate.of(2016, 1, 28));
        album20_2.setCanciones(canciones40);
        album20_2.setArtista(artista20);
        albumColeccion.insertOne(album20_2);

// Artista: Kurt Cobain
        ArtistaColeccion artista21 = new ArtistaColeccion();
        Bson filtro21 = Filters.eq("nombre", "Kurt Cobain");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro21)) {
            artista21 = artista;
        }

// Álbum 1: Nirvana (MTV Unplugged in New York)
        CancionDoc cancion41_1 = new CancionDoc();
        cancion41_1.setId(new ObjectId());
        cancion41_1.setNombre("About a Girl");

        CancionDoc cancion41_2 = new CancionDoc();
        cancion41_2.setId(new ObjectId());
        cancion41_2.setNombre("Come as You Are");

        CancionDoc cancion41_3 = new CancionDoc();
        cancion41_3.setId(new ObjectId());
        cancion41_3.setNombre("The Man Who Sold the World");

        List<CancionDoc> canciones41 = new ArrayList<>();
        canciones41.add(cancion41_1);
        canciones41.add(cancion41_2);
        canciones41.add(cancion41_3);

        AlbumColeccion album21_1 = new AlbumColeccion();
        album21_1.setNombre("MTV Unplugged in New York");
        album21_1.setImagen("albums/MTVUnplugged.jpg");
        album21_1.setFechaLanzamiento(LocalDate.of(1994, 11, 1));
        album21_1.setCanciones(canciones41);
        album21_1.setArtista(artista21);
        albumColeccion.insertOne(album21_1);

// Álbum 2: In Utero
        CancionDoc cancion42_1 = new CancionDoc();
        cancion42_1.setId(new ObjectId());
        cancion42_1.setNombre("Heart-Shaped Box");

        CancionDoc cancion42_2 = new CancionDoc();
        cancion42_2.setId(new ObjectId());
        cancion42_2.setNombre("Rape Me");

        CancionDoc cancion42_3 = new CancionDoc();
        cancion42_3.setId(new ObjectId());
        cancion42_3.setNombre("All Apologies");

        List<CancionDoc> canciones42 = new ArrayList<>();
        canciones42.add(cancion42_1);
        canciones42.add(cancion42_2);
        canciones42.add(cancion42_3);

        AlbumColeccion album21_2 = new AlbumColeccion();
        album21_2.setNombre("In Utero");
        album21_2.setImagen("albums/InUtero.jpg");
        album21_2.setFechaLanzamiento(LocalDate.of(1993, 9, 21));
        album21_2.setCanciones(canciones42);
        album21_2.setArtista(artista21);
        albumColeccion.insertOne(album21_2);

// Artista: Tina Turner
        ArtistaColeccion artista22 = new ArtistaColeccion();
        Bson filtro22 = Filters.eq("nombre", "Tina Turner");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro22)) {
            artista22 = artista;
        }

// Álbum 1: Private Dancer
        CancionDoc cancion43_1 = new CancionDoc();
        cancion43_1.setId(new ObjectId());
        cancion43_1.setNombre("What's Love Got to Do with It");

        CancionDoc cancion43_2 = new CancionDoc();
        cancion43_2.setId(new ObjectId());
        cancion43_2.setNombre("Private Dancer");

        CancionDoc cancion43_3 = new CancionDoc();
        cancion43_3.setId(new ObjectId());
        cancion43_3.setNombre("Let's Stay Together");

        List<CancionDoc> canciones43 = new ArrayList<>();
        canciones43.add(cancion43_1);
        canciones43.add(cancion43_2);
        canciones43.add(cancion43_3);

        AlbumColeccion album22_1 = new AlbumColeccion();
        album22_1.setNombre("Private Dancer");
        album22_1.setImagen("albums/PrivateDancer.jpg");
        album22_1.setFechaLanzamiento(LocalDate.of(1984, 5, 29));
        album22_1.setCanciones(canciones43);
        album22_1.setArtista(artista22);
        albumColeccion.insertOne(album22_1);

// Álbum 2: Simply the Best
        CancionDoc cancion44_1 = new CancionDoc();
        cancion44_1.setId(new ObjectId());
        cancion44_1.setNombre("The Best");

        CancionDoc cancion44_2 = new CancionDoc();
        cancion44_2.setId(new ObjectId());
        cancion44_2.setNombre("Proud Mary");

        CancionDoc cancion44_3 = new CancionDoc();
        cancion44_3.setId(new ObjectId());
        cancion44_3.setNombre("What's Love Got to Do with It");

        List<CancionDoc> canciones44 = new ArrayList<>();
        canciones44.add(cancion44_1);
        canciones44.add(cancion44_2);
        canciones44.add(cancion44_3);

        AlbumColeccion album22_2 = new AlbumColeccion();
        album22_2.setNombre("Simply the Best");
        album22_2.setImagen("albums/SimplyTheBest.jpg");
        album22_2.setFechaLanzamiento(LocalDate.of(1991, 10, 15));
        album22_2.setCanciones(canciones44);
        album22_2.setArtista(artista22);
        albumColeccion.insertOne(album22_2);

// Artista: James Brown
        ArtistaColeccion artista23 = new ArtistaColeccion();
        Bson filtro23 = Filters.eq("nombre", "James Brown");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro23)) {
            artista23 = artista;
        }

// Álbum 1: Live at the Apollo
        CancionDoc cancion45_1 = new CancionDoc();
        cancion45_1.setId(new ObjectId());
        cancion45_1.setNombre("I Got You (I Feel Good)");

        CancionDoc cancion45_2 = new CancionDoc();
        cancion45_2.setId(new ObjectId());
        cancion45_2.setNombre("Try Me");

        CancionDoc cancion45_3 = new CancionDoc();
        cancion45_3.setId(new ObjectId());
        cancion45_3.setNombre("Lost Someone");

        List<CancionDoc> canciones45 = new ArrayList<>();
        canciones45.add(cancion45_1);
        canciones45.add(cancion45_2);
        canciones45.add(cancion45_3);

        AlbumColeccion album23_1 = new AlbumColeccion();
        album23_1.setNombre("Live at the Apollo");
        album23_1.setImagen("albums/LiveAtTheApollo.jpg");
        album23_1.setFechaLanzamiento(LocalDate.of(1963, 10, 27));
        album23_1.setCanciones(canciones45);
        album23_1.setArtista(artista23);
        albumColeccion.insertOne(album23_1);

// Álbum 2: The Payback
        CancionDoc cancion46_1 = new CancionDoc();
        cancion46_1.setId(new ObjectId());
        cancion46_1.setNombre("The Payback");

        CancionDoc cancion46_2 = new CancionDoc();
        cancion46_2.setId(new ObjectId());
        cancion46_2.setNombre("Doing It to Death");

        CancionDoc cancion46_3 = new CancionDoc();
        cancion46_3.setId(new ObjectId());
        cancion46_3.setNombre("Take Some Leave Some");

        List<CancionDoc> canciones46 = new ArrayList<>();
        canciones46.add(cancion46_1);
        canciones46.add(cancion46_2);
        canciones46.add(cancion46_3);

        AlbumColeccion album23_2 = new AlbumColeccion();
        album23_2.setNombre("The Payback");
        album23_2.setImagen("albums/ThePayback.jpg");
        album23_2.setFechaLanzamiento(LocalDate.of(1973, 4, 6));
        album23_2.setCanciones(canciones46);
        album23_2.setArtista(artista23);
        albumColeccion.insertOne(album23_2);

// Artista: Johnny Cash
        ArtistaColeccion artista24 = new ArtistaColeccion();
        Bson filtro24 = Filters.eq("nombre", "Johnny Cash");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro24)) {
            artista24 = artista;
        }

// Álbum 1: At Folsom Prison
        CancionDoc cancion47_1 = new CancionDoc();
        cancion47_1.setId(new ObjectId());
        cancion47_1.setNombre("Folsom Prison Blues");

        CancionDoc cancion47_2 = new CancionDoc();
        cancion47_2.setId(new ObjectId());
        cancion47_2.setNombre("I Still Miss Someone");

        CancionDoc cancion47_3 = new CancionDoc();
        cancion47_3.setId(new ObjectId());
        cancion47_3.setNombre("Cocaine Blues");

        List<CancionDoc> canciones47 = new ArrayList<>();
        canciones47.add(cancion47_1);
        canciones47.add(cancion47_2);
        canciones47.add(cancion47_3);

        AlbumColeccion album24_1 = new AlbumColeccion();
        album24_1.setNombre("At Folsom Prison");
        album24_1.setImagen("albums/AtFolsomPrison.jpg");
        album24_1.setFechaLanzamiento(LocalDate.of(1968, 5, 6));
        album24_1.setCanciones(canciones47);
        album24_1.setArtista(artista24);
        albumColeccion.insertOne(album24_1);

// Álbum 2: Johnny Cash at San Quentin
        CancionDoc cancion48_1 = new CancionDoc();
        cancion48_1.setId(new ObjectId());
        cancion48_1.setNombre("Wanted Man");

        CancionDoc cancion48_2 = new CancionDoc();
        cancion48_2.setId(new ObjectId());
        cancion48_2.setNombre("San Quentin");

        CancionDoc cancion48_3 = new CancionDoc();
        cancion48_3.setId(new ObjectId());
        cancion48_3.setNombre("A Boy Named Sue");

        List<CancionDoc> canciones48 = new ArrayList<>();
        canciones48.add(cancion48_1);
        canciones48.add(cancion48_2);
        canciones48.add(cancion48_3);

        AlbumColeccion album24_2 = new AlbumColeccion();
        album24_2.setNombre("Johnny Cash at San Quentin");
        album24_2.setImagen("albums/JohnnyCashAtSanQuentin.jpg");
        album24_2.setFechaLanzamiento(LocalDate.of(1969, 2, 24));
        album24_2.setCanciones(canciones48);
        album24_2.setArtista(artista24);
        albumColeccion.insertOne(album24_2);

        // Artista: Billie Eilish
        ArtistaColeccion artista25 = new ArtistaColeccion();
        Bson filtro25 = Filters.eq("nombre", "Billie Eilish");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro25)) {
            artista25 = artista;
        }

// Álbum 1: When We All Fall Asleep, Where Do We Go?
        CancionDoc cancion49_1 = new CancionDoc();
        cancion49_1.setId(new ObjectId());
        cancion49_1.setNombre("bad guy");

        CancionDoc cancion49_2 = new CancionDoc();
        cancion49_2.setId(new ObjectId());
        cancion49_2.setNombre("bury a friend");

        CancionDoc cancion49_3 = new CancionDoc();
        cancion49_3.setId(new ObjectId());
        cancion49_3.setNombre("when the party's over");

        List<CancionDoc> canciones49 = new ArrayList<>();
        canciones49.add(cancion49_1);
        canciones49.add(cancion49_2);
        canciones49.add(cancion49_3);

        AlbumColeccion album25_1 = new AlbumColeccion();
        album25_1.setNombre("When We All Fall Asleep, Where Do We Go?");
        album25_1.setImagen("albums/WhenWeAllFallAsleep.jpg");
        album25_1.setFechaLanzamiento(LocalDate.of(2019, 3, 29));
        album25_1.setCanciones(canciones49);
        album25_1.setArtista(artista25);
        albumColeccion.insertOne(album25_1);

// Álbum 2: Happier Than Ever
        CancionDoc cancion50_1 = new CancionDoc();
        cancion50_1.setId(new ObjectId());
        cancion50_1.setNombre("Happier Than Ever");

        CancionDoc cancion50_2 = new CancionDoc();
        cancion50_2.setId(new ObjectId());
        cancion50_2.setNombre("Your Power");

        CancionDoc cancion50_3 = new CancionDoc();
        cancion50_3.setId(new ObjectId());
        cancion50_3.setNombre("NDA");

        List<CancionDoc> canciones50 = new ArrayList<>();
        canciones50.add(cancion50_1);
        canciones50.add(cancion50_2);
        canciones50.add(cancion50_3);

        AlbumColeccion album25_2 = new AlbumColeccion();
        album25_2.setNombre("Happier Than Ever");
        album25_2.setImagen("albums/HappierThanEver.jpg");
        album25_2.setFechaLanzamiento(LocalDate.of(2021, 7, 30));
        album25_2.setCanciones(canciones50);
        album25_2.setArtista(artista25);
        albumColeccion.insertOne(album25_2);

// Artista: Carlos Santana
        ArtistaColeccion artista26 = new ArtistaColeccion();
        Bson filtro26 = Filters.eq("nombre", "Carlos Santana");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro26)) {
            artista26 = artista;
        }

// Álbum 1: Abraxas
        CancionDoc cancion51_1 = new CancionDoc();
        cancion51_1.setId(new ObjectId());
        cancion51_1.setNombre("Black Magic Woman");

        CancionDoc cancion51_2 = new CancionDoc();
        cancion51_2.setId(new ObjectId());
        cancion51_2.setNombre("Oye Como Va");

        CancionDoc cancion51_3 = new CancionDoc();
        cancion51_3.setId(new ObjectId());
        cancion51_3.setNombre("Samba Pa Ti");

        List<CancionDoc> canciones51 = new ArrayList<>();
        canciones51.add(cancion51_1);
        canciones51.add(cancion51_2);
        canciones51.add(cancion51_3);

        AlbumColeccion album26_1 = new AlbumColeccion();
        album26_1.setNombre("Abraxas");
        album26_1.setImagen("albums/Abraxas.jpg");
        album26_1.setFechaLanzamiento(LocalDate.of(1970, 9, 23));
        album26_1.setCanciones(canciones51);
        album26_1.setArtista(artista26);
        albumColeccion.insertOne(album26_1);

// Álbum 2: Supernatural
        CancionDoc cancion52_1 = new CancionDoc();
        cancion52_1.setId(new ObjectId());
        cancion52_1.setNombre("Smooth");

        CancionDoc cancion52_2 = new CancionDoc();
        cancion52_2.setId(new ObjectId());
        cancion52_2.setNombre("Maria Maria");

        CancionDoc cancion52_3 = new CancionDoc();
        cancion52_3.setId(new ObjectId());
        cancion52_3.setNombre("Put Your Lights On");

        List<CancionDoc> canciones52 = new ArrayList<>();
        canciones52.add(cancion52_1);
        canciones52.add(cancion52_2);
        canciones52.add(cancion52_3);

        AlbumColeccion album26_2 = new AlbumColeccion();
        album26_2.setNombre("Supernatural");
        album26_2.setImagen("albums/Supernatural.jpg");
        album26_2.setFechaLanzamiento(LocalDate.of(1999, 6, 15));
        album26_2.setCanciones(canciones52);
        album26_2.setArtista(artista26);
        albumColeccion.insertOne(album26_2);

// Artista: Marvin Gaye
        ArtistaColeccion artista27 = new ArtistaColeccion();
        Bson filtro27 = Filters.eq("nombre", "Marvin Gaye");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro27)) {
            artista27 = artista;
        }

// Álbum 1: What's Going On
        CancionDoc cancion53_1 = new CancionDoc();
        cancion53_1.setId(new ObjectId());
        cancion53_1.setNombre("What's Going On");

        CancionDoc cancion53_2 = new CancionDoc();
        cancion53_2.setId(new ObjectId());
        cancion53_2.setNombre("Mercy Mercy Me (The Ecology)");

        CancionDoc cancion53_3 = new CancionDoc();
        cancion53_3.setId(new ObjectId());
        cancion53_3.setNombre("Inner City Blues (Make Me Wanna Holler)");

        List<CancionDoc> canciones53 = new ArrayList<>();
        canciones53.add(cancion53_1);
        canciones53.add(cancion53_2);
        canciones53.add(cancion53_3);

        AlbumColeccion album27_1 = new AlbumColeccion();
        album27_1.setNombre("What's Going On");
        album27_1.setImagen("albums/WhatsGoingOn.jpg");
        album27_1.setFechaLanzamiento(LocalDate.of(1971, 5, 21));
        album27_1.setCanciones(canciones53);
        album27_1.setArtista(artista27);
        albumColeccion.insertOne(album27_1);

// Álbum 2: Let's Get It On
        CancionDoc cancion54_1 = new CancionDoc();
        cancion54_1.setId(new ObjectId());
        cancion54_1.setNombre("Let's Get It On");

        CancionDoc cancion54_2 = new CancionDoc();
        cancion54_2.setId(new ObjectId());
        cancion54_2.setNombre("Come Get to This");

        CancionDoc cancion54_3 = new CancionDoc();
        cancion54_3.setId(new ObjectId());
        cancion54_3.setNombre("You Sure Love to Ball");

        List<CancionDoc> canciones54 = new ArrayList<>();
        canciones54.add(cancion54_1);
        canciones54.add(cancion54_2);
        canciones54.add(cancion54_3);

        AlbumColeccion album27_2 = new AlbumColeccion();
        album27_2.setNombre("Let's Get It On");
        album27_2.setImagen("albums/LetsGetItOn.jpg");
        album27_2.setFechaLanzamiento(LocalDate.of(1973, 8, 28));
        album27_2.setCanciones(canciones54);
        album27_2.setArtista(artista27);
        albumColeccion.insertOne(album27_2);

// Artista: Chuck Berry
        ArtistaColeccion artista28 = new ArtistaColeccion();
        Bson filtro28 = Filters.eq("nombre", "Chuck Berry");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro28)) {
            artista28 = artista;
        }

// Álbum 1: Chuck Berry Is on Top
        CancionDoc cancion55_1 = new CancionDoc();
        cancion55_1.setId(new ObjectId());
        cancion55_1.setNombre("Maybellene");

        CancionDoc cancion55_2 = new CancionDoc();
        cancion55_2.setId(new ObjectId());
        cancion55_2.setNombre("Roll Over Beethoven");

        CancionDoc cancion55_3 = new CancionDoc();
        cancion55_3.setId(new ObjectId());
        cancion55_3.setNombre("Johnny B. Goode");

        List<CancionDoc> canciones55 = new ArrayList<>();
        canciones55.add(cancion55_1);
        canciones55.add(cancion55_2);
        canciones55.add(cancion55_3);

        AlbumColeccion album28_1 = new AlbumColeccion();
        album28_1.setNombre("Chuck Berry Is on Top");
        album28_1.setImagen("albums/ChuckBerryIsOnTop.jpg");
        album28_1.setFechaLanzamiento(LocalDate.of(1959, 4, 1));
        album28_1.setCanciones(canciones55);
        album28_1.setArtista(artista28);
        albumColeccion.insertOne(album28_1);

// Álbum 2: The Great Twenty-Eight
        CancionDoc cancion56_1 = new CancionDoc();
        cancion56_1.setId(new ObjectId());
        cancion56_1.setNombre("School Days");

        CancionDoc cancion56_2 = new CancionDoc();
        cancion56_2.setId(new ObjectId());
        cancion56_2.setNombre("Sweet Little Sixteen");

        CancionDoc cancion56_3 = new CancionDoc();
        cancion56_3.setId(new ObjectId());
        cancion56_3.setNombre("Back in the U.S.A.");

        List<CancionDoc> canciones56 = new ArrayList<>();
        canciones56.add(cancion56_1);
        canciones56.add(cancion56_2);
        canciones56.add(cancion56_3);

        AlbumColeccion album28_2 = new AlbumColeccion();
        album28_2.setNombre("The Great Twenty-Eight");
        album28_2.setImagen("albums/TheGreatTwentyEight.jpg");
        album28_2.setFechaLanzamiento(LocalDate.of(1982, 4, 5));
        album28_2.setCanciones(canciones56);
        album28_2.setArtista(artista28);
        albumColeccion.insertOne(album28_2);

// Artista: Patti Smith
        ArtistaColeccion artista29 = new ArtistaColeccion();
        Bson filtro29 = Filters.eq("nombre", "Patti Smith");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro29)) {
            artista29 = artista;
        }

// Álbum 1: Horses
        CancionDoc cancion57_1 = new CancionDoc();
        cancion57_1.setId(new ObjectId());
        cancion57_1.setNombre("Gloria");

        CancionDoc cancion57_2 = new CancionDoc();
        cancion57_2.setId(new ObjectId());
        cancion57_2.setNombre("Redondo Beach");

        CancionDoc cancion57_3 = new CancionDoc();
        cancion57_3.setId(new ObjectId());
        cancion57_3.setNombre("Land (Part I: Horses)");

        List<CancionDoc> canciones57 = new ArrayList<>();
        canciones57.add(cancion57_1);
        canciones57.add(cancion57_2);
        canciones57.add(cancion57_3);

        AlbumColeccion album29_1 = new AlbumColeccion();
        album29_1.setNombre("Horses");
        album29_1.setImagen("albums/Horses.jpg");
        album29_1.setFechaLanzamiento(LocalDate.of(1975, 11, 10));
        album29_1.setCanciones(canciones57);
        album29_1.setArtista(artista29);
        albumColeccion.insertOne(album29_1);

// Álbum 2: Easter
        CancionDoc cancion58_1 = new CancionDoc();
        cancion58_1.setId(new ObjectId());
        cancion58_1.setNombre("Because the Night");

        CancionDoc cancion58_2 = new CancionDoc();
        cancion58_2.setId(new ObjectId());
        cancion58_2.setNombre("Easter");

        CancionDoc cancion58_3 = new CancionDoc();
        cancion58_3.setId(new ObjectId());
        cancion58_3.setNombre("Privilege (Set Me Free)");

        List<CancionDoc> canciones58 = new ArrayList<>();
        canciones58.add(cancion58_1);
        canciones58.add(cancion58_2);
        canciones58.add(cancion58_3);

        AlbumColeccion album29_2 = new AlbumColeccion();
        album29_2.setNombre("Easter");
        album29_2.setImagen("albums/Easter.jpg");
        album29_2.setFechaLanzamiento(LocalDate.of(1978, 3, 4));
        album29_2.setCanciones(canciones58);
        album29_2.setArtista(artista29);
        albumColeccion.insertOne(album29_2);

// Artista: Eminem
        ArtistaColeccion artista30 = new ArtistaColeccion();
        Bson filtro30 = Filters.eq("nombre", "Eminem");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro30)) {
            artista30 = artista;
        }

// Álbum 1: The Marshall Mathers LP
        CancionDoc cancion59_1 = new CancionDoc();
        cancion59_1.setId(new ObjectId());
        cancion59_1.setNombre("The Real Slim Shady");

        CancionDoc cancion59_2 = new CancionDoc();
        cancion59_2.setId(new ObjectId());
        cancion59_2.setNombre("Stan");

        CancionDoc cancion59_3 = new CancionDoc();
        cancion59_3.setId(new ObjectId());
        cancion59_3.setNombre("Kill You");

        List<CancionDoc> canciones59 = new ArrayList<>();
        canciones59.add(cancion59_1);
        canciones59.add(cancion59_2);
        canciones59.add(cancion59_3);

        AlbumColeccion album30_1 = new AlbumColeccion();
        album30_1.setNombre("The Marshall Mathers LP");
        album30_1.setImagen("albums/TheMarshallMathersLP.jpg");
        album30_1.setFechaLanzamiento(LocalDate.of(2000, 5, 23));
        album30_1.setCanciones(canciones59);
        album30_1.setArtista(artista30);
        albumColeccion.insertOne(album30_1);

// Álbum 2: The Eminem Show
        CancionDoc cancion60_1 = new CancionDoc();
        cancion60_1.setId(new ObjectId());
        cancion60_1.setNombre("Without Me");

        CancionDoc cancion60_2 = new CancionDoc();
        cancion60_2.setId(new ObjectId());
        cancion60_2.setNombre("Cleanin' Out My Closet");

        CancionDoc cancion60_3 = new CancionDoc();
        cancion60_3.setId(new ObjectId());
        cancion60_3.setNombre("Sing for the Moment");

        List<CancionDoc> canciones60 = new ArrayList<>();
        canciones60.add(cancion60_1);
        canciones60.add(cancion60_2);
        canciones60.add(cancion60_3);

        AlbumColeccion album30_2 = new AlbumColeccion();
        album30_2.setNombre("The Eminem Show");
        album30_2.setImagen("albums/TheEminemShow.jpg");
        album30_2.setFechaLanzamiento(LocalDate.of(2002, 5, 26));
        album30_2.setCanciones(canciones60);
        album30_2.setArtista(artista30);
        albumColeccion.insertOne(album30_2);

// Artista: Drake
        ArtistaColeccion artista31 = new ArtistaColeccion();
        Bson filtro31 = Filters.eq("nombre", "Drake");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro31)) {
            artista31 = artista;
        }

// Álbum 1: Take Care
        CancionDoc cancion61_1 = new CancionDoc();
        cancion61_1.setId(new ObjectId());
        cancion61_1.setNombre("Marvins Room");

        CancionDoc cancion61_2 = new CancionDoc();
        cancion61_2.setId(new ObjectId());
        cancion61_2.setNombre("Headlines");

        CancionDoc cancion61_3 = new CancionDoc();
        cancion61_3.setId(new ObjectId());
        cancion61_3.setNombre("The Ride");

        List<CancionDoc> canciones61 = new ArrayList<>();
        canciones61.add(cancion61_1);
        canciones61.add(cancion61_2);
        canciones61.add(cancion61_3);

        AlbumColeccion album31_1 = new AlbumColeccion();
        album31_1.setNombre("Take Care");
        album31_1.setImagen("albums/TakeCare.jpg");
        album31_1.setFechaLanzamiento(LocalDate.of(2011, 11, 15));
        album31_1.setCanciones(canciones61);
        album31_1.setArtista(artista31);
        albumColeccion.insertOne(album31_1);

// Álbum 2: Nothing Was the Same
        CancionDoc cancion62_1 = new CancionDoc();
        cancion62_1.setId(new ObjectId());
        cancion62_1.setNombre("Started From the Bottom");

        CancionDoc cancion62_2 = new CancionDoc();
        cancion62_2.setId(new ObjectId());
        cancion62_2.setNombre("Hold On, We're Going Home");

        CancionDoc cancion62_3 = new CancionDoc();
        cancion62_3.setId(new ObjectId());
        cancion62_3.setNombre("Worst Behavior");

        List<CancionDoc> canciones62 = new ArrayList<>();
        canciones62.add(cancion62_1);
        canciones62.add(cancion62_2);
        canciones62.add(cancion62_3);

        AlbumColeccion album31_2 = new AlbumColeccion();
        album31_2.setNombre("Nothing Was the Same");
        album31_2.setImagen("albums/NothingWastheSame.jpg");
        album31_2.setFechaLanzamiento(LocalDate.of(2013, 9, 24));
        album31_2.setCanciones(canciones62);
        album31_2.setArtista(artista31);
        albumColeccion.insertOne(album31_2);

// Artista: Kendrick Lamar
        ArtistaColeccion artista32 = new ArtistaColeccion();
        Bson filtro32 = Filters.eq("nombre", "Kendrick Lamar");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro32)) {
            artista32 = artista;
        }

// Álbum 1: good kid, m.A.A.d city
        CancionDoc cancion63_1 = new CancionDoc();
        cancion63_1.setId(new ObjectId());
        cancion63_1.setNombre("Swimming Pools (Drank)");

        CancionDoc cancion63_2 = new CancionDoc();
        cancion63_2.setId(new ObjectId());
        cancion63_2.setNombre("Bitch, Don't Kill My Vibe");

        CancionDoc cancion63_3 = new CancionDoc();
        cancion63_3.setId(new ObjectId());
        cancion63_3.setNombre("M.A.A.d City");

        List<CancionDoc> canciones63 = new ArrayList<>();
        canciones63.add(cancion63_1);
        canciones63.add(cancion63_2);
        canciones63.add(cancion63_3);

        AlbumColeccion album32_1 = new AlbumColeccion();
        album32_1.setNombre("good kid, m.A.A.d city");
        album32_1.setImagen("albums/goodkid.jpg");
        album32_1.setFechaLanzamiento(LocalDate.of(2012, 10, 22));
        album32_1.setCanciones(canciones63);
        album32_1.setArtista(artista32);
        albumColeccion.insertOne(album32_1);

// Álbum 2: To Pimp a Butterfly
        CancionDoc cancion64_1 = new CancionDoc();
        cancion64_1.setId(new ObjectId());
        cancion64_1.setNombre("Alright");

        CancionDoc cancion64_2 = new CancionDoc();
        cancion64_2.setId(new ObjectId());
        cancion64_2.setNombre("King Kunta");

        CancionDoc cancion64_3 = new CancionDoc();
        cancion64_3.setId(new ObjectId());
        cancion64_3.setNombre("The Blacker the Berry");

        List<CancionDoc> canciones64 = new ArrayList<>();
        canciones64.add(cancion64_1);
        canciones64.add(cancion64_2);
        canciones64.add(cancion64_3);

        AlbumColeccion album32_2 = new AlbumColeccion();
        album32_2.setNombre("To Pimp a Butterfly");
        album32_2.setImagen("albums/ToPimpaButterfly.jpg");
        album32_2.setFechaLanzamiento(LocalDate.of(2015, 3, 15));
        album32_2.setCanciones(canciones64);
        album32_2.setArtista(artista32);
        albumColeccion.insertOne(album32_2);

// Artista: Shakira
        ArtistaColeccion artista33 = new ArtistaColeccion();
        Bson filtro33 = Filters.eq("nombre", "Shakira");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro33)) {
            artista33 = artista;
        }

// Álbum 1: Laundry Service
        CancionDoc cancion65_1 = new CancionDoc();
        cancion65_1.setId(new ObjectId());
        cancion65_1.setNombre("Whenever, Wherever");

        CancionDoc cancion65_2 = new CancionDoc();
        cancion65_2.setId(new ObjectId());
        cancion65_2.setNombre("Underneath Your Clothes");

        CancionDoc cancion65_3 = new CancionDoc();
        cancion65_3.setId(new ObjectId());
        cancion65_3.setNombre("Objection (Tango)");

        List<CancionDoc> canciones65 = new ArrayList<>();
        canciones65.add(cancion65_1);
        canciones65.add(cancion65_2);
        canciones65.add(cancion65_3);

        AlbumColeccion album33_1 = new AlbumColeccion();
        album33_1.setNombre("Laundry Service");
        album33_1.setImagen("albums/LaundryService.jpg");
        album33_1.setFechaLanzamiento(LocalDate.of(2001, 11, 13));
        album33_1.setCanciones(canciones65);
        album33_1.setArtista(artista33);
        albumColeccion.insertOne(album33_1);

// Álbum 2: Oral Fixation, Vol. 2
        CancionDoc cancion66_1 = new CancionDoc();
        cancion66_1.setId(new ObjectId());
        cancion66_1.setNombre("Hips Don't Lie");

        CancionDoc cancion66_2 = new CancionDoc();
        cancion66_2.setId(new ObjectId());
        cancion66_2.setNombre("La Tortura");

        CancionDoc cancion66_3 = new CancionDoc();
        cancion66_3.setId(new ObjectId());
        cancion66_3.setNombre("Dia de enero");

        List<CancionDoc> canciones66 = new ArrayList<>();
        canciones66.add(cancion66_1);
        canciones66.add(cancion66_2);
        canciones66.add(cancion66_3);

        AlbumColeccion album33_2 = new AlbumColeccion();
        album33_2.setNombre("Oral Fixation, Vol. 2");
        album33_2.setImagen("albums/OralFixationVol2.jpg");
        album33_2.setFechaLanzamiento(LocalDate.of(2005, 11, 29));
        album33_2.setCanciones(canciones66);
        album33_2.setArtista(artista33);
        albumColeccion.insertOne(album33_2);

// Artista: Jay-Z
        ArtistaColeccion artista34 = new ArtistaColeccion();
        Bson filtro34 = Filters.eq("nombre", "Jay-Z");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro34)) {
            artista34 = artista;
        }

// Álbum 1: The Blueprint
        CancionDoc cancion67_1 = new CancionDoc();
        cancion67_1.setId(new ObjectId());
        cancion67_1.setNombre("Izzo (H.O.V.A.)");

        CancionDoc cancion67_2 = new CancionDoc();
        cancion67_2.setId(new ObjectId());
        cancion67_2.setNombre("Jigga What, Jigga Who?");

        CancionDoc cancion67_3 = new CancionDoc();
        cancion67_3.setId(new ObjectId());
        cancion67_3.setNombre("Song Cry");

        List<CancionDoc> canciones67 = new ArrayList<>();
        canciones67.add(cancion67_1);
        canciones67.add(cancion67_2);
        canciones67.add(cancion67_3);

        AlbumColeccion album34_1 = new AlbumColeccion();
        album34_1.setNombre("The Blueprint");
        album34_1.setImagen("albums/TheBlueprint.jpg");
        album34_1.setFechaLanzamiento(LocalDate.of(2001, 9, 11));
        album34_1.setCanciones(canciones67);
        album34_1.setArtista(artista34);
        albumColeccion.insertOne(album34_1);

// Álbum 2: The Black Album
        CancionDoc cancion68_1 = new CancionDoc();
        cancion68_1.setId(new ObjectId());
        cancion68_1.setNombre("99 Problems");

        CancionDoc cancion68_2 = new CancionDoc();
        cancion68_2.setId(new ObjectId());
        cancion68_2.setNombre("Dirt Off Your Shoulder");

        CancionDoc cancion68_3 = new CancionDoc();
        cancion68_3.setId(new ObjectId());
        cancion68_3.setNombre("Encore");

        List<CancionDoc> canciones68 = new ArrayList<>();
        canciones68.add(cancion68_1);
        canciones68.add(cancion68_2);
        canciones68.add(cancion68_3);

        AlbumColeccion album34_2 = new AlbumColeccion();
        album34_2.setNombre("The Black Album");
        album34_2.setImagen("albums/TheBlackAlbum.jpg");
        album34_2.setFechaLanzamiento(LocalDate.of(2003, 11, 14));
        album34_2.setCanciones(canciones68);
        album34_2.setArtista(artista34);
        albumColeccion.insertOne(album34_2);

// Artista: Taylor Swift
        ArtistaColeccion artista35 = new ArtistaColeccion();
        Bson filtro35 = Filters.eq("nombre", "Taylor Swift");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro35)) {
            artista35 = artista;
        }

// Álbum 1: Fearless
        CancionDoc cancion69_1 = new CancionDoc();
        cancion69_1.setId(new ObjectId());
        cancion69_1.setNombre("Love Story");

        CancionDoc cancion69_2 = new CancionDoc();
        cancion69_2.setId(new ObjectId());
        cancion69_2.setNombre("You Belong with Me");

        CancionDoc cancion69_3 = new CancionDoc();
        cancion69_3.setId(new ObjectId());
        cancion69_3.setNombre("Fifteen");

        List<CancionDoc> canciones69 = new ArrayList<>();
        canciones69.add(cancion69_1);
        canciones69.add(cancion69_2);
        canciones69.add(cancion69_3);

        AlbumColeccion album35_1 = new AlbumColeccion();
        album35_1.setNombre("Fearless");
        album35_1.setImagen("albums/Fearless.jpg");
        album35_1.setFechaLanzamiento(LocalDate.of(2008, 11, 11));
        album35_1.setCanciones(canciones69);
        album35_1.setArtista(artista35);
        albumColeccion.insertOne(album35_1);

// Álbum 2: 1989
        CancionDoc cancion70_1 = new CancionDoc();
        cancion70_1.setId(new ObjectId());
        cancion70_1.setNombre("Shake It Off");

        CancionDoc cancion70_2 = new CancionDoc();
        cancion70_2.setId(new ObjectId());
        cancion70_2.setNombre("Blank Space");

        CancionDoc cancion70_3 = new CancionDoc();
        cancion70_3.setId(new ObjectId());
        cancion70_3.setNombre("Style");

        List<CancionDoc> canciones70 = new ArrayList<>();
        canciones70.add(cancion70_1);
        canciones70.add(cancion70_2);
        canciones70.add(cancion70_3);

        AlbumColeccion album35_2 = new AlbumColeccion();
        album35_2.setNombre("1989");
        album35_2.setImagen("albums/1989.jpg");
        album35_2.setFechaLanzamiento(LocalDate.of(2014, 10, 27));
        album35_2.setCanciones(canciones70);
        album35_2.setArtista(artista35);
        albumColeccion.insertOne(album35_2);

// Artista: Lana Del Rey
        ArtistaColeccion artista36 = new ArtistaColeccion();
        Bson filtro36 = Filters.eq("nombre", "Lana Del Rey");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro36)) {
            artista36 = artista;
        }

// Álbum 1: Born to Die
        CancionDoc cancion71_1 = new CancionDoc();
        cancion71_1.setId(new ObjectId());
        cancion71_1.setNombre("Born to Die");

        CancionDoc cancion71_2 = new CancionDoc();
        cancion71_2.setId(new ObjectId());
        cancion71_2.setNombre("Summertime Sadness");

        CancionDoc cancion71_3 = new CancionDoc();
        cancion71_3.setId(new ObjectId());
        cancion71_3.setNombre("Video Games");

        List<CancionDoc> canciones71 = new ArrayList<>();
        canciones71.add(cancion71_1);
        canciones71.add(cancion71_2);
        canciones71.add(cancion71_3);

        AlbumColeccion album36_1 = new AlbumColeccion();
        album36_1.setNombre("Born to Die");
        album36_1.setImagen("albums/BornToDie.jpg");
        album36_1.setFechaLanzamiento(LocalDate.of(2012, 1, 27));
        album36_1.setCanciones(canciones71);
        album36_1.setArtista(artista36);
        albumColeccion.insertOne(album36_1);

// Álbum 2: Lust for Life
        CancionDoc cancion72_1 = new CancionDoc();
        cancion72_1.setId(new ObjectId());
        cancion72_1.setNombre("Love");

        CancionDoc cancion72_2 = new CancionDoc();
        cancion72_2.setId(new ObjectId());
        cancion72_2.setNombre("Lust for Life");

        CancionDoc cancion72_3 = new CancionDoc();
        cancion72_3.setId(new ObjectId());
        cancion72_3.setNombre("Cherry");

        List<CancionDoc> canciones72 = new ArrayList<>();
        canciones72.add(cancion72_1);
        canciones72.add(cancion72_2);
        canciones72.add(cancion72_3);

        AlbumColeccion album36_2 = new AlbumColeccion();
        album36_2.setNombre("Lust for Life");
        album36_2.setImagen("albums/LustForLife.jpg");
        album36_2.setFechaLanzamiento(LocalDate.of(2017, 7, 21));
        album36_2.setCanciones(canciones72);
        album36_2.setArtista(artista36);
        albumColeccion.insertOne(album36_2);

// Artista: Billie Holiday
        ArtistaColeccion artista37 = new ArtistaColeccion();
        Bson filtro37 = Filters.eq("nombre", "Billie Holiday");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro37)) {
            artista37 = artista;
        }

// Álbum 1: Lady Sings the Blues
        CancionDoc cancion73_1 = new CancionDoc();
        cancion73_1.setId(new ObjectId());
        cancion73_1.setNombre("Lady Sings the Blues");

        CancionDoc cancion73_2 = new CancionDoc();
        cancion73_2.setId(new ObjectId());
        cancion73_2.setNombre("Strange Fruit");

        CancionDoc cancion73_3 = new CancionDoc();
        cancion73_3.setId(new ObjectId());
        cancion73_3.setNombre("God Bless the Child");

        List<CancionDoc> canciones73 = new ArrayList<>();
        canciones73.add(cancion73_1);
        canciones73.add(cancion73_2);
        canciones73.add(cancion73_3);

        AlbumColeccion album37_1 = new AlbumColeccion();
        album37_1.setNombre("Lady Sings the Blues");
        album37_1.setImagen("albums/LadySingsTheBlues.jpg");
        album37_1.setFechaLanzamiento(LocalDate.of(1956, 12, 1));
        album37_1.setCanciones(canciones73);
        album37_1.setArtista(artista37);
        albumColeccion.insertOne(album37_1);

// Álbum 2: The Essential Billie Holiday
        CancionDoc cancion74_1 = new CancionDoc();
        cancion74_1.setId(new ObjectId());
        cancion74_1.setNombre("Don't Explain");

        CancionDoc cancion74_2 = new CancionDoc();
        cancion74_2.setId(new ObjectId());
        cancion74_2.setNombre("Lover Man");

        CancionDoc cancion74_3 = new CancionDoc();
        cancion74_3.setId(new ObjectId());
        cancion74_3.setNombre("I Only Have Eyes for You");

        List<CancionDoc> canciones74 = new ArrayList<>();
        canciones74.add(cancion74_1);
        canciones74.add(cancion74_2);
        canciones74.add(cancion74_3);

        AlbumColeccion album37_2 = new AlbumColeccion();
        album37_2.setNombre("The Essential Billie Holiday");
        album37_2.setImagen("albums/TheEssentialBillieHoliday.jpg");
        album37_2.setFechaLanzamiento(LocalDate.of(2002, 9, 24));
        album37_2.setCanciones(canciones74);
        album37_2.setArtista(artista37);
        albumColeccion.insertOne(album37_2);

// Artista: Sia
        ArtistaColeccion artista38 = new ArtistaColeccion();
        Bson filtro38 = Filters.eq("nombre", "Sia");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro38)) {
            artista38 = artista;
        }

// Álbum 1: 1000 Forms of Fear
        CancionDoc cancion75_1 = new CancionDoc();
        cancion75_1.setId(new ObjectId());
        cancion75_1.setNombre("Chandelier");

        CancionDoc cancion75_2 = new CancionDoc();
        cancion75_2.setId(new ObjectId());
        cancion75_2.setNombre("Elastic Heart");

        CancionDoc cancion75_3 = new CancionDoc();
        cancion75_3.setId(new ObjectId());
        cancion75_3.setNombre("Big Girls Cry");

        List<CancionDoc> canciones75 = new ArrayList<>();
        canciones75.add(cancion75_1);
        canciones75.add(cancion75_2);
        canciones75.add(cancion75_3);

        AlbumColeccion album38_1 = new AlbumColeccion();
        album38_1.setNombre("1000 Forms of Fear");
        album38_1.setImagen("albums/1000FormsOfFear.jpg");
        album38_1.setFechaLanzamiento(LocalDate.of(2014, 7, 8));
        album38_1.setCanciones(canciones75);
        album38_1.setArtista(artista38);
        albumColeccion.insertOne(album38_1);

// Álbum 2: This Is Acting
        CancionDoc cancion76_1 = new CancionDoc();
        cancion76_1.setId(new ObjectId());
        cancion76_1.setNombre("Cheap Thrills");

        CancionDoc cancion76_2 = new CancionDoc();
        cancion76_2.setId(new ObjectId());
        cancion76_2.setNombre("The Greatest");

        CancionDoc cancion76_3 = new CancionDoc();
        cancion76_3.setId(new ObjectId());
        cancion76_3.setNombre("Move Your Body");

        List<CancionDoc> canciones76 = new ArrayList<>();
        canciones76.add(cancion76_1);
        canciones76.add(cancion76_2);
        canciones76.add(cancion76_3);

        AlbumColeccion album38_2 = new AlbumColeccion();
        album38_2.setNombre("This Is Acting");
        album38_2.setImagen("albums/ThisIsActing.jpg");
        album38_2.setFechaLanzamiento(LocalDate.of(2016, 1, 29));
        album38_2.setCanciones(canciones76);
        album38_2.setArtista(artista38);
        albumColeccion.insertOne(album38_2);

// Artista: Elton John
        ArtistaColeccion artista39 = new ArtistaColeccion();
        Bson filtro39 = Filters.eq("nombre", "Elton John");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro39)) {
            artista39 = artista;
        }

// Álbum 1: Goodbye Yellow Brick Road
        CancionDoc cancion77_1 = new CancionDoc();
        cancion77_1.setId(new ObjectId());
        cancion77_1.setNombre("Goodbye Yellow Brick Road");

        CancionDoc cancion77_2 = new CancionDoc();
        cancion77_2.setId(new ObjectId());
        cancion77_2.setNombre("Bennie and the Jets");

        CancionDoc cancion77_3 = new CancionDoc();
        cancion77_3.setId(new ObjectId());
        cancion77_3.setNombre("Candle in the Wind");

        List<CancionDoc> canciones77 = new ArrayList<>();
        canciones77.add(cancion77_1);
        canciones77.add(cancion77_2);
        canciones77.add(cancion77_3);

        AlbumColeccion album39_1 = new AlbumColeccion();
        album39_1.setNombre("Goodbye Yellow Brick Road");
        album39_1.setImagen("albums/GoodbyeYellowBrickRoad.jpg");
        album39_1.setFechaLanzamiento(LocalDate.of(1973, 10, 5));
        album39_1.setCanciones(canciones77);
        album39_1.setArtista(artista39);
        albumColeccion.insertOne(album39_1);

// Álbum 2: Rocket Man: The Definitive Hits
        CancionDoc cancion78_1 = new CancionDoc();
        cancion78_1.setId(new ObjectId());
        cancion78_1.setNombre("Rocket Man");

        CancionDoc cancion78_2 = new CancionDoc();
        cancion78_2.setId(new ObjectId());
        cancion78_2.setNombre("Tiny Dancer");

        CancionDoc cancion78_3 = new CancionDoc();
        cancion78_3.setId(new ObjectId());
        cancion78_3.setNombre("Your Song");

        List<CancionDoc> canciones78 = new ArrayList<>();
        canciones78.add(cancion78_1);
        canciones78.add(cancion78_2);
        canciones78.add(cancion78_3);

        AlbumColeccion album39_2 = new AlbumColeccion();
        album39_2.setNombre("Rocket Man: The Definitive Hits");
        album39_2.setImagen("albums/RocketManDefinitiveHits.jpg");
        album39_2.setFechaLanzamiento(LocalDate.of(2007, 11, 13));
        album39_2.setCanciones(canciones78);
        album39_2.setArtista(artista39);
        albumColeccion.insertOne(album39_2);

// Artista: Diana Ross
        ArtistaColeccion artista40 = new ArtistaColeccion();
        Bson filtro40 = Filters.eq("nombre", "Diana Ross");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro40)) {
            artista40 = artista;
        }

// Álbum 1: Diana
        CancionDoc cancion79_1 = new CancionDoc();
        cancion79_1.setId(new ObjectId());
        cancion79_1.setNombre("I'm Coming Out");

        CancionDoc cancion79_2 = new CancionDoc();
        cancion79_2.setId(new ObjectId());
        cancion79_2.setNombre("Upside Down");

        CancionDoc cancion79_3 = new CancionDoc();
        cancion79_3.setId(new ObjectId());
        cancion79_3.setNombre("My Old Piano");

        List<CancionDoc> canciones79 = new ArrayList<>();
        canciones79.add(cancion79_1);
        canciones79.add(cancion79_2);
        canciones79.add(cancion79_3);

        AlbumColeccion album40_1 = new AlbumColeccion();
        album40_1.setNombre("Diana");
        album40_1.setImagen("albums/Diana.jpg");
        album40_1.setFechaLanzamiento(LocalDate.of(1980, 5, 26));
        album40_1.setCanciones(canciones79);
        album40_1.setArtista(artista40);
        albumColeccion.insertOne(album40_1);

// Álbum 2: The Boss
        CancionDoc cancion80_1 = new CancionDoc();
        cancion80_1.setId(new ObjectId());
        cancion80_1.setNombre("The Boss");

        CancionDoc cancion80_2 = new CancionDoc();
        cancion80_2.setId(new ObjectId());
        cancion80_2.setNombre("It's My House");

        CancionDoc cancion80_3 = new CancionDoc();
        cancion80_3.setId(new ObjectId());
        cancion80_3.setNombre("Surrender");

        List<CancionDoc> canciones80 = new ArrayList<>();
        canciones80.add(cancion80_1);
        canciones80.add(cancion80_2);
        canciones80.add(cancion80_3);

        AlbumColeccion album40_2 = new AlbumColeccion();
        album40_2.setNombre("The Boss");
        album40_2.setImagen("albums/TheBoss.jpg");
        album40_2.setFechaLanzamiento(LocalDate.of(1979, 10, 1));
        album40_2.setCanciones(canciones80);
        album40_2.setArtista(artista40);
        albumColeccion.insertOne(album40_2);

// Artista: Frank Sinatra
        ArtistaColeccion artista41 = new ArtistaColeccion();
        Bson filtro41 = Filters.eq("nombre", "Frank Sinatra");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro41)) {
            artista41 = artista;
        }

// Álbum 1: Come Fly with Me
        CancionDoc cancion81_1 = new CancionDoc();
        cancion81_1.setId(new ObjectId());
        cancion81_1.setNombre("Come Fly with Me");

        CancionDoc cancion81_2 = new CancionDoc();
        cancion81_2.setId(new ObjectId());
        cancion81_2.setNombre("Fly Me to the Moon");

        CancionDoc cancion81_3 = new CancionDoc();
        cancion81_3.setId(new ObjectId());
        cancion81_3.setNombre("I've Got You Under My Skin");

        List<CancionDoc> canciones81 = new ArrayList<>();
        canciones81.add(cancion81_1);
        canciones81.add(cancion81_2);
        canciones81.add(cancion81_3);

        AlbumColeccion album41_1 = new AlbumColeccion();
        album41_1.setNombre("Come Fly with Me");
        album41_1.setImagen("albums/ComeFlyWithMe.jpg");
        album41_1.setFechaLanzamiento(LocalDate.of(1958, 1, 1));
        album41_1.setCanciones(canciones81);
        album41_1.setArtista(artista41);
        albumColeccion.insertOne(album41_1);

// Álbum 2: My Way
        CancionDoc cancion82_1 = new CancionDoc();
        cancion82_1.setId(new ObjectId());
        cancion82_1.setNombre("My Way");

        CancionDoc cancion82_2 = new CancionDoc();
        cancion82_2.setId(new ObjectId());
        cancion82_2.setNombre("Strangers in the Night");

        CancionDoc cancion82_3 = new CancionDoc();
        cancion82_3.setId(new ObjectId());
        cancion82_3.setNombre("New York, New York");

        List<CancionDoc> canciones82 = new ArrayList<>();
        canciones82.add(cancion82_1);
        canciones82.add(cancion82_2);
        canciones82.add(cancion82_3);

        AlbumColeccion album41_2 = new AlbumColeccion();
        album41_2.setNombre("My Way");
        album41_2.setImagen("albums/MyWay.jpg");
        album41_2.setFechaLanzamiento(LocalDate.of(1969, 3, 1));
        album41_2.setCanciones(canciones82);
        album41_2.setArtista(artista41);
        albumColeccion.insertOne(album41_2);

// Artista: Celine Dion
        ArtistaColeccion artista42 = new ArtistaColeccion();
        Bson filtro42 = Filters.eq("nombre", "Celine Dion");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro42)) {
            artista42 = artista;
        }

// Álbum 1: Falling into You
        CancionDoc cancion83_1 = new CancionDoc();
        cancion83_1.setId(new ObjectId());
        cancion83_1.setNombre("Because You Loved Me");

        CancionDoc cancion83_2 = new CancionDoc();
        cancion83_2.setId(new ObjectId());
        cancion83_2.setNombre("It's All Coming Back to Me Now");

        CancionDoc cancion83_3 = new CancionDoc();
        cancion83_3.setId(new ObjectId());
        cancion83_3.setNombre("All By Myself");

        List<CancionDoc> canciones83 = new ArrayList<>();
        canciones83.add(cancion83_1);
        canciones83.add(cancion83_2);
        canciones83.add(cancion83_3);

        AlbumColeccion album42_1 = new AlbumColeccion();
        album42_1.setNombre("Falling into You");
        album42_1.setImagen("albums/FallingIntoYou.jpg");
        album42_1.setFechaLanzamiento(LocalDate.of(1996, 3, 12));
        album42_1.setCanciones(canciones83);
        album42_1.setArtista(artista42);
        albumColeccion.insertOne(album42_1);

// Álbum 2: Let's Talk About Love
        CancionDoc cancion84_1 = new CancionDoc();
        cancion84_1.setId(new ObjectId());
        cancion84_1.setNombre("My Heart Will Go On");

        CancionDoc cancion84_2 = new CancionDoc();
        cancion84_2.setId(new ObjectId());
        cancion84_2.setNombre("The Reason");

        CancionDoc cancion84_3 = new CancionDoc();
        cancion84_3.setId(new ObjectId());
        cancion84_3.setNombre("Let's Talk About Love");

        List<CancionDoc> canciones84 = new ArrayList<>();
        canciones84.add(cancion84_1);
        canciones84.add(cancion84_2);
        canciones84.add(cancion84_3);

        AlbumColeccion album42_2 = new AlbumColeccion();
        album42_2.setNombre("Let's Talk About Love");
        album42_2.setImagen("albums/LetsTalkAboutLove.jpg");
        album42_2.setFechaLanzamiento(LocalDate.of(1997, 11, 13));
        album42_2.setCanciones(canciones84);
        album42_2.setArtista(artista42);
        albumColeccion.insertOne(album42_2);

// Artista: Kate Bush
        ArtistaColeccion artista43 = new ArtistaColeccion();
        Bson filtro43 = Filters.eq("nombre", "Kate Bush");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro43)) {
            artista43 = artista;
        }

// Álbum 1: The Sensual World
        CancionDoc cancion85_1 = new CancionDoc();
        cancion85_1.setId(new ObjectId());
        cancion85_1.setNombre("This Woman's Work");

        CancionDoc cancion85_2 = new CancionDoc();
        cancion85_2.setId(new ObjectId());
        cancion85_2.setNombre("The Sensual World");

        CancionDoc cancion85_3 = new CancionDoc();
        cancion85_3.setId(new ObjectId());
        cancion85_3.setNombre("Love and Anger");

        List<CancionDoc> canciones85 = new ArrayList<>();
        canciones85.add(cancion85_1);
        canciones85.add(cancion85_2);
        canciones85.add(cancion85_3);

        AlbumColeccion album43_1 = new AlbumColeccion();
        album43_1.setNombre("The Sensual World");
        album43_1.setImagen("albums/TheSensualWorld.jpg");
        album43_1.setFechaLanzamiento(LocalDate.of(1989, 10, 16));
        album43_1.setCanciones(canciones85);
        album43_1.setArtista(artista43);
        albumColeccion.insertOne(album43_1);

// Álbum 2: The Dreaming
        CancionDoc cancion86_1 = new CancionDoc();
        cancion86_1.setId(new ObjectId());
        cancion86_1.setNombre("Sat in Your Lap");

        CancionDoc cancion86_2 = new CancionDoc();
        cancion86_2.setId(new ObjectId());
        cancion86_2.setNombre("The Dreaming");

        CancionDoc cancion86_3 = new CancionDoc();
        cancion86_3.setId(new ObjectId());
        cancion86_3.setNombre("Suspended in Gaffa");

        List<CancionDoc> canciones86 = new ArrayList<>();
        canciones86.add(cancion86_1);
        canciones86.add(cancion86_2);
        canciones86.add(cancion86_3);

        AlbumColeccion album43_2 = new AlbumColeccion();
        album43_2.setNombre("The Dreaming");
        album43_2.setImagen("albums/TheDreaming.jpg");
        album43_2.setFechaLanzamiento(LocalDate.of(1982, 9, 13));
        album43_2.setCanciones(canciones86);
        album43_2.setArtista(artista43);
        albumColeccion.insertOne(album43_2);

// Artista: The Rolling Stones
        ArtistaColeccion artista44 = new ArtistaColeccion();
        Bson filtro44 = Filters.eq("nombre", "The Rolling Stones");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro44)) {
            artista44 = artista;
        }

// Álbum 1: Sticky Fingers
        CancionDoc cancion87_1 = new CancionDoc();
        cancion87_1.setId(new ObjectId());
        cancion87_1.setNombre("Brown Sugar");

        CancionDoc cancion87_2 = new CancionDoc();
        cancion87_2.setId(new ObjectId());
        cancion87_2.setNombre("Wild Horses");

        CancionDoc cancion87_3 = new CancionDoc();
        cancion87_3.setId(new ObjectId());
        cancion87_3.setNombre("Can't You Hear Me Knocking");

        List<CancionDoc> canciones87 = new ArrayList<>();
        canciones87.add(cancion87_1);
        canciones87.add(cancion87_2);
        canciones87.add(cancion87_3);

        AlbumColeccion album44_1 = new AlbumColeccion();
        album44_1.setNombre("Sticky Fingers");
        album44_1.setImagen("albums/StickyFingers.jpg");
        album44_1.setFechaLanzamiento(LocalDate.of(1971, 4, 23));
        album44_1.setCanciones(canciones87);
        album44_1.setArtista(artista44);
        albumColeccion.insertOne(album44_1);

// Álbum 2: Exile on Main St.
        CancionDoc cancion88_1 = new CancionDoc();
        cancion88_1.setId(new ObjectId());
        cancion88_1.setNombre("Tumbling Dice");

        CancionDoc cancion88_2 = new CancionDoc();
        cancion88_2.setId(new ObjectId());
        cancion88_2.setNombre("Happy");

        CancionDoc cancion88_3 = new CancionDoc();
        cancion88_3.setId(new ObjectId());
        cancion88_3.setNombre("All Down the Line");

        List<CancionDoc> canciones88 = new ArrayList<>();
        canciones88.add(cancion88_1);
        canciones88.add(cancion88_2);
        canciones88.add(cancion88_3);

        AlbumColeccion album44_2 = new AlbumColeccion();
        album44_2.setNombre("Exile on Main St.");
        album44_2.setImagen("albums/ExileOnMainSt.jpg");
        album44_2.setFechaLanzamiento(LocalDate.of(1972, 5, 12));
        album44_2.setCanciones(canciones88);
        album44_2.setArtista(artista44);
        albumColeccion.insertOne(album44_2);

// Artista: Ariana Grande
        ArtistaColeccion artista45 = new ArtistaColeccion();
        Bson filtro45 = Filters.eq("nombre", "Ariana Grande");

        for (ArtistaColeccion artista : artistaColeccion.find(filtro45)) {
            artista45 = artista;
        }

// Álbum 1: Yours Truly
        CancionDoc cancion89_1 = new CancionDoc();
        cancion89_1.setId(new ObjectId());
        cancion89_1.setNombre("The Way");

        CancionDoc cancion89_2 = new CancionDoc();
        cancion89_2.setId(new ObjectId());
        cancion89_2.setNombre("Baby I");

        CancionDoc cancion89_3 = new CancionDoc();
        cancion89_3.setId(new ObjectId());
        cancion89_3.setNombre("Right There");

        List<CancionDoc> canciones89 = new ArrayList<>();
        canciones89.add(cancion89_1);
        canciones89.add(cancion89_2);
        canciones89.add(cancion89_3);

        AlbumColeccion album45_1 = new AlbumColeccion();
        album45_1.setNombre("Yours Truly");
        album45_1.setImagen("albums/YoursTruly.jpg");
        album45_1.setFechaLanzamiento(LocalDate.of(2013, 9, 3));
        album45_1.setCanciones(canciones89);
        album45_1.setArtista(artista45);
        albumColeccion.insertOne(album45_1);

// Álbum 2: Dangerous Woman
        CancionDoc cancion90_1 = new CancionDoc();
        cancion90_1.setId(new ObjectId());
        cancion90_1.setNombre("Dangerous Woman");

        CancionDoc cancion90_2 = new CancionDoc();
        cancion90_2.setId(new ObjectId());
        cancion90_2.setNombre("Into You");

        CancionDoc cancion90_3 = new CancionDoc();
        cancion90_3.setId(new ObjectId());
        cancion90_3.setNombre("Side to Side");

        List<CancionDoc> canciones90 = new ArrayList<>();
        canciones90.add(cancion90_1);
        canciones90.add(cancion90_2);
        canciones90.add(cancion90_3);

        AlbumColeccion album45_2 = new AlbumColeccion();
        album45_2.setNombre("Dangerous Woman");
        album45_2.setImagen("albums/DangerousWoman.jpg");
        album45_2.setFechaLanzamiento(LocalDate.of(2016, 5, 20));
        album45_2.setCanciones(canciones90);
        album45_2.setArtista(artista45);
        albumColeccion.insertOne(album45_2);

    }

    /**
     * Método de inserción de álbumes banda
     */
    public void insertarAlbumesBanda() {

        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        MongoDatabase database = conexionDB.getDatabase();

        MongoCollection<AlbumColeccion> albumColeccion = database.getCollection("Albumes", AlbumColeccion.class);
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("Artistas", ArtistaColeccion.class);

        Bson filtro;

// 1. The Beatles
        ArtistaColeccion artista1 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Beatles");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista1 = artistaTemp;
        }

        CancionDoc cancion1 = new CancionDoc();
        cancion1.setId(new ObjectId());
        cancion1.setNombre("Hey Jude");

        CancionDoc cancion2 = new CancionDoc();
        cancion2.setId(new ObjectId());
        cancion2.setNombre("Let It Be");

        CancionDoc cancion3 = new CancionDoc();
        cancion3.setId(new ObjectId());
        cancion3.setNombre("Come Together");

        List<CancionDoc> canciones1 = new ArrayList<>();
        canciones1.add(cancion1);
        canciones1.add(cancion2);
        canciones1.add(cancion3);

        AlbumColeccion album1 = new AlbumColeccion();
        album1.setNombre("Abbey Road");
        album1.setImagen("albums/AbbeyRoad.jpg");
        album1.setFechaLanzamiento(LocalDate.of(1969, 9, 26));
        album1.setCanciones(canciones1);
        album1.setArtista(artista1);

        albumColeccion.insertOne(album1);

        CancionDoc cancion4 = new CancionDoc();
        cancion4.setId(new ObjectId());
        cancion4.setNombre("A Hard Day's Night");

        CancionDoc cancion5 = new CancionDoc();
        cancion5.setId(new ObjectId());
        cancion5.setNombre("I Should Have Known Better");

        CancionDoc cancion6 = new CancionDoc();
        cancion6.setId(new ObjectId());
        cancion6.setNombre("If I Fell");

        List<CancionDoc> canciones2 = new ArrayList<>();
        canciones2.add(cancion4);
        canciones2.add(cancion5);
        canciones2.add(cancion6);

        AlbumColeccion album2 = new AlbumColeccion();
        album2.setNombre("A Hard Day's Night");
        album2.setImagen("albums/HardDaysNight.jpg");
        album2.setFechaLanzamiento(LocalDate.of(1964, 7, 10));
        album2.setCanciones(canciones2);
        album2.setArtista(artista1);

        albumColeccion.insertOne(album2);

// 2. Queen
        ArtistaColeccion artista2 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Queen");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista2 = artistaTemp;
        }

        CancionDoc cancion7 = new CancionDoc();
        cancion7.setId(new ObjectId());
        cancion7.setNombre("Bohemian Rhapsody");

        CancionDoc cancion8 = new CancionDoc();
        cancion8.setId(new ObjectId());
        cancion8.setNombre("We Are the Champions");

        CancionDoc cancion9 = new CancionDoc();
        cancion9.setId(new ObjectId());
        cancion9.setNombre("Somebody to Love");

        List<CancionDoc> canciones3 = new ArrayList<>();
        canciones3.add(cancion7);
        canciones3.add(cancion8);
        canciones3.add(cancion9);

        AlbumColeccion album3 = new AlbumColeccion();
        album3.setNombre("A Night at the Opera");
        album3.setImagen("albums/ANightAtTheOpera.jpg");
        album3.setFechaLanzamiento(LocalDate.of(1975, 11, 21));
        album3.setCanciones(canciones3);
        album3.setArtista(artista2);

        albumColeccion.insertOne(album3);

        CancionDoc cancion10 = new CancionDoc();
        cancion10.setId(new ObjectId());
        cancion10.setNombre("We Will Rock You");

        CancionDoc cancion11 = new CancionDoc();
        cancion11.setId(new ObjectId());
        cancion11.setNombre("Radio Ga Ga");

        CancionDoc cancion12 = new CancionDoc();
        cancion12.setId(new ObjectId());
        cancion12.setNombre("Another One Bites the Dust");

        List<CancionDoc> canciones4 = new ArrayList<>();
        canciones4.add(cancion10);
        canciones4.add(cancion11);
        canciones4.add(cancion12);

        AlbumColeccion album4 = new AlbumColeccion();
        album4.setNombre("The Game");
        album4.setImagen("albums/TheGame.jpg");
        album4.setFechaLanzamiento(LocalDate.of(1980, 6, 30));
        album4.setCanciones(canciones4);
        album4.setArtista(artista2);

        albumColeccion.insertOne(album4);

// 3. The Rolling Stones
        ArtistaColeccion artista3 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Rolling Stones");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista3 = artistaTemp;
        }

        CancionDoc cancion13 = new CancionDoc();
        cancion13.setId(new ObjectId());
        cancion13.setNombre("Paint It Black");

        CancionDoc cancion14 = new CancionDoc();
        cancion14.setId(new ObjectId());
        cancion14.setNombre("Angie");

        CancionDoc cancion15 = new CancionDoc();
        cancion15.setId(new ObjectId());
        cancion15.setNombre("Gimme Shelter");

        List<CancionDoc> canciones5 = new ArrayList<>();
        canciones5.add(cancion13);
        canciones5.add(cancion14);
        canciones5.add(cancion15);

        AlbumColeccion album5 = new AlbumColeccion();
        album5.setNombre("Let It Bleed");
        album5.setImagen("albums/LetItBleed.jpg");
        album5.setFechaLanzamiento(LocalDate.of(1969, 12, 5));
        album5.setCanciones(canciones5);
        album5.setArtista(artista3);

        albumColeccion.insertOne(album5);

        CancionDoc cancion16 = new CancionDoc();
        cancion16.setId(new ObjectId());
        cancion16.setNombre("Start Me Up");

        CancionDoc cancion17 = new CancionDoc();
        cancion17.setId(new ObjectId());
        cancion17.setNombre("Brown Sugar");

        CancionDoc cancion18 = new CancionDoc();
        cancion18.setId(new ObjectId());
        cancion18.setNombre("Jumpin' Jack Flash");

        List<CancionDoc> canciones6 = new ArrayList<>();
        canciones6.add(cancion16);
        canciones6.add(cancion17);
        canciones6.add(cancion18);

        AlbumColeccion album6 = new AlbumColeccion();
        album6.setNombre("Sticky Fingers");
        album6.setImagen("albums/StickyFingers.jpg");
        album6.setFechaLanzamiento(LocalDate.of(1971, 4, 23));
        album6.setCanciones(canciones6);
        album6.setArtista(artista3);

        albumColeccion.insertOne(album6);

// 4. Led Zeppelin
        ArtistaColeccion artista4 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Led Zeppelin");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista4 = artistaTemp;
        }

        CancionDoc cancion19 = new CancionDoc();
        cancion19.setId(new ObjectId());
        cancion19.setNombre("Stairway to Heaven");

        CancionDoc cancion20 = new CancionDoc();
        cancion20.setId(new ObjectId());
        cancion20.setNombre("Whole Lotta Love");

        CancionDoc cancion21 = new CancionDoc();
        cancion21.setId(new ObjectId());
        cancion21.setNombre("Kashmir");

        List<CancionDoc> canciones7 = new ArrayList<>();
        canciones7.add(cancion19);
        canciones7.add(cancion20);
        canciones7.add(cancion21);

        AlbumColeccion album7 = new AlbumColeccion();
        album7.setNombre("Led Zeppelin IV");
        album7.setImagen("albums/LedZeppelinIV.jpg");
        album7.setFechaLanzamiento(LocalDate.of(1971, 11, 8));
        album7.setCanciones(canciones7);
        album7.setArtista(artista4);

        albumColeccion.insertOne(album7);

        CancionDoc cancion22 = new CancionDoc();
        cancion22.setId(new ObjectId());
        cancion22.setNombre("Immigrant Song");

        CancionDoc cancion23 = new CancionDoc();
        cancion23.setId(new ObjectId());
        cancion23.setNombre("Black Dog");

        CancionDoc cancion24 = new CancionDoc();
        cancion24.setId(new ObjectId());
        cancion24.setNombre("Rock and Roll");

        List<CancionDoc> canciones8 = new ArrayList<>();
        canciones8.add(cancion22);
        canciones8.add(cancion23);
        canciones8.add(cancion24);

        AlbumColeccion album8 = new AlbumColeccion();
        album8.setNombre("Led Zeppelin II");
        album8.setImagen("albums/LedZeppelinII.jpg");
        album8.setFechaLanzamiento(LocalDate.of(1969, 10, 22));
        album8.setCanciones(canciones8);
        album8.setArtista(artista4);

        albumColeccion.insertOne(album8);

        // 5. Pink Floyd
        ArtistaColeccion artista5 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Pink Floyd");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista5 = artistaTemp;
        }

        CancionDoc cancion25 = new CancionDoc();
        cancion25.setId(new ObjectId());
        cancion25.setNombre("Comfortably Numb");

        CancionDoc cancion26 = new CancionDoc();
        cancion26.setId(new ObjectId());
        cancion26.setNombre("Another Brick in the Wall");

        CancionDoc cancion27 = new CancionDoc();
        cancion27.setId(new ObjectId());
        cancion27.setNombre("Wish You Were Here");

        List<CancionDoc> canciones9 = new ArrayList<>();
        canciones9.add(cancion25);
        canciones9.add(cancion26);
        canciones9.add(cancion27);

        AlbumColeccion album9 = new AlbumColeccion();
        album9.setNombre("The Wall");
        album9.setImagen("albums/TheWall.jpg");
        album9.setFechaLanzamiento(LocalDate.of(1979, 11, 30));
        album9.setCanciones(canciones9);
        album9.setArtista(artista5);

        albumColeccion.insertOne(album9);

        CancionDoc cancion28 = new CancionDoc();
        cancion28.setId(new ObjectId());
        cancion28.setNombre("Time");

        CancionDoc cancion29 = new CancionDoc();
        cancion29.setId(new ObjectId());
        cancion29.setNombre("Breathe");

        CancionDoc cancion30 = new CancionDoc();
        cancion30.setId(new ObjectId());
        cancion30.setNombre("Money");

        List<CancionDoc> canciones10 = new ArrayList<>();
        canciones10.add(cancion28);
        canciones10.add(cancion29);
        canciones10.add(cancion30);

        AlbumColeccion album10 = new AlbumColeccion();
        album10.setNombre("Dark Side of the Moon");
        album10.setImagen("albums/DarkSideOfTheMoon.jpg");
        album10.setFechaLanzamiento(LocalDate.of(1973, 3, 1));
        album10.setCanciones(canciones10);
        album10.setArtista(artista5);

        albumColeccion.insertOne(album10);

// 6. AC/DC
        ArtistaColeccion artista6 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "AC/DC");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista6 = artistaTemp;
        }

        CancionDoc cancion31 = new CancionDoc();
        cancion31.setId(new ObjectId());
        cancion31.setNombre("Back In Black");

        CancionDoc cancion32 = new CancionDoc();
        cancion32.setId(new ObjectId());
        cancion32.setNombre("Highway to Hell");

        CancionDoc cancion33 = new CancionDoc();
        cancion33.setId(new ObjectId());
        cancion33.setNombre("Thunderstruck");

        List<CancionDoc> canciones11 = new ArrayList<>();
        canciones11.add(cancion31);
        canciones11.add(cancion32);
        canciones11.add(cancion33);

        AlbumColeccion album11 = new AlbumColeccion();
        album11.setNombre("Back in Black");
        album11.setImagen("albums/BackInBlack.jpg");
        album11.setFechaLanzamiento(LocalDate.of(1980, 7, 25));
        album11.setCanciones(canciones11);
        album11.setArtista(artista6);

        albumColeccion.insertOne(album11);

        CancionDoc cancion34 = new CancionDoc();
        cancion34.setId(new ObjectId());
        cancion34.setNombre("You Shook Me All Night Long");

        CancionDoc cancion35 = new CancionDoc();
        cancion35.setId(new ObjectId());
        cancion35.setNombre("Hells Bells");

        CancionDoc cancion36 = new CancionDoc();
        cancion36.setId(new ObjectId());
        cancion36.setNombre("For Those About to Rock (We Salute You)");

        List<CancionDoc> canciones12 = new ArrayList<>();
        canciones12.add(cancion34);
        canciones12.add(cancion35);
        canciones12.add(cancion36);

        AlbumColeccion album12 = new AlbumColeccion();
        album12.setNombre("For Those About to Rock");
        album12.setImagen("albums/ForThoseAboutToRock.jpg");
        album12.setFechaLanzamiento(LocalDate.of(1981, 11, 23));
        album12.setCanciones(canciones12);
        album12.setArtista(artista6);

        albumColeccion.insertOne(album12);

// 7. The Doors
        ArtistaColeccion artista7 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Doors");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista7 = artistaTemp;
        }

        CancionDoc cancion37 = new CancionDoc();
        cancion37.setId(new ObjectId());
        cancion37.setNombre("Light My Fire");

        CancionDoc cancion38 = new CancionDoc();
        cancion38.setId(new ObjectId());
        cancion38.setNombre("Riders on the Storm");

        CancionDoc cancion39 = new CancionDoc();
        cancion39.setId(new ObjectId());
        cancion39.setNombre("Break on Through");

        List<CancionDoc> canciones13 = new ArrayList<>();
        canciones13.add(cancion37);
        canciones13.add(cancion38);
        canciones13.add(cancion39);

        AlbumColeccion album13 = new AlbumColeccion();
        album13.setNombre("The Doors");
        album13.setImagen("albums/TheDoors.jpg");
        album13.setFechaLanzamiento(LocalDate.of(1967, 1, 4));
        album13.setCanciones(canciones13);
        album13.setArtista(artista7);

        albumColeccion.insertOne(album13);

        CancionDoc cancion40 = new CancionDoc();
        cancion40.setId(new ObjectId());
        cancion40.setNombre("The End");

        CancionDoc cancion41 = new CancionDoc();
        cancion41.setId(new ObjectId());
        cancion41.setNombre("People Are Strange");

        CancionDoc cancion42 = new CancionDoc();
        cancion42.setId(new ObjectId());
        cancion42.setNombre("L.A. Woman");

        List<CancionDoc> canciones14 = new ArrayList<>();
        canciones14.add(cancion40);
        canciones14.add(cancion41);
        canciones14.add(cancion42);

        AlbumColeccion album14 = new AlbumColeccion();
        album14.setNombre("L.A. Woman");
        album14.setImagen("albums/LAWoman.jpg");
        album14.setFechaLanzamiento(LocalDate.of(1971, 4, 19));
        album14.setCanciones(canciones14);
        album14.setArtista(artista7);

        albumColeccion.insertOne(album14);

// 8. The Who
        ArtistaColeccion artista8 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Who");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista8 = artistaTemp;
        }

        CancionDoc cancion43 = new CancionDoc();
        cancion43.setId(new ObjectId());
        cancion43.setNombre("Baba O'Riley");

        CancionDoc cancion44 = new CancionDoc();
        cancion44.setId(new ObjectId());
        cancion44.setNombre("My Generation");

        CancionDoc cancion45 = new CancionDoc();
        cancion45.setId(new ObjectId());
        cancion45.setNombre("Pinball Wizard");

        List<CancionDoc> canciones15 = new ArrayList<>();
        canciones15.add(cancion43);
        canciones15.add(cancion44);
        canciones15.add(cancion45);

        AlbumColeccion album15 = new AlbumColeccion();
        album15.setNombre("Who's Next");
        album15.setImagen("albums/WhosNext.jpg");
        album15.setFechaLanzamiento(LocalDate.of(1971, 8, 14));
        album15.setCanciones(canciones15);
        album15.setArtista(artista8);

        albumColeccion.insertOne(album15);

        CancionDoc cancion46 = new CancionDoc();
        cancion46.setId(new ObjectId());
        cancion46.setNombre("Love Reign O'er Me");

        CancionDoc cancion47 = new CancionDoc();
        cancion47.setId(new ObjectId());
        cancion47.setNombre("Behind Blue Eyes");

        CancionDoc cancion48 = new CancionDoc();
        cancion48.setId(new ObjectId());
        cancion48.setNombre("The Seeker");

        List<CancionDoc> canciones16 = new ArrayList<>();
        canciones16.add(cancion46);
        canciones16.add(cancion47);
        canciones16.add(cancion48);

        AlbumColeccion album16 = new AlbumColeccion();
        album16.setNombre("Quadrophenia");
        album16.setImagen("albums/Quadrophenia.jpg");
        album16.setFechaLanzamiento(LocalDate.of(1973, 10, 26));
        album16.setCanciones(canciones16);
        album16.setArtista(artista8);

        albumColeccion.insertOne(album16);

// 9. The Clash
        ArtistaColeccion artista9 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Clash");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista9 = artistaTemp;
        }

        CancionDoc cancion49 = new CancionDoc();
        cancion49.setId(new ObjectId());
        cancion49.setNombre("London Calling");

        CancionDoc cancion50 = new CancionDoc();
        cancion50.setId(new ObjectId());
        cancion50.setNombre("Should I Stay or Should I Go");

        CancionDoc cancion51 = new CancionDoc();
        cancion51.setId(new ObjectId());
        cancion51.setNombre("Rock the Casbah");

        List<CancionDoc> canciones17 = new ArrayList<>();
        canciones17.add(cancion49);
        canciones17.add(cancion50);
        canciones17.add(cancion51);

        AlbumColeccion album17 = new AlbumColeccion();
        album17.setNombre("London Calling");
        album17.setImagen("albums/LondonCalling.jpg");
        album17.setFechaLanzamiento(LocalDate.of(1979, 12, 14));
        album17.setCanciones(canciones17);
        album17.setArtista(artista9);

        albumColeccion.insertOne(album17);

        CancionDoc cancion52 = new CancionDoc();
        cancion52.setId(new ObjectId());
        cancion52.setNombre("The Guns of Brixton");

        CancionDoc cancion53 = new CancionDoc();
        cancion53.setId(new ObjectId());
        cancion53.setNombre("Clampdown");

        CancionDoc cancion54 = new CancionDoc();
        cancion54.setId(new ObjectId());
        cancion54.setNombre("Spanish Bombs");

        List<CancionDoc> canciones18 = new ArrayList<>();
        canciones18.add(cancion52);
        canciones18.add(cancion53);
        canciones18.add(cancion54);

        AlbumColeccion album18 = new AlbumColeccion();
        album18.setNombre("Combat Rock");
        album18.setImagen("albums/CombatRock.jpg");
        album18.setFechaLanzamiento(LocalDate.of(1982, 5, 14));
        album18.setCanciones(canciones18);
        album18.setArtista(artista9);

        albumColeccion.insertOne(album18);

// 10. Nirvana
        ArtistaColeccion artista10 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Nirvana");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista10 = artistaTemp;
        }

        CancionDoc cancion55 = new CancionDoc();
        cancion55.setId(new ObjectId());
        cancion55.setNombre("Smells Like Teen Spirit");

        CancionDoc cancion56 = new CancionDoc();
        cancion56.setId(new ObjectId());
        cancion56.setNombre("Come as You Are");

        CancionDoc cancion57 = new CancionDoc();
        cancion57.setId(new ObjectId());
        cancion57.setNombre("Lithium");

        List<CancionDoc> canciones19 = new ArrayList<>();
        canciones19.add(cancion55);
        canciones19.add(cancion56);
        canciones19.add(cancion57);

        AlbumColeccion album19 = new AlbumColeccion();
        album19.setNombre("Nevermind");
        album19.setImagen("albums/Nevermind.jpg");
        album19.setFechaLanzamiento(LocalDate.of(1991, 9, 24));
        album19.setCanciones(canciones19);
        album19.setArtista(artista10);

        albumColeccion.insertOne(album19);

        CancionDoc cancion58 = new CancionDoc();
        cancion58.setId(new ObjectId());
        cancion58.setNombre("Heart-Shaped Box");

        CancionDoc cancion59 = new CancionDoc();
        cancion59.setId(new ObjectId());
        cancion59.setNombre("All Apologies");

        CancionDoc cancion60 = new CancionDoc();
        cancion60.setId(new ObjectId());
        cancion60.setNombre("Rape Me");

        List<CancionDoc> canciones20 = new ArrayList<>();
        canciones20.add(cancion58);
        canciones20.add(cancion59);
        canciones20.add(cancion60);

        AlbumColeccion album20 = new AlbumColeccion();
        album20.setNombre("In Utero");
        album20.setImagen("albums/InUtero.jpg");
        album20.setFechaLanzamiento(LocalDate.of(1993, 9, 13));
        album20.setCanciones(canciones20);
        album20.setArtista(artista10);

        albumColeccion.insertOne(album20);

// 11. Red Hot Chili Peppers
        ArtistaColeccion artista11 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Red Hot Chili Peppers");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista11 = artistaTemp;
        }

        CancionDoc cancion61 = new CancionDoc();
        cancion61.setId(new ObjectId());
        cancion61.setNombre("Under the Bridge");

        CancionDoc cancion62 = new CancionDoc();
        cancion62.setId(new ObjectId());
        cancion62.setNombre("Give It Away");

        CancionDoc cancion63 = new CancionDoc();
        cancion63.setId(new ObjectId());
        cancion63.setNombre("Californication");

        List<CancionDoc> canciones21 = new ArrayList<>();
        canciones21.add(cancion61);
        canciones21.add(cancion62);
        canciones21.add(cancion63);

        AlbumColeccion album21 = new AlbumColeccion();
        album21.setNombre("Californication");
        album21.setImagen("albums/Californication.jpg");
        album21.setFechaLanzamiento(LocalDate.of(1999, 6, 8));
        album21.setCanciones(canciones21);
        album21.setArtista(artista11);

        albumColeccion.insertOne(album21);

        CancionDoc cancion64 = new CancionDoc();
        cancion64.setId(new ObjectId());
        cancion64.setNombre("Scar Tissue");

        CancionDoc cancion65 = new CancionDoc();
        cancion65.setId(new ObjectId());
        cancion65.setNombre("By the Way");

        CancionDoc cancion66 = new CancionDoc();
        cancion66.setId(new ObjectId());
        cancion66.setNombre("Snow (Hey Oh)");

        List<CancionDoc> canciones22 = new ArrayList<>();
        canciones22.add(cancion64);
        canciones22.add(cancion65);
        canciones22.add(cancion66);

        AlbumColeccion album22 = new AlbumColeccion();
        album22.setNombre("By the Way");
        album22.setImagen("albums/ByTheWay.jpg");
        album22.setFechaLanzamiento(LocalDate.of(2002, 7, 9));
        album22.setCanciones(canciones22);
        album22.setArtista(artista11);

        albumColeccion.insertOne(album22);

// 12. Metallica
        ArtistaColeccion artista12 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Metallica");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista12 = artistaTemp;
        }

        CancionDoc cancion67 = new CancionDoc();
        cancion67.setId(new ObjectId());
        cancion67.setNombre("Enter Sandman");

        CancionDoc cancion68 = new CancionDoc();
        cancion68.setId(new ObjectId());
        cancion68.setNombre("One");

        CancionDoc cancion69 = new CancionDoc();
        cancion69.setId(new ObjectId());
        cancion69.setNombre("Sad But True");

        List<CancionDoc> canciones23 = new ArrayList<>();
        canciones23.add(cancion67);
        canciones23.add(cancion68);
        canciones23.add(cancion69);

        AlbumColeccion album23 = new AlbumColeccion();
        album23.setNombre("Metallica (Black Album)");
        album23.setImagen("albums/MetallicaBlackAlbum.jpg");
        album23.setFechaLanzamiento(LocalDate.of(1991, 8, 12));
        album23.setCanciones(canciones23);
        album23.setArtista(artista12);

        albumColeccion.insertOne(album23);

        CancionDoc cancion70 = new CancionDoc();
        cancion70.setId(new ObjectId());
        cancion70.setNombre("Master of Puppets");

        CancionDoc cancion71 = new CancionDoc();
        cancion71.setId(new ObjectId());
        cancion71.setNombre("Battery");

        CancionDoc cancion72 = new CancionDoc();
        cancion72.setId(new ObjectId());
        cancion72.setNombre("Damage, Inc.");

        List<CancionDoc> canciones24 = new ArrayList<>();
        canciones24.add(cancion70);
        canciones24.add(cancion71);
        canciones24.add(cancion72);

        AlbumColeccion album24 = new AlbumColeccion();
        album24.setNombre("Master of Puppets");
        album24.setImagen("albums/MasterOfPuppets.jpg");
        album24.setFechaLanzamiento(LocalDate.of(1986, 3, 3));
        album24.setCanciones(canciones24);
        album24.setArtista(artista12);

        albumColeccion.insertOne(album24);

// 13. U2
        ArtistaColeccion artista13 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "U2");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista13 = artistaTemp;
        }

        CancionDoc cancion73 = new CancionDoc();
        cancion73.setId(new ObjectId());
        cancion73.setNombre("With or Without You");

        CancionDoc cancion74 = new CancionDoc();
        cancion74.setId(new ObjectId());
        cancion74.setNombre("I Still Haven't Found What I'm Looking For");

        CancionDoc cancion75 = new CancionDoc();
        cancion75.setId(new ObjectId());
        cancion75.setNombre("Where the Streets Have No Name");

        List<CancionDoc> canciones25 = new ArrayList<>();
        canciones25.add(cancion73);
        canciones25.add(cancion74);
        canciones25.add(cancion75);

        AlbumColeccion album25 = new AlbumColeccion();
        album25.setNombre("The Joshua Tree");
        album25.setImagen("albums/TheJoshuaTree.jpg");
        album25.setFechaLanzamiento(LocalDate.of(1987, 3, 9));
        album25.setCanciones(canciones25);
        album25.setArtista(artista13);

        albumColeccion.insertOne(album25);

        CancionDoc cancion76 = new CancionDoc();
        cancion76.setId(new ObjectId());
        cancion76.setNombre("Mysterious Ways");

        CancionDoc cancion77 = new CancionDoc();
        cancion77.setId(new ObjectId());
        cancion77.setNombre("Beautiful Day");

        CancionDoc cancion78 = new CancionDoc();
        cancion78.setId(new ObjectId());
        cancion78.setNombre("Elevation");

        List<CancionDoc> canciones26 = new ArrayList<>();
        canciones26.add(cancion76);
        canciones26.add(cancion77);
        canciones26.add(cancion78);

        AlbumColeccion album26 = new AlbumColeccion();
        album26.setNombre("All That You Can't Leave Behind");
        album26.setImagen("albums/AllThatYouCantLeaveBehind.jpg");
        album26.setFechaLanzamiento(LocalDate.of(2000, 10, 30));
        album26.setCanciones(canciones26);
        album26.setArtista(artista13);

        albumColeccion.insertOne(album26);

// 14. Green Day
        ArtistaColeccion artista14 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Green Day");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista14 = artistaTemp;
        }

        CancionDoc cancion79 = new CancionDoc();
        cancion79.setId(new ObjectId());
        cancion79.setNombre("Boulevard of Broken Dreams");

        CancionDoc cancion80 = new CancionDoc();
        cancion80.setId(new ObjectId());
        cancion80.setNombre("Wake Me Up When September Ends");

        CancionDoc cancion81 = new CancionDoc();
        cancion81.setId(new ObjectId());
        cancion81.setNombre("Holiday");

        List<CancionDoc> canciones27 = new ArrayList<>();
        canciones27.add(cancion79);
        canciones27.add(cancion80);
        canciones27.add(cancion81);

        AlbumColeccion album27 = new AlbumColeccion();
        album27.setNombre("American Idiot");
        album27.setImagen("albums/AmericanIdiot.jpg");
        album27.setFechaLanzamiento(LocalDate.of(2004, 9, 21));
        album27.setCanciones(canciones27);
        album27.setArtista(artista14);

        albumColeccion.insertOne(album27);

        CancionDoc cancion82 = new CancionDoc();
        cancion82.setId(new ObjectId());
        cancion82.setNombre("21 Guns");

        CancionDoc cancion83 = new CancionDoc();
        cancion83.setId(new ObjectId());
        cancion83.setNombre("Know Your Enemy");

        CancionDoc cancion84 = new CancionDoc();
        cancion84.setId(new ObjectId());
        cancion84.setNombre("Minority");

        List<CancionDoc> canciones28 = new ArrayList<>();
        canciones28.add(cancion82);
        canciones28.add(cancion83);
        canciones28.add(cancion84);

        AlbumColeccion album28 = new AlbumColeccion();
        album28.setNombre("Warning");
        album28.setImagen("albums/Warning.jpg");
        album28.setFechaLanzamiento(LocalDate.of(2000, 10, 3));
        album28.setCanciones(canciones28);
        album28.setArtista(artista14);

        albumColeccion.insertOne(album28);

// 15. Fleetwood Mac
        ArtistaColeccion artista15 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Fleetwood Mac");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista15 = artistaTemp;
        }

        CancionDoc cancion85 = new CancionDoc();
        cancion85.setId(new ObjectId());
        cancion85.setNombre("Go Your Own Way");

        CancionDoc cancion86 = new CancionDoc();
        cancion86.setId(new ObjectId());
        cancion86.setNombre("Rhiannon");

        CancionDoc cancion87 = new CancionDoc();
        cancion87.setId(new ObjectId());
        cancion87.setNombre("Landslide");

        List<CancionDoc> canciones29 = new ArrayList<>();
        canciones29.add(cancion85);
        canciones29.add(cancion86);
        canciones29.add(cancion87);

        AlbumColeccion album29 = new AlbumColeccion();
        album29.setNombre("Rumours");
        album29.setImagen("albums/Rumours.jpg");
        album29.setFechaLanzamiento(LocalDate.of(1977, 2, 4));
        album29.setCanciones(canciones29);
        album29.setArtista(artista15);

        albumColeccion.insertOne(album29);

        CancionDoc cancion88 = new CancionDoc();
        cancion88.setId(new ObjectId());
        cancion88.setNombre("The Chain");

        CancionDoc cancion89 = new CancionDoc();
        cancion89.setId(new ObjectId());
        cancion89.setNombre("Don't Stop");

        CancionDoc cancion90 = new CancionDoc();
        cancion90.setId(new ObjectId());
        cancion90.setNombre("Silver Springs");

        List<CancionDoc> canciones30 = new ArrayList<>();
        canciones30.add(cancion88);
        canciones30.add(cancion89);
        canciones30.add(cancion90);

        AlbumColeccion album30 = new AlbumColeccion();
        album30.setNombre("Fleetwood Mac");
        album30.setImagen("albums/FleetwoodMac.jpg");
        album30.setFechaLanzamiento(LocalDate.of(1975, 7, 11));
        album30.setCanciones(canciones30);
        album30.setArtista(artista15);

        albumColeccion.insertOne(album30);

// 16. Imagine Dragons
        ArtistaColeccion artista16 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Imagine Dragons");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista16 = artistaTemp;
        }

        CancionDoc cancion91 = new CancionDoc();
        cancion91.setId(new ObjectId());
        cancion91.setNombre("Radioactive");

        CancionDoc cancion92 = new CancionDoc();
        cancion92.setId(new ObjectId());
        cancion92.setNombre("Demons");

        CancionDoc cancion93 = new CancionDoc();
        cancion93.setId(new ObjectId());
        cancion93.setNombre("It's Time");

        List<CancionDoc> canciones31 = new ArrayList<>();
        canciones31.add(cancion91);
        canciones31.add(cancion92);
        canciones31.add(cancion93);

        AlbumColeccion album31 = new AlbumColeccion();
        album31.setNombre("Night Visions");
        album31.setImagen("albums/NightVisions.jpg");
        album31.setFechaLanzamiento(LocalDate.of(2012, 9, 4));
        album31.setCanciones(canciones31);
        album31.setArtista(artista16);

        albumColeccion.insertOne(album31);

        CancionDoc cancion94 = new CancionDoc();
        cancion94.setId(new ObjectId());
        cancion94.setNombre("Believer");

        CancionDoc cancion95 = new CancionDoc();
        cancion95.setId(new ObjectId());
        cancion95.setNombre("Thunder");

        CancionDoc cancion96 = new CancionDoc();
        cancion96.setId(new ObjectId());
        cancion96.setNombre("Whatever It Takes");

        List<CancionDoc> canciones32 = new ArrayList<>();
        canciones32.add(cancion94);
        canciones32.add(cancion95);
        canciones32.add(cancion96);

        AlbumColeccion album32 = new AlbumColeccion();
        album32.setNombre("Evolve");
        album32.setImagen("albums/Evolve.jpg");
        album32.setFechaLanzamiento(LocalDate.of(2017, 6, 23));
        album32.setCanciones(canciones32);
        album32.setArtista(artista16);

        albumColeccion.insertOne(album32);

// 17. The Killers
        ArtistaColeccion artista17 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Killers");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista17 = artistaTemp;
        }

        CancionDoc cancion97 = new CancionDoc();
        cancion97.setId(new ObjectId());
        cancion97.setNombre("Mr. Brightside");

        CancionDoc cancion98 = new CancionDoc();
        cancion98.setId(new ObjectId());
        cancion98.setNombre("Somebody Told Me");

        CancionDoc cancion99 = new CancionDoc();
        cancion99.setId(new ObjectId());
        cancion99.setNombre("When You Were Young");

        List<CancionDoc> canciones33 = new ArrayList<>();
        canciones33.add(cancion97);
        canciones33.add(cancion98);
        canciones33.add(cancion99);

        AlbumColeccion album33 = new AlbumColeccion();
        album33.setNombre("Hot Fuss");
        album33.setImagen("albums/HotFuss.jpg");
        album33.setFechaLanzamiento(LocalDate.of(2004, 6, 7));
        album33.setCanciones(canciones33);
        album33.setArtista(artista17);

        albumColeccion.insertOne(album33);

        CancionDoc cancion100 = new CancionDoc();
        cancion100.setId(new ObjectId());
        cancion100.setNombre("The Man");

        CancionDoc cancion101 = new CancionDoc();
        cancion101.setId(new ObjectId());
        cancion101.setNombre("Run for Cover");

        CancionDoc cancion102 = new CancionDoc();
        cancion102.setId(new ObjectId());
        cancion102.setNombre("Caution");

        List<CancionDoc> canciones34 = new ArrayList<>();
        canciones34.add(cancion100);
        canciones34.add(cancion101);
        canciones34.add(cancion102);

        AlbumColeccion album34 = new AlbumColeccion();
        album34.setNombre("Imploding the Mirage");
        album34.setImagen("albums/ImplodingTheMirage.jpg");
        album34.setFechaLanzamiento(LocalDate.of(2020, 8, 21));
        album34.setCanciones(canciones34);
        album34.setArtista(artista17);

        albumColeccion.insertOne(album34);

// 18. Coldplay
        ArtistaColeccion artista18 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Coldplay");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista18 = artistaTemp;
        }

        CancionDoc cancion103 = new CancionDoc();
        cancion103.setId(new ObjectId());
        cancion103.setNombre("Yellow");

        CancionDoc cancion104 = new CancionDoc();
        cancion104.setId(new ObjectId());
        cancion104.setNombre("The Scientist");

        CancionDoc cancion105 = new CancionDoc();
        cancion105.setId(new ObjectId());
        cancion105.setNombre("Clocks");

        List<CancionDoc> canciones35 = new ArrayList<>();
        canciones35.add(cancion103);
        canciones35.add(cancion104);
        canciones35.add(cancion105);

        AlbumColeccion album35 = new AlbumColeccion();
        album35.setNombre("A Rush of Blood to the Head");
        album35.setImagen("albums/ARushOfBloodToTheHead.jpg");
        album35.setFechaLanzamiento(LocalDate.of(2002, 8, 26));
        album35.setCanciones(canciones35);
        album35.setArtista(artista18);

        albumColeccion.insertOne(album35);

        CancionDoc cancion106 = new CancionDoc();
        cancion106.setId(new ObjectId());
        cancion106.setNombre("Viva La Vida");

        CancionDoc cancion107 = new CancionDoc();
        cancion107.setId(new ObjectId());
        cancion107.setNombre("Fix You");

        CancionDoc cancion108 = new CancionDoc();
        cancion108.setId(new ObjectId());
        cancion108.setNombre("Paradise");

        List<CancionDoc> canciones36 = new ArrayList<>();
        canciones36.add(cancion106);
        canciones36.add(cancion107);
        canciones36.add(cancion108);

        AlbumColeccion album36 = new AlbumColeccion();
        album36.setNombre("Viva la Vida or Death and All His Friends");
        album36.setImagen("albums/VivaLaVida.jpg");
        album36.setFechaLanzamiento(LocalDate.of(2008, 6, 12));
        album36.setCanciones(canciones36);
        album36.setArtista(artista18);

        albumColeccion.insertOne(album36);

// 19. Muse
        ArtistaColeccion artista19 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Muse");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista19 = artistaTemp;
        }

        CancionDoc cancion109 = new CancionDoc();
        cancion109.setId(new ObjectId());
        cancion109.setNombre("Starlight");

        CancionDoc cancion110 = new CancionDoc();
        cancion110.setId(new ObjectId());
        cancion110.setNombre("Supermassive Black Hole");

        CancionDoc cancion111 = new CancionDoc();
        cancion111.setId(new ObjectId());
        cancion111.setNombre("Hysteria");

        List<CancionDoc> canciones37 = new ArrayList<>();
        canciones37.add(cancion109);
        canciones37.add(cancion110);
        canciones37.add(cancion111);

        AlbumColeccion album37 = new AlbumColeccion();
        album37.setNombre("Black Holes and Revelations");
        album37.setImagen("albums/BlackHolesAndRevelations.jpg");
        album37.setFechaLanzamiento(LocalDate.of(2006, 7, 3));
        album37.setCanciones(canciones37);
        album37.setArtista(artista19);

        albumColeccion.insertOne(album37);

        CancionDoc cancion112 = new CancionDoc();
        cancion112.setId(new ObjectId());
        cancion112.setNombre("Uprising");

        CancionDoc cancion113 = new CancionDoc();
        cancion113.setId(new ObjectId());
        cancion113.setNombre("Resistance");

        CancionDoc cancion114 = new CancionDoc();
        cancion114.setId(new ObjectId());
        cancion114.setNombre("Undisclosed Desires");

        List<CancionDoc> canciones38 = new ArrayList<>();
        canciones38.add(cancion112);
        canciones38.add(cancion113);
        canciones38.add(cancion114);

        AlbumColeccion album38 = new AlbumColeccion();
        album38.setNombre("The Resistance");
        album38.setImagen("albums/TheResistance.jpg");
        album38.setFechaLanzamiento(LocalDate.of(2009, 9, 14));
        album38.setCanciones(canciones38);
        album38.setArtista(artista19);

        albumColeccion.insertOne(album38);

// 20. Linkin Park
        ArtistaColeccion artista20 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Linkin Park");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista20 = artistaTemp;
        }

        CancionDoc cancion115 = new CancionDoc();
        cancion115.setId(new ObjectId());
        cancion115.setNombre("In the End");

        CancionDoc cancion116 = new CancionDoc();
        cancion116.setId(new ObjectId());
        cancion116.setNombre("Numb");

        CancionDoc cancion117 = new CancionDoc();
        cancion117.setId(new ObjectId());
        cancion117.setNombre("Crawling");

        List<CancionDoc> canciones39 = new ArrayList<>();
        canciones39.add(cancion115);
        canciones39.add(cancion116);
        canciones39.add(cancion117);

        AlbumColeccion album39 = new AlbumColeccion();
        album39.setNombre("Hybrid Theory");
        album39.setImagen("albums/HybridTheory.jpg");
        album39.setFechaLanzamiento(LocalDate.of(2000, 10, 24));
        album39.setCanciones(canciones39);
        album39.setArtista(artista20);

        albumColeccion.insertOne(album39);

        CancionDoc cancion118 = new CancionDoc();
        cancion118.setId(new ObjectId());
        cancion118.setNombre("Burn It Down");

        CancionDoc cancion119 = new CancionDoc();
        cancion119.setId(new ObjectId());
        cancion119.setNombre("Castle of Glass");

        CancionDoc cancion120 = new CancionDoc();
        cancion120.setId(new ObjectId());
        cancion120.setNombre("Somewhere I Belong");

        List<CancionDoc> canciones40 = new ArrayList<>();
        canciones40.add(cancion118);
        canciones40.add(cancion119);
        canciones40.add(cancion120);

        AlbumColeccion album40 = new AlbumColeccion();
        album40.setNombre("Living Things");
        album40.setImagen("albums/LivingThings.jpg");
        album40.setFechaLanzamiento(LocalDate.of(2012, 6, 26));
        album40.setCanciones(canciones40);
        album40.setArtista(artista20);

        albumColeccion.insertOne(album40);

// 21. Maroon 5
        ArtistaColeccion artista21 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Maroon 5");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista21 = artistaTemp;
        }

        CancionDoc cancion121 = new CancionDoc();
        cancion121.setId(new ObjectId());
        cancion121.setNombre("This Love");

        CancionDoc cancion122 = new CancionDoc();
        cancion122.setId(new ObjectId());
        cancion122.setNombre("She Will Be Loved");

        CancionDoc cancion123 = new CancionDoc();
        cancion123.setId(new ObjectId());
        cancion123.setNombre("Harder to Breathe");

        List<CancionDoc> canciones41 = new ArrayList<>();
        canciones41.add(cancion121);
        canciones41.add(cancion122);
        canciones41.add(cancion123);

        AlbumColeccion album41 = new AlbumColeccion();
        album41.setNombre("Songs About Jane");
        album41.setImagen("albums/SongsAboutJane.jpg");
        album41.setFechaLanzamiento(LocalDate.of(2002, 6, 25));
        album41.setCanciones(canciones41);
        album41.setArtista(artista21);

        albumColeccion.insertOne(album41);

        CancionDoc cancion124 = new CancionDoc();
        cancion124.setId(new ObjectId());
        cancion124.setNombre("Sugar");

        CancionDoc cancion125 = new CancionDoc();
        cancion125.setId(new ObjectId());
        cancion125.setNombre("One More Night");

        CancionDoc cancion126 = new CancionDoc();
        cancion126.setId(new ObjectId());
        cancion126.setNombre("Maps");

        List<CancionDoc> canciones42 = new ArrayList<>();
        canciones42.add(cancion124);
        canciones42.add(cancion125);
        canciones42.add(cancion126);

        AlbumColeccion album42 = new AlbumColeccion();
        album42.setNombre("V");
        album42.setImagen("albums/V.jpg");
        album42.setFechaLanzamiento(LocalDate.of(2014, 9, 1));
        album42.setCanciones(canciones42);
        album42.setArtista(artista21);

        albumColeccion.insertOne(album42);

// 22. The Police
        ArtistaColeccion artista22 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Police");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista22 = artistaTemp;
        }

        CancionDoc cancion127 = new CancionDoc();
        cancion127.setId(new ObjectId());
        cancion127.setNombre("Every Breath You Take");

        CancionDoc cancion128 = new CancionDoc();
        cancion128.setId(new ObjectId());
        cancion128.setNombre("Roxanne");

        CancionDoc cancion129 = new CancionDoc();
        cancion129.setId(new ObjectId());
        cancion129.setNombre("Message in a Bottle");

        List<CancionDoc> canciones43 = new ArrayList<>();
        canciones43.add(cancion127);
        canciones43.add(cancion128);
        canciones43.add(cancion129);

        AlbumColeccion album43 = new AlbumColeccion();
        album43.setNombre("Synchronicity");
        album43.setImagen("albums/Synchronicity.jpg");
        album43.setFechaLanzamiento(LocalDate.of(1983, 6, 17));
        album43.setCanciones(canciones43);
        album43.setArtista(artista22);

        albumColeccion.insertOne(album43);

        CancionDoc cancion130 = new CancionDoc();
        cancion130.setId(new ObjectId());
        cancion130.setNombre("Walking on the Moon");

        CancionDoc cancion131 = new CancionDoc();
        cancion131.setId(new ObjectId());
        cancion131.setNombre("Can't Stand Losing You");

        CancionDoc cancion132 = new CancionDoc();
        cancion132.setId(new ObjectId());
        cancion132.setNombre("So Lonely");

        List<CancionDoc> canciones44 = new ArrayList<>();
        canciones44.add(cancion130);
        canciones44.add(cancion131);
        canciones44.add(cancion132);

        AlbumColeccion album44 = new AlbumColeccion();
        album44.setNombre("Outlandos d'Amour");
        album44.setImagen("albums/OutlandosDAmour.jpg");
        album44.setFechaLanzamiento(LocalDate.of(1978, 11, 2));
        album44.setCanciones(canciones44);
        album44.setArtista(artista22);

        albumColeccion.insertOne(album44);

// 23. Eagles
        ArtistaColeccion artista23 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Eagles");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista23 = artistaTemp;
        }

        CancionDoc cancion133 = new CancionDoc();
        cancion133.setId(new ObjectId());
        cancion133.setNombre("Hotel California");

        CancionDoc cancion134 = new CancionDoc();
        cancion134.setId(new ObjectId());
        cancion134.setNombre("Take It Easy");

        CancionDoc cancion135 = new CancionDoc();
        cancion135.setId(new ObjectId());
        cancion135.setNombre("New Kid in Town");

        List<CancionDoc> canciones45 = new ArrayList<>();
        canciones45.add(cancion133);
        canciones45.add(cancion134);
        canciones45.add(cancion135);

        AlbumColeccion album45 = new AlbumColeccion();
        album45.setNombre("Hotel California");
        album45.setImagen("albums/HotelCalifornia.jpg");
        album45.setFechaLanzamiento(LocalDate.of(1976, 12, 8));
        album45.setCanciones(canciones45);
        album45.setArtista(artista23);

        albumColeccion.insertOne(album45);

        CancionDoc cancion136 = new CancionDoc();
        cancion136.setId(new ObjectId());
        cancion136.setNombre("Life in the Fast Lane");

        CancionDoc cancion137 = new CancionDoc();
        cancion137.setId(new ObjectId());
        cancion137.setNombre("Desperado");

        CancionDoc cancion138 = new CancionDoc();
        cancion138.setId(new ObjectId());
        cancion138.setNombre("Witchy Woman");

        List<CancionDoc> canciones46 = new ArrayList<>();
        canciones46.add(cancion136);
        canciones46.add(cancion137);
        canciones46.add(cancion138);

        AlbumColeccion album46 = new AlbumColeccion();
        album46.setNombre("Their Greatest Hits 1971–1975");
        album46.setImagen("albums/TheirGreatestHits.jpg");
        album46.setFechaLanzamiento(LocalDate.of(1976, 2, 7));
        album46.setCanciones(canciones46);
        album46.setArtista(artista23);

        albumColeccion.insertOne(album46);

// 24. Paramore
        ArtistaColeccion artista24 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Paramore");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista24 = artistaTemp;
        }

        CancionDoc cancion139 = new CancionDoc();
        cancion139.setId(new ObjectId());
        cancion139.setNombre("Misery Business");

        CancionDoc cancion140 = new CancionDoc();
        cancion140.setId(new ObjectId());
        cancion140.setNombre("Crushcrushcrush");

        CancionDoc cancion141 = new CancionDoc();
        cancion141.setId(new ObjectId());
        cancion141.setNombre("That's What You Get");

        List<CancionDoc> canciones47 = new ArrayList<>();
        canciones47.add(cancion139);
        canciones47.add(cancion140);
        canciones47.add(cancion141);

        AlbumColeccion album47 = new AlbumColeccion();
        album47.setNombre("Riot!");
        album47.setImagen("albums/Riot.jpg");
        album47.setFechaLanzamiento(LocalDate.of(2007, 6, 12));
        album47.setCanciones(canciones47);
        album47.setArtista(artista24);

        albumColeccion.insertOne(album47);

        CancionDoc cancion142 = new CancionDoc();
        cancion142.setId(new ObjectId());
        cancion142.setNombre("Still into You");

        CancionDoc cancion143 = new CancionDoc();
        cancion143.setId(new ObjectId());
        cancion143.setNombre("Ain't It Fun");

        CancionDoc cancion144 = new CancionDoc();
        cancion144.setId(new ObjectId());
        cancion144.setNombre("Brick by Boring Brick");

        List<CancionDoc> canciones48 = new ArrayList<>();
        canciones48.add(cancion142);
        canciones48.add(cancion143);
        canciones48.add(cancion144);

        AlbumColeccion album48 = new AlbumColeccion();
        album48.setNombre("Paramore");
        album48.setImagen("albums/Paramore.jpg");
        album48.setFechaLanzamiento(LocalDate.of(2013, 4, 5));
        album48.setCanciones(canciones48);
        album48.setArtista(artista24);

        albumColeccion.insertOne(album48);

// 25. Fall Out Boy
        ArtistaColeccion artista25 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Fall Out Boy");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista25 = artistaTemp;
        }

        CancionDoc cancion145 = new CancionDoc();
        cancion145.setId(new ObjectId());
        cancion145.setNombre("Sugar, We're Goin Down");

        CancionDoc cancion146 = new CancionDoc();
        cancion146.setId(new ObjectId());
        cancion146.setNombre("Dance, Dance");

        CancionDoc cancion147 = new CancionDoc();
        cancion147.setId(new ObjectId());
        cancion147.setNombre("Thnks fr th Mmrs");

        List<CancionDoc> canciones49 = new ArrayList<>();
        canciones49.add(cancion145);
        canciones49.add(cancion146);
        canciones49.add(cancion147);

        AlbumColeccion album49 = new AlbumColeccion();
        album49.setNombre("From Under the Cork Tree");
        album49.setImagen("albums/FromUnderTheCorkTree.jpg");
        album49.setFechaLanzamiento(LocalDate.of(2005, 5, 3));
        album49.setCanciones(canciones49);
        album49.setArtista(artista25);

        albumColeccion.insertOne(album49);

        CancionDoc cancion148 = new CancionDoc();
        cancion148.setId(new ObjectId());
        cancion148.setNombre("I Don't Care");

        CancionDoc cancion149 = new CancionDoc();
        cancion149.setId(new ObjectId());
        cancion149.setNombre("This Ain't a Scene, It's an Arms Race");

        CancionDoc cancion150 = new CancionDoc();
        cancion150.setId(new ObjectId());
        cancion150.setNombre("Beat It");

        List<CancionDoc> canciones50 = new ArrayList<>();
        canciones50.add(cancion148);
        canciones50.add(cancion149);
        canciones50.add(cancion150);

        AlbumColeccion album50 = new AlbumColeccion();
        album50.setNombre("Infinity on High");
        album50.setImagen("albums/InfinityOnHigh.jpg");
        album50.setFechaLanzamiento(LocalDate.of(2007, 2, 6));
        album50.setCanciones(canciones50);
        album50.setArtista(artista25);

        albumColeccion.insertOne(album50);

// 26. Black Sabbath
        ArtistaColeccion artista26 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Black Sabbath");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista26 = artistaTemp;
        }

        CancionDoc cancion151 = new CancionDoc();
        cancion151.setId(new ObjectId());
        cancion151.setNombre("Iron Man");

        CancionDoc cancion152 = new CancionDoc();
        cancion152.setId(new ObjectId());
        cancion152.setNombre("Paranoid");

        CancionDoc cancion153 = new CancionDoc();
        cancion153.setId(new ObjectId());
        cancion153.setNombre("War Pigs");

        List<CancionDoc> canciones51 = new ArrayList<>();
        canciones51.add(cancion151);
        canciones51.add(cancion152);
        canciones51.add(cancion153);

        AlbumColeccion album51 = new AlbumColeccion();
        album51.setNombre("Paranoid");
        album51.setImagen("albums/Paranoid.jpg");
        album51.setFechaLanzamiento(LocalDate.of(1970, 9, 18));
        album51.setCanciones(canciones51);
        album51.setArtista(artista26);

        albumColeccion.insertOne(album51);

        CancionDoc cancion154 = new CancionDoc();
        cancion154.setId(new ObjectId());
        cancion154.setNombre("Black Sabbath");

        CancionDoc cancion155 = new CancionDoc();
        cancion155.setId(new ObjectId());
        cancion155.setNombre("N.I.B.");

        CancionDoc cancion156 = new CancionDoc();
        cancion156.setId(new ObjectId());
        cancion156.setNombre("Fairies Wear Boots");

        List<CancionDoc> canciones52 = new ArrayList<>();
        canciones52.add(cancion154);
        canciones52.add(cancion155);
        canciones52.add(cancion156);

        AlbumColeccion album52 = new AlbumColeccion();
        album52.setNombre("Black Sabbath");
        album52.setImagen("albums/BlackSabbath.jpg");
        album52.setFechaLanzamiento(LocalDate.of(1970, 2, 13));
        album52.setCanciones(canciones52);
        album52.setArtista(artista26);

        albumColeccion.insertOne(album52);

// 27. Radiohead
        ArtistaColeccion artista27 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Radiohead");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista27 = artistaTemp;
        }

        CancionDoc cancion157 = new CancionDoc();
        cancion157.setId(new ObjectId());
        cancion157.setNombre("Creep");

        CancionDoc cancion158 = new CancionDoc();
        cancion158.setId(new ObjectId());
        cancion158.setNombre("Karma Police");

        CancionDoc cancion159 = new CancionDoc();
        cancion159.setId(new ObjectId());
        cancion159.setNombre("No Surprises");

        List<CancionDoc> canciones53 = new ArrayList<>();
        canciones53.add(cancion157);
        canciones53.add(cancion158);
        canciones53.add(cancion159);

        AlbumColeccion album53 = new AlbumColeccion();
        album53.setNombre("OK Computer");
        album53.setImagen("albums/OKComputer.jpg");
        album53.setFechaLanzamiento(LocalDate.of(1997, 5, 21));
        album53.setCanciones(canciones53);
        album53.setArtista(artista27);

        albumColeccion.insertOne(album53);

        CancionDoc cancion160 = new CancionDoc();
        cancion160.setId(new ObjectId());
        cancion160.setNombre("Everything In Its Right Place");

        CancionDoc cancion161 = new CancionDoc();
        cancion161.setId(new ObjectId());
        cancion161.setNombre("Pyramid Song");

        CancionDoc cancion162 = new CancionDoc();
        cancion162.setId(new ObjectId());
        cancion162.setNombre("Idioteque");

        List<CancionDoc> canciones54 = new ArrayList<>();
        canciones54.add(cancion160);
        canciones54.add(cancion161);
        canciones54.add(cancion162);

        AlbumColeccion album54 = new AlbumColeccion();
        album54.setNombre("Kid A");
        album54.setImagen("albums/KidA.jpg");
        album54.setFechaLanzamiento(LocalDate.of(2000, 10, 2));
        album54.setCanciones(canciones54);
        album54.setArtista(artista27);

        albumColeccion.insertOne(album54);

// 28. The Smashing Pumpkins
        ArtistaColeccion artista28 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Smashing Pumpkins");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista28 = artistaTemp;
        }

        CancionDoc cancion163 = new CancionDoc();
        cancion163.setId(new ObjectId());
        cancion163.setNombre("Tonight, Tonight");

        CancionDoc cancion164 = new CancionDoc();
        cancion164.setId(new ObjectId());
        cancion164.setNombre("Bullet with Butterfly Wings");

        CancionDoc cancion165 = new CancionDoc();
        cancion165.setId(new ObjectId());
        cancion165.setNombre("1979");

        List<CancionDoc> canciones55 = new ArrayList<>();
        canciones55.add(cancion163);
        canciones55.add(cancion164);
        canciones55.add(cancion165);

        AlbumColeccion album55 = new AlbumColeccion();
        album55.setNombre("Mellon Collie and the Infinite Sadness");
        album55.setImagen("albums/MellonCollie.jpg");
        album55.setFechaLanzamiento(LocalDate.of(1995, 10, 24));
        album55.setCanciones(canciones55);
        album55.setArtista(artista28);

        albumColeccion.insertOne(album55);

        CancionDoc cancion166 = new CancionDoc();
        cancion166.setId(new ObjectId());
        cancion166.setNombre("Disarm");

        CancionDoc cancion167 = new CancionDoc();
        cancion167.setId(new ObjectId());
        cancion167.setNombre("Today");

        CancionDoc cancion168 = new CancionDoc();
        cancion168.setId(new ObjectId());
        cancion168.setNombre("Cherub Rock");

        List<CancionDoc> canciones56 = new ArrayList<>();
        canciones56.add(cancion166);
        canciones56.add(cancion167);
        canciones56.add(cancion168);

        AlbumColeccion album56 = new AlbumColeccion();
        album56.setNombre("Siamese Dream");
        album56.setImagen("albums/SiameseDream.jpg");
        album56.setFechaLanzamiento(LocalDate.of(1993, 7, 27));
        album56.setCanciones(canciones56);
        album56.setArtista(artista28);

        albumColeccion.insertOne(album56);

// 29. The Beach Boys
        ArtistaColeccion artista29 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Beach Boys");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista29 = artistaTemp;
        }

        CancionDoc cancion169 = new CancionDoc();
        cancion169.setId(new ObjectId());
        cancion169.setNombre("Good Vibrations");

        CancionDoc cancion170 = new CancionDoc();
        cancion170.setId(new ObjectId());
        cancion170.setNombre("Wouldn't It Be Nice");

        CancionDoc cancion171 = new CancionDoc();
        cancion171.setId(new ObjectId());
        cancion171.setNombre("California Girls");

        List<CancionDoc> canciones57 = new ArrayList<>();
        canciones57.add(cancion169);
        canciones57.add(cancion170);
        canciones57.add(cancion171);

        AlbumColeccion album57 = new AlbumColeccion();
        album57.setNombre("Pet Sounds");
        album57.setImagen("albums/PetSounds.jpg");
        album57.setFechaLanzamiento(LocalDate.of(1966, 5, 16));
        album57.setCanciones(canciones57);
        album57.setArtista(artista29);

        albumColeccion.insertOne(album57);

        CancionDoc cancion172 = new CancionDoc();
        cancion172.setId(new ObjectId());
        cancion172.setNombre("Surfin' USA");

        CancionDoc cancion173 = new CancionDoc();
        cancion173.setId(new ObjectId());
        cancion173.setNombre("Fun, Fun, Fun");

        CancionDoc cancion174 = new CancionDoc();
        cancion174.setId(new ObjectId());
        cancion174.setNombre("I Get Around");

        List<CancionDoc> canciones58 = new ArrayList<>();
        canciones58.add(cancion172);
        canciones58.add(cancion173);
        canciones58.add(cancion174);

        AlbumColeccion album58 = new AlbumColeccion();
        album58.setNombre("Surfin' USA");
        album58.setImagen("albums/SurfinUSA.jpg");
        album58.setFechaLanzamiento(LocalDate.of(1963, 3, 4));
        album58.setCanciones(canciones58);
        album58.setArtista(artista29);

        albumColeccion.insertOne(album58);

// 30. Rage Against the Machine
        ArtistaColeccion artista30 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Rage Against the Machine");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista30 = artistaTemp;
        }

        CancionDoc cancion175 = new CancionDoc();
        cancion175.setId(new ObjectId());
        cancion175.setNombre("Killing in the Name");

        CancionDoc cancion176 = new CancionDoc();
        cancion176.setId(new ObjectId());
        cancion176.setNombre("Bombtrack");

        CancionDoc cancion177 = new CancionDoc();
        cancion177.setId(new ObjectId());
        cancion177.setNombre("Bullet in the Head");

        List<CancionDoc> canciones59 = new ArrayList<>();
        canciones59.add(cancion175);
        canciones59.add(cancion176);
        canciones59.add(cancion177);

        AlbumColeccion album59 = new AlbumColeccion();
        album59.setNombre("Rage Against the Machine");
        album59.setImagen("albums/RageAgainstTheMachine.jpg");
        album59.setFechaLanzamiento(LocalDate.of(1992, 11, 3));
        album59.setCanciones(canciones59);
        album59.setArtista(artista30);

        albumColeccion.insertOne(album59);

        CancionDoc cancion178 = new CancionDoc();
        cancion178.setId(new ObjectId());
        cancion178.setNombre("Guerrilla Radio");

        CancionDoc cancion179 = new CancionDoc();
        cancion179.setId(new ObjectId());
        cancion179.setNombre("Testify");

        CancionDoc cancion180 = new CancionDoc();
        cancion180.setId(new ObjectId());
        cancion180.setNombre("Calm Like a Bomb");

        List<CancionDoc> canciones60 = new ArrayList<>();
        canciones60.add(cancion178);
        canciones60.add(cancion179);
        canciones60.add(cancion180);

        AlbumColeccion album60 = new AlbumColeccion();
        album60.setNombre("The Battle of Los Angeles");
        album60.setImagen("albums/TheBattleOfLosAngeles.jpg");
        album60.setFechaLanzamiento(LocalDate.of(1999, 11, 2));
        album60.setCanciones(canciones60);
        album60.setArtista(artista30);

        albumColeccion.insertOne(album60);

// 31. Oasis
        ArtistaColeccion artista31 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Oasis");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista31 = artistaTemp;
        }

        CancionDoc cancion181 = new CancionDoc();
        cancion181.setId(new ObjectId());
        cancion181.setNombre("Wonderwall");

        CancionDoc cancion182 = new CancionDoc();
        cancion182.setId(new ObjectId());
        cancion182.setNombre("Don't Look Back In Anger");

        CancionDoc cancion183 = new CancionDoc();
        cancion183.setId(new ObjectId());
        cancion183.setNombre("Champagne Supernova");

        List<CancionDoc> canciones61 = new ArrayList<>();
        canciones61.add(cancion181);
        canciones61.add(cancion182);
        canciones61.add(cancion183);

        AlbumColeccion album61 = new AlbumColeccion();
        album61.setNombre("What's the Story Morning Glory?");
        album61.setImagen("albums/WhatsTheStoryMorningGlory.jpg");
        album61.setFechaLanzamiento(LocalDate.of(1995, 10, 2));
        album61.setCanciones(canciones61);
        album61.setArtista(artista31);

        albumColeccion.insertOne(album61);

        CancionDoc cancion184 = new CancionDoc();
        cancion184.setId(new ObjectId());
        cancion184.setNombre("Live Forever");

        CancionDoc cancion185 = new CancionDoc();
        cancion185.setId(new ObjectId());
        cancion185.setNombre("Supersonic");

        CancionDoc cancion186 = new CancionDoc();
        cancion186.setId(new ObjectId());
        cancion186.setNombre("Shakermaker");

        List<CancionDoc> canciones62 = new ArrayList<>();
        canciones62.add(cancion184);
        canciones62.add(cancion185);
        canciones62.add(cancion186);

        AlbumColeccion album62 = new AlbumColeccion();
        album62.setNombre("Definitely Maybe");
        album62.setImagen("albums/DefinitelyMaybe.jpg");
        album62.setFechaLanzamiento(LocalDate.of(1994, 8, 29));
        album62.setCanciones(canciones62);
        album62.setArtista(artista31);

        albumColeccion.insertOne(album62);

// 32. The White Stripes
        ArtistaColeccion artista32 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The White Stripes");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista32 = artistaTemp;
        }

        CancionDoc cancion187 = new CancionDoc();
        cancion187.setId(new ObjectId());
        cancion187.setNombre("Seven Nation Army");

        CancionDoc cancion188 = new CancionDoc();
        cancion188.setId(new ObjectId());
        cancion188.setNombre("Fell In Love With a Girl");

        CancionDoc cancion189 = new CancionDoc();
        cancion189.setId(new ObjectId());
        cancion189.setNombre("Icky Thump");

        List<CancionDoc> canciones63 = new ArrayList<>();
        canciones63.add(cancion187);
        canciones63.add(cancion188);
        canciones63.add(cancion189);

        AlbumColeccion album63 = new AlbumColeccion();
        album63.setNombre("Elephant");
        album63.setImagen("albums/Elephant.jpg");
        album63.setFechaLanzamiento(LocalDate.of(2003, 4, 1));
        album63.setCanciones(canciones63);
        album63.setArtista(artista32);

        albumColeccion.insertOne(album63);

        CancionDoc cancion190 = new CancionDoc();
        cancion190.setId(new ObjectId());
        cancion190.setNombre("Dead Leaves and the Dirty Ground");

        CancionDoc cancion191 = new CancionDoc();
        cancion191.setId(new ObjectId());
        cancion191.setNombre("Hotel Yorba");

        CancionDoc cancion192 = new CancionDoc();
        cancion192.setId(new ObjectId());
        cancion192.setNombre("The Hardest Button to Button");

        List<CancionDoc> canciones64 = new ArrayList<>();
        canciones64.add(cancion190);
        canciones64.add(cancion191);
        canciones64.add(cancion192);

        AlbumColeccion album64 = new AlbumColeccion();
        album64.setNombre("White Blood Cells");
        album64.setImagen("albums/WhiteBloodCells.jpg");
        album64.setFechaLanzamiento(LocalDate.of(2001, 7, 3));
        album64.setCanciones(canciones64);
        album64.setArtista(artista32);

        albumColeccion.insertOne(album64);

// 33. Kiss
        ArtistaColeccion artista33 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Kiss");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista33 = artistaTemp;
        }

        CancionDoc cancion193 = new CancionDoc();
        cancion193.setId(new ObjectId());
        cancion193.setNombre("Rock and Roll All Nite");

        CancionDoc cancion194 = new CancionDoc();
        cancion194.setId(new ObjectId());
        cancion194.setNombre("Detroit Rock City");

        CancionDoc cancion195 = new CancionDoc();
        cancion195.setId(new ObjectId());
        cancion195.setNombre("Beth");

        List<CancionDoc> canciones65 = new ArrayList<>();
        canciones65.add(cancion193);
        canciones65.add(cancion194);
        canciones65.add(cancion195);

        AlbumColeccion album65 = new AlbumColeccion();
        album65.setNombre("Alive!");
        album65.setImagen("albums/Alive.jpg");
        album65.setFechaLanzamiento(LocalDate.of(1975, 9, 10));
        album65.setCanciones(canciones65);
        album65.setArtista(artista33);

        albumColeccion.insertOne(album65);

        CancionDoc cancion196 = new CancionDoc();
        cancion196.setId(new ObjectId());
        cancion196.setNombre("I Was Made For Lovin' You");

        CancionDoc cancion197 = new CancionDoc();
        cancion197.setId(new ObjectId());
        cancion197.setNombre("Shout It Out Loud");

        CancionDoc cancion198 = new CancionDoc();
        cancion198.setId(new ObjectId());
        cancion198.setNombre("Cold Gin");

        List<CancionDoc> canciones66 = new ArrayList<>();
        canciones66.add(cancion196);
        canciones66.add(cancion197);
        canciones66.add(cancion198);

        AlbumColeccion album66 = new AlbumColeccion();
        album66.setNombre("Destroyer");
        album66.setImagen("albums/Destroyer.jpg");
        album66.setFechaLanzamiento(LocalDate.of(1976, 3, 15));
        album66.setCanciones(canciones66);
        album66.setArtista(artista33);

        albumColeccion.insertOne(album66);

// 34. Soundgarden
        ArtistaColeccion artista34 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Soundgarden");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista34 = artistaTemp;
        }

        CancionDoc cancion199 = new CancionDoc();
        cancion199.setId(new ObjectId());
        cancion199.setNombre("Black Hole Sun");

        CancionDoc cancion200 = new CancionDoc();
        cancion200.setId(new ObjectId());
        cancion200.setNombre("Spoonman");

        CancionDoc cancion201 = new CancionDoc();
        cancion201.setId(new ObjectId());
        cancion201.setNombre("Outshined");

        List<CancionDoc> canciones67 = new ArrayList<>();
        canciones67.add(cancion199);
        canciones67.add(cancion200);
        canciones67.add(cancion201);

        AlbumColeccion album67 = new AlbumColeccion();
        album67.setNombre("Superunknown");
        album67.setImagen("albums/Superunknown.jpg");
        album67.setFechaLanzamiento(LocalDate.of(1994, 3, 8));
        album67.setCanciones(canciones67);
        album67.setArtista(artista34);

        albumColeccion.insertOne(album67);

        CancionDoc cancion202 = new CancionDoc();
        cancion202.setId(new ObjectId());
        cancion202.setNombre("Rusty Cage");

        CancionDoc cancion203 = new CancionDoc();
        cancion203.setId(new ObjectId());
        cancion203.setNombre("Fell on Black Days");

        CancionDoc cancion204 = new CancionDoc();
        cancion204.setId(new ObjectId());
        cancion204.setNombre("The Day I Tried to Live");

        List<CancionDoc> canciones68 = new ArrayList<>();
        canciones68.add(cancion202);
        canciones68.add(cancion203);
        canciones68.add(cancion204);

        AlbumColeccion album68 = new AlbumColeccion();
        album68.setNombre("Down on the Upside");
        album68.setImagen("albums/DownOnTheUpside.jpg");
        album68.setFechaLanzamiento(LocalDate.of(1996, 5, 21));
        album68.setCanciones(canciones68);
        album68.setArtista(artista34);

        albumColeccion.insertOne(album68);

// 35. Panic! At The Disco
        ArtistaColeccion artista35 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Panic! At The Disco");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista35 = artistaTemp;
        }

        CancionDoc cancion205 = new CancionDoc();
        cancion205.setId(new ObjectId());
        cancion205.setNombre("I Write Sins Not Tragedies");

        CancionDoc cancion206 = new CancionDoc();
        cancion206.setId(new ObjectId());
        cancion206.setNombre("Death of a Bachelor");

        CancionDoc cancion207 = new CancionDoc();
        cancion207.setId(new ObjectId());
        cancion207.setNombre("Nine in the Afternoon");

        List<CancionDoc> canciones69 = new ArrayList<>();
        canciones69.add(cancion205);
        canciones69.add(cancion206);
        canciones69.add(cancion207);

        AlbumColeccion album69 = new AlbumColeccion();
        album69.setNombre("A Fever You Can't Sweat Out");
        album69.setImagen("albums/AFeverYouCantSweatOut.jpg");
        album69.setFechaLanzamiento(LocalDate.of(2005, 9, 27));
        album69.setCanciones(canciones69);
        album69.setArtista(artista35);

        albumColeccion.insertOne(album69);

        CancionDoc cancion208 = new CancionDoc();
        cancion208.setId(new ObjectId());
        cancion208.setNombre("But It's Better If You Do");

        CancionDoc cancion209 = new CancionDoc();
        cancion209.setId(new ObjectId());
        cancion209.setNombre("This Is Gospel");

        CancionDoc cancion210 = new CancionDoc();
        cancion210.setId(new ObjectId());
        cancion210.setNombre("Miss Jackson");

        List<CancionDoc> canciones70 = new ArrayList<>();
        canciones70.add(cancion208);
        canciones70.add(cancion209);
        canciones70.add(cancion210);

        AlbumColeccion album70 = new AlbumColeccion();
        album70.setNombre("Too Weird to Live, Too Rare to Die!");
        album70.setImagen("albums/TooWeirdToLiveTooRareToDie.jpg");
        album70.setFechaLanzamiento(LocalDate.of(2013, 10, 8));
        album70.setCanciones(canciones70);
        album70.setArtista(artista35);

        albumColeccion.insertOne(album70);

// 36. The Strokes
        ArtistaColeccion artista36 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Strokes");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista36 = artistaTemp;
        }

        CancionDoc cancion211 = new CancionDoc();
        cancion211.setId(new ObjectId());
        cancion211.setNombre("Last Nite");

        CancionDoc cancion212 = new CancionDoc();
        cancion212.setId(new ObjectId());
        cancion212.setNombre("Reptilia");

        CancionDoc cancion213 = new CancionDoc();
        cancion213.setId(new ObjectId());
        cancion213.setNombre("Hard to Explain");

        List<CancionDoc> canciones71 = new ArrayList<>();
        canciones71.add(cancion211);
        canciones71.add(cancion212);
        canciones71.add(cancion213);

        AlbumColeccion album71 = new AlbumColeccion();
        album71.setNombre("Is This It");
        album71.setImagen("albums/IsThisIt.jpg");
        album71.setFechaLanzamiento(LocalDate.of(2001, 7, 30));
        album71.setCanciones(canciones71);
        album71.setArtista(artista36);

        albumColeccion.insertOne(album71);

        CancionDoc cancion214 = new CancionDoc();
        cancion214.setId(new ObjectId());
        cancion214.setNombre("12:51");

        CancionDoc cancion215 = new CancionDoc();
        cancion215.setId(new ObjectId());
        cancion215.setNombre("Under Control");

        CancionDoc cancion216 = new CancionDoc();
        cancion216.setId(new ObjectId());
        cancion216.setNombre("Juicebox");

        List<CancionDoc> canciones72 = new ArrayList<>();
        canciones72.add(cancion214);
        canciones72.add(cancion215);
        canciones72.add(cancion216);

        AlbumColeccion album72 = new AlbumColeccion();
        album72.setNombre("Room on Fire");
        album72.setImagen("albums/RoomOnFire.jpg");
        album72.setFechaLanzamiento(LocalDate.of(2003, 10, 28));
        album72.setCanciones(canciones72);
        album72.setArtista(artista36);

        albumColeccion.insertOne(album72);

// 37. The Cranberries
        ArtistaColeccion artista37 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Cranberries");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista37 = artistaTemp;
        }

        CancionDoc cancion217 = new CancionDoc();
        cancion217.setId(new ObjectId());
        cancion217.setNombre("Zombie");

        CancionDoc cancion218 = new CancionDoc();
        cancion218.setId(new ObjectId());
        cancion218.setNombre("Linger");

        CancionDoc cancion219 = new CancionDoc();
        cancion219.setId(new ObjectId());
        cancion219.setNombre("Ode to My Family");

        List<CancionDoc> canciones73 = new ArrayList<>();
        canciones73.add(cancion217);
        canciones73.add(cancion218);
        canciones73.add(cancion219);

        AlbumColeccion album73 = new AlbumColeccion();
        album73.setNombre("Everybody Else Is Doing It, So Why Can't We?");
        album73.setImagen("albums/EverybodyElseIsDoingIt.jpg");
        album73.setFechaLanzamiento(LocalDate.of(1993, 3, 1));
        album73.setCanciones(canciones73);
        album73.setArtista(artista37);

        albumColeccion.insertOne(album73);

        CancionDoc cancion220 = new CancionDoc();
        cancion220.setId(new ObjectId());
        cancion220.setNombre("When You're Gone");

        CancionDoc cancion221 = new CancionDoc();
        cancion221.setId(new ObjectId());
        cancion221.setNombre("Salvation");

        CancionDoc cancion222 = new CancionDoc();
        cancion222.setId(new ObjectId());
        cancion222.setNombre("Promises");

        List<CancionDoc> canciones74 = new ArrayList<>();
        canciones74.add(cancion220);
        canciones74.add(cancion221);
        canciones74.add(cancion222);

        AlbumColeccion album74 = new AlbumColeccion();
        album74.setNombre("Bury the Hatchet");
        album74.setImagen("albums/BuryTheHatchet.jpg");
        album74.setFechaLanzamiento(LocalDate.of(1999, 4, 13));
        album74.setCanciones(canciones74);
        album74.setArtista(artista37);

        albumColeccion.insertOne(album74);

// 38. My Chemical Romance
        ArtistaColeccion artista38 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "My Chemical Romance");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista38 = artistaTemp;
        }

        CancionDoc cancion223 = new CancionDoc();
        cancion223.setId(new ObjectId());
        cancion223.setNombre("Welcome to the Black Parade");

        CancionDoc cancion224 = new CancionDoc();
        cancion224.setId(new ObjectId());
        cancion224.setNombre("I'm Not Okay (I Promise)");

        CancionDoc cancion225 = new CancionDoc();
        cancion225.setId(new ObjectId());
        cancion225.setNombre("Helena");

        List<CancionDoc> canciones75 = new ArrayList<>();
        canciones75.add(cancion223);
        canciones75.add(cancion224);
        canciones75.add(cancion225);

        AlbumColeccion album75 = new AlbumColeccion();
        album75.setNombre("The Black Parade");
        album75.setImagen("albums/TheBlackParade.jpg");
        album75.setFechaLanzamiento(LocalDate.of(2006, 10, 23));
        album75.setCanciones(canciones75);
        album75.setArtista(artista38);

        albumColeccion.insertOne(album75);

        CancionDoc cancion226 = new CancionDoc();
        cancion226.setId(new ObjectId());
        cancion226.setNombre("Famous Last Words");

        CancionDoc cancion227 = new CancionDoc();
        cancion227.setId(new ObjectId());
        cancion227.setNombre("The Ghost of You");

        CancionDoc cancion228 = new CancionDoc();
        cancion228.setId(new ObjectId());
        cancion228.setNombre("I Don't Love You");

        List<CancionDoc> canciones76 = new ArrayList<>();
        canciones76.add(cancion226);
        canciones76.add(cancion227);
        canciones76.add(cancion228);

        AlbumColeccion album76 = new AlbumColeccion();
        album76.setNombre("Three Cheers for Sweet Revenge");
        album76.setImagen("albums/ThreeCheersForSweetRevenge.jpg");
        album76.setFechaLanzamiento(LocalDate.of(2004, 6, 8));
        album76.setCanciones(canciones76);
        album76.setArtista(artista38);

        albumColeccion.insertOne(album76);

// 39. Kings of Leon
        ArtistaColeccion artista39 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Kings of Leon");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista39 = artistaTemp;
        }

        CancionDoc cancion229 = new CancionDoc();
        cancion229.setId(new ObjectId());
        cancion229.setNombre("Use Somebody");

        CancionDoc cancion230 = new CancionDoc();
        cancion230.setId(new ObjectId());
        cancion230.setNombre("Sex on Fire");

        CancionDoc cancion231 = new CancionDoc();
        cancion231.setId(new ObjectId());
        cancion231.setNombre("Closer");

        List<CancionDoc> canciones77 = new ArrayList<>();
        canciones77.add(cancion229);
        canciones77.add(cancion230);
        canciones77.add(cancion231);

        AlbumColeccion album77 = new AlbumColeccion();
        album77.setNombre("Only by the Night");
        album77.setImagen("albums/OnlyByTheNight.jpg");
        album77.setFechaLanzamiento(LocalDate.of(2008, 9, 19));
        album77.setCanciones(canciones77);
        album77.setArtista(artista39);

        albumColeccion.insertOne(album77);

        CancionDoc cancion232 = new CancionDoc();
        cancion232.setId(new ObjectId());
        cancion232.setNombre("The Bucket");

        CancionDoc cancion233 = new CancionDoc();
        cancion233.setId(new ObjectId());
        cancion233.setNombre("Notion");

        CancionDoc cancion234 = new CancionDoc();
        cancion234.setId(new ObjectId());
        cancion234.setNombre("Red Morning Light");

        List<CancionDoc> canciones78 = new ArrayList<>();
        canciones78.add(cancion232);
        canciones78.add(cancion233);
        canciones78.add(cancion234);

        AlbumColeccion album78 = new AlbumColeccion();
        album78.setNombre("Aha Shake Heartbreak");
        album78.setImagen("albums/AhaShakeHeartbreak.jpg");
        album78.setFechaLanzamiento(LocalDate.of(2004, 11, 23));
        album78.setCanciones(canciones78);
        album78.setArtista(artista39);

        albumColeccion.insertOne(album78);

// 40. Foo Fighters
        ArtistaColeccion artista40 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Foo Fighters");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista40 = artistaTemp;
        }

        CancionDoc cancion235 = new CancionDoc();
        cancion235.setId(new ObjectId());
        cancion235.setNombre("Everlong");

        CancionDoc cancion236 = new CancionDoc();
        cancion236.setId(new ObjectId());
        cancion236.setNombre("Learn to Fly");

        CancionDoc cancion237 = new CancionDoc();
        cancion237.setId(new ObjectId());
        cancion237.setNombre("The Pretender");

        List<CancionDoc> canciones79 = new ArrayList<>();
        canciones79.add(cancion235);
        canciones79.add(cancion236);
        canciones79.add(cancion237);

        AlbumColeccion album79 = new AlbumColeccion();
        album79.setNombre("The Colour and the Shape");
        album79.setImagen("albums/TheColourAndTheShape.jpg");
        album79.setFechaLanzamiento(LocalDate.of(1997, 5, 20));
        album79.setCanciones(canciones79);
        album79.setArtista(artista40);

        albumColeccion.insertOne(album79);

        CancionDoc cancion238 = new CancionDoc();
        cancion238.setId(new ObjectId());
        cancion238.setNombre("Big Me");

        CancionDoc cancion239 = new CancionDoc();
        cancion239.setId(new ObjectId());
        cancion239.setNombre("This Is a Call");

        CancionDoc cancion240 = new CancionDoc();
        cancion240.setId(new ObjectId());
        cancion240.setNombre("All My Life");

        List<CancionDoc> canciones80 = new ArrayList<>();
        canciones80.add(cancion238);
        canciones80.add(cancion239);
        canciones80.add(cancion240);

        AlbumColeccion album80 = new AlbumColeccion();
        album80.setNombre("Foo Fighters");
        album80.setImagen("albums/FooFighters.jpg");
        album80.setFechaLanzamiento(LocalDate.of(1995, 7, 4));
        album80.setCanciones(canciones80);
        album80.setArtista(artista40);

        albumColeccion.insertOne(album80);

// 41. The Cure
        ArtistaColeccion artista41 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Cure");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista41 = artistaTemp;
        }

        CancionDoc cancion241 = new CancionDoc();
        cancion241.setId(new ObjectId());
        cancion241.setNombre("Just Like Heaven");

        CancionDoc cancion242 = new CancionDoc();
        cancion242.setId(new ObjectId());
        cancion242.setNombre("Lovesong");

        CancionDoc cancion243 = new CancionDoc();
        cancion243.setId(new ObjectId());
        cancion243.setNombre("Boys Don't Cry");

        List<CancionDoc> canciones81 = new ArrayList<>();
        canciones81.add(cancion241);
        canciones81.add(cancion242);
        canciones81.add(cancion243);

        AlbumColeccion album81 = new AlbumColeccion();
        album81.setNombre("Disintegration");
        album81.setImagen("albums/Disintegration.jpg");
        album81.setFechaLanzamiento(LocalDate.of(1989, 5, 2));
        album81.setCanciones(canciones81);
        album81.setArtista(artista41);

        albumColeccion.insertOne(album81);

        CancionDoc cancion244 = new CancionDoc();
        cancion244.setId(new ObjectId());
        cancion244.setNombre("The Lovecats");

        CancionDoc cancion245 = new CancionDoc();
        cancion245.setId(new ObjectId());
        cancion245.setNombre("Friday I'm In Love");

        CancionDoc cancion246 = new CancionDoc();
        cancion246.setId(new ObjectId());
        cancion246.setNombre("A Forest");

        List<CancionDoc> canciones82 = new ArrayList<>();
        canciones82.add(cancion244);
        canciones82.add(cancion245);
        canciones82.add(cancion246);

        AlbumColeccion album82 = new AlbumColeccion();
        album82.setNombre("The Head on the Door");
        album82.setImagen("albums/TheHeadOnTheDoor.jpg");
        album82.setFechaLanzamiento(LocalDate.of(1985, 8, 26));
        album82.setCanciones(canciones82);
        album82.setArtista(artista41);

        albumColeccion.insertOne(album82);

// 42. R.E.M.
        ArtistaColeccion artista42 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "R.E.M.");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista42 = artistaTemp;
        }

        CancionDoc cancion247 = new CancionDoc();
        cancion247.setId(new ObjectId());
        cancion247.setNombre("Losing My Religion");

        CancionDoc cancion248 = new CancionDoc();
        cancion248.setId(new ObjectId());
        cancion248.setNombre("Everybody Hurts");

        CancionDoc cancion249 = new CancionDoc();
        cancion249.setId(new ObjectId());
        cancion249.setNombre("Shiny Happy People");

        List<CancionDoc> canciones83 = new ArrayList<>();
        canciones83.add(cancion247);
        canciones83.add(cancion248);
        canciones83.add(cancion249);

        AlbumColeccion album83 = new AlbumColeccion();
        album83.setNombre("Automatic for the People");
        album83.setImagen("albums/AutomaticForThePeople.jpg");
        album83.setFechaLanzamiento(LocalDate.of(1992, 10, 5));
        album83.setCanciones(canciones83);
        album83.setArtista(artista42);

        albumColeccion.insertOne(album83);

        CancionDoc cancion250 = new CancionDoc();
        cancion250.setId(new ObjectId());
        cancion250.setNombre("The One I Love");

        CancionDoc cancion251 = new CancionDoc();
        cancion251.setId(new ObjectId());
        cancion251.setNombre("Man on the Moon");

        CancionDoc cancion252 = new CancionDoc();
        cancion252.setId(new ObjectId());
        cancion252.setNombre("What's the Frequency, Kenneth?");

        List<CancionDoc> canciones84 = new ArrayList<>();
        canciones84.add(cancion250);
        canciones84.add(cancion251);
        canciones84.add(cancion252);

        AlbumColeccion album84 = new AlbumColeccion();
        album84.setNombre("Monster");
        album84.setImagen("albums/Monster.jpg");
        album84.setFechaLanzamiento(LocalDate.of(1994, 9, 27));
        album84.setCanciones(canciones84);
        album84.setArtista(artista42);

        albumColeccion.insertOne(album84);

// 43. Alter Bridge
        ArtistaColeccion artista43 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Alter Bridge");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista43 = artistaTemp;
        }

        CancionDoc cancion253 = new CancionDoc();
        cancion253.setId(new ObjectId());
        cancion253.setNombre("Metalingus");

        CancionDoc cancion254 = new CancionDoc();
        cancion254.setId(new ObjectId());
        cancion254.setNombre("Blackbird");

        CancionDoc cancion255 = new CancionDoc();
        cancion255.setId(new ObjectId());
        cancion255.setNombre("Open Your Eyes");

        List<CancionDoc> canciones85 = new ArrayList<>();
        canciones85.add(cancion253);
        canciones85.add(cancion254);
        canciones85.add(cancion255);

        AlbumColeccion album85 = new AlbumColeccion();
        album85.setNombre("Blackbird");
        album85.setImagen("albums/Blackbird.jpg");
        album85.setFechaLanzamiento(LocalDate.of(2007, 10, 9));
        album85.setCanciones(canciones85);
        album85.setArtista(artista43);

        albumColeccion.insertOne(album85);

        CancionDoc cancion256 = new CancionDoc();
        cancion256.setId(new ObjectId());
        cancion256.setNombre("Find the Real");

        CancionDoc cancion257 = new CancionDoc();
        cancion257.setId(new ObjectId());
        cancion257.setNombre("The Last Hero");

        CancionDoc cancion258 = new CancionDoc();
        cancion258.setId(new ObjectId());
        cancion258.setNombre("Broken Wings");

        List<CancionDoc> canciones86 = new ArrayList<>();
        canciones86.add(cancion256);
        canciones86.add(cancion257);
        canciones86.add(cancion258);

        AlbumColeccion album86 = new AlbumColeccion();
        album86.setNombre("The Last Hero");
        album86.setImagen("albums/TheLastHero.jpg");
        album86.setFechaLanzamiento(LocalDate.of(2016, 10, 7));
        album86.setCanciones(canciones86);
        album86.setArtista(artista43);

        albumColeccion.insertOne(album86);

// 44. The Arctic Monkeys
        ArtistaColeccion artista44 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "The Arctic Monkeys");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista44 = artistaTemp;
        }

        CancionDoc cancion259 = new CancionDoc();
        cancion259.setId(new ObjectId());
        cancion259.setNombre("Do I Wanna Know?");

        CancionDoc cancion260 = new CancionDoc();
        cancion260.setId(new ObjectId());
        cancion260.setNombre("R U Mine?");

        CancionDoc cancion261 = new CancionDoc();
        cancion261.setId(new ObjectId());
        cancion261.setNombre("I Bet You Look Good on the Dancefloor");

        List<CancionDoc> canciones87 = new ArrayList<>();
        canciones87.add(cancion259);
        canciones87.add(cancion260);
        canciones87.add(cancion261);

        AlbumColeccion album87 = new AlbumColeccion();
        album87.setNombre("AM");
        album87.setImagen("albums/AM.jpg");
        album87.setFechaLanzamiento(LocalDate.of(2013, 9, 9));
        album87.setCanciones(canciones87);
        album87.setArtista(artista44);

        albumColeccion.insertOne(album87);

        CancionDoc cancion262 = new CancionDoc();
        cancion262.setId(new ObjectId());
        cancion262.setNombre("Why'd You Only Call Me When You're High?");

        CancionDoc cancion263 = new CancionDoc();
        cancion263.setId(new ObjectId());
        cancion263.setNombre("Snap Out of It");

        CancionDoc cancion264 = new CancionDoc();
        cancion264.setId(new ObjectId());
        cancion264.setNombre("Arabella");

        List<CancionDoc> canciones88 = new ArrayList<>();
        canciones88.add(cancion262);
        canciones88.add(cancion263);
        canciones88.add(cancion264);

        AlbumColeccion album88 = new AlbumColeccion();
        album88.setNombre("Suck It and See");
        album88.setImagen("albums/SuckItAndSee.jpg");
        album88.setFechaLanzamiento(LocalDate.of(2011, 6, 6));
        album88.setCanciones(canciones88);
        album88.setArtista(artista44);

        albumColeccion.insertOne(album88);

// 45. Bon Jovi
        ArtistaColeccion artista45 = new ArtistaColeccion();
        filtro = Filters.eq("nombre", "Bon Jovi");
        for (ArtistaColeccion artistaTemp : artistaColeccion.find(filtro)) {
            artista45 = artistaTemp;
        }

        CancionDoc cancion265 = new CancionDoc();
        cancion265.setId(new ObjectId());
        cancion265.setNombre("Livin' on a Prayer");

        CancionDoc cancion266 = new CancionDoc();
        cancion266.setId(new ObjectId());
        cancion266.setNombre("Wanted Dead or Alive");

        CancionDoc cancion267 = new CancionDoc();
        cancion267.setId(new ObjectId());
        cancion267.setNombre("You Give Love a Bad Name");

        List<CancionDoc> canciones89 = new ArrayList<>();
        canciones89.add(cancion265);
        canciones89.add(cancion266);
        canciones89.add(cancion267);

        AlbumColeccion album89 = new AlbumColeccion();
        album89.setNombre("Slippery When Wet");
        album89.setImagen("albums/SlipperyWhenWet.jpg");
        album89.setFechaLanzamiento(LocalDate.of(1986, 8, 18));
        album89.setCanciones(canciones89);
        album89.setArtista(artista45);

        albumColeccion.insertOne(album89);

        CancionDoc cancion268 = new CancionDoc();
        cancion268.setId(new ObjectId());
        cancion268.setNombre("Bad Medicine");

        CancionDoc cancion269 = new CancionDoc();
        cancion269.setId(new ObjectId());
        cancion269.setNombre("Living in Sin");

        CancionDoc cancion270 = new CancionDoc();
        cancion270.setId(new ObjectId());
        cancion270.setNombre("I'll Be There for You");

        List<CancionDoc> canciones90 = new ArrayList<>();
        canciones90.add(cancion268);
        canciones90.add(cancion269);
        canciones90.add(cancion270);

        AlbumColeccion album90 = new AlbumColeccion();
        album90.setNombre("New Jersey");
        album90.setImagen("albums/NewJersey.jpg");
        album90.setFechaLanzamiento(LocalDate.of(1988, 9, 19));
        album90.setCanciones(canciones90);
        album90.setArtista(artista45);

        albumColeccion.insertOne(album90);

    }

}
