/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package util;

import Colecciones.ArtistaColeccion;
import DTO.AlbumDTO;
import DTO.ArtistaDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IArtistaNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import excepciones.NegocioException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class PanelArtistaDesplegado extends javax.swing.JPanel {

    ArtistaDTO artista = new ArtistaDTO();

    UsuarioDTO loggedUser = new UsuarioDTO();
    private final IArtistaNegocio artistaNegocio;
    private final IUsuarioNegocio usuarioNegocio;
    ImageIcon iconoActivo;
    
    boolean esFav = false;
    
    /**
     * Creates new form PanelCancionDesplegada
     */
    public PanelArtistaDesplegado(ArtistaDTO artista, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio, IArtistaNegocio artistaNegocio) {
        
        this.artista = artista;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        this.artistaNegocio = artistaNegocio;
        
        initComponents();
       
        this.setOpaque(false);

        cargarComponentes();
        checarSiEsFav();
        
        
        if(esFav){
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/starClick.png"));
            iconoActivo = icon;
        }
        else{
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/star.png"));
            iconoActivo = icon;
        }
        this.repaint();
    
    }

    
    public void checarSiEsFav(){
    
        FavoritoDoc favorito = new FavoritoDoc();
        
        if(loggedUser.getFavoritos() != null)
            favorito = loggedUser.getFavoritos();
        else {
            esFav = false;
            return;
        }
        
        if(loggedUser.getFavoritos().getArtistas() == null){
            esFav = false;
            return;
        }
        
        HashMap<Integer, ObjectId> mapIds = new HashMap<>();
        
        for(int i = 0; i<=favorito.getArtistas().size()-1; i++){
        
            mapIds.put(i, favorito.getArtistas().get(i).getId());
            
        }
        
        esFav = mapIds.containsValue(artista.getId());
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        super.paintComponent(g);
        
        btnFavCancion1.setIcon(iconoActivo);
        
        
        g2d.dispose(); // Dispose of the graphics context
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreArtista = new javax.swing.JLabel();
        imagenCancion3 = new util.ImagenPerfil();
        btnFavCancion1 = new util.BotonToggle();

        lblNombreArtista.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista.setText("PEPERINA");

        imagenCancion3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnFavCancion1.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion1.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavCancion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNombreArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addGap(59, 59, 59)
                        .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagenCancion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenCancion3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista)
                    .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFavCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavCancion1ActionPerformed

        checarSiEsFav();

        if(!esFav){
            FavoritoDoc favNuevo = new FavoritoDoc();

            List<ArtistaColeccion> favColeccion = new ArrayList<>();

            try {

                if(loggedUser.getFavoritos()!= null){

                    favNuevo = loggedUser.getFavoritos();

                    if(favNuevo.getArtistas() != null)
                        for(ArtistaColeccion artista : favNuevo.getArtistas())
                        favColeccion.add(artista);

                }

                
                
                favColeccion.add(artistaNegocio.convertirArtistaColeccion(artista));
                favNuevo.setArtistas(favColeccion);

                loggedUser.setFavoritos(favNuevo);

                usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/starClick.png"));
                iconoActivo = icon;

            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar la artista " + artista.getNombre() + " a favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }
        else{

            try {

                FavoritoDoc favNuevo = loggedUser.getFavoritos();

                List<ArtistaColeccion> favColeccion = favNuevo.getArtistas();
                List<ArtistaColeccion> favColeccionNuevo = new ArrayList<>();

                for(ArtistaColeccion artistaExistente : favColeccion){

                    if(!artistaExistente.getId().equals(artista.getId()))
                    favColeccionNuevo.add(artistaExistente);

                }

                favNuevo.setArtistas(favColeccionNuevo);

                loggedUser.setFavoritos(favNuevo);

                usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/star.png"));
                iconoActivo = icon;

            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el artista" + artista.getNombre() + " de favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }

        this.repaint();
    }//GEN-LAST:event_btnFavCancion1ActionPerformed
    
    public void setNombreArtista(){
    

        //Si el nombre del Artista es muy largo, lo cortamos
        if(artista.getNombre().length() >= 14){


            String nombreCortadoCancion = artista.getNombre().substring(0, 14) + "...";

            lblNombreArtista.setText(nombreCortadoCancion);

        }
        else
            lblNombreArtista.setText(artista.getNombre());

        
    }
    
    public void setImagenAlbum(){
                    
        //Le ponemos la imagen del album correspondiente
        ImageIcon imagen = new ImageIcon(getClass().getResource(artista.getImagen()));
        imagenCancion3.setImagen(imagen);

    }
    
    public void cargarComponentes(){
    
        setNombreArtista();
        setImagenAlbum();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonToggle btnFavCancion1;
    private util.ImagenPerfil imagenCancion3;
    private javax.swing.JLabel lblNombreArtista;
    // End of variables declaration//GEN-END:variables
}
