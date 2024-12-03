/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package util;

import Colecciones.AlbumColeccion;
import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import Docs.FavoritoDoc;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import excepciones.NegocioException;
import frames.FrmPrincipal;
import frames.PanelAlbum;
import frames.PanelAlbumes;
import frames.PanelArtista;
import frames.PanelBusqueda;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.bson.types.ObjectId;

/**
 *
 * @author santi
 */
public class PanelAlbumDesplegado extends javax.swing.JPanel {
  
    AlbumDTO album = new AlbumDTO();
    UsuarioDTO loggedUser = new UsuarioDTO();
    private final IUsuarioNegocio usuarioNegocio;
    private final IAlbumNegocio albumNegocio;
    ImageIcon iconoActivo;
    FrmPrincipal frmPrincipal;

    boolean esFav = false;

    //Paneles
    PanelBusqueda pBusqueda;
    PanelAlbumes pAlbumes;
    PanelArtista pArtista;
    
    /**
     * Creates new form PanelAlbumDesplegado
     * @param panelPadre
     */
    public PanelAlbumDesplegado(FrmPrincipal frmPrincipal, PanelBusqueda pBusqueda, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio) {
        
        this.frmPrincipal = frmPrincipal;
        this.pBusqueda = pBusqueda;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        this.albumNegocio = albumNegocio;
        
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
    
    public PanelAlbumDesplegado(FrmPrincipal frmPrincipal, PanelAlbumes pAlbumes, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio) {
        
        this.frmPrincipal = frmPrincipal;
        this.pAlbumes = pAlbumes;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        this.albumNegocio = albumNegocio;
        
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
    
    public PanelAlbumDesplegado(FrmPrincipal frmPrincipal, PanelArtista pArtista, AlbumDTO album, UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio) {
        
        this.frmPrincipal = frmPrincipal;
        this.pArtista = pArtista;
        this.album = album;
        this.loggedUser = loggedUser;
        this.usuarioNegocio = usuarioNegocio;
        this.albumNegocio = albumNegocio;
        
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
        
        if(loggedUser.getFavoritos().getAlbumes() == null){
            esFav = false;
            return;
        }
        
        HashMap<Integer, ObjectId> mapIds = new HashMap<>();
        
        for(int i = 0; i<=favorito.getAlbumes().size()-1; i++){
        
            mapIds.put(i, favorito.getAlbumes().get(i).getId());
            
        }
        
        esFav = mapIds.containsValue(album.getId());
        
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        super.paintComponent(g);
        
        btnAgregarAFav.setIcon(iconoActivo);
        
        
        g2d.dispose(); // Dispose of the graphics context
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreArtista = new javax.swing.JLabel();
        btnAgregarAFav = new util.BotonToggle();
        lblNombreAlbum = new javax.swing.JLabel();
        imagenAlbum1 = new util.ImagenAlbum();

        lblNombreArtista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreArtista.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista.setText("2002  • Seru Giran");
        lblNombreArtista.setToolTipText("");

        btnAgregarAFav.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnAgregarAFav.setPreferredSize(new java.awt.Dimension(28, 28));
        btnAgregarAFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAFavActionPerformed(evt);
            }
        });

        lblNombreAlbum.setBackground(new java.awt.Color(27, 26, 26));
        lblNombreAlbum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreAlbum.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAlbum.setText("Peperina");
        lblNombreAlbum.setToolTipText("");
        lblNombreAlbum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNombreAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNombreAlbumMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(imagenAlbum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarAFav, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenAlbum1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAFav, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAgregarAFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAFavActionPerformed

        checarSiEsFav();
        
        if(!esFav){
            FavoritoDoc favNuevo = new FavoritoDoc();

            List<AlbumDTO> favDTO = new ArrayList<>();
            List<AlbumColeccion> favColeccion = new ArrayList<>();


            try {
                
            
                if(loggedUser.getFavoritos()!= null){

                    favNuevo = loggedUser.getFavoritos();

                    if(favNuevo.getAlbumes() != null)

                        for(AlbumColeccion albumC : favNuevo.getAlbumes()){

                            favDTO.add(albumNegocio.convertirAlbumDTO(albumC));

                        }
                }

                for(AlbumDTO albumDTO : favDTO)
                    favColeccion.add(albumNegocio.convertirAlbumColeccion(albumDTO));

                favColeccion.add(albumNegocio.convertirAlbumColeccion(album));
                favNuevo.setAlbumes(favColeccion);

                loggedUser.setFavoritos(favNuevo);

                usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/starClick.png"));
                iconoActivo = icon;

                
                
            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al agregar el album " + album.getNombre() + " a favoritos para el usuario " + loggedUser.getUsername() + ex);
            }
            
            }
            else{
            
            try {
                
                FavoritoDoc favNuevo = loggedUser.getFavoritos();
                
                List<AlbumColeccion> favColeccion = favNuevo.getAlbumes();
                List<AlbumColeccion> favColeccionNuevo = new ArrayList<>();

                for(AlbumColeccion albumExistente : favColeccion){
                
                    if(!albumExistente.getId().equals(album.getId()))
                        favColeccionNuevo.add(albumExistente);
                    
                }
                

                favNuevo.setAlbumes(favColeccionNuevo);
                
                loggedUser.setFavoritos(favNuevo);
                
                usuarioNegocio.actualizarUsuario(loggedUser);
                
                ImageIcon icon = new ImageIcon(getClass().getResource("/images/star.png"));
                iconoActivo = icon;
                
                
            } catch (NegocioException ex) {
                 JOptionPane.showMessageDialog(this, "Error al elimnar el album " + album.getNombre() + " de favoritos para el usuario " + loggedUser.getUsername() + ex);
            }
                
            }
            
            this.repaint();
        
    }//GEN-LAST:event_btnAgregarAFavActionPerformed

    private void lblNombreAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNombreAlbumMouseClicked
        // TODO add your handling code here:
        
        if(pBusqueda != null)
            frmPrincipal.pintarPanelPrincipal(new PanelAlbum(frmPrincipal, pBusqueda, album, loggedUser));

        if(pAlbumes != null)
            frmPrincipal.pintarPanelPrincipal(new PanelAlbum(frmPrincipal, pAlbumes, album, loggedUser));

        if(pArtista != null)
            frmPrincipal.pintarPanelPrincipal(new PanelAlbum(frmPrincipal, pArtista, album, loggedUser));
        
    }//GEN-LAST:event_lblNombreAlbumMouseClicked

    public void setNombreAlbum(){
    
        //Si el nombre del album es muy largo, lo cortamos
        if(album.getNombre().length() >= 15){

            String nombreCortadoAlbum = album.getNombre().substring(0, 15) + "...";

            lblNombreAlbum.setText(nombreCortadoAlbum);

        }
        else
            lblNombreAlbum.setText(album.getNombre());
        
    }
    
    public void setNombreArtistas(){
    
        String nombreArtistaFormateado = album.getFechaLanzamiento().format(DateTimeFormatter.ofPattern("yyyy")) + " • " + album.getArtista().getNombre();

        //Si el nombre del Artista es muy largo, lo cortamos
        if(nombreArtistaFormateado.length() >= 15){


            String nombreCortadoArtista = nombreArtistaFormateado.substring(0, 15) + "...";

            lblNombreArtista.setText(nombreCortadoArtista);

        }
        else
            lblNombreArtista.setText(nombreArtistaFormateado);

        
    }
    
    public void setImagenPerfil(){
                    
        //Le ponemos la imagen del album correspondiente
        ImageIcon imagen = new ImageIcon(getClass().getResource(album.getImagen()));
        imagenAlbum1.setImagen(imagen);

    }
    
    public void cargarComponentes(){
        
        setNombreAlbum();
        setNombreArtistas();
        setImagenPerfil();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonToggle btnAgregarAFav;
    private util.ImagenAlbum imagenAlbum1;
    private javax.swing.JLabel lblNombreAlbum;
    private javax.swing.JLabel lblNombreArtista;
    // End of variables declaration//GEN-END:variables
}
