/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DatosDePrueba;

/**
 *
 * @author santi
 */
public class pruebasTEMPORAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Generos g = new Generos();
        g.insertarGeneros();
        
        Artistas ar = new Artistas();
        ar.insertarArtistasSantiago();
        
        Albumes a = new Albumes();
        a.insertarAlbumesSantiago();
        
    }
    
}
