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
import InterfacesDAO.IDatosPruebaDAO;
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
public class DatosPruebaDAO implements IDatosPruebaDAO {

    private final MongoDatabase database;

    public DatosPruebaDAO(IConexionDB conexionDB) {
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

        // Álbum de Led Zeppelin
        AlbumColeccion album3 = new AlbumColeccion();
        album3.setNombre("Led Zeppelin IV");
        album3.setImagen("/albumes/LedZeppelinIV.jpg");
        album3.setFechaLanzamiento(LocalDate.of(1971, 11, 8));
        album3.setCanciones(Arrays.asList(
                new CancionDoc("Black Dog"),
                new CancionDoc("Rock and Roll"),
                new CancionDoc("The Battle of Evermore"),
                new CancionDoc("Stairway to Heaven"),
                new CancionDoc("Misty Mountain Hop"),
                new CancionDoc("When the Levee Breaks")
        ));
        album3.setArtista(banda2);
// Álbum de Led Zeppelin
        AlbumColeccion album4 = new AlbumColeccion();
        album4.setNombre("Physical Graffiti");
        album4.setImagen("/albumes/PhysicalGraffiti.jpg");
        album4.setFechaLanzamiento(LocalDate.of(1975, 2, 24));
        album4.setCanciones(Arrays.asList(
                new CancionDoc("Custard Pie"),
                new CancionDoc("The Rover"),
                new CancionDoc("Kashmir"),
                new CancionDoc("In the Light"),
                new CancionDoc("Ten Years Gone"),
                new CancionDoc("Trampled Under Foot")
        ));
        album4.setArtista(banda2);

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

        // Álbum de Queen
        AlbumColeccion album5 = new AlbumColeccion();
        album5.setNombre("A Night at the Opera");
        album5.setImagen("/albumes/ANightAtTheOpera.jpg");
        album5.setFechaLanzamiento(LocalDate.of(1975, 11, 21));
        album5.setCanciones(Arrays.asList(
                new CancionDoc("Death on Two Legs"),
                new CancionDoc("You're My Best Friend"),
                new CancionDoc("Love of My Life"),
                new CancionDoc("Bohemian Rhapsody"),
                new CancionDoc("The Prophet's Song"),
                new CancionDoc("God Save the Queen")
        ));
        album5.setArtista(banda3);
// Álbum de Queen
        AlbumColeccion album6 = new AlbumColeccion();
        album6.setNombre("The Game");
        album6.setImagen("/albumes/TheGame.jpg");
        album6.setFechaLanzamiento(LocalDate.of(1980, 6, 30));
        album6.setCanciones(Arrays.asList(
                new CancionDoc("Play the Game"),
                new CancionDoc("Another One Bites the Dust"),
                new CancionDoc("Crazy Little Thing Called Love"),
                new CancionDoc("Save Me"),
                new CancionDoc("Need Your Loving Tonight"),
                new CancionDoc("Rock It (Prime Jive)")
        ));
        album6.setArtista(banda3);

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
// Álbum de The Rolling Stones
        AlbumColeccion album7 = new AlbumColeccion();
        album7.setNombre("Sticky Fingers");
        album7.setImagen("/albumes/StickyFingers.jpg");
        album7.setFechaLanzamiento(LocalDate.of(1971, 4, 23));
        album7.setCanciones(Arrays.asList(
                new CancionDoc("Brown Sugar"),
                new CancionDoc("Wild Horses"),
                new CancionDoc("Can't You Hear Me Knocking"),
                new CancionDoc("Dead Flowers"),
                new CancionDoc("Moonlight Mile")
        ));
        album7.setArtista(banda4);
// Álbum de The Rolling Stones
        AlbumColeccion album8 = new AlbumColeccion();
        album8.setNombre("Exile on Main St.");
        album8.setImagen("/albumes/ExileOnMainSt.jpg");
        album8.setFechaLanzamiento(LocalDate.of(1972, 5, 12));
        album8.setCanciones(Arrays.asList(
                new CancionDoc("Rocks Off"),
                new CancionDoc("Rip This Joint"),
                new CancionDoc("Tumbling Dice"),
                new CancionDoc("Happy"),
                new CancionDoc("Sweet Virginia"),
                new CancionDoc("Shine a Light")
        ));
        album8.setArtista(banda4);

// Gorillaz
        IntegranteDoc integrante18 = new IntegranteDoc();
        integrante18.setEsActivo(true);
        integrante18.setFechaIngreso(LocalDate.of(1998, 1, 1));
        integrante18.setInstrumento("Voz y Teclado");
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
        integrante21.setInstrumento(" Guitarra");
        integrante21.setNombre("Noodle");

// Gorillaz Band
        ArtistaColeccion banda5 = new ArtistaColeccion();
        banda5.setEsBanda(true);
        banda5.setGeneros(Arrays.asList(rock, hiphop, electronica));
        banda5.setImagen("/artistas/Gorillaz.jpg");
        banda5.setIntegrante(Arrays.asList(integrante18, integrante19, integrante20, integrante21));
        banda5.setNombre("Gorillaz");

        // Álbum de Gorillaz
        AlbumColeccion album9 = new AlbumColeccion();
        album9.setNombre("Demon Days");
        album9.setImagen("/albumes/DemonDays.jpg");
        album9.setFechaLanzamiento(LocalDate.of(2005, 5, 11));
        album9.setCanciones(Arrays.asList(
                new CancionDoc("Feel Good Inc."),
                new CancionDoc("DARE"),
                new CancionDoc("Dirty Harry"),
                new CancionDoc("El Mañana"),
                new CancionDoc("Kids with Guns"),
                new CancionDoc("Fire Coming Out of the Monkey's Head")
        ));
        album9.setArtista(banda5);
// Álbum de Gorillaz
        AlbumColeccion album10 = new AlbumColeccion();
        album10.setNombre("Plastic Beach");
        album10.setImagen("/albumes/PlasticBeach.jpg");
        album10.setFechaLanzamiento(LocalDate.of(2010, 3, 3));
        album10.setCanciones(Arrays.asList(
                new CancionDoc("On Melancholy Hill"),
                new CancionDoc("Stylo"),
                new CancionDoc("Empire Ants"),
                new CancionDoc("Rhinestone Eyes"),
                new CancionDoc("Superfast Jellyfish"),
                new CancionDoc("Plastic Beach")
        ));
        album10.setArtista(banda5);

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

        // Álbum de Herbie Hancock's Headhunters
        AlbumColeccion album11 = new AlbumColeccion();
        album11.setNombre("Head Hunters");
        album11.setImagen("/albumes/HeadHunters.jpg");
        album11.setFechaLanzamiento(LocalDate.of(1973, 10, 13));
        album11.setCanciones(Arrays.asList(
                new CancionDoc("Chameleon"),
                new CancionDoc("Watermelon Man"),
                new CancionDoc("Sly"),
                new CancionDoc("Vein Melter")
        ));
        album11.setArtista(banda6);

        // Álbum de Herbie Hancock's Headhunters
        AlbumColeccion album12 = new AlbumColeccion();
        album12.setNombre("Thrust");
        album12.setImagen("/albumes/Thrust.jpg");
        album12.setFechaLanzamiento(LocalDate.of(1974, 8, 26));
        album12.setCanciones(Arrays.asList(
                new CancionDoc("Palm Grease"),
                new CancionDoc("Actual Proof"),
                new CancionDoc("Butterfly"),
                new CancionDoc("Spank-A-Lee")
        ));
        album12.setArtista(banda6);

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

        // Álbum de Sun Ra Arkestra
        AlbumColeccion album13 = new AlbumColeccion();
        album13.setNombre("Space Is the Place");
        album13.setImagen("/albumes/SpaceIsThePlace.jpg");
        album13.setFechaLanzamiento(LocalDate.of(1973, 11, 1));
        album13.setCanciones(Arrays.asList(
                new CancionDoc("Space Is the Place"),
                new CancionDoc("Images"),
                new CancionDoc("Discipline 33"),
                new CancionDoc("Sea of Sound"),
                new CancionDoc("Rocket Number Nine")
        ));
        album13.setArtista(banda8);

// Álbum de Sun Ra Arkestra
        AlbumColeccion album14 = new AlbumColeccion();
        album14.setNombre("The Magic City");
        album14.setImagen("/albumes/TheMagicCity.jpg");
        album14.setFechaLanzamiento(LocalDate.of(1965, 8, 1));
        album14.setCanciones(Arrays.asList(
                new CancionDoc("The Magic City"),
                new CancionDoc("The Shadow World"),
                new CancionDoc("Abstract Eye"),
                new CancionDoc("Abstract I")
        ));
        album14.setArtista(banda8);

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

        // Álbum de Dizzy Gillespie Big Band
        AlbumColeccion album15 = new AlbumColeccion();
        album15.setNombre("Afro");
        album15.setImagen("/albumes/Afro.jpg");
        album15.setFechaLanzamiento(LocalDate.of(1954, 6, 1));
        album15.setCanciones(Arrays.asList(
                new CancionDoc("Manteca Theme"),
                new CancionDoc("Contraste"),
                new CancionDoc("A Night in Tunisia"),
                new CancionDoc("Guarachi Guaro")
        ));
        album15.setArtista(banda9);

// Álbum de Dizzy Gillespie Big Band
        AlbumColeccion album16 = new AlbumColeccion();
        album16.setNombre("World Statesman");
        album16.setImagen("/albumes/WorldStatesman.jpg");
        album16.setFechaLanzamiento(LocalDate.of(1956, 3, 1));
        album16.setCanciones(Arrays.asList(
                new CancionDoc("Dizzy's Business"),
                new CancionDoc("Stablemates"),
                new CancionDoc("I Remember Clifford"),
                new CancionDoc("Cool Breeze"),
                new CancionDoc("School Days")
        ));
        album16.setArtista(banda9);

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

        // Álbum de Cannonball Adderley Quintet
        AlbumColeccion album17 = new AlbumColeccion();
        album17.setNombre("Somethin' Else");
        album17.setImagen("/albumes/SomethinElse.jpg");
        album17.setFechaLanzamiento(LocalDate.of(1958, 8, 9));
        album17.setCanciones(Arrays.asList(
                new CancionDoc("Autumn Leaves"),
                new CancionDoc("Love for Sale"),
                new CancionDoc("Somethin' Else"),
                new CancionDoc("One for Daddy-O"),
                new CancionDoc("Dancing in the Dark")
        ));
        album17.setArtista(banda10);

        // Álbum de Cannonball Adderley Quintet
        AlbumColeccion album18 = new AlbumColeccion();
        album18.setNombre("Mercy, Mercy, Mercy!");
        album18.setImagen("/albumes/MercyMercyMercy.jpg");
        album18.setFechaLanzamiento(LocalDate.of(1966, 10, 20));
        album18.setCanciones(Arrays.asList(
                new CancionDoc("Fun"),
                new CancionDoc("Games"),
                new CancionDoc("Mercy, Mercy, Mercy"),
                new CancionDoc("Sticks"),
                new CancionDoc("Hippodelphia")
        ));
        album18.setArtista(banda10);

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

        // Álbum de Maroon 5
        AlbumColeccion album19 = new AlbumColeccion();
        album19.setNombre("Songs About Jane");
        album19.setImagen("/albumes/SongsAboutJane.jpg");
        album19.setFechaLanzamiento(LocalDate.of(2002, 6, 25));
        album19.setCanciones(Arrays.asList(
                new CancionDoc("Harder to Breathe"),
                new CancionDoc("This Love"),
                new CancionDoc("She Will Be Loved"),
                new CancionDoc("Sunday Morning"),
                new CancionDoc("Must Get Out")
        ));
        album19.setArtista(banda11);

// Álbum de Maroon 5
        AlbumColeccion album20 = new AlbumColeccion();
        album20.setNombre("It Won't Be Soon Before Long");
        album20.setImagen("/albumes/ItWontBeSoonBeforeLong.jpg");
        album20.setFechaLanzamiento(LocalDate.of(2007, 5, 16));
        album20.setCanciones(Arrays.asList(
                new CancionDoc("If I Never See Your Face Again"),
                new CancionDoc("Makes Me Wonder"),
                new CancionDoc("Wake Up Call"),
                new CancionDoc("Won't Go Home Without You"),
                new CancionDoc("Goodnight Goodnight")
        ));
        album20.setArtista(banda11);

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

        // Álbum de One Direction
        AlbumColeccion album21 = new AlbumColeccion();
        album21.setNombre("Up All Night");
        album21.setImagen("/albumes/UpAllNight.jpg");
        album21.setFechaLanzamiento(LocalDate.of(2011, 11, 18));
        album21.setCanciones(Arrays.asList(
                new CancionDoc("What Makes You Beautiful"),
                new CancionDoc("Gotta Be You"),
                new CancionDoc("One Thing"),
                new CancionDoc("Up All Night"),
                new CancionDoc("More Than This")
        ));
        album21.setArtista(banda12);

        // Álbum de One Direction
        AlbumColeccion album22 = new AlbumColeccion();
        album22.setNombre("Take Me Home");
        album22.setImagen("/albumes/TakeMeHome.jpg");
        album22.setFechaLanzamiento(LocalDate.of(2012, 11, 9));
        album22.setCanciones(Arrays.asList(
                new CancionDoc("Live While We're Young"),
                new CancionDoc("Little Things"),
                new CancionDoc("Kiss You"),
                new CancionDoc("Last First Kiss"),
                new CancionDoc("Heart Attack")
        ));
        album22.setArtista(banda12);

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

        AlbumColeccion album210 = new AlbumColeccion();
        album21.setNombre("Backstreet's Back");
        album21.setImagen("/albumes/BackstreetsBack.jpg");
        album21.setFechaLanzamiento(LocalDate.of(1997, 8, 11));
        album21.setCanciones(Arrays.asList(
                new CancionDoc("Everybody (Backstreet's Back)"),
                new CancionDoc("As Long As You Love Me"),
                new CancionDoc("All I Have To Give"),
                new CancionDoc("I'll Never Break Your Heart")
        ));
        album21.setArtista(banda13);  // Usa el objeto de la banda Backstreet Boys en la variable 'artista'

        AlbumColeccion album220 = new AlbumColeccion();
        album22.setNombre("Millennium");
        album22.setImagen("/albumes/Millennium.jpg");
        album22.setFechaLanzamiento(LocalDate.of(1999, 5, 18));
        album22.setCanciones(Arrays.asList(
                new CancionDoc("I Want It That Way"),
                new CancionDoc("Larger Than Life"),
                new CancionDoc("Show Me The Meaning Of Being Lonely"),
                new CancionDoc("The One")
        ));
        album22.setArtista(banda13);  // Usa el objeto de la banda Backstreet Boys en la variable 'artista'

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

        // Álbum de OneRepublic
        AlbumColeccion album23 = new AlbumColeccion();
        album23.setNombre("Dreaming Out Loud");
        album23.setImagen("/albumes/DreamingOutLoud.jpg");
        album23.setFechaLanzamiento(LocalDate.of(2007, 11, 20));
        album23.setCanciones(Arrays.asList(
                new CancionDoc("Apologize"),
                new CancionDoc("Stop and Stare"),
                new CancionDoc("Say (All I Need)"),
                new CancionDoc("All Fall Down"),
                new CancionDoc("Mercy")
        ));
        album23.setArtista(banda14);

// Álbum de OneRepublic
        AlbumColeccion album24 = new AlbumColeccion();
        album24.setNombre("Waking Up");
        album24.setImagen("/albumes/WakingUp.jpg");
        album24.setFechaLanzamiento(LocalDate.of(2009, 11, 17));
        album24.setCanciones(Arrays.asList(
                new CancionDoc("All the Right Moves"),
                new CancionDoc("Secrets"),
                new CancionDoc("Good Life"),
                new CancionDoc("Marchin On"),
                new CancionDoc("Fear")
        ));
        album24.setArtista(banda14);

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

        AlbumColeccion album25 = new AlbumColeccion();
        album25.setNombre("Parachutes");
        album25.setImagen("/albumes/Parachutes.jpg");
        album25.setFechaLanzamiento(LocalDate.of(2000, 7, 10));
        album25.setCanciones(Arrays.asList(
                new CancionDoc("Yellow"),
                new CancionDoc("Shiver"),
                new CancionDoc("Trouble"),
                new CancionDoc("Don't Panic")
        ));
        album25.setArtista(banda15);  // Usa el objeto de la banda Coldplay en la variable 'artista'

        AlbumColeccion album26 = new AlbumColeccion();
        album26.setNombre("A Rush of Blood to the Head");
        album26.setImagen("/albumes/ARushOfBloodToTheHead.jpg");
        album26.setFechaLanzamiento(LocalDate.of(2002, 8, 26));
        album26.setCanciones(Arrays.asList(
                new CancionDoc("Clocks"),
                new CancionDoc("The Scientist"),
                new CancionDoc("In My Place"),
                new CancionDoc("God Put a Smile Upon Your Face")
        ));
        album26.setArtista(banda15);  // Usa el objeto de la banda Coldplay en la variable 'artista'

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

        AlbumColeccion album27 = new AlbumColeccion();
        album26.setNombre("Catch a Fire");
        album26.setImagen("/albumes/CatchAFire.jpg");
        album26.setFechaLanzamiento(LocalDate.of(1973, 4, 13));
        album26.setCanciones(Arrays.asList(
                new CancionDoc("Concrete Jungle"),
                new CancionDoc("Slave Driver"),
                new CancionDoc("Catch a Fire"),
                new CancionDoc("Stir It Up")
        ));
        album26.setArtista(banda16);  // Usa el objeto de la banda Bob Marley & The Wailers en la variable 'artista'

        AlbumColeccion album28 = new AlbumColeccion();
        album27.setNombre("Legend");
        album27.setImagen("/albumes/Legend.jpg");
        album27.setFechaLanzamiento(LocalDate.of(1984, 5, 8));
        album27.setCanciones(Arrays.asList(
                new CancionDoc("No Woman, No Cry"),
                new CancionDoc("Buffalo Soldier"),
                new CancionDoc("One Love"),
                new CancionDoc("Redemption Song")
        ));
        album27.setArtista(banda16);  // Usa el objeto de la banda Bob Marley & The Wailers en la variable 'artista'

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

        AlbumColeccion album29 = new AlbumColeccion();
        album29.setNombre("Funky Kingston");
        album29.setImagen("/albumes/FunkyKingston.jpg");
        album29.setFechaLanzamiento(LocalDate.of(1973, 2, 1));
        album29.setCanciones(Arrays.asList(
                new CancionDoc("Time Tough"),
                new CancionDoc("Funky Kingston"),
                new CancionDoc("In The Dark"),
                new CancionDoc("God, Let Me Live"),
                new CancionDoc("Pressure Drop")
        ));
        album29.setArtista(banda17); // Artista previamente creado para Toots and the Maytals

        AlbumColeccion album30 = new AlbumColeccion();
        album30.setNombre("Reggae Got Soul");
        album30.setImagen("/albumes/ReggaeGotSoul.jpg");
        album30.setFechaLanzamiento(LocalDate.of(1976, 1, 1));
        album30.setCanciones(Arrays.asList(
                new CancionDoc("Reggae Got Soul"),
                new CancionDoc("Take Me Home, Country Roads"),
                new CancionDoc("57 Channels (And Nothin' On)"),
                new CancionDoc("Never You Change"),
                new CancionDoc("Mop Up Woman")
        ));
        album30.setArtista(banda17); // Artista previamente creado para Toots and the Maytals

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

        AlbumColeccion album31 = new AlbumColeccion();
        album31.setNombre("Red");
        album31.setImagen("/albumes/Red.jpg");
        album31.setFechaLanzamiento(LocalDate.of(1981, 9, 1));
        album31.setCanciones(Arrays.asList(
                new CancionDoc("Sponji Reggae"),
                new CancionDoc("Guess Who's Coming to Dinner"),
                new CancionDoc("Satta Massagana"),
                new CancionDoc("I See You"),
                new CancionDoc("Abortion")
        ));
        album31.setArtista(banda18); // Artista previamente creado para Black Uhuru

        AlbumColeccion album32 = new AlbumColeccion();
        album32.setNombre("Chill Out");
        album32.setImagen("/albumes/ChillOut.jpg");
        album32.setFechaLanzamiento(LocalDate.of(1982, 5, 1));
        album32.setCanciones(Arrays.asList(
                new CancionDoc("Chill Out"),
                new CancionDoc("The Great Train Robbery"),
                new CancionDoc("I See You"),
                new CancionDoc("One Love"),
                new CancionDoc("World is Africa")
        ));
        album32.setArtista(banda18); // Artista previamente creado para Black Uhuru

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

        AlbumColeccion album33 = new AlbumColeccion();
        album33.setNombre("Handsworth Revolution");
        album33.setImagen("/albumes/HandsworthRevolution.jpg");
        album33.setFechaLanzamiento(LocalDate.of(1978, 9, 1));
        album33.setCanciones(Arrays.asList(
                new CancionDoc("Handsworth Revolution"),
                new CancionDoc("Ku Klux Klan"),
                new CancionDoc("Macka Splaff"),
                new CancionDoc("Your House"),
                new CancionDoc("The Prisoner")
        ));
        album33.setArtista(banda19); // Artista previamente creado para Steel Pulse

        AlbumColeccion album34 = new AlbumColeccion();
        album34.setNombre("True Democracy");
        album34.setImagen("/albumes/TrueDemocracy.jpg");
        album34.setFechaLanzamiento(LocalDate.of(1982, 4, 1));
        album34.setCanciones(Arrays.asList(
                new CancionDoc("True Democracy"),
                new CancionDoc("Ravers"),
                new CancionDoc("Your House"),
                new CancionDoc("Blues Dance Raid"),
                new CancionDoc("Prodigal Son")
        ));
        album34.setArtista(banda19); // Artista previamente creado para Steel Pulse

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

        AlbumColeccion album35 = new AlbumColeccion();
        album35.setNombre("Bad Boys");
        album35.setImagen("/albumes/BadBoys.jpg");
        album35.setFechaLanzamiento(LocalDate.of(1987, 1, 1));
        album35.setCanciones(Arrays.asList(
                new CancionDoc("Bad Boys"),
                new CancionDoc("Sweat (A La La La La Long)"),
                new CancionDoc("I'm a Rastaman"),
                new CancionDoc("Li'l Bit of Love"),
                new CancionDoc("Ain't No Giving In")
        ));
        album35.setArtista(banda20); // Artista previamente creado para Inner Circle

        AlbumColeccion album36 = new AlbumColeccion();
        album36.setNombre("Ready for the World");
        album36.setImagen("/albumes/ReadyForTheWorld.jpg");
        album36.setFechaLanzamiento(LocalDate.of(1992, 5, 5));
        album36.setCanciones(Arrays.asList(
                new CancionDoc("Ready for the World"),
                new CancionDoc("We Can Make It"),
                new CancionDoc("Who Knows"),
                new CancionDoc("Pretty Looks"),
                new CancionDoc("Can't Stop")
        ));
        album36.setArtista(banda20); // Artista previamente creado para Inner Circle

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

        AlbumColeccion album37 = new AlbumColeccion();
        album37.setNombre("Live at the Regal");
        album37.setImagen("/albumes/LiveAtTheRegal.jpg");
        album37.setFechaLanzamiento(LocalDate.of(1965, 12, 1));
        album37.setCanciones(Arrays.asList(
                new CancionDoc("Every Day I Have the Blues"),
                new CancionDoc("How Blue Can You Get"),
                new CancionDoc("It's My Own Fault"),
                new CancionDoc("Don't Answer the Door"),
                new CancionDoc("Sweet Little Angel")
        ));
        album37.setArtista(banda21); // Artista previamente creado para B.B. King and the Blues Boys

        AlbumColeccion album38 = new AlbumColeccion();
        album38.setNombre("Completely Well");
        album38.setImagen("/albumes/CompletelyWell.jpg");
        album38.setFechaLanzamiento(LocalDate.of(1969, 9, 1));
        album38.setCanciones(Arrays.asList(
                new CancionDoc("The Thrill Is Gone"),
                new CancionDoc("Cryin' Won't Help You"),
                new CancionDoc("Reaching for the Moon"),
                new CancionDoc("So Excited"),
                new CancionDoc("Confessin' the Blues")
        ));
        album38.setArtista(banda21); // Artista previamente creado para B.B. King and the Blues Boys

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

        AlbumColeccion album39 = new AlbumColeccion();
        album39.setNombre("Live at the Cafe au Go Go");
        album39.setImagen("/albumes/LiveAtTheCafeAuGoGo.jpg");
        album39.setFechaLanzamiento(LocalDate.of(1966, 1, 1));
        album39.setCanciones(Arrays.asList(
                new CancionDoc("Boom Boom"),
                new CancionDoc("I'm So Excited"),
                new CancionDoc("One Bourbon, One Scotch, One Beer"),
                new CancionDoc("Little Wheel"),
                new CancionDoc("How Long Blues")
        ));
        album39.setArtista(banda24); // Artista previamente creado para John Lee Hooker and the Coast to Coast Blues Band

        AlbumColeccion album40 = new AlbumColeccion();
        album40.setNombre("The Healer");
        album40.setImagen("/albumes/TheHealer.jpg");
        album40.setFechaLanzamiento(LocalDate.of(1989, 9, 19));
        album40.setCanciones(Arrays.asList(
                new CancionDoc("I'm in the Mood"),
                new CancionDoc("The Healer"),
                new CancionDoc("Cuttin' Out"),
                new CancionDoc("It Serves You Right to Suffer"),
                new CancionDoc("Rockin' Chair")
        ));
        album40.setArtista(banda24); // Artista previamente creado para John Lee Hooker and the Coast to Coast Blues Band

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

        AlbumColeccion album43 = new AlbumColeccion();
        album43.setNombre("Having a Rave Up with The Yardbirds");
        album43.setImagen("/albumes/HavingARaveUp.jpg");
        album43.setFechaLanzamiento(LocalDate.of(1965, 11, 15));
        album43.setCanciones(Arrays.asList(
                new CancionDoc("Heart Full of Soul"),
                new CancionDoc("I'm a Man"),
                new CancionDoc("The Train Kept A-Rollin'"),
                new CancionDoc("Still I'm Sad"),
                new CancionDoc("Evil Hearted You")
        ));
        album43.setArtista(banda25); // Artista previamente creado para The Yardbirds

        AlbumColeccion album44 = new AlbumColeccion();
        album44.setNombre("The Yardbirds (Greatest Hits)");
        album44.setImagen("/albumes/YardbirdsGreatestHits.jpg");
        album44.setFechaLanzamiento(LocalDate.of(1970, 5, 1));
        album44.setCanciones(Arrays.asList(
                new CancionDoc("For Your Love"),
                new CancionDoc("Over Under Sideways Down"),
                new CancionDoc("Shapes of Things"),
                new CancionDoc("I’m a Man"),
                new CancionDoc("Little Games")
        ));
        album44.setArtista(banda25); // Artista previamente creado para The Yardbirds

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

        AlbumColeccion album41 = new AlbumColeccion();
        album41.setNombre("The Highwaymen");
        album41.setImagen("/albumes/TheHighwaymen.jpg");
        album41.setFechaLanzamiento(LocalDate.of(1985, 3, 1));
        album41.setCanciones(Arrays.asList(
                new CancionDoc("Highwayman"),
                new CancionDoc("The Last Cowboy Song"),
                new CancionDoc("Desperados Waiting for a Train"),
                new CancionDoc("Jim, I Wore a Tie Today"),
                new CancionDoc("Big River")
        ));
        album41.setArtista(banda26); // Artista previamente creado para The Highwaymen

        AlbumColeccion album42 = new AlbumColeccion();
        album42.setNombre("Highwaymen 2");
        album42.setImagen("/albumes/Highwaymen2.jpg");
        album42.setFechaLanzamiento(LocalDate.of(1990, 9, 25));
        album42.setCanciones(Arrays.asList(
                new CancionDoc("Silver Stallion"),
                new CancionDoc("The King of Broken Hearts"),
                new CancionDoc("It Is What It Is"),
                new CancionDoc("Anthem '84"),
                new CancionDoc("Prisoner")
        ));
        album42.setArtista(banda26); // Artista previamente creado para The Highwaymen

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

        AlbumColeccion album45 = new AlbumColeccion();
        album45.setNombre("Wide Open Spaces");
        album45.setImagen("/albumes/WideOpenSpaces.jpg");
        album45.setFechaLanzamiento(LocalDate.of(1998, 1, 27));
        album45.setCanciones(Arrays.asList(
                new CancionDoc("I Can Love You Better"),
                new CancionDoc("Wide Open Spaces"),
                new CancionDoc("Landslide"),
                new CancionDoc("There's Your Trouble"),
                new CancionDoc("You Were Mine")
        ));
        album45.setArtista(banda27); // Artista previamente creado para The Dixie Chicks

        AlbumColeccion album46 = new AlbumColeccion();
        album46.setNombre("Home");
        album46.setImagen("/albumes/Home.jpg");
        album46.setFechaLanzamiento(LocalDate.of(2002, 8, 27));
        album46.setCanciones(Arrays.asList(
                new CancionDoc("Long Time Gone"),
                new CancionDoc("Travelin' Soldier"),
                new CancionDoc("Godspeed (Sweet Dreams)"),
                new CancionDoc("More Love"),
                new CancionDoc("White Trash Wedding")
        ));
        album46.setArtista(banda27); // Artista previamente creado para The Dixie Chicks

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

        AlbumColeccion album47 = new AlbumColeccion();
        album47.setNombre("Mountain Music");
        album47.setImagen("/albumes/MountainMusic.jpg");
        album47.setFechaLanzamiento(LocalDate.of(1982, 4, 1));
        album47.setCanciones(Arrays.asList(
                new CancionDoc("Mountain Music"),
                new CancionDoc("Close Enough to Perfect"),
                new CancionDoc("Take Me Down"),
                new CancionDoc("The Borderline"),
                new CancionDoc("We Can't Love Like This Anymore")
        ));
        album47.setArtista(banda28); // Artista previamente creado para Alabama

        AlbumColeccion album48 = new AlbumColeccion();
        album48.setNombre("The Closer You Get");
        album48.setImagen("/albumes/TheCloserYouGet.jpg");
        album48.setFechaLanzamiento(LocalDate.of(1983, 9, 1));
        album48.setCanciones(Arrays.asList(
                new CancionDoc("The Closer You Get"),
                new CancionDoc("Lady Down on Love"),
                new CancionDoc("Dixieland Delight"),
                new CancionDoc("If You're Gonna Play in Texas (You Gotta Have a Fiddle in the Band)"),
                new CancionDoc("Gonna Have a Party")
        ));
        album48.setArtista(banda28); // Artista previamente creado para Alabama

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

        AlbumColeccion album49 = new AlbumColeccion();
        album49.setNombre("Brand New Man");
        album49.setImagen("/albumes/BrandNewMan.jpg");
        album49.setFechaLanzamiento(LocalDate.of(1991, 4, 23));
        album49.setCanciones(Arrays.asList(
                new CancionDoc("Brand New Man"),
                new CancionDoc("My Next Broken Heart"),
                new CancionDoc("Neon Moon"),
                new CancionDoc("Lost and Found"),
                new CancionDoc("And Then Some")
        ));
        album49.setArtista(banda29); // Artista previamente creado para Brooks & Dunn

        AlbumColeccion album50 = new AlbumColeccion();
        album50.setNombre("Waitin' on Sundown");
        album50.setImagen("/albumes/WaitinonSundown.jpg");
        album50.setFechaLanzamiento(LocalDate.of(1994, 9, 13));
        album50.setCanciones(Arrays.asList(
                new CancionDoc("Neon Moon"),
                new CancionDoc("Boot Scootin' Boogie"),
                new CancionDoc("You're Gonna Miss Me When I'm Gone"),
                new CancionDoc("She Used to Be Mine"),
                new CancionDoc("That Ain't No Way to Go")
        ));
        album50.setArtista(banda29); // Artista previamente creado para Brooks & Dunn

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

        AlbumColeccion album51 = new AlbumColeccion();
        album51.setNombre("The Foundation");
        album51.setImagen("/albumes/TheFoundation.jpg");
        album51.setFechaLanzamiento(LocalDate.of(2008, 11, 18));
        album51.setCanciones(Arrays.asList(
                new CancionDoc("Chicken Fried"),
                new CancionDoc("Toes"),
                new CancionDoc("Whatever It Is"),
                new CancionDoc("Where the Boat Leaves From"),
                new CancionDoc("Free")
        ));
        album51.setArtista(banda30); // Artista previamente creado para Zac Brown Band

        AlbumColeccion album52 = new AlbumColeccion();
        album52.setNombre("You Get What You Give");
        album52.setImagen("/albumes/YouGetWhatYouGive.jpg");
        album52.setFechaLanzamiento(LocalDate.of(2010, 9, 21));
        album52.setCanciones(Arrays.asList(
                new CancionDoc("Colder Weather"),
                new CancionDoc("As She's Walking Away"),
                new CancionDoc("Knee Deep"),
                new CancionDoc("Whiskey's Gone"),
                new CancionDoc("Let It Go")
        ));
        album52.setArtista(banda30); // Artista previamente creado para Zac Brown Band

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

        AlbumColeccion album53 = new AlbumColeccion();
        album53.setNombre("Metallica (The Black Album)");
        album53.setImagen("/albumes/MetallicaBlackAlbum.jpg");
        album53.setFechaLanzamiento(LocalDate.of(1991, 8, 12));
        album53.setCanciones(Arrays.asList(
                new CancionDoc("Enter Sandman"),
                new CancionDoc("The Unforgiven"),
                new CancionDoc("Wherever I May Roam"),
                new CancionDoc("Sad But True"),
                new CancionDoc("Nothing Else Matters")
        ));
        album53.setArtista(banda31); // Artista previamente creado para Metallica

        AlbumColeccion album54 = new AlbumColeccion();
        album54.setNombre("Master of Puppets");
        album54.setImagen("/albumes/MasterOfPuppets.jpg");
        album54.setFechaLanzamiento(LocalDate.of(1986, 3, 3));
        album54.setCanciones(Arrays.asList(
                new CancionDoc("Battery"),
                new CancionDoc("Master of Puppets"),
                new CancionDoc("Welcome Home (Sanitarium)"),
                new CancionDoc("Disposable Heroes"),
                new CancionDoc("Orion")
        ));
        album54.setArtista(banda31); // Artista previamente creado para Metallica

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

        AlbumColeccion album55 = new AlbumColeccion();
        album55.setNombre("The Number of the Beast");
        album55.setImagen("/albumes/TheNumberOfTheBeast.jpg");
        album55.setFechaLanzamiento(LocalDate.of(1982, 3, 22));
        album55.setCanciones(Arrays.asList(
                new CancionDoc("Invaders"),
                new CancionDoc("Children of the Damned"),
                new CancionDoc("The Number of the Beast"),
                new CancionDoc("Run to the Hills"),
                new CancionDoc("Hallowed Be Thy Name")
        ));
        album55.setArtista(banda32); // Artista previamente creado para Iron Maiden

        AlbumColeccion album56 = new AlbumColeccion();
        album56.setNombre("Powerslave");
        album56.setImagen("/albumes/Powerslave.jpg");
        album56.setFechaLanzamiento(LocalDate.of(1984, 9, 3));
        album56.setCanciones(Arrays.asList(
                new CancionDoc("Aces High"),
                new CancionDoc("2 Minutes to Midnight"),
                new CancionDoc("Losfer Words (Big 'Orra)"),
                new CancionDoc("Flash of the Blade"),
                new CancionDoc("Powerslave")
        ));
        album56.setArtista(banda32); // Artista previamente creado para Iron Maiden

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

        AlbumColeccion album57 = new AlbumColeccion();
        album57.setNombre("British Steel");
        album57.setImagen("/albumes/BritishSteel.jpg");
        album57.setFechaLanzamiento(LocalDate.of(1980, 4, 14));
        album57.setCanciones(Arrays.asList(
                new CancionDoc("Rapid Fire"),
                new CancionDoc("Metal Gods"),
                new CancionDoc("Breaking the Law"),
                new CancionDoc("Grinder"),
                new CancionDoc("Living After Midnight")
        ));
        album57.setArtista(banda33); // Artista previamente creado para Judas Priest

        AlbumColeccion album58 = new AlbumColeccion();
        album58.setNombre("Screaming for Vengeance");
        album58.setImagen("/albumes/ScreamingForVengeance.jpg");
        album58.setFechaLanzamiento(LocalDate.of(1982, 7, 17));
        album58.setCanciones(Arrays.asList(
                new CancionDoc("The Hellion"),
                new CancionDoc("Electric Eye"),
                new CancionDoc("Riding on the Wind"),
                new CancionDoc("Bloodstone"),
                new CancionDoc("Screaming for Vengeance")
        ));
        album58.setArtista(banda33); // Artista previamente creado para Judas Priest

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

        AlbumColeccion album59 = new AlbumColeccion();
        album59.setNombre("Paranoid");
        album59.setImagen("/albumes/Paranoid.jpg");
        album59.setFechaLanzamiento(LocalDate.of(1970, 9, 18));
        album59.setCanciones(Arrays.asList(
                new CancionDoc("War Pigs"),
                new CancionDoc("Paranoid"),
                new CancionDoc("Iron Man"),
                new CancionDoc("Hand of Doom"),
                new CancionDoc("Fairies Wear Boots")
        ));
        album59.setArtista(banda34); // Artista previamente creado para Black Sabbath

        AlbumColeccion album60 = new AlbumColeccion();
        album60.setNombre("Master of Reality");
        album60.setImagen("/albumes/MasterOfReality.jpg");
        album60.setFechaLanzamiento(LocalDate.of(1971, 7, 21));
        album60.setCanciones(Arrays.asList(
                new CancionDoc("Sweet Leaf"),
                new CancionDoc("After Forever"),
                new CancionDoc("Children of the Grave"),
                new CancionDoc("Lord of This World"),
                new CancionDoc("Into the Void")
        ));
        album60.setArtista(banda34); // Artista previamente creado para Black Sabbath

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

        AlbumColeccion album61 = new AlbumColeccion();
        album61.setNombre("Rust in Peace");
        album61.setImagen("/albumes/RustInPeace.jpg");
        album61.setFechaLanzamiento(LocalDate.of(1990, 9, 24));
        album61.setCanciones(Arrays.asList(
                new CancionDoc("Holy Wars... The Punishment Due"),
                new CancionDoc("Hangar 18"),
                new CancionDoc("Take No Prisoners"),
                new CancionDoc("Five Magics"),
                new CancionDoc("Poison Was the Cure")
        ));
        album61.setArtista(banda35); // Artista previamente creado para Megadeth

        AlbumColeccion album62 = new AlbumColeccion();
        album62.setNombre("Peace Sells... But Who's Buying?");
        album62.setImagen("/albumes/PeaceSells.jpg");
        album62.setFechaLanzamiento(LocalDate.of(1986, 9, 19));
        album62.setCanciones(Arrays.asList(
                new CancionDoc("Wake Up Dead"),
                new CancionDoc("The Conjuring"),
                new CancionDoc("Peace Sells"),
                new CancionDoc("Devil's Island"),
                new CancionDoc("Good Mourning/Black Friday")
        ));
        album62.setArtista(banda35); // Artista previamente creado para Megadeth

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

        AlbumColeccion album63 = new AlbumColeccion();
        album63.setNombre("Enter the Wu-Tang (36 Chambers)");
        album63.setImagen("/albumes/EnterTheWuTang.jpg");
        album63.setFechaLanzamiento(LocalDate.of(1993, 11, 9));
        album63.setCanciones(Arrays.asList(
                new CancionDoc("Bring Da Ruckus"),
                new CancionDoc("Shame on a Nigga"),
                new CancionDoc("Clan in da Front"),
                new CancionDoc("Wu-Tang: 7th Chamber"),
                new CancionDoc("Can It Be All So Simple")
        ));
        album63.setArtista(banda36); // Artista previamente creado para Wu-Tang Clan

        AlbumColeccion album64 = new AlbumColeccion();
        album64.setNombre("Wu-Tang Forever");
        album64.setImagen("/albumes/WuTangForever.jpg");
        album64.setFechaLanzamiento(LocalDate.of(1997, 6, 3));
        album64.setCanciones(Arrays.asList(
                new CancionDoc("Reunited"),
                new CancionDoc("For Heaven's Sake"),
                new CancionDoc("Triumph"),
                new CancionDoc("Impossible"),
                new CancionDoc("Gravel Pit")
        ));
        album64.setArtista(banda36); // Artista previamente creado para Wu-Tang Clan

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

        AlbumColeccion album65 = new AlbumColeccion();
        album65.setNombre("Moment of Truth");
        album65.setImagen("/albumes/MomentOfTruth.jpg");
        album65.setFechaLanzamiento(LocalDate.of(1998, 3, 31));
        album65.setCanciones(Arrays.asList(
                new CancionDoc("You Know My Steez"),
                new CancionDoc("Royalty"),
                new CancionDoc("Moment of Truth"),
                new CancionDoc("Work"),
                new CancionDoc("Betrayal")
        ));
        album65.setArtista(banda37); // Artista previamente creado para Gang Starr

        AlbumColeccion album66 = new AlbumColeccion();
        album66.setNombre("Daily Operation");
        album66.setImagen("/albumes/DailyOperation.jpg");
        album66.setFechaLanzamiento(LocalDate.of(1992, 3, 24));
        album66.setCanciones(Arrays.asList(
                new CancionDoc("You’re Everything"),
                new CancionDoc("Code of the Streets"),
                new CancionDoc("Ex Girl to Next Girl"),
                new CancionDoc("DWYCK"),
                new CancionDoc("Take It Personal")
        ));
        album66.setArtista(banda37); // Artista previamente creado para Gang Starr

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

        AlbumColeccion album67 = new AlbumColeccion();
        album67.setNombre("The Score");
        album67.setImagen("/albumes/TheScore.jpg");
        album67.setFechaLanzamiento(LocalDate.of(1996, 2, 13));
        album67.setCanciones(Arrays.asList(
                new CancionDoc("Ready or Not"),
                new CancionDoc("Killing Me Softly"),
                new CancionDoc("No Woman, No Cry"),
                new CancionDoc("How Many Mics"),
                new CancionDoc("The Beast")
        ));
        album67.setArtista(banda38); // Artista previamente creado para The Fugees

        AlbumColeccion album68 = new AlbumColeccion();
        album68.setNombre("Blunted on Reality");
        album68.setImagen("/albumes/BluntedOnReality.jpg");
        album68.setFechaLanzamiento(LocalDate.of(1994, 2, 1));
        album68.setCanciones(Arrays.asList(
                new CancionDoc("Nappy Heads"),
                new CancionDoc("Vocab"),
                new CancionDoc("Boof Baf"),
                new CancionDoc("Doo Wop (That Thing)"),
                new CancionDoc("The Masked and the Mellow")
        ));
        album68.setArtista(banda38); // Artista previamente creado para The Fugees

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

        AlbumColeccion album69 = new AlbumColeccion();
        album69.setNombre("Donde Duele Inspira");
        album69.setImagen("/albumes/DondeDueleInspira.jpg");
        album69.setFechaLanzamiento(LocalDate.of(2012, 7, 23));
        album69.setCanciones(Arrays.asList(
                new CancionDoc("Donde Duele Inspira"),
                new CancionDoc("Por Amor al Odio"),
                new CancionDoc("Desde el Barro"),
                new CancionDoc("El Artesano del Arte Insano"),
                new CancionDoc("Cosquijazz")
        ));
        album69.setArtista(banda39); // Artista previamente creado para Flowklorikos

        AlbumColeccion album70 = new AlbumColeccion();
        album70.setNombre("Zerdos y Diamantes");
        album70.setImagen("/albumes/ZerdosyDiamantes.jpg");
        album70.setFechaLanzamiento(LocalDate.of(2014, 5, 30));
        album70.setCanciones(Arrays.asList(
                new CancionDoc("Cae de Trago"),
                new CancionDoc("Volvi a Ser"),
                new CancionDoc("Mensaje en una Botella"),
                new CancionDoc("Dias Grises")
        ));
        album70.setArtista(banda39); // Artista previamente creado para Flowklorikos

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

        AlbumColeccion album71 = new AlbumColeccion();
        album71.setNombre("People's Instinctive Travels and the Paths of Rhythm");
        album71.setImagen("/albumes/PeoplesInstinctiveTravels.jpg");
        album71.setFechaLanzamiento(LocalDate.of(1990, 4, 17));
        album71.setCanciones(Arrays.asList(
                new CancionDoc("Push It Along"),
                new CancionDoc("Luck of Lucien"),
                new CancionDoc("After Hours"),
                new CancionDoc("Description of a Fool"),
                new CancionDoc("Footprints")
        ));
        album71.setArtista(banda40);

// Álbum 72: "The Low End Theory"
        AlbumColeccion album72 = new AlbumColeccion();
        album72.setNombre("The Low End Theory");
        album72.setImagen("/albumes/TheLowEndTheory.jpg");
        album72.setFechaLanzamiento(LocalDate.of(1991, 9, 24));
        album72.setCanciones(Arrays.asList(
                new CancionDoc("Excursions"),
                new CancionDoc("Buggin' Out"),
                new CancionDoc("Check the Rhime"),
                new CancionDoc("Vibes and Stuff"),
                new CancionDoc("Scenario")
        ));
        album72.setArtista(banda40);

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

        // Artista Beastie Boys
// Álbum 73: "Licensed to Ill"
        AlbumColeccion album73 = new AlbumColeccion();
        album73.setNombre("Licensed to Ill");
        album73.setImagen("/albumes/LicensedToIll.jpg");
        album73.setFechaLanzamiento(LocalDate.of(1986, 11, 15));
        album73.setCanciones(Arrays.asList(
                new CancionDoc("Rhymin & Stealin"),
                new CancionDoc("The New Style"),
                new CancionDoc("She's Crafty"),
                new CancionDoc("Fight For Your Right"),
                new CancionDoc("No Sleep Till Brooklyn")
        ));
        album73.setArtista(banda41);

// Álbum 74: "Check Your Head"
        AlbumColeccion album74 = new AlbumColeccion();
        album74.setNombre("Check Your Head");
        album74.setImagen("/albumes/CheckYourHead.jpg");
        album74.setFechaLanzamiento(LocalDate.of(1992, 4, 21));
        album74.setCanciones(Arrays.asList(
                new CancionDoc("Jimmy James"),
                new CancionDoc("Pass the Mic"),
                new CancionDoc("Gratitude"),
                new CancionDoc("So What'cha Want"),
                new CancionDoc("Alive")
        ));
        album74.setArtista(banda41);

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

        AlbumColeccion album75 = new AlbumColeccion();
        album75.setNombre("Beethoven: Symphony No. 9");
        album75.setImagen("/albumes/BeethovenSymphony9.jpg");
        album75.setFechaLanzamiento(LocalDate.of(2019, 1, 1));
        album75.setCanciones(Arrays.asList(
                new CancionDoc("Symphony No. 9 in D minor, Op. 125: I. Allegro ma non troppo, un poco maestoso"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125: II. Molto vivace"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125: III. Adagio molto e cantabile"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125: IV. Presto")
        ));
        album75.setArtista(banda42);  // Asumiendo que ya se definió artista75, que es Vienna Philharmonic

// Álbum 76: "The Four Seasons"
        AlbumColeccion album76 = new AlbumColeccion();
        album76.setNombre("The Four Seasons");
        album76.setImagen("/albumes/TheFourSeasons.jpg");
        album76.setFechaLanzamiento(LocalDate.of(2017, 3, 15));
        album76.setCanciones(Arrays.asList(
                new CancionDoc("Spring: I. Allegro"),
                new CancionDoc("Spring: II. Largo"),
                new CancionDoc("Spring: III. Allegro"),
                new CancionDoc("Summer: I. Allegro non molto"),
                new CancionDoc("Summer: II. Adagio")
        ));
        album76.setArtista(banda42);

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

        // Álbum 77: "Tchaikovsky: The Nutcracker"
        AlbumColeccion album77 = new AlbumColeccion();
        album77.setNombre("Tchaikovsky: The Nutcracker");
        album77.setImagen("/albumes/TchaikovskyNutcracker.jpg");
        album77.setFechaLanzamiento(LocalDate.of(2018, 12, 1));
        album77.setCanciones(Arrays.asList(
                new CancionDoc("The Nutcracker, Op. 71: I. Overture"),
                new CancionDoc("The Nutcracker, Op. 71: II. March"),
                new CancionDoc("The Nutcracker, Op. 71: III. Dance of the Sugar Plum Fairy"),
                new CancionDoc("The Nutcracker, Op. 71: IV. Waltz of the Flowers")
        ));
        album77.setArtista(banda45);  // Asumiendo que ya se definió artista77, que es The London Symphony Orchestra

// Álbum 78: "Holst: The Planets"
        AlbumColeccion album78 = new AlbumColeccion();
        album78.setNombre("Holst: The Planets");
        album78.setImagen("/albumes/HolstThePlanets.jpg");
        album78.setFechaLanzamiento(LocalDate.of(2019, 5, 20));
        album78.setCanciones(Arrays.asList(
                new CancionDoc("The Planets, Op. 32: I. Mars, the Bringer of War"),
                new CancionDoc("The Planets, Op. 32: II. Venus, the Bringer of Peace"),
                new CancionDoc("The Planets, Op. 32: III. Mercury, the Winged Messenger"),
                new CancionDoc("The Planets, Op. 32: IV. Jupiter, the Bringer of Jollity"),
                new CancionDoc("The Planets, Op. 32: V. Saturn, the Bringer of Old Age")
        ));
        album78.setArtista(banda45);  // Asumiendo que ya se definió artista77, que es The London Symphony Orchestra

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

        // Álbum 79: "Beethoven: Symphonies Nos. 5 & 7"
        AlbumColeccion album79 = new AlbumColeccion();
        album79.setNombre("Beethoven: Symphonies Nos. 5 & 7");
        album79.setImagen("/albumes/BeethovenSymphonies57.jpg");
        album79.setFechaLanzamiento(LocalDate.of(2017, 4, 15));
        album79.setCanciones(Arrays.asList(
                new CancionDoc("Symphony No. 5 in C minor, Op. 67: I. Allegro con brio"),
                new CancionDoc("Symphony No. 5 in C minor, Op. 67: II. Andante con moto"),
                new CancionDoc("Symphony No. 5 in C minor, Op. 67: III. Allegro"),
                new CancionDoc("Symphony No. 7 in A major, Op. 92: I. Poco sostenuto - Vivace"),
                new CancionDoc("Symphony No. 7 in A major, Op. 92: II. Allegretto")
        ));
        album79.setArtista(banda46);  // Asumiendo que ya se definió artista79, que es The New York Philharmonic

// Álbum 80: "Mahler: Symphony No. 2 'Resurrection'"
        AlbumColeccion album80 = new AlbumColeccion();
        album80.setNombre("Mahler: Symphony No. 2 'Resurrection'");
        album80.setImagen("/albumes/MahlerSymphony2.jpg");
        album80.setFechaLanzamiento(LocalDate.of(2019, 6, 30));
        album80.setCanciones(Arrays.asList(
                new CancionDoc("Symphony No. 2 in C minor, Op. 36: I. Allegro maestoso"),
                new CancionDoc("Symphony No. 2 in C minor, Op. 36: II. Andante con moto"),
                new CancionDoc("Symphony No. 2 in C minor, Op. 36: III. Scherzo"),
                new CancionDoc("Symphony No. 2 in C minor, Op. 36: IV. Urlicht"),
                new CancionDoc("Symphony No. 2 in C minor, Op. 36: V. Finale")
        ));
        album80.setArtista(banda46);  // Asumiendo que ya se definió artista79, que es The New York Philharmonic

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

        // Álbum 81: "3 + 3"
        AlbumColeccion album81 = new AlbumColeccion();
        album81.setNombre("3 + 3");
        album81.setImagen("/albumes/3plus3.jpg");
        album81.setFechaLanzamiento(LocalDate.of(1973, 6, 1));
        album81.setCanciones(Arrays.asList(
                new CancionDoc("That Lady"),
                new CancionDoc("What It Comes Down To"),
                new CancionDoc("If You Were There"),
                new CancionDoc("You Walk Your Way"),
                new CancionDoc("Listen to the Music")
        ));
        album81.setArtista(banda47);  // Asumiendo que ya se definió artista81, que es The Isley Brothers

// Álbum 82: "Between the Sheets"
        AlbumColeccion album82 = new AlbumColeccion();
        album82.setNombre("Between the Sheets");
        album82.setImagen("/albumes/BetweenTheSheets.jpg");
        album82.setFechaLanzamiento(LocalDate.of(1983, 2, 1));
        album82.setCanciones(Arrays.asList(
                new CancionDoc("Between the Sheets"),
                new CancionDoc("Choosey Lover"),
                new CancionDoc("Touch Me (Where Your Eyes Meet Mine)"),
                new CancionDoc("Slow Down"),
                new CancionDoc("Ain't No Love In the Heart of the City")
        ));
        album82.setArtista(banda47);  // Asumiendo que ya se definió artista81, que es The Isley Brothers

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

        // Álbum 83: "Where Did Our Love Go"
        AlbumColeccion album83 = new AlbumColeccion();
        album83.setNombre("Where Did Our Love Go");
        album83.setImagen("/albumes/WhereDidOurLoveGo.jpg");
        album83.setFechaLanzamiento(LocalDate.of(1964, 8, 31));
        album83.setCanciones(Arrays.asList(
                new CancionDoc("Where Did Our Love Go"),
                new CancionDoc("Run, Run, Run"),
                new CancionDoc("Baby Love"),
                new CancionDoc("Come See About Me"),
                new CancionDoc("When the Lovelight Starts Shining Through His Eyes")
        ));
        album83.setArtista(banda48);  // Asumiendo que ya se definió artista83, que es The Supremes

// Álbum 84: "I Hear a Symphony"
        AlbumColeccion album84 = new AlbumColeccion();
        album84.setNombre("I Hear a Symphony");
        album84.setImagen("/albumes/IHearASymphony.jpg");
        album84.setFechaLanzamiento(LocalDate.of(1966, 10, 19));
        album84.setCanciones(Arrays.asList(
                new CancionDoc("I Hear a Symphony"),
                new CancionDoc("Wonderful, Wonderful"),
                new CancionDoc("My World Is Empty Without You"),
                new CancionDoc("Some Things You Never Get Used To"),
                new CancionDoc("Just a Little Misunderstanding")
        ));
        album84.setArtista(banda48);  // Asumiendo que ya se definió artista83, que es The Supremes

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

        // Álbum 85: "Disintegration"
        AlbumColeccion album85 = new AlbumColeccion();
        album85.setNombre("Disintegration");
        album85.setImagen("/albumes/Disintegration.jpg");
        album85.setFechaLanzamiento(LocalDate.of(1989, 5, 2));
        album85.setCanciones(Arrays.asList(
                new CancionDoc("Plainsong"),
                new CancionDoc("Pictures of You"),
                new CancionDoc("Closedown"),
                new CancionDoc("Love Song"),
                new CancionDoc("Lullaby")
        ));
        album85.setArtista(banda49);  // Asumiendo que ya se definió artista85, que es The Cure

// Álbum 86: "Kiss Me, Kiss Me, Kiss Me"
        AlbumColeccion album86 = new AlbumColeccion();
        album86.setNombre("Kiss Me, Kiss Me, Kiss Me");
        album86.setImagen("/albumes/KissMeKissMeKissMe.jpg");
        album86.setFechaLanzamiento(LocalDate.of(1987, 5, 25));
        album86.setCanciones(Arrays.asList(
                new CancionDoc("The Kiss"),
                new CancionDoc("Catch"),
                new CancionDoc("If Only Tonight We Could Sleep"),
                new CancionDoc("Why Can't I Be You?"),
                new CancionDoc("How Beautiful You Are!")
        ));
        album86.setArtista(banda49);  // Asumiendo que ya se definió artista85, que es The Cure

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

        // Álbum 87: "Parallel Lines"
        AlbumColeccion album87 = new AlbumColeccion();
        album87.setNombre("Parallel Lines");
        album87.setImagen("/albumes/ParallelLines.jpg");
        album87.setFechaLanzamiento(LocalDate.of(1978, 9, 23));
        album87.setCanciones(Arrays.asList(
                new CancionDoc("Heart of Glass"),
                new CancionDoc("One Way or Another"),
                new CancionDoc("Picture This"),
                new CancionDoc("Sunday Girl"),
                new CancionDoc("Hanging on the Telephone")
        ));
        album87.setArtista(banda50);  // Asumiendo que ya se definió artista87, que es Blondie

// Álbum 88: "Autoamerican"
        AlbumColeccion album88 = new AlbumColeccion();
        album88.setNombre("Autoamerican");
        album88.setImagen("/albumes/Autoamerican.jpg");
        album88.setFechaLanzamiento(LocalDate.of(1980, 11, 13));
        album88.setCanciones(Arrays.asList(
                new CancionDoc("Rapture"),
                new CancionDoc("The Tide Is High"),
                new CancionDoc("Live It Up"),
                new CancionDoc("Susie and Jeffrey"),
                new CancionDoc("Shayla")
        ));
        album88.setArtista(banda50);  // Asumiendo que ya se definió artista87, que es Blondie

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

        // Álbum 89: "Unknown Pleasures"
        AlbumColeccion album89 = new AlbumColeccion();
        album89.setNombre("Unknown Pleasures");
        album89.setImagen("/albumes/UnknownPleasures.jpg");
        album89.setFechaLanzamiento(LocalDate.of(1979, 6, 15));
        album89.setCanciones(Arrays.asList(
                new CancionDoc("Disorder"),
                new CancionDoc("Day of the Lords"),
                new CancionDoc("Candidate"),
                new CancionDoc("Insight"),
                new CancionDoc("New Dawn Fades")
        ));
        album89.setArtista(banda51);  // Asumiendo que ya se definió artista89, que es Joy Division

// Álbum 90: "Closer"
        AlbumColeccion album90 = new AlbumColeccion();
        album90.setNombre("Closer");
        album90.setImagen("/albumes/Closer.jpg");
        album90.setFechaLanzamiento(LocalDate.of(1980, 7, 18));
        album90.setCanciones(Arrays.asList(
                new CancionDoc("Atrocity Exhibition"),
                new CancionDoc("Isolation"),
                new CancionDoc("Passover"),
                new CancionDoc("Colony"),
                new CancionDoc("A Means to an End")
        ));
        album90.setArtista(banda51);  // Asumiendo que ya se definió artista89, que es Joy Division

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

        // Álbum 91: "Never Mind the Bollocks, Here's the Sex Pistols"
        AlbumColeccion album91 = new AlbumColeccion();
        album91.setNombre("Never Mind the Bollocks, Here's the Sex Pistols");
        album91.setImagen("/albumes/NeverMindTheBollocks.jpg");
        album91.setFechaLanzamiento(LocalDate.of(1977, 10, 28));
        album91.setCanciones(Arrays.asList(
                new CancionDoc("Holidays in the Sun"),
                new CancionDoc("God Save the Queen"),
                new CancionDoc("Pretty Vacant"),
                new CancionDoc("Anarchy in the UK"),
                new CancionDoc("No Feelings")
        ));
        album91.setArtista(banda52);  // Asumiendo que ya se definió artista91, que es Sex Pistols

// Álbum 92: "The Great Rock 'n' Roll Swindle"
        AlbumColeccion album92 = new AlbumColeccion();
        album92.setNombre("The Great Rock 'n' Roll Swindle");
        album92.setImagen("/albumes/TheGreatRockNRollSwindle.jpg");
        album92.setFechaLanzamiento(LocalDate.of(1979, 2, 26));
        album92.setCanciones(Arrays.asList(
                new CancionDoc("The Great Rock 'n' Roll Swindle"),
                new CancionDoc("Who Killed Bambi?"),
                new CancionDoc("No Fun"),
                new CancionDoc("My Way"),
                new CancionDoc("C'mon Everybody")
        ));
        album92.setArtista(banda52);  // Asumiendo que ya se definió artista91, que es Sex Pistols

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

        // Álbum 93: "London Calling"
        AlbumColeccion album93 = new AlbumColeccion();
        album93.setNombre("London Calling");
        album93.setImagen("/albumes/LondonCalling.jpg");
        album93.setFechaLanzamiento(LocalDate.of(1979, 2, 14));
        album93.setCanciones(Arrays.asList(
                new CancionDoc("London Calling"),
                new CancionDoc("Train in Vain"),
                new CancionDoc("Clampdown"),
                new CancionDoc("Spanish Bombs"),
                new CancionDoc("The Guns of Brixton")
        ));
        album93.setArtista(banda53);  // Asumiendo que ya se definió artista93, que es The Clash

// Álbum 94: "Combat Rock"
        AlbumColeccion album94 = new AlbumColeccion();
        album94.setNombre("Combat Rock");
        album94.setImagen("/albumes/CombatRock.jpg");
        album94.setFechaLanzamiento(LocalDate.of(1982, 5, 14));
        album94.setCanciones(Arrays.asList(
                new CancionDoc("Should I Stay or Should I Go"),
                new CancionDoc("Rock the Casbah"),
                new CancionDoc("Straight to Hell"),
                new CancionDoc("Overpowered by Funk"),
                new CancionDoc("Know Your Rights")
        ));
        album94.setArtista(banda53);  // Asumiendo que ya se definió artista93, que es The Clash

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

        // Álbum 95: "Mothership Connection"
        AlbumColeccion album95 = new AlbumColeccion();
        album95.setNombre("Mothership Connection");
        album95.setImagen("/albumes/MothershipConnection.jpg");
        album95.setFechaLanzamiento(LocalDate.of(1975, 12, 15));
        album95.setCanciones(Arrays.asList(
                new CancionDoc("P. Funk (Wants to Get Funked Up)"),
                new CancionDoc("Mothership Connection (Star Child)"),
                new CancionDoc("Unfunky UFO"),
                new CancionDoc("Supergroovalisticprosifunkstication"),
                new CancionDoc("Handcuffs")
        ));
        album95.setArtista(banda54);  // Asumiendo que ya se definió artista95, que es Parliament

// Álbum 96: "Funkentelechy Vs. the Placebo Syndrome"
        AlbumColeccion album96 = new AlbumColeccion();
        album96.setNombre("Funkentelechy Vs. the Placebo Syndrome");
        album96.setImagen("/albumes/FunkentelechyVsThePlaceboSyndrome.jpg");
        album96.setFechaLanzamiento(LocalDate.of(1977, 3, 7));
        album96.setCanciones(Arrays.asList(
                new CancionDoc("Bop Gun (Endangered Species)"),
                new CancionDoc("Maggot Brain"),
                new CancionDoc("Placebo Syndrome"),
                new CancionDoc("Sir Nose's Piece"),
                new CancionDoc("The Secret Life of Dr. Funkenstein")
        ));
        album96.setArtista(banda54);  // Asumiendo que ya se definió artista95, que es Parliament

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

        // Álbum 97: "Maggot Brain"
        AlbumColeccion album97 = new AlbumColeccion();
        album97.setNombre("Maggot Brain");
        album97.setImagen("/albumes/MaggotBrain.jpg");
        album97.setFechaLanzamiento(LocalDate.of(1971, 7, 12));
        album97.setCanciones(Arrays.asList(
                new CancionDoc("Maggot Brain"),
                new CancionDoc("Can You Get to That"),
                new CancionDoc("Hit It and Quit It"),
                new CancionDoc("You and Your Folks, Me and My Folks"),
                new CancionDoc("Super Stupid"),
                new CancionDoc("Back in Our Minds"),
                new CancionDoc("Wars of Armageddon")
        ));
        album97.setArtista(banda55);  // Asumiendo que ya se definió artista97, que es Funkadelic

// Álbum 98: "One Nation Under a Groove"
        AlbumColeccion album98 = new AlbumColeccion();
        album98.setNombre("One Nation Under a Groove");
        album98.setImagen("/albumes/OneNationUnderAGroove.jpg");
        album98.setFechaLanzamiento(LocalDate.of(1978, 9, 22));
        album98.setCanciones(Arrays.asList(
                new CancionDoc("One Nation Under a Groove"),
                new CancionDoc("Grooveallegiance"),
                new CancionDoc("Who Says a Funk Band Can't Play Rock?!"),
                new CancionDoc("Promentalshitbackwashpsychosis Enema Squad (The Doo Doo Chasers)"),
                new CancionDoc("Into You")
        ));
        album98.setArtista(banda55);  // Asumiendo que ya se definió artista97, que es Funkadelic

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

        // Álbum 99: "Chaco"
        AlbumColeccion album99 = new AlbumColeccion();
        album99.setNombre("Chaco");
        album99.setImagen("/albumes/Chaco.jpg");
        album99.setFechaLanzamiento(LocalDate.of(2001, 6, 19));
        album99.setCanciones(Arrays.asList(
                new CancionDoc("Chaco"),
                new CancionDoc("Abarajame (Remix)"),
                new CancionDoc("Mariposa Tecknicolor"),
                new CancionDoc("La Cumbia de los Aburridos (Remix)"),
                new CancionDoc("Para Siempre"),
                new CancionDoc("Amor y Paz"),
                new CancionDoc("Polvo de Estrellas")
        ));
        album99.setArtista(banda57);  // Asumiendo que ya se definió artista99, que es Ilya Kuriaki

// Álbum 100: "Versus"
        AlbumColeccion album100 = new AlbumColeccion();
        album100.setNombre("Versus");
        album100.setImagen("/albumes/Versus.jpg");
        album100.setFechaLanzamiento(LocalDate.of(2004, 4, 28));
        album100.setCanciones(Arrays.asList(
                new CancionDoc("La Noche"),
                new CancionDoc("Verano"),
                new CancionDoc("Duro de Domar"),
                new CancionDoc("La Mujer"),
                new CancionDoc("Te Lo Pido Por Favor"),
                new CancionDoc("No Es Personal"),
                new CancionDoc("Funky Futurista")
        ));
        album100.setArtista(banda57);  // Asumiendo que ya se definió artista99, que es Ilya Kuriaki

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
        artistas.clear();
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

        // Álbum 101: "Buena Vista Social Club"
        AlbumColeccion album101 = new AlbumColeccion();
        album101.setNombre("Buena Vista Social Club");
        album101.setImagen("/albumes/BuenaVistaSocialClub.jpg");
        album101.setFechaLanzamiento(LocalDate.of(1997, 6, 23));
        album101.setCanciones(Arrays.asList(
                new CancionDoc("Chan Chan"),
                new CancionDoc("De Camino a la Vereda"),
                new CancionDoc("El Cuarto de Tula"),
                new CancionDoc("Dos Gardenias"),
                new CancionDoc("¿Y Tú Qué Has Hecho?"),
                new CancionDoc("Veinte Años"),
                new CancionDoc("Orgullecida")
        ));
        album101.setArtista(banda58); // Asumiendo que ya se definió artista101 para Buena Vista Social Club

// Álbum 102: "Lost and Found"
        AlbumColeccion album102 = new AlbumColeccion();
        album102.setNombre("Lost and Found");
        album102.setImagen("/albumes/LostAndFound.jpg");
        album102.setFechaLanzamiento(LocalDate.of(2015, 3, 23));
        album102.setCanciones(Arrays.asList(
                new CancionDoc("Bruca Maniguá"),
                new CancionDoc("Macusa"),
                new CancionDoc("Tiene Sabor"),
                new CancionDoc("Guajira en F"),
                new CancionDoc("Como Fue"),
                new CancionDoc("Quizás, Quizás, Quizás"),
                new CancionDoc("Lágrimas Negras")
        ));
        album102.setArtista(banda58); // Asumiendo que ya se definió artista101 para Buena Vista Social Club

        // Álbum 103: "Cómo Te Voy a Olvidar"
        AlbumColeccion album103 = new AlbumColeccion();
        album103.setNombre("Cómo Te Voy a Olvidar");
        album103.setImagen("/albumes/ComoTeVoyAOlvidar.jpg");
        album103.setFechaLanzamiento(LocalDate.of(1996, 3, 15));
        album103.setCanciones(Arrays.asList(
                new CancionDoc("Cómo Te Voy a Olvidar"),
                new CancionDoc("El Listón de Tu Pelo"),
                new CancionDoc("Entrega de Amor"),
                new CancionDoc("Mis Sentimientos"),
                new CancionDoc("Toma Que Toma")
        ));
        album103.setArtista(banda59); // Asumiendo que ya se definió artista103 para Los Ángeles Azules

// Álbum 104: "De Plaza en Plaza"
        AlbumColeccion album104 = new AlbumColeccion();
        album104.setNombre("De Plaza en Plaza");
        album104.setImagen("/albumes/DePlazaEnPlaza.jpg");
        album104.setFechaLanzamiento(LocalDate.of(2016, 9, 30));
        album104.setCanciones(Arrays.asList(
                new CancionDoc("17 Años (feat. Saúl Hernández)"),
                new CancionDoc("Entrega de Amor (feat. Ha*Ash)"),
                new CancionDoc("Cómo Te Voy a Olvidar (feat. Kinky)"),
                new CancionDoc("Mis Sentimientos (feat. Ximena Sariñana)"),
                new CancionDoc("Nunca Es Suficiente (feat. Natalia Lafourcade)")
        ));
        album104.setArtista(banda59); // Asumiendo que ya se definió artista103 para Los Ángeles Azules

        // Álbum 105: "Into"
        AlbumColeccion album105 = new AlbumColeccion();
        album105.setNombre("Into");
        album105.setImagen("/albumes/Into.jpg");
        album105.setFechaLanzamiento(LocalDate.of(2017, 2, 7));
        album105.setCanciones(Arrays.asList(
                new CancionDoc("Feel"),
                new CancionDoc("Too Fast"),
                new CancionDoc("Lovely"),
                new CancionDoc("Baldwin Park"),
                new CancionDoc("Searchin"),
                new CancionDoc("Care")
        ));
        album105.setArtista(banda60); // Asumiendo que ya se definió artista105 para Sonder

// Álbum 106: "Nobody Knows"
        AlbumColeccion album106 = new AlbumColeccion();
        album106.setNombre("Nobody Knows");
        album106.setImagen("/albumes/NobodyKnows.jpg");
        album106.setFechaLanzamiento(LocalDate.of(2021, 11, 19));
        album106.setCanciones(Arrays.asList(
                new CancionDoc("What You Heard"),
                new CancionDoc("Nobody But You"),
                new CancionDoc("Look Like"),
                new CancionDoc("Mad Riches"),
                new CancionDoc("Tape Loop"),
                new CancionDoc("Heartstrings")
        ));
        album106.setArtista(banda60); // Asumiendo que ya se definió artista105 para Sonder

        // Álbum 107: "Ego Death"
        AlbumColeccion album107 = new AlbumColeccion();
        album107.setNombre("Ego Death");
        album107.setImagen("/albumes/EgoDeath.jpg");
        album107.setFechaLanzamiento(LocalDate.of(2015, 6, 26));
        album107.setCanciones(Arrays.asList(
                new CancionDoc("Get Away"),
                new CancionDoc("Gabby"),
                new CancionDoc("Under Control"),
                new CancionDoc("Go With It"),
                new CancionDoc("Just Sayin/I Tried"),
                new CancionDoc("For the World"),
                new CancionDoc("Girl")
        ));
        album107.setArtista(banda61); // Asumiendo que ya se definió artista107 para The Internet

// Álbum 108: "Hive Mind"
        AlbumColeccion album108 = new AlbumColeccion();
        album108.setNombre("Hive Mind");
        album108.setImagen("/albumes/HiveMind.jpg");
        album108.setFechaLanzamiento(LocalDate.of(2018, 7, 20));
        album108.setCanciones(Arrays.asList(
                new CancionDoc("Come Together"),
                new CancionDoc("Roll (Burbank Funk)"),
                new CancionDoc("Come Over"),
                new CancionDoc("Stay the Night"),
                new CancionDoc("Mood"),
                new CancionDoc("La Di Da"),
                new CancionDoc("It Gets Better (With Time)")
        ));
        album108.setArtista(banda61); // Asumiendo que ya se definió artista107 para The Internet

// Álbum 109: "Saturation"
        AlbumColeccion album109 = new AlbumColeccion();
        album109.setNombre("Saturation");
        album109.setImagen("/albumes/Saturation.jpg");
        album109.setFechaLanzamiento(LocalDate.of(2017, 6, 9));
        album109.setCanciones(Arrays.asList(
                new CancionDoc("HEAT"),
                new CancionDoc("GOLD"),
                new CancionDoc("STAR"),
                new CancionDoc("BOYS"),
                new CancionDoc("CASH"),
                new CancionDoc("MILK"),
                new CancionDoc("FACE")
        ));
        album109.setArtista(banda62); // Asumiendo que ya se definió artista109 para Brockhampton

// Álbum 110: "Iridescence"
        AlbumColeccion album110 = new AlbumColeccion();
        album110.setNombre("Iridescence");
        album110.setImagen("/albumes/Iridescence.jpg");
        album110.setFechaLanzamiento(LocalDate.of(2018, 9, 21));
        album110.setCanciones(Arrays.asList(
                new CancionDoc("NEW ORLEANS"),
                new CancionDoc("THUG LIFE"),
                new CancionDoc("BERLIN"),
                new CancionDoc("SOMETHING ABOUT HIM"),
                new CancionDoc("WEIGHT"),
                new CancionDoc("DISTRICT"),
                new CancionDoc("SAN MARCOS")
        ));
        album110.setArtista(banda62); // Asumiendo que ya se definió artista109 para Brockhampton

// Álbum 111: "Culture"
        AlbumColeccion album111 = new AlbumColeccion();
        album111.setNombre("Culture");
        album111.setImagen("/albumes/Culture.jpg");
        album111.setFechaLanzamiento(LocalDate.of(2017, 1, 27));
        album111.setCanciones(Arrays.asList(
                new CancionDoc("T-Shirt"),
                new CancionDoc("Bad and Boujee"),
                new CancionDoc("Slippery"),
                new CancionDoc("Get Right Witcha"),
                new CancionDoc("Kelly Price"),
                new CancionDoc("What the Price"),
                new CancionDoc("Deadz")
        ));
        album111.setArtista(banda63); // Asumiendo que ya se definió artista111 para Migos

// Álbum 112: "Culture II"
        AlbumColeccion album112 = new AlbumColeccion();
        album112.setNombre("Culture II");
        album112.setImagen("/albumes/CultureII.jpg");
        album112.setFechaLanzamiento(LocalDate.of(2018, 1, 26));
        album112.setCanciones(Arrays.asList(
                new CancionDoc("Walk It Talk It"),
                new CancionDoc("Stir Fry"),
                new CancionDoc("Narcos"),
                new CancionDoc("Motorsport"),
                new CancionDoc("Made Men"),
                new CancionDoc("Notice Me"),
                new CancionDoc("Top Down on Da NAWF")
        ));
        album112.setArtista(banda63); // Asumiendo que ya se definió artista111 para Migos

// Álbum 113: "JACKBOYS"
        AlbumColeccion album113 = new AlbumColeccion();
        album113.setNombre("JACKBOYS");
        album113.setImagen("/albumes/JACKBOYS.jpg");
        album113.setFechaLanzamiento(LocalDate.of(2019, 12, 27));
        album113.setCanciones(Arrays.asList(
                new CancionDoc("HIGHEST IN THE ROOM (Remix)"),
                new CancionDoc("JACKBOYS"),
                new CancionDoc("GANG GANG"),
                new CancionDoc("HAD ENOUGH"),
                new CancionDoc("OUT WEST"),
                new CancionDoc("WHAT TO DO?"),
                new CancionDoc("GATTI")
        ));
        album113.setArtista(banda64); // Asumiendo que ya se definió artista113 para JACKBOYS

// Álbum 114: "Utopia Pack"
        AlbumColeccion album114 = new AlbumColeccion();
        album114.setNombre("Utopia Pack");
        album114.setImagen("/albumes/UtopiaPack.jpg");
        album114.setFechaLanzamiento(LocalDate.of(2023, 8, 4)); // Ejemplo de fecha
        album114.setCanciones(Arrays.asList(
                new CancionDoc("ESCAPE PLAN"),
                new CancionDoc("Mafia"),
                new CancionDoc("FE!N"),
                new CancionDoc("LOST FOREVER"),
                new CancionDoc("TOPIA TWINS"),
                new CancionDoc("MODERN JAM"),
                new CancionDoc("K-POP")
        ));
        album114.setArtista(banda64); // Asumiendo que ya se definió artista113 para JACKBOYS

// Álbum 115: "Party Pack"
        AlbumColeccion album115 = new AlbumColeccion();
        album115.setNombre("Party Pack");
        album115.setImagen("/albumes/PartyPack.jpg");
        album115.setFechaLanzamiento(LocalDate.of(2018, 8, 3));
        album115.setCanciones(Arrays.asList(
                new CancionDoc("Musty"),
                new CancionDoc("Nun Major"),
                new CancionDoc("Whuss the Deal"),
                new CancionDoc("Hella Juiced"),
                new CancionDoc("Trap Niggaz"),
                new CancionDoc("Spaceship"),
                new CancionDoc("Foreign")
        ));
        album115.setArtista(banda65); // Asumiendo que ya se definió artista115 para Shoreline Mafia

// Álbum 116: "Mafia Bidness"
        AlbumColeccion album116 = new AlbumColeccion();
        album116.setNombre("Mafia Bidness");
        album116.setImagen("/albumes/MafiaBidness.jpg");
        album116.setFechaLanzamiento(LocalDate.of(2020, 7, 31));
        album116.setCanciones(Arrays.asList(
                new CancionDoc("Change Ya Life"),
                new CancionDoc("Hoe Shit"),
                new CancionDoc("Gangstas & Sippas"),
                new CancionDoc("Ride Out"),
                new CancionDoc("Perc Popper"),
                new CancionDoc("How We Do It"),
                new CancionDoc("All the Time")
        ));
        album116.setArtista(banda65); // Asumiendo que ya se definió artista115 para Shoreline Mafia

// Álbum 117: "SremmLife"
        AlbumColeccion album117 = new AlbumColeccion();
        album117.setNombre("SremmLife");
        album117.setImagen("/albumes/SremmLife.jpg");
        album117.setFechaLanzamiento(LocalDate.of(2015, 1, 6));
        album117.setCanciones(Arrays.asList(
                new CancionDoc("No Flex Zone"),
                new CancionDoc("No Type"),
                new CancionDoc("Throw Sum Mo"),
                new CancionDoc("Up Like Trump"),
                new CancionDoc("This Could Be Us")
        ));
        album117.setArtista(banda66); // Rae Sremmurd

// Álbum 118: "SremmLife 2"
        AlbumColeccion album118 = new AlbumColeccion();
        album118.setNombre("SremmLife 2");
        album118.setImagen("/albumes/SremmLife2.jpg");
        album118.setFechaLanzamiento(LocalDate.of(2016, 8, 12));
        album118.setCanciones(Arrays.asList(
                new CancionDoc("Black Beatles"),
                new CancionDoc("Swang"),
                new CancionDoc("Look Alive"),
                new CancionDoc("Do Yoga"),
                new CancionDoc("Real Chill")
        ));
        album118.setArtista(banda66); // Rae Sremmurd

// Álbum 119: "Period"
        AlbumColeccion album119 = new AlbumColeccion();
        album119.setNombre("Period");
        album119.setImagen("/albumes/Period.jpg");
        album119.setFechaLanzamiento(LocalDate.of(2018, 5, 11));
        album119.setCanciones(Arrays.asList(
                new CancionDoc("Period (We Live)"),
                new CancionDoc("Where the Bag At"),
                new CancionDoc("Tighten Up"),
                new CancionDoc("Not Ya Main"),
                new CancionDoc("Millionaire Dick")
        ));
        album119.setArtista(banda67); // City Girls

// Álbum 120: "Girl Code"
        AlbumColeccion album120 = new AlbumColeccion();
        album120.setNombre("Girl Code");
        album120.setImagen("/albumes/GirlCode.jpg");
        album120.setFechaLanzamiento(LocalDate.of(2018, 11, 16));
        album120.setCanciones(Arrays.asList(
                new CancionDoc("Act Up"),
                new CancionDoc("Twerk (feat. Cardi B)"),
                new CancionDoc("Clout Chasin"),
                new CancionDoc("Season"),
                new CancionDoc("Broke Boy")
        ));
        album120.setArtista(banda67); // City Girls

// Álbum 121: "Discovery"
        AlbumColeccion album121 = new AlbumColeccion();
        album121.setNombre("Discovery");
        album121.setImagen("/albumes/Discovery.jpg");
        album121.setFechaLanzamiento(LocalDate.of(2001, 3, 12));
        album121.setCanciones(Arrays.asList(
                new CancionDoc("One More Time"),
                new CancionDoc("Digital Love"),
                new CancionDoc("Harder, Better, Faster, Stronger"),
                new CancionDoc("Aerodynamic"),
                new CancionDoc("Veridis Quo")
        ));
        album121.setArtista(banda68); // Daft Punk

// Álbum 122: "Random Access Memories"
        AlbumColeccion album122 = new AlbumColeccion();
        album122.setNombre("Random Access Memories");
        album122.setImagen("/albumes/RandomAccessMemories.jpg");
        album122.setFechaLanzamiento(LocalDate.of(2013, 5, 17));
        album122.setCanciones(Arrays.asList(
                new CancionDoc("Get Lucky (feat. Pharrell Williams)"),
                new CancionDoc("Instant Crush (feat. Julian Casablancas)"),
                new CancionDoc("Lose Yourself to Dance"),
                new CancionDoc("Touch"),
                new CancionDoc("Doin' It Right (feat. Panda Bear)")
        ));
        album122.setArtista(banda68); // Daft Punk

// Álbum 123: "Dig Your Own Hole"
        AlbumColeccion album123 = new AlbumColeccion();
        album123.setNombre("Dig Your Own Hole");
        album123.setImagen("/albumes/DigYourOwnHole.jpg");
        album123.setFechaLanzamiento(LocalDate.of(1997, 4, 7));
        album123.setCanciones(Arrays.asList(
                new CancionDoc("Block Rockin' Beats"),
                new CancionDoc("The Private Psychedelic Reel"),
                new CancionDoc("Dig Your Own Hole"),
                new CancionDoc("Elektrobank"),
                new CancionDoc("It Began in Afrika")
        ));
        album123.setArtista(banda69); // The Chemical Brothers

// Álbum 124: "Surrender"
        AlbumColeccion album124 = new AlbumColeccion();
        album124.setNombre("Surrender");
        album124.setImagen("/albumes/Surrender.jpg");
        album124.setFechaLanzamiento(LocalDate.of(1999, 7, 19));
        album124.setCanciones(Arrays.asList(
                new CancionDoc("Hey Boy Hey Girl"),
                new CancionDoc("Let Forever Be"),
                new CancionDoc("The Sunshine Underground"),
                new CancionDoc("Out of Control"),
                new CancionDoc("Music: Response")
        ));
        album124.setArtista(banda69); // The Chemical Brothers

// Álbum 125: "Autobahn"
        AlbumColeccion album125 = new AlbumColeccion();
        album125.setNombre("Autobahn");
        album125.setImagen("/albumes/Autobahn.jpg");
        album125.setFechaLanzamiento(LocalDate.of(1974, 11, 1));
        album125.setCanciones(Arrays.asList(
                new CancionDoc("Autobahn"),
                new CancionDoc("Kometenmelodie 1"),
                new CancionDoc("Kometenmelodie 2"),
                new CancionDoc("Mitternacht"),
                new CancionDoc("Morgenspaziergang")
        ));
        album125.setArtista(banda70); // Kraftwerk

// Álbum 126: "The Man-Machine"
        AlbumColeccion album126 = new AlbumColeccion();
        album126.setNombre("The Man-Machine");
        album126.setImagen("/albumes/TheManMachine.jpg");
        album126.setFechaLanzamiento(LocalDate.of(1978, 5, 1));
        album126.setCanciones(Arrays.asList(
                new CancionDoc("The Robots"),
                new CancionDoc("Computer World"),
                new CancionDoc("The Model"),
                new CancionDoc("Neon Lights"),
                new CancionDoc("The Man-Machine")
        ));
        album126.setArtista(banda70); // Kraftwerk

// Álbum 127: "†" (Cross)
        AlbumColeccion album127 = new AlbumColeccion();
        album127.setNombre("† (Cross)");
        album127.setImagen("/albumes/Cross.jpg");
        album127.setFechaLanzamiento(LocalDate.of(2007, 6, 11));
        album127.setCanciones(Arrays.asList(
                new CancionDoc("Genesis"),
                new CancionDoc("Let There Be Light"),
                new CancionDoc("D.A.N.C.E."),
                new CancionDoc("Newjack"),
                new CancionDoc("Phantom")
        ));
        album127.setArtista(banda71); // Justice

// Álbum 128: "Audio, Video, Disco"
        AlbumColeccion album128 = new AlbumColeccion();
        album128.setNombre("Audio, Video, Disco");
        album128.setImagen("/albumes/AudioVideoDisco.jpg");
        album128.setFechaLanzamiento(LocalDate.of(2011, 10, 25));
        album128.setCanciones(Arrays.asList(
                new CancionDoc("Horsepower"),
                new CancionDoc("Civilization"),
                new CancionDoc("Audio, Video, Disco"),
                new CancionDoc("On'n'On"),
                new CancionDoc("Canon")
        ));
        album128.setArtista(banda71); // Justice

// Álbum 129: "MSTRKRFT"
        AlbumColeccion album129 = new AlbumColeccion();
        album129.setNombre("MSTRKRFT");
        album129.setImagen("/albumes/MSTRKRFT.jpg");
        album129.setFechaLanzamiento(LocalDate.of(2006, 3, 7));
        album129.setCanciones(Arrays.asList(
                new CancionDoc("Work On You"),
                new CancionDoc("MSTRKRFT"),
                new CancionDoc("Street Justice"),
                new CancionDoc("La Musica")
        ));
        album129.setArtista(banda72); // MSTRKRFT

// Álbum 130: "Fist of God"
        AlbumColeccion album130 = new AlbumColeccion();
        album130.setNombre("Fist of God");
        album130.setImagen("/albumes/FistOfGod.jpg");
        album130.setFechaLanzamiento(LocalDate.of(2009, 3, 17));
        album130.setCanciones(Arrays.asList(
                new CancionDoc("Bounce"),
                new CancionDoc("Beard Lives"),
                new CancionDoc("The Looks"),
                new CancionDoc("Fist of God")
        ));
        album130.setArtista(banda72); // MSTRKRFT

// Álbum 131: "The Dark Side of the Moon"
        AlbumColeccion album131 = new AlbumColeccion();
        album131.setNombre("The Dark Side of the Moon");
        album131.setImagen("/albumes/DarkSideOfTheMoon.jpg");
        album131.setFechaLanzamiento(LocalDate.of(1973, 3, 1));
        album131.setCanciones(Arrays.asList(
                new CancionDoc("Speak to Me"),
                new CancionDoc("Breathe"),
                new CancionDoc("Time"),
                new CancionDoc("Money"),
                new CancionDoc("Us and Them")
        ));
        album131.setArtista(banda73); // Pink Floyd

// Álbum 132: "The Wall"
        AlbumColeccion album132 = new AlbumColeccion();
        album132.setNombre("The Wall");
        album132.setImagen("/albumes/TheWall.jpg");
        album132.setFechaLanzamiento(LocalDate.of(1979, 11, 30));
        album132.setCanciones(Arrays.asList(
                new CancionDoc("In the Flesh?"),
                new CancionDoc("The Thin Ice"),
                new CancionDoc("Another Brick in the Wall, Part 1"),
                new CancionDoc("Mother"),
                new CancionDoc("Comfortably Numb")
        ));
        album132.setArtista(banda73); // Pink Floyd

// Álbum 133: "Peperina"
        AlbumColeccion album133 = new AlbumColeccion();
        album133.setNombre("Peperina");
        album133.setImagen("/albumes/Peperina.jpg");
        album133.setFechaLanzamiento(LocalDate.of(1981, 1, 1));
        album133.setCanciones(Arrays.asList(
                new CancionDoc("La Grasa de las Capitales"),
                new CancionDoc("Peperina"),
                new CancionDoc("El Anillo del Capitán Beto"),
                new CancionDoc("San Francisco y el Loco")
        ));
        album133.setArtista(banda74); // Serú Girán

// Álbum 134: "Serú Girán"
        AlbumColeccion album134 = new AlbumColeccion();
        album134.setNombre("Serú Girán");
        album134.setImagen("/albumes/SeruGiran.jpg");
        album134.setFechaLanzamiento(LocalDate.of(1978, 1, 1));
        album134.setCanciones(Arrays.asList(
                new CancionDoc("Los Libros de la Buena Memoria"),
                new CancionDoc("El Anillo del Capitán Beto"),
                new CancionDoc("Semilla de Dios"),
                new CancionDoc("Eiti Leda")
        ));
        album134.setArtista(banda74); // Serú Girán

// Álbum 135: "Fragile"
        AlbumColeccion album135 = new AlbumColeccion();
        album135.setNombre("Fragile");
        album135.setImagen("/albumes/Fragile.jpg");
        album135.setFechaLanzamiento(LocalDate.of(1971, 12, 1));
        album135.setCanciones(Arrays.asList(
                new CancionDoc("Roundabout"),
                new CancionDoc("Cans and Brahms"),
                new CancionDoc("We Have Heaven"),
                new CancionDoc("Mood for a Day")
        ));
        album135.setArtista(banda75); // Yes

// Álbum 136: "Close to the Edge"
        AlbumColeccion album136 = new AlbumColeccion();
        album136.setNombre("Close to the Edge");
        album136.setImagen("/albumes/CloseToTheEdge.jpg");
        album136.setFechaLanzamiento(LocalDate.of(1972, 9, 13));
        album136.setCanciones(Arrays.asList(
                new CancionDoc("Close to the Edge"),
                new CancionDoc("And You and I"),
                new CancionDoc("Total Mass Retain")
        ));
        album136.setArtista(banda75); // Yes

// Álbum 137: "The Lamb Lies Down on Broadway"
        AlbumColeccion album137 = new AlbumColeccion();
        album137.setNombre("The Lamb Lies Down on Broadway");
        album137.setImagen("/albumes/TheLambLiesDownOnBroadway.jpg");
        album137.setFechaLanzamiento(LocalDate.of(1974, 11, 29));
        album137.setCanciones(Arrays.asList(
                new CancionDoc("The Lamb Lies Down on Broadway"),
                new CancionDoc("Fly on a Windshield"),
                new CancionDoc("In the Cage"),
                new CancionDoc("Back in N.Y.C.")
        ));
        album137.setArtista(banda76); // Genesis

// Álbum 138: "Selling England by the Pound"
        AlbumColeccion album138 = new AlbumColeccion();
        album138.setNombre("Selling England by the Pound");
        album138.setImagen("/albumes/SellingEnglandByThePound.jpg");
        album138.setFechaLanzamiento(LocalDate.of(1973, 10, 13));
        album138.setCanciones(Arrays.asList(
                new CancionDoc("Dancing with the Moonlit Knight"),
                new CancionDoc("I Know What I Like (In Your Wardrobe)"),
                new CancionDoc("Firth of Fifth"),
                new CancionDoc("The Cinema Show")
        ));
        album138.setArtista(banda76); // Genesis

// Álbum 139: "In the Court of the Crimson King"
        AlbumColeccion album139 = new AlbumColeccion();
        album139.setNombre("In the Court of the Crimson King");
        album139.setImagen("/albumes/InTheCourtOfTheCrimsonKing.jpg");
        album139.setFechaLanzamiento(LocalDate.of(1969, 10, 10));
        album139.setCanciones(Arrays.asList(
                new CancionDoc("21st Century Schizoid Man"),
                new CancionDoc("I Talk to the Wind"),
                new CancionDoc("Epitaph"),
                new CancionDoc("In the Court of the Crimson King")
        ));
        album139.setArtista(banda77); // King Crimson

// Álbum 140: "Red"
        AlbumColeccion album140 = new AlbumColeccion();
        album140.setNombre("Red");
        album140.setImagen("/albumes/Red.jpg");
        album140.setFechaLanzamiento(LocalDate.of(1974, 10, 6));
        album140.setCanciones(Arrays.asList(
                new CancionDoc("Red"),
                new CancionDoc("Fallen Angel"),
                new CancionDoc("One More Red Nightmare"),
                new CancionDoc("Starless")
        ));
        album140.setArtista(banda77); // King Crimson

// Álbum 141: "Is This It"
        AlbumColeccion album141 = new AlbumColeccion();
        album141.setNombre("Is This It");
        album141.setImagen("/albumes/IsThisIt.jpg");
        album141.setFechaLanzamiento(LocalDate.of(2001, 7, 30));
        album141.setCanciones(Arrays.asList(
                new CancionDoc("Is This It"),
                new CancionDoc("The Modern Age"),
                new CancionDoc("Soma"),
                new CancionDoc("Barely Legal")
        ));
        album141.setArtista(banda79); // The Strokes

// Álbum 142: "Room on Fire"
        AlbumColeccion album142 = new AlbumColeccion();
        album142.setNombre("Room on Fire");
        album142.setImagen("/albumes/RoomOnFire.jpg");
        album142.setFechaLanzamiento(LocalDate.of(2003, 10, 28));
        album142.setCanciones(Arrays.asList(
                new CancionDoc("What Ever Happened?"),
                new CancionDoc("Reptilia"),
                new CancionDoc("Automatic Stop"),
                new CancionDoc("12:51")
        ));
        album142.setArtista(banda79); // The Strokes

// Álbum 143: "Turn on the Bright Lights"
        AlbumColeccion album143 = new AlbumColeccion();
        album143.setNombre("Turn on the Bright Lights");
        album143.setImagen("/albumes/TurnOnTheBrightLights.jpg");
        album143.setFechaLanzamiento(LocalDate.of(2002, 8, 20));
        album143.setCanciones(Arrays.asList(
                new CancionDoc("Pioneer to the Falls"),
                new CancionDoc("Slow Hands"),
                new CancionDoc("Obstacle 1"),
                new CancionDoc("Leif Erikson")
        ));
        album143.setArtista(banda80); // Interpol

// Álbum 144: "Antics"
        AlbumColeccion album144 = new AlbumColeccion();
        album144.setNombre("Antics");
        album144.setImagen("/albumes/Antics.jpg");
        album144.setFechaLanzamiento(LocalDate.of(2004, 9, 28));
        album144.setCanciones(Arrays.asList(
                new CancionDoc("Next Exit"),
                new CancionDoc("Evil"),
                new CancionDoc("Slow Hands"),
                new CancionDoc("The Heinrich Maneuver")
        ));
        album144.setArtista(banda80); // Interpol

// Álbum 145: "OK Computer"
        AlbumColeccion album145 = new AlbumColeccion();
        album145.setNombre("OK Computer");
        album145.setImagen("/albumes/OKComputer.jpg");
        album145.setFechaLanzamiento(LocalDate.of(1997, 5, 21));
        album145.setCanciones(Arrays.asList(
                new CancionDoc("Airbag"),
                new CancionDoc("Paranoid Android"),
                new CancionDoc("Subterranean Homesick Alien"),
                new CancionDoc("Exit Music (For a Film)")
        ));
        album145.setArtista(banda81); // Radiohead

// Álbum 146: "Kid A"
        AlbumColeccion album146 = new AlbumColeccion();
        album146.setNombre("Kid A");
        album146.setImagen("/albumes/KidA.jpg");
        album146.setFechaLanzamiento(LocalDate.of(2000, 10, 2));
        album146.setCanciones(Arrays.asList(
                new CancionDoc("Everything In Its Right Place"),
                new CancionDoc("Kid A"),
                new CancionDoc("The National Anthem"),
                new CancionDoc("How to Disappear Completely")
        ));
        album146.setArtista(banda81); // Radiohead

// Álbum 147: "Whatever People Say I Am, That's What I'm Not"
        AlbumColeccion album147 = new AlbumColeccion();
        album147.setNombre("Whatever People Say I Am, That's What I'm Not");
        album147.setImagen("/albumes/WhateverPeopleSayIAm.jpg");
        album147.setFechaLanzamiento(LocalDate.of(2006, 1, 23));
        album147.setCanciones(Arrays.asList(
                new CancionDoc("The View from the Afternoon"),
                new CancionDoc("I Bet You Look Good on the Dancefloor"),
                new CancionDoc("Fake Tales of San Francisco"),
                new CancionDoc("Dancing Shoes")
        ));
        album147.setArtista(banda82); // Arctic Monkeys

// Álbum 148: "AM"
        AlbumColeccion album148 = new AlbumColeccion();
        album148.setNombre("AM");
        album148.setImagen("/albumes/AM.jpg");
        album148.setFechaLanzamiento(LocalDate.of(2013, 9, 9));
        album148.setCanciones(Arrays.asList(
                new CancionDoc("Do I Wanna Know?"),
                new CancionDoc("R U Mine?"),
                new CancionDoc("Why'd You Only Call Me When You're High?"),
                new CancionDoc("Arabella")
        ));
        album148.setArtista(banda82); // Arctic Monkeys

// Álbum 149: "Hot Fuss"
        AlbumColeccion album149 = new AlbumColeccion();
        album149.setNombre("Hot Fuss");
        album149.setImagen("/albumes/HotFuss.jpg");
        album149.setFechaLanzamiento(LocalDate.of(2004, 6, 7));
        album149.setCanciones(Arrays.asList(
                new CancionDoc("Mr. Brightside"),
                new CancionDoc("Somebody Told Me"),
                new CancionDoc("Smile Like You Mean It"),
                new CancionDoc("All These Things That I've Done")
        ));
        album149.setArtista(banda83); // The Killers

// Álbum 150: "Sam's Town"
        AlbumColeccion album150 = new AlbumColeccion();
        album150.setNombre("Sam's Town");
        album150.setImagen("/albumes/SamsTown.jpg");
        album150.setFechaLanzamiento(LocalDate.of(2006, 9, 27));
        album150.setCanciones(Arrays.asList(
                new CancionDoc("When You Were Young"),
                new CancionDoc("Bones"),
                new CancionDoc("Read My Mind"),
                new CancionDoc("Sam's Town (Abbey Road version)")
        ));
        album150.setArtista(banda83); // The Killers

        // Álbum 151: "Elvis Presley"
        AlbumColeccion album151 = new AlbumColeccion();
        album151.setNombre("Elvis Presley");
        album151.setImagen("/albumes/ElvisPresley.jpg");
        album151.setFechaLanzamiento(LocalDate.of(1956, 1, 1));
        album151.setCanciones(Arrays.asList(
                new CancionDoc("Blue Suede Shoes"),
                new CancionDoc("I Got a Woman"),
                new CancionDoc("Money Honey"),
                new CancionDoc("Heartbreak Hotel")
        ));
        album151.setArtista(artista); // Elvis Presley

// Álbum 152: "Elvis: 30 #1 Hits"
        AlbumColeccion album152 = new AlbumColeccion();
        album152.setNombre("Elvis: 30 #1 Hits");
        album152.setImagen("/albumes/Elvis30Hits.jpg");
        album152.setFechaLanzamiento(LocalDate.of(2002, 1, 1));
        album152.setCanciones(Arrays.asList(
                new CancionDoc("Hound Dog"),
                new CancionDoc("Can't Help Falling in Love"),
                new CancionDoc("Suspicious Minds"),
                new CancionDoc("Jailhouse Rock")
        ));
        album152.setArtista(artista); // Elvis Presley

// Álbum 153: "Are You Experienced"
        AlbumColeccion album153 = new AlbumColeccion();
        album153.setNombre("Are You Experienced");
        album153.setImagen("/albumes/AreYouExperienced.jpg");
        album153.setFechaLanzamiento(LocalDate.of(1967, 5, 12));
        album153.setCanciones(Arrays.asList(
                new CancionDoc("Purple Haze"),
                new CancionDoc("Hey Joe"),
                new CancionDoc("The Wind Cries Mary"),
                new CancionDoc("Foxy Lady")
        ));
        album153.setArtista(artista1); // Jimi Hendrix

// Álbum 154: "Electric Ladyland"
        AlbumColeccion album154 = new AlbumColeccion();
        album154.setNombre("Electric Ladyland");
        album154.setImagen("/albumes/ElectricLadyland.jpg");
        album154.setFechaLanzamiento(LocalDate.of(1968, 10, 25));
        album154.setCanciones(Arrays.asList(
                new CancionDoc("All Along the Watchtower"),
                new CancionDoc("Voodoo Child (Slight Return)"),
                new CancionDoc("Crosstown Traffic"),
                new CancionDoc("Little Miss Strange")
        ));
        album154.setArtista(artista1); // Jimi Hendrix

// Álbum 155: "Artaud"
        AlbumColeccion album155 = new AlbumColeccion();
        album155.setNombre("Artaud");
        album155.setImagen("/albumes/Artaud.jpg");
        album155.setFechaLanzamiento(LocalDate.of(1973, 3, 1));
        album155.setCanciones(Arrays.asList(
                new CancionDoc("Bajo el sol de la tarde"),
                new CancionDoc("El anillo del Capitán Beto"),
                new CancionDoc("La colina de la vida"),
                new CancionDoc("Cementerio Club")
        ));
        album155.setArtista(artista2); // Luis Alberto Spinetta

// Álbum 156: "Spinetta Jade - Los Libros de la Buena Memoria"
        AlbumColeccion album156 = new AlbumColeccion();
        album156.setNombre("Los Libros de la Buena Memoria");
        album156.setImagen("/albumes/LosLibrosDeLaBuenaMemoria.jpg");
        album156.setFechaLanzamiento(LocalDate.of(1983, 5, 1));
        album156.setCanciones(Arrays.asList(
                new CancionDoc("Seguir Viviendo Sin Tu Amor"),
                new CancionDoc("La libertad es una palabra"),
                new CancionDoc("Los libros de la buena memoria"),
                new CancionDoc("No hay tiempo")
        ));
        album156.setArtista(artista2); // Luis Alberto Spinetta

// Álbum 157: "At Folsom Prison"
        AlbumColeccion album157 = new AlbumColeccion();
        album157.setNombre("At Folsom Prison");
        album157.setImagen("/albumes/AtFolsomPrison.jpg");
        album157.setFechaLanzamiento(LocalDate.of(1968, 5, 6));
        album157.setCanciones(Arrays.asList(
                new CancionDoc("Folsom Prison Blues"),
                new CancionDoc("I Still Miss Someone"),
                new CancionDoc("Cocaine Blues"),
                new CancionDoc("25 Minutes to Go")
        ));
        album157.setArtista(artista3); // Johnny Cash

// Álbum 158: "Johnny Cash at San Quentin"
        AlbumColeccion album158 = new AlbumColeccion();
        album158.setNombre("Johnny Cash at San Quentin");
        album158.setImagen("/albumes/AtSanQuentin.jpg");
        album158.setFechaLanzamiento(LocalDate.of(1969, 6, 16));
        album158.setCanciones(Arrays.asList(
                new CancionDoc("A Boy Named Sue"),
                new CancionDoc("San Quentin"),
                new CancionDoc("I Walk the Line"),
                new CancionDoc("Folsom Prison Blues")
        ));
        album158.setArtista(artista3); // Johnny Cash

// Álbum 159: "The Rise and Fall of Ziggy Stardust and the Spiders from Mars"
        AlbumColeccion album159 = new AlbumColeccion();
        album159.setNombre("The Rise and Fall of Ziggy Stardust and the Spiders from Mars");
        album159.setImagen("/albumes/ZiggyStardust.jpg");
        album159.setFechaLanzamiento(LocalDate.of(1972, 6, 16));
        album159.setCanciones(Arrays.asList(
                new CancionDoc("Starman"),
                new CancionDoc("Suffragette City"),
                new CancionDoc("Ziggy Stardust"),
                new CancionDoc("Rock 'n' Roll Suicide")
        ));
        album159.setArtista(artista4); // David Bowie

// Álbum 160: "Heroes"
        AlbumColeccion album160 = new AlbumColeccion();
        album160.setNombre("Heroes");
        album160.setImagen("/albumes/Heroes.jpg");
        album160.setFechaLanzamiento(LocalDate.of(1977, 10, 14));
        album160.setCanciones(Arrays.asList(
                new CancionDoc("Heroes"),
                new CancionDoc("Beauty and the Beast"),
                new CancionDoc("Warzawa"),
                new CancionDoc("The Secret Life of Arabia")
        ));
        album160.setArtista(artista4); // David Bowie

// Álbum 161: "What a Wonderful World"
        AlbumColeccion album161 = new AlbumColeccion();
        album161.setNombre("What a Wonderful World");
        album161.setImagen("/albumes/WhatAWonderfulWorld.jpg");
        album161.setFechaLanzamiento(LocalDate.of(1967, 10, 1));
        album161.setCanciones(Arrays.asList(
                new CancionDoc("What a Wonderful World"),
                new CancionDoc("A Kiss to Build a Dream On"),
                new CancionDoc("Mack the Knife"),
                new CancionDoc("La Vie En Rose")
        ));
        album161.setArtista(artista5); // Louis Armstrong

// Álbum 162: "Louis Armstrong Plays W.C. Handy"
        AlbumColeccion album162 = new AlbumColeccion();
        album162.setNombre("Louis Armstrong Plays W.C. Handy");
        album162.setImagen("/albumes/PlaysWCHandy.jpg");
        album162.setFechaLanzamiento(LocalDate.of(1954, 10, 1));
        album162.setCanciones(Arrays.asList(
                new CancionDoc("St. Louis Blues"),
                new CancionDoc("Beale Street Blues"),
                new CancionDoc("Memphis Blues"),
                new CancionDoc("The Hesitating Blues")
        ));
        album162.setArtista(artista5); // Louis Armstrong

// Álbum 163: "A Love Supreme"
        AlbumColeccion album163 = new AlbumColeccion();
        album163.setNombre("A Love Supreme");
        album163.setImagen("/albumes/ALoveSupreme.jpg");
        album163.setFechaLanzamiento(LocalDate.of(1965, 2, 23));
        album163.setCanciones(Arrays.asList(
                new CancionDoc("Acknowledgement"),
                new CancionDoc("Resolution"),
                new CancionDoc("Pursuance"),
                new CancionDoc("Psalm")
        ));
        album163.setArtista(artista6); // John Coltrane

// Álbum 164: "Giant Steps"
        AlbumColeccion album164 = new AlbumColeccion();
        album164.setNombre("Giant Steps");
        album164.setImagen("/albumes/GiantSteps.jpg");
        album164.setFechaLanzamiento(LocalDate.of(1960, 1, 1));
        album164.setCanciones(Arrays.asList(
                new CancionDoc("Giant Steps"),
                new CancionDoc("Cousin Mary"),
                new CancionDoc("Countdown"),
                new CancionDoc("Spiral")
        ));
        album164.setArtista(artista6); // John Coltrane

// Álbum 165: "Lady in Satin"
        AlbumColeccion album165 = new AlbumColeccion();
        album165.setNombre("Lady in Satin");
        album165.setImagen("/albumes/LadyInSatin.jpg");
        album165.setFechaLanzamiento(LocalDate.of(1958, 4, 14));
        album165.setCanciones(Arrays.asList(
                new CancionDoc("I'm a Fool to Want You"),
                new CancionDoc("For All We Know"),
                new CancionDoc("You've Changed"),
                new CancionDoc("Violets for Your Furs")
        ));
        album165.setArtista(artista7); // Billie Holiday

// Álbum 166: "Billie Holiday Sings"
        AlbumColeccion album166 = new AlbumColeccion();
        album166.setNombre("Billie Holiday Sings");
        album166.setImagen("/albumes/BillieHolidaySings.jpg");
        album166.setFechaLanzamiento(LocalDate.of(1952, 11, 1));
        album166.setCanciones(Arrays.asList(
                new CancionDoc("God Bless the Child"),
                new CancionDoc("Strange Fruit"),
                new CancionDoc("Don't Explain"),
                new CancionDoc("Lover Man")
        ));
        album166.setArtista(artista7); // Billie Holiday

// Álbum 167: "Bird and Diz"
        AlbumColeccion album167 = new AlbumColeccion();
        album167.setNombre("Bird and Diz");
        album167.setImagen("/albumes/BirdAndDiz.jpg");
        album167.setFechaLanzamiento(LocalDate.of(1952, 5, 1));
        album167.setCanciones(Arrays.asList(
                new CancionDoc("Groovin' High"),
                new CancionDoc("Salt Peanuts"),
                new CancionDoc("Shaw 'Nuff"),
                new CancionDoc("All the Things You Are")
        ));
        album167.setArtista(artista8); // Dizzy Gillespie

// Álbum 168: "Dizzy Gillespie at Newport"
        AlbumColeccion album168 = new AlbumColeccion();
        album168.setNombre("Dizzy Gillespie at Newport");
        album168.setImagen("/albumes/DizzyGillespieAtNewport.jpg");
        album168.setFechaLanzamiento(LocalDate.of(1956, 8, 1));
        album168.setCanciones(Arrays.asList(
                new CancionDoc("A Night in Tunisia"),
                new CancionDoc("I'm Be Bop")
        ));
        album168.setArtista(artista8); // Dizzy Gillespie

// Álbum 169: "Ella Fitzgerald Sings the Cole Porter Song Book"
        AlbumColeccion album169 = new AlbumColeccion();
        album169.setNombre("Ella Fitzgerald Sings the Cole Porter Song Book");
        album169.setImagen("/albumes/EllaColePorter.jpg");
        album169.setFechaLanzamiento(LocalDate.of(1956, 5, 1));
        album169.setCanciones(Arrays.asList(
                new CancionDoc("I Get a Kick Out of You"),
                new CancionDoc("Night and Day"),
                new CancionDoc("Easy to Love"),
                new CancionDoc("Let's Do It (Let's Fall in Love)")
        ));
        album169.setArtista(artista9); // Ella Fitzgerald

// Álbum 170: "Ella and Louis"
        AlbumColeccion album170 = new AlbumColeccion();
        album170.setNombre("Ella and Louis");
        album170.setImagen("/albumes/EllaAndLouis.jpg");
        album170.setFechaLanzamiento(LocalDate.of(1956, 2, 1));
        album170.setCanciones(Arrays.asList(
                new CancionDoc("Can't We Be Friends?"),
                new CancionDoc("Cheek to Cheek"),
                new CancionDoc("Isn't This a Lovely Day"),
                new CancionDoc("Summertime")
        ));
        album170.setArtista(artista9); // Ella Fitzgerald

// Álbum 171: "Thriller"
        AlbumColeccion album171 = new AlbumColeccion();
        album171.setNombre("Thriller");
        album171.setImagen("/albumes/Thriller.jpg");
        album171.setFechaLanzamiento(LocalDate.of(1982, 11, 30));
        album171.setCanciones(Arrays.asList(
                new CancionDoc("Wanna Be Startin' Somethin'"),
                new CancionDoc("Thriller"),
                new CancionDoc("Billie Jean"),
                new CancionDoc("Beat It")
        ));
        album171.setArtista(artista10); // Michael Jackson

// Álbum 172: "Bad"
        AlbumColeccion album172 = new AlbumColeccion();
        album172.setNombre("Bad");
        album172.setImagen("/albumes/Bad.jpg");
        album172.setFechaLanzamiento(LocalDate.of(1987, 8, 31));
        album172.setCanciones(Arrays.asList(
                new CancionDoc("Bad"),
                new CancionDoc("The Way You Make Me Feel"),
                new CancionDoc("Man in the Mirror"),
                new CancionDoc("Dirty Diana")
        ));
        album172.setArtista(artista10); // Michael Jackson

// Álbum 173: "Like a Prayer"
        AlbumColeccion album173 = new AlbumColeccion();
        album173.setNombre("Like a Prayer");
        album173.setImagen("/albumes/LikeAPrayer.jpg");
        album173.setFechaLanzamiento(LocalDate.of(1989, 3, 21));
        album173.setCanciones(Arrays.asList(
                new CancionDoc("Like a Prayer"),
                new CancionDoc("Express Yourself"),
                new CancionDoc("Cherish"),
                new CancionDoc("Dear Jessie")
        ));
        album173.setArtista(artista11); // Madonna

// Álbum 174: "True Blue"
        AlbumColeccion album174 = new AlbumColeccion();
        album174.setNombre("True Blue");
        album174.setImagen("/albumes/TrueBlue.jpg");
        album174.setFechaLanzamiento(LocalDate.of(1986, 6, 30));
        album174.setCanciones(Arrays.asList(
                new CancionDoc("Papa Don't Preach"),
                new CancionDoc("Open Your Heart"),
                new CancionDoc("La Isla Bonita"),
                new CancionDoc("True Blue")
        ));
        album174.setArtista(artista11); // Madonna

// Álbum 175: "Plus"
        AlbumColeccion album175 = new AlbumColeccion();
        album175.setNombre("Plus");
        album175.setImagen("/albumes/Plus.jpg");
        album175.setFechaLanzamiento(LocalDate.of(2011, 9, 9));
        album175.setCanciones(Arrays.asList(
                new CancionDoc("The A Team"),
                new CancionDoc("Lego House"),
                new CancionDoc("Drunk"),
                new CancionDoc("You Need Me, I Don't Need You")
        ));
        album175.setArtista(artista12); // Ed Sheeran

// Álbum 176: "Multiply"
        AlbumColeccion album176 = new AlbumColeccion();
        album176.setNombre("Multiply");
        album176.setImagen("/albumes/Multiply.jpg");
        album176.setFechaLanzamiento(LocalDate.of(2014, 6, 23));
        album176.setCanciones(Arrays.asList(
                new CancionDoc("Sing"),
                new CancionDoc("Don't"),
                new CancionDoc("Bloodstream"),
                new CancionDoc("Tenerife Sea")
        ));
        album176.setArtista(artista12); // Ed Sheeran

// Álbum 177: "Lemonade"
        AlbumColeccion album177 = new AlbumColeccion();
        album177.setNombre("Lemonade");
        album177.setImagen("/albumes/Lemonade.jpg");
        album177.setFechaLanzamiento(LocalDate.of(2016, 4, 23));
        album177.setCanciones(Arrays.asList(
                new CancionDoc("Formation"),
                new CancionDoc("Sorry"),
                new CancionDoc("Hold Up"),
                new CancionDoc("Freedom")
        ));
        album177.setArtista(artista13); // Beyoncé

// Álbum 178: "Beyoncé"
        AlbumColeccion album178 = new AlbumColeccion();
        album178.setNombre("Beyoncé");
        album178.setImagen("/albumes/Beyonce.jpg");
        album178.setFechaLanzamiento(LocalDate.of(2013, 12, 13));
        album178.setCanciones(Arrays.asList(
                new CancionDoc("Drunk in Love"),
                new CancionDoc("Partition"),
                new CancionDoc("XO"),
                new CancionDoc("Flawless")
        ));
        album178.setArtista(artista13); // Beyoncé

// Álbum 179: "Anti"
        AlbumColeccion album179 = new AlbumColeccion();
        album179.setNombre("ANTI");
        album179.setImagen("/albumes/Anti.jpg");
        album179.setFechaLanzamiento(LocalDate.of(2016, 1, 28));
        album179.setCanciones(Arrays.asList(
                new CancionDoc("Work"),
                new CancionDoc("Needed Me"),
                new CancionDoc("Love on the Brain"),
                new CancionDoc("Kiss It Better")
        ));
        album179.setArtista(artista14); // Rihanna

// Álbum 180: "Loud"
        AlbumColeccion album180 = new AlbumColeccion();
        album180.setNombre("Loud");
        album180.setImagen("/albumes/Loud.jpg");
        album180.setFechaLanzamiento(LocalDate.of(2010, 11, 12));
        album180.setCanciones(Arrays.asList(
                new CancionDoc("Only Girl (In the World)"),
                new CancionDoc("What's My Name?"),
                new CancionDoc("S&M"),
                new CancionDoc("Rude Boy")
        ));
        album180.setArtista(artista14); // Rihanna

// Álbum 181: "Legend"
        AlbumColeccion album181 = new AlbumColeccion();
        album181.setNombre("Legend");
        album181.setImagen("/albumes/Legend21.jpg");
        album181.setFechaLanzamiento(LocalDate.of(1984, 5, 8));
        album181.setCanciones(Arrays.asList(
                new CancionDoc("Is This Love"),
                new CancionDoc("No Woman, No Cry"),
                new CancionDoc("Buffalo Soldier"),
                new CancionDoc("Redemption Song")
        ));
        album181.setArtista(artista15); // Bob Marley

// Álbum 182: "Exodus"
        AlbumColeccion album182 = new AlbumColeccion();
        album182.setNombre("Exodus");
        album182.setImagen("/albumes/Exodus.jpg");
        album182.setFechaLanzamiento(LocalDate.of(1977, 6, 3));
        album182.setCanciones(Arrays.asList(
                new CancionDoc("One Love"),
                new CancionDoc("Jamming"),
                new CancionDoc("Three Little Birds"),
                new CancionDoc("Exodus")
        ));
        album182.setArtista(artista15); // Bob Marley

// Álbum 329: "Legalize It"
        AlbumColeccion album329 = new AlbumColeccion();
        album329.setNombre("Legalize It");
        album329.setImagen("/albumes/LegalizeIt.jpg");
        album329.setFechaLanzamiento(LocalDate.of(1976, 4, 19));
        album329.setCanciones(Arrays.asList(
                new CancionDoc("Legalize It"),
                new CancionDoc("Maga Dog"),
                new CancionDoc("Burial")
        ));
        album329.setArtista(artista16); // Peter Tosh

// Álbum 330: "Equal Rights"
        AlbumColeccion album330 = new AlbumColeccion();
        album330.setNombre("Equal Rights");
        album330.setImagen("/albumes/EqualRights.jpg");
        album330.setFechaLanzamiento(LocalDate.of(1977, 10, 31));
        album330.setCanciones(Arrays.asList(
                new CancionDoc("Get Up, Stand Up"),
                new CancionDoc("Equal Rights"),
                new CancionDoc("Downpresser Man"),
                new CancionDoc("Maga Dog")
        ));
        album330.setArtista(artista16); // Peter Tosh

// Álbum 183: "The Harder They Come"
        AlbumColeccion album183 = new AlbumColeccion();
        album183.setNombre("The Harder They Come");
        album183.setImagen("/albumes/TheHarderTheyCome.jpg");
        album183.setFechaLanzamiento(LocalDate.of(1972, 5, 28));
        album183.setCanciones(Arrays.asList(
                new CancionDoc("You Can Get It If You Really Want"),
                new CancionDoc("The Harder They Come"),
                new CancionDoc("Many Rivers to Cross"),
                new CancionDoc("Sitting Here in Limbo")
        ));
        album183.setArtista(artista17); // Jimmy Cliff

// Álbum 184: "Cliff Hanger"
        AlbumColeccion album184 = new AlbumColeccion();
        album184.setNombre("Cliff Hanger");
        album184.setImagen("/albumes/CliffHanger.jpg");
        album184.setFechaLanzamiento(LocalDate.of(1985, 4, 9));
        album184.setCanciones(Arrays.asList(
                new CancionDoc("Reggae Night"),
                new CancionDoc("We All Are One"),
                new CancionDoc("Sanctuary"),
                new CancionDoc("Love Is All")
        ));
        album184.setArtista(artista17); // Jimmy Cliff

// Álbum 185: "Night Nurse"
        AlbumColeccion album185 = new AlbumColeccion();
        album185.setNombre("Night Nurse");
        album185.setImagen("/albumes/NightNurse.jpg");
        album185.setFechaLanzamiento(LocalDate.of(1982, 6, 1));
        album185.setCanciones(Arrays.asList(
                new CancionDoc("Night Nurse"),
                new CancionDoc("If I Don't Have You"),
                new CancionDoc("Hot Stepper"),
                new CancionDoc("Red Rose")
        ));
        album185.setArtista(artista18); // Gregory Isaacs

// Álbum 186: "Cool Ruler"
        AlbumColeccion album186 = new AlbumColeccion();
        album186.setNombre("Cool Ruler");
        album186.setImagen("/albumes/CoolRuler.jpg");
        album186.setFechaLanzamiento(LocalDate.of(1978, 1, 1));
        album186.setCanciones(Arrays.asList(
                new CancionDoc("Set the Captives Free"),
                new CancionDoc("The Border"),
                new CancionDoc("If I Don't Have You"),
                new CancionDoc("Soon Forward")
        ));
        album186.setArtista(artista18); // Gregory Isaacs

// Álbum 187: "Funky Kingston"
        AlbumColeccion album187 = new AlbumColeccion();
        album187.setNombre("Funky Kingston");
        album187.setImagen("/albumes/FunkyKingston21.jpg");
        album187.setFechaLanzamiento(LocalDate.of(1973, 10, 12));
        album187.setCanciones(Arrays.asList(
                new CancionDoc("Time Tough"),
                new CancionDoc("Funky Kingston"),
                new CancionDoc("Pressure Drop"),
                new CancionDoc("Monkey Man")
        ));
        album187.setArtista(artista19); // Toots Hibbert

// Álbum 188: "Toots in Memphis"
        AlbumColeccion album188 = new AlbumColeccion();
        album188.setNombre("Toots in Memphis");
        album188.setImagen("/albumes/TootsInMemphis21.jpg");
        album188.setFechaLanzamiento(LocalDate.of(1988, 5, 25));
        album188.setCanciones(Arrays.asList(
                new CancionDoc("Reggae Got Soul"),
                new CancionDoc("Take Me Home, Country Roads"),
                new CancionDoc("Soul Power"),
                new CancionDoc("Oh Lord")
        ));
        album188.setArtista(artista19); // Toots Hibbert

// Álbum 189: "Live at the Regal"
        AlbumColeccion album189 = new AlbumColeccion();
        album189.setNombre("Live at the Regal");
        album189.setImagen("/albumes/LiveAtTheRegal21.jpg");
        album189.setFechaLanzamiento(LocalDate.of(1965, 11, 1));
        album189.setCanciones(Arrays.asList(
                new CancionDoc("Every Day I Have the Blues"),
                new CancionDoc("Sweet Little Angel"),
                new CancionDoc("It's My Own Fault"),
                new CancionDoc("How Blue Can You Get?")
        ));
        album189.setArtista(artista20); // B.B. King

// Álbum 190: "The Thrill Is Gone"
        AlbumColeccion album190 = new AlbumColeccion();
        album190.setNombre("The Thrill Is Gone");
        album190.setImagen("/albumes/TheThrillIsGone21.jpg");
        album190.setFechaLanzamiento(LocalDate.of(1969, 3, 17));
        album190.setCanciones(Arrays.asList(
                new CancionDoc("The Thrill Is Gone"),
                new CancionDoc("Just Like a Woman"),
                new CancionDoc("I Can't Quit You Baby"),
                new CancionDoc("How Blue Can You Get?")
        ));
        album190.setArtista(artista20); // B.B. King

// Álbum 191: "The Best of Muddy Waters"
        AlbumColeccion album191 = new AlbumColeccion();
        album191.setNombre("The Best of Muddy Waters");
        album191.setImagen("/albumes/TheBestOfMuddyWaters21.jpg");
        album191.setFechaLanzamiento(LocalDate.of(1958, 10, 1));
        album191.setCanciones(Arrays.asList(
                new CancionDoc("Hoochie Coochie Man"),
                new CancionDoc("Mannish Boy"),
                new CancionDoc("I Just Want to Make Love to You"),
                new CancionDoc("Rollin' Stone")
        ));
        album191.setArtista(artista21); // Muddy Waters

// Álbum 192: "Electric Mud"
        AlbumColeccion album192 = new AlbumColeccion();
        album192.setNombre("Electric Mud");
        album192.setImagen("/albumes/ElectricMud.jpg");
        album192.setFechaLanzamiento(LocalDate.of(1968, 10, 1));
        album192.setCanciones(Arrays.asList(
                new CancionDoc("I Just Want to Make Love to You"),
                new CancionDoc("I'm Your Hoochie Coochie Man"),
                new CancionDoc("She's 19 Years Old"),
                new CancionDoc("Tom Cat")
        ));
        album192.setArtista(artista21); // Muddy Waters

// Álbum 193: "King of the Delta Blues Singers"
        AlbumColeccion album193 = new AlbumColeccion();
        album193.setNombre("King of the Delta Blues Singers");
        album193.setImagen("/albumes/KingOfTheDeltaBluesSingers.jpg");
        album193.setFechaLanzamiento(LocalDate.of(1961, 10, 10));
        album193.setCanciones(Arrays.asList(
                new CancionDoc("Cross Road Blues"),
                new CancionDoc("Love in Vain"),
                new CancionDoc("Hellhound on My Trail"),
                new CancionDoc("Sweet Home Chicago")
        ));
        album193.setArtista(artista22); // Robert Johnson

// Álbum 194: "The Complete Recordings"
        AlbumColeccion album194 = new AlbumColeccion();
        album194.setNombre("The Complete Recordings");
        album194.setImagen("/albumes/TheCompleteRecordings.jpg");
        album194.setFechaLanzamiento(LocalDate.of(1990, 1, 1));
        album194.setCanciones(Arrays.asList(
                new CancionDoc("Cross Road Blues"),
                new CancionDoc("I Believe I'll Dust My Broom"),
                new CancionDoc("Stop Breakin' Down Blues"),
                new CancionDoc("Terraplane Blues")
        ));
        album194.setArtista(artista22); // Robert Johnson

// Álbum 195: "The Best of John Lee Hooker"
        AlbumColeccion album195 = new AlbumColeccion();
        album195.setNombre("The Best of John Lee Hooker");
        album195.setImagen("/albumes/TheBestOfJohnLeeHooker.jpg");
        album195.setFechaLanzamiento(LocalDate.of(1966, 1, 1));
        album195.setCanciones(Arrays.asList(
                new CancionDoc("Boom Boom"),
                new CancionDoc("I'm in the Mood"),
                new CancionDoc("Crawling King Snake"),
                new CancionDoc("House Rent Boogie")
        ));
        album195.setArtista(artista23); // John Lee Hooker

// Álbum 196: "Live at Cafe Au Go Go"
        AlbumColeccion album196 = new AlbumColeccion();
        album196.setNombre("Live at Cafe Au Go Go");
        album196.setImagen("/albumes/LiveAtCafeAuGoGo.jpg");
        album196.setFechaLanzamiento(LocalDate.of(1966, 10, 1));
        album196.setCanciones(Arrays.asList(
                new CancionDoc("Boom Boom"),
                new CancionDoc("I Can't Quit You Baby"),
                new CancionDoc("Whiskey and Wimmen"),
                new CancionDoc("Dust My Broom")
        ));
        album196.setArtista(artista23); // John Lee Hooker

// Álbum 197: "Unplugged"
        AlbumColeccion album197 = new AlbumColeccion();
        album197.setNombre("Unplugged");
        album197.setImagen("/albumes/Unplugged.jpg");
        album197.setFechaLanzamiento(LocalDate.of(1992, 8, 25));
        album197.setCanciones(Arrays.asList(
                new CancionDoc("Tears in Heaven"),
                new CancionDoc("Layla"),
                new CancionDoc("Layla (Unplugged)"),
                new CancionDoc("Before You Accuse Me")
        ));
        album197.setArtista(artista24); // Eric Clapton

// Álbum 198: "461 Ocean Boulevard"
        AlbumColeccion album198 = new AlbumColeccion();
        album198.setNombre("461 Ocean Boulevard");
        album198.setImagen("/albumes/461OceanBoulevard.jpg");
        album198.setFechaLanzamiento(LocalDate.of(1974, 7, 21));
        album198.setCanciones(Arrays.asList(
                new CancionDoc("I Shot the Sheriff"),
                new CancionDoc("Let It Grow"),
                new CancionDoc("Motherless Children"),
                new CancionDoc("Willie and the Hand Jive")
        ));
        album198.setArtista(artista24); // Eric Clapton

// Álbum 199: "The Complete Hank Williams"
        AlbumColeccion album199 = new AlbumColeccion();
        album199.setNombre("The Complete Hank Williams");
        album199.setImagen("/albumes/TheCompleteHankWilliams.jpg");
        album199.setFechaLanzamiento(LocalDate.of(1988, 1, 1));
        album199.setCanciones(Arrays.asList(
                new CancionDoc("Your Cheatin' Heart"),
                new CancionDoc("I'm So Lonesome I Could Cry"),
                new CancionDoc("Hey, Good Lookin'"),
                new CancionDoc("Jambalaya (On the Bayou)")
        ));
        album199.setArtista(artista25); // Hank Williams

// Álbum 200: "Hank Williams: 40 Greatest Hits"
        AlbumColeccion album200 = new AlbumColeccion();
        album200.setNombre("Hank Williams: 40 Greatest Hits");
        album200.setImagen("/albumes/HankWilliams40GreatestHits.jpg");
        album200.setFechaLanzamiento(LocalDate.of(1978, 6, 1));
        album200.setCanciones(Arrays.asList(
                new CancionDoc("Cold, Cold Heart"),
                new CancionDoc("Lovesick Blues"),
                new CancionDoc("I Can't Help It (If I'm Still in Love with You)"),
                new CancionDoc("I'll Never Get Out of This World Alive")
        ));
        album200.setArtista(artista25); // Hank Williams

// Álbum 201: "Jolene"
        AlbumColeccion album201 = new AlbumColeccion();
        album201.setNombre("Jolene");
        album201.setImagen("/albumes/Jolene.jpg");
        album201.setFechaLanzamiento(LocalDate.of(1973, 2, 4));
        album201.setCanciones(Arrays.asList(
                new CancionDoc("Jolene"),
                new CancionDoc("I Will Always Love You"),
                new CancionDoc("Coat of Many Colors"),
                new CancionDoc("Love Is Like a Butterfly")
        ));
        album201.setArtista(artista26); // Dolly Parton

// Álbum 202: "9 to 5 and Odd Jobs"
        AlbumColeccion album202 = new AlbumColeccion();
        album202.setNombre("9 to 5 and Odd Jobs");
        album202.setImagen("/albumes/9to5AndOddJobs.jpg");
        album202.setFechaLanzamiento(LocalDate.of(1980, 11, 1));
        album202.setCanciones(Arrays.asList(
                new CancionDoc("9 to 5"),
                new CancionDoc("But You Know I Love You"),
                new CancionDoc("Happiness"),
                new CancionDoc("The House of the Rising Sun")
        ));
        album202.setArtista(artista26); // Dolly Parton

// Álbum 203: "Red Headed Stranger"
        AlbumColeccion album203 = new AlbumColeccion();
        album203.setNombre("Red Headed Stranger");
        album203.setImagen("/albumes/RedHeadedStranger.jpg");
        album203.setFechaLanzamiento(LocalDate.of(1975, 4, 27));
        album203.setCanciones(Arrays.asList(
                new CancionDoc("Blue Eyes Crying in the Rain"),
                new CancionDoc("Red Headed Stranger"),
                new CancionDoc("Remember Me"),
                new CancionDoc("Time of the Preacher")
        ));
        album203.setArtista(artista27); // Willie Nelson

// Álbum 204: "Stardust"
        AlbumColeccion album204 = new AlbumColeccion();
        album204.setNombre("Stardust");
        album204.setImagen("/albumes/Stardust.jpg");
        album204.setFechaLanzamiento(LocalDate.of(1978, 4, 10));
        album204.setCanciones(Arrays.asList(
                new CancionDoc("Georgia on My Mind"),
                new CancionDoc("Blue Skies"),
                new CancionDoc("All of Me"),
                new CancionDoc("Unchained Melody")
        ));
        album204.setArtista(artista27); // Willie Nelson

// Álbum 205: "Luxury Liner"
        AlbumColeccion album205 = new AlbumColeccion();
        album205.setNombre("Luxury Liner");
        album205.setImagen("/albumes/LuxuryLiner.jpg");
        album205.setFechaLanzamiento(LocalDate.of(1977, 3, 1));
        album205.setCanciones(Arrays.asList(
                new CancionDoc("Pancho and Lefty"),
                new CancionDoc("Luxury Liner"),
                new CancionDoc("The Price You Pay"),
                new CancionDoc("One of These Days")
        ));
        album205.setArtista(artista28); // Emmylou Harris

// Álbum 206: "Wrecking Ball"
        AlbumColeccion album206 = new AlbumColeccion();
        album206.setNombre("Wrecking Ball");
        album206.setImagen("/albumes/WreckingBall.jpg");
        album206.setFechaLanzamiento(LocalDate.of(1995, 9, 26));
        album206.setCanciones(Arrays.asList(
                new CancionDoc("Wrecking Ball"),
                new CancionDoc("Goodbye"),
                new CancionDoc("All My Tears"),
                new CancionDoc("Sweet Old World")
        ));
        album206.setArtista(artista28); // Emmylou Harris

// Álbum 207: "Coal Miner's Daughter"
        AlbumColeccion album207 = new AlbumColeccion();
        album207.setNombre("Coal Miner’s Daughter");
        album207.setImagen("/albumes/Coalmine'sDaughter.jpg");
        album207.setFechaLanzamiento(LocalDate.of(1970, 8, 17));
        album207.setCanciones(Arrays.asList(
                new CancionDoc("Coal Miner’s Daughter"),
                new CancionDoc("The Pill"),
                new CancionDoc("One’s on the Way"),
                new CancionDoc("Hey Loretta")
        ));
        album207.setArtista(artista29); // Loretta Lynn

// Álbum 208: "Van Lear Rose"
        AlbumColeccion album208 = new AlbumColeccion();
        album208.setNombre("Van Lear Rose");
        album208.setImagen("/albumes/VanLearRose.jpg");
        album208.setFechaLanzamiento(LocalDate.of(2004, 4, 27));
        album208.setCanciones(Arrays.asList(
                new CancionDoc("Van Lear Rose"),
                new CancionDoc("Miss Being Mrs."),
                new CancionDoc("Trouble on the Line"),
                new CancionDoc("Family Tree")
        ));
        album208.setArtista(artista29); // Loretta Lynn

// Álbum 209: "Blizzard of Ozz"
        AlbumColeccion album209 = new AlbumColeccion();
        album209.setNombre("Blizzard of Ozz");
        album209.setImagen("/albumes/BlizzardOfOzz.jpg");
        album209.setFechaLanzamiento(LocalDate.of(1980, 9, 20));
        album209.setCanciones(Arrays.asList(
                new CancionDoc("Crazy Train"),
                new CancionDoc("Mr. Crowley"),
                new CancionDoc("I Don't Know"),
                new CancionDoc("Revelation (Mother Earth)")
        ));
        album209.setArtista(artista30); // Ozzy Osbourne

// Álbum 210: "No More Tears"
        AlbumColeccion album2100 = new AlbumColeccion();
        album2100.setNombre("No More Tears");
        album2100.setImagen("/albumes/NoMoreTears.jpg");
        album2100.setFechaLanzamiento(LocalDate.of(1991, 9, 17));
        album2100.setCanciones(Arrays.asList(
                new CancionDoc("Mama, I'm Coming Home"),
                new CancionDoc("No More Tears"),
                new CancionDoc("I Don't Want to Change the World"),
                new CancionDoc("Road to Nowhere")
        ));
        album2100.setArtista(artista30); // Ozzy Osbourne

// Álbum 211: "Resurrection"
        AlbumColeccion album211 = new AlbumColeccion();
        album211.setNombre("Resurrection");
        album211.setImagen("/albumes/Resurrection.jpg");
        album211.setFechaLanzamiento(LocalDate.of(2000, 5, 23));
        album211.setCanciones(Arrays.asList(
                new CancionDoc("Resurrection"),
                new CancionDoc("Made in Hell"),
                new CancionDoc("One on One"),
                new CancionDoc("Silent Screams")
        ));
        album211.setArtista(artista31); // Rob Halford

// Álbum 212: "Halford III: Winter Songs"
        AlbumColeccion album212 = new AlbumColeccion();
        album212.setNombre("Halford III: Winter Songs");
        album212.setImagen("/albumes/WinterSongs.jpg");
        album212.setFechaLanzamiento(LocalDate.of(2009, 10, 27));
        album212.setCanciones(Arrays.asList(
                new CancionDoc("Winter Song"),
                new CancionDoc("Get Into the Spirit"),
                new CancionDoc("Oh Come, Oh Come, Emmanuel"),
                new CancionDoc("We Three Kings")
        ));
        album212.setArtista(artista31); // Rob Halford

// Álbum 213: "Abigail"
        AlbumColeccion album213 = new AlbumColeccion();
        album213.setNombre("Abigail");
        album213.setImagen("/albumes/Abigail.jpg");
        album213.setFechaLanzamiento(LocalDate.of(1987, 3, 17));
        album213.setCanciones(Arrays.asList(
                new CancionDoc("A Mansion in Darkness"),
                new CancionDoc("The Family Ghost"),
                new CancionDoc("Abigail"),
                new CancionDoc("Black Horsemen")
        ));
        album213.setArtista(artista32); // King Diamond

// Álbum 214: "Conspiracy"
        AlbumColeccion album214 = new AlbumColeccion();
        album214.setNombre("Conspiracy");
        album214.setImagen("/albumes/Conspiracy.jpg");
        album214.setFechaLanzamiento(LocalDate.of(2003, 5, 13));
        album214.setCanciones(Arrays.asList(
                new CancionDoc("The Invisible Guests"),
                new CancionDoc("Sleepless Nights"),
                new CancionDoc("The Conspiracy"),
                new CancionDoc("At the Graves")
        ));
        album214.setArtista(artista32); // King Diamond

// Álbum 215: "Holy Diver"
        AlbumColeccion album215 = new AlbumColeccion();
        album215.setNombre("Holy Diver");
        album215.setImagen("/albumes/HolyDiver.jpg");
        album215.setFechaLanzamiento(LocalDate.of(1983, 5, 25));
        album215.setCanciones(Arrays.asList(
                new CancionDoc("Holy Diver"),
                new CancionDoc("Rainbow in the Dark"),
                new CancionDoc("Stand Up and Shout"),
                new CancionDoc("Don't Talk to Strangers")
        ));
        album215.setArtista(artista33); // Ronnie James Dio

// Álbum 216: "The Last in Line"
        AlbumColeccion album216 = new AlbumColeccion();
        album216.setNombre("The Last in Line");
        album216.setImagen("/albumes/TheLastInLine.jpg");
        album216.setFechaLanzamiento(LocalDate.of(1984, 7, 2));
        album216.setCanciones(Arrays.asList(
                new CancionDoc("We Rock"),
                new CancionDoc("The Last in Line"),
                new CancionDoc("Breathless"),
                new CancionDoc("Mystery")
        ));
        album216.setArtista(artista33); // Ronnie James Dio

// Álbum 217: "Bad Magic"
        AlbumColeccion album217 = new AlbumColeccion();
        album217.setNombre("Bad Magic");
        album217.setImagen("/albumes/BadMagic.jpg");
        album217.setFechaLanzamiento(LocalDate.of(2015, 8, 28));
        album217.setCanciones(Arrays.asList(
                new CancionDoc("Victory or Die"),
                new CancionDoc("Thunder & Lightning"),
                new CancionDoc("Fire Storm Hotel"),
                new CancionDoc("Shoot Out All of Your Lights")
        ));
        album217.setArtista(artista34); // Lemmy Kilmister

// Álbum 218: "Inferno"
        AlbumColeccion album218 = new AlbumColeccion();
        album218.setNombre("Inferno");
        album218.setImagen("/albumes/Inferno.jpg");
        album218.setFechaLanzamiento(LocalDate.of(2004, 6, 22));
        album218.setCanciones(Arrays.asList(
                new CancionDoc("Terminal Show"),
                new CancionDoc("In the Name of Tragedy"),
                new CancionDoc("Suicide"),
                new CancionDoc("In the Black")
        ));
        album218.setArtista(artista34); // Lemmy Kilmister

// Álbum 219: "Black on Both Sides"
        AlbumColeccion album219 = new AlbumColeccion();
        album219.setNombre("Black on Both Sides");
        album219.setImagen("/albumes/BlackOnBothSides.jpg");
        album219.setFechaLanzamiento(LocalDate.of(1999, 10, 12));
        album219.setCanciones(Arrays.asList(
                new CancionDoc("Mathematics"),
                new CancionDoc("Ms. Fat Booty"),
                new CancionDoc("Umi Says"),
                new CancionDoc("Brooklyn")
        ));
        album219.setArtista(artista35); // Mos Def

// Álbum 220: "The Ecstatic"
        AlbumColeccion album2200 = new AlbumColeccion();
        album2200.setNombre("The Ecstatic");
        album2200.setImagen("/albumes/TheEcstatic.jpg");
        album2200.setFechaLanzamiento(LocalDate.of(2009, 6, 9));
        album2200.setCanciones(Arrays.asList(
                new CancionDoc("Supermagic"),
                new CancionDoc("Casa Bey"),
                new CancionDoc("Auditorium"),
                new CancionDoc("The Embassy")
        ));
        album2200.setArtista(artista35); // Mos Def

// Álbum 221: "Madvillainy" (con Madlib)
        AlbumColeccion album221 = new AlbumColeccion();
        album221.setNombre("Madvillainy");
        album221.setImagen("/albumes/Madvillainy.jpg");
        album221.setFechaLanzamiento(LocalDate.of(2004, 3, 23));
        album221.setCanciones(Arrays.asList(
                new CancionDoc("All Caps"),
                new CancionDoc("Accordion"),
                new CancionDoc("Meat Grinder"),
                new CancionDoc("Rhinestone Cowboy")
        ));
        album221.setArtista(artista36); // MF DOOM (con Madlib)

// Álbum 222: "MM..Food"
        AlbumColeccion album222 = new AlbumColeccion();
        album222.setNombre("MM..Food");
        album222.setImagen("/albumes/MMFood.jpg");
        album222.setFechaLanzamiento(LocalDate.of(2004, 11, 16));
        album222.setCanciones(Arrays.asList(
                new CancionDoc("Beef Rapp"),
                new CancionDoc("Hoe Cakes"),
                new CancionDoc("Potholderz"),
                new CancionDoc("Deep Fried Frenz")
        ));
        album222.setArtista(artista36); // MF DOOM

// Álbum 223: "Illmatic"
        AlbumColeccion album223 = new AlbumColeccion();
        album223.setNombre("Illmatic");
        album223.setImagen("/albumes/Illmatic.jpg");
        album223.setFechaLanzamiento(LocalDate.of(1994, 4, 19));
        album223.setCanciones(Arrays.asList(
                new CancionDoc("N.Y. State of Mind"),
                new CancionDoc("The World Is Yours"),
                new CancionDoc("Life's a Bitch"),
                new CancionDoc("It Ain't Hard to Tell")
        ));
        album223.setArtista(artista37); // Nas

// Álbum 224: "Stillmatic"
        AlbumColeccion album224 = new AlbumColeccion();
        album224.setNombre("Stillmatic");
        album224.setImagen("/albumes/Stillmatic.jpg");
        album224.setFechaLanzamiento(LocalDate.of(2001, 12, 18));
        album224.setCanciones(Arrays.asList(
                new CancionDoc("Ether"),
                new CancionDoc("Got Ur Self A..."),
                new CancionDoc("One Mic"),
                new CancionDoc("2nd Childhood")
        ));
        album224.setArtista(artista37); // Nas

// Álbum 225: "2014 Forest Hills Drive"
        AlbumColeccion album225 = new AlbumColeccion();
        album225.setNombre("2014 Forest Hills Drive");
        album225.setImagen("/albumes/2014ForestHillsDrive.jpg");
        album225.setFechaLanzamiento(LocalDate.of(2014, 12, 9));
        album225.setCanciones(Arrays.asList(
                new CancionDoc("Wet Dreamz"),
                new CancionDoc("No Role Modelz"),
                new CancionDoc("G.O.M.D."),
                new CancionDoc("Love Yourz")
        ));
        album225.setArtista(artista38); // J. Cole

// Álbum 226: "KOD"
        AlbumColeccion album226 = new AlbumColeccion();
        album226.setNombre("KOD");
        album226.setImagen("/albumes/KOD.jpg");
        album226.setFechaLanzamiento(LocalDate.of(2018, 4, 20));
        album226.setCanciones(Arrays.asList(
                new CancionDoc("KOD"),
                new CancionDoc("ATM"),
                new CancionDoc("Photograph"),
                new CancionDoc("Friends")
        ));
        album226.setArtista(artista38); // J. Cole

// Álbum 227: "Tha Carter III"
        AlbumColeccion album227 = new AlbumColeccion();
        album227.setNombre("Tha Carter III");
        album227.setImagen("/albumes/ThaCarterIII.jpg");
        album227.setFechaLanzamiento(LocalDate.of(2008, 6, 10));
        album227.setCanciones(Arrays.asList(
                new CancionDoc("A Milli"),
                new CancionDoc("Lollipop"),
                new CancionDoc("Got Money"),
                new CancionDoc("Mrs. Officer")
        ));
        album227.setArtista(artista39); // Lil Wayne

// Álbum 228: "I Am Not a Human Being"
        AlbumColeccion album228 = new AlbumColeccion();
        album228.setNombre("I Am Not a Human Being");
        album228.setImagen("/albumes/IAmNotAHumanBeing.jpg");
        album228.setFechaLanzamiento(LocalDate.of(2010, 9, 27));
        album228.setCanciones(Arrays.asList(
                new CancionDoc("Gonorrhea"),
                new CancionDoc("Right Above It"),
                new CancionDoc("With You"),
                new CancionDoc("I Am Not a Human Being")
        ));
        album228.setArtista(artista39); // Lil Wayne

// Álbum 229: "Symphony No. 9"
        AlbumColeccion album229 = new AlbumColeccion();
        album229.setNombre("Symphony No. 9");
        album229.setImagen("/albumes/SymphonyNo9.jpg");
        album229.setFechaLanzamiento(LocalDate.of(1824, 5, 7));
        album229.setCanciones(Arrays.asList(
                new CancionDoc("Symphony No. 9 in D minor, Op. 125 - Allegro ma non troppo, un poco maestoso"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125 - Molto vivace"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125 - Adagio molto e cantabile"),
                new CancionDoc("Symphony No. 9 in D minor, Op. 125 - Finale: Presto")
        ));
        album229.setArtista(artista40); // Beethoven

// Álbum 230: "Piano Sonata No. 14 'Moonlight'"
        AlbumColeccion album230 = new AlbumColeccion();
        album230.setNombre("Piano Sonata No. 14 'Moonlight'");
        album230.setImagen("/albumes/MoonlightSonata.jpg");
        album230.setFechaLanzamiento(LocalDate.of(1801, 4, 9));
        album230.setCanciones(Arrays.asList(
                new CancionDoc("Piano Sonata No. 14 in C-sharp minor, Op. 27, No. 2 - Adagio sostenuto"),
                new CancionDoc("Piano Sonata No. 14 in C-sharp minor, Op. 27, No. 2 - Allegretto"),
                new CancionDoc("Piano Sonata No. 14 in C-sharp minor, Op. 27, No. 2 - Presto agitato")
        ));
        album230.setArtista(artista40); // Beethoven

// Álbum 231: "Requiem in D minor"
        AlbumColeccion album231 = new AlbumColeccion();
        album231.setNombre("Requiem in D minor");
        album231.setImagen("/albumes/RequiemMozart.jpg");
        album231.setFechaLanzamiento(LocalDate.of(1791, 12, 5));
        album231.setCanciones(Arrays.asList(
                new CancionDoc("Requiem in D minor, K. 626 - Introitus: Requiem aeternam"),
                new CancionDoc("Requiem in D minor, K. 626 - Kyrie eleison"),
                new CancionDoc("Requiem in D minor, K. 626 - Dies irae"),
                new CancionDoc("Requiem in D minor, K. 626 - Lacrimosa")
        ));
        album231.setArtista(artista41); // Mozart

// Álbum 232: "The Magic Flute"
        AlbumColeccion album232 = new AlbumColeccion();
        album232.setNombre("The Magic Flute");
        album232.setImagen("/albumes/TheMagicFlute.jpg");
        album232.setFechaLanzamiento(LocalDate.of(1791, 9, 30));
        album232.setCanciones(Arrays.asList(
                new CancionDoc("The Magic Flute, K. 620 - Overture"),
                new CancionDoc("The Magic Flute, K. 620 - Der Hölle Rache kocht in meinem Herzen"),
                new CancionDoc("The Magic Flute, K. 620 - Ach, ich fühl's"),
                new CancionDoc("The Magic Flute, K. 620 - Pa-Pa-Pa-Pa-Pa-Pa")
        ));
        album232.setArtista(artista41); // Mozart

// Álbum 233: "Brandenburg Concertos"
        AlbumColeccion album233 = new AlbumColeccion();
        album233.setNombre("Brandenburg Concertos");
        album233.setImagen("/albumes/BrandenburgConcertos.jpg");
        album233.setFechaLanzamiento(LocalDate.of(1721, 3, 24));
        album233.setCanciones(Arrays.asList(
                new CancionDoc("Brandenburg Concerto No. 1 in F major, BWV 1046 - I. Allegro"),
                new CancionDoc("Brandenburg Concerto No. 2 in F major, BWV 1047 - I. Allegro"),
                new CancionDoc("Brandenburg Concerto No. 3 in G major, BWV 1048 - I. Allegro"),
                new CancionDoc("Brandenburg Concerto No. 5 in D major, BWV 1050 - I. Allegro")
        ));
        album233.setArtista(artista42); // Bach

// Álbum 234: "Mass in B minor"
        AlbumColeccion album234 = new AlbumColeccion();
        album234.setNombre("Mass in B minor");
        album234.setImagen("/albumes/MassInBMinor.jpg");
        album234.setFechaLanzamiento(LocalDate.of(1749, 12, 20));
        album234.setCanciones(Arrays.asList(
                new CancionDoc("Mass in B minor, BWV 232 - Kyrie"),
                new CancionDoc("Mass in B minor, BWV 232 - Gloria"),
                new CancionDoc("Mass in B minor, BWV 232 - Credo"),
                new CancionDoc("Mass in B minor, BWV 232 - Sanctus")
        ));
        album234.setArtista(artista42); // Bach

// Álbum 149: "Nocturnes, Op. 9"
        AlbumColeccion album235 = new AlbumColeccion();
        album235.setNombre("Nocturnes, Op. 9");
        album235.setImagen("/albumes/NocturnesOp9.jpg");
        album235.setFechaLanzamiento(LocalDate.of(1830, 1, 1));
        album235.setCanciones(Arrays.asList(
                new CancionDoc("Nocturne in B-flat minor, Op. 9 No. 1"),
                new CancionDoc("Nocturne in E-flat major, Op. 9 No. 2"),
                new CancionDoc("Nocturne in B major, Op. 9 No. 3")
        ));
        album235.setArtista(artista43); // Chopin

// Álbum 150: "Piano Concerto No. 1 in E minor, Op. 11"
        AlbumColeccion album236 = new AlbumColeccion();
        album236.setNombre("Piano Concerto No. 1 in E minor, Op. 11");
        album236.setImagen("/albumes/PianoConcertoOp11.jpg");
        album236.setFechaLanzamiento(LocalDate.of(1830, 2, 11));
        album236.setCanciones(Arrays.asList(
                new CancionDoc("Piano Concerto No. 1 in E minor, Op. 11 - I. Allegro maestoso"),
                new CancionDoc("Piano Concerto No. 1 in E minor, Op. 11 - II. Romance: Larghetto"),
                new CancionDoc("Piano Concerto No. 1 in E minor, Op. 11 - III. Rondo: Vivace")
        ));
        album236.setArtista(artista43); // Chopin

// Álbum 151: "Cello Suites"
        AlbumColeccion album237 = new AlbumColeccion();
        album237.setNombre("Cello Suites");
        album237.setImagen("/albumes/CelloSuites.jpg");
        album237.setFechaLanzamiento(LocalDate.of(1936, 1, 1));
        album237.setCanciones(Arrays.asList(
                new CancionDoc("Cello Suite No. 1 in G major, BWV 1007 - Prélude"),
                new CancionDoc("Cello Suite No. 2 in D minor, BWV 1008 - Allemande"),
                new CancionDoc("Cello Suite No. 3 in C major, BWV 1009 - Gigue"),
                new CancionDoc("Cello Suite No. 6 in D major, BWV 1012 - Gigue")
        ));
        album237.setArtista(artista44); // Pablo Casals

// Álbum 152: "El Cello de Casals"
        AlbumColeccion album238 = new AlbumColeccion();
        album238.setNombre("El Cello de Casals");
        album238.setImagen("/albumes/ElCelloDeCasals.jpg");
        album238.setFechaLanzamiento(LocalDate.of(1947, 1, 1));
        album238.setCanciones(Arrays.asList(
                new CancionDoc("El Cello de Casals - Suite para Cello Solo"),
                new CancionDoc("El Cello de Casals - Adagio de Albinoni"),
                new CancionDoc("El Cello de Casals - Variaciones sobre un tema de Paganini")
        ));
        album238.setArtista(artista44); // Pablo Casals

// Álbum 153: "I Never Loved a Man the Way I Love You"
        AlbumColeccion album239 = new AlbumColeccion();
        album239.setNombre("I Never Loved a Man the Way I Love You");
        album239.setImagen("/albumes/INeverLoved.jpg");
        album239.setFechaLanzamiento(LocalDate.of(1967, 3, 10));
        album239.setCanciones(Arrays.asList(
                new CancionDoc("Respect"),
                new CancionDoc("I Never Loved a Man (The Way I Love You)"),
                new CancionDoc("Do Right Woman, Do Right Man"),
                new CancionDoc("Baby, Baby, Baby")
        ));
        album239.setArtista(artista45); // Aretha Franklin

// Álbum 154: "Amazing Grace"
        AlbumColeccion album240 = new AlbumColeccion();
        album240.setNombre("Amazing Grace");
        album240.setImagen("/albumes/AmazingGrace.jpg");
        album240.setFechaLanzamiento(LocalDate.of(1972, 6, 1));
        album240.setCanciones(Arrays.asList(
                new CancionDoc("Amazing Grace"),
                new CancionDoc("How I Got Over"),
                new CancionDoc("Precious Lord, Take My Hand"),
                new CancionDoc("You'll Never Walk Alone")
        ));
        album240.setArtista(artista45); // Aretha Franklin

// Álbum 155: "What's Going On"
        AlbumColeccion album241 = new AlbumColeccion();
        album241.setNombre("What's Going On");
        album241.setImagen("/albumes/WhatsGoingOn.jpg");
        album241.setFechaLanzamiento(LocalDate.of(1971, 5, 21));
        album241.setCanciones(Arrays.asList(
                new CancionDoc("What's Going On"),
                new CancionDoc("Mercy Mercy Me (The Ecology)"),
                new CancionDoc("Inner City Blues (Make Me Wanna Holler)"),
                new CancionDoc("Save the Children")
        ));
        album241.setArtista(artista46); // Marvin Gaye

// Álbum 156: "Let's Get It On"
        AlbumColeccion album242 = new AlbumColeccion();
        album242.setNombre("Let's Get It On");
        album242.setImagen("/albumes/LetsGetItOn.jpg");
        album242.setFechaLanzamiento(LocalDate.of(1973, 8, 28));
        album242.setCanciones(Arrays.asList(
                new CancionDoc("Let's Get It On"),
                new CancionDoc("Come Get to This"),
                new CancionDoc("Let's Get It On (Reprise)"),
                new CancionDoc("You Sure Love to Ball")
        ));
        album242.setArtista(artista46); // Marvin Gaye

// Álbum 157: "I Put a Spell on You"
        AlbumColeccion album243 = new AlbumColeccion();
        album243.setNombre("I Put a Spell on You");
        album243.setImagen("/albumes/IPutASpellOnYou.jpg");
        album243.setFechaLanzamiento(LocalDate.of(1965, 9, 1));
        album243.setCanciones(Arrays.asList(
                new CancionDoc("I Put a Spell on You"),
                new CancionDoc("Feeling Good"),
                new CancionDoc("Don't Let Me Be Misunderstood"),
                new CancionDoc("Sinner Man")
        ));
        album243.setArtista(artista47); // Nina Simone

// Álbum 158: "Pastel Blues"
        AlbumColeccion album244 = new AlbumColeccion();
        album244.setNombre("Pastel Blues");
        album244.setImagen("/albumes/PastelBlues.jpg");
        album244.setFechaLanzamiento(LocalDate.of(1959, 9, 1));
        album244.setCanciones(Arrays.asList(
                new CancionDoc("Mood Indigo"),
                new CancionDoc("Good Bait"),
                new CancionDoc("Don't Explain"),
                new CancionDoc("Little Girl Blue")
        ));
        album244.setArtista(artista47); // Nina Simone

// Álbum 159: "Hot Buttered Soul"
        AlbumColeccion album245 = new AlbumColeccion();
        album245.setNombre("Hot Buttered Soul");
        album245.setImagen("/albumes/HotButteredSoul.jpg");
        album245.setFechaLanzamiento(LocalDate.of(1969, 9, 23));
        album245.setCanciones(Arrays.asList(
                new CancionDoc("Walk On By"),
                new CancionDoc("Hyperbolicsyllabicsesquedalymistic"),
                new CancionDoc("By the Time I Get to Phoenix")
        ));
        album245.setArtista(artista48); // Isaac Hayes

// Álbum 160: "Shaft"
        AlbumColeccion album246 = new AlbumColeccion();
        album246.setNombre("Shaft");
        album246.setImagen("/albumes/Shaft.jpg");
        album246.setFechaLanzamiento(LocalDate.of(1971, 7, 16));
        album246.setCanciones(Arrays.asList(
                new CancionDoc("Theme from Shaft"),
                new CancionDoc("Shaft's Theme"),
                new CancionDoc("Cafe Regio's")
        ));
        album246.setArtista(artista48); // Isaac Hayes

// Álbum 161: "Songs in the Key of Life"
        AlbumColeccion album247 = new AlbumColeccion();
        album247.setNombre("Songs in the Key of Life");
        album247.setImagen("/albumes/SongsInTheKeyOfLife.jpg");
        album247.setFechaLanzamiento(LocalDate.of(1976, 9, 28));
        album247.setCanciones(Arrays.asList(
                new CancionDoc("Sir Duke"),
                new CancionDoc("Isn't She Lovely"),
                new CancionDoc("Pastime Paradise"),
                new CancionDoc("I Wish")
        ));
        album247.setArtista(artista49); // Stevie Wonder

// Álbum 162: "Innervisions"
        AlbumColeccion album248 = new AlbumColeccion();
        album248.setNombre("Innervisions");
        album248.setImagen("/albumes/Innervisions.jpg");
        album248.setFechaLanzamiento(LocalDate.of(1973, 8, 3));
        album248.setCanciones(Arrays.asList(
                new CancionDoc("Higher Ground"),
                new CancionDoc("Living for the City"),
                new CancionDoc("Don't You Worry 'Bout a Thing"),
                new CancionDoc("Too High")
        ));
        album248.setArtista(artista49); // Stevie Wonder

// Álbum 163: "The Idiot"
        AlbumColeccion album249 = new AlbumColeccion();
        album249.setNombre("The Idiot");
        album249.setImagen("/albumes/TheIdiot.jpg");
        album249.setFechaLanzamiento(LocalDate.of(1977, 3, 18));
        album249.setCanciones(Arrays.asList(
                new CancionDoc("Lust for Life"),
                new CancionDoc("Nightclubbing"),
                new CancionDoc("China Girl"),
                new CancionDoc("Dum Dum Boys")
        ));
        album249.setArtista(artista50); // Iggy Pop

// Álbum 164: "Lust for Life"
        AlbumColeccion album250 = new AlbumColeccion();
        album250.setNombre("Lust for Life");
        album250.setImagen("/albumes/LustForLife.jpg");
        album250.setFechaLanzamiento(LocalDate.of(1977, 8, 29));
        album250.setCanciones(Arrays.asList(
                new CancionDoc("Lust for Life"),
                new CancionDoc("The Passenger"),
                new CancionDoc("Success"),
                new CancionDoc("Tonight")
        ));
        album250.setArtista(artista50); // Iggy Pop

// Álbum 165: "Bad Reputation"
        AlbumColeccion album251 = new AlbumColeccion();
        album251.setNombre("Bad Reputation");
        album251.setImagen("/albumes/BadReputation.jpg");
        album251.setFechaLanzamiento(LocalDate.of(1981, 9, 28));
        album251.setCanciones(Arrays.asList(
                new CancionDoc("Bad Reputation"),
                new CancionDoc("Make Believe"),
                new CancionDoc("You Don't Own Me"),
                new CancionDoc("Crimson and Clover")
        ));
        album251.setArtista(artista51); // Joan Jett

// Álbum 166: "I Love Rock 'n' Roll"
        AlbumColeccion album252 = new AlbumColeccion();
        album252.setNombre("I Love Rock 'n' Roll");
        album252.setImagen("/albumes/ILoveRocknRoll.jpg");
        album252.setFechaLanzamiento(LocalDate.of(1981, 6, 20));
        album252.setCanciones(Arrays.asList(
                new CancionDoc("I Love Rock 'n' Roll"),
                new CancionDoc("Crimson and Clover"),
                new CancionDoc("Little Drummer Boy"),
                new CancionDoc("Love Is Pain")
        ));
        album252.setArtista(artista51); // Joan Jett

// Álbum 167: "Sid Sings"
        AlbumColeccion album253 = new AlbumColeccion();
        album253.setNombre("Sid Sings");
        album253.setImagen("/albumes/SidSings.jpg");
        album253.setFechaLanzamiento(LocalDate.of(1979, 12, 1));
        album253.setCanciones(Arrays.asList(
                new CancionDoc("My Way"),
                new CancionDoc("Belsen Was a Gas"),
                new CancionDoc("I Did It My Way"),
                new CancionDoc("Something Else")
        ));
        album253.setArtista(artista52); // Sid Vicious

// Álbum 168: "The Great Rock 'n' Roll Swindle"
        AlbumColeccion album254 = new AlbumColeccion();
        album254.setNombre("The Great Rock 'n' Roll Swindle");
        album254.setImagen("/albumes/TheGreatRocknRollSwindle.jpg");
        album254.setFechaLanzamiento(LocalDate.of(1979, 4, 10));
        album254.setCanciones(Arrays.asList(
                new CancionDoc("The Great Rock 'n' Roll Swindle"),
                new CancionDoc("Anarchy in the UK"),
                new CancionDoc("God Save the Queen"),
                new CancionDoc("No One Is Innocent")
        ));
        album254.setArtista(artista52); // Sid Vicious

// Álbum 169: "Horses"
        AlbumColeccion album255 = new AlbumColeccion();
        album255.setNombre("Horses");
        album255.setImagen("/albumes/Horses.jpg");
        album255.setFechaLanzamiento(LocalDate.of(1975, 11, 10));
        album255.setCanciones(Arrays.asList(
                new CancionDoc("Gloria"),
                new CancionDoc("Birdland"),
                new CancionDoc("Break It Up"),
                new CancionDoc("Kimberly")
        ));
        album255.setArtista(artista53); // Patti Smith

// Álbum 170: "Easter"
        AlbumColeccion album256 = new AlbumColeccion();
        album256.setNombre("Easter");
        album256.setImagen("/albumes/Easter.jpg");
        album256.setFechaLanzamiento(LocalDate.of(1978, 3, 3));
        album256.setCanciones(Arrays.asList(
                new CancionDoc("Because the Night"),
                new CancionDoc("Easter"),
                new CancionDoc("Rock 'n' Roll Nigger"),
                new CancionDoc("Space Monkey")
        ));
        album256.setArtista(artista53); // Patti Smith

// Álbum 171: "Billy Idol"
        AlbumColeccion album257 = new AlbumColeccion();
        album257.setNombre("Billy Idol");
        album257.setImagen("/albumes/BillyIdol.jpg");
        album257.setFechaLanzamiento(LocalDate.of(1982, 7, 16));
        album257.setCanciones(Arrays.asList(
                new CancionDoc("White Wedding"),
                new CancionDoc("Dancing with Myself"),
                new CancionDoc("Hot in the City"),
                new CancionDoc("Come On, Come On")
        ));
        album257.setArtista(artista54); // Billy Idol

// Álbum 172: "Rebel Yell"
        AlbumColeccion album258 = new AlbumColeccion();
        album258.setNombre("Rebel Yell");
        album258.setImagen("/albumes/RebelYell.jpg");
        album258.setFechaLanzamiento(LocalDate.of(1983, 11, 10));
        album258.setCanciones(Arrays.asList(
                new CancionDoc("Rebel Yell"),
                new CancionDoc("Eyes Without a Face"),
                new CancionDoc("Flesh for Fantasy"),
                new CancionDoc("Catch My Fall")
        ));
        album258.setArtista(artista54); // Billy Idol

// Álbum 173: "Live at the Apollo"
        AlbumColeccion album259 = new AlbumColeccion();
        album259.setNombre("Live at the Apollo");
        album259.setImagen("/albumes/LiveAtTheApollo.jpg");
        album259.setFechaLanzamiento(LocalDate.of(1963, 10, 24));
        album259.setCanciones(Arrays.asList(
                new CancionDoc("I'll Go Crazy"),
                new CancionDoc("Night Train"),
                new CancionDoc("Please, Please, Please"),
                new CancionDoc("Shout and Shimmy")
        ));
        album259.setArtista(artista55); // James Brown

// Álbum 174: "Sex Machine"
        AlbumColeccion album260 = new AlbumColeccion();
        album260.setNombre("Sex Machine");
        album260.setImagen("/albumes/SexMachine.jpg");
        album260.setFechaLanzamiento(LocalDate.of(1970, 4, 7));
        album174.setCanciones(Arrays.asList(
                new CancionDoc("Get Up (I Feel Like Being a) Sex Machine"),
                new CancionDoc("Brother Rapp"),
                new CancionDoc("I Got the Feelin'"),
                new CancionDoc("Mother Popcorn")
        ));
        album260.setArtista(artista55); // James Brown

// Álbum 175: "Mothership Connection"
        AlbumColeccion album261 = new AlbumColeccion();
        album261.setNombre("Mothership Connection");
        album261.setImagen("/albumes/MothershipConnection.jpg");
        album261.setFechaLanzamiento(LocalDate.of(1975, 12, 15));
        album261.setCanciones(Arrays.asList(
                new CancionDoc("Give Up the Funk (Tear the Roof off the Sucker)"),
                new CancionDoc("Mothership Connection (Star Child)"),
                new CancionDoc("Supergroovalisticprosifunkstication"),
                new CancionDoc("Unfunky UFO")
        ));
        album175.setArtista(artista56); // George Clinton

// Álbum 176: "Funkentelechy Vs. the Placebo Syndrome"
        AlbumColeccion album262 = new AlbumColeccion();
        album262.setNombre("Funkentelechy Vs. the Placebo Syndrome");
        album262.setImagen("/albumes/Funkentelechy.jpg");
        album262.setFechaLanzamiento(LocalDate.of(1977, 3, 1));
        album262.setCanciones(Arrays.asList(
                new CancionDoc("Funkentelechy"),
                new CancionDoc("Placebo Syndrome"),
                new CancionDoc("The Goose That Laid the Golden Egg"),
                new CancionDoc("Sir Nose On the Tracks of the World")
        ));
        album262.setArtista(artista56); // George Clinton

// Álbum 177: "Travelling Without Moving"
        AlbumColeccion album263 = new AlbumColeccion();
        album263.setNombre("Travelling Without Moving");
        album263.setImagen("/albumes/TravellingWithoutMoving.jpg");
        album263.setFechaLanzamiento(LocalDate.of(1996, 9, 9));
        album263.setCanciones(Arrays.asList(
                new CancionDoc("Virtual Insanity"),
                new CancionDoc("Cosmic Girl"),
                new CancionDoc("Travelling Without Moving"),
                new CancionDoc("Alright")
        ));
        album263.setArtista(artista57); // Jamiroquai

// Álbum 178: "A Funk Odyssey"
        AlbumColeccion album264 = new AlbumColeccion();
        album264.setNombre("A Funk Odyssey");
        album264.setImagen("/albumes/FunkOdyssey.jpg");
        album264.setFechaLanzamiento(LocalDate.of(2001, 9, 17));
        album264.setCanciones(Arrays.asList(
                new CancionDoc("Little L"),
                new CancionDoc("You Give Me Something"),
                new CancionDoc("Love Foolosophy"),
                new CancionDoc("Supersonic")
        ));
        album264.setArtista(artista57); // Jamiroquai

// Álbum 179: "Purple Rain"
        AlbumColeccion album265 = new AlbumColeccion();
        album265.setNombre("Purple Rain");
        album265.setImagen("/albumes/PurpleRain.jpg");
        album265.setFechaLanzamiento(LocalDate.of(1984, 6, 25));
        album265.setCanciones(Arrays.asList(
                new CancionDoc("Let's Go Crazy"),
                new CancionDoc("When Doves Cry"),
                new CancionDoc("Purple Rain"),
                new CancionDoc("I Would Die 4 U")
        ));
        album265.setArtista(artista58); // Prince

// Álbum 180: "1999"
        AlbumColeccion album266 = new AlbumColeccion();
        album266.setNombre("1999");
        album266.setImagen("/albumes/1999.jpg");
        album266.setFechaLanzamiento(LocalDate.of(1982, 10, 27));
        album266.setCanciones(Arrays.asList(
                new CancionDoc("1999"),
                new CancionDoc("Little Red Corvette"),
                new CancionDoc("Delirious"),
                new CancionDoc("DMSR")
        ));
        album266.setArtista(artista58); // Prince

// Álbum 181: "Street Songs"
        AlbumColeccion album267 = new AlbumColeccion();
        album267.setNombre("Street Songs");
        album267.setImagen("/albumes/StreetSongs.jpg");
        album267.setFechaLanzamiento(LocalDate.of(1981, 4, 16));
        album267.setCanciones(Arrays.asList(
                new CancionDoc("Super Freak"),
                new CancionDoc("Give It to Me Baby"),
                new CancionDoc("Ghetto Life"),
                new CancionDoc("Mary Jane")
        ));
        album267.setArtista(artista59); // Rick James

// Álbum 182: "Fire It Up"
        AlbumColeccion album268 = new AlbumColeccion();
        album268.setNombre("Fire It Up");
        album268.setImagen("/albumes/FireItUp.jpg");
        album268.setFechaLanzamiento(LocalDate.of(1982, 5, 4));
        album268.setCanciones(Arrays.asList(
                new CancionDoc("Fire It Up"),
                new CancionDoc("You and I"),
                new CancionDoc("Cold Blooded"),
                new CancionDoc("Big Time")
        ));
        album268.setArtista(artista59); // Rick James

// Álbum 183: "Laundry Service"
        AlbumColeccion album269 = new AlbumColeccion();
        album269.setNombre("Laundry Service");
        album269.setImagen("/albumes/LaundryService.jpg");
        album269.setFechaLanzamiento(LocalDate.of(2001, 11, 13));
        album269.setCanciones(Arrays.asList(
                new CancionDoc("Whenever, Wherever"),
                new CancionDoc("Underneath Your Clothes"),
                new CancionDoc("Te Dejo Madrid"),
                new CancionDoc("La Tortura")
        ));
        album269.setArtista(artista60); // Shakira

// Álbum 184: "Oral Fixation, Vol. 2"
        AlbumColeccion album270 = new AlbumColeccion();
        album270.setNombre("Oral Fixation, Vol. 2");
        album270.setImagen("/albumes/OralFixationVol2.jpg");
        album270.setFechaLanzamiento(LocalDate.of(2005, 11, 29));
        album270.setCanciones(Arrays.asList(
                new CancionDoc("Hips Don't Lie"),
                new CancionDoc("Illegal"),
                new CancionDoc("La Pared"),
                new CancionDoc("Animal City")
        ));
        album270.setArtista(artista60); // Shakira

// Álbum 271: "Clásicos de la Provincia"
        AlbumColeccion album271 = new AlbumColeccion();
        album271.setNombre("Clásicos de la Provincia");
        album271.setImagen("/albumes/ClasicosDeLaProvincia.jpg");
        album271.setFechaLanzamiento(LocalDate.of(1993, 9, 24));
        album271.setCanciones(Arrays.asList(
                new CancionDoc("La Tierra del Olvido"),
                new CancionDoc("Fruta Fresca"),
                new CancionDoc("Volví a Nacer"),
                new CancionDoc("Pa' Mayté")
        ));
        album271.setArtista(artista61); // Carlos Vives

// Álbum 272: "Vives"
        AlbumColeccion album272 = new AlbumColeccion();
        album272.setNombre("Vives");
        album272.setImagen("/albumes/Vives.jpg");
        album272.setFechaLanzamiento(LocalDate.of(2017, 9, 29));
        album272.setCanciones(Arrays.asList(
                new CancionDoc("La Bicicleta"),
                new CancionDoc("El Mar de sus Ojos"),
                new CancionDoc("Al Filo de tu Amor"),
                new CancionDoc("Robarte un Beso")
        ));
        album272.setArtista(artista61); // Carlos Vives

// Álbum 273: "Fíjate Bien"
        AlbumColeccion album273 = new AlbumColeccion();
        album273.setNombre("Fíjate Bien");
        album273.setImagen("/albumes/FijateBien.jpg");
        album273.setFechaLanzamiento(LocalDate.of(2000, 2, 1));
        album273.setCanciones(Arrays.asList(
                new CancionDoc("Fíjate Bien"),
                new CancionDoc("Mala Gente"),
                new CancionDoc("Es Por Ti"),
                new CancionDoc("A Dios le Pido")
        ));
        album273.setArtista(artista62); // Juanes

// Álbum 274: "La Vida... Es un Ratico"
        AlbumColeccion album274 = new AlbumColeccion();
        album274.setNombre("La Vida... Es un Ratico");
        album274.setImagen("/albumes/LaVidaEsUnRatico.jpg");
        album274.setFechaLanzamiento(LocalDate.of(2007, 10, 23));
        album274.setCanciones(Arrays.asList(
                new CancionDoc("Me Enamora"),
                new CancionDoc("La Camisa Negra"),
                new CancionDoc("Para tu Amor"),
                new CancionDoc("Lo Que Me Gusta a Mí")
        ));
        album274.setArtista(artista62); // Juanes

// Álbum 275: "Marc Anthony"
        AlbumColeccion album275 = new AlbumColeccion();
        album275.setNombre("Marc Anthony");
        album275.setImagen("/albumes/MarcAnthony.jpg");
        album275.setFechaLanzamiento(LocalDate.of(1999, 9, 21));
        album275.setCanciones(Arrays.asList(
                new CancionDoc("Vivir lo Nuestro"),
                new CancionDoc("Que Precio Tiene el Cielo"),
                new CancionDoc("Te Conozco Bien"),
                new CancionDoc("Y Hubo Alguien")
        ));
        album275.setArtista(artista63); // Marc Anthony

// Álbum 276: "Triunfo"
        AlbumColeccion album276 = new AlbumColeccion();
        album276.setNombre("Triunfo");
        album276.setImagen("/albumes/Triunfo.jpg");
        album276.setFechaLanzamiento(LocalDate.of(2004, 2, 10));
        album276.setCanciones(Arrays.asList(
                new CancionDoc("Y Ahora Quien"),
                new CancionDoc("Celos"),
                new CancionDoc("Mi Gente"),
                new CancionDoc("Que Manera de Quererte")
        ));
        album276.setArtista(artista63); // Marc Anthony

// Álbum 277: "Mi Tierra"
        AlbumColeccion album277 = new AlbumColeccion();
        album277.setNombre("Mi Tierra");
        album277.setImagen("/albumes/MiTierra.jpg");
        album277.setFechaLanzamiento(LocalDate.of(1993, 6, 2));
        album277.setCanciones(Arrays.asList(
                new CancionDoc("Mi Tierra"),
                new CancionDoc("Con los Años Que Me Quedan"),
                new CancionDoc("Santo Santo"),
                new CancionDoc("No Te Olvides")
        ));
        album277.setArtista(artista64); // Gloria Estefan

// Álbum 278: "Into the Light"
        AlbumColeccion album278 = new AlbumColeccion();
        album278.setNombre("Into the Light");
        album278.setImagen("/albumes/IntoTheLight.jpg");
        album278.setFechaLanzamiento(LocalDate.of(1997, 4, 8));
        album278.setCanciones(Arrays.asList(
                new CancionDoc("Heaven's What I Feel"),
                new CancionDoc("The Rhythm Is Gonna Get You"),
                new CancionDoc("Oye")
        ));
        album278.setArtista(artista64); // Gloria Estefan

// Álbum 279: "Confessions"
        AlbumColeccion album279 = new AlbumColeccion();
        album279.setNombre("Confessions");
        album279.setImagen("/albumes/Confessions.jpg");
        album279.setFechaLanzamiento(LocalDate.of(2004, 3, 23));
        album279.setCanciones(Arrays.asList(
                new CancionDoc("Yeah!"),
                new CancionDoc("Burn"),
                new CancionDoc("Confessions Part II"),
                new CancionDoc("U Got It Bad")
        ));
        album279.setArtista(artista65); // Usher

// Álbum 280: "8701"
        AlbumColeccion album280 = new AlbumColeccion();
        album280.setNombre("8701");
        album280.setImagen("/albumes/8701.jpg");
        album280.setFechaLanzamiento(LocalDate.of(2001, 8, 7));
        album280.setCanciones(Arrays.asList(
                new CancionDoc("U Got It Bad"),
                new CancionDoc("U Remind Me"),
                new CancionDoc("Can U Handle It"),
                new CancionDoc("Nice & Slow")
        ));
        album280.setArtista(artista65); // Usher

// Álbum 281: "Songs in A Minor"
        AlbumColeccion album281 = new AlbumColeccion();
        album281.setNombre("Songs in A Minor");
        album281.setImagen("/albumes/SongsInAMinor.jpg");
        album281.setFechaLanzamiento(LocalDate.of(2001, 6, 5));
        album281.setCanciones(Arrays.asList(
                new CancionDoc("Fallin'"),
                new CancionDoc("A Woman's Worth"),
                new CancionDoc("How Come You Don't Call Me"),
                new CancionDoc("Truth Is")
        ));
        album281.setArtista(artista66); // Alicia Keys

// Álbum 282: "The Diary of Alicia Keys"
        AlbumColeccion album282 = new AlbumColeccion();
        album282.setNombre("The Diary of Alicia Keys");
        album282.setImagen("/albumes/TheDiaryOfAliciaKeys.jpg");
        album282.setFechaLanzamiento(LocalDate.of(2003, 12, 2));
        album282.setCanciones(Arrays.asList(
                new CancionDoc("You Don't Know My Name"),
                new CancionDoc("If I Ain't Got You"),
                new CancionDoc("Diary"),
                new CancionDoc("Karma")
        ));
        album282.setArtista(artista66); // Alicia Keys

// Álbum 283: "Dangerously In Love"
        AlbumColeccion album283 = new AlbumColeccion();
        album283.setNombre("Dangerously In Love");
        album283.setImagen("/albumes/DangerouslyInLove.jpg");
        album283.setFechaLanzamiento(LocalDate.of(2003, 6, 24));
        album283.setCanciones(Arrays.asList(
                new CancionDoc("Crazy In Love"),
                new CancionDoc("Baby Boy"),
                new CancionDoc("Me, Myself and I"),
                new CancionDoc("Naughty Girl")
        ));
        album283.setArtista(artista67); // Beyoncé

// Álbum 284: "B'Day"
        AlbumColeccion album284 = new AlbumColeccion();
        album284.setNombre("B'Day");
        album284.setImagen("/albumes/BDay.jpg");
        album284.setFechaLanzamiento(LocalDate.of(2006, 9, 4));
        album284.setCanciones(Arrays.asList(
                new CancionDoc("Irreplaceable"),
                new CancionDoc("Deja Vu"),
                new CancionDoc("Get Me Bodied"),
                new CancionDoc("Ring the Alarm")
        ));
        album284.setArtista(artista67); // Beyoncé

// Álbum 285: "Starboy"
        AlbumColeccion album285 = new AlbumColeccion();
        album285.setNombre("Starboy");
        album285.setImagen("/albumes/Starboy.jpg");
        album285.setFechaLanzamiento(LocalDate.of(2016, 11, 25));
        album285.setCanciones(Arrays.asList(
                new CancionDoc("Starboy"),
                new CancionDoc("I Feel It Coming"),
                new CancionDoc("Party Monster"),
                new CancionDoc("Reminder")
        ));
        album285.setArtista(artista68); // The Weeknd

// Álbum 286: "After Hours"
        AlbumColeccion album286 = new AlbumColeccion();
        album286.setNombre("After Hours");
        album286.setImagen("/albumes/AfterHours.jpg");
        album286.setFechaLanzamiento(LocalDate.of(2020, 3, 20));
        album286.setCanciones(Arrays.asList(
                new CancionDoc("Blinding Lights"),
                new CancionDoc("Heartless"),
                new CancionDoc("Save Your Tears"),
                new CancionDoc("In Your Eyes")
        ));
        album286.setArtista(artista68); // The Weeknd

// Álbum 287: "Doo-Wops & Hooligans"
        AlbumColeccion album287 = new AlbumColeccion();
        album287.setNombre("Doo-Wops & Hooligans");
        album287.setImagen("/albumes/DooWopsAndHooligans.jpg");
        album287.setFechaLanzamiento(LocalDate.of(2010, 10, 5));
        album287.setCanciones(Arrays.asList(
                new CancionDoc("Just the Way You Are"),
                new CancionDoc("Grenade"),
                new CancionDoc("The Lazy Song"),
                new CancionDoc("Count On Me")
        ));
        album287.setArtista(artista69); // Bruno Mars

// Álbum 288: "Unorthodox Jukebox"
        AlbumColeccion album288 = new AlbumColeccion();
        album288.setNombre("Unorthodox Jukebox");
        album288.setImagen("/albumes/UnorthodoxJukebox.jpg");
        album288.setFechaLanzamiento(LocalDate.of(2012, 12, 11));
        album288.setCanciones(Arrays.asList(
                new CancionDoc("Locked Out of Heaven"),
                new CancionDoc("When I Was Your Man"),
                new CancionDoc("Treasure"),
                new CancionDoc("Gorilla")
        ));
        album288.setArtista(artista69); // Bruno Mars

// Álbum 289: "DS2" (Dirty Sprite 2)
        AlbumColeccion album289 = new AlbumColeccion();
        album289.setNombre("DS2 (Dirty Sprite 2)");
        album289.setImagen("/albumes/DS2.jpg");
        album289.setFechaLanzamiento(LocalDate.of(2015, 7, 17));
        album289.setCanciones(Arrays.asList(
                new CancionDoc("Where Ya At"),
                new CancionDoc("Stick Talk"),
                new CancionDoc("Thought It Was a Drought"),
                new CancionDoc("F*ck Up Some Commas")
        ));
        album289.setArtista(artista70); // Future

// Álbum 290: "What a Time to Be Alive"
        AlbumColeccion album290 = new AlbumColeccion();
        album290.setNombre("What a Time to Be Alive");
        album290.setImagen("/albumes/WhatATimeToBeAlive.jpg");
        album290.setFechaLanzamiento(LocalDate.of(2015, 9, 20));
        album290.setCanciones(Arrays.asList(
                new CancionDoc("Jumpman"),
                new CancionDoc("Big Rings"),
                new CancionDoc("Diamonds Dancing"),
                new CancionDoc("Live from the Gutter")
        ));
        album290.setArtista(artista70); // Future

// Álbum 291: "Astroworld"
        AlbumColeccion album291 = new AlbumColeccion();
        album291.setNombre("Astroworld");
        album291.setImagen("/albumes/Astroworld.jpg");
        album291.setFechaLanzamiento(LocalDate.of(2018, 8, 3));
        album291.setCanciones(Arrays.asList(
                new CancionDoc("SICKO MODE"),
                new CancionDoc("STARGAZING"),
                new CancionDoc("STOP TRYING TO BE GOD"),
                new CancionDoc("NO BYSTANDERS")
        ));
        album291.setArtista(artista71); // Travis Scott

// Álbum 292: "Rodeo"
        AlbumColeccion album292 = new AlbumColeccion();
        album292.setNombre("Rodeo");
        album292.setImagen("/albumes/Rodeo.jpg");
        album292.setFechaLanzamiento(LocalDate.of(2015, 9, 4));
        album292.setCanciones(Arrays.asList(
                new CancionDoc("3500"),
                new CancionDoc("Antidote"),
                new CancionDoc("Apple Pie"),
                new CancionDoc("Mamacita")
        ));
        album292.setArtista(artista71); // Travis Scott

// Álbum 293: "Stoney"
        AlbumColeccion album293 = new AlbumColeccion();
        album293.setNombre("Stoney");
        album293.setImagen("/albumes/Stoney.jpg");
        album293.setFechaLanzamiento(LocalDate.of(2016, 12, 9));
        album293.setCanciones(Arrays.asList(
                new CancionDoc("White Iverson"),
                new CancionDoc("Congratulations"),
                new CancionDoc("Go Flex"),
                new CancionDoc("Deja Vu")
        ));
        album293.setArtista(artista72); // Post Malone

// Álbum 294: "Beer Bongs & Bentleys"
        AlbumColeccion album294 = new AlbumColeccion();
        album294.setNombre("Beer Bongs & Bentleys");
        album294.setImagen("/albumes/BeerBongsAndBentleys.jpg");
        album294.setFechaLanzamiento(LocalDate.of(2018, 4, 27));
        album294.setCanciones(Arrays.asList(
                new CancionDoc("Rockstar"),
                new CancionDoc("Psycho"),
                new CancionDoc("Better Now"),
                new CancionDoc("Wow.")
        ));
        album294.setArtista(artista72); // Post Malone

// Álbum 295: "Life of a Dark Rose"
        AlbumColeccion album295 = new AlbumColeccion();
        album295.setNombre("Life of a Dark Rose");
        album295.setImagen("/albumes/LifeOfADarkRose.jpg");
        album295.setFechaLanzamiento(LocalDate.of(2018, 1, 19));
        album295.setCanciones(Arrays.asList(
                new CancionDoc("Red Roses"),
                new CancionDoc("Nowadays"),
                new CancionDoc("I Know You"),
                new CancionDoc("Cloudy Eyes")
        ));
        album295.setArtista(artista73); // Lil Skies

// Álbum 296: "Unbothered"
        AlbumColeccion album296 = new AlbumColeccion();
        album296.setNombre("Unbothered");
        album296.setImagen("/albumes/Unbothered.jpg");
        album296.setFechaLanzamiento(LocalDate.of(2019, 3, 1));
        album296.setCanciones(Arrays.asList(
                new CancionDoc("Rude"),
                new CancionDoc("I Don't Miss"),
                new CancionDoc("Famous"),
                new CancionDoc("Do It All")
        ));
        album296.setArtista(artista74); // Lil Skies

// Álbum 297: "M10"
        AlbumColeccion album297 = new AlbumColeccion();
        album297.setNombre("M10");
        album297.setImagen("/albumes/M10.jpg");
        album297.setFechaLanzamiento(LocalDate.of(2020, 6, 10));
        album297.setCanciones(Arrays.asList(
                new CancionDoc("No Me Conocen"),
                new CancionDoc("Me Mentiste"),
                new CancionDoc("La Melodía de Mi Cabeza"),
                new CancionDoc("Dosis")
        ));
        album297.setArtista(artista74); // Dillom

// Álbum 298: "Haciendo Historia"
        AlbumColeccion album298 = new AlbumColeccion();
        album298.setNombre("Haciendo Historia");
        album298.setImagen("/albumes/HaciendoHistoria.jpg");
        album298.setFechaLanzamiento(LocalDate.of(2021, 11, 19));
        album298.setCanciones(Arrays.asList(
                new CancionDoc("Solo No"),
                new CancionDoc("Fase Oscura"),
                new CancionDoc("Fluir"),
                new CancionDoc("Tus Lentes")
        ));
        album298.setArtista(artista74); // Dillom

// Álbum 299: "18 Months"
        AlbumColeccion album299 = new AlbumColeccion();
        album299.setNombre("18 Months");
        album299.setImagen("/albumes/18Months.jpg");
        album299.setFechaLanzamiento(LocalDate.of(2012, 10, 29));
        album299.setCanciones(Arrays.asList(
                new CancionDoc("We Found Love"),
                new CancionDoc("Feel So Close"),
                new CancionDoc("Let's Go"),
                new CancionDoc("Sweet Nothing")
        ));
        album299.setArtista(artista75); // Calvin Harris

// Álbum 300: "Funk Wav Bounces Vol. 1"
        AlbumColeccion album300 = new AlbumColeccion();
        album300.setNombre("Funk Wav Bounces Vol. 1");
        album300.setImagen("/albumes/FunkWavBouncesVol1.jpg");
        album300.setFechaLanzamiento(LocalDate.of(2017, 6, 30));
        album300.setCanciones(Arrays.asList(
                new CancionDoc("Slide"),
                new CancionDoc("Rollin'"),
                new CancionDoc("Feels"),
                new CancionDoc("Cash Out")
        ));
        album300.setArtista(artista75); // Calvin Harris

// Álbum 301: "One Love"
        AlbumColeccion album301 = new AlbumColeccion();
        album301.setNombre("One Love");
        album301.setImagen("/albumes/OneLove.jpg");
        album301.setFechaLanzamiento(LocalDate.of(2009, 8, 24));
        album301.setCanciones(Arrays.asList(
                new CancionDoc("When Love Takes Over"),
                new CancionDoc("Sexy Bitch"),
                new CancionDoc("Memories"),
                new CancionDoc("I Gotta Feeling")
        ));
        album301.setArtista(artista76); // David Guetta

// Álbum 302: "Nothing But the Beat"
        AlbumColeccion album302 = new AlbumColeccion();
        album302.setNombre("Nothing But the Beat");
        album302.setImagen("/albumes/NothingButTheBeat.jpg");
        album302.setFechaLanzamiento(LocalDate.of(2011, 8, 26));
        album302.setCanciones(Arrays.asList(
                new CancionDoc("Where Them Girls At"),
                new CancionDoc("Titanium"),
                new CancionDoc("Without You"),
                new CancionDoc("Play Hard")
        ));
        album302.setArtista(artista76); // David Guetta

// Álbum 303: "4x4=12"
        AlbumColeccion album303 = new AlbumColeccion();
        album303.setNombre("4x4=12");
        album303.setImagen("/albumes/4x4=12.jpg");
        album303.setFechaLanzamiento(LocalDate.of(2010, 12, 7));
        album303.setCanciones(Arrays.asList(
                new CancionDoc("Some Chords"),
                new CancionDoc("Animal Rights"),
                new CancionDoc("Not Exactly"),
                new CancionDoc("Sofi Needs a Ladder")
        ));
        album303.setArtista(artista77); // Deadmau5

// Álbum 304: "While(1<2)"
        AlbumColeccion album304 = new AlbumColeccion();
        album304.setNombre("While(1<2)");
        album304.setImagen("/albumes/While1<2.jpg");
        album304.setFechaLanzamiento(LocalDate.of(2014, 6, 17));
        album304.setCanciones(Arrays.asList(
                new CancionDoc("The Veldt"),
                new CancionDoc("Seeya"),
                new CancionDoc("Aural Psynapse"),
                new CancionDoc("Infra Turbo Pigcart Racer")
        ));
        album304.setArtista(artista77); // Deadmau5

// Álbum 305: "True"
        AlbumColeccion album305 = new AlbumColeccion();
        album305.setNombre("True");
        album305.setImagen("/albumes/True.jpg");
        album305.setFechaLanzamiento(LocalDate.of(2013, 9, 13));
        album305.setCanciones(Arrays.asList(
                new CancionDoc("Wake Me Up"),
                new CancionDoc("Hey Brother"),
                new CancionDoc("Addicted to You"),
                new CancionDoc("Dear Boy")
        ));
        album305.setArtista(artista78); // Avicii

// Álbum 306: "Stories"
        AlbumColeccion album306 = new AlbumColeccion();
        album306.setNombre("Stories");
        album306.setImagen("/albumes/Stories.jpg");
        album306.setFechaLanzamiento(LocalDate.of(2015, 10, 2));
        album306.setCanciones(Arrays.asList(
                new CancionDoc("Waiting for Love"),
                new CancionDoc("For a Better Day"),
                new CancionDoc("Pure Grinding"),
                new CancionDoc("Broken Arrows")
        ));
        album306.setArtista(artista78); // Avicii

// Álbum 307: "Scary Monsters and Nice Sprites"
        AlbumColeccion album307 = new AlbumColeccion();
        album307.setNombre("Scary Monsters and Nice Sprites");
        album307.setImagen("/albumes/ScaryMonstersAndNiceSprites.jpg");
        album307.setFechaLanzamiento(LocalDate.of(2010, 10, 22));
        album307.setCanciones(Arrays.asList(
                new CancionDoc("Scary Monsters and Nice Sprites"),
                new CancionDoc("Rock n' Roll (Will Take You to the Mountain)"),
                new CancionDoc("With You, Friends"),
                new CancionDoc("Kill Everybody")
        ));
        album307.setArtista(artista79); // Skrillex

// Álbum 308: "Recess"
        AlbumColeccion album308 = new AlbumColeccion();
        album308.setNombre("Recess");
        album308.setImagen("/albumes/Recess.jpg");
        album308.setFechaLanzamiento(LocalDate.of(2014, 3, 18));
        album308.setCanciones(Arrays.asList(
                new CancionDoc("Recess"),
                new CancionDoc("Ragga Bomb"),
                new CancionDoc("Stranger"),
                new CancionDoc("Ease My Mind")
        ));
        album308.setArtista(artista79); // Skrillex

// Álbum 309: "Hand. Cannot. Erase."
        AlbumColeccion album309 = new AlbumColeccion();
        album309.setNombre("Hand. Cannot. Erase.");
        album309.setImagen("/albumes/HandCannotErase.jpg");
        album309.setFechaLanzamiento(LocalDate.of(2015, 2, 27));
        album309.setCanciones(Arrays.asList(
                new CancionDoc("First Regret"),
                new CancionDoc("3 Years Older"),
                new CancionDoc("Perfect Life"),
                new CancionDoc("Hand. Cannot. Erase.")
        ));
        album309.setArtista(artista80); // Steven Wilson

// Álbum 310: "The Raven That Refused to Sing"
        AlbumColeccion album310 = new AlbumColeccion();
        album310.setNombre("The Raven That Refused to Sing");
        album310.setImagen("/albumes/TheRavenThatRefusedToSing.jpg");
        album310.setFechaLanzamiento(LocalDate.of(2013, 2, 25));
        album310.setCanciones(Arrays.asList(
                new CancionDoc("Luminol"),
                new CancionDoc("Drive Home"),
                new CancionDoc("The Raven That Refused to Sing"),
                new CancionDoc("The Watchmaker")
        ));
        album310.setArtista(artista80); // Steven Wilson

// Álbum 311: "The Six Wives of Henry VIII"
        AlbumColeccion album311 = new AlbumColeccion();
        album311.setNombre("The Six Wives of Henry VIII");
        album311.setImagen("/albumes/TheSixWivesOfHenryVIII.jpg");
        album311.setFechaLanzamiento(LocalDate.of(1973, 1, 1));
        album311.setCanciones(Arrays.asList(
                new CancionDoc("Catherine of Aragon"),
                new CancionDoc("Anne of Cleves"),
                new CancionDoc("Catherine Howard"),
                new CancionDoc("Jane Seymour")
        ));
        album311.setArtista(artista81); // Rick Wakeman

// Álbum 312: "Journey to the Centre of the Earth"
        AlbumColeccion album312 = new AlbumColeccion();
        album312.setNombre("Journey to the Centre of the Earth");
        album312.setImagen("/albumes/JourneyToTheCentreOfTheEarth.jpg");
        album312.setFechaLanzamiento(LocalDate.of(1974, 5, 1));
        album312.setCanciones(Arrays.asList(
                new CancionDoc("The Journey"),
                new CancionDoc("The Battle"),
                new CancionDoc("The Forest"),
                new CancionDoc("The Arrival")
        ));
        album312.setArtista(artista81); // Rick Wakeman

// Álbum 313: "So"
        AlbumColeccion album313 = new AlbumColeccion();
        album313.setNombre("So");
        album313.setImagen("/albumes/So.jpg");
        album313.setFechaLanzamiento(LocalDate.of(1986, 5, 19));
        album313.setCanciones(Arrays.asList(
                new CancionDoc("Sledgehammer"),
                new CancionDoc("Big Time"),
                new CancionDoc("Don't Give Up"),
                new CancionDoc("In Your Eyes")
        ));
        album313.setArtista(artista82); // Peter Gabriel

// Álbum 314: "Security"
        AlbumColeccion album314 = new AlbumColeccion();
        album314.setNombre("Security");
        album314.setImagen("/albumes/Security.jpg");
        album314.setFechaLanzamiento(LocalDate.of(1982, 9, 12));
        album314.setCanciones(Arrays.asList(
                new CancionDoc("The Rhythm of the Heat"),
                new CancionDoc("San Jacinto"),
                new CancionDoc("I Have the Touch"),
                new CancionDoc("Shock the Monkey")
        ));
        album314.setArtista(artista82); // Peter Gabriel

// Álbum 315: "Olias of Sunhillow"
        AlbumColeccion album315 = new AlbumColeccion();
        album315.setNombre("Olias of Sunhillow");
        album315.setImagen("/albumes/OliasOfSunhillow.jpg");
        album315.setFechaLanzamiento(LocalDate.of(1976, 8, 25));
        album315.setCanciones(Arrays.asList(
                new CancionDoc("Ocean Song"),
                new CancionDoc("Sound Out the Galleon"),
                new CancionDoc("Don't Take No for an Answer"),
                new CancionDoc("Let Go")
        ));
        album315.setArtista(artista83); // Jon Anderson

// Álbum 316: "The 3rd Eye"
        AlbumColeccion album316 = new AlbumColeccion();
        album316.setNombre("The 3rd Eye");
        album316.setImagen("/albumes/The3rdEye.jpg");
        album316.setFechaLanzamiento(LocalDate.of(1997, 10, 21));
        album316.setCanciones(Arrays.asList(
                new CancionDoc("The 3rd Eye"),
                new CancionDoc("Angel's Share"),
                new CancionDoc("Light of the Seven Worlds"),
                new CancionDoc("Morning Star")
        ));
        album316.setArtista(artista83); // Jon Anderson

// Álbum 317: "Emerson, Lake & Palmer"
        AlbumColeccion album317 = new AlbumColeccion();
        album317.setNombre("Emerson, Lake & Palmer");
        album317.setImagen("/albumes/EmersonLakeAndPalmer.jpg");
        album317.setFechaLanzamiento(LocalDate.of(1970, 11, 20));
        album317.setCanciones(Arrays.asList(
                new CancionDoc("The Barbarian"),
                new CancionDoc("Knife-Edge"),
                new CancionDoc("Tank"),
                new CancionDoc("Lucky Man")
        ));
        album317.setArtista(artista84); // Keith Emerson

// Álbum 318: "Tarkus"
        AlbumColeccion album318 = new AlbumColeccion();
        album318.setNombre("Tarkus");
        album318.setImagen("/albumes/Tarkus.jpg");
        album318.setFechaLanzamiento(LocalDate.of(1971, 6, 4));
        album318.setCanciones(Arrays.asList(
                new CancionDoc("Tarkus"),
                new CancionDoc("Jeremy Bender"),
                new CancionDoc("Bitches Crystal"),
                new CancionDoc("The Only Way")
        ));
        album318.setArtista(artista84); // Keith Emerson

// Álbum 319: "Odelay"
        AlbumColeccion album319 = new AlbumColeccion();
        album319.setNombre("Odelay");
        album319.setImagen("/albumes/Odelay.jpg");
        album319.setFechaLanzamiento(LocalDate.of(1996, 6, 18));
        album319.setCanciones(Arrays.asList(
                new CancionDoc("Where It's At"),
                new CancionDoc("Devils Haircut"),
                new CancionDoc("The New Pollution"),
                new CancionDoc("Jack-Ass")
        ));
        album319.setArtista(artista85); // Beck

// Álbum 320: "Sea Change"
        AlbumColeccion album320 = new AlbumColeccion();
        album320.setNombre("Sea Change");
        album320.setImagen("/albumes/SeaChange.jpg");
        album320.setFechaLanzamiento(LocalDate.of(2002, 9, 24));
        album320.setCanciones(Arrays.asList(
                new CancionDoc("The Golden Age"),
                new CancionDoc("Lost Cause"),
                new CancionDoc("Guess I'm Doing Fine"),
                new CancionDoc("Lonesome Tears")
        ));
        album320.setArtista(artista85); // Beck

// Álbum 321: "To Bring You My Love"
        AlbumColeccion album321 = new AlbumColeccion();
        album321.setNombre("To Bring You My Love");
        album321.setImagen("/albumes/ToBringYouMyLove.jpg");
        album321.setFechaLanzamiento(LocalDate.of(1995, 2, 27));
        album321.setCanciones(Arrays.asList(
                new CancionDoc("Down by the Water"),
                new CancionDoc("C'mon Billy"),
                new CancionDoc("Send His Love to Me"),
                new CancionDoc("The Dancer")
        ));
        album321.setArtista(artista86); // PJ Harvey

// Álbum 322: "Let England Shake"
        AlbumColeccion album322 = new AlbumColeccion();
        album322.setNombre("Let England Shake");
        album322.setImagen("/albumes/LetEnglandShake.jpg");
        album322.setFechaLanzamiento(LocalDate.of(2011, 2, 14));
        album322.setCanciones(Arrays.asList(
                new CancionDoc("The Last Living Rose"),
                new CancionDoc("Written on the Forehead"),
                new CancionDoc("The Glorious Land"),
                new CancionDoc("The Words That Maketh Murder")
        ));
        album322.setArtista(artista86); // PJ Harvey

// Álbum 323: "Little Earthquakes"
        AlbumColeccion album323 = new AlbumColeccion();
        album323.setNombre("Little Earthquakes");
        album323.setImagen("/albumes/LittleEarthquakes.jpg");
        album323.setFechaLanzamiento(LocalDate.of(1992, 1, 13));
        album323.setCanciones(Arrays.asList(
                new CancionDoc("Crucify"),
                new CancionDoc("Silent All These Years"),
                new CancionDoc("Winter"),
                new CancionDoc("Tear in Your Hand")
        ));
        album323.setArtista(artista87); // Tori Amos

// Álbum 324: "Under the Pink"
        AlbumColeccion album324 = new AlbumColeccion();
        album324.setNombre("Under the Pink");
        album324.setImagen("/albumes/UnderThePink.jpg");
        album324.setFechaLanzamiento(LocalDate.of(1994, 1, 31));
        album324.setCanciones(Arrays.asList(
                new CancionDoc("Pretty Good Year"),
                new CancionDoc("God"),
                new CancionDoc("Cornflake Girl"),
                new CancionDoc("The Waitress")
        ));
        album324.setArtista(artista87); // Tori Amos

// Álbum 325: "Post"
        AlbumColeccion album325 = new AlbumColeccion();
        album325.setNombre("Post");
        album325.setImagen("/albumes/Post.jpg");
        album325.setFechaLanzamiento(LocalDate.of(1995, 6, 13));
        album325.setCanciones(Arrays.asList(
                new CancionDoc("Army of Me"),
                new CancionDoc("Hyperballad"),
                new CancionDoc("It's Oh So Quiet"),
                new CancionDoc("Isobel")
        ));
        album325.setArtista(artista88); // Björk

// Álbum 326: "Homogenic"
        AlbumColeccion album326 = new AlbumColeccion();
        album326.setNombre("Homogenic");
        album326.setImagen("/albumes/Homogenic.jpg");
        album326.setFechaLanzamiento(LocalDate.of(1997, 9, 22));
        album326.setCanciones(Arrays.asList(
                new CancionDoc("Hunter"),
                new CancionDoc("Bachelorette"),
                new CancionDoc("All is Full of Love"),
                new CancionDoc("Joga")
        ));
        album326.setArtista(artista88); // Björk

// Álbum 327: "Lonerism"
        AlbumColeccion album327 = new AlbumColeccion();
        album327.setNombre("Lonerism");
        album327.setImagen("/albumes/Lonerism.jpg");
        album327.setFechaLanzamiento(LocalDate.of(2012, 10, 5));
        album327.setCanciones(Arrays.asList(
                new CancionDoc("Feels Like We Only Go Backwards"),
                new CancionDoc("Mind Mischief"),
                new CancionDoc("Why Won't They Talk to Me?"),
                new CancionDoc("Elephant")
        ));
        album327.setArtista(artista89); // Tame Impala

// Álbum 328: "Currents"
        AlbumColeccion album328 = new AlbumColeccion();
        album328.setNombre("Currents");
        album328.setImagen("/albumes/Currents.jpg");
        album328.setFechaLanzamiento(LocalDate.of(2015, 7, 17));
        album328.setCanciones(Arrays.asList(
                new CancionDoc("Let It Happen"),
                new CancionDoc("The Less I Know the Better"),
                new CancionDoc("Cause I'm a Man"),
                new CancionDoc("Eventually")
        ));
        album328.setArtista(artista89); // Tame Impala

        List<AlbumColeccion> albumes = new ArrayList<>();

        albumes.add(album1);
        albumes.add(album2);
        albumes.add(album3);
        albumes.add(album4);
        albumes.add(album5);
        albumes.add(album6);
        albumes.add(album7);
        albumes.add(album8);
        albumes.add(album9);
        albumes.add(album10);
        albumes.add(album11);
        albumes.add(album12);
        albumes.add(album13);
        albumes.add(album14);
        albumes.add(album15);
        albumes.add(album16);
        albumes.add(album17);
        albumes.add(album18);
        albumes.add(album19);
        albumes.add(album20);
        albumes.add(album21);
        albumes.add(album22);
        albumes.add(album23);
        albumes.add(album24);
        albumes.add(album25);
        albumes.add(album26);
        albumes.add(album27);
        albumes.add(album28);
        albumes.add(album29);
        albumes.add(album30);
        albumes.add(album31);
        albumes.add(album32);
        albumes.add(album33);
        albumes.add(album34);
        albumes.add(album35);
        albumes.add(album36);
        albumes.add(album37);
        albumes.add(album38);
        albumes.add(album39);
        albumes.add(album40);
        albumes.add(album41);
        albumes.add(album42);
        albumes.add(album43);
        albumes.add(album44);
        albumes.add(album45);
        albumes.add(album46);
        albumes.add(album47);
        albumes.add(album48);
        albumes.add(album49);
        albumes.add(album50);
        albumes.add(album51);
        albumes.add(album52);
        albumes.add(album53);
        albumes.add(album54);
        albumes.add(album55);
        albumes.add(album56);
        albumes.add(album57);
        albumes.add(album58);
        albumes.add(album59);
        albumes.add(album60);
        albumes.add(album61);
        albumes.add(album62);
        albumes.add(album63);
        albumes.add(album64);
        albumes.add(album65);
        albumes.add(album66);
        albumes.add(album67);
        albumes.add(album68);
        albumes.add(album69);
        albumes.add(album70);
        albumes.add(album71);
        albumes.add(album72);
        albumes.add(album73);
        albumes.add(album74);
        albumes.add(album75);
        albumes.add(album76);
        albumes.add(album77);
        albumes.add(album78);
        albumes.add(album79);
        albumes.add(album80);
        albumes.add(album81);
        albumes.add(album82);
        albumes.add(album83);
        albumes.add(album84);
        albumes.add(album85);
        albumes.add(album86);
        albumes.add(album87);
        albumes.add(album88);
        albumes.add(album89);
        albumes.add(album90);
        albumes.add(album91);
        albumes.add(album92);
        albumes.add(album93);
        albumes.add(album94);
        albumes.add(album95);
        albumes.add(album96);
        albumes.add(album97);
        albumes.add(album98);
        albumes.add(album99);
        albumes.add(album100);
        albumes.add(album101);
        albumes.add(album102);
        albumes.add(album103);
        albumes.add(album104);
        albumes.add(album105);
        albumes.add(album106);
        albumes.add(album107);
        albumes.add(album108);
        albumes.add(album109);
        albumes.add(album110);
        albumes.add(album111);
        albumes.add(album112);
        albumes.add(album113);
        albumes.add(album114);
        albumes.add(album115);
        albumes.add(album116);
        albumes.add(album117);
        albumes.add(album118);
        albumes.add(album119);
        albumes.add(album120);
        albumes.add(album121);
        albumes.add(album122);
        albumes.add(album123);
        albumes.add(album124);
        albumes.add(album125);
        albumes.add(album126);
        albumes.add(album127);
        albumes.add(album128);
        albumes.add(album129);
        albumes.add(album130);
        albumes.add(album131);
        albumes.add(album132);
        albumes.add(album133);
        albumes.add(album134);
        albumes.add(album135);
        albumes.add(album136);
        albumes.add(album137);
        albumes.add(album138);
        albumes.add(album139);
        albumes.add(album140);
        albumes.add(album141);
        albumes.add(album142);
        albumes.add(album143);
        albumes.add(album144);
        albumes.add(album145);
        albumes.add(album146);
        albumes.add(album147);
        albumes.add(album148);
        albumes.add(album149);
        albumes.add(album150);
        albumes.add(album151);
        albumes.add(album152);
        albumes.add(album153);
        albumes.add(album154);
        albumes.add(album155);
        albumes.add(album156);
        albumes.add(album157);
        albumes.add(album158);
        albumes.add(album159);
        albumes.add(album160);
        albumes.add(album161);
        albumes.add(album162);
        albumes.add(album163);
        albumes.add(album164);
        albumes.add(album165);
        albumes.add(album166);
        albumes.add(album167);
        albumes.add(album168);
        albumes.add(album169);
        albumes.add(album170);
        albumes.add(album171);
        albumes.add(album172);
        albumes.add(album173);
        albumes.add(album174);
        albumes.add(album175);
        albumes.add(album176);
        albumes.add(album177);
        albumes.add(album178);
        albumes.add(album179);
        albumes.add(album180);
        albumes.add(album181);
        albumes.add(album182);
        albumes.add(album183);
        albumes.add(album184);
        albumes.add(album185);
        albumes.add(album186);
        albumes.add(album187);
        albumes.add(album188);
        albumes.add(album189);
        albumes.add(album190);
        albumes.add(album191);
        albumes.add(album192);
        albumes.add(album193);
        albumes.add(album194);
        albumes.add(album195);
        albumes.add(album196);
        albumes.add(album197);
        albumes.add(album198);
        albumes.add(album199);
        albumes.add(album200);
        albumes.add(album201);
        albumes.add(album202);
        albumes.add(album203);
        albumes.add(album204);
        albumes.add(album205);
        albumes.add(album206);
        albumes.add(album207);
        albumes.add(album208);
        albumes.add(album209);
        albumes.add(album2100);
        albumes.add(album211);
        albumes.add(album212);
        albumes.add(album213);
        albumes.add(album214);
        albumes.add(album215);
        albumes.add(album216);
        albumes.add(album217);
        albumes.add(album218);
        albumes.add(album219);
        albumes.add(album2200);
        albumes.add(album221);
        albumes.add(album222);
        albumes.add(album223);
        albumes.add(album224);
        albumes.add(album225);
        albumes.add(album226);
        albumes.add(album227);
        albumes.add(album228);
        albumes.add(album229);
        albumes.add(album230);
        albumes.add(album231);
        albumes.add(album232);
        albumes.add(album233);
        albumes.add(album234);
        albumes.add(album235);
        albumes.add(album236);
        albumes.add(album237);
        albumes.add(album238);
        albumes.add(album239);
        albumes.add(album240);
        albumes.add(album241);
        albumes.add(album242);
        albumes.add(album243);
        albumes.add(album244);
        albumes.add(album245);
        albumes.add(album246);
        albumes.add(album247);
        albumes.add(album248);
        albumes.add(album249);
        albumes.add(album250);
        albumes.add(album251);
        albumes.add(album252);
        albumes.add(album253);
        albumes.add(album254);
        albumes.add(album255);
        albumes.add(album256);
        albumes.add(album257);
        albumes.add(album258);
        albumes.add(album259);
        albumes.add(album260);
        albumes.add(album261);
        albumes.add(album262);
        albumes.add(album263);
        albumes.add(album264);
        albumes.add(album265);
        albumes.add(album266);
        albumes.add(album267);
        albumes.add(album268);
        albumes.add(album269);
        albumes.add(album270);
        albumes.add(album271);
        albumes.add(album272);
        albumes.add(album273);
        albumes.add(album274);
        albumes.add(album275);
        albumes.add(album276);
        albumes.add(album277);
        albumes.add(album278);
        albumes.add(album279);
        albumes.add(album280);
        albumes.add(album281);
        albumes.add(album282);
        albumes.add(album283);
        albumes.add(album284);
        albumes.add(album285);
        albumes.add(album286);
        albumes.add(album287);
        albumes.add(album288);
        albumes.add(album289);
        albumes.add(album290);
        albumes.add(album291);
        albumes.add(album292);
        albumes.add(album293);
        albumes.add(album294);
        albumes.add(album295);
        albumes.add(album296);
        albumes.add(album297);
        albumes.add(album298);
        albumes.add(album299);
        albumes.add(album300);
        albumes.add(album301);
        albumes.add(album302);
        albumes.add(album303);
        albumes.add(album304);
        albumes.add(album305);
        albumes.add(album306);
        albumes.add(album307);
        albumes.add(album308);
        albumes.add(album309);
        albumes.add(album310);
        albumes.add(album311);
        albumes.add(album312);
        albumes.add(album313);
        albumes.add(album314);
        albumes.add(album315);
        albumes.add(album316);
        albumes.add(album317);
        albumes.add(album318);
        albumes.add(album319);
        albumes.add(album320);
        albumes.add(album321);
        albumes.add(album322);
        albumes.add(album323);
        albumes.add(album324);
        albumes.add(album325);
        albumes.add(album326);
        albumes.add(album327);
        albumes.add(album328);

        albumCollection.insertMany(albumes);

    }

    @Override
    public boolean verificarExixstenciaDatos() {
        MongoCollection<AlbumColeccion> albumCollection = database.getCollection("Albumes", AlbumColeccion.class);
        return albumCollection.find().iterator().hasNext();
    }

}
