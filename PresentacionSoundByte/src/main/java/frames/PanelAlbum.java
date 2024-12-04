/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import Colecciones.AlbumColeccion;
import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import excepciones.NegocioException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;
import util.PanelCancionDesplegada;

/**
 *
 * @author carli
 */
public class PanelAlbum extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    AlbumDTO album;
    UsuarioDTO loggedUser;
    
    //Paneles
    PanelBusqueda pBusqueda;
    PanelAlbumes pAlbumes;
    PanelAlbumesFavoritos pAlbumesFav;
    PanelArtista pArtista;
    PanelHome pHome;
    
    Boolean esFav = false;

    /**
     * Creates new form Prueba1
     */
    public PanelAlbum(FrmPrincipal frmPrincipal,PanelBusqueda pBusqueda, AlbumDTO album, UsuarioDTO loggedUser) {
       
        initComponents();
        
        this.pBusqueda = pBusqueda;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        checarSiEsFav();
        inicializar();
        llenarCanciones();
        
        btnAgregarAFav.setSelected(esFav);

        this.repaint();
        
    }
    
    public PanelAlbum(FrmPrincipal frmPrincipal,PanelArtista pArtista, AlbumDTO album, UsuarioDTO loggedUser) {
       
        initComponents();
        
        this.pArtista = pArtista;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        checarSiEsFav();
        inicializar();
        llenarCanciones();
        
        btnAgregarAFav.setSelected(esFav);

        this.repaint();
        
    }
    
    public PanelAlbum(FrmPrincipal frmPrincipal,PanelHome pHome, AlbumDTO album, UsuarioDTO loggedUser) {
       
        initComponents();
        
        this.pHome = pHome;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        checarSiEsFav();
        inicializar();
        llenarCanciones();
        
        btnAgregarAFav.setSelected(esFav);

        this.repaint();
        
    }
    /**
     * Creates new form Prueba1
     */
    public PanelAlbum(FrmPrincipal frmPrincipal,PanelAlbumes pAlbumes, AlbumDTO album, UsuarioDTO loggedUser) {
       
        initComponents();
        
        this.pAlbumes = pAlbumes;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        checarSiEsFav();
        inicializar();
        llenarCanciones();
        
        btnAgregarAFav.setSelected(esFav);

        this.repaint();
        
    }
    public PanelAlbum(FrmPrincipal frmPrincipal,PanelAlbumesFavoritos pAlbumesFav, AlbumDTO album, UsuarioDTO loggedUser) {
       
        initComponents();
        
        this.pAlbumesFav = pAlbumesFav;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        checarSiEsFav();
        inicializar();
        llenarCanciones();
        
        btnAgregarAFav.setSelected(esFav);

        this.repaint();
        
    }

    public void llenarCanciones(){
        
        for(CancionDoc cancion : album.getCanciones()){
        
            PanelCancionDesplegada panel = new PanelCancionDesplegada(frmPrincipal, this,  cancion, album, loggedUser, frmPrincipal.usuarioNegocio);
            
            panelCanciones.add(panel);
            
        }
        
    }
    
    public void inicializar(){
        
        //Cancion
        lblNombreAlbum.setText(album.getNombre());
        checarSiEsFav();
    
        //Album
        lblNombreAlbum.setText(album.getNombre());
        try{
        Icon imagenAlbumIcon = new ImageIcon(getClass().getResource(album.getImagen()));
        imagenAlbum.setImagen(imagenAlbumIcon);
        }catch(NullPointerException ex){}
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy");
        String anio = album.getFechaLanzamiento().format(formato);
        
        
        //Artista
        
        lblArtista.setText(album.getArtista().getNombre() + " • " + anio + " • " + album.getCanciones().size());
        
        Icon imagenArtistaIcon = new ImageIcon(getClass().getResource(album.getArtista().getImagen()));
        imagenArtista.setImagen(imagenArtistaIcon);

        
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
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panelInfoAlbum = new javax.swing.JPanel();
        lblArtista = new javax.swing.JLabel();
        lblNombreAlbum = new javax.swing.JLabel();
        lblNombreCancion6 = new javax.swing.JLabel();
        imagenArtista = new util.ImagenPerfil();
        imagenAlbum = new util.ImagenAlbum();
        btnAgregarAFav = new util.BotonToggle();
        jPanel3 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        panelCanciones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        lblCanciones = new javax.swing.JLabel();
        btnAtras = new util.BotonMenu();
        jLabel5 = new javax.swing.JLabel();

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton21)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jButton21)
                .addGap(14, 14, 14))
        );

        jPanel15.add(jPanel16);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton3);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton22);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton23);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton24);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton25);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel15.add(jButton26);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(12, 12, 12))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(15, 15, 15))
        );

        jPanel15.add(jPanel17);

        setBackground(new java.awt.Color(27, 26, 26));

        jPanel2.setBackground(new java.awt.Color(27, 26, 26));

        panelInfoAlbum.setBackground(new java.awt.Color(27, 26, 26));
        panelInfoAlbum.setPreferredSize(new java.awt.Dimension(1500, 261));

        lblArtista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblArtista.setForeground(new java.awt.Color(255, 255, 255));
        lblArtista.setText("Seru Giran • 2002  • 20 canciones");

        lblNombreAlbum.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNombreAlbum.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAlbum.setText("Peperina");

        lblNombreCancion6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion6.setText("Album");

        imagenArtista.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista.setPreferredSize(new java.awt.Dimension(50, 50));

        imagenAlbum.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/TheNewSound.jpg"))); // NOI18N

        btnAgregarAFav.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StarBigEmpty.png"))); // NOI18N
        btnAgregarAFav.setPreferredSize(new java.awt.Dimension(28, 28));
        btnAgregarAFav.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StarBigFilled.png"))); // NOI18N
        btnAgregarAFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAFavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfoAlbumLayout = new javax.swing.GroupLayout(panelInfoAlbum);
        panelInfoAlbum.setLayout(panelInfoAlbumLayout);
        panelInfoAlbumLayout.setHorizontalGroup(
            panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                .addComponent(imagenAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblNombreAlbum))
                    .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblArtista)))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarAFav, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(lblNombreCancion6)
                    .addContainerGap(1083, Short.MAX_VALUE)))
        );
        panelInfoAlbumLayout.setVerticalGroup(
            panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblNombreAlbum)
                .addGap(18, 18, 18)
                .addGroup(panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblArtista)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAFav, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelInfoAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInfoAlbumLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(lblNombreCancion6)
                    .addContainerGap(162, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(27, 26, 26));

        jPanel20.setBackground(new java.awt.Color(27, 26, 26));
        jPanel20.setPreferredSize(new java.awt.Dimension(93, 100));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel20);

        panelCanciones.setBackground(new java.awt.Color(27, 26, 26));
        panelCanciones.setPreferredSize(new java.awt.Dimension(750, 1000));
        jPanel3.add(panelCanciones);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("         ");
        jPanel3.add(jLabel7);

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));
        jPanel5.setPreferredSize(new java.awt.Dimension(750, 1000));
        jPanel3.add(jPanel5);

        jPanel21.setBackground(new java.awt.Color(27, 26, 26));
        jPanel21.setPreferredSize(new java.awt.Dimension(93, 100));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel21);

        lblCanciones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCanciones.setForeground(new java.awt.Color(255, 255, 255));
        lblCanciones.setText("Canciones");
        lblCanciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCanciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCancionesMouseClicked(evt);
            }
        });

        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftSelected.png"))); // NOI18N
        btnAtras.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInfoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCanciones))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInfoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lblCanciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1017, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(912, 912, 912))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblCancionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCancionesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCancionesMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if(pBusqueda != null)
            frmPrincipal.pintarPanelPrincipal(pBusqueda);
        
        if(pAlbumes != null)
            frmPrincipal.pintarPanelPrincipal(pAlbumes);
        
        if(pAlbumesFav != null)
            frmPrincipal.pintarPanelPrincipal(pAlbumesFav);
        
        if(pArtista != null)
            frmPrincipal.pintarPanelPrincipal(pArtista);
        
    }//GEN-LAST:event_btnAtrasActionPerformed

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

                        favDTO.add(frmPrincipal.albumNegocio.convertirAlbumDTO(albumC));

                    }
                }

                for(AlbumDTO albumDTO : favDTO)
                    favColeccion.add(frmPrincipal.albumNegocio.convertirAlbumColeccion(albumDTO));

                favColeccion.add(frmPrincipal.albumNegocio.convertirAlbumColeccion(album));
                favNuevo.setAlbumes(favColeccion);

                loggedUser.setFavoritos(favNuevo);

                frmPrincipal.usuarioNegocio.actualizarUsuario(loggedUser);

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

                frmPrincipal.usuarioNegocio.actualizarUsuario(loggedUser);
                
            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al elimnar el album " + album.getNombre() + " de favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }
        



    }//GEN-LAST:event_btnAgregarAFavActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonToggle btnAgregarAFav;
    private util.BotonMenu btnAtras;
    private util.ImagenAlbum imagenAlbum;
    private util.ImagenPerfil imagenArtista;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblCanciones;
    private javax.swing.JLabel lblNombreAlbum;
    private javax.swing.JLabel lblNombreCancion6;
    private javax.swing.JPanel panelCanciones;
    private javax.swing.JPanel panelInfoAlbum;
    // End of variables declaration//GEN-END:variables
}
