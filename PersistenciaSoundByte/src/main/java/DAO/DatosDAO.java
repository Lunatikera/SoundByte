/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Colecciones.AlbumColeccion;
import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Docs.CancionDoc;
import Docs.IntegranteDoc;
import InterfacesDAO.IConexionDB;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.time.LocalDate;
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

        GeneroColeccion rock = new GeneroColeccion();
        rock.setNombre("Rock");
        rock.setImagenGenero("resources/generos/rock.jpg");
        rock.setDescrpicion("El Rock es un género musical que surgió en la década de 1950 y se caracteriza por el uso predominante de guitarras eléctricas, bajo y batería.");

        GeneroColeccion jazz = new GeneroColeccion();
        jazz.setNombre("Jazz");
        jazz.setImagenGenero("resources/generos/jazz.jpg");
        jazz.setDescrpicion("El Jazz es un género nacido en Nueva Orleans a finales del siglo XIX, basado en la improvisación y con influencias del blues y la música clásica.");

        GeneroColeccion pop = new GeneroColeccion();
        pop.setNombre("Pop");
        pop.setImagenGenero("resources/generos/pop.jpg");
        pop.setDescrpicion("El Pop es un género musical popular que se caracteriza por su enfoque en melodías pegajosas y estructuras simples.");

        GeneroColeccion reggae = new GeneroColeccion();
        reggae.setNombre("Reggae");
        reggae.setImagenGenero("resources/generos/reggae.jpg");
        reggae.setDescrpicion("El Reggae es un género originado en Jamaica en la década de 1960, conocido por sus ritmos sincopados y letras frecuentemente sociales.");

        GeneroColeccion blues = new GeneroColeccion();
        blues.setNombre("Blues");
        blues.setImagenGenero("resources/generos/blues.jpg");
        blues.setDescrpicion("El Blues es un género musical nacido en las comunidades afroamericanas del sur de los Estados Unidos, marcado por su estructura de doce compases y melodías melancólicas.");

        GeneroColeccion country = new GeneroColeccion();
        country.setNombre("Country");
        country.setImagenGenero("resources/generos/country.jpg");
        country.setDescrpicion("El Country es un género originado en el sur de Estados Unidos que mezcla influencias del folk, blues y gospel.");

        GeneroColeccion metal = new GeneroColeccion();
        metal.setNombre("Metal");
        metal.setImagenGenero("resources/generos/metal.jpg");
        metal.setDescrpicion("El Metal es un género derivado del Rock, caracterizado por guitarras distorsionadas, baterías potentes y voces agresivas.");

        GeneroColeccion hiphop = new GeneroColeccion();
        hiphop.setNombre("Hip-Hop");
        hiphop.setImagenGenero("resources/generos/hiphop.jpg");
        hiphop.setDescrpicion("El Hip-Hop es un género nacido en los años 70 en los barrios afroamericanos y latinos de Nueva York, caracterizado por el rap, el breakdance y el graffiti.");

        GeneroColeccion clasica = new GeneroColeccion();
        clasica.setNombre("Clásica");
        clasica.setImagenGenero("resources/generos/clasica.jpg");
        clasica.setDescrpicion("La música Clásica es un género basado en tradiciones de la música occidental, con compositores como Beethoven, Mozart y Bach.");

        GeneroColeccion soul = new GeneroColeccion();
        soul.setNombre("Soul");
        soul.setImagenGenero("resources/generos/soul.jpg");
        soul.setDescrpicion("El Soul es un género que combina elementos del gospel y el rhythm and blues, conocido por sus emotivas interpretaciones vocales.");

        GeneroColeccion punk = new GeneroColeccion();
        punk.setNombre("Punk");
        punk.setImagenGenero("resources/generos/punk.jpg");
        punk.setDescrpicion("El Punk es un género caracterizado por canciones cortas, rápidas y con letras que critican el sistema y promueven el individualismo.");

        GeneroColeccion funk = new GeneroColeccion();
        funk.setNombre("Funk");
        funk.setImagenGenero("resources/generos/funk.jpg");
        funk.setDescrpicion("El Funk es un género que se centra en grooves rítmicos y bailables, mezclando elementos del soul, jazz y R&B.");

        GeneroColeccion musicaLatina = new GeneroColeccion();
        musicaLatina.setNombre("Música Latina");
        musicaLatina.setImagenGenero("resources/generos/musicalatina.jpg");
        musicaLatina.setDescrpicion("La Música Latina abarca una amplia gama de géneros originarios de América Latina, como el reguetón, salsa, bachata, cumbia, merengue, y muchos más, caracterizados por sus ritmos vibrantes y letras apasionadas.");

        GeneroColeccion rnb = new GeneroColeccion();
        rnb.setNombre("R&B");
        rnb.setImagenGenero("resources/generos/rnb.jpg");
        rnb.setDescrpicion("El R&B es un género que combina el soul y el pop con ritmos contemporáneos, destacando por sus melodías y letras románticas.");

        GeneroColeccion trap = new GeneroColeccion();
        trap.setNombre("Trap");
        trap.setImagenGenero("resources/generos/trap.jpg");
        trap.setDescrpicion("El Trap es un subgénero del Hip-Hop que se caracteriza por sus ritmos repetitivos y líricas introspectivas.");

        GeneroColeccion electronica = new GeneroColeccion();
        electronica.setNombre("Electrónica");
        electronica.setImagenGenero("resources/generos/electronica.jpg");
        electronica.setDescrpicion("La Electrónica es un género que utiliza sonidos sintéticos generados con computadoras y sintetizadores.");

        GeneroColeccion prog = new GeneroColeccion();
        prog.setNombre("Rock Progresivo");
        prog.setImagenGenero("resources/generos/rockProgresivo.jpg");
        prog.setDescrpicion("El Rock progresivo es un subgénero del Rock que nació a fines de los 60 en el Reino Unido y era la expresión de músicos influenciados por la cultura del Rock.");

        GeneroColeccion alternativo = new GeneroColeccion();
        alternativo.setNombre("Alternativo");
        alternativo.setImagenGenero("resources/generos/alternativo.jpg");
        alternativo.setDescrpicion("El Alternativo es un género musical que engloba una variedad de estilos, todos caracterizados por su enfoque experimental y diverso.");

        List<GeneroColeccion> generos = new ArrayList<>();
        generos.add(rock);
        generos.add(jazz);
        generos.add(pop);
        generos.add(reggae);
        generos.add(blues);
        generos.add(country);
        generos.add(metal);
        generos.add(hiphop);
        generos.add(clasica);
        generos.add(soul);
        generos.add(punk);
        generos.add(funk);
        generos.add(musicaLatina);
        generos.add(musicaLatina);
        generos.add(rnb);
        generos.add(trap);
        generos.add(electronica);
        generos.add(prog);
        generos.add(alternativo);

        generoColeccion.insertMany(generos);

        HashMap<String, ObjectId> generoMap = new HashMap<>();
        for (GeneroColeccion genero : generos) {
            // Obtener el ObjectId del género después de la inserción
            if (genero.getId() != null) {
                generoMap.put(genero.getNombre(), genero.getId());
            }
        }
        MongoCollection<ArtistaColeccion> artistaColeccion = database.getCollection("artistas", ArtistaColeccion.class);

        // Rock
        ArtistaColeccion artista = new ArtistaColeccion();
        artista.setEsBanda(false);
        artista.setGeneros(Arrays.asList(rock));
        artista.setImagen("/artistas/Elvis.jpg");
        artista.setNombre("Elvis Presley");

        ArtistaColeccion artista1 = new ArtistaColeccion();
        artista1.setEsBanda(false);
        artista1.setGeneros(Arrays.asList(rock));
        artista1.setImagen("/artistas/Hendrix.jpg");
        artista1.setNombre("Jimmy Hendrix");

        ArtistaColeccion artista2 = new ArtistaColeccion();
        artista2.setEsBanda(false);
        artista2.setGeneros(Arrays.asList(rock));
        artista2.setImagen("/artistas/Spinetta.jpg");
        artista2.setNombre("Luis Alberto Spinetta");

        ArtistaColeccion artista3 = new ArtistaColeccion();
        artista3.setEsBanda(false);
        artista3.setGeneros(Arrays.asList(rock));
        artista3.setImagen("/artistas/JohnnyCash.jpg");
        artista3.setNombre("Johnny Cash");

        ArtistaColeccion artista4 = new ArtistaColeccion();
        artista4.setEsBanda(false);
        artista4.setGeneros(Arrays.asList(rock));
        artista4.setImagen("/artistas/Bowie.jpg");
        artista4.setNombre("David Bowie");

        // Jazz
        ArtistaColeccion artista5 = new ArtistaColeccion();
        artista5.setEsBanda(false);
        artista5.setGeneros(Arrays.asList(jazz));
        artista5.setImagen("/artistas/LouisArmstrong.jpg");
        artista5.setNombre("Louis Armstrong");

        ArtistaColeccion artista6 = new ArtistaColeccion();
        artista6.setEsBanda(false);
        artista6.setGeneros(Arrays.asList(jazz));
        artista6.setImagen("/artistas/JohnColtrane.jpg");
        artista6.setNombre("John Coltrane");

        ArtistaColeccion artista7 = new ArtistaColeccion();
        artista7.setEsBanda(false);
        artista7.setGeneros(Arrays.asList(jazz));
        artista7.setImagen("/artistas/BillieHoliday.jpg");
        artista7.setNombre("Billie Holiday");

        ArtistaColeccion artista8 = new ArtistaColeccion();
        artista8.setEsBanda(false);
        artista8.setGeneros(Arrays.asList(jazz));
        artista8.setImagen("/artistas/DizzyGillespie.jpg");
        artista8.setNombre("Dizzy Gillespie");

        ArtistaColeccion artista9 = new ArtistaColeccion();
        artista9.setEsBanda(false);
        artista9.setGeneros(Arrays.asList(jazz));
        artista9.setImagen("/artistas/EllaFitzgerald.jpg");
        artista9.setNombre("Ella Fitzgerald");

        // Pop
        ArtistaColeccion artista10 = new ArtistaColeccion();
        artista10.setEsBanda(false);
        artista10.setGeneros(Arrays.asList(pop));
        artista10.setImagen("/artistas/MichaelJackson.jpg");
        artista10.setNombre("Michael Jackson");

        ArtistaColeccion artista11 = new ArtistaColeccion();
        artista11.setEsBanda(false);
        artista11.setGeneros(Arrays.asList(pop));
        artista11.setImagen("/artistas/Madonna.jpg");
        artista11.setNombre("Madonna");

        ArtistaColeccion artista12 = new ArtistaColeccion();
        artista12.setEsBanda(false);
        artista12.setGeneros(Arrays.asList(pop));
        artista12.setImagen("/artistas/EdSheeran.jpg");
        artista12.setNombre("Ed Sheeran");

        ArtistaColeccion artista13 = new ArtistaColeccion();
        artista13.setEsBanda(false);
        artista13.setGeneros(Arrays.asList(pop));
        artista13.setImagen("/artistas/Beyonce.jpg");
        artista13.setNombre("Beyoncé");

        ArtistaColeccion artista14 = new ArtistaColeccion();
        artista14.setEsBanda(false);
        artista14.setGeneros(Arrays.asList(pop));
        artista14.setImagen("/artistas/Rihanna.jpg");
        artista14.setNombre("Rihanna");

        // Reggae
        ArtistaColeccion artista15 = new ArtistaColeccion();
        artista15.setEsBanda(false);
        artista15.setGeneros(Arrays.asList(reggae));
        artista15.setImagen("/artistas/BobMarley.jpg");
        artista15.setNombre("Bob Marley");

        // Reggae
        ArtistaColeccion artista16 = new ArtistaColeccion();
        artista16.setEsBanda(false);
        artista16.setGeneros(Arrays.asList(reggae));
        artista16.setImagen("/artistas/PeterTosh.jpg");
        artista16.setNombre("Peter Tosh");

        ArtistaColeccion artista17 = new ArtistaColeccion();
        artista17.setEsBanda(false);
        artista17.setGeneros(Arrays.asList(reggae));
        artista17.setImagen("/artistas/JimmyCliff.jpg");
        artista17.setNombre("Jimmy Cliff");

        ArtistaColeccion artista18 = new ArtistaColeccion();
        artista18.setEsBanda(false);
        artista18.setGeneros(Arrays.asList(reggae));
        artista18.setImagen("/artistas/GregoryIsaacs.jpg");
        artista18.setNombre("Gregory Isaacs");

        ArtistaColeccion artista19 = new ArtistaColeccion();
        artista19.setEsBanda(false);
        artista19.setGeneros(Arrays.asList(reggae));
        artista19.setImagen("/artistas/TootsHibbert.jpg");
        artista19.setNombre("Toots Hibbert");

// Blues
        ArtistaColeccion artista20 = new ArtistaColeccion();
        artista20.setEsBanda(false);
        artista20.setGeneros(Arrays.asList(blues));
        artista20.setImagen("/artistas/BBKing.jpg");
        artista20.setNombre("B.B. King");

        ArtistaColeccion artista21 = new ArtistaColeccion();
        artista21.setEsBanda(false);
        artista21.setGeneros(Arrays.asList(blues));
        artista21.setImagen("/artistas/MuddyWaters.jpg");
        artista21.setNombre("Muddy Waters");

        ArtistaColeccion artista22 = new ArtistaColeccion();
        artista22.setEsBanda(false);
        artista22.setGeneros(Arrays.asList(blues));
        artista22.setImagen("/artistas/RobertJohnson.jpg");
        artista22.setNombre("Robert Johnson");

        ArtistaColeccion artista23 = new ArtistaColeccion();
        artista23.setEsBanda(false);
        artista23.setGeneros(Arrays.asList(blues));
        artista23.setImagen("/artistas/JohnLeeHooker.jpg");
        artista23.setNombre("John Lee Hooker");

        ArtistaColeccion artista24 = new ArtistaColeccion();
        artista24.setEsBanda(false);
        artista24.setGeneros(Arrays.asList(blues));
        artista24.setImagen("/artistas/EricClapton.jpg");
        artista24.setNombre("Eric Clapton");

// Country
        ArtistaColeccion artista25 = new ArtistaColeccion();
        artista25.setEsBanda(false);
        artista25.setGeneros(Arrays.asList(country));
        artista25.setImagen("/artistas/HankWilliams.jpg");
        artista25.setNombre("Hank Williams");

        ArtistaColeccion artista26 = new ArtistaColeccion();
        artista26.setEsBanda(false);
        artista26.setGeneros(Arrays.asList(country));
        artista26.setImagen("/artistas/DollyParton.jpg");
        artista26.setNombre("Dolly Parton");

        ArtistaColeccion artista27 = new ArtistaColeccion();
        artista27.setEsBanda(false);
        artista27.setGeneros(Arrays.asList(country));
        artista27.setImagen("/artistas/WillieNelson.jpg");
        artista27.setNombre("Willie Nelson");

        ArtistaColeccion artista28 = new ArtistaColeccion();
        artista28.setEsBanda(false);
        artista28.setGeneros(Arrays.asList(country));
        artista28.setImagen("/artistas/EmmylouHarris.jpg");
        artista28.setNombre("Emmylou Harris");

        ArtistaColeccion artista29 = new ArtistaColeccion();
        artista29.setEsBanda(false);
        artista29.setGeneros(Arrays.asList(country));
        artista29.setImagen("/artistas/LorettaLynn.jpg");
        artista29.setNombre("Loretta Lynn");

// Metal
        ArtistaColeccion artista30 = new ArtistaColeccion();
        artista30.setEsBanda(false);
        artista30.setGeneros(Arrays.asList(metal));
        artista30.setImagen("/artistas/OzzyOsbourne.jpg");
        artista30.setNombre("Ozzy Osbourne");

        ArtistaColeccion artista31 = new ArtistaColeccion();
        artista31.setEsBanda(false);
        artista31.setGeneros(Arrays.asList(metal));
        artista31.setImagen("/artistas/RobHalford.jpg");
        artista31.setNombre("Rob Halford");

        ArtistaColeccion artista32 = new ArtistaColeccion();
        artista32.setEsBanda(false);
        artista32.setGeneros(Arrays.asList(metal));
        artista32.setImagen("/artistas/KingDiamond.jpg");
        artista32.setNombre("King Diamond");

        // Metal
        ArtistaColeccion artista33 = new ArtistaColeccion();
        artista33.setEsBanda(false);
        artista33.setGeneros(Arrays.asList(metal));
        artista33.setImagen("/artistas/Dio.jpg");
        artista33.setNombre("Ronnie James Dio");

        ArtistaColeccion artista34 = new ArtistaColeccion();
        artista34.setEsBanda(false);
        artista34.setGeneros(Arrays.asList(metal));
        artista34.setImagen("/artistas/LemmyKilmister.jpg");
        artista34.setNombre("Lemmy Kilmister");

// Hip-Hop
        ArtistaColeccion artista35 = new ArtistaColeccion();
        artista35.setEsBanda(false);
        artista35.setGeneros(Arrays.asList(hiphop));
        artista35.setImagen("/artistas/MosDef.jpg");
        artista35.setNombre("Mos Def");

        ArtistaColeccion artista36 = new ArtistaColeccion();
        artista36.setEsBanda(false);
        artista36.setGeneros(Arrays.asList(hiphop));
        artista36.setImagen("/artistas/MFDOOM.jpg");
        artista36.setNombre("MF DOOM");

        ArtistaColeccion artista37 = new ArtistaColeccion();
        artista37.setEsBanda(false);
        artista37.setGeneros(Arrays.asList(hiphop));
        artista37.setImagen("/artistas/Nas.jpg");
        artista37.setNombre("Nas");

        ArtistaColeccion artista38 = new ArtistaColeccion();
        artista38.setEsBanda(false);
        artista38.setGeneros(Arrays.asList(hiphop));
        artista38.setImagen("/artistas/JCole.jpg");
        artista38.setNombre("J. Cole");

        ArtistaColeccion artista39 = new ArtistaColeccion();
        artista39.setEsBanda(false);
        artista39.setGeneros(Arrays.asList(hiphop));
        artista39.setImagen("/artistas/LilWayne.jpg");
        artista39.setNombre("Lil Wayne");

// Clásica
        ArtistaColeccion artista40 = new ArtistaColeccion();
        artista40.setEsBanda(false);
        artista40.setGeneros(Arrays.asList(clasica));
        artista40.setImagen("/artistas/LudwigVanBeethoven.jpg");
        artista40.setNombre("Ludwig van Beethoven");

        ArtistaColeccion artista41 = new ArtistaColeccion();
        artista41.setEsBanda(false);
        artista41.setGeneros(Arrays.asList(clasica));
        artista41.setImagen("/artistas/WolfgangAmadeusMozart.jpg");
        artista41.setNombre("Wolfgang Amadeus Mozart");

        ArtistaColeccion artista42 = new ArtistaColeccion();
        artista42.setEsBanda(false);
        artista42.setGeneros(Arrays.asList(clasica));
        artista42.setImagen("/artistas/JohannSebastianBach.jpg");
        artista42.setNombre("Johann Sebastian Bach");

        ArtistaColeccion artista43 = new ArtistaColeccion();
        artista43.setEsBanda(false);
        artista43.setGeneros(Arrays.asList(clasica));
        artista43.setImagen("/artistas/FredericChopin.jpg");
        artista43.setNombre("Frédéric Chopin");

        ArtistaColeccion artista44 = new ArtistaColeccion();
        artista44.setEsBanda(false);
        artista44.setGeneros(Arrays.asList(clasica));
        artista44.setImagen("/artistas/PabloCasals.jpg");
        artista44.setNombre("Pablo Casals");

// Soul
        ArtistaColeccion artista45 = new ArtistaColeccion();
        artista45.setEsBanda(false);
        artista45.setGeneros(Arrays.asList(soul));
        artista45.setImagen("/artistas/ArethaFranklin.jpg");
        artista45.setNombre("Aretha Franklin");

        ArtistaColeccion artista46 = new ArtistaColeccion();
        artista46.setEsBanda(false);
        artista46.setGeneros(Arrays.asList(soul));
        artista46.setImagen("/artistas/MarvinGaye.jpg");
        artista46.setNombre("Marvin Gaye");

        ArtistaColeccion artista47 = new ArtistaColeccion();
        artista47.setEsBanda(false);
        artista47.setGeneros(Arrays.asList(soul));
        artista47.setImagen("/artistas/NinaSimone.jpg");
        artista47.setNombre("Nina Simone");

        ArtistaColeccion artista48 = new ArtistaColeccion();
        artista48.setEsBanda(false);
        artista48.setGeneros(Arrays.asList(soul));
        artista48.setImagen("/artistas/IsaacHayes.jpg");
        artista48.setNombre("Isaac Hayes");

        ArtistaColeccion artista49 = new ArtistaColeccion();
        artista49.setEsBanda(false);
        artista49.setGeneros(Arrays.asList(soul));
        artista49.setImagen("/artistas/StevieWonder.jpg");
        artista49.setNombre("Stevie Wonder");

// Punk
        ArtistaColeccion artista50 = new ArtistaColeccion();
        artista50.setEsBanda(false);
        artista50.setGeneros(Arrays.asList(punk));
        artista50.setImagen("/artistas/IggyPop.jpg");
        artista50.setNombre("Iggy Pop");

        // Punk
        ArtistaColeccion artista51 = new ArtistaColeccion();
        artista51.setEsBanda(false);
        artista51.setGeneros(Arrays.asList(punk));
        artista51.setImagen("/artistas/JoanJett.jpg");
        artista51.setNombre("Joan Jett");

        ArtistaColeccion artista52 = new ArtistaColeccion();
        artista52.setEsBanda(false);
        artista52.setGeneros(Arrays.asList(punk));
        artista52.setImagen("/artistas/SidVicious.jpg");
        artista52.setNombre("Sid Vicious");

        ArtistaColeccion artista53 = new ArtistaColeccion();
        artista53.setEsBanda(false);
        artista53.setGeneros(Arrays.asList(punk));
        artista53.setImagen("/artistas/PattiSmith.jpg");
        artista53.setNombre("Patti Smith");

        ArtistaColeccion artista54 = new ArtistaColeccion();
        artista54.setEsBanda(false);
        artista54.setGeneros(Arrays.asList(punk));
        artista54.setImagen("/artistas/BillyIdol.jpg");
        artista54.setNombre("Billy Idol");

// Funk
        ArtistaColeccion artista55 = new ArtistaColeccion();
        artista55.setEsBanda(false);
        artista55.setGeneros(Arrays.asList(funk));
        artista55.setImagen("/artistas/JamesBrown.jpg");
        artista55.setNombre("James Brown");

        ArtistaColeccion artista56 = new ArtistaColeccion();
        artista56.setEsBanda(false);
        artista56.setGeneros(Arrays.asList(funk));
        artista56.setImagen("/artistas/GeorgeClinton.jpg");
        artista56.setNombre("George Clinton");

        ArtistaColeccion artista57 = new ArtistaColeccion();
        artista57.setEsBanda(false);
        artista57.setGeneros(Arrays.asList(funk));
        artista57.setImagen("/artistas/Jamiroquai.jpg");
        artista57.setNombre("Jamiroquai");

        ArtistaColeccion artista58 = new ArtistaColeccion();
        artista58.setEsBanda(false);
        artista58.setGeneros(Arrays.asList(funk));
        artista58.setImagen("/artistas/Prince.jpg");
        artista58.setNombre("Prince");

        ArtistaColeccion artista59 = new ArtistaColeccion();
        artista59.setEsBanda(false);
        artista59.setGeneros(Arrays.asList(funk));
        artista59.setImagen("/artistas/RickJames.jpg");
        artista59.setNombre("Rick James");

// Música Latina
        ArtistaColeccion artista60 = new ArtistaColeccion();
        artista60.setEsBanda(false);
        artista59.setGeneros(Arrays.asList(musicaLatina));
        artista60.setImagen("/artistas/Shakira.jpg");
        artista60.setNombre("Shakira");

        ArtistaColeccion artista61 = new ArtistaColeccion();
        artista61.setEsBanda(false);
        artista61.setGeneros(Arrays.asList(musicaLatina));
        artista61.setImagen("/artistas/CarlosVives.jpg");
        artista61.setNombre("Carlos Vives");

        ArtistaColeccion artista62 = new ArtistaColeccion();
        artista62.setEsBanda(false);
        artista62.setGeneros(Arrays.asList(musicaLatina));
        artista62.setImagen("/artistas/Juanes.jpg");
        artista62.setNombre("Juanes");

        ArtistaColeccion artista63 = new ArtistaColeccion();
        artista63.setEsBanda(false);
        artista63.setGeneros(Arrays.asList(musicaLatina));
        artista63.setImagen("/artistas/MarcAnthony.jpg");
        artista63.setNombre("Marc Anthony");

        ArtistaColeccion artista64 = new ArtistaColeccion();
        artista64.setEsBanda(false);
        artista64.setGeneros(Arrays.asList(musicaLatina));
        artista64.setImagen("/artistas/GloriaEstefan.jpg");
        artista64.setNombre("Gloria Estefan");

// R&B
        ArtistaColeccion artista65 = new ArtistaColeccion();
        artista65.setEsBanda(false);
        artista65.setGeneros(Arrays.asList(rnb));
        artista65.setImagen("/artistas/Usher.jpg");
        artista65.setNombre("Usher");

        ArtistaColeccion artista66 = new ArtistaColeccion();
        artista66.setEsBanda(false);
        artista66.setGeneros(Arrays.asList(rnb));
        artista66.setImagen("/artistas/AliciaKeys.jpg");
        artista66.setNombre("Alicia Keys");

        ArtistaColeccion artista67 = new ArtistaColeccion();
        artista67.setEsBanda(false);
        artista67.setGeneros(Arrays.asList(rnb));
        artista67.setImagen("/artistas/Beyonce.jpg");
        artista67.setNombre("Beyoncé");

        ArtistaColeccion artista68 = new ArtistaColeccion();
        artista68.setEsBanda(false);
        artista68.setGeneros(Arrays.asList(rnb));
        artista68.setImagen("/artistas/TheWeeknd.jpg");
        artista68.setNombre("The Weeknd");

        ArtistaColeccion artista69 = new ArtistaColeccion();
        artista69.setEsBanda(false);
        artista69.setGeneros(Arrays.asList(rnb));
        artista69.setImagen("/artistas/BrunoMars.jpg");
        artista69.setNombre("Bruno Mars");

// Trap
        ArtistaColeccion artista70 = new ArtistaColeccion();
        artista70.setEsBanda(false);
        artista70.setGeneros(Arrays.asList(trap));
        artista70.setImagen("/artistas/Future.jpg");
        artista70.setNombre("Future");

        // Trap
        ArtistaColeccion artista71 = new ArtistaColeccion();
        artista71.setEsBanda(false);
        artista71.setGeneros(Arrays.asList(trap));
        artista71.setImagen("/artistas/TravisScott.jpg");
        artista71.setNombre("Travis Scott");

        ArtistaColeccion artista72 = new ArtistaColeccion();
        artista72.setEsBanda(false);
        artista72.setGeneros(Arrays.asList(trap));
        artista72.setImagen("/artistas/PostMalone.jpg");
        artista72.setNombre("Post Malone");

        ArtistaColeccion artista73 = new ArtistaColeccion();
        artista73.setEsBanda(false);
        artista73.setGeneros(Arrays.asList(trap));
        artista73.setImagen("/artistas/LilSkies.jpg");
        artista73.setNombre("Lil Skies");

        ArtistaColeccion artista74 = new ArtistaColeccion();
        artista74.setEsBanda(false);
        artista74.setGeneros(Arrays.asList(trap));
        artista74.setImagen("/artistas/Dillom.jpg");
        artista74.setNombre("Dillom");

// Electrónica
        ArtistaColeccion artista75 = new ArtistaColeccion();
        artista75.setEsBanda(false);
        artista75.setGeneros(Arrays.asList(electronica));
        artista75.setImagen("/artistas/CalvinHarris.jpg");
        artista75.setNombre("Calvin Harris");

        ArtistaColeccion artista76 = new ArtistaColeccion();
        artista76.setEsBanda(false);
        artista76.setGeneros(Arrays.asList(electronica));
        artista76.setImagen("/artistas/DavidGuetta.jpg");
        artista76.setNombre("David Guetta");

        ArtistaColeccion artista77 = new ArtistaColeccion();
        artista77.setEsBanda(false);
        artista77.setGeneros(Arrays.asList(electronica));
        artista77.setImagen("/artistas/Deadmau5.jpg");
        artista77.setNombre("Deadmau5");

        ArtistaColeccion artista78 = new ArtistaColeccion();
        artista78.setEsBanda(false);
        artista78.setGeneros(Arrays.asList(electronica));
        artista78.setImagen("/artistas/Avicii.jpg");
        artista78.setNombre("Avicii");

        ArtistaColeccion artista79 = new ArtistaColeccion();
        artista79.setEsBanda(false);
        artista79.setGeneros(Arrays.asList(electronica));
        artista79.setImagen("/artistas/Skrillex.jpg");
        artista79.setNombre("Skrillex");

// Rock Progresivo
        ArtistaColeccion artista80 = new ArtistaColeccion();
        artista80.setEsBanda(false);
        artista80.setGeneros(Arrays.asList(prog));
        artista80.setImagen("/artistas/StevenWilson.jpg");
        artista80.setNombre("Steven Wilson");

        ArtistaColeccion artista81 = new ArtistaColeccion();
        artista81.setEsBanda(false);
        artista81.setGeneros(Arrays.asList(prog));
        artista81.setImagen("/artistas/RickWakeman.jpg");
        artista81.setNombre("Rick Wakeman");

        ArtistaColeccion artista82 = new ArtistaColeccion();
        artista82.setEsBanda(false);
        artista82.setGeneros(Arrays.asList(prog));
        artista82.setImagen("/artistas/PeterGabriel.jpg");
        artista82.setNombre("Peter Gabriel");

        ArtistaColeccion artista83 = new ArtistaColeccion();
        artista83.setEsBanda(false);
        artista83.setGeneros(Arrays.asList(prog));
        artista83.setImagen("/artistas/JonAnderson.jpg");
        artista83.setNombre("Jon Anderson");

        ArtistaColeccion artista84 = new ArtistaColeccion();
        artista84.setEsBanda(false);
        artista84.setGeneros(Arrays.asList(prog));
        artista84.setImagen("/artistas/KeithEmerson.jpg");
        artista84.setNombre("Keith Emerson");

// Alternativo
        ArtistaColeccion artista85 = new ArtistaColeccion();
        artista85.setEsBanda(false);
        artista85.setGeneros(Arrays.asList(alternativo));
        artista85.setImagen("/artistas/Beck.jpg");
        artista85.setNombre("Beck");

        ArtistaColeccion artista86 = new ArtistaColeccion();
        artista86.setEsBanda(false);
        artista86.setGeneros(Arrays.asList(alternativo));
        artista86.setImagen("/artistas/PJHarvey.jpg");
        artista86.setNombre("PJ Harvey");

        ArtistaColeccion artista87 = new ArtistaColeccion();
        artista87.setEsBanda(false);
        artista87.setGeneros(Arrays.asList(alternativo));
        artista87.setImagen("/artistas/ToriAmos.jpg");
        artista87.setNombre("Tori Amos");

        ArtistaColeccion artista88 = new ArtistaColeccion();
        artista88.setEsBanda(false);
        artista88.setGeneros(Arrays.asList(alternativo));
        artista88.setImagen("/artistas/Bjork.jpg");
        artista88.setNombre("Bjork");

        ArtistaColeccion artista89 = new ArtistaColeccion();
        artista89.setEsBanda(false);
        artista89.setGeneros(Arrays.asList(alternativo));
        artista89.setImagen("/artistas/TameImpala.jpg");
        artista89.setNombre("Tame Impala");

        List<ArtistaColeccion> artistas = new ArrayList<>();
        artistas.add(artista);
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

        artistaColeccion.insertMany(artistas);

        IntegranteDoc integrante1 = new IntegranteDoc();
        integrante1.setEsActivo(false);
        integrante1.setFechaIngreso(LocalDate.of(1960, 1, 1));
        integrante1.setFechaEgreso(LocalDate.of(1960, 12, 8));
        integrante1.setInstrumento("Guitarra y voz");
        integrante1.setNombre("John Lennon");

        IntegranteDoc integrante2 = new IntegranteDoc();
        integrante2.setEsActivo(false);
        integrante2.setFechaIngreso(LocalDate.of(1960, 1, 1));
        integrante2.setFechaEgreso(LocalDate.of(1970, 4, 10));
        integrante2.setInstrumento("Bajo");
        integrante2.setNombre("Paul McCartney");

        IntegranteDoc integrante3 = new IntegranteDoc();
        integrante3.setEsActivo(false);
        integrante3.setFechaIngreso(LocalDate.of(1960, 1, 1));
        integrante3.setFechaEgreso(LocalDate.of(1980, 12, 8));
        integrante3.setInstrumento("Batería");
        integrante3.setNombre("Ringo Starr");

        IntegranteDoc integrante4 = new IntegranteDoc();
        integrante4.setEsActivo(false);
        integrante4.setFechaIngreso(LocalDate.of(1960, 1, 1));
        integrante4.setFechaEgreso(LocalDate.of(1970, 4, 10));
        integrante4.setInstrumento("Guitarra");
        integrante4.setNombre("George Harrison");

// BEATLES
        ArtistaColeccion banda1 = new ArtistaColeccion();
        banda1.setEsBanda(true);
        banda1.setGeneros(Arrays.asList(rock, pop));
        banda1.setImagen("/artistas/TheBeatles.jpg");
        banda1.setIntegrante(Arrays.asList(integrante1, integrante2, integrante3, integrante4));
        banda1.setNombre("The Beatles");

        AlbumColeccion album1 = new AlbumColeccion();
        album1.setNombre("Abbey Road");
        album1.setImagen("/albumes/AbbeyRoad.jpg");
        album1.setFechaLanzamiento(LocalDate.of(1969, 9, 26));
        album1.setCanciones(Arrays.asList(
                new CancionDoc("Come Together"),
                new CancionDoc("Something"),
                new CancionDoc("Here Comes the Sun"),
                new CancionDoc("Octopus's Garden"),
                new CancionDoc("I Want You (She's So Heavy)")
        ));
        album1.setArtista(banda1);

        // Álbum de The Beatles
        AlbumColeccion album2 = new AlbumColeccion();
        album2.setNombre("Sgt. Pepper's Lonely Hearts Club Band");
        album2.setImagen("/albumes/SgtPeppers.jpg");
        album2.setFechaLanzamiento(LocalDate.of(1967, 6, 1));
        album2.setCanciones(Arrays.asList(
                new CancionDoc("Sgt. Pepper's Lonely Hearts Club Band"),
                new CancionDoc("With a Little Help from My Friends"),
                new CancionDoc("Lucy in the Sky with Diamonds"),
                new CancionDoc("Fixing a Hole"),
                new CancionDoc("A Day in the Life")
        ));
        album2.setArtista(banda1);

        // Led Zeppelin
        IntegranteDoc integrante5 = new IntegranteDoc();
        integrante5.setEsActivo(false);
        integrante5.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante5.setFechaEgreso(LocalDate.of(1980, 9, 25));
        integrante5.setInstrumento("Voz");
        integrante5.setNombre("Robert Plant");

        IntegranteDoc integrante6 = new IntegranteDoc();
        integrante6.setEsActivo(false);
        integrante6.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante6.setFechaEgreso(LocalDate.of(1980, 9, 25));
        integrante6.setInstrumento("Guitarra");
        integrante6.setNombre("Jimmy Page");

        IntegranteDoc integrante7 = new IntegranteDoc();
        integrante7.setEsActivo(false);
        integrante7.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante7.setFechaEgreso(LocalDate.of(1980, 9, 25));
        integrante7.setInstrumento("Bajo");
        integrante7.setNombre("John Paul Jones");

        IntegranteDoc integrante8 = new IntegranteDoc();
        integrante8.setEsActivo(false);
        integrante8.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante8.setFechaEgreso(LocalDate.of(1980, 9, 25));
        integrante8.setInstrumento("Batería");
        integrante8.setNombre("John Bonham");

// Led Zeppelin Band
        ArtistaColeccion banda2 = new ArtistaColeccion();
        banda2.setEsBanda(true);
        banda2.setGeneros(Arrays.asList(rock, blues));
        banda2.setImagen("/artistas/LedZeppelin.jpg");
        banda2.setIntegrante(Arrays.asList(integrante8, integrante7, integrante6, integrante5));
        banda2.setNombre("Led Zeppelin");

// Queen
        IntegranteDoc integrante10 = new IntegranteDoc();
        integrante10.setEsActivo(false);
        integrante10.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante10.setFechaEgreso(LocalDate.of(1991, 11, 24));
        integrante10.setInstrumento("Voz");
        integrante10.setNombre("Freddie Mercury");

        IntegranteDoc integrante11 = new IntegranteDoc();
        integrante11.setEsActivo(false);
        integrante11.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante11.setFechaEgreso(LocalDate.of(1991, 11, 24));
        integrante11.setInstrumento("Guitarra");
        integrante11.setNombre("Brian May");

        IntegranteDoc integrante12 = new IntegranteDoc();
        integrante12.setEsActivo(false);
        integrante12.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante12.setFechaEgreso(LocalDate.of(1991, 11, 24));
        integrante12.setInstrumento("Bajo");
        integrante12.setNombre("John Deacon");

        IntegranteDoc integrante13 = new IntegranteDoc();
        integrante13.setEsActivo(false);
        integrante13.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante13.setFechaEgreso(LocalDate.of(1991, 11, 24));
        integrante13.setInstrumento("Batería");
        integrante13.setNombre("Roger Taylor");

// Queen Band
        ArtistaColeccion banda3 = new ArtistaColeccion();
        banda3.setEsBanda(true);
        banda3.setGeneros(Arrays.asList(pop, rock));
        banda3.setImagen("/artistas/Queen.jpg");
        banda3.setIntegrante(Arrays.asList(integrante10, integrante11, integrante12, integrante13));
        banda3.setNombre("Queen");

// The Rolling Stones
        IntegranteDoc integrante14 = new IntegranteDoc();
        integrante14.setEsActivo(true);
        integrante14.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante14.setInstrumento("Voz");
        integrante14.setNombre("Mick Jagger");

        IntegranteDoc integrante15 = new IntegranteDoc();
        integrante15.setEsActivo(true);
        integrante15.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante15.setInstrumento("Guitarra");
        integrante15.setNombre("Keith Richards");

        IntegranteDoc integrante16 = new IntegranteDoc();
        integrante16.setEsActivo(true);
        integrante16.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante16.setInstrumento("Bajo");
        integrante16.setNombre("Bill Wyman");

        IntegranteDoc integrante17 = new IntegranteDoc();
        integrante17.setEsActivo(true);
        integrante17.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante17.setInstrumento("Batería");
        integrante17.setNombre("Charlie Watts");

// The Rolling Stones Band
        ArtistaColeccion banda4 = new ArtistaColeccion();
        banda4.setEsBanda(true);
        banda4.setGeneros(Arrays.asList(blues, rock));
        banda4.setImagen("/artistas/RollingStones.jpg");
        banda4.setIntegrante(Arrays.asList(integrante14, integrante15, integrante16, integrante17));
        banda4.setNombre("The Rolling Stones");

// Gorillaz
        IntegranteDoc integrante18 = new IntegranteDoc();
        integrante18.setEsActivo(true);
        integrante18.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante18.setInstrumento("Voz y guitarra");
        integrante18.setNombre("2D (Stuart Pot)");

        IntegranteDoc integrante19 = new IntegranteDoc();
        integrante19.setEsActivo(true);
        integrante19.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante19.setInstrumento("Bajo");
        integrante19.setNombre("Murdoc Niccals");

        IntegranteDoc integrante20 = new IntegranteDoc();
        integrante20.setEsActivo(true);
        integrante20.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante20.setInstrumento("Batería");
        integrante20.setNombre("Russel Hobbs");

        IntegranteDoc integrante21 = new IntegranteDoc();
        integrante21.setEsActivo(true);
        integrante21.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante21.setInstrumento("Teclado");
        integrante21.setNombre("Noodle");

// Gorillaz Band
        ArtistaColeccion banda5 = new ArtistaColeccion();
        banda5.setEsBanda(true);
        banda5.setGeneros(Arrays.asList(rock, hiphop, electronica));
        banda5.setImagen("/artistas/Gorillaz.jpg");
        banda5.setIntegrante(Arrays.asList(integrante18, integrante19, integrante20, integrante21));
        banda5.setNombre("Gorillaz");

        IntegranteDoc integrante22 = new IntegranteDoc();
        integrante22.setEsActivo(false);
        integrante22.setFechaIngreso(LocalDate.of(1973, 1, 1));
        integrante22.setInstrumento("Teclado");
        integrante22.setNombre("Herbie Hancock");

        IntegranteDoc integrante23 = new IntegranteDoc();
        integrante23.setEsActivo(false);
        integrante23.setFechaIngreso(LocalDate.of(1973, 1, 1));
        integrante23.setInstrumento("Bajo eléctrico");
        integrante23.setNombre("Paul Jackson");

        IntegranteDoc integrante24 = new IntegranteDoc();
        integrante24.setEsActivo(false);
        integrante24.setFechaIngreso(LocalDate.of(1973, 1, 1));
        integrante24.setInstrumento("Percusión");
        integrante24.setNombre("Bill Summers");

        IntegranteDoc integrante25 = new IntegranteDoc();
        integrante25.setEsActivo(false);
        integrante25.setFechaIngreso(LocalDate.of(1973, 1, 1));
        integrante25.setInstrumento("Batería");
        integrante25.setNombre("Harvey Mason");

// Banda - Herbie Hancock's Headhunters
        ArtistaColeccion banda6 = new ArtistaColeccion();
        banda6.setEsBanda(true);
        banda6.setGeneros(Arrays.asList(jazz));
        banda6.setImagen("/artistas/HerbieHancockHeadhunters.jpg");
        banda6.setIntegrante(Arrays.asList(integrante22, integrante23, integrante24, integrante25));
        banda6.setNombre("Herbie Hancock's Headhunters");

// Integrantes - Sun Ra Arkestra
        IntegranteDoc integrante30 = new IntegranteDoc();
        integrante30.setEsActivo(false);
        integrante30.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante30.setFechaEgreso(LocalDate.of(1993, 1, 1));
        integrante30.setInstrumento("Piano");
        integrante30.setNombre("Sun Ra");

        IntegranteDoc integrante31 = new IntegranteDoc();
        integrante31.setEsActivo(true);
        integrante31.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante31.setInstrumento("Saxo alto");
        integrante31.setNombre("Marshall Allen");

        IntegranteDoc integrante32 = new IntegranteDoc();
        integrante32.setEsActivo(false);
        integrante32.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante32.setFechaEgreso(LocalDate.of(1970, 12, 31));
        integrante32.setInstrumento("Trompeta");
        integrante32.setNombre("James Jacson");

        IntegranteDoc integrante33 = new IntegranteDoc();
        integrante33.setEsActivo(false);
        integrante33.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante33.setFechaEgreso(LocalDate.of(1980, 12, 31));
        integrante33.setInstrumento("Bajo eléctrico");
        integrante33.setNombre("Richard Williams");

// Banda - Sun Ra Arkestra
        ArtistaColeccion banda8 = new ArtistaColeccion();
        banda8.setEsBanda(true);
        banda8.setGeneros(Arrays.asList(jazz));
        banda8.setImagen("/artistas/SunRaArkestra.jpg");
        banda8.setIntegrante(Arrays.asList(integrante30, integrante31, integrante32, integrante33));
        banda8.setNombre("Sun Ra Arkestra");

// Integrantes - Dizzy Gillespie Big Band
        IntegranteDoc integrante34 = new IntegranteDoc();
        integrante34.setEsActivo(false);
        integrante34.setFechaIngreso(LocalDate.of(1946, 1, 1));
        integrante34.setFechaEgreso(LocalDate.of(1956, 12, 31));
        integrante34.setInstrumento("Trompeta");
        integrante34.setNombre("Dizzy Gillespie");

        IntegranteDoc integrante35 = new IntegranteDoc();
        integrante35.setEsActivo(false);
        integrante35.setFechaIngreso(LocalDate.of(1946, 1, 1));
        integrante35.setFechaEgreso(LocalDate.of(1956, 12, 31));
        integrante35.setInstrumento("Trombón");
        integrante35.setNombre("John Lewis");

        IntegranteDoc integrante36 = new IntegranteDoc();
        integrante36.setEsActivo(true);
        integrante36.setFechaIngreso(LocalDate.of(1946, 1, 1));
        integrante36.setInstrumento("Saxo alto");
        integrante36.setNombre("Milt Jackson");

        IntegranteDoc integrante37 = new IntegranteDoc();
        integrante37.setEsActivo(true);
        integrante37.setFechaIngreso(LocalDate.of(1946, 1, 1));
        integrante37.setInstrumento("Batería");
        integrante37.setNombre("Kenny Clarke");

// Banda - Dizzy Gillespie Big Band
        ArtistaColeccion banda9 = new ArtistaColeccion();
        banda9.setEsBanda(true);
        banda9.setGeneros(Arrays.asList(jazz));
        banda9.setImagen("/artistas/DizzyGillespieBigBand.jpg");
        banda9.setIntegrante(Arrays.asList(integrante34, integrante35, integrante36, integrante37));
        banda9.setNombre("Dizzy Gillespie Big Band");

// Integrantes - Cannonball Adderley Quintet
        IntegranteDoc integrante38 = new IntegranteDoc();
        integrante38.setEsActivo(true);
        integrante38.setFechaIngreso(LocalDate.of(1955, 1, 1));
        integrante38.setInstrumento("Saxo alto");
        integrante38.setNombre("Cannonball Adderley");

        IntegranteDoc integrante39 = new IntegranteDoc();
        integrante39.setEsActivo(false);
        integrante39.setFechaIngreso(LocalDate.of(1955, 1, 1));
        integrante39.setFechaEgreso(LocalDate.of(1970, 12, 31));
        integrante39.setInstrumento("Trompeta");
        integrante39.setNombre("Nat Adderley");

// Banda - Cannonball Adderley Quintet
        ArtistaColeccion banda10 = new ArtistaColeccion();
        banda10.setEsBanda(true);
        banda10.setGeneros(Arrays.asList(jazz));
        banda10.setImagen("/artistas/CannonballAdderleyQuintet.jpg");
        banda10.setIntegrante(Arrays.asList(integrante38, integrante39));
        banda10.setNombre("Cannonball Adderley Quintet");

// Integrantes - Maroon 5
        IntegranteDoc integrante40 = new IntegranteDoc();
        integrante40.setEsActivo(true);
        integrante40.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante40.setInstrumento("Voz");
        integrante40.setNombre("Adam Levine");

        IntegranteDoc integrante41 = new IntegranteDoc();
        integrante41.setEsActivo(true);
        integrante41.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante41.setInstrumento("Guitarra");
        integrante41.setNombre("James Valentine");

        IntegranteDoc integrante42 = new IntegranteDoc();
        integrante42.setEsActivo(true);
        integrante42.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante42.setInstrumento("Bajo");
        integrante42.setNombre("Mickey Madden");

        IntegranteDoc integrante43 = new IntegranteDoc();
        integrante43.setEsActivo(true);
        integrante43.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante43.setInstrumento("Batería");
        integrante43.setNombre("Matt Flynn");

// Banda - Maroon 5
        ArtistaColeccion banda11 = new ArtistaColeccion();
        banda11.setEsBanda(true);
        banda11.setGeneros(Arrays.asList(pop, rock));
        banda11.setImagen("/artistas/Maroon5.jpg");
        banda11.setIntegrante(Arrays.asList(integrante40, integrante41, integrante42, integrante43));
        banda11.setNombre("Maroon 5");

// Integrantes - One Direction
        IntegranteDoc integrante44 = new IntegranteDoc();
        integrante44.setEsActivo(false);
        integrante44.setFechaIngreso(LocalDate.of(2010, 1, 1));
        integrante44.setFechaEgreso(LocalDate.of(2016, 1, 1));
        integrante44.setInstrumento("Voz");
        integrante44.setNombre("Harry Styles");

        IntegranteDoc integrante45 = new IntegranteDoc();
        integrante45.setEsActivo(false);
        integrante45.setFechaIngreso(LocalDate.of(2010, 1, 1));
        integrante45.setFechaEgreso(LocalDate.of(2016, 1, 1));
        integrante45.setInstrumento("Voz");
        integrante45.setNombre("Liam Payne");

        IntegranteDoc integrante46 = new IntegranteDoc();
        integrante46.setEsActivo(false);
        integrante46.setFechaIngreso(LocalDate.of(2010, 1, 1));
        integrante46.setFechaEgreso(LocalDate.of(2016, 1, 1));
        integrante46.setInstrumento("Voz");
        integrante46.setNombre("Louis Tomlinson");

        IntegranteDoc integrante47 = new IntegranteDoc();
        integrante47.setEsActivo(false);
        integrante47.setFechaIngreso(LocalDate.of(2010, 1, 1));
        integrante47.setFechaEgreso(LocalDate.of(2016, 1, 1));
        integrante47.setInstrumento("Voz");
        integrante47.setNombre("Niall Horan");

        IntegranteDoc integrante48 = new IntegranteDoc();
        integrante48.setEsActivo(false);
        integrante48.setFechaIngreso(LocalDate.of(2010, 1, 1));
        integrante48.setFechaEgreso(LocalDate.of(2016, 1, 1));
        integrante48.setInstrumento("Voz");
        integrante48.setNombre("Zayn Malik");

// Banda - One Direction
        ArtistaColeccion banda12 = new ArtistaColeccion();
        banda12.setEsBanda(true);
        banda12.setGeneros(Arrays.asList(pop));
        banda12.setImagen("/artistas/OneDirection.jpg");
        banda12.setIntegrante(Arrays.asList(integrante44, integrante45, integrante46, integrante47, integrante48));
        banda12.setNombre("One Direction");

        // Backstreet Boys
        IntegranteDoc integrante49 = new IntegranteDoc();
        integrante49.setEsActivo(true);
        integrante49.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante49.setInstrumento("Voz");
        integrante49.setNombre("AJ McLean");

        IntegranteDoc integrante50 = new IntegranteDoc();
        integrante50.setEsActivo(true);
        integrante50.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante50.setInstrumento("Voz");
        integrante50.setNombre("Howie Dorough");

        IntegranteDoc integrante51 = new IntegranteDoc();
        integrante51.setEsActivo(true);
        integrante51.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante51.setInstrumento("Voz");
        integrante51.setNombre("Nick Carter");

        IntegranteDoc integrante52 = new IntegranteDoc();
        integrante52.setEsActivo(true);
        integrante52.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante52.setInstrumento("Voz");
        integrante52.setNombre("Brian Littrell");

        IntegranteDoc integrante53 = new IntegranteDoc();
        integrante53.setEsActivo(true);
        integrante53.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante53.setInstrumento("Voz");
        integrante53.setNombre("Kevin Richardson");

        ArtistaColeccion banda13 = new ArtistaColeccion();
        banda13.setEsBanda(true);
        banda13.setGeneros(Arrays.asList(pop, rnb));
        banda13.setImagen("/artistas/BackstreetBoys.jpg");
        banda13.setIntegrante(Arrays.asList(integrante49, integrante50, integrante51, integrante52, integrante53));
        banda13.setNombre("Backstreet Boys");

// OneRepublic
        IntegranteDoc integrante54 = new IntegranteDoc();
        integrante54.setEsActivo(true);
        integrante54.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante54.setInstrumento("Voz");
        integrante54.setNombre("Ryan Tedder");

        IntegranteDoc integrante55 = new IntegranteDoc();
        integrante55.setEsActivo(true);
        integrante55.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante55.setInstrumento("Bajo");
        integrante55.setNombre("Zach Filkins");

        IntegranteDoc integrante56 = new IntegranteDoc();
        integrante56.setEsActivo(true);
        integrante56.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante56.setInstrumento("Guitarra");
        integrante56.setNombre("Drew Brown");

        IntegranteDoc integrante57 = new IntegranteDoc();
        integrante57.setEsActivo(true);
        integrante57.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante57.setInstrumento("Batería");
        integrante57.setNombre("Eddie Fisher");

        ArtistaColeccion banda14 = new ArtistaColeccion();
        banda14.setEsBanda(true);
        banda14.setGeneros(Arrays.asList(pop));
        banda14.setImagen("/artistas/OneRepublic.jpg");
        banda14.setIntegrante(Arrays.asList(integrante54, integrante55, integrante56, integrante57));
        banda14.setNombre("OneRepublic");

// Coldplay
        IntegranteDoc integrante58 = new IntegranteDoc();
        integrante58.setEsActivo(true);
        integrante58.setFechaIngreso(LocalDate.of(1996, 1, 1));
        integrante58.setInstrumento("Voz");
        integrante58.setNombre("Chris Martin");

        IntegranteDoc integrante59 = new IntegranteDoc();
        integrante59.setEsActivo(true);
        integrante59.setFechaIngreso(LocalDate.of(1996, 1, 1));
        integrante59.setInstrumento("Guitarra");
        integrante59.setNombre("Jonny Buckland");

        IntegranteDoc integrante60 = new IntegranteDoc();
        integrante60.setEsActivo(true);
        integrante60.setFechaIngreso(LocalDate.of(1996, 1, 1));
        integrante60.setInstrumento("Bajo");
        integrante60.setNombre("Guy Berryman");

        IntegranteDoc integrante61 = new IntegranteDoc();
        integrante61.setEsActivo(true);
        integrante61.setFechaIngreso(LocalDate.of(1996, 1, 1));
        integrante61.setInstrumento("Batería");
        integrante61.setNombre("Will Champion");

        ArtistaColeccion banda15 = new ArtistaColeccion();
        banda15.setEsBanda(true);
        banda15.setGeneros(Arrays.asList(pop, rock));
        banda15.setImagen("/artistas/Coldplay.jpg");
        banda15.setIntegrante(Arrays.asList(integrante58, integrante59, integrante60, integrante61));
        banda15.setNombre("Coldplay");

// Bob Marley & The Wailers
        IntegranteDoc integrante62 = new IntegranteDoc();
        integrante62.setEsActivo(false); // Retirado (fallecido)
        integrante62.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante62.setFechaEgreso(LocalDate.of(1981, 5, 11));
        integrante62.setInstrumento("Voz");
        integrante62.setNombre("Bob Marley");

        IntegranteDoc integrante63 = new IntegranteDoc();
        integrante63.setEsActivo(false); // Retirado (fallecido)
        integrante63.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante63.setFechaEgreso(LocalDate.of(1981, 5, 11));
        integrante63.setInstrumento("Guitarra");
        integrante63.setNombre("Peter Tosh");

        IntegranteDoc integrante64 = new IntegranteDoc();
        integrante64.setEsActivo(false); // Retirado (fallecido)
        integrante64.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante64.setFechaEgreso(LocalDate.of(1981, 5, 11));
        integrante64.setInstrumento("Bajo");
        integrante64.setNombre("Bunny Wailer");

        IntegranteDoc integrante65 = new IntegranteDoc();
        integrante65.setEsActivo(true); // Activo
        integrante65.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante65.setInstrumento("Teclado");
        integrante65.setNombre("Al Anderson");

        ArtistaColeccion banda16 = new ArtistaColeccion();
        banda16.setEsBanda(true);
        banda16.setGeneros(Arrays.asList(reggae));
        banda16.setImagen("/artistas/BobMarleyTheWailers.jpg");
        banda16.setIntegrante(Arrays.asList(integrante62, integrante63, integrante64, integrante65));
        banda16.setNombre("Bob Marley & The Wailers");

// Toots and the Maytals
        IntegranteDoc integrante66 = new IntegranteDoc();
        integrante66.setEsActivo(true); // Activo
        integrante66.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante66.setInstrumento("Voz");
        integrante66.setNombre("Toots Hibbert");

        IntegranteDoc integrante67 = new IntegranteDoc();
        integrante67.setEsActivo(true); // Activo
        integrante67.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante67.setInstrumento("Bajo");
        integrante67.setNombre("Simeon Hendricks");

        IntegranteDoc integrante68 = new IntegranteDoc();
        integrante68.setEsActivo(true); // Activo
        integrante68.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante68.setInstrumento("Guitarra");
        integrante68.setNombre("Raleigh Grant");

        IntegranteDoc integrante69 = new IntegranteDoc();
        integrante69.setEsActivo(true); // Activo
        integrante69.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante69.setInstrumento("Batería");
        integrante69.setNombre("John Lee");

        IntegranteDoc integrante70 = new IntegranteDoc();
        integrante70.setEsActivo(false); // Retirado (fallecido)
        integrante70.setFechaIngreso(LocalDate.of(1962, 1, 1));
        integrante70.setFechaEgreso(LocalDate.of(2006, 5, 11));
        integrante70.setInstrumento("Guitarra");
        integrante70.setNombre("Arnold Reuben");

        ArtistaColeccion banda17 = new ArtistaColeccion();
        banda17.setEsBanda(true);
        banda17.setGeneros(Arrays.asList(reggae));
        banda17.setImagen("/artistas/TootsAndTheMaytals.jpg");
        banda17.setIntegrante(Arrays.asList(integrante66, integrante67, integrante68, integrante69, integrante70));
        banda17.setNombre("Toots and the Maytals");

        IntegranteDoc integrante71 = new IntegranteDoc();
        integrante71.setEsActivo(true);
        integrante71.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante71.setInstrumento("Voz");
        integrante71.setNombre("Mykal Rose");

        IntegranteDoc integrante72 = new IntegranteDoc();
        integrante72.setEsActivo(true);
        integrante72.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante72.setInstrumento("Bajo");
        integrante72.setNombre("Gary Pine");

        IntegranteDoc integrante73 = new IntegranteDoc();
        integrante73.setEsActivo(true);
        integrante73.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante73.setInstrumento("Guitarra");
        integrante73.setNombre("Derrick Simpson");

        IntegranteDoc integrante74 = new IntegranteDoc();
        integrante74.setEsActivo(true);
        integrante74.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante74.setInstrumento("Batería");
        integrante74.setNombre("Earl Smith");

        // Banda Black Uhuru
        ArtistaColeccion banda18 = new ArtistaColeccion();
        banda18.setEsBanda(true);
        banda18.setGeneros(Arrays.asList(reggae));
        banda18.setImagen("/artistas/BlackUhuru.jpg");
        banda18.setIntegrante(Arrays.asList(integrante71, integrante72, integrante73, integrante74));
        banda18.setNombre("Black Uhuru");

        // Conversión para Steel Pulse
        IntegranteDoc integrante75 = new IntegranteDoc();
        integrante75.setEsActivo(true);
        integrante75.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante75.setInstrumento("Voz");
        integrante75.setNombre("David Hinds");

        IntegranteDoc integrante76 = new IntegranteDoc();
        integrante76.setEsActivo(true);
        integrante76.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante76.setInstrumento("Bajo");
        integrante76.setNombre("Algernon Fitzroy");

        IntegranteDoc integrante77 = new IntegranteDoc();
        integrante77.setEsActivo(true);
        integrante77.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante77.setInstrumento("Guitarra");
        integrante77.setNombre("Sidney Mills");

        IntegranteDoc integrante78 = new IntegranteDoc();
        integrante78.setEsActivo(true);
        integrante78.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante78.setInstrumento("Batería");
        integrante78.setNombre("Garry Mullings");

        // Banda Steel Pulse
        ArtistaColeccion banda19 = new ArtistaColeccion();
        banda19.setEsBanda(true);
        banda19.setGeneros(Arrays.asList(reggae));
        banda19.setImagen("/artistas/SteelPulse.jpg");
        banda19.setIntegrante(Arrays.asList(integrante75, integrante76, integrante77, integrante78));
        banda19.setNombre("Steel Pulse");

        // Conversión para Inner Circle
        IntegranteDoc integrante79 = new IntegranteDoc();
        integrante79.setEsActivo(true);
        integrante79.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante79.setInstrumento("Voz");
        integrante79.setNombre("Jacob Miller");

        IntegranteDoc integrante80 = new IntegranteDoc();
        integrante80.setEsActivo(true);
        integrante80.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante80.setInstrumento("Guitarra");
        integrante80.setNombre("Doug Wendt");

        IntegranteDoc integrante81 = new IntegranteDoc();
        integrante81.setEsActivo(true);
        integrante81.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante81.setInstrumento("Bajo");
        integrante81.setNombre("Kirk Davis");

        IntegranteDoc integrante82 = new IntegranteDoc();
        integrante82.setEsActivo(true);
        integrante82.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante82.setInstrumento("Batería");
        integrante82.setNombre("Lloyd Wilks");

        IntegranteDoc integrante83 = new IntegranteDoc();
        integrante83.setEsActivo(false);
        integrante83.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante83.setFechaEgreso(LocalDate.of(1980, 3, 23));
        integrante83.setInstrumento("Teclado");
        integrante83.setNombre("Stewart Fagan");

        // Banda Inner Circle
        ArtistaColeccion banda20 = new ArtistaColeccion();
        banda20.setEsBanda(true);
        banda20.setGeneros(Arrays.asList(reggae));
        banda20.setImagen("/artistas/InnerCircle.jpg");
        banda20.setIntegrante(Arrays.asList(integrante79, integrante80, integrante81, integrante82, integrante83));
        banda20.setNombre("Inner Circle");

        // Conversión para B.B. King and the Blues Boys
        IntegranteDoc integrante84 = new IntegranteDoc();
        integrante84.setEsActivo(false);
        integrante84.setFechaIngreso(LocalDate.of(1949, 1, 1));
        integrante84.setFechaEgreso(LocalDate.of(2015, 5, 14));
        integrante84.setInstrumento("Guitarra");
        integrante84.setNombre("B.B. King");

        IntegranteDoc integrante85 = new IntegranteDoc();
        integrante85.setEsActivo(true);
        integrante85.setFechaIngreso(LocalDate.of(1980, 1, 1));
        integrante85.setInstrumento("Bajo");
        integrante85.setNombre("David Brown");

        IntegranteDoc integrante86 = new IntegranteDoc();
        integrante86.setEsActivo(true);
        integrante86.setFechaIngreso(LocalDate.of(1980, 1, 1));
        integrante86.setInstrumento("Batería");
        integrante86.setNombre("Tony Coleman");

        IntegranteDoc integrante87 = new IntegranteDoc();
        integrante87.setEsActivo(true);
        integrante87.setFechaIngreso(LocalDate.of(1980, 1, 1));
        integrante87.setInstrumento("Teclado");
        integrante87.setNombre("James T. Smith");

        // Banda B.B. King and the Blues Boys
        ArtistaColeccion banda21 = new ArtistaColeccion();
        banda21.setEsBanda(true);
        banda21.setGeneros(Arrays.asList(blues));
        banda21.setImagen("/artistas/BBKingBluesBoys.jpg");
        banda21.setIntegrante(Arrays.asList(integrante84, integrante85, integrante86, integrante87));
        banda21.setNombre("B.B. King and the Blues Boys");

        // Conversión para John Lee Hooker and the Coast to Coast Blues Band
        IntegranteDoc integrante95 = new IntegranteDoc();
        integrante95.setEsActivo(false);
        integrante95.setFechaIngreso(LocalDate.of(1948, 1, 1));
        integrante95.setFechaEgreso(LocalDate.of(2001, 6, 21));
        integrante95.setInstrumento("Guitarra");
        integrante95.setNombre("John Lee Hooker");

        IntegranteDoc integrante96 = new IntegranteDoc();
        integrante96.setEsActivo(true);
        integrante96.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante96.setInstrumento("Bajo");
        integrante96.setNombre("Jimmy Reed");

        IntegranteDoc integrante97 = new IntegranteDoc();
        integrante97.setEsActivo(true);
        integrante97.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante97.setInstrumento("Batería");
        integrante97.setNombre("Sammy Price");

        IntegranteDoc integrante98 = new IntegranteDoc();
        integrante98.setEsActivo(true);
        integrante98.setFechaIngreso(LocalDate.of(1950, 1, 1));
        integrante98.setInstrumento("Teclado");
        integrante98.setNombre("Louis Myers");

        // Banda John Lee Hooker and the Coast to Coast Blues Band
        ArtistaColeccion banda24 = new ArtistaColeccion();
        banda24.setEsBanda(true);
        banda24.setGeneros(Arrays.asList(blues));
        banda24.setImagen("/artistas/JohnLeeHookerCoastToCoast.jpg");
        banda24.setIntegrante(Arrays.asList(integrante95, integrante96, integrante97, integrante98));
        banda24.setNombre("John Lee Hooker and the Coast to Coast Blues Band");

        IntegranteDoc integrante99 = new IntegranteDoc();
        integrante99.setEsActivo(false);
        integrante99.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante99.setFechaEgreso(LocalDate.of(1965, 3, 1));
        integrante99.setInstrumento("Guitarra");
        integrante99.setNombre("Eric Clapton");

        IntegranteDoc integrante100 = new IntegranteDoc();
        integrante100.setEsActivo(true);
        integrante100.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante100.setInstrumento("Bajo");
        integrante100.setNombre("Paul Samwell-Smith");

        IntegranteDoc integrante101 = new IntegranteDoc();
        integrante101.setEsActivo(true);
        integrante101.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante101.setInstrumento("Batería");
        integrante101.setNombre("Jim McCarty");

        IntegranteDoc integrante102 = new IntegranteDoc();
        integrante102.setEsActivo(true);
        integrante102.setFechaIngreso(LocalDate.of(1963, 1, 1));
        integrante102.setInstrumento("Armónica");
        integrante102.setNombre("Keith Relf");

        ArtistaColeccion banda25 = new ArtistaColeccion();
        banda25.setEsBanda(true);
        banda25.setGeneros(Arrays.asList(blues));
        banda25.setImagen("/artistas/Yardbirds.jpg");
        banda25.setIntegrante(Arrays.asList(integrante99, integrante100, integrante101, integrante102));
        banda25.setNombre("Eric Clapton and The Yardbirds");

        // Banda: The Highwaymen
        IntegranteDoc integrante103 = new IntegranteDoc();
        integrante103.setEsActivo(false);
        integrante103.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante103.setFechaEgreso(LocalDate.of(1995, 1, 1));
        integrante103.setInstrumento("Voz");
        integrante103.setNombre("Johnny Cash");

        IntegranteDoc integrante104 = new IntegranteDoc();
        integrante104.setEsActivo(false);
        integrante104.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante104.setFechaEgreso(LocalDate.of(2013, 9, 6));
        integrante104.setInstrumento("Voz, Guitarra");
        integrante104.setNombre("Waylon Jennings");

        IntegranteDoc integrante105 = new IntegranteDoc();
        integrante105.setEsActivo(false);
        integrante105.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante105.setFechaEgreso(LocalDate.of(1995, 1, 1));
        integrante105.setInstrumento("Voz");
        integrante105.setNombre("Willie Nelson");

        IntegranteDoc integrante106 = new IntegranteDoc();
        integrante106.setEsActivo(false);
        integrante106.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante106.setFechaEgreso(LocalDate.of(1995, 1, 1));
        integrante106.setInstrumento("Voz, Bajo");
        integrante106.setNombre("Kris Kristofferson");

        ArtistaColeccion banda26 = new ArtistaColeccion();
        banda26.setEsBanda(true);
        banda26.setGeneros(Arrays.asList(country));
        banda26.setImagen("/artistas/Highwaymen.jpg");
        banda26.setIntegrante(Arrays.asList(integrante103, integrante104, integrante105, integrante106));
        banda26.setNombre("The Highwaymen");

        // Banda: The Dixie Chicks
        IntegranteDoc integrante107 = new IntegranteDoc();
        integrante107.setEsActivo(true);
        integrante107.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante107.setInstrumento("Voz, Violín");
        integrante107.setNombre("Natalie Maines");

        IntegranteDoc integrante108 = new IntegranteDoc();
        integrante108.setEsActivo(true);
        integrante108.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante108.setInstrumento("Voz, Guitarra");
        integrante108.setNombre("Emily Strayer");

        IntegranteDoc integrante109 = new IntegranteDoc();
        integrante109.setEsActivo(true);
        integrante109.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante109.setInstrumento("Voz, Banjo");
        integrante109.setNombre("Martie Maguire");

        ArtistaColeccion banda27 = new ArtistaColeccion();
        banda27.setEsBanda(true);
        banda27.setGeneros(Arrays.asList(country));
        banda27.setImagen("/artistas/DixieChicks.jpg");
        banda27.setIntegrante(Arrays.asList(integrante107, integrante108, integrante109));
        banda27.setNombre("The Dixie Chicks");

        // Banda: Alabama
        IntegranteDoc integrante110 = new IntegranteDoc();
        integrante110.setEsActivo(true);
        integrante110.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante110.setInstrumento("Voz, Guitarra");
        integrante110.setNombre("Randy Owen");

        IntegranteDoc integrante111 = new IntegranteDoc();
        integrante111.setEsActivo(true);
        integrante111.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante111.setInstrumento("Bajo");
        integrante111.setNombre("Teddy Gentry");

        IntegranteDoc integrante112 = new IntegranteDoc();
        integrante112.setEsActivo(true);
        integrante112.setFechaIngreso(LocalDate.of(1972, 1, 1));
        integrante112.setInstrumento("Batería");
        integrante112.setNombre("Jeff Cook");

        ArtistaColeccion banda28 = new ArtistaColeccion();
        banda28.setEsBanda(true);
        banda28.setGeneros(Arrays.asList(country));
        banda28.setImagen("/artistas/Alabama.jpg");
        banda28.setIntegrante(Arrays.asList(integrante110, integrante111, integrante112));
        banda28.setNombre("Alabama");

        // Banda: Brooks & Dunn
        IntegranteDoc integrante113 = new IntegranteDoc();
        integrante113.setEsActivo(true);
        integrante113.setFechaIngreso(LocalDate.of(1990, 1, 1));
        integrante113.setInstrumento("Voz, Guitarra");
        integrante113.setNombre("Kix Brooks");

        IntegranteDoc integrante114 = new IntegranteDoc();
        integrante114.setEsActivo(true);
        integrante114.setFechaIngreso(LocalDate.of(1990, 1, 1));
        integrante114.setInstrumento("Voz, Guitarra");
        integrante114.setNombre("Ronnie Dunn");

        ArtistaColeccion banda29 = new ArtistaColeccion();
        banda29.setEsBanda(true);
        banda29.setGeneros(Arrays.asList(country));
        banda29.setImagen("/artistas/BrooksAndDunn.jpg");
        banda29.setIntegrante(Arrays.asList(integrante113, integrante114));
        banda29.setNombre("Brooks & Dunn");

        // Banda: Zac Brown Band
        IntegranteDoc integrante115 = new IntegranteDoc();
        integrante115.setEsActivo(true);
        integrante115.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante115.setInstrumento("Voz, Guitarra");
        integrante115.setNombre("Zac Brown");

        IntegranteDoc integrante116 = new IntegranteDoc();
        integrante116.setEsActivo(true);
        integrante116.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante116.setInstrumento("Bajo");
        integrante116.setNombre("John Driskell Hopkins");

        IntegranteDoc integrante117 = new IntegranteDoc();
        integrante117.setEsActivo(true);
        integrante117.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante117.setInstrumento("Guitarra");
        integrante117.setNombre("Jimmy De Martini");

        IntegranteDoc integrante118 = new IntegranteDoc();
        integrante118.setEsActivo(true);
        integrante118.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante118.setInstrumento("Teclado, Mandolina");
        integrante118.setNombre("Clay Cook");

        IntegranteDoc integrante119 = new IntegranteDoc();
        integrante119.setEsActivo(true);
        integrante119.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante119.setInstrumento("Batería");
        integrante119.setNombre("Chris Fryar");

        ArtistaColeccion banda30 = new ArtistaColeccion();
        banda30.setEsBanda(true);
        banda30.setGeneros(Arrays.asList(country));
        banda30.setImagen("/artistas/ZacBrownBand.jpg");
        banda30.setIntegrante(Arrays.asList(integrante115, integrante116, integrante117, integrante118, integrante119));
        banda30.setNombre("Zac Brown Band");

        // Banda: Metallica
        IntegranteDoc integrante120 = new IntegranteDoc();
        integrante120.setEsActivo(true);
        integrante120.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante120.setInstrumento("Guitarra líder");
        integrante120.setNombre("James Hetfield");

        IntegranteDoc integrante121 = new IntegranteDoc();
        integrante121.setEsActivo(true);
        integrante121.setFechaIngreso(LocalDate.of(1983, 1, 1));
        integrante121.setInstrumento("Batería");
        integrante121.setNombre("Lars Ulrich");

        IntegranteDoc integrante122 = new IntegranteDoc();
        integrante122.setEsActivo(true);
        integrante122.setFechaIngreso(LocalDate.of(1983, 1, 1));
        integrante122.setInstrumento("Guitarra rítmica");
        integrante122.setNombre("Kirk Hammett");

        IntegranteDoc integrante123 = new IntegranteDoc();
        integrante123.setEsActivo(true);
        integrante123.setFechaIngreso(LocalDate.of(2003, 1, 1));
        integrante123.setInstrumento("Bajo");
        integrante123.setNombre("Robert Trujillo");

        ArtistaColeccion banda31 = new ArtistaColeccion();
        banda31.setEsBanda(true);
        banda31.setGeneros(Arrays.asList(metal));
        banda31.setImagen("/artistas/Metallica.jpg");
        banda31.setIntegrante(Arrays.asList(integrante120, integrante121, integrante122, integrante123));
        banda31.setNombre("Metallica");

// Banda: Iron Maiden
        IntegranteDoc integrante124 = new IntegranteDoc();
        integrante124.setEsActivo(true);
        integrante124.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante124.setInstrumento("Voz");
        integrante124.setNombre("Bruce Dickinson");

        IntegranteDoc integrante125 = new IntegranteDoc();
        integrante125.setEsActivo(true);
        integrante125.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante125.setInstrumento("Bajo");
        integrante125.setNombre("Steve Harris");

        IntegranteDoc integrante126 = new IntegranteDoc();
        integrante126.setEsActivo(true);
        integrante126.setFechaIngreso(LocalDate.of(1980, 1, 1));
        integrante126.setInstrumento("Guitarra líder");
        integrante126.setNombre("Dave Murray");

        IntegranteDoc integrante127 = new IntegranteDoc();
        integrante127.setEsActivo(true);
        integrante127.setFechaIngreso(LocalDate.of(1999, 1, 1));
        integrante127.setInstrumento("Guitarra rítmica");
        integrante127.setNombre("Janick Gers");

        IntegranteDoc integrante128 = new IntegranteDoc();
        integrante128.setEsActivo(true);
        integrante128.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante128.setInstrumento("Batería");
        integrante128.setNombre("Nicko McBrain");

        ArtistaColeccion banda32 = new ArtistaColeccion();
        banda32.setEsBanda(true);
        banda32.setGeneros(Arrays.asList(metal));
        banda32.setImagen("/artistas/IronMaiden.jpg");
        banda32.setIntegrante(Arrays.asList(integrante124, integrante125, integrante126, integrante127, integrante128));
        banda32.setNombre("Iron Maiden");

// Banda: Judas Priest
        IntegranteDoc integrante129 = new IntegranteDoc();
        integrante129.setEsActivo(true);
        integrante129.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante129.setInstrumento("Voz");
        integrante129.setNombre("Rob Halford");

        IntegranteDoc integrante130 = new IntegranteDoc();
        integrante130.setEsActivo(true);
        integrante130.setFechaIngreso(LocalDate.of(1974, 1, 1));
        integrante130.setInstrumento("Guitarra líder");
        integrante130.setNombre("Glenn Tipton");

        IntegranteDoc integrante131 = new IntegranteDoc();
        integrante131.setEsActivo(true);
        integrante131.setFechaIngreso(LocalDate.of(1978, 1, 1));
        integrante131.setInstrumento("Bajo");
        integrante131.setNombre("Ian Hill");

        IntegranteDoc integrante132 = new IntegranteDoc();
        integrante132.setEsActivo(true);
        integrante132.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante132.setInstrumento("Guitarra rítmica");
        integrante132.setNombre("Richie Faulkner");

        IntegranteDoc integrante133 = new IntegranteDoc();
        integrante133.setEsActivo(true);
        integrante133.setFechaIngreso(LocalDate.of(2011, 1, 1));
        integrante133.setInstrumento("Batería");
        integrante133.setNombre("Scott Travis");

        ArtistaColeccion banda33 = new ArtistaColeccion();
        banda33.setEsBanda(true);
        banda33.setGeneros(Arrays.asList(metal));
        banda33.setImagen("/artistas/JudasPriest.jpg");
        banda33.setIntegrante(Arrays.asList(integrante129, integrante130, integrante131, integrante132, integrante133));
        banda33.setNombre("Judas Priest");

// Banda: Black Sabbath
        IntegranteDoc integrante134 = new IntegranteDoc();
        integrante134.setEsActivo(false);
        integrante134.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante134.setInstrumento("Voz");
        integrante134.setNombre("Ozzy Osbourne");

        IntegranteDoc integrante135 = new IntegranteDoc();
        integrante135.setEsActivo(false);
        integrante135.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante135.setInstrumento("Guitarra");
        integrante135.setNombre("Tony Iommi");

        IntegranteDoc integrante136 = new IntegranteDoc();
        integrante136.setEsActivo(false);
        integrante136.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante136.setInstrumento("Bajo");
        integrante136.setNombre("Geezer Butler");

        IntegranteDoc integrante137 = new IntegranteDoc();
        integrante137.setEsActivo(false);
        integrante137.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante137.setInstrumento("Batería");
        integrante137.setNombre("Bill Ward");

        ArtistaColeccion banda34 = new ArtistaColeccion();
        banda34.setEsBanda(true);
        banda34.setGeneros(Arrays.asList(metal));
        banda34.setImagen("/artistas/BlackSabbath.jpg");
        banda34.setIntegrante(Arrays.asList(integrante134, integrante135, integrante136, integrante137));
        banda34.setNombre("Black Sabbath");

// Banda: Megadeth
        IntegranteDoc integrante138 = new IntegranteDoc();
        integrante138.setEsActivo(true);
        integrante138.setFechaIngreso(LocalDate.of(1983, 1, 1));
        integrante138.setInstrumento("Guitarra líder");
        integrante138.setNombre("Dave Mustaine");

        IntegranteDoc integrante139 = new IntegranteDoc();
        integrante139.setEsActivo(true);
        integrante139.setFechaIngreso(LocalDate.of(1987, 1, 1));
        integrante139.setInstrumento("Bajo");
        integrante139.setNombre("David Ellefson");

        IntegranteDoc integrante140 = new IntegranteDoc();
        integrante140.setEsActivo(true);
        integrante140.setFechaIngreso(LocalDate.of(2004, 1, 1));
        integrante140.setInstrumento("Batería");
        integrante140.setNombre("Shawn Drover");

        IntegranteDoc integrante141 = new IntegranteDoc();
        integrante141.setEsActivo(true);
        integrante141.setFechaIngreso(LocalDate.of(2004, 1, 1));
        integrante141.setInstrumento("Guitarra rítmica");
        integrante141.setNombre("Chris Broderick");

        ArtistaColeccion banda35 = new ArtistaColeccion();
        banda35.setEsBanda(true);
        banda35.setGeneros(Arrays.asList(metal));
        banda35.setImagen("/artistas/Megadeth.jpg");
        banda35.setIntegrante(Arrays.asList(integrante138, integrante139, integrante140, integrante141));
        banda35.setNombre("Megadeth");

// Banda: Wu-Tang Clan
        IntegranteDoc integrante142 = new IntegranteDoc();
        integrante142.setEsActivo(true);
        integrante142.setFechaIngreso(LocalDate.of(1992, 1, 1));
        integrante142.setInstrumento("Rap");
        integrante142.setNombre("RZA");

        IntegranteDoc integrante143 = new IntegranteDoc();
        integrante143.setEsActivo(true);
        integrante143.setFechaIngreso(LocalDate.of(1992, 1, 1));
        integrante143.setInstrumento("Rap");
        integrante143.setNombre("GZA");

        IntegranteDoc integrante144 = new IntegranteDoc();
        integrante144.setEsActivo(true);
        integrante144.setFechaIngreso(LocalDate.of(1992, 1, 1));
        integrante144.setInstrumento("Rap");
        integrante144.setNombre("Ol' Dirty Bastard");

        IntegranteDoc integrante145 = new IntegranteDoc();
        integrante145.setEsActivo(true);
        integrante145.setFechaIngreso(LocalDate.of(1992, 1, 1));
        integrante145.setInstrumento("Rap");
        integrante145.setNombre("Inspectah Deck");

        IntegranteDoc integrante146 = new IntegranteDoc();
        integrante146.setEsActivo(true);
        integrante146.setFechaIngreso(LocalDate.of(1992, 1, 1));
        integrante146.setInstrumento("Rap");
        integrante146.setNombre("Raekwon");

        ArtistaColeccion banda36 = new ArtistaColeccion();
        banda36.setEsBanda(true);
        banda36.setGeneros(Arrays.asList(hiphop));
        banda36.setImagen("/artistas/WuTangClan.jpg");
        banda36.setIntegrante(Arrays.asList(integrante142, integrante143, integrante144, integrante145, integrante146));
        banda36.setNombre("Wu-Tang Clan");

        // Integrantes Gang Starr
        IntegranteDoc integrante147 = new IntegranteDoc();
        integrante147.setEsActivo(false);
        integrante147.setFechaIngreso(LocalDate.of(1987, 1, 1));
        integrante147.setInstrumento("Rap");
        integrante147.setNombre("Guru");

        IntegranteDoc integrante148 = new IntegranteDoc();
        integrante148.setEsActivo(false);
        integrante148.setFechaIngreso(LocalDate.of(1987, 1, 1));
        integrante148.setInstrumento("DJ/Producción");
        integrante148.setNombre("DJ Premier");

        ArtistaColeccion banda37 = new ArtistaColeccion();
        banda37.setEsBanda(true);
        banda37.setGeneros(Arrays.asList(hiphop));
        banda37.setImagen("/artistas/GangStarr.jpg");
        banda37.setIntegrante(Arrays.asList(integrante147, integrante148));
        banda37.setNombre("Gang Starr");

// Integrantes The Fugees
        IntegranteDoc integrante149 = new IntegranteDoc();
        integrante149.setEsActivo(true);
        integrante149.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante149.setInstrumento("Rap");
        integrante149.setNombre("Lauryn Hill");

        IntegranteDoc integrante150 = new IntegranteDoc();
        integrante150.setEsActivo(true);
        integrante150.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante150.setInstrumento("Rap");
        integrante150.setNombre("Wyclef Jean");

        IntegranteDoc integrante151 = new IntegranteDoc();
        integrante151.setEsActivo(true);
        integrante151.setFechaIngreso(LocalDate.of(1994, 1, 1));
        integrante151.setInstrumento("Rap");
        integrante151.setNombre("Pras Michel");

        ArtistaColeccion banda38 = new ArtistaColeccion();
        banda38.setEsBanda(true);
        banda38.setGeneros(Arrays.asList(hiphop));
        banda38.setImagen("/artistas/TheFugees.jpg");
        banda38.setIntegrante(Arrays.asList(integrante149, integrante150, integrante151));
        banda38.setNombre("The Fugees");

// Integrantes Flowklorikos
        IntegranteDoc integrante152 = new IntegranteDoc();
        integrante152.setEsActivo(true);
        integrante152.setFechaIngreso(LocalDate.of(1995, 1, 1));
        integrante152.setInstrumento("Rap");
        integrante152.setNombre("Rafael Lechoswky");

        IntegranteDoc integrante153 = new IntegranteDoc();
        integrante153.setEsActivo(true);
        integrante153.setFechaIngreso(LocalDate.of(1995, 1, 1));
        integrante153.setInstrumento("Rap");
        integrante153.setNombre("Franc Sanz");

        ArtistaColeccion banda39 = new ArtistaColeccion();
        banda39.setEsBanda(true);
        banda39.setGeneros(Arrays.asList(hiphop, jazz));
        banda39.setImagen("/artistas/Flowklorikos.jpg");
        banda39.setIntegrante(Arrays.asList(integrante152, integrante153));
        banda39.setNombre("Flowklorikos");

// Integrantes A Tribe Called Quest
        IntegranteDoc integrante154 = new IntegranteDoc();
        integrante154.setEsActivo(false);
        integrante154.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante154.setFechaEgreso(LocalDate.of(1998, 1, 1));
        integrante154.setInstrumento("Rap");
        integrante154.setNombre("Q-Tip");

        IntegranteDoc integrante155 = new IntegranteDoc();
        integrante155.setEsActivo(false);
        integrante155.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante155.setFechaEgreso(LocalDate.of(1998, 1, 1));
        integrante155.setInstrumento("Rap");
        integrante155.setNombre("Phife Dawg");

        IntegranteDoc integrante156 = new IntegranteDoc();
        integrante156.setEsActivo(false);
        integrante156.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante156.setFechaEgreso(LocalDate.of(1998, 1, 1));
        integrante156.setInstrumento("DJ");
        integrante156.setNombre("Ali Shaheed Muhammad");

        IntegranteDoc integrante157 = new IntegranteDoc();
        integrante157.setEsActivo(false);
        integrante157.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante157.setFechaEgreso(LocalDate.of(1998, 1, 1));
        integrante157.setInstrumento("DJ");
        integrante157.setNombre("Jarobi White");

        ArtistaColeccion banda40 = new ArtistaColeccion();
        banda40.setEsBanda(true);
        banda40.setGeneros(Arrays.asList(hiphop, alternativo));
        banda40.setImagen("/artistas/ATribeCalledQuest.jpg");
        banda40.setIntegrante(Arrays.asList(integrante154, integrante155, integrante156, integrante157));
        banda40.setNombre("A Tribe Called Quest");

        // Integrantes Beastie Boys
        IntegranteDoc integrante158 = new IntegranteDoc();
        integrante158.setEsActivo(false);
        integrante158.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante158.setFechaEgreso(LocalDate.of(2012, 5, 4));
        integrante158.setInstrumento("Rap");
        integrante158.setNombre("Mike D");

        IntegranteDoc integrante159 = new IntegranteDoc();
        integrante159.setEsActivo(false);
        integrante159.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante159.setFechaEgreso(LocalDate.of(2012, 5, 4));
        integrante159.setInstrumento("Rap");
        integrante159.setNombre("Ad-Rock");

        IntegranteDoc integrante160 = new IntegranteDoc();
        integrante160.setEsActivo(false);
        integrante160.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante160.setFechaEgreso(LocalDate.of(2012, 5, 4));
        integrante160.setInstrumento("Rap");
        integrante160.setNombre("MCA");

        IntegranteDoc integrante161 = new IntegranteDoc();
        integrante161.setEsActivo(true);
        integrante161.setFechaIngreso(LocalDate.of(1981, 1, 1));
        integrante161.setInstrumento("DJ");
        integrante161.setNombre("Mix Master Mike");

        ArtistaColeccion banda41 = new ArtistaColeccion();
        banda41.setEsBanda(true);
        banda41.setGeneros(Arrays.asList(hiphop, punk));
        banda41.setImagen("/artistas/BeastieBoys.jpg");
        banda41.setIntegrante(Arrays.asList(integrante158, integrante159, integrante160, integrante161));
        banda41.setNombre("Beastie Boys");

// Integrantes Vienna Philharmonic
        IntegranteDoc integrante162 = new IntegranteDoc();
        integrante162.setEsActivo(true);
        integrante162.setFechaIngreso(LocalDate.of(1990, 1, 1));
        integrante162.setInstrumento("Violín");
        integrante162.setNombre("José Hernández");

        IntegranteDoc integrante163 = new IntegranteDoc();
        integrante163.setEsActivo(true);
        integrante163.setFechaIngreso(LocalDate.of(1995, 1, 1));
        integrante163.setInstrumento("Cello");
        integrante163.setNombre("Maria González");

        IntegranteDoc integrante164 = new IntegranteDoc();
        integrante164.setEsActivo(true);
        integrante164.setFechaIngreso(LocalDate.of(2000, 1, 1));
        integrante164.setInstrumento("Piano");
        integrante164.setNombre("Karl Schmidt");

        IntegranteDoc integrante165 = new IntegranteDoc();
        integrante165.setEsActivo(false);
        integrante165.setFechaIngreso(LocalDate.of(1980, 1, 1));
        integrante165.setFechaEgreso(LocalDate.of(2015, 1, 1));
        integrante165.setInstrumento("Flauta");
        integrante165.setNombre("Peter Müller");

        ArtistaColeccion banda42 = new ArtistaColeccion();
        banda42.setEsBanda(true);
        banda42.setGeneros(Arrays.asList(clasica));
        banda42.setImagen("/artistas/ViennaPhilharmonic.jpg");
        banda42.setIntegrante(Arrays.asList(integrante162, integrante163, integrante164, integrante165));
        banda42.setNombre("The Vienna Philharmonic");
        IntegranteDoc integrante174 = new IntegranteDoc();
        integrante174.setEsActivo(true);
        integrante174.setFechaIngreso(LocalDate.of(1999, 1, 1));
        integrante174.setInstrumento("Violín");
        integrante174.setNombre("Sophia White");

        IntegranteDoc integrante175 = new IntegranteDoc();
        integrante175.setEsActivo(true);
        integrante175.setFechaIngreso(LocalDate.of(2004, 1, 1));
        integrante175.setInstrumento("Trompeta");
        integrante175.setNombre("Daniel Martin");

        IntegranteDoc integrante176 = new IntegranteDoc();
        integrante176.setEsActivo(false);
        integrante176.setFechaIngreso(LocalDate.of(1990, 1, 1));
        integrante176.setFechaEgreso(LocalDate.of(2018, 1, 1));
        integrante176.setInstrumento("Violoncello");
        integrante176.setNombre("Charlotte Brown");

        IntegranteDoc integrante177 = new IntegranteDoc();
        integrante177.setEsActivo(true);
        integrante177.setFechaIngreso(LocalDate.of(2012, 1, 1));
        integrante177.setInstrumento("Piano");
        integrante177.setNombre("Thomas Lee");

        ArtistaColeccion banda45 = new ArtistaColeccion();
        banda45.setEsBanda(true);
        banda45.setGeneros(Arrays.asList(clasica));
        banda45.setImagen("/artistas/LondonSymphonyOrchestra.jpg");
        banda45.setIntegrante(Arrays.asList(integrante174, integrante175, integrante176, integrante177));
        banda45.setNombre("The London Symphony Orchestra");

// Integrantes New York Philharmonic
        IntegranteDoc integrante178 = new IntegranteDoc();
        integrante178.setEsActivo(true);
        integrante178.setFechaIngreso(LocalDate.of(2001, 1, 1));
        integrante178.setInstrumento("Viola");
        integrante178.setNombre("Sebastian Taylor");

        IntegranteDoc integrante179 = new IntegranteDoc();
        integrante179.setEsActivo(true);
        integrante179.setFechaIngreso(LocalDate.of(2003, 1, 1));
        integrante179.setInstrumento("Oboe");
        integrante179.setNombre("Nancy McCallum");

        IntegranteDoc integrante180 = new IntegranteDoc();
        integrante180.setEsActivo(false);
        integrante180.setFechaIngreso(LocalDate.of(1990, 1, 1));
        integrante180.setFechaEgreso(LocalDate.of(2015, 1, 1));
        integrante180.setInstrumento("Contrabajo");
        integrante180.setNombre("Charles Simmons");

        IntegranteDoc integrante181 = new IntegranteDoc();
        integrante181.setEsActivo(true);
        integrante181.setFechaIngreso(LocalDate.of(2005, 1, 1));
        integrante181.setInstrumento("Percusión");
        integrante181.setNombre("Andrew Grant");

        ArtistaColeccion banda46 = new ArtistaColeccion();
        banda46.setEsBanda(true);
        banda46.setGeneros(Arrays.asList(clasica));
        banda46.setImagen("/artistas/NewYorkPhilharmonic.jpg");
        banda46.setIntegrante(Arrays.asList(integrante178, integrante179, integrante180, integrante181));
        banda46.setNombre("The New York Philharmonic");

// Integrantes The Isley Brothers
        IntegranteDoc integrante182 = new IntegranteDoc();
        integrante182.setEsActivo(true);
        integrante182.setFechaIngreso(LocalDate.of(1954, 1, 1));
        integrante182.setInstrumento("Voz");
        integrante182.setNombre("Ronald Isley");

        IntegranteDoc integrante183 = new IntegranteDoc();
        integrante183.setEsActivo(true);
        integrante183.setFechaIngreso(LocalDate.of(1965, 1, 1));
        integrante183.setInstrumento("Guitarra");
        integrante183.setNombre("Ernie Isley");

        ArtistaColeccion banda47 = new ArtistaColeccion();
        banda47.setEsBanda(true);
        banda47.setGeneros(Arrays.asList(soul));
        banda47.setImagen("/artistas/TheIsleyBrothers.jpg");
        banda47.setIntegrante(Arrays.asList(integrante182, integrante183));
        banda47.setNombre("The Isley Brothers");

// Integrantes The Supremes
        IntegranteDoc integrante185 = new IntegranteDoc();
        integrante185.setEsActivo(false);
        integrante185.setFechaIngreso(LocalDate.of(1959, 1, 1));
        integrante185.setFechaEgreso(LocalDate.of(1977, 1, 1));
        integrante185.setInstrumento("Voz");
        integrante185.setNombre("Diana Ross");

        IntegranteDoc integrante186 = new IntegranteDoc();
        integrante186.setEsActivo(false);
        integrante186.setFechaIngreso(LocalDate.of(1959, 1, 1));
        integrante186.setFechaEgreso(LocalDate.of(1977, 1, 1));
        integrante186.setInstrumento("Voz");
        integrante186.setNombre("Mary Wilson");

        IntegranteDoc integrante187 = new IntegranteDoc();
        integrante187.setEsActivo(true);
        integrante187.setFechaIngreso(LocalDate.of(1961, 1, 1));
        integrante187.setInstrumento("Voz");
        integrante187.setNombre("Florence Ballard");

        ArtistaColeccion banda48 = new ArtistaColeccion();
        banda48.setEsBanda(true);
        banda48.setGeneros(Arrays.asList(soul));
        banda48.setImagen("/artistas/TheSupremes.jpg");
        banda48.setIntegrante(Arrays.asList(integrante185, integrante186, integrante187));
        banda48.setNombre("The Supremes");
// Integrantes
        // Integrantes The Cure
        IntegranteDoc integrante1870 = new IntegranteDoc();
        integrante187.setEsActivo(true);
        integrante187.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante187.setInstrumento("Voz, Guitarra");
        integrante187.setNombre("Robert Smith");

        IntegranteDoc integrante188 = new IntegranteDoc();
        integrante188.setEsActivo(true);
        integrante188.setFechaIngreso(LocalDate.of(1979, 1, 1));
        integrante188.setInstrumento("Bajo");
        integrante188.setNombre("Simon Gallup");

        IntegranteDoc integrante189 = new IntegranteDoc();
        integrante189.setEsActivo(true);
        integrante189.setFechaIngreso(LocalDate.of(1979, 1, 1));
        integrante189.setInstrumento("Batería");
        integrante189.setNombre("Jason Cooper");

        ArtistaColeccion banda49 = new ArtistaColeccion();
        banda49.setEsBanda(true);
        banda49.setGeneros(Arrays.asList(punk, alternativo));
        banda49.setImagen("/artistas/TheCure.jpg");
        banda49.setIntegrante(Arrays.asList(integrante1870, integrante188, integrante189));
        banda49.setNombre("The Cure");

// Integrantes Blondie
        IntegranteDoc integrante193 = new IntegranteDoc();
        integrante193.setEsActivo(true);
        integrante193.setFechaIngreso(LocalDate.of(1974, 1, 1));
        integrante193.setInstrumento("Voz");
        integrante193.setNombre("Debbie Harry");

        IntegranteDoc integrante194 = new IntegranteDoc();
        integrante194.setEsActivo(true);
        integrante194.setFechaIngreso(LocalDate.of(1974, 1, 1));
        integrante194.setInstrumento("Guitarra");
        integrante194.setNombre("Chris Stein");

        IntegranteDoc integrante195 = new IntegranteDoc();
        integrante195.setEsActivo(true);
        integrante195.setFechaIngreso(LocalDate.of(1974, 1, 1));
        integrante195.setInstrumento("Bajo");
        integrante195.setNombre("Clem Burke");

        ArtistaColeccion banda50 = new ArtistaColeccion();
        banda50.setEsBanda(true);
        banda50.setGeneros(Arrays.asList(punk, rock));
        banda50.setImagen("/artistas/Blondie.jpg");
        banda50.setIntegrante(Arrays.asList(integrante193, integrante194, integrante195));
        banda50.setNombre("Blondie");

// Integrantes Joy Division
        IntegranteDoc integrante196 = new IntegranteDoc();
        integrante196.setEsActivo(false);
        integrante196.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante196.setFechaEgreso(LocalDate.of(1980, 5, 18));
        integrante196.setInstrumento("Voz");
        integrante196.setNombre("Ian Curtis");

        IntegranteDoc integrante197 = new IntegranteDoc();
        integrante197.setEsActivo(false);
        integrante197.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante197.setFechaEgreso(LocalDate.of(1980, 5, 18));
        integrante197.setInstrumento("Guitarra");
        integrante197.setNombre("Bernard Sumner");

        IntegranteDoc integrante198 = new IntegranteDoc();
        integrante198.setEsActivo(false);
        integrante198.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante198.setFechaEgreso(LocalDate.of(1980, 5, 18));
        integrante198.setInstrumento("Bajo");
        integrante198.setNombre("Peter Hook");

        ArtistaColeccion banda51 = new ArtistaColeccion();
        banda51.setEsBanda(true);
        banda51.setGeneros(Arrays.asList(punk));
        banda51.setImagen("/artistas/JoyDivision.jpg");
        banda51.setIntegrante(Arrays.asList(integrante196, integrante197, integrante198));
        banda51.setNombre("Joy Division");

// Integrantes Sex Pistols
        IntegranteDoc integrante199 = new IntegranteDoc();
        integrante199.setEsActivo(false);
        integrante199.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante199.setFechaEgreso(LocalDate.of(1978, 1, 1));
        integrante199.setInstrumento("Voz");
        integrante199.setNombre("Johnny Rotten");

        IntegranteDoc integrante200 = new IntegranteDoc();
        integrante200.setEsActivo(false);
        integrante200.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante200.setFechaEgreso(LocalDate.of(1978, 1, 1));
        integrante200.setInstrumento("Guitarra");
        integrante200.setNombre("Steve Jones");

        IntegranteDoc integrante201 = new IntegranteDoc();
        integrante201.setEsActivo(false);
        integrante201.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante201.setFechaEgreso(LocalDate.of(1978, 1, 1));
        integrante201.setInstrumento("Bajo");
        integrante201.setNombre("Sid Vicious");

        ArtistaColeccion banda52 = new ArtistaColeccion();
        banda52.setEsBanda(true);
        banda52.setGeneros(Arrays.asList(punk));
        banda52.setImagen("/artistas/SexPistols.jpg");
        banda52.setIntegrante(Arrays.asList(integrante199, integrante200, integrante201));
        banda52.setNombre("Sex Pistols");

// Integrantes The Clash
        IntegranteDoc integrante202 = new IntegranteDoc();
        integrante202.setEsActivo(true);
        integrante202.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante202.setInstrumento("Voz");
        integrante202.setNombre("Joe Strummer");

        IntegranteDoc integrante203 = new IntegranteDoc();
        integrante203.setEsActivo(true);
        integrante203.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante203.setInstrumento("Guitarra");
        integrante203.setNombre("Mick Jones");

        IntegranteDoc integrante204 = new IntegranteDoc();
        integrante204.setEsActivo(true);
        integrante204.setFechaIngreso(LocalDate.of(1976, 1, 1));
        integrante204.setInstrumento("Bajo");
        integrante204.setNombre("Paul Simonon");

        ArtistaColeccion banda53 = new ArtistaColeccion();
        banda53.setEsBanda(true);
        banda53.setGeneros(Arrays.asList(punk, reggae));
        banda53.setImagen("/artistas/TheClash.jpg");
        banda53.setIntegrante(Arrays.asList(integrante202, integrante203, integrante204));
        banda53.setNombre("The Clash");

// Integrantes Parliament
        IntegranteDoc integrante209 = new IntegranteDoc();
        integrante209.setEsActivo(true);
        integrante209.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante209.setInstrumento("Voz, Bajo");
        integrante209.setNombre("George Clinton");

        IntegranteDoc integrante210 = new IntegranteDoc();
        integrante210.setEsActivo(true);
        integrante210.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante210.setInstrumento("Teclados");
        integrante210.setNombre("Bernie Worrell");

        IntegranteDoc integrante211 = new IntegranteDoc();
        integrante211.setEsActivo(true);
        integrante211.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante211.setInstrumento("Guitarra");
        integrante211.setNombre("Eddie Hazel");

        ArtistaColeccion banda54 = new ArtistaColeccion();
        banda54.setEsBanda(true);
        banda54.setGeneros(Arrays.asList(funk, rock));
        banda54.setImagen("/artistas/Parliament.jpg");
        banda54.setIntegrante(Arrays.asList(integrante209, integrante210, integrante211));
        banda54.setNombre("Parliament");

// Integrantes Funkadelic
        IntegranteDoc integrante212 = new IntegranteDoc();
        integrante212.setEsActivo(true);
        integrante212.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante212.setInstrumento("Voz, Guitarra");
        integrante212.setNombre("George Clinton");

        IntegranteDoc integrante213 = new IntegranteDoc();
        integrante213.setEsActivo(true);
        integrante213.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante213.setInstrumento("Teclados");
        integrante213.setNombre("Bernie Worrell");

        IntegranteDoc integrante214 = new IntegranteDoc();
        integrante214.setEsActivo(true);
        integrante214.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante214.setInstrumento("Guitarra");
        integrante214.setNombre("Eddie Hazel");

        ArtistaColeccion banda55 = new ArtistaColeccion();
        banda55.setEsBanda(true);
        banda55.setGeneros(Arrays.asList(funk, rock));
        banda55.setImagen("/artistas/Funkadelic.jpg");
        banda55.setIntegrante(Arrays.asList(integrante212, integrante213, integrante214));
        banda55.setNombre("Funkadelic");

        // Ilya Kuryaki and the Valderramas
        IntegranteDoc integrante215 = new IntegranteDoc();
        integrante215.setEsActivo(true);
        integrante215.setFechaIngreso(LocalDate.of(1991, 1, 1));
        integrante215.setInstrumento("Voz, Guitarra");
        integrante215.setNombre("Dante Spinetta");

        IntegranteDoc integrante216 = new IntegranteDoc();
        integrante216.setEsActivo(true);
        integrante216.setFechaIngreso(LocalDate.of(1991, 1, 1));
        integrante216.setInstrumento("Voz");
        integrante216.setNombre("Emmanuel Horvilleur");

        ArtistaColeccion banda57 = new ArtistaColeccion();
        banda57.setEsBanda(true);
        banda57.setGeneros(Arrays.asList(funk, hiphop, rock));
        banda57.setImagen("/artistas/IlyaKuryaki.jpg");
        banda57.setIntegrante(Arrays.asList(integrante215, integrante216));
        banda57.setNombre("Ilya Kuryaki and the Valderramas");

// Buena Vista Social Club
        IntegranteDoc integrante219 = new IntegranteDoc();
        integrante219.setEsActivo(true);
        integrante219.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante219.setInstrumento("Piano");
        integrante219.setNombre("Juan de Marcos González");

        IntegranteDoc integrante220 = new IntegranteDoc();
        integrante220.setEsActivo(false);
        integrante220.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante220.setFechaEgreso(LocalDate.of(2000, 12, 31));
        integrante220.setInstrumento("Voz");
        integrante220.setNombre("Compay Segundo");

        IntegranteDoc integrante221 = new IntegranteDoc();
        integrante221.setEsActivo(true);
        integrante221.setFechaIngreso(LocalDate.of(1975, 1, 1));
        integrante221.setInstrumento("Percusión");
        integrante221.setNombre("Luis Conte");

        ArtistaColeccion banda58 = new ArtistaColeccion();
        banda58.setEsBanda(true);
        banda58.setGeneros(Arrays.asList(musicaLatina));
        banda58.setImagen("/artistas/BuenaVistaSocialClub.jpg");
        banda58.setIntegrante(Arrays.asList(integrante219, integrante220, integrante221));
        banda58.setNombre("Buena Vista Social Club");

// Los Ángeles Azules
        IntegranteDoc integrante217 = new IntegranteDoc();
        integrante217.setEsActivo(true);
        integrante217.setFechaIngreso(LocalDate.of(1999, 1, 1));
        integrante217.setInstrumento("Voz principal");
        integrante217.setNombre("Álvaro López");

        IntegranteDoc integrante218 = new IntegranteDoc();
        integrante218.setEsActivo(true);
        integrante218.setFechaIngreso(LocalDate.of(1999, 1, 1));
        integrante218.setInstrumento("Guitarra");
        integrante218.setNombre("Roberto Márquez");

        ArtistaColeccion banda59 = new ArtistaColeccion();
        banda59.setEsBanda(true);
        banda59.setGeneros(Arrays.asList(musicaLatina));
        banda59.setImagen("/artistas/LosAngelesAzules.jpg");
        banda59.setIntegrante(Arrays.asList(integrante217, integrante218));
        banda59.setNombre("Los Ángeles Azules");

// Sonder
        IntegranteDoc integrante2190 = new IntegranteDoc();
        integrante2190.setEsActivo(true);
        integrante2190.setFechaIngreso(LocalDate.of(2016, 1, 1));
        integrante2190.setInstrumento("Voz principal");
        integrante2190.setNombre("Brent Faiyaz");

        IntegranteDoc integrante2200 = new IntegranteDoc();
        integrante2200.setEsActivo(true);
        integrante2200.setFechaIngreso(LocalDate.of(2016, 1, 1));
        integrante2200.setInstrumento("Producción");
        integrante2200.setNombre("Dpat");

        IntegranteDoc integrante2210 = new IntegranteDoc();
        integrante2210.setEsActivo(true);
        integrante2210.setFechaIngreso(LocalDate.of(2016, 1, 1));
        integrante2210.setInstrumento("Producción");
        integrante2210.setNombre("Atu");

        ArtistaColeccion banda60 = new ArtistaColeccion();
        banda60.setEsBanda(true);
        banda60.setGeneros(Arrays.asList(rnb, hiphop, soul));
        banda60.setImagen("/artistas/Sonder.jpg");
        banda60.setIntegrante(Arrays.asList(integrante2190, integrante2200, integrante2210));
        banda60.setNombre("Sonder");

// The Internet
        IntegranteDoc integrante222 = new IntegranteDoc();
        integrante222.setEsActivo(true);
        integrante222.setFechaIngreso(LocalDate.of(2011, 1, 1));
        integrante222.setInstrumento("Voz principal");
        integrante222.setNombre("Syd");

        IntegranteDoc integrante223 = new IntegranteDoc();
        integrante223.setEsActivo(true);
        integrante223.setFechaIngreso(LocalDate.of(2011, 1, 1));
        integrante223.setInstrumento("Guitarra");
        integrante223.setNombre("Steve Lacy");

        IntegranteDoc integrante224 = new IntegranteDoc();
        integrante224.setEsActivo(true);
        integrante224.setFechaIngreso(LocalDate.of(2011, 1, 1));
        integrante224.setInstrumento("Bajo");
        integrante224.setNombre("Patrick Paige II");

        ArtistaColeccion banda61 = new ArtistaColeccion();
        banda61.setEsBanda(true);
        banda61.setGeneros(Arrays.asList(rnb, hiphop, soul));
        banda61.setImagen("/artistas/TheInternet.jpg");
        banda61.setIntegrante(Arrays.asList(integrante222, integrante223, integrante224));
        banda61.setNombre("The Internet");

// Brockhampton
        IntegranteDoc integrante225 = new IntegranteDoc();
        integrante225.setEsActivo(false);
        integrante225.setFechaIngreso(LocalDate.of(2015, 1, 1));
        integrante225.setFechaEgreso(LocalDate.of(2022, 1, 1));
        integrante225.setInstrumento("Voz principal");
        integrante225.setNombre("Kevin Abstract");

        IntegranteDoc integrante226 = new IntegranteDoc();
        integrante226.setEsActivo(false);
        integrante226.setFechaIngreso(LocalDate.of(2015, 1, 1));
        integrante226.setFechaEgreso(LocalDate.of(2022, 1, 1));
        integrante226.setInstrumento("Voz secundaria");
        integrante226.setNombre("Matt Champion");

        IntegranteDoc integrante227 = new IntegranteDoc();
        integrante227.setEsActivo(false);
        integrante227.setFechaIngreso(LocalDate.of(2015, 1, 1));
        integrante227.setFechaEgreso(LocalDate.of(2022, 1, 1));
        integrante227.setInstrumento("Producción");
        integrante227.setNombre("Bearface");

        ArtistaColeccion banda62 = new ArtistaColeccion();
        banda62.setEsBanda(true);
        banda62.setGeneros(Arrays.asList(rnb, hiphop));
        banda62.setImagen("/artistas/Brockhampton.jpg");
        banda62.setIntegrante(Arrays.asList(integrante225, integrante226, integrante227));
        banda62.setNombre("Brockhampton");

// Migos
        IntegranteDoc integrante228 = new IntegranteDoc();
        integrante228.setEsActivo(false);
        integrante228.setFechaIngreso(LocalDate.of(2008, 1, 1));
        integrante228.setFechaEgreso(LocalDate.of(2023, 1, 1));
        integrante228.setInstrumento("Voz principal");
        integrante228.setNombre("Quavo");

        IntegranteDoc integrante229 = new IntegranteDoc();
        integrante229.setEsActivo(false);
        integrante229.setFechaIngreso(LocalDate.of(2008, 1, 1));
        integrante229.setFechaEgreso(LocalDate.of(2023, 1, 1));
        integrante229.setInstrumento("Voz secundaria");
        integrante229.setNombre("Offset");

        IntegranteDoc integrante230 = new IntegranteDoc();
        integrante230.setEsActivo(false);
        integrante230.setFechaIngreso(LocalDate.of(2008, 1, 1));
        integrante230.setFechaEgreso(LocalDate.of(2023, 1, 1));
        integrante230.setInstrumento("Voz secundaria");
        integrante230.setNombre("Takeoff");

        ArtistaColeccion banda63 = new ArtistaColeccion();
        banda63.setEsBanda(true);
        banda63.setGeneros(Arrays.asList(trap, hiphop));
        banda63.setImagen("/artistas/Migos.jpg");
        banda63.setIntegrante(Arrays.asList(integrante228, integrante229, integrante230));
        banda63.setNombre("Migos");

// Jackboys
        IntegranteDoc integrante231 = new IntegranteDoc();
        integrante231.setEsActivo(true);
        integrante231.setFechaIngreso(LocalDate.of(2019, 1, 1));
        integrante231.setInstrumento("Voz principal");
        integrante231.setNombre("Travis Scott");

        IntegranteDoc integrante232 = new IntegranteDoc();
        integrante232.setEsActivo(true);
        integrante232.setFechaIngreso(LocalDate.of(2019, 1, 1));
        integrante232.setInstrumento("Voz secundaria");
        integrante232.setNombre("Don Toliver");

        ArtistaColeccion banda64 = new ArtistaColeccion();
        banda64.setEsBanda(true);
        banda64.setGeneros(Arrays.asList(trap, hiphop));
        banda64.setImagen("/artistas/Jackboys.jpg");
        banda64.setIntegrante(Arrays.asList(integrante231, integrante232));
        banda64.setNombre("Jackboys");

// Shoreline Mafia
        IntegranteDoc integrante233 = new IntegranteDoc();
        integrante233.setEsActivo(false);
        integrante233.setFechaIngreso(LocalDate.of(2016, 1, 1));
        integrante233.setFechaEgreso(LocalDate.of(2020, 1, 1));
        integrante233.setInstrumento("Voz principal");
        integrante233.setNombre("OhGeesy");

        IntegranteDoc integrante234 = new IntegranteDoc();
        integrante234.setEsActivo(false);
        integrante234.setFechaIngreso(LocalDate.of(2016, 1, 1));
        integrante234.setFechaEgreso(LocalDate.of(2020, 1, 1));
        integrante234.setInstrumento("Voz secundaria");
        integrante234.setNombre("Fenix Flexin");

        ArtistaColeccion banda65 = new ArtistaColeccion();
        banda65.setEsBanda(true);
        banda65.setGeneros(Arrays.asList(trap, hiphop));
        banda65.setImagen("/artistas/ShorelineMafia.jpg");
        banda65.setIntegrante(Arrays.asList(integrante233, integrante234));
        banda65.setNombre("Shoreline Mafia");

// Rae Sremmurd
        IntegranteDoc integrante235 = new IntegranteDoc();
        integrante235.setEsActivo(true);
        integrante235.setFechaIngreso(LocalDate.of(2013, 1, 1));
        integrante235.setInstrumento("Voz principal");
        integrante235.setNombre("Swae Lee");

        IntegranteDoc integrante236 = new IntegranteDoc();
        integrante236.setEsActivo(true);
        integrante236.setFechaIngreso(LocalDate.of(2013, 1, 1));
        integrante236.setInstrumento("Voz secundaria");
        integrante236.setNombre("Slim Jxmmi");

        ArtistaColeccion banda66 = new ArtistaColeccion();
        banda66.setEsBanda(true);
        banda66.setGeneros(Arrays.asList(trap, hiphop));
        banda66.setImagen("/artistas/RaeSremmurd.jpg");
        banda66.setIntegrante(Arrays.asList(integrante235, integrante236));
        banda66.setNombre("Rae Sremmurd");
// City Girls
        IntegranteDoc integrante237 = new IntegranteDoc();
        integrante237.setEsActivo(true);
        integrante237.setFechaIngreso(LocalDate.of(2017, 1, 1));
        integrante237.setInstrumento("Voz principal");
        integrante237.setNombre("Yung Miami");

        IntegranteDoc integrante238 = new IntegranteDoc();
        integrante238.setEsActivo(true);
        integrante238.setFechaIngreso(LocalDate.of(2017, 1, 1));
        integrante238.setInstrumento("Voz secundaria");
        integrante238.setNombre("JT");

        ArtistaColeccion banda67 = new ArtistaColeccion();
        banda67.setEsBanda(true);
        banda67.setGeneros(Arrays.asList(trap, hiphop));
        banda67.setImagen("/artistas/CityGirls.jpg");
        banda67.setIntegrante(Arrays.asList(integrante237, integrante238));
        banda67.setNombre("City Girls");

// Daft Punk
        IntegranteDoc integrante239 = new IntegranteDoc();
        integrante239.setEsActivo(false);
        integrante239.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante239.setFechaEgreso(LocalDate.of(2021, 2, 22));
        integrante239.setInstrumento("Producción, DJ");
        integrante239.setNombre("Thomas Bangalter");

        IntegranteDoc integrante240 = new IntegranteDoc();
        integrante240.setEsActivo(false);
        integrante240.setFechaIngreso(LocalDate.of(1993, 1, 1));
        integrante240.setFechaEgreso(LocalDate.of(2021, 2, 22));
        integrante240.setInstrumento("Producción, DJ");
        integrante240.setNombre("Guy-Manuel de Homem-Christo");

        ArtistaColeccion banda68 = new ArtistaColeccion();
        banda68.setEsBanda(true);
        banda68.setGeneros(Arrays.asList(electronica));
        banda68.setImagen("/artistas/DaftPunk.jpg");
        banda68.setIntegrante(Arrays.asList(integrante239, integrante240));
        banda68.setNombre("Daft Punk");

// The Chemical Brothers
        IntegranteDoc integrante241 = new IntegranteDoc();
        integrante241.setEsActivo(true);
        integrante241.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante241.setInstrumento("Producción, DJ");
        integrante241.setNombre("Tom Rowlands");

        IntegranteDoc integrante242 = new IntegranteDoc();
        integrante242.setEsActivo(true);
        integrante242.setFechaIngreso(LocalDate.of(1989, 1, 1));
        integrante242.setInstrumento("Producción, DJ");
        integrante242.setNombre("Ed Simons");

        ArtistaColeccion banda69 = new ArtistaColeccion();
        banda69.setEsBanda(true);
        banda69.setGeneros(Arrays.asList(electronica));
        banda69.setImagen("/artistas/ChemicalBrothers.jpg");
        banda69.setIntegrante(Arrays.asList(integrante241, integrante242));
        banda69.setNombre("The Chemical Brothers");

// Kraftwerk
        IntegranteDoc integrante243 = new IntegranteDoc();
        integrante243.setEsActivo(false);
        integrante243.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante243.setFechaEgreso(LocalDate.of(2008, 1, 1));
        integrante243.setInstrumento("Teclados, Sintetizador");
        integrante243.setNombre("Florian Schneider");

        IntegranteDoc integrante244 = new IntegranteDoc();
        integrante244.setEsActivo(true);
        integrante244.setFechaIngreso(LocalDate.of(1970, 1, 1));
        integrante244.setInstrumento("Teclados, Sintetizador");
        integrante244.setNombre("Ralf Hütter");

        ArtistaColeccion banda70 = new ArtistaColeccion();
        banda70.setEsBanda(true);
        banda70.setGeneros(Arrays.asList(electronica));
        banda70.setImagen("/artistas/Kraftwerk.jpg");
        banda70.setIntegrante(Arrays.asList(integrante243, integrante244));
        banda70.setNombre("Kraftwerk");

// Justice
        IntegranteDoc integrante245 = new IntegranteDoc();
        integrante245.setEsActivo(true);
        integrante245.setFechaIngreso(LocalDate.of(2003, 1, 1));
        integrante245.setInstrumento("Producción, DJ");
        integrante245.setNombre("Gaspard Augé");

        IntegranteDoc integrante246 = new IntegranteDoc();
        integrante246.setEsActivo(true);
        integrante246.setFechaIngreso(LocalDate.of(2003, 1, 1));
        integrante246.setInstrumento("Producción, DJ");
        integrante246.setNombre("Xavier de Rosnay");

        ArtistaColeccion banda71 = new ArtistaColeccion();
        banda71.setEsBanda(true);
        banda71.setGeneros(Arrays.asList(electronica));
        banda71.setImagen("/artistas/Justice.jpg");
        banda71.setIntegrante(Arrays.asList(integrante245, integrante246));
        banda71.setNombre("Justice");

// MSTRKRFT
        IntegranteDoc integrante247 = new IntegranteDoc();
        integrante247.setEsActivo(true);
        integrante247.setFechaIngreso(LocalDate.of(2005, 1, 1));
        integrante247.setInstrumento("Producción, DJ");
        integrante247.setNombre("Jesse F. Keeler");

        IntegranteDoc integrante248 = new IntegranteDoc();
        integrante248.setEsActivo(true);
        integrante248.setFechaIngreso(LocalDate.of(2005, 1, 1));
        integrante248.setInstrumento("Producción, DJ");
        integrante248.setNombre("Al-P");

        ArtistaColeccion banda72 = new ArtistaColeccion();
        banda72.setEsBanda(true);
        banda72.setGeneros(Arrays.asList(electronica));
        banda72.setImagen("/artistas/MSTRKRFT.jpg");
        banda72.setIntegrante(Arrays.asList(integrante247, integrante248));
        banda72.setNombre("MSTRKRFT");

// Pink Floyd
        IntegranteDoc integrante249 = new IntegranteDoc();
        integrante249.setEsActivo(false);
        integrante249.setFechaIngreso(LocalDate.of(1965, 1, 1));
        integrante249.setFechaEgreso(LocalDate.of(2008, 9, 15));
        integrante249.setInstrumento("Guitarra, Voz");
        integrante249.setNombre("David Gilmour");

        IntegranteDoc integrante250 = new IntegranteDoc();
        integrante250.setEsActivo(false);
        integrante250.setFechaIngreso(LocalDate.of(1965, 1, 1));
        integrante250.setFechaEgreso(LocalDate.of(2008, 9, 15));
        integrante250.setInstrumento("Bajo, Voz");
        integrante250.setNombre("Roger Waters");

        IntegranteDoc integrante251 = new IntegranteDoc();
        integrante251.setEsActivo(false);
        integrante251.setFechaIngreso(LocalDate.of(1965, 1, 1));
        integrante251.setFechaEgreso(LocalDate.of(2008, 9, 15));
        integrante251.setInstrumento("Teclados");
        integrante251.setNombre("Richard Wright");

        IntegranteDoc integrante252 = new IntegranteDoc();
        integrante252.setEsActivo(false);
        integrante252.setFechaIngreso(LocalDate.of(1965, 1, 1));
        integrante252.setFechaEgreso(LocalDate.of(2008, 9, 15));
        integrante252.setInstrumento("Batería");
        integrante252.setNombre("Nick Mason");

        ArtistaColeccion banda73 = new ArtistaColeccion();
        banda73.setEsBanda(true);
        banda73.setGeneros(Arrays.asList(prog, rock));
        banda73.setImagen("/artistas/PinkFloyd.jpg");
        banda73.setIntegrante(Arrays.asList(integrante249, integrante250, integrante251, integrante252));
        banda73.setNombre("Pink Floyd");

        IntegranteDoc integrante2370 = new IntegranteDoc();
        integrante2370.setEsActivo(false);
        integrante2370.setFechaIngreso(LocalDate.of(1978, 1, 1));
        integrante2370.setFechaEgreso(LocalDate.of(1982, 1, 1));
        integrante2370.setInstrumento("Voz, Teclado");
        integrante2370.setNombre("Charly García");

        IntegranteDoc integrante2380 = new IntegranteDoc();
        integrante2380.setEsActivo(false);
        integrante2380.setFechaIngreso(LocalDate.of(1978, 1, 1));
        integrante2380.setFechaEgreso(LocalDate.of(1982, 1, 1));
        integrante2380.setInstrumento("Bajo, Voz");
        integrante2380.setNombre("Pedro Aznar");

        IntegranteDoc integrante2390 = new IntegranteDoc();
        integrante2390.setEsActivo(false);
        integrante2390.setFechaIngreso(LocalDate.of(1978, 1, 1));
        integrante2390.setFechaEgreso(LocalDate.of(1982, 1, 1));
        integrante2390.setInstrumento("Guitarra");
        integrante2390.setNombre("David Lebón");

        IntegranteDoc integrante2400 = new IntegranteDoc();
        integrante2400.setEsActivo(false);
        integrante2400.setFechaIngreso(LocalDate.of(1978, 1, 1));
        integrante2400.setFechaEgreso(LocalDate.of(1982, 1, 1));
        integrante2400.setInstrumento("Batería");
        integrante2400.setNombre("Oscar Moro");

        ArtistaColeccion banda74 = new ArtistaColeccion();
        banda74.setEsBanda(true);
        banda74.setGeneros(Arrays.asList(prog, rock));
        banda74.setImagen("/artistas/SeruGiran.jpg");
        banda74.setIntegrante(Arrays.asList(integrante2370, integrante2380, integrante2390, integrante2400));
        banda74.setNombre("Serú Girán");

// Integrantes de Yes
        IntegranteDoc integrante253 = new IntegranteDoc();
        integrante253.setEsActivo(false);
        integrante253.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante253.setInstrumento("Voz");
        integrante253.setNombre("Jon Anderson");

        IntegranteDoc integrante254 = new IntegranteDoc();
        integrante254.setEsActivo(false);
        integrante254.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante254.setInstrumento("Guitarra");
        integrante254.setNombre("Steve Howe");

        IntegranteDoc integrante255 = new IntegranteDoc();
        integrante255.setEsActivo(false);
        integrante255.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante255.setInstrumento("Teclados");
        integrante255.setNombre("Rick Wakeman");

        ArtistaColeccion banda75 = new ArtistaColeccion();
        banda75.setEsBanda(true);
        banda75.setGeneros(Arrays.asList(prog));
        banda75.setImagen("/artistas/Yes.jpg");
        banda75.setIntegrante(Arrays.asList(integrante253, integrante254, integrante255));
        banda75.setNombre("Yes");

// Integrantes de Genesis
        IntegranteDoc integrante256 = new IntegranteDoc();
        integrante256.setEsActivo(false);
        integrante256.setFechaIngreso(LocalDate.of(1967, 1, 1));
        integrante256.setInstrumento("Teclados");
        integrante256.setNombre("Tony Banks");

        IntegranteDoc integrante257 = new IntegranteDoc();
        integrante257.setEsActivo(false);
        integrante257.setFechaIngreso(LocalDate.of(1967, 1, 1));
        integrante257.setInstrumento("Voz");
        integrante257.setNombre("Phil Collins");

        ArtistaColeccion banda76 = new ArtistaColeccion();
        banda76.setEsBanda(true);
        banda76.setGeneros(Arrays.asList(prog));
        banda76.setImagen("/artistas/Genesis.jpg");
        banda76.setIntegrante(Arrays.asList(integrante256, integrante257));
        banda76.setNombre("Genesis");

// Integrantes de King Crimson
        IntegranteDoc integrante258 = new IntegranteDoc();
        integrante258.setEsActivo(true);
        integrante258.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante258.setInstrumento("Guitarra");
        integrante258.setNombre("Robert Fripp");

        IntegranteDoc integrante259 = new IntegranteDoc();
        integrante259.setEsActivo(true);
        integrante259.setFechaIngreso(LocalDate.of(1968, 1, 1));
        integrante259.setInstrumento("Bajo");
        integrante259.setNombre("Tony Levin");

        ArtistaColeccion banda77 = new ArtistaColeccion();
        banda77.setEsBanda(true);
        banda77.setGeneros(Arrays.asList(prog));
        banda77.setImagen("/artistas/KingCrimson.jpg");
        banda77.setIntegrante(Arrays.asList(integrante258, integrante259));
        banda77.setNombre("King Crimson");

// Integrantes de The Strokes
        IntegranteDoc integrante2410 = new IntegranteDoc();
        integrante2410.setEsActivo(true);
        integrante2410.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante2410.setInstrumento("Voz");
        integrante2410.setNombre("Julian Casablancas");

        IntegranteDoc integrante2420 = new IntegranteDoc();
        integrante2420.setEsActivo(true);
        integrante2420.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante2420.setInstrumento("Guitarra");
        integrante2420.setNombre("Nick Valensi");

        IntegranteDoc integrante2430 = new IntegranteDoc();
        integrante2430.setEsActivo(true);
        integrante2430.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante2430.setInstrumento("Bajo");
        integrante2430.setNombre("Nikolai Fraiture");

        IntegranteDoc integrante2440 = new IntegranteDoc();
        integrante2440.setEsActivo(true);
        integrante2440.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante2440.setInstrumento("Guitarra");
        integrante2440.setNombre("Albert Hammond Jr.");

        IntegranteDoc integrante2450 = new IntegranteDoc();
        integrante2450.setEsActivo(true);
        integrante2450.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante2450.setInstrumento("Batería");
        integrante2450.setNombre("Fabrizio Moretti");

        ArtistaColeccion banda79 = new ArtistaColeccion();
        banda79.setEsBanda(true);
        banda79.setGeneros(Arrays.asList(alternativo, rock));
        banda79.setImagen("/artistas/TheStrokes.jpg");
        banda79.setIntegrante(Arrays.asList(integrante2410, integrante2420, integrante2430, integrante2440, integrante2450));
        banda79.setNombre("The Strokes");

// Continuar de manera similar para el resto de las bandas...
// Integrantes de Interpol
        IntegranteDoc integrante2460 = new IntegranteDoc();
        integrante2460.setEsActivo(true);
        integrante2460.setFechaIngreso(LocalDate.of(1997, 1, 1));
        integrante2460.setInstrumento("Voz, Bajo");
        integrante2460.setNombre("Paul Banks");

        IntegranteDoc integrante2470 = new IntegranteDoc();
        integrante2470.setEsActivo(true);
        integrante2470.setFechaIngreso(LocalDate.of(1997, 1, 1));
        integrante2470.setInstrumento("Guitarra");
        integrante2470.setNombre("Daniel Kessler");

        IntegranteDoc integrante2480 = new IntegranteDoc();
        integrante2480.setEsActivo(true);
        integrante2480.setFechaIngreso(LocalDate.of(1997, 1, 1));
        integrante2480.setInstrumento("Batería");
        integrante2480.setNombre("Sam Fogarino");

// Banda Interpol
        ArtistaColeccion banda80 = new ArtistaColeccion();
        banda80.setEsBanda(true);
        banda80.setGeneros(Arrays.asList(alternativo, rock));
        banda80.setImagen("/artistas/Interpol.jpg");
        banda80.setIntegrante(Arrays.asList(integrante2460, integrante2470, integrante2480));
        banda80.setNombre("Interpol");

// Integrantes de Radiohead
        IntegranteDoc integrante2490 = new IntegranteDoc();
        integrante2490.setEsActivo(true);
        integrante2490.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante2490.setInstrumento("Voz, Guitarra");
        integrante2490.setNombre("Thom Yorke");

        IntegranteDoc integrante2500 = new IntegranteDoc();
        integrante2500.setEsActivo(true);
        integrante2500.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante2500.setInstrumento("Guitarra");
        integrante2500.setNombre("Jonny Greenwood");

        IntegranteDoc integrante2510 = new IntegranteDoc();
        integrante2510.setEsActivo(true);
        integrante2510.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante2510.setInstrumento("Bajo");
        integrante2510.setNombre("Colin Greenwood");

        IntegranteDoc integrante2520 = new IntegranteDoc();
        integrante2520.setEsActivo(true);
        integrante2520.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante2520.setInstrumento("Batería");
        integrante2520.setNombre("Phil Selway");

        IntegranteDoc integrante2530 = new IntegranteDoc();
        integrante2530.setEsActivo(true);
        integrante2530.setFechaIngreso(LocalDate.of(1985, 1, 1));
        integrante2530.setInstrumento("Guitarra, Teclado");
        integrante2530.setNombre("Ed O'Brien");

// Banda Radiohead
        ArtistaColeccion banda81 = new ArtistaColeccion();
        banda81.setEsBanda(true);
        banda81.setGeneros(Arrays.asList(alternativo));
        banda81.setImagen("/artistas/Radiohead.jpg");
        banda81.setIntegrante(Arrays.asList(integrante2490, integrante2500, integrante2510, integrante2520, integrante2530));
        banda81.setNombre("Radiohead");

// Integrantes de Arctic Monkeys
        IntegranteDoc integrante2540 = new IntegranteDoc();
        integrante2540.setEsActivo(true);
        integrante2540.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante2540.setInstrumento("Voz, Guitarra");
        integrante2540.setNombre("Alex Turner");

        IntegranteDoc integrante2550 = new IntegranteDoc();
        integrante2550.setEsActivo(true);
        integrante2550.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante2550.setInstrumento("Bajo");
        integrante2550.setNombre("Nick O'Malley");

        IntegranteDoc integrante2560 = new IntegranteDoc();
        integrante2560.setEsActivo(true);
        integrante2560.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante2560.setInstrumento("Batería");
        integrante2560.setNombre("Matt Helders");

        IntegranteDoc integrante2570 = new IntegranteDoc();
        integrante2570.setEsActivo(true);
        integrante2570.setFechaIngreso(LocalDate.of(2002, 1, 1));
        integrante2570.setInstrumento("Guitarra");
        integrante2570.setNombre("Jamie Cook");

// Banda Arctic Monkeys
        ArtistaColeccion banda82 = new ArtistaColeccion();
        banda82.setEsBanda(true);
        banda82.setGeneros(Arrays.asList(alternativo, rock));
        banda82.setImagen("/artistas/ArcticMonkeys.jpg");
        banda82.setIntegrante(Arrays.asList(integrante2540, integrante2550, integrante2560, integrante2570));
        banda82.setNombre("Arctic Monkeys");

// Integrantes de The Killers
        IntegranteDoc integrante2580 = new IntegranteDoc();
        integrante2580.setEsActivo(true);
        integrante2580.setFechaIngreso(LocalDate.of(2001, 1, 1));
        integrante2580.setInstrumento("Voz, Teclado");
        integrante2580.setNombre("Brandon Flowers");

        IntegranteDoc integrante2590 = new IntegranteDoc();
        integrante2590.setEsActivo(true);
        integrante2590.setFechaIngreso(LocalDate.of(2001, 1, 1));
        integrante2590.setInstrumento("Guitarra");
        integrante2590.setNombre("Dave Keuning");

        IntegranteDoc integrante2600 = new IntegranteDoc();
        integrante2600.setEsActivo(true);
        integrante2600.setFechaIngreso(LocalDate.of(2001, 1, 1));
        integrante2600.setInstrumento("Bajo");
        integrante2600.setNombre("Mark Stoermer");

        IntegranteDoc integrante2610 = new IntegranteDoc();
        integrante2610.setEsActivo(true);
        integrante2610.setFechaIngreso(LocalDate.of(2001, 1, 1));
        integrante2610.setInstrumento("Batería");
        integrante2610.setNombre("Ronnie Vannucci Jr.");

// Banda The Killers
        ArtistaColeccion banda83 = new ArtistaColeccion();
        banda83.setEsBanda(true);
        banda83.setGeneros(Arrays.asList(alternativo, rock));
        banda83.setImagen("/artistas/TheKillers.jpg");
        banda83.setIntegrante(Arrays.asList(integrante2580, integrante2590, integrante2600, integrante2610));
        banda83.setNombre("The Killers");

// Insertar bandas
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

        MongoCollection<AlbumColeccion> albumCollection = database.getCollection("Albumes", AlbumColeccion.class);

    }

}
