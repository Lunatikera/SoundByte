/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import DTO.AlbumDTO;
import DTO.ArtistaDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.IntegranteDoc;
import excepciones.NegocioException;
import java.util.List;
import javax.swing.JOptionPane;
import util.ScrollBar;
import frames.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import util.PanelAlbumDesplegado;
import util.PanelCancionDesplegada;
import util.PanelIntegrante;

/**
 *
 * @author carli
 */
public class PanelArtista extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    ArtistaDTO artista;
    UsuarioDTO loggedUser;

    //Paneles
    PanelBusqueda pBusqueda;
    PanelArtistas pArtistas;
    PanelArtistasFavoritos pArtistasFav;
    
    List<AlbumDTO> albumesArtista;
    List<CancionDoc> cancionesArtista;

    /**
     * Creates new form Prueba1
     */
    public PanelArtista(FrmPrincipal frmPrincipal, PanelBusqueda pBusqueda, ArtistaDTO artista, UsuarioDTO loggedUser) {
        
        initComponents();

        this.frmPrincipal = frmPrincipal;
        this.pBusqueda = pBusqueda;
        this.artista = artista;
        this.loggedUser = loggedUser;

        panelContenedor.setLayout(new FlowLayout());
        
        panelContenedor.setOpaque(true);
        
        buscarAlbumesYCanciones();
        inicializar();
        llenarCanciones();
        
        this.revalidate();
        this.repaint();
        
    }
    public PanelArtista(FrmPrincipal frmPrincipal, PanelArtistas pArtistas, ArtistaDTO artista, UsuarioDTO loggedUser) {
        
        initComponents();

        this.frmPrincipal = frmPrincipal;
        this.pArtistas = pArtistas;
        this.artista = artista;
        this.loggedUser = loggedUser;

        panelContenedor.setLayout(new FlowLayout());
        
        panelContenedor.setOpaque(true);
        
        buscarAlbumesYCanciones();
        inicializar();
        llenarCanciones();
        
        this.revalidate();
        this.repaint();
        
    }
    public PanelArtista(FrmPrincipal frmPrincipal, PanelArtistasFavoritos pArtistasFav, ArtistaDTO artista, UsuarioDTO loggedUser) {
        
        initComponents();

        this.frmPrincipal = frmPrincipal;
        this.pArtistasFav = pArtistasFav;
        this.artista = artista;
        this.loggedUser = loggedUser;

        panelContenedor.setLayout(new FlowLayout());
        
        panelContenedor.setOpaque(true);
        
        buscarAlbumesYCanciones();
        inicializar();
        llenarCanciones();
        
        this.revalidate();
        this.repaint();
        
    }


    private void buscarAlbumesYCanciones(){
    
        try {
            
            albumesArtista = frmPrincipal.albumNegocio.obtenerAlbumesPorArtista(artista);
            
            List<CancionDoc> canciones = new ArrayList<>();
            
            for(AlbumDTO album : albumesArtista){
            
                canciones.addAll(album.getCanciones());
                
            }
            
            cancionesArtista = canciones;
            
            
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar albumes del artista en presentación" + ex);
        }
        
    }
    
    private void inicializar(){
    
        if(artista.getEsBanda()){
            lblEsBanda.setText("Banda");
            btnIntegrantes.setVisible(true);
        }
        else{
        
            btnIntegrantes.setVisible(false);
            lblEsBanda.setText("Solista");
        
        }
        
        lblNombreArtista.setText(artista.getNombre());
        
        try{
        Icon imagenArtistaIcon = new ImageIcon(getClass().getResource(artista.getImagen()));
        imagenArtista.setImagen(imagenArtistaIcon);
        }catch(NullPointerException ex){}
        
        String informacion = new String();
        
        for(GeneroDTO genero : artista.getGeneros()){
        
            informacion = informacion.concat(genero.getNombre() + " • ");
            
        }
        
        informacion = informacion.concat(albumesArtista.size() + " album/es • ");
        informacion = informacion.concat(cancionesArtista.size() + " canciones");
        
        lblInformacion.setText(informacion);
        
        
    }
    
    private void llenarCanciones(){
    
        for(AlbumDTO album : albumesArtista){
        
            for(CancionDoc cancion : album.getCanciones()){
            
                PanelCancionDesplegada panel = new PanelCancionDesplegada(frmPrincipal, this, cancion, album, loggedUser, frmPrincipal.usuarioNegocio);
                
                panelContenedor.add(panel);
                
            }
            
        }
        
    }
    
    private void llenarAlbumes(){
    
        for(AlbumDTO album : albumesArtista){
        

            PanelAlbumDesplegado panel = new PanelAlbumDesplegado(frmPrincipal, this, album, loggedUser, frmPrincipal.usuarioNegocio, frmPrincipal.albumNegocio);

            panelContenedor.add(panel);
                

            
        }
        
    }
    
    private void llenarIntegrantes(){
    
        for(IntegranteDoc integrante : artista.getIntegrante()){
        
            PanelIntegrante panel = new PanelIntegrante(integrante);
            
            panelContenedor.add(panel);
            
            
        }
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblInformacion = new javax.swing.JLabel();
        lblNombreArtista = new javax.swing.JLabel();
        lblEsBanda = new javax.swing.JLabel();
        imagenArtista = new util.ImagenPerfil();
        jPanel7 = new javax.swing.JPanel();
        btnCanciones = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnIntegrantes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnAlbumes = new javax.swing.JButton();
        btnAtras = new util.BotonMenu();
        panelContenedor = new javax.swing.JPanel();
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

        jPanel6.setBackground(new java.awt.Color(27, 26, 26));
        jPanel6.setPreferredSize(new java.awt.Dimension(1500, 261));

        lblInformacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInformacion.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacion.setText("Rock Alternativo • 2 Albums  • 20 canciones");

        lblNombreArtista.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblNombreArtista.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista.setText("Seru Giran");

        lblEsBanda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEsBanda.setForeground(new java.awt.Color(255, 255, 255));
        lblEsBanda.setText("Banda");

        imagenArtista.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNombreArtista))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblInformacion)))
                .addContainerGap(888, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(234, 234, 234)
                    .addComponent(lblEsBanda)
                    .addContainerGap(1083, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblNombreArtista)
                        .addGap(18, 18, 18)
                        .addComponent(lblInformacion))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(imagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(lblEsBanda)
                    .addContainerGap(162, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(27, 26, 26));

        btnCanciones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCanciones.setForeground(new java.awt.Color(255, 255, 255));
        btnCanciones.setText("Canciones");
        btnCanciones.setBorderPainted(false);
        btnCanciones.setContentAreaFilled(false);
        btnCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancionesActionPerformed(evt);
            }
        });
        jPanel7.add(btnCanciones);

        jLabel10.setText("                                                      ");
        jPanel7.add(jLabel10);

        btnIntegrantes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIntegrantes.setForeground(new java.awt.Color(255, 255, 255));
        btnIntegrantes.setText("Integrantes");
        btnIntegrantes.setBorderPainted(false);
        btnIntegrantes.setContentAreaFilled(false);
        btnIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntegrantesActionPerformed(evt);
            }
        });
        jPanel7.add(btnIntegrantes);

        jLabel9.setText("                                                      ");
        jPanel7.add(jLabel9);

        btnAlbumes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAlbumes.setForeground(new java.awt.Color(255, 255, 255));
        btnAlbumes.setText("Albumes");
        btnAlbumes.setBorderPainted(false);
        btnAlbumes.setContentAreaFilled(false);
        btnAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlbumesActionPerformed(evt);
            }
        });
        jPanel7.add(btnAlbumes);

        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftSelected.png"))); // NOI18N
        btnAtras.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        panelContenedor.setBackground(new java.awt.Color(27, 26, 26));
        panelContenedor.setPreferredSize(new java.awt.Dimension(750, 850));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(808, Short.MAX_VALUE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if(pBusqueda != null)
            frmPrincipal.pintarPanelPrincipal(pBusqueda);

        if(pArtistas != null)
            frmPrincipal.pintarPanelPrincipal(pArtistas);
        
        if(pArtistasFav != null)
            frmPrincipal.pintarPanelPrincipal(pArtistasFav);

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlbumesActionPerformed

        panelContenedor.removeAll();
        llenarAlbumes();

        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_btnAlbumesActionPerformed

    private void btnIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntegrantesActionPerformed

        panelContenedor.removeAll();
        llenarIntegrantes();

        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnIntegrantesActionPerformed

    private void btnCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancionesActionPerformed

        panelContenedor.removeAll();
        llenarCanciones();

        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_btnCancionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlbumes;
    private util.BotonMenu btnAtras;
    private javax.swing.JButton btnCanciones;
    private javax.swing.JButton btnIntegrantes;
    private util.ImagenPerfil imagenArtista;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEsBanda;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblNombreArtista;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
