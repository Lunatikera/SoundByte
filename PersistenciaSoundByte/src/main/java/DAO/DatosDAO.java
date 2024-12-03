/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author carli
 */
public class DatosDAO {

    private final MongoDatabase database;

    public DatosDAO(IConexionDB conexionDB) {
        this.database = conexionDB.getDatabase();
    }

    public void insercionMasiva() {
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
        genero13.setNombre("Música Latina");
        genero13.setImagenGenero("resources/generos/musicalatina.jpg");
        genero13.setDescrpicion("La Música Latina abarca una amplia gama de géneros originarios de América Latina, como el reguetón, salsa, bachata, cumbia, merengue, y muchos más, caracterizados por sus ritmos vibrantes y letras apasionadas.");

        GeneroColeccion genero14 = new GeneroColeccion();
        genero14.setNombre("R&B");
        genero14.setImagenGenero("resources/generos/rnb.jpg");
        genero14.setDescrpicion("El R&B es un género que combina el soul y el pop con ritmos contemporáneos, destacando por sus melodías y letras románticas.");

        GeneroColeccion genero15 = new GeneroColeccion();
        genero15.setNombre("Trap");
        genero15.setImagenGenero("resources/generos/trap.jpg");
        genero15.setDescrpicion("El Trap es un subgénero del Hip-Hop que se caracteriza por sus ritmos repetitivos y líricas introspectivas.");

        GeneroColeccion genero16 = new GeneroColeccion();
        genero16.setNombre("Electrónica");
        genero16.setImagenGenero("resources/generos/electronica.jpg");
        genero16.setDescrpicion("La Electrónica es un género que utiliza sonidos sintéticos generados con computadoras y sintetizadores.");

        GeneroColeccion genero17 = new GeneroColeccion();
        genero17.setNombre("Rock Progresivo");
        genero17.setImagenGenero("resources/generos/rockProgresivo.jpg");
        genero17.setDescrpicion("El Rock progresivo es un subgénero del Rock que nació a fines de los 60 en el Reino Unido y era la expresión de músicos influenciados por la cultura del Rock.");

        GeneroColeccion genero18 = new GeneroColeccion();
        genero18.setNombre("Alternativo");
        genero18.setImagenGenero("resources/generos/alternativo.jpg");
        genero18.setDescrpicion("El Alternativo es un género musical que engloba una variedad de estilos, todos caracterizados por su enfoque experimental y diverso.");

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
        generos.add(genero13);
        generos.add(genero14);
        generos.add(genero15);
        generos.add(genero16);
        generos.add(genero17);
        generos.add(genero18);

        generoColeccion.insertMany(generos);

        HashMap<String, ObjectId> generoMap = new HashMap<>();
        for (GeneroColeccion genero : generos) {
            // Obtener el ObjectId del género después de la inserción
            if (genero.getId() != null) {
                generoMap.put(genero.getNombre(), genero.getId());
            }
        }
        MongoCollection<Document> artistaColeccion = database.getCollection("artistas");

        // Rock
        Document artista1 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock")))
                .append("imagen", "/artistas/Elvis.jpg")
                .append("nombre", "Elvis Presley");

        Document artista2 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock")))
                .append("imagen", "/artistas/Hendrix.jpg")
                .append("nombre", "Jimmy Hendrix");

        Document artista3 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock")))
                .append("imagen", "/artistas/Spinetta.jpg")
                .append("nombre", "Luis Alberto Spinetta");

        Document artista4 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock")))
                .append("imagen", "/artistas/JohnnyCash.jpg")
                .append("nombre", "Johnny Cash");

        Document artista5 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock")))
                .append("imagen", "/artistas/Bowie.jpg")
                .append("nombre", "David Bowie");
        // Jazz

        Document artista6 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Jazz")))
                .append("imagen", "/artistas/LouisArmstrong.jpg")
                .append("nombre", "Louis Armstrong");

        Document artista7 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Jazz")))
                .append("imagen", "/artistas/JohnColtrane.jpg")
                .append("nombre", "John Coltrane");

        Document artista8 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Jazz")))
                .append("imagen", "/artistas/BillieHoliday.jpg")
                .append("nombre", "Billie Holiday");

        Document artista9 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Jazz")))
                .append("imagen", "/artistas/DizzyGillespie.jpg")
                .append("nombre", "Dizzy Gillespie");

        Document artista10 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Jazz")))
                .append("imagen", "/artistas/EllaFitzgerald.jpg")
                .append("nombre", "Ella Fitzgerald");
        // Pop
        Document artista11 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/MichaelJackson.jpg")
                .append("nombre", "Michael Jackson");

        Document artista12 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/Madonna.jpg")
                .append("nombre", "Madonna");

        Document artista13 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/EdSheeran.jpg")
                .append("nombre", "Ed Sheeran");

        Document artista14 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/Beyonce.jpg")
                .append("nombre", "Beyoncé");

        Document artista15 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/Rihanna.jpg")
                .append("nombre", "Rihanna");

        // Reggae
        Document artista16 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/BobMarley.jpg")
                .append("nombre", "Bob Marley");

        Document artista17 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/PeterTosh.jpg")
                .append("nombre", "Peter Tosh");

        Document artista18 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/JimmyCliff.jpg")
                .append("nombre", "Jimmy Cliff");

        Document artista19 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/GregoryIsaacs.jpg")
                .append("nombre", "Gregory Isaacs");

        Document artista20 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/TootsHibbert.jpg")
                .append("nombre", "Toots Hibbert");

// BluesX
        Document artista21 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/BBKing.jpg")
                .append("nombre", "B.B. King");

        Document artista22 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/MuddyWaters.jpg")
                .append("nombre", "Muddy Waters");

        Document artista23 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/RobertJohnson.jpg")
                .append("nombre", "Robert Johnson");

        Document artista24 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/JohnLeeHooker.jpg")
                .append("nombre", "John Lee Hooker");

        Document artista25 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/EricClapton.jpg")
                .append("nombre", "Eric Clapton");

// Country
        Document artista26 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/HankWilliams.jpg")
                .append("nombre", "Hank Williams");

        Document artista27 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/DollyParton.jpg")
                .append("nombre", "Dolly Parton");

        Document artista28 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/WillieNelson.jpg")
                .append("nombre", "Willie Nelson");

        Document artista29 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/EmmylouHarris.jpg")
                .append("nombre", "Emmylou Harris");

        Document artista30 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/LorettaLynn.jpg")
                .append("nombre", "Loretta Lynn");

// Metal
        Document artista31 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/OzzyOsbourne.jpg")
                .append("nombre", "Ozzy Osbourne");

        Document artista32 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/RobHalford.jpg")
                .append("nombre", "Rob Halford");

        Document artista33 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/KingDiamond.jpg")
                .append("nombre", "King Diamond");

        Document artista34 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/Dio.jpg")
                .append("nombre", "Ronnie James Dio");

        Document artista35 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/LemmyKilmister.jpg")
                .append("nombre", "Lemmy Kilmister");

// Hip-Hop
        Document artista36 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/MosDef.jpg")
                .append("nombre", "Mos Def");

        Document artista37 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/MFDOOM.jpg")
                .append("nombre", "MF DOOM");

        Document artista38 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/Nas.jpg")
                .append("nombre", "Nas");

        Document artista39 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/JCole.jpg")
                .append("nombre", "J. Cole");

        Document artista40 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/LilWayne.jpg")
                .append("nombre", "Lil Wayne");

        // Clásica
        Document artista41 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/LudwigVanBeethoven.jpg")
                .append("nombre", "Ludwig van Beethoven");

        Document artista42 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/WolfgangAmadeusMozart.jpg")
                .append("nombre", "Wolfgang Amadeus Mozart");

        Document artista43 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/JohannSebastianBach.jpg")
                .append("nombre", "Johann Sebastian Bach");

        Document artista44 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/FredericChopin.jpg")
                .append("nombre", "Frédéric Chopin");

        Document artista45 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/PabloCasals.jpg")
                .append("nombre", "Pablo Casals");

// Soul
        Document artista46 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/ArethaFranklin.jpg")
                .append("nombre", "Aretha Franklin");

        Document artista47 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/MarvinGaye.jpg")
                .append("nombre", "Marvin Gaye");

        Document artista48 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/NinaSimone.jpg")
                .append("nombre", "Nina Simone");

        Document artista49 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/IsaacHayes.jpg")
                .append("nombre", "Isaac Hayes");

        Document artista50 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/StevieWonder.jpg")
                .append("nombre", "Stevie Wonder");

// Punk
        Document artista51 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Punk")))
                .append("imagen", "/artistas/IggyPop.jpg")
                .append("nombre", "Iggy Pop");

        Document artista52 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Punk")))
                .append("imagen", "/artistas/JoanJett.jpg")
                .append("nombre", "Joan Jett");

        Document artista53 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Punk")))
                .append("imagen", "/artistas/SidVicious.jpg")
                .append("nombre", "Sid Vicious");

        Document artista54 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Punk")))
                .append("imagen", "/artistas/PattiSmith.jpg")
                .append("nombre", "Patti Smith");

        Document artista55 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Punk")))
                .append("imagen", "/artistas/BillyIdol.jpg")
                .append("nombre", "Billy Idol");

// Funk
        Document artista56 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Funk")))
                .append("imagen", "/artistas/JamesBrown.jpg")
                .append("nombre", "James Brown");

        Document artista57 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Funk")))
                .append("imagen", "/artistas/GeorgeClinton.jpg")
                .append("nombre", "George Clinton");

        Document artista58 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Funk")))
                .append("imagen", "/artistas/Jamiroquai.jpg")
                .append("nombre", "Jamiroquai");

        Document artista59 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Funk")))
                .append("imagen", "/artistas/Prince.jpg")
                .append("nombre", "Prince");

        Document artista60 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Funk")))
                .append("imagen", "/artistas/RickJames.jpg")
                .append("nombre", "Rick James");

// Música Latina
        Document artista61 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/Shakira.jpg")
                .append("nombre", "Shakira");

        Document artista62 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/CarlosVives.jpg")
                .append("nombre", "Carlos Vives");

        Document artista63 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/Juanes.jpg")
                .append("nombre", "Juanes");

        Document artista64 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/MarcAnthony.jpg")
                .append("nombre", "Marc Anthony");

        Document artista65 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/GloriaEstefan.jpg")
                .append("nombre", "Gloria Estefan");

// R&B
        Document artista66 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("R&B")))
                .append("imagen", "/artistas/Usher.jpg")
                .append("nombre", "Usher");

        Document artista67 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("R&B")))
                .append("imagen", "/artistas/AliciaKeys.jpg")
                .append("nombre", "Alicia Keys");

        Document artista68 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("R&B")))
                .append("imagen", "/artistas/Beyonce.jpg")
                .append("nombre", "Beyoncé");

        Document artista69 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("R&B")))
                .append("imagen", "/artistas/TheWeeknd.jpg")
                .append("nombre", "The Weeknd");

        Document artista70 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("R&B")))
                .append("imagen", "/artistas/BrunoMars.jpg")
                .append("nombre", "Bruno Mars");

        // Trap
        Document artista71 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Trap")))
                .append("imagen", "/artistas/Future.jpg")
                .append("nombre", "Future");

        Document artista72 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Trap")))
                .append("imagen", "/artistas/TravisScott.jpg")
                .append("nombre", "Travis Scott");

        Document artista73 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Trap")))
                .append("imagen", "/artistas/PostMalone.jpg")
                .append("nombre", "Post Malone");

        Document artista74 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Trap")))
                .append("imagen", "/artistas/LilSkies.jpg")
                .append("nombre", "Lil Skies");

        Document artista75 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Trap")))
                .append("imagen", "/artistas/Dillom.jpg")
                .append("nombre", "Dillom");

// Electrónica
        Document artista76 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Electrónica")))
                .append("imagen", "/artistas/CalvinHarris.jpg")
                .append("nombre", "Calvin Harris");

        Document artista77 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Electrónica")))
                .append("imagen", "/artistas/DavidGuetta.jpg")
                .append("nombre", "David Guetta");

        Document artista78 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Electrónica")))
                .append("imagen", "/artistas/Deadmau5.jpg")
                .append("nombre", "Deadmau5");

        Document artista79 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Electrónica")))
                .append("imagen", "/artistas/Avicii.jpg")
                .append("nombre", "Avicii");

        Document artista80 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Electrónica")))
                .append("imagen", "/artistas/Skrillex.jpg")
                .append("nombre", "Skrillex");

// Rock Progresivo
        Document artista81 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/StevenWilson.jpg")
                .append("nombre", "Steven Wilson");

        Document artista82 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/RickWakeman.jpg")
                .append("nombre", "Rick Wakeman");

        Document artista83 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/PeterGabriel.jpg")
                .append("nombre", "Peter Gabriel");

        Document artista84 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/JonAnderson.jpg")
                .append("nombre", "Jon Anderson");

        Document artista85 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/KeithEmerson.jpg")
                .append("nombre", "Keith Emerson");

// Alternativo
        Document artista86 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Alternativo")))
                .append("imagen", "/artistas/Beck.jpg")
                .append("nombre", "Beck");

        Document artista87 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Alternativo")))
                .append("imagen", "/artistas/PJHarvey.jpg")
                .append("nombre", "PJ Harvey");

        Document artista88 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Alternativo")))
                .append("imagen", "/artistas/ToriAmos.jpg")
                .append("nombre", "Tori Amos");

        Document artista89 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Alternativo")))
                .append("imagen", "/artistas/Bjork.jpg")
                .append("nombre", "Bjork");

        Document artista90 = new Document()
                .append("esBanda", false)
                .append("generos", Arrays.asList(generoMap.get("Alternativo")))
                .append("imagen", "/artistas/TameImpala.jpg")
                .append("nombre", "Tame Impala");

        List<Document> artistas = new ArrayList<>();
        artistas.add(artista1);
        artistas.add(artista2);
        artistas.add(artista3);
        artistas.add(artista4);
        artistas.add(artista5);
        artistas.add(artista6);
        artistas.add(artista7);
        artistas.add(artista8);
        artistas.add(artista9);
        artistas.add(artista10);
        artistas.add(artista11);
        artistas.add(artista12);
        artistas.add(artista13);
        artistas.add(artista14);
        artistas.add(artista15);
        artistas.add(artista16);
        artistas.add(artista17);
        artistas.add(artista18);
        artistas.add(artista19);
        artistas.add(artista20);
        artistas.add(artista21);
        artistas.add(artista22);
        artistas.add(artista23);
        artistas.add(artista24);
        artistas.add(artista25);
        artistas.add(artista26);
        artistas.add(artista27);
        artistas.add(artista28);
        artistas.add(artista29);
        artistas.add(artista30);
        artistas.add(artista31);
        artistas.add(artista32);
        artistas.add(artista33);
        artistas.add(artista34);
        artistas.add(artista35);
        artistas.add(artista36);
        artistas.add(artista37);
        artistas.add(artista38);
        artistas.add(artista39);
        artistas.add(artista40);
        artistas.add(artista41);
        artistas.add(artista42);
        artistas.add(artista43);
        artistas.add(artista44);
        artistas.add(artista45);
        artistas.add(artista46);
        artistas.add(artista47);
        artistas.add(artista48);
        artistas.add(artista49);
        artistas.add(artista50);
        artistas.add(artista51);
        artistas.add(artista52);
        artistas.add(artista53);
        artistas.add(artista54);
        artistas.add(artista55);
        artistas.add(artista56);
        artistas.add(artista57);
        artistas.add(artista58);
        artistas.add(artista59);
        artistas.add(artista60);
        artistas.add(artista61);
        artistas.add(artista62);
        artistas.add(artista63);
        artistas.add(artista64);
        artistas.add(artista65);
        artistas.add(artista66);
        artistas.add(artista67);
        artistas.add(artista68);
        artistas.add(artista69);
        artistas.add(artista70);
        artistas.add(artista71);
        artistas.add(artista72);
        artistas.add(artista73);
        artistas.add(artista74);
        artistas.add(artista75);
        artistas.add(artista76);
        artistas.add(artista77);
        artistas.add(artista78);
        artistas.add(artista79);
        artistas.add(artista80);
        artistas.add(artista81);
        artistas.add(artista82);
        artistas.add(artista83);
        artistas.add(artista84);
        artistas.add(artista85);
        artistas.add(artista86);
        artistas.add(artista87);
        artistas.add(artista88);
        artistas.add(artista89);
        artistas.add(artista90);

        artistaColeccion.insertMany(artistas);

        Document integrante1 = new Document("esActivo", false)
                .append("fechaIngreso", "1960-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-12-08T00:00:00.000+00:00")
                .append("instrumento", "Guitarra y voz")
                .append("nombre", "John Lennon");

        Document integrante2 = new Document("esActivo", false)
                .append("fechaIngreso", "1960-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1970-04-10T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Paul McCartney");

        Document integrante3 = new Document("esActivo", false)
                .append("fechaIngreso", "1960-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-12-08T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Ringo Starr");

        Document integrante4 = new Document("esActivo", false)
                .append("fechaIngreso", "1960-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1970-04-10T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "George Harrison");

// BEATLES
        Document banda1 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock"), generoMap.get("Pop")))
                .append("imagen", "/artistas/TheBeatles.jpg")
                .append("integrante", Arrays.asList(integrante1, integrante2, integrante3, integrante4))
                .append("nombre", "The Beatles");

        Document integrante5 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-09-25T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Robert Plant");

        Document integrante6 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-09-25T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Jimmy Page");

        Document integrante7 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-09-25T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "John Paul Jones");

        Document integrante8 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-09-25T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "John Bonham");

// LED ZEPELLIN
        Document banda2 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock"), generoMap.get("Blues")))
                .append("imagen", "/artistas/LedZeppelin.jpg")
                .append("integrante", Arrays.asList(integrante8, integrante7, integrante6, integrante5))
                .append("nombre", "Led Zeppelin");

        Document integrante10 = new Document("esActivo", false)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1991-11-24T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Freddie Mercury");

        Document integrante11 = new Document("esActivo", false)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1991-11-24T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Brian May");

        Document integrante12 = new Document("esActivo", false)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1991-11-24T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "John Deacon");

        Document integrante13 = new Document("esActivo", false)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1991-11-24T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Roger Taylor");

// QUEEN
        Document banda3 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock"), generoMap.get("Pop Rock")))
                .append("imagen", "/artistas/Queen.jpg")
                .append("integrante", Arrays.asList(integrante10, integrante11, integrante12, integrante13))
                .append("nombre", "Queen");

        Document integrante14 = new Document("esActivo", true)
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Mick Jagger");

        Document integrante15 = new Document("esActivo", true)
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Keith Richards");

        Document integrante16 = new Document("esActivo", true)
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Bill Wyman");

        Document integrante17 = new Document("esActivo", true)
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Charlie Watts");

// ROLLING STONES
        Document banda4 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock"), generoMap.get("Blues Rock")))
                .append("imagen", "/artistas/RollingStones.jpg")
                .append("integrante", Arrays.asList(integrante14, integrante15, integrante16, integrante17))
                .append("nombre", "The Rolling Stones");

        // Integrantes
        Document integrante18 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz y guitarra")
                .append("nombre", "2D (Stuart Pot)"); // Personaje de Gorillaz

        Document integrante19 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Murdoc Niccals"); // Personaje de Gorillaz

        Document integrante20 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Russel Hobbs"); // Personaje de Gorillaz

        Document integrante21 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "Noodle"); // Personaje de Gorillaz

        Document banda5 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock"), generoMap.get("Hip Hop"), generoMap.get("Electrónica")))
                .append("imagen", "/artistas/Gorillaz.jpg")
                .append("integrante", Arrays.asList(integrante18, integrante19, integrante20, integrante21))
                .append("nombre", "Gorillaz");

        // JAZZ
        Document integrante22 = new Document("esActivo", false)
                .append("fechaIngreso", "1973-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "Herbie Hancock");

        Document integrante23 = new Document("esActivo", false)
                .append("fechaIngreso", "1973-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo eléctrico")
                .append("nombre", "Paul Jackson");

        Document integrante24 = new Document("esActivo", false)
                .append("fechaIngreso", "1973-01-01T00:00:00.000+00:00")
                .append("instrumento", "Percusión")
                .append("nombre", "Bill Summers");

        Document integrante25 = new Document("esActivo", false)
                .append("fechaIngreso", "1973-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Harvey Mason");

// Banda
        Document banda6 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Jazz"), generoMap.get("Fusion")))
                .append("imagen", "/artistas/HerbieHancockHeadhunters.jpg")
                .append("integrante", Arrays.asList(integrante22, integrante23, integrante24, integrante25))
                .append("nombre", "Herbie Hancock's Headhunters");

        Document integrante30 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1993-01-01T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Piano")
                .append("nombre", "Sun Ra");

        Document integrante31 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("instrumento", "Saxo alto")
                .append("nombre", "Marshall Allen");

        Document integrante32 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1970-12-31T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Trompeta")
                .append("nombre", "James Jacson");

        Document integrante33 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-12-31T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Bajo eléctrico")
                .append("nombre", "Richard Williams");

// Banda
        Document banda8 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Jazz"), generoMap.get("Free Jazz")))
                .append("imagen", "/artistas/SunRaArkestra.jpg")
                .append("integrante", Arrays.asList(integrante30, integrante31, integrante32, integrante33))
                .append("nombre", "Sun Ra Arkestra");
        // Integrantes
        Document integrante34 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1946-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1956-12-31T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Trompeta")
                .append("nombre", "Dizzy Gillespie");

        Document integrante35 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1946-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1956-12-31T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Trombón")
                .append("nombre", "John Lewis");

        Document integrante36 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1946-01-01T00:00:00.000+00:00")
                .append("instrumento", "Saxo alto")
                .append("nombre", "Milt Jackson");

        Document integrante37 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1946-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Kenny Clarke");

// Banda
        Document banda9 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Jazz"), generoMap.get("Bebop")))
                .append("imagen", "/artistas/DizzyGillespieBigBand.jpg")
                .append("integrante", Arrays.asList(integrante34, integrante35, integrante36, integrante37))
                .append("nombre", "Dizzy Gillespie Big Band");

        // Integrantes
        Document integrante38 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1955-01-01T00:00:00.000+00:00")
                .append("instrumento", "Saxo alto")
                .append("nombre", "Cannonball Adderley");

        Document integrante39 = new Document("esActivo", false) // No activo
                .append("fechaIngreso", "1955-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1970-12-31T00:00:00.000+00:00") // Fecha de retiro
                .append("instrumento", "Trompeta")
                .append("nombre", "Nat Adderley");

// Banda
        Document banda10 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Jazz"), generoMap.get("Hard Bop")))
                .append("imagen", "/artistas/CannonballAdderleyQuintet.jpg")
                .append("integrante", Arrays.asList(integrante38, integrante39))
                .append("nombre", "Cannonball Adderley Quintet");

        // Integrantes
        Document integrante40 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Adam Levine");

        Document integrante41 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "James Valentine");

        Document integrante42 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Mickey Madden");

        Document integrante43 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Matt Flynn");

// Banda
        Document banda11 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Pop"), generoMap.get("Rock")))
                .append("imagen", "/artistas/Maroon5.jpg")
                .append("integrante", Arrays.asList(integrante40, integrante41, integrante42, integrante43))
                .append("nombre", "Maroon 5");

        // Integrantes
        Document integrante44 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "2010-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Harry Styles");

        Document integrante45 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "2010-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Liam Payne");

        Document integrante46 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "2010-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Louis Tomlinson");

        Document integrante47 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "2010-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Niall Horan");

        Document integrante48 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "2010-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Zayn Malik");

// Banda
        Document banda12 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/OneDirection.jpg")
                .append("integrante", Arrays.asList(integrante44, integrante45, integrante46, integrante47, integrante48))
                .append("nombre", "One Direction");
        Document integrante49 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "AJ McLean");

        Document integrante50 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Howie Dorough");

        Document integrante51 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Nick Carter");

        Document integrante52 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Brian Littrell");

        Document integrante53 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Kevin Richardson");

// Banda
        Document banda13 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Pop"), generoMap.get("R&B")))
                .append("imagen", "/artistas/BackstreetBoys.jpg")
                .append("integrante", Arrays.asList(integrante49, integrante50, integrante51, integrante52, integrante53))
                .append("nombre", "Backstreet Boys");
        Document integrante54 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Ryan Tedder");

        Document integrante55 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Zach Filkins");

        Document integrante56 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Drew Brown");

        Document integrante57 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Eddie Fisher");

// Banda
        Document banda14 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Pop")))
                .append("imagen", "/artistas/OneRepublic.jpg")
                .append("integrante", Arrays.asList(integrante54, integrante55, integrante56, integrante57))
                .append("nombre", "OneRepublic");

        Document integrante58 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1996-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Chris Martin");

        Document integrante59 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1996-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Jonny Buckland");

        Document integrante60 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1996-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Guy Berryman");

        Document integrante61 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1996-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Will Champion");

// Banda
        Document banda15 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Pop"), generoMap.get("Rock")))
                .append("imagen", "/artistas/Coldplay.jpg")
                .append("integrante", Arrays.asList(integrante58, integrante59, integrante60, integrante61))
                .append("nombre", "Coldplay");

        Document integrante62 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1981-05-11T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Bob Marley");

        Document integrante63 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1981-05-11T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Peter Tosh");

        Document integrante64 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1981-05-11T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Bunny Wailer");

        Document integrante65 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "Al Anderson");

// Banda
        Document banda16 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/BobMarleyTheWailers.jpg")
                .append("integrante", Arrays.asList(integrante62, integrante63, integrante64, integrante65))
                .append("nombre", "Bob Marley & The Wailers");

        Document integrante66 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Toots Hibbert");

        Document integrante67 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Simeon Hendricks");

        Document integrante68 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Raleigh Grant");

        Document integrante69 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "John Lee");

        Document integrante70 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1962-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2006-05-11T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Arnold Reuben");

// Banda
        Document banda17 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/TootsAndTheMaytals.jpg")
                .append("integrante", Arrays.asList(integrante66, integrante67, integrante68, integrante69, integrante70))
                .append("nombre", "Toots and the Maytals");

        Document integrante71 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Mykal Rose");

        Document integrante72 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Gary Pine");

        Document integrante73 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Derrick Simpson");

        Document integrante74 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Earl Smith");

// Banda
        Document banda18 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/BlackUhuru.jpg")
                .append("integrante", Arrays.asList(integrante71, integrante72, integrante73, integrante74))
                .append("nombre", "Black Uhuru");

        Document integrante75 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "David Hinds");

        Document integrante76 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Algernon Fitzroy");

        Document integrante77 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Sidney Mills");

        Document integrante78 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Garry Mullings");

// Banda
        Document banda19 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/SteelPulse.jpg")
                .append("integrante", Arrays.asList(integrante75, integrante76, integrante77, integrante78))
                .append("nombre", "Steel Pulse");

        Document integrante79 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Jacob Miller");

        Document integrante80 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Doug Wendt");

        Document integrante81 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Kirk Davis");

        Document integrante82 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Lloyd Wilks");

        Document integrante83 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-03-23T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "Stewart Fagan");

// Banda
        Document banda20 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Reggae")))
                .append("imagen", "/artistas/InnerCircle.jpg")
                .append("integrante", Arrays.asList(integrante79, integrante80, integrante81, integrante82, integrante83))
                .append("nombre", "Inner Circle");

        Document integrante84 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1949-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2015-05-14T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "B.B. King");

        Document integrante85 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1980-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "David Brown");

        Document integrante86 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1980-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Tony Coleman");

        Document integrante87 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1980-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "James T. Smith");

// Banda
        Document banda21 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/BBKingBluesBoys.jpg")
                .append("integrante", Arrays.asList(integrante84, integrante85, integrante86, integrante87))
                .append("nombre", "B.B. King and the Blues Boys");

        Document integrante95 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1948-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2001-06-21T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "John Lee Hooker");

        Document integrante96 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Jimmy Reed");

        Document integrante97 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Sammy Price");

        Document integrante98 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1950-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado")
                .append("nombre", "Louis Myers");

// Banda
        Document banda24 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/JohnLeeHookerCoastToCoast.jpg")
                .append("integrante", Arrays.asList(integrante95, integrante96, integrante97, integrante98))
                .append("nombre", "John Lee Hooker and the Coast to Coast Blues Band");

        Document integrante99 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1965-03-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Eric Clapton");

        Document integrante100 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Paul Samwell-Smith");

        Document integrante101 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Jim McCarty");

        Document integrante102 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1963-01-01T00:00:00.000+00:00")
                .append("instrumento", "Armónica")
                .append("nombre", "Keith Relf");

// Banda
        Document banda25 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Blues")))
                .append("imagen", "/artistas/Yardbirds.jpg")
                .append("integrante", Arrays.asList(integrante99, integrante100, integrante101, integrante102))
                .append("nombre", "Eric Clapton and The Yardbirds");

        Document integrante103 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Johnny Cash");

        Document integrante104 = new Document("esActivo", false) // Retirado (fallecido)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2013-09-06T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Waylon Jennings");

        Document integrante105 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Willie Nelson");

        Document integrante106 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Bajo")
                .append("nombre", "Kris Kristofferson");

// Banda
        Document banda26 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/Highwaymen.jpg")
                .append("integrante", Arrays.asList(integrante103, integrante104, integrante105, integrante106))
                .append("nombre", "The Highwaymen");

// Integrantes
        Document integrante107 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Violín")
                .append("nombre", "Natalie Maines");

        Document integrante108 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Emily Strayer");

        Document integrante109 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Banjo")
                .append("nombre", "Martie Maguire");

// Banda
        Document banda27 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/DixieChicks.jpg")
                .append("integrante", Arrays.asList(integrante107, integrante108, integrante109))
                .append("nombre", "The Dixie Chicks");

// Integrantes
        Document integrante110 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Randy Owen");

        Document integrante111 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Teddy Gentry");

        Document integrante112 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1972-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Jeff Cook");

// Banda
        Document banda28 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/Alabama.jpg")
                .append("integrante", Arrays.asList(integrante110, integrante111, integrante112))
                .append("nombre", "Alabama");

// Integrantes
        Document integrante113 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1990-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Kix Brooks");

        Document integrante114 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1990-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Ronnie Dunn");

// Banda
        Document banda29 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/BrooksAndDunn.jpg")
                .append("integrante", Arrays.asList(integrante113, integrante114))
                .append("nombre", "Brooks & Dunn");

// Integrantes
        Document integrante115 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Zac Brown");

        Document integrante116 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "John Driskell Hopkins");

        Document integrante117 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Jimmy De Martini");

        Document integrante118 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclado, Mandolina")
                .append("nombre", "Clay Cook");

        Document integrante119 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Chris Fryar");

// Banda
        Document banda30 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Country")))
                .append("imagen", "/artistas/ZacBrownBand.jpg")
                .append("integrante", Arrays.asList(integrante115, integrante116, integrante117, integrante118, integrante119))
                .append("nombre", "Zac Brown Band");

        Document integrante120 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra líder")
                .append("nombre", "James Hetfield");

        Document integrante121 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1983-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Lars Ulrich");

        Document integrante122 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1983-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra rítmica")
                .append("nombre", "Kirk Hammett");

        Document integrante123 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2003-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Robert Trujillo");

// Banda
        Document banda31 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/Metallica.jpg")
                .append("integrante", Arrays.asList(integrante120, integrante121, integrante122, integrante123))
                .append("nombre", "Metallica");

// Integrantes
        Document integrante124 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Bruce Dickinson");

        Document integrante125 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Steve Harris");

        Document integrante126 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1980-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra líder")
                .append("nombre", "Dave Murray");

        Document integrante127 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1999-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra rítmica")
                .append("nombre", "Janick Gers");

        Document integrante128 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Nicko McBrain");

// Banda
        Document banda32 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/IronMaiden.jpg")
                .append("integrante", Arrays.asList(integrante124, integrante125, integrante126, integrante127, integrante128))
                .append("nombre", "Iron Maiden");

// Integrantes
        Document integrante129 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Rob Halford");

        Document integrante130 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1974-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra líder")
                .append("nombre", "Glenn Tipton");

        Document integrante131 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1978-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Ian Hill");

        Document integrante132 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra rítmica")
                .append("nombre", "Richie Faulkner");

        Document integrante133 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2011-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Scott Travis");

// Banda
        Document banda33 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/JudasPriest.jpg")
                .append("integrante", Arrays.asList(integrante129, integrante130, integrante131, integrante132, integrante133))
                .append("nombre", "Judas Priest");

// Integrantes
        Document integrante134 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Ozzy Osbourne");

        Document integrante135 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Tony Iommi");

        Document integrante136 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Geezer Butler");

        Document integrante137 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Bill Ward");

// Banda
        Document banda34 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/BlackSabbath.jpg")
                .append("integrante", Arrays.asList(integrante134, integrante135, integrante136, integrante137))
                .append("nombre", "Black Sabbath");

// Integrantes
        Document integrante138 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1983-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra líder")
                .append("nombre", "Dave Mustaine");

        Document integrante139 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1987-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "David Ellefson");

        Document integrante140 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2004-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Shawn Drover");

        Document integrante141 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2004-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra rítmica")
                .append("nombre", "Chris Broderick");

// Banda
        Document banda35 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Metal")))
                .append("imagen", "/artistas/Megadeth.jpg")
                .append("integrante", Arrays.asList(integrante138, integrante139, integrante140, integrante141))
                .append("nombre", "Megadeth");
// Integrantes
        Document integrante142 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1992-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "RZA");

        Document integrante143 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1992-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "GZA");

        Document integrante144 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1992-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Ol' Dirty Bastard");

        Document integrante145 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1992-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Inspectah Deck");

        Document integrante146 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1992-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Raekwon");

// Banda
        Document banda36 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/WuTangClan.jpg")
                .append("integrante", Arrays.asList(integrante142, integrante143, integrante144, integrante145, integrante146))
                .append("nombre", "Wu-Tang Clan");

// Integrantes
        Document integrante147 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1987-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Guru");

        Document integrante148 = new Document("esActivo", false) // No activo (retiro)
                .append("fechaIngreso", "1987-01-01T00:00:00.000+00:00")
                .append("instrumento", "DJ/Producción")
                .append("nombre", "DJ Premier");

// Banda
        Document banda37 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/GangStarr.jpg")
                .append("integrante", Arrays.asList(integrante147, integrante148))
                .append("nombre", "Gang Starr");

// Integrantes
        Document integrante149 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Lauryn Hill");

        Document integrante150 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Wyclef Jean");

        Document integrante151 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1994-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Pras Michel");

// Banda
        Document banda38 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/TheFugees.jpg")
                .append("integrante", Arrays.asList(integrante149, integrante150, integrante151))
                .append("nombre", "The Fugees");

// Integrantes
        Document integrante152 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Rafael Lechoswky");

        Document integrante153 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Franc Sanz");

// Banda
        Document banda39 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/Flowklorikos.jpg")
                .append("integrante", Arrays.asList(integrante152, integrante153))
                .append("nombre", "Flowklorikos");

// Integrantes
        Document integrante154 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Q-Tip");

        Document integrante155 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Phife Dawg");

        Document integrante156 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "DJ")
                .append("nombre", "Ali Shaheed Muhammad");

        Document integrante157 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "DJ")
                .append("nombre", "Jarobi White");

// Banda
        Document banda40 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/ATribeCalledQuest.jpg")
                .append("integrante", Arrays.asList(integrante154, integrante155, integrante156, integrante157))
                .append("nombre", "A Tribe Called Quest");
// Integrantes
        Document integrante158 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2012-05-04T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Mike D");

        Document integrante159 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2012-05-04T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "Ad-Rock");

        Document integrante160 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2012-05-04T00:00:00.000+00:00")
                .append("instrumento", "Rap")
                .append("nombre", "MCA");

        Document integrante161 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1981-01-01T00:00:00.000+00:00")
                .append("instrumento", "DJ")
                .append("nombre", "Mix Master Mike");

// Banda
        Document banda41 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Hip Hop")))
                .append("imagen", "/artistas/BeastieBoys.jpg")
                .append("integrante", Arrays.asList(integrante158, integrante159, integrante160, integrante161))
                .append("nombre", "Beastie Boys");

// Integrantes
        Document integrante162 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1990-01-01T00:00:00.000+00:00")
                .append("instrumento", "Violín")
                .append("nombre", "José Hernández");

        Document integrante163 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1995-01-01T00:00:00.000+00:00")
                .append("instrumento", "Cello")
                .append("nombre", "Maria González");

        Document integrante164 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2000-01-01T00:00:00.000+00:00")
                .append("instrumento", "Piano")
                .append("nombre", "Karl Schmidt");

        Document integrante165 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1980-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2015-01-01T00:00:00.000+00:00")
                .append("instrumento", "Flauta")
                .append("nombre", "Peter Müller");

// Banda
        Document banda42 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/ViennaPhilharmonic.jpg")
                .append("integrante", Arrays.asList(integrante162, integrante163, integrante164, integrante165))
                .append("nombre", "The Vienna Philharmonic");

// Integrantes
        Document integrante174 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1999-01-01T00:00:00.000+00:00")
                .append("instrumento", "Violín")
                .append("nombre", "Sophia White");

        Document integrante175 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2004-01-01T00:00:00.000+00:00")
                .append("instrumento", "Trompeta")
                .append("nombre", "Daniel Martin");

        Document integrante176 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1990-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2018-01-01T00:00:00.000+00:00")
                .append("instrumento", "Violoncello")
                .append("nombre", "Charlotte Brown");

        Document integrante177 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2012-01-01T00:00:00.000+00:00")
                .append("instrumento", "Piano")
                .append("nombre", "Thomas Lee");

// Banda
        Document banda45 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/LondonSymphonyOrchestra.jpg")
                .append("integrante", Arrays.asList(integrante174, integrante175, integrante176, integrante177))
                .append("nombre", "The London Symphony Orchestra");

// Integrantes
        Document integrante178 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2001-01-01T00:00:00.000+00:00")
                .append("instrumento", "Viola")
                .append("nombre", "Sebastian Taylor");

        Document integrante179 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2003-01-01T00:00:00.000+00:00")
                .append("instrumento", "Oboe")
                .append("nombre", "Nancy McCallum");

        Document integrante180 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1990-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2015-01-01T00:00:00.000+00:00")
                .append("instrumento", "Contrabajo")
                .append("nombre", "Charles Simmons");

        Document integrante181 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "2005-01-01T00:00:00.000+00:00")
                .append("instrumento", "Percusión")
                .append("nombre", "Andrew Grant");

// Banda
        Document banda46 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Clásica")))
                .append("imagen", "/artistas/NewYorkPhilharmonic.jpg")
                .append("integrante", Arrays.asList(integrante178, integrante179, integrante180, integrante181))
                .append("nombre", "The New York Philharmonic");

// Integrantes
        Document integrante182 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1954-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Ronald Isley");

        Document integrante183 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1965-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Ernie Isley");

// Banda
        Document banda47 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/TheIsleyBrothers.jpg")
                .append("integrante", Arrays.asList(integrante182, integrante183))
                .append("nombre", "The Isley Brothers");

// Integrantes
        Document integrante185 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1959-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1977-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Diana Ross");

        Document integrante186 = new Document("esActivo", false) // Retirado
                .append("fechaIngreso", "1959-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1977-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Mary Wilson");

        Document integrante187 = new Document("esActivo", true) // Activo
                .append("fechaIngreso", "1961-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Florence Ballard");

// Banda
        Document banda48 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Soul")))
                .append("imagen", "/artistas/TheSupremes.jpg")
                .append("integrante", Arrays.asList(integrante185, integrante186, integrante187))
                .append("nombre", "The Supremes");

// Integrantes
        Document integrante188 = new Document("esActivo", true)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Robert Smith");

        Document integrante189 = new Document("esActivo", true)
                .append("fechaIngreso", "1979-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Simon Gallup");

        Document integrante190 = new Document("esActivo", true)
                .append("fechaIngreso", "1979-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Jason Cooper");

// Banda
        Document banda49 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Punk"), generoMap.get("Rock Alternativo")))
                .append("imagen", "/artistas/TheCure.jpg")
                .append("integrante", Arrays.asList(integrante187, integrante188, integrante189))
                .append("nombre", "The Cure");

// Integrantes
        Document integrante193 = new Document("esActivo", true)
                .append("fechaIngreso", "1974-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Debbie Harry");

        Document integrante194 = new Document("esActivo", true)
                .append("fechaIngreso", "1974-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Chris Stein");

        Document integrante195 = new Document("esActivo", true)
                .append("fechaIngreso", "1974-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Clem Burke");

// Banda
        Document banda50 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Punk"), generoMap.get("New Wave")))
                .append("imagen", "/artistas/Blondie.jpg")
                .append("integrante", Arrays.asList(integrante193, integrante194, integrante195))
                .append("nombre", "Blondie");

// Integrantes
        Document integrante196 = new Document("esActivo", false)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-05-18T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Ian Curtis");

        Document integrante197 = new Document("esActivo", false)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-05-18T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Bernard Sumner");

        Document integrante198 = new Document("esActivo", false)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1980-05-18T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Peter Hook");

// Banda
        Document banda51 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Punk"), generoMap.get("Post-Punk")))
                .append("imagen", "/artistas/JoyDivision.jpg")
                .append("integrante", Arrays.asList(integrante196, integrante197, integrante198))
                .append("nombre", "Joy Division");

// Integrantes
        Document integrante199 = new Document("esActivo", false)
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1978-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Johnny Rotten");

        Document integrante200 = new Document("esActivo", false)
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1978-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Steve Jones");

        Document integrante201 = new Document("esActivo", false)
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1978-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Sid Vicious");

// Banda
        Document banda52 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Punk"), generoMap.get("Hardcore Punk")))
                .append("imagen", "/artistas/SexPistols.jpg")
                .append("integrante", Arrays.asList(integrante199, integrante200, integrante201))
                .append("nombre", "Sex Pistols");

// Integrantes
        Document integrante202 = new Document("esActivo", true)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Joe Strummer");

        Document integrante203 = new Document("esActivo", true)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Mick Jones");

        Document integrante204 = new Document("esActivo", true)
                .append("fechaIngreso", "1976-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Paul Simonon");

// Banda
        Document banda53 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Punk"), generoMap.get("Reggae")))
                .append("imagen", "/artistas/TheClash.jpg")
                .append("integrante", Arrays.asList(integrante202, integrante203, integrante204))
                .append("nombre", "The Clash");
// Integrantes
        Document integrante209 = new Document("esActivo", true)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Bajo")
                .append("nombre", "George Clinton");

        Document integrante210 = new Document("esActivo", true)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados")
                .append("nombre", "Bernie Worrell");

        Document integrante211 = new Document("esActivo", true)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Eddie Hazel");

// Banda
        Document banda54 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Funk"), generoMap.get("P-Funk")))
                .append("imagen", "/artistas/Parliament.jpg")
                .append("integrante", Arrays.asList(integrante209, integrante210, integrante211))
                .append("nombre", "Parliament");

// Integrantes
        Document integrante212 = new Document("esActivo", true)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "George Clinton");

        Document integrante213 = new Document("esActivo", true)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados")
                .append("nombre", "Bernie Worrell");

        Document integrante214 = new Document("esActivo", true)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Eddie Hazel");

// Banda
        Document banda55 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Funk"), generoMap.get("P-Funk")))
                .append("imagen", "/artistas/Funkadelic.jpg")
                .append("integrante", Arrays.asList(integrante212, integrante213, integrante214))
                .append("nombre", "Funkadelic");

        Document integrante215 = new Document("esActivo", true)
                .append("fechaIngreso", "1991-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Dante Spinetta");

        Document integrante216 = new Document("esActivo", true)
                .append("fechaIngreso", "1991-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Emmanuel Horvilleur");

// Banda
        Document banda57 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Funk"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/IlyaKuryaki.jpg")
                .append("integrante", Arrays.asList(integrante215, integrante216))
                .append("nombre", "Ilya Kuryaki and the Valderramas");

// Buena Vista Social Club
        Document integrante219 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Piano")
                .append("nombre", "Juan de Marcos González");

        Document integrante220 = new Document("esActivo", false)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2000-12-31T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Compay Segundo");

        Document integrante221 = new Document("esActivo", true)
                .append("fechaIngreso", "1975-01-01T00:00:00.000+00:00")
                .append("instrumento", "Percusión")
                .append("nombre", "Luis Conte");

        Document banda58 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Música Latina")))
                .append("imagen", "/artistas/BuenaVistaSocialClub.jpg")
                .append("integrante", Arrays.asList(integrante219, integrante220, integrante221))
                .append("nombre", "Buena Vista Social Club");

// Los Ángeles Azules
        Document integrante217 = new Document("esActivo", true)
                .append("fechaIngreso", "1999-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Álvaro López");

        Document integrante218 = new Document("esActivo", true)
                .append("fechaIngreso", "1999-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Roberto Márquez");

        Document banda59 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Música Latina"), generoMap.get("Cumbia")))
                .append("imagen", "/artistas/LosAngelesAzules.jpg")
                .append("integrante", Arrays.asList(integrante217, integrante218))
                .append("nombre", "Los Ángeles Azules");

        // Sonder
        Document integrante2190 = new Document("esActivo", true)
                .append("fechaIngreso", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Brent Faiyaz");

        Document integrante2200 = new Document("esActivo", true)
                .append("fechaIngreso", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción")
                .append("nombre", "Dpat");

        Document integrante2210 = new Document("esActivo", true)
                .append("fechaIngreso", "2016-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción")
                .append("nombre", "Atu");

        Document banda60 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("R&B"), generoMap.get("Soul")))
                .append("imagen", "/artistas/Sonder.jpg")
                .append("integrante", Arrays.asList(integrante2190, integrante2200, integrante2210))
                .append("nombre", "Sonder");

// The Internet
        Document integrante222 = new Document("esActivo", true)
                .append("fechaIngreso", "2011-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Syd");

        Document integrante223 = new Document("esActivo", true)
                .append("fechaIngreso", "2011-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Steve Lacy");

        Document integrante224 = new Document("esActivo", true)
                .append("fechaIngreso", "2011-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Patrick Paige II");

        Document banda61 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("R&B"), generoMap.get("Soul")))
                .append("imagen", "/artistas/TheInternet.jpg")
                .append("integrante", Arrays.asList(integrante222, integrante223, integrante224))
                .append("nombre", "The Internet");

// Brockhampton
        Document integrante225 = new Document("esActivo", false)
                .append("fechaIngreso", "2015-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2022-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Kevin Abstract");

        Document integrante226 = new Document("esActivo", false)
                .append("fechaIngreso", "2015-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2022-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Matt Champion");

        Document integrante227 = new Document("esActivo", false)
                .append("fechaIngreso", "2015-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2022-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción")
                .append("nombre", "Bearface");

        Document banda62 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("R&B"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/Brockhampton.jpg")
                .append("integrante", Arrays.asList(integrante225, integrante226, integrante227))
                .append("nombre", "Brockhampton");

        Document integrante228 = new Document("esActivo", false)
                .append("fechaIngreso", "2008-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2023-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Quavo");

        Document integrante229 = new Document("esActivo", false)
                .append("fechaIngreso", "2008-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2023-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Offset");

        Document integrante230 = new Document("esActivo", false)
                .append("fechaIngreso", "2008-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2023-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Takeoff");

        Document banda63 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Trap"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/Migos.jpg")
                .append("integrante", Arrays.asList(integrante228, integrante229, integrante230))
                .append("nombre", "Migos");

        Document integrante231 = new Document("esActivo", true)
                .append("fechaIngreso", "2019-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Travis Scott");

        Document integrante232 = new Document("esActivo", true)
                .append("fechaIngreso", "2019-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Don Toliver");

        Document banda64 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Trap"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/Jackboys.jpg")
                .append("integrante", Arrays.asList(integrante231, integrante232))
                .append("nombre", "Jackboys");

        Document integrante233 = new Document("esActivo", false)
                .append("fechaIngreso", "2016-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2020-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "OhGeesy");

        Document integrante234 = new Document("esActivo", false)
                .append("fechaIngreso", "2016-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2020-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Fenix Flexin");

        Document banda65 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Trap"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/ShorelineMafia.jpg")
                .append("integrante", Arrays.asList(integrante233, integrante234))
                .append("nombre", "Shoreline Mafia");

// Rae Sremmurd
        Document integrante235 = new Document("esActivo", true)
                .append("fechaIngreso", "2013-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Swae Lee");

        Document integrante236 = new Document("esActivo", true)
                .append("fechaIngreso", "2013-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "Slim Jxmmi");

        Document banda66 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Trap"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/RaeSremmurd.jpg")
                .append("integrante", Arrays.asList(integrante235, integrante236))
                .append("nombre", "Rae Sremmurd");

// City Girls
        Document integrante237 = new Document("esActivo", true)
                .append("fechaIngreso", "2017-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz principal")
                .append("nombre", "Yung Miami");

        Document integrante238 = new Document("esActivo", true)
                .append("fechaIngreso", "2017-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz secundaria")
                .append("nombre", "JT");

        Document banda67 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Trap"), generoMap.get("Hip-Hop")))
                .append("imagen", "/artistas/CityGirls.jpg")
                .append("integrante", Arrays.asList(integrante237, integrante238))
                .append("nombre", "City Girls");

// Daft Punk
        Document integrante239 = new Document("esActivo", false)
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2021-02-22T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Thomas Bangalter");

        Document integrante240 = new Document("esActivo", false)
                .append("fechaIngreso", "1993-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2021-02-22T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Guy-Manuel de Homem-Christo");

        Document banda68 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Electrónica"), generoMap.get("House")))
                .append("imagen", "/artistas/DaftPunk.jpg")
                .append("integrante", Arrays.asList(integrante239, integrante240))
                .append("nombre", "Daft Punk");

// The Chemical Brothers
        Document integrante241 = new Document("esActivo", true)
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Tom Rowlands");

        Document integrante242 = new Document("esActivo", true)
                .append("fechaIngreso", "1989-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Ed Simons");

        Document banda69 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Electrónica"), generoMap.get("Big Beat")))
                .append("imagen", "/artistas/ChemicalBrothers.jpg")
                .append("integrante", Arrays.asList(integrante241, integrante242))
                .append("nombre", "The Chemical Brothers");

// Kraftwerk
        Document integrante243 = new Document("esActivo", false)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2008-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados, Sintetizador")
                .append("nombre", "Florian Schneider");

        Document integrante244 = new Document("esActivo", true)
                .append("fechaIngreso", "1970-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados, Sintetizador")
                .append("nombre", "Ralf Hütter");

        Document banda70 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Electrónica"), generoMap.get("Synth-Pop")))
                .append("imagen", "/artistas/Kraftwerk.jpg")
                .append("integrante", Arrays.asList(integrante243, integrante244))
                .append("nombre", "Kraftwerk");

// Justice
        Document integrante245 = new Document("esActivo", true)
                .append("fechaIngreso", "2003-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Gaspard Augé");

        Document integrante246 = new Document("esActivo", true)
                .append("fechaIngreso", "2003-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Xavier de Rosnay");

        Document banda71 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Electrónica"), generoMap.get("Electro House")))
                .append("imagen", "/artistas/Justice.jpg")
                .append("integrante", Arrays.asList(integrante245, integrante246))
                .append("nombre", "Justice");

        Document integrante247 = new Document("esActivo", true)
                .append("fechaIngreso", "2005-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Jesse F. Keeler");

        Document integrante248 = new Document("esActivo", true)
                .append("fechaIngreso", "2005-01-01T00:00:00.000+00:00")
                .append("instrumento", "Producción, DJ")
                .append("nombre", "Al-P");

        Document banda72 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Electrónica"), generoMap.get("Electro House")))
                .append("imagen", "/artistas/MSTRKRFT.jpg")
                .append("integrante", Arrays.asList(integrante247, integrante248))
                .append("nombre", "MSTRKRFT");

// Integrantes de Pink Floyd
        Document integrante249 = new Document("esActivo", false)
                .append("fechaIngreso", "1965-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2008-09-15T00:00:00.000+00:00")
                .append("instrumento", "Guitarra, Voz")
                .append("nombre", "David Gilmour");

        Document integrante250 = new Document("esActivo", false)
                .append("fechaIngreso", "1965-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2008-09-15T00:00:00.000+00:00")
                .append("instrumento", "Bajo, Voz")
                .append("nombre", "Roger Waters");

        Document integrante251 = new Document("esActivo", false)
                .append("fechaIngreso", "1965-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2008-09-15T00:00:00.000+00:00")
                .append("instrumento", "Teclados")
                .append("nombre", "Richard Wright");

        Document integrante252 = new Document("esActivo", false)
                .append("fechaIngreso", "1965-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "2008-09-15T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Nick Mason");

// Banda Pink Floyd
        Document banda73 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo"), generoMap.get("Psychedelic Rock")))
                .append("imagen", "/artistas/PinkFloyd.jpg")
                .append("integrante", Arrays.asList(integrante249, integrante250, integrante251, integrante252))
                .append("nombre", "Pink Floyd");

// Serú Girán (ya creada anteriormente)
        Document integrante2370 = new Document("esActivo", false)
                .append("fechaIngreso", "1978-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1982-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Teclado")
                .append("nombre", "Charly García");

        Document integrante2380 = new Document("esActivo", false)
                .append("fechaIngreso", "1978-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1982-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo, Voz")
                .append("nombre", "Pedro Aznar");

        Document integrante2390 = new Document("esActivo", false)
                .append("fechaIngreso", "1978-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1982-01-01T00:00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "David Lebón");

        Document integrante2400 = new Document("esActivo", false)
                .append("fechaIngreso", "1978-01-01T00:00:00.000+00:00")
                .append("fechaRetiro", "1982-01-01T00:00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Oscar Moro");

        Document banda74 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo"), generoMap.get("Rock")))
                .append("imagen", "/artistas/SeruGiran.jpg")
                .append("integrante", Arrays.asList(integrante2370, integrante2380, integrante2390, integrante2400))
                .append("nombre", "Serú Girán");

// Integrantes de Yes
        Document integrante253 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Jon Anderson");

        Document integrante254 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Steve Howe");

        Document integrante255 = new Document("esActivo", false)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados")
                .append("nombre", "Rick Wakeman");

// Banda Yes
        Document banda75 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/Yes.jpg")
                .append("integrante", Arrays.asList(integrante253, integrante254, integrante255))
                .append("nombre", "Yes");

// Integrantes de Genesis
        Document integrante256 = new Document("esActivo", false)
                .append("fechaIngreso", "1967-01-01T00:00:00.000+00:00")
                .append("instrumento", "Teclados")
                .append("nombre", "Tony Banks");

        Document integrante257 = new Document("esActivo", false)
                .append("fechaIngreso", "1967-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Phil Collins");

// Banda Genesis
        Document banda76 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/Genesis.jpg")
                .append("integrante", Arrays.asList(integrante256, integrante257))
                .append("nombre", "Genesis");

// Integrantes de King Crimson
        Document integrante258 = new Document("esActivo", true)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Robert Fripp");

        Document integrante259 = new Document("esActivo", true)
                .append("fechaIngreso", "1968-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Tony Levin");

// Banda King Crimson
        Document banda77 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Rock Progresivo")))
                .append("imagen", "/artistas/KingCrimson.jpg")
                .append("integrante", Arrays.asList(integrante258, integrante259))
                .append("nombre", "King Crimson");

        // Integrantes de The Strokes
        Document integrante2410 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz")
                .append("nombre", "Julian Casablancas");

        Document integrante2420 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Nick Valensi");

        Document integrante2430 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Nikolai Fraiture");

        Document integrante2440 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Albert Hammond Jr.");

        Document integrante2450 = new Document("esActivo", true)
                .append("fechaIngreso", "1998-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Fabrizio Moretti");

// Banda The Strokes
        Document banda79 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Alternativo"), generoMap.get("Rock")))
                .append("imagen", "/artistas/TheStrokes.jpg")
                .append("integrante", Arrays.asList(integrante2410, integrante2420, integrante2430, integrante2440, integrante2450))
                .append("nombre", "The Strokes");

// Integrantes de Interpol
        Document integrante2460 = new Document("esActivo", true)
                .append("fechaIngreso", "1997-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Bajo")
                .append("nombre", "Paul Banks");

        Document integrante2470 = new Document("esActivo", true)
                .append("fechaIngreso", "1997-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Daniel Kessler");

        Document integrante2480 = new Document("esActivo", true)
                .append("fechaIngreso", "1997-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Sam Fogarino");

// Banda Interpol
        Document banda80 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Alternativo"), generoMap.get("Post-Punk")))
                .append("imagen", "/artistas/Interpol.jpg")
                .append("integrante", Arrays.asList(integrante2460, integrante2470, integrante2480))
                .append("nombre", "Interpol");

// Integrantes de Radiohead
        Document integrante2490 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Thom Yorke");

        Document integrante2500 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Jonny Greenwood");

        Document integrante2510 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Colin Greenwood");

        Document integrante2520 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Phil Selway");

        Document integrante2530 = new Document("esActivo", true)
                .append("fechaIngreso", "1985-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra, Teclado")
                .append("nombre", "Ed O'Brien");

// Banda Radiohead
        Document banda81 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Alternativo"), generoMap.get("Experimental")))
                .append("imagen", "/artistas/Radiohead.jpg")
                .append("integrante", Arrays.asList(integrante2490, integrante2500, integrante2510, integrante2520, integrante2530))
                .append("nombre", "Radiohead");

// Integrantes de Arctic Monkeys
        Document integrante2540 = new Document("esActivo", true)
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Guitarra")
                .append("nombre", "Alex Turner");

        Document integrante2550 = new Document("esActivo", true)
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Nick O'Malley");

        Document integrante2560 = new Document("esActivo", true)
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Matt Helders");

        Document integrante2570 = new Document("esActivo", true)
                .append("fechaIngreso", "2002-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Jamie Cook");

// Banda Arctic Monkeys
        Document banda82 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Alternativo"), generoMap.get("Indie")))
                .append("imagen", "/artistas/ArcticMonkeys.jpg")
                .append("integrante", Arrays.asList(integrante2540, integrante2550, integrante2560, integrante2570))
                .append("nombre", "Arctic Monkeys");

// Integrantes de The Killers
        Document integrante2580 = new Document("esActivo", true)
                .append("fechaIngreso", "2001-01-01T00:00:00.000+00:00")
                .append("instrumento", "Voz, Teclado")
                .append("nombre", "Brandon Flowers");

        Document integrante2590 = new Document("esActivo", true)
                .append("fechaIngreso", "2001-01-01T00:00:00.000+00:00")
                .append("instrumento", "Guitarra")
                .append("nombre", "Dave Keuning");

        Document integrante2600 = new Document("esActivo", true)
                .append("fechaIngreso", "2001-01-01T00:00:00.000+00:00")
                .append("instrumento", "Bajo")
                .append("nombre", "Mark Stoermer");

        Document integrante2610 = new Document("esActivo", true)
                .append("fechaIngreso", "2001-01-01T00:00:00.000+00:00")
                .append("instrumento", "Batería")
                .append("nombre", "Ronnie Vannucci Jr.");

// Banda The Killers
        Document banda83 = new Document()
                .append("esBanda", true)
                .append("generos", Arrays.asList(generoMap.get("Alternativo"), generoMap.get("Rock")))
                .append("imagen", "/artistas/TheKillers.jpg")
                .append("integrante", Arrays.asList(integrante2580, integrante2590, integrante2600, integrante2610))
                .append("nombre", "The Killers");

// Insertar bandas
        artistaColeccion.insertMany(Arrays.asList(banda79, banda80, banda81, banda82, banda83));

        List<Document> bandas = new ArrayList<>();
        artistas.add(banda1);
        artistas.add(banda2);
        artistas.add(banda3);
        artistas.add(banda4);
        artistas.add(banda5);
        artistas.add(banda6);
        artistas.add(banda8);
        artistas.add(banda9);
        artistas.add(banda10);
        artistas.add(banda11);
        artistas.add(banda12);
        artistas.add(banda13);
        artistas.add(banda14);
        artistas.add(banda15);
        artistas.add(banda16);
        artistas.add(banda17);
        artistas.add(banda18);
        artistas.add(banda19);
        artistas.add(banda20);
        artistas.add(banda21);
        artistas.add(banda24);
        artistas.add(banda25);
        artistas.add(banda26);
        artistas.add(banda27);
        artistas.add(banda28);
        artistas.add(banda29);
        artistas.add(banda30);
        artistas.add(banda31);
        artistas.add(banda32);
        artistas.add(banda33);
        artistas.add(banda34);
        artistas.add(banda35);
        artistas.add(banda36);
        artistas.add(banda37);
        artistas.add(banda38);
        artistas.add(banda39);
        artistas.add(banda40);
        artistas.add(banda41);
        artistas.add(banda42);
        artistas.add(banda45);
        artistas.add(banda46);
        artistas.add(banda47);
        artistas.add(banda48);
        artistas.add(banda49);
        artistas.add(banda50);
        artistas.add(banda51);
        artistas.add(banda52);
        artistas.add(banda53);
        artistas.add(banda54);
        artistas.add(banda55);
        artistas.add(banda57);
        artistas.add(banda58);
        artistas.add(banda59);
        artistas.add(banda60);
        artistas.add(banda61);
        artistas.add(banda62);
        artistas.add(banda63);
        artistas.add(banda64);
        artistas.add(banda65);
        artistas.add(banda66);
        artistas.add(banda67);
        artistas.add(banda68);
        artistas.add(banda69);
        artistas.add(banda70);
        artistas.add(banda71);
        artistas.add(banda72);
        artistas.add(banda73);
        artistas.add(banda74);
        artistas.add(banda75);
        artistas.add(banda76);
        artistas.add(banda77);
        artistas.add(banda79);
        artistas.add(banda80);
        artistas.add(banda81);
        artistas.add(banda82);
        artistas.add(banda83);

        artistaColeccion.insertMany(artistas);

    }

}
