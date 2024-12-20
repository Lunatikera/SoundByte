/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import Conexion.ConexionDB;
import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IArtistaNegocio;
import InterfacesNegocio.IGeneroNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.GeneroNegocio;
import Negocio.UsuarioNegocio;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import util.CustomSliderUI;
import util.ScrollBar;

/**
 *
 * @author carli
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private UsuarioDTO loggedUser;
    
    IUsuarioNegocio usuarioNegocio;
    IAlbumNegocio albumNegocio;
    IGeneroNegocio generoNegocio;
    IArtistaNegocio artistaNegocio;

    public FrmPrincipal(UsuarioDTO loggedUser, IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio, IGeneroNegocio generoNegocio, IArtistaNegocio artistaNegocio) {
        initComponents();
        
        this.loggedUser = loggedUser;
        this.usuarioNegocio=usuarioNegocio;
        this.albumNegocio=albumNegocio;
        this.generoNegocio=generoNegocio;
        this.artistaNegocio=artistaNegocio;
        
        this.setTitle("SoundByte");
        this.setLocation(265, 76);
        this.setSize(2066, 1321);
        this.btnMenuHomeActionPerformed(null);
        this.jScrollPane1.setVerticalScrollBar(new ScrollBar());


        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnMenuBuscar = new util.BotonMenu();
        jPanel7 = new javax.swing.JPanel();
        btnMenuArtistas = new util.BotonMenu();
        jPanel8 = new javax.swing.JPanel();
        btnMenuCanciones = new util.BotonMenu();
        jPanel9 = new javax.swing.JPanel();
        btnMenuAlbumes = new util.BotonMenu();
        jPanel10 = new javax.swing.JPanel();
        btnMenuCuenta = new util.BotonMenu();
        jPanel11 = new javax.swing.JPanel();
        btnMenuHome = new util.BotonMenu();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btnMenuFavoritos = new util.BotonMenu();
        jPanel14 = new javax.swing.JPanel();
        btnMenuRestringidos = new util.BotonMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setBackground(new java.awt.Color(16, 15, 15));
        menuBar.setPreferredSize(new java.awt.Dimension(270, 1080));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logochiquito.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(220, 146));
        menuBar.add(jLabel1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whiteLine.png"))); // NOI18N
        jLabel6.setMinimumSize(new java.awt.Dimension(300, 1));
        jLabel6.setPreferredSize(new java.awt.Dimension(300, 1));
        menuBar.add(jLabel6);
        menuBar.add(jLabel4);

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));
        jPanel4.setPreferredSize(new java.awt.Dimension(270, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(140, 45));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.add(jPanel4);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("                                                                            ");
        jLabel20.setPreferredSize(new java.awt.Dimension(228, 15));
        menuBar.add(jLabel20);

        jPanel5.setBackground(new java.awt.Color(16, 15, 15));
        jPanel5.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscarSelected.png"))); // NOI18N
        btnMenuBuscar.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/browse.png"))); // NOI18N
        btnMenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(16, 15, 15));
        jPanel7.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuArtistas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/artistSelected.png"))); // NOI18N
        btnMenuArtistas.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/artist.png"))); // NOI18N
        btnMenuArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuArtistasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuArtistas, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuArtistas, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(16, 15, 15));
        jPanel8.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuCanciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/musicaSelected.png"))); // NOI18N
        btnMenuCanciones.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/songs.png"))); // NOI18N
        btnMenuCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCancionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(16, 15, 15));
        jPanel9.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuAlbumes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/albumSelected.png"))); // NOI18N
        btnMenuAlbumes.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/albums.png"))); // NOI18N
        btnMenuAlbumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuAlbumesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuAlbumes, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuAlbumes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(16, 15, 15));
        jPanel10.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accountSelected.png"))); // NOI18N
        btnMenuCuenta.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        btnMenuCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(16, 15, 15));
        jPanel11.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeSelected.png"))); // NOI18N
        btnMenuHome.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel11);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("                                                                            ");
        jLabel19.setPreferredSize(new java.awt.Dimension(228, 30));
        menuBar.add(jLabel19);

        jPanel12.setBackground(new java.awt.Color(16, 15, 15));
        jPanel12.setPreferredSize(new java.awt.Dimension(270, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/library.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(140, 45));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(16, 15, 15));
        jPanel13.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuFavoritos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favoritesSelected.png"))); // NOI18N
        btnMenuFavoritos.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/favorites.png"))); // NOI18N
        btnMenuFavoritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuFavoritosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuFavoritos, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuFavoritos, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(16, 15, 15));
        jPanel14.setPreferredSize(new java.awt.Dimension(270, 40));

        btnMenuRestringidos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hideSelected.png"))); // NOI18N
        btnMenuRestringidos.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restricted.png"))); // NOI18N
        btnMenuRestringidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRestringidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuRestringidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(btnMenuRestringidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuBar.add(jPanel14);

        getContentPane().add(menuBar, java.awt.BorderLayout.LINE_START);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2824, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuAlbumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuAlbumesActionPerformed
        this.pintarPanelPrincipal(new PanelAlbumes(this));
    }//GEN-LAST:event_btnMenuAlbumesActionPerformed

    private void btnMenuFavoritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuFavoritosActionPerformed
        this.pintarPanelPrincipal(new PanelFavoritos(this));
    }//GEN-LAST:event_btnMenuFavoritosActionPerformed

    private void btnMenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuBuscarActionPerformed
        this.pintarPanelPrincipal(new PanelBusqueda(this));
    }//GEN-LAST:event_btnMenuBuscarActionPerformed

    private void btnMenuArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuArtistasActionPerformed
        this.pintarPanelPrincipal(new PanelArtistas(this));
    }//GEN-LAST:event_btnMenuArtistasActionPerformed

    private void btnMenuCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCancionesActionPerformed
        this.pintarPanelPrincipal(new PanelCanciones(this));
    }//GEN-LAST:event_btnMenuCancionesActionPerformed

    private void btnMenuCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCuentaActionPerformed
        this.pintarPanelPrincipal(new PanelCuenta(this));
    }//GEN-LAST:event_btnMenuCuentaActionPerformed

    private void btnMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuHomeActionPerformed
        this.pintarPanelPrincipal(new PanelHome(this));
    }//GEN-LAST:event_btnMenuHomeActionPerformed

    private void btnMenuRestringidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRestringidosActionPerformed
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        IGeneroDAO generoDAO = new GeneroDAO(conexionDB);
        IGeneroNegocio generoNegocio = new GeneroNegocio(generoDAO);
        IUsuarioDAO usuarioDAO = new UsuarioDAO(conexionDB);
        IUsuarioNegocio usuarioNegocio = new UsuarioNegocio(usuarioDAO);
        this.pintarPanelPrincipal(new PanelRestricciones(this, generoNegocio, usuarioNegocio));

    }//GEN-LAST:event_btnMenuRestringidosActionPerformed

    public UsuarioDTO getLoggedUser() {
        return this.loggedUser;
    }

    public void setLoggedUser(UsuarioDTO usuarioDTO) {
        this.loggedUser = usuarioDTO;
    }

    public void pintarPanelPrincipal(JPanel panel) {

        jScrollPane1.setViewportView(panel);

//        this.setSize(this.menuBar.getWidth()+panel.getPreferredSize().width, this.getHeight());
        panel.setPreferredSize(new Dimension(0, panel.getPreferredSize().height));  // Set appropriate size for your content
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        jScrollPane1.revalidate();
        jScrollPane1.repaint();
    }

    public JScrollPane getPanelPrincipal() {
        return jScrollPane1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonMenu btnMenuAlbumes;
    private util.BotonMenu btnMenuArtistas;
    private util.BotonMenu btnMenuBuscar;
    private util.BotonMenu btnMenuCanciones;
    private util.BotonMenu btnMenuCuenta;
    private util.BotonMenu btnMenuFavoritos;
    private util.BotonMenu btnMenuHome;
    private util.BotonMenu btnMenuRestringidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menuBar;
    // End of variables declaration//GEN-END:variables
}
