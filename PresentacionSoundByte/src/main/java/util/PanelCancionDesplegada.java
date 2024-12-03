/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package util;

import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import excepciones.NegocioException;
import frames.FrmPrincipal;
import frames.PanelAlbum;
import frames.PanelAlbumes;
import frames.PanelArtista;
import frames.PanelBusqueda;
import frames.PanelCancion;
import frames.PanelCanciones;
import frames.PanelCancionesFavoritas;
import frames.PanelHome;
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
public class PanelCancionDesplegada extends javax.swing.JPanel {

    AlbumDTO album = new AlbumDTO();
    CancionDoc cancion = new CancionDoc();
    UsuarioDTO loggedUser = new UsuarioDTO();
    private final IUsuarioNegocio usuarioNegocio;
    ImageIcon iconoActivo;
    FrmPrincipal frmPrincipal;
    
    //Paneles
    PanelBusqueda pBusqueda;
    PanelCanciones pCanciones;
    PanelCancionesFavoritas pCancionesFav;
    PanelAlbum pAlbum;
    PanelArtista pArtista;
    PanelHome pHome;
    
    boolean esFav = false;
    
    /**
     * Creates new form PanelCancionDesplegada
     */
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelBusqueda pBusqueda, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pBusqueda = pBusqueda;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelHome pHome, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pHome = pHome;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
    /**
     * Creates new form PanelCancionDesplegada
     */
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelCanciones pCanciones, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pCanciones = pCanciones;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
    /**
     * Creates new form PanelCancionDesplegada
     */
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelCancionesFavoritas pCancionesFav, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pCancionesFav = pCancionesFav;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
    /**
     * Creates new form PanelCancionDesplegada
     */
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelAlbum pAlbum, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pAlbum = pAlbum;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
    public PanelCancionDesplegada(FrmPrincipal frmPrincipal, PanelArtista pArtista, CancionDoc cancion, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio) {
        
        this.pArtista = pArtista;
        this.frmPrincipal = frmPrincipal;
        this.cancion = cancion;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        
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
        
        btnFavCancion1.move(200, 35);
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
        
        if(loggedUser.getFavoritos().getCanciones() == null){
            esFav = false;
            return;
        }
        
        HashMap<Integer, ObjectId> mapIds = new HashMap<>();
        
        for(int i = 0; i<=favorito.getCanciones().size()-1; i++){
        
            mapIds.put(i, favorito.getCanciones().get(i).getId());
            
        }
        
        esFav = mapIds.containsValue(cancion.getId());
        
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

        lblNombreCancion1 = new javax.swing.JLabel();
        lblNombreArtistaCancion1 = new javax.swing.JLabel();
        imagenCancion3 = new util.ImagenPerfil();
        btnPlay1 = new util.BotonToggle();
        btnFavCancion1 = new util.BotonToggle();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblNombreCancion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion1.setText("Peperina");
        lblNombreCancion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNombreCancion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreCancion1MouseClicked(evt);
            }
        });

        lblNombreArtistaCancion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion1.setText("Seru Giran");

        imagenCancion3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/fotoDefaultPerfil.png"))); // NOI18N
        imagenCancion3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnPlay1.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay1.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay1.setPreferredSize(new java.awt.Dimension(28, 28));

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
                .addGap(16, 16, 16)
                .addComponent(btnPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imagenCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCancion1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(lblNombreArtistaCancion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagenCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreCancion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFavCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavCancion1ActionPerformed

        checarSiEsFav();

        if(!esFav){
            FavoritoDoc favNuevo = new FavoritoDoc();

            List<CancionDoc> favColeccion = new ArrayList<>();

            try {

                if(loggedUser.getFavoritos()!= null){

                    favNuevo = loggedUser.getFavoritos();

                    if(favNuevo.getCanciones() != null)
                        for(CancionDoc cancion : favNuevo.getCanciones())
                        favColeccion.add(cancion);

                }

                favColeccion.add(cancion);
                favNuevo.setCanciones(favColeccion);

                loggedUser.setFavoritos(favNuevo);

                usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/starClick.png"));
                iconoActivo = icon;

            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar la canción " + cancion.getNombre() + " a favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }
        else{

            try {

                FavoritoDoc favNuevo = loggedUser.getFavoritos();

                List<CancionDoc> favColeccion = favNuevo.getCanciones();
                List<CancionDoc> favColeccionNuevo = new ArrayList<>();

                for(CancionDoc cancionExistente : favColeccion){

                    if(!cancionExistente.getId().equals(cancion.getId()))
                    favColeccionNuevo.add(cancionExistente);

                }

                favNuevo.setCanciones(favColeccionNuevo);

                loggedUser.setFavoritos(favNuevo);

                usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/star.png"));
                iconoActivo = icon;

            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al elimnar la canción " + cancion.getNombre() + " de favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }

        this.repaint();
    }//GEN-LAST:event_btnFavCancion1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formMouseClicked

    private void lblNombreCancion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreCancion1MouseClicked
        // TODO add your handling code here:
        
        if(pBusqueda != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pBusqueda, album, cancion, loggedUser));
        if(pCanciones != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pCanciones, album, cancion, loggedUser));
        if(pAlbum != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pAlbum, album, cancion, loggedUser));
        if(pArtista != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pArtista, album, cancion, loggedUser));
        if(pHome != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pHome, album, cancion, loggedUser));
        if(pCancionesFav != null)
            frmPrincipal.pintarPanelPrincipal(new PanelCancion(frmPrincipal, pCancionesFav, album, cancion, loggedUser));

        
    }//GEN-LAST:event_lblNombreCancion1MouseClicked


    public void setNombreAlbum(){
    
        //Si el nombre del album es muy largo, lo cortamos
        if(album.getArtista().getNombre().length() >= 30){

            String nombreCortadoAlbum = album.getNombre().substring(0, 30) + "...";

            lblNombreArtistaCancion1.setText(nombreCortadoAlbum);

        }
        else
            lblNombreArtistaCancion1.setText(album.getArtista().getNombre());
        
    }
    
    public void setNombreCancion(){
    

        //Si el nombre del Artista es muy largo, lo cortamos
        if(cancion.getNombre().length() >= 30){


            String nombreCortadoCancion = cancion.getNombre().substring(0, 15) + "...";

            lblNombreCancion1.setText(nombreCortadoCancion);

        }
        else
            lblNombreCancion1.setText(cancion.getNombre());

        
    }
    
    public void setImagenAlbum(){
                    
        //Le ponemos la imagen del album correspondiente
        try{
        ImageIcon imagen = new ImageIcon(getClass().getResource(album.getImagen()));
        imagenCancion3.setImagen(imagen);
        } catch(NullPointerException ex){}
    }
    
    public void cargarComponentes(){
    
        setNombreCancion();
        setNombreAlbum();
        setImagenAlbum();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonToggle btnFavCancion1;
    private util.BotonToggle btnPlay1;
    private util.ImagenPerfil imagenCancion3;
    private javax.swing.JLabel lblNombreArtistaCancion1;
    private javax.swing.JLabel lblNombreCancion1;
    // End of variables declaration//GEN-END:variables
}
