/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import util.CustomSliderUI;
import util.ModernScrollBarUI;
import util.ScrollBar;

/**
 *
 * @author carli
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setTitle("SouundByte");
        this.setLocation(265, 76);
        this.setSize(2066, 1321);
        this.btnMenuHomeActionPerformed(null);
        this.jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jSlider1.setUI(new CustomSliderUI(jSlider1));
        jSlider1.revalidate();
        jSlider1.repaint();
        jSlider1.setOpaque(false);

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
        jPanel6 = new javax.swing.JPanel();
        btnMenuGeneros = new util.BotonMenu();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        imagenCancion16 = new util.ImagenPerfil();
        lblNombreCancion3 = new javax.swing.JLabel();
        lblNombreArtistaCancion3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        play7 = new util.BotonToggle();
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

        jPanel6.setBackground(new java.awt.Color(16, 15, 15));
        jPanel6.setPreferredSize(new java.awt.Dimension(270, 55));

        btnMenuGeneros.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generosSelected.png"))); // NOI18N
        btnMenuGeneros.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/genre.png"))); // NOI18N
        btnMenuGeneros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuGenerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMenuGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menuBar.add(jPanel6);

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

        btnMenuRestringidos.setText("aaaa");
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
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnMenuRestringidos, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuRestringidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuBar.add(jPanel14);

        getContentPane().add(menuBar, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(19, 19, 19));
        jPanel3.setPreferredSize(new java.awt.Dimension(1920, 80));

        imagenCancion16.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion16.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion3.setText("Peperina");

        lblNombreArtistaCancion3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion3.setText("Seru Giran");

        jSlider1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(135, 116, 249));
        jSlider1.setToolTipText("");
        jSlider1.setValue(25);
        jSlider1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSlider1.setPreferredSize(new java.awt.Dimension(700, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("-:--");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-:--");

        play7.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        play7.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        play7.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(imagenCancion16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreArtistaCancion3)
                    .addComponent(lblNombreCancion3))
                .addGap(31, 31, 31)
                .addComponent(play7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(646, 646, 646)
                .addComponent(jLabel5)
                .addContainerGap(2177, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 1155, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(5, 5, 5)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(jLabel10)
                    .addGap(0, 1155, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(lblNombreArtistaCancion3))
                            .addComponent(imagenCancion16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(play7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel10))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

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
            .addGap(0, 1080, Short.MAX_VALUE)
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

    private void btnMenuGenerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuGenerosActionPerformed
        this.pintarPanelPrincipal(new PanelArtista(this));
    }//GEN-LAST:event_btnMenuGenerosActionPerformed

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
        this.pintarPanelPrincipal(new PanelRestricciones(this));

    }//GEN-LAST:event_btnMenuRestringidosActionPerformed

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

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonMenu btnMenuAlbumes;
    private util.BotonMenu btnMenuArtistas;
    private util.BotonMenu btnMenuBuscar;
    private util.BotonMenu btnMenuCanciones;
    private util.BotonMenu btnMenuCuenta;
    private util.BotonMenu btnMenuFavoritos;
    private util.BotonMenu btnMenuGeneros;
    private util.BotonMenu btnMenuHome;
    private util.BotonMenu btnMenuRestringidos;
    private util.ImagenPerfil imagenCancion16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblNombreArtistaCancion3;
    private javax.swing.JLabel lblNombreCancion3;
    private javax.swing.JPanel menuBar;
    private util.BotonToggle play7;
    // End of variables declaration//GEN-END:variables
}
