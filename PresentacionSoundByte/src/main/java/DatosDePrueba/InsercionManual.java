/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DatosDePrueba;

/**
 *
 * @author santi
 */
public class InsercionManual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Generos generos = new Generos();
        Artistas artista = new Artistas();
        Albumes albumes = new Albumes();
        
        if(!generos.existe())
            generos.insertarGeneros();
        
        if(!artista.existe())
            artista.insertarArtistasSantiago();
        
        if(!albumes.existe())
            albumes.insertarAlbumesSantiago();
        
    }
    
}
