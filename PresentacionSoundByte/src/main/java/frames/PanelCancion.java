/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import DTO.AlbumDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import excepciones.NegocioException;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import org.bson.types.ObjectId;
import util.CustomSliderUI;

/**
 *
 * @author carli
 */
public class PanelCancion extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    AlbumDTO album;
    UsuarioDTO loggedUser;
    CancionDoc cancion;
    DefaultListModel<String> todosGeneros = new DefaultListModel<>();
    
    final int altura = 1000;
    final int anchura = 1780;
    
    //Paneles
    PanelCanciones pCanciones;
    PanelBusqueda pBusqueda;
    PanelAlbum pAlbum;
    PanelArtista pArtista;

    
    //Favorito
    boolean esFav = false;
    ImageIcon iconoActivo;

    /**
     * Creates new form Prueba1
     */
    public PanelCancion(FrmPrincipal frmPrincipal,PanelBusqueda pBusqueda, AlbumDTO album, CancionDoc cancion, UsuarioDTO loggedUser) {
        
        initComponents();
        this.pBusqueda = pBusqueda;
        this.cancion = cancion;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        btnAtras.setOpaque(false);
        
        listGeneros.setModel(todosGeneros);
        inicializar();

    }
    
    public PanelCancion(FrmPrincipal frmPrincipal,PanelAlbum pAlbum, AlbumDTO album, CancionDoc cancion, UsuarioDTO loggedUser) {
        
        initComponents();
        this.pAlbum = pAlbum;
        this.cancion = cancion;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        btnAtras.setOpaque(false);
        
        listGeneros.setModel(todosGeneros);
        inicializar();

    }
    
    public PanelCancion(FrmPrincipal frmPrincipal,PanelCanciones pCanciones, AlbumDTO album, CancionDoc cancion, UsuarioDTO loggedUser) {
        
        initComponents();
        this.pCanciones = pCanciones;
        this.cancion = cancion;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        btnAtras.setOpaque(false);
        
        listGeneros.setModel(todosGeneros);
        inicializar();

    }
    
    public PanelCancion(FrmPrincipal frmPrincipal,PanelArtista pArtista, AlbumDTO album, CancionDoc cancion, UsuarioDTO loggedUser) {
        
        initComponents();
        this.pArtista = pArtista;
        this.cancion = cancion;
        this.album = album;
        this.frmPrincipal = frmPrincipal;
        this.loggedUser = loggedUser;
        
        btnAtras.setOpaque(false);
        
        listGeneros.setModel(todosGeneros);
        inicializar();

    }
    
    public void inicializar(){
        
        //Cancion
        lblNombreCancion.setText(cancion.getNombre());
        checarSiEsFav();
    
        //Album
        lblNombreAlbum.setText(album.getNombre());
        
        Icon imagenAlbumIcon = new ImageIcon(getClass().getResource(album.getImagen()));
        imagenAlbum.setImage(imagenAlbumIcon);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy");
        String anio = album.getFechaLanzamiento().format(formato);
        lblAño.setText(anio);
        
        //Artista
        
        lblNombreArtista.setText(album.getArtista().getNombre());
        
        Icon imagenArtistaIcon = new ImageIcon(getClass().getResource(album.getArtista().getImagen()));
        imagenArtista.setImagen(imagenArtistaIcon);
        
        llenarListGeneros(album.getArtista().getGeneros());
        
    }

    private void llenarListGeneros(List<GeneroDTO> generos) {

        int counter = 0;

        for (GeneroDTO genero : generos) {

            todosGeneros.add(counter, genero.getNombre());
            counter++;

        }

    }

    public int getAltura() {
        return altura;
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();

        super.paintComponent(g);
        
        btnFavCancion.setIcon(iconoActivo);
        
        
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAtras = new util.BotonMenu();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagenAlbum = new util.ImagenPanel();
        lblNombreCancion = new javax.swing.JLabel();
        btnFavCancion = new util.BotonToggle();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblNombreArtista = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        imagenArtista = new util.ImagenPerfil();
        btnYoutube = new util.BotonMenu();
        btnApple = new util.BotonMenu();
        btnSpotify = new util.BotonMenu();
        jScrollPane4 = new javax.swing.JScrollPane();
        listGeneros = new javax.swing.JList<>();
        lblNombreAlbum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 26, 26));

        jPanel2.setBackground(new java.awt.Color(27, 26, 26));

        jPanel3.setBackground(new java.awt.Color(27, 26, 26));

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
                .addGap(68, 68, 68)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1202, 1202, 1202)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(27, 26, 26));

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 900));

        imagenAlbum.setBorderColor(new java.awt.Color(135, 116, 249));
        imagenAlbum.setImage(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenAlbum.setPreferredSize(new java.awt.Dimension(350, 350));

        javax.swing.GroupLayout imagenAlbumLayout = new javax.swing.GroupLayout(imagenAlbum);
        imagenAlbum.setLayout(imagenAlbumLayout);
        imagenAlbumLayout.setHorizontalGroup(
            imagenAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );
        imagenAlbumLayout.setVerticalGroup(
            imagenAlbumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        lblNombreCancion.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNombreCancion.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion.setText("Parado En El Medio De La Vida");

        btnFavCancion.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StarBigFilled.png"))); // NOI18N
        btnFavCancion.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StarBigEmpty.png"))); // NOI18N
        btnFavCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavCancionActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(27, 26, 26));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreCancion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFavCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(imagenAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFavCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagenAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(138, 138, 138))
        );

        jPanel4.add(jPanel1);

        jPanel5.setBackground(new java.awt.Color(48, 48, 48));

        lblNombreArtista.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista.setText("Seru Giran");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Año de Publicacion: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Generos:       ");

        lblAño.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAño.setForeground(new java.awt.Color(255, 255, 255));
        lblAño.setText("26/09/1969");

        imagenArtista.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N

        btnYoutube.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/youtube2.png"))); // NOI18N
        btnYoutube.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/youtube1.png"))); // NOI18N
        btnYoutube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYoutubeActionPerformed(evt);
            }
        });

        btnApple.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apple2.png"))); // NOI18N
        btnApple.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/apple1.png"))); // NOI18N
        btnApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppleActionPerformed(evt);
            }
        });

        btnSpotify.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spotify2.png"))); // NOI18N
        btnSpotify.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/spotify1.png"))); // NOI18N
        btnSpotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpotifyActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listGeneros.setBackground(new java.awt.Color(56, 56, 56));
        listGeneros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listGeneros.setForeground(new java.awt.Color(255, 255, 255));
        listGeneros.setMaximumSize(new java.awt.Dimension(400, 400));
        listGeneros.setMinimumSize(new java.awt.Dimension(400, 400));
        listGeneros.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane4.setViewportView(listGeneros);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAño))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblNombreArtista)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpotify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(176, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblNombreArtista)
                .addGap(131, 131, 131)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblAño))
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSpotify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnApple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(554, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(523, Short.MAX_VALUE)))
        );

        lblNombreAlbum.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNombreAlbum.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAlbum.setText("Peperina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(342, 342, 342))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(lblNombreAlbum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreAlbum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
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
    
    private void btnFavCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavCancionActionPerformed
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

                frmPrincipal.usuarioNegocio.actualizarUsuario(loggedUser);

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

                frmPrincipal.usuarioNegocio.actualizarUsuario(loggedUser);

                ImageIcon icon = new ImageIcon(getClass().getResource("/images/star.png"));
                iconoActivo = icon;

            } catch (NegocioException ex) {
                JOptionPane.showMessageDialog(this, "Error al elimnar la canción " + cancion.getNombre() + " de favoritos para el usuario " + loggedUser.getUsername() + ex);
            }

        }

        this.repaint();
    }//GEN-LAST:event_btnFavCancionActionPerformed

    private void btnSpotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpotifyActionPerformed
        
        try {
          
            
            
            if(album.getArtista().getRedesSociales() != null){
                if(album.getArtista().getRedesSociales().get(0) == null){
                    JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Spotify");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();
            
                desktop.browse(new URI(album.getArtista().getRedesSociales().get(0)));
                
                return;
                
            }

            JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Spotify");
            
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el link" + ex);
        }
        
    }//GEN-LAST:event_btnSpotifyActionPerformed

    private void btnAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppleActionPerformed
        
        try {
          
            
            if(album.getArtista().getRedesSociales() != null){
                if(album.getArtista().getRedesSociales().get(1) == null){
                    JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Apple Music");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();

                desktop.browse(new URI(album.getArtista().getRedesSociales().get(1)));
                
                return;
                
            }

            JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Apple Music");
            
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el link" + ex);
        }
        
    }//GEN-LAST:event_btnAppleActionPerformed

    private void btnYoutubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYoutubeActionPerformed
       
        try {
          
            
            if(album.getArtista().getRedesSociales() != null){
                if(album.getArtista().getRedesSociales().get(2) == null){
                    JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Youtube");
                    return;
                }
                
                Desktop desktop = Desktop.getDesktop();

                desktop.browse(new URI(album.getArtista().getRedesSociales().get(2)));         
                
                return;
                
            }
            
            JOptionPane.showMessageDialog(this, "Esta canción no tiene link de Youtube");
            
        } catch (URISyntaxException | IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar el link" + ex);
        }
        
    }//GEN-LAST:event_btnYoutubeActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if(pBusqueda != null)
            frmPrincipal.pintarPanelPrincipal(pBusqueda);
        
        if(pCanciones != null)
            frmPrincipal.pintarPanelPrincipal(pCanciones);
        
        if(pAlbum != null)
            frmPrincipal.pintarPanelPrincipal(pAlbum);
        
        if(pArtista != null)
            frmPrincipal.pintarPanelPrincipal(pArtista);
        
    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonMenu btnApple;
    private util.BotonMenu btnAtras;
    private util.BotonToggle btnFavCancion;
    private util.BotonMenu btnSpotify;
    private util.BotonMenu btnYoutube;
    private util.ImagenPanel imagenAlbum;
    private util.ImagenPerfil imagenArtista;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblNombreAlbum;
    private javax.swing.JLabel lblNombreArtista;
    private javax.swing.JLabel lblNombreCancion;
    private javax.swing.JList<String> listGeneros;
    // End of variables declaration//GEN-END:variables
}
