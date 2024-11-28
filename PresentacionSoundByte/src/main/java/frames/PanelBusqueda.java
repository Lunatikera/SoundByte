/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import Conexion.ConexionDB;
import DAO.GeneroDAO;
import DTO.AlbumDTO;
import DTO.UsuarioDTO;
import Docs.CancionDoc;
import Docs.FavoritoDoc;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import InterfacesNegocio.IGeneroNegocio;
import Negocio.GeneroNegocio;
import Negocio.UsuarioNegocio;
import excepciones.NegocioException;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.ImagenPerfil;
import util.PanelAlbumDesplegado;

/**
 *
 * @author carli
 */
public class PanelBusqueda extends javax.swing.JPanel {
    
    FrmPrincipal frmPrincipal;
    
    //Canciones
    JPanel[] panelesCanciones;
    JLabel[] labelsNombreCancion;
    JLabel[] labelNombreAlbumCancion;
    ImagenPerfil[] imagenesAlbumesCancion;
    List<CancionDoc> cancionesDesplegadas = new ArrayList<>();
    
    //Albumes
    PanelAlbumDesplegado[] panelesAlbumes;
    List<AlbumDTO> albumesDesplegados = new ArrayList<>();
    
    //Artistas
    

    

    /**
     * Creates new form Prueba1
     */
    public PanelBusqueda(FrmPrincipal frmPrincipal) {
        initComponents();
        
        this.frmPrincipal = frmPrincipal;
        
        setDefaultTextAndAddFocusListener(buscador, "Buscar...");

        
        inicializarCanciones();
        

        
        eliminaCanciones();
        
        this.revalidate();
        this.repaint();
    }
    
    private void iniciarChequeoUsuario(){
    
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Definir la tarea que quieres ejecutar
        Runnable tarea = () -> {
            
            System.out.println("Tarea ejecutada: " + System.currentTimeMillis());
        };

        // Programar la tarea para que se ejecute cada segundo
        scheduler.scheduleAtFixedRate(tarea, 0, 1, TimeUnit.SECONDS);
        
        
    }
    
    private void inicializarCanciones(){
    
        this.panelesCanciones = new JPanel[]{panelCancionEncontrada1,panelCancionEncontrada2,panelCancionEncontrada3,panelCancionEncontrada4,panelCancionEncontrada5,
        panelCancionEncontrada6,panelCancionEncontrada7,panelCancionEncontrada8,panelCancionEncontrada9,panelCancionEncontrada10};
        
        this.labelsNombreCancion = new JLabel[]{lblNombreCancion1,lblNombreCancion2,lblNombreCancion3,lblNombreCancion4,lblNombreCancion5,
        lblNombreCancion6,lblNombreCancion7,lblNombreCancion8,lblNombreCancion9,lblNombreCancion10};
        
        this.labelNombreAlbumCancion = new JLabel[]{lblNombreArtistaCancion1,lblNombreArtistaCancion2,lblNombreArtistaCancion3,lblNombreArtistaCancion4,lblNombreArtistaCancion5,
        lblNombreArtistaCancion6,lblNombreArtistaCancion7,lblNombreArtistaCancion8,lblNombreArtistaCancion9,lblNombreArtistaCancion10};

        this.imagenesAlbumesCancion = new ImagenPerfil[] {imagenCancion3,imagenCancion4,imagenCancion5,
        imagenCancion6,imagenCancion7,imagenCancion8,imagenCancion9,imagenCancion10, imagenCancion11,imagenCancion12};
        
    }
    
    
    private void eliminaCanciones(){
    
        for (JPanel panel : panelesCanciones) 
            panel.setVisible(false);
        
    }

    
    private void setDefaultTextAndAddFocusListener(javax.swing.JTextField campoTexto, String textoDefault) {
        campoTexto.setText(textoDefault);
        campoTexto.setForeground(Color.GRAY);
        campoTexto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campoTexto.getText().equals(textoDefault)) {
                    campoTexto.setText("");
                    campoTexto.setForeground(Color.BLACK);
                    campoTexto.setBorder(BorderFactory.createLineBorder(new Color(135, 116, 249), 4));
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
                if (campoTexto.getText().isEmpty()) {
                    campoTexto.setText(textoDefault);
                    campoTexto.setForeground(Color.GRAY);
                    campoTexto.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                    
                }
            }
        });
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
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelCancionEncontrada1 = new javax.swing.JPanel();
        imagenCancion3 = new util.ImagenPerfil();
        lblNombreCancion1 = new javax.swing.JLabel();
        lblNombreArtistaCancion1 = new javax.swing.JLabel();
        btnPlay1 = new util.BotonToggle();
        btnFavCancion1 = new util.BotonToggle();
        panelCancionEncontrada2 = new javax.swing.JPanel();
        imagenCancion4 = new util.ImagenPerfil();
        lblNombreCancion2 = new javax.swing.JLabel();
        lblNombreArtistaCancion2 = new javax.swing.JLabel();
        btnPlay2 = new util.BotonToggle();
        btnFavCancion2 = new util.BotonToggle();
        panelCancionEncontrada3 = new javax.swing.JPanel();
        imagenCancion5 = new util.ImagenPerfil();
        lblNombreCancion3 = new javax.swing.JLabel();
        lblNombreArtistaCancion3 = new javax.swing.JLabel();
        btnPlay3 = new util.BotonToggle();
        btnFavCancion3 = new util.BotonToggle();
        panelCancionEncontrada4 = new javax.swing.JPanel();
        imagenCancion6 = new util.ImagenPerfil();
        lblNombreCancion4 = new javax.swing.JLabel();
        lblNombreArtistaCancion4 = new javax.swing.JLabel();
        btnPlay4 = new util.BotonToggle();
        btnFavCancion4 = new util.BotonToggle();
        panelCancionEncontrada5 = new javax.swing.JPanel();
        imagenCancion7 = new util.ImagenPerfil();
        lblNombreCancion5 = new javax.swing.JLabel();
        lblNombreArtistaCancion5 = new javax.swing.JLabel();
        btnPlay5 = new util.BotonToggle();
        btnFavCancion5 = new util.BotonToggle();
        panelCancionEncontrada6 = new javax.swing.JPanel();
        imagenCancion8 = new util.ImagenPerfil();
        lblNombreCancion6 = new javax.swing.JLabel();
        lblNombreArtistaCancion6 = new javax.swing.JLabel();
        btnPlay6 = new util.BotonToggle();
        btnFavCancion6 = new util.BotonToggle();
        panelCancionEncontrada7 = new javax.swing.JPanel();
        imagenCancion9 = new util.ImagenPerfil();
        lblNombreCancion7 = new javax.swing.JLabel();
        lblNombreArtistaCancion7 = new javax.swing.JLabel();
        btnPlay7 = new util.BotonToggle();
        btnFavCancion7 = new util.BotonToggle();
        panelCancionEncontrada8 = new javax.swing.JPanel();
        imagenCancion10 = new util.ImagenPerfil();
        lblNombreCancion8 = new javax.swing.JLabel();
        lblNombreArtistaCancion8 = new javax.swing.JLabel();
        btnPlay8 = new util.BotonToggle();
        btnFavCancion8 = new util.BotonToggle();
        panelCancionEncontrada9 = new javax.swing.JPanel();
        imagenCancion11 = new util.ImagenPerfil();
        lblNombreCancion9 = new javax.swing.JLabel();
        lblNombreArtistaCancion9 = new javax.swing.JLabel();
        btnPlay9 = new util.BotonToggle();
        btnFavCancion9 = new util.BotonToggle();
        panelCancionEncontrada10 = new javax.swing.JPanel();
        imagenCancion12 = new util.ImagenPerfil();
        lblNombreCancion10 = new javax.swing.JLabel();
        lblNombreArtistaCancion10 = new javax.swing.JLabel();
        btnPlay10 = new util.BotonToggle();
        btnFavCancion10 = new util.BotonToggle();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelArtista1 = new javax.swing.JPanel();
        imagenArtista1 = new util.ImagenPerfil();
        lblNombreArtista1 = new javax.swing.JLabel();
        btnFavArtista1 = new util.BotonToggle();
        panelArtista2 = new javax.swing.JPanel();
        imagenArtista2 = new util.ImagenPerfil();
        lblNombreArtista2 = new javax.swing.JLabel();
        btnFavArtista2 = new util.BotonToggle();
        panelArtista3 = new javax.swing.JPanel();
        imagenArtista4 = new util.ImagenPerfil();
        lblNombreArtista4 = new javax.swing.JLabel();
        btnFavArtista3 = new util.BotonToggle();
        panelArtista4 = new javax.swing.JPanel();
        imagenArtista5 = new util.ImagenPerfil();
        lblNombreArtista5 = new javax.swing.JLabel();
        btnFavArtista4 = new util.BotonToggle();
        panelArtista5 = new javax.swing.JPanel();
        imagenArtista6 = new util.ImagenPerfil();
        lblNombreArtista6 = new javax.swing.JLabel();
        btnFavArtista5 = new util.BotonToggle();
        panelArtista6 = new javax.swing.JPanel();
        imagenArtista10 = new util.ImagenPerfil();
        lblNombreArtista10 = new javax.swing.JLabel();
        btnFavArtista6 = new util.BotonToggle();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        panelAlbumes = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        buscador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buscador.setForeground(new java.awt.Color(204, 204, 204));
        buscador.setText("Search...");
        buscador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscadorActionPerformed(evt);
            }
        });
        buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtros.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscador))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))))
        );

        jPanel3.setBackground(new java.awt.Color(27, 26, 26));

        jPanel4.setBackground(new java.awt.Color(27, 26, 26));
        jPanel4.setPreferredSize(new java.awt.Dimension(750, 850));

        panelCancionEncontrada1.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada1.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion3.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion1.setText("Peperina");

        lblNombreArtistaCancion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion1.setText("Seru Giran");

        btnPlay1.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay1.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay1.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion1.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion1.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion1.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavCancion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavCancion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCancionEncontrada1Layout = new javax.swing.GroupLayout(panelCancionEncontrada1);
        panelCancionEncontrada1.setLayout(panelCancionEncontrada1Layout);
        panelCancionEncontrada1Layout.setHorizontalGroup(
            panelCancionEncontrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada1Layout.setVerticalGroup(
            panelCancionEncontrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion1))
                            .addGroup(panelCancionEncontrada1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada1);

        panelCancionEncontrada2.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada2.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion4.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion4.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion2.setText("Peperina");

        lblNombreArtistaCancion2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion2.setText("Seru Giran");

        btnPlay2.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay2.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay2.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion2.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion2.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion2.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavCancion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavCancion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCancionEncontrada2Layout = new javax.swing.GroupLayout(panelCancionEncontrada2);
        panelCancionEncontrada2.setLayout(panelCancionEncontrada2Layout);
        panelCancionEncontrada2Layout.setHorizontalGroup(
            panelCancionEncontrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada2Layout.setVerticalGroup(
            panelCancionEncontrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion2))
                            .addGroup(panelCancionEncontrada2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada2);

        panelCancionEncontrada3.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada3.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion5.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion3.setText("Peperina");

        lblNombreArtistaCancion3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion3.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion3.setText("Seru Giran");

        btnPlay3.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay3.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay3.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion3.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion3.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion3.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada3Layout = new javax.swing.GroupLayout(panelCancionEncontrada3);
        panelCancionEncontrada3.setLayout(panelCancionEncontrada3Layout);
        panelCancionEncontrada3Layout.setHorizontalGroup(
            panelCancionEncontrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion3, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada3Layout.setVerticalGroup(
            panelCancionEncontrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion3))
                            .addGroup(panelCancionEncontrada3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada3);

        panelCancionEncontrada4.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada4.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion6.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion4.setText("Peperina");

        lblNombreArtistaCancion4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion4.setText("Seru Giran");

        btnPlay4.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay4.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay4.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion4.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion4.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion4.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada4Layout = new javax.swing.GroupLayout(panelCancionEncontrada4);
        panelCancionEncontrada4.setLayout(panelCancionEncontrada4Layout);
        panelCancionEncontrada4Layout.setHorizontalGroup(
            panelCancionEncontrada4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion4, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada4Layout.setVerticalGroup(
            panelCancionEncontrada4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion4))
                            .addGroup(panelCancionEncontrada4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada4);

        panelCancionEncontrada5.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada5.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion7.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion7.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion5.setText("Peperina");

        lblNombreArtistaCancion5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion5.setText("Seru Giran");

        btnPlay5.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay5.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay5.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion5.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion5.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion5.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada5Layout = new javax.swing.GroupLayout(panelCancionEncontrada5);
        panelCancionEncontrada5.setLayout(panelCancionEncontrada5Layout);
        panelCancionEncontrada5Layout.setHorizontalGroup(
            panelCancionEncontrada5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion5, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada5Layout.setVerticalGroup(
            panelCancionEncontrada5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion5))
                            .addGroup(panelCancionEncontrada5Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada5);

        panelCancionEncontrada6.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada6.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion8.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion8.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion6.setText("Peperina");

        lblNombreArtistaCancion6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion6.setText("Seru Giran");

        btnPlay6.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay6.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay6.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion6.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion6.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion6.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada6Layout = new javax.swing.GroupLayout(panelCancionEncontrada6);
        panelCancionEncontrada6.setLayout(panelCancionEncontrada6Layout);
        panelCancionEncontrada6Layout.setHorizontalGroup(
            panelCancionEncontrada6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion6, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada6Layout.setVerticalGroup(
            panelCancionEncontrada6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion6))
                            .addGroup(panelCancionEncontrada6Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada6);

        panelCancionEncontrada7.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada7.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion9.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion9.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion7.setText("Peperina");

        lblNombreArtistaCancion7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion7.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion7.setText("Seru Giran");

        btnPlay7.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay7.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay7.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion7.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion7.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion7.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada7Layout = new javax.swing.GroupLayout(panelCancionEncontrada7);
        panelCancionEncontrada7.setLayout(panelCancionEncontrada7Layout);
        panelCancionEncontrada7Layout.setHorizontalGroup(
            panelCancionEncontrada7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion7, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada7Layout.setVerticalGroup(
            panelCancionEncontrada7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion7))
                            .addGroup(panelCancionEncontrada7Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada7);

        panelCancionEncontrada8.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada8.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion10.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion10.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion8.setText("Peperina");

        lblNombreArtistaCancion8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion8.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion8.setText("Seru Giran");

        btnPlay8.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay8.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay8.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion8.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion8.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion8.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada8Layout = new javax.swing.GroupLayout(panelCancionEncontrada8);
        panelCancionEncontrada8.setLayout(panelCancionEncontrada8Layout);
        panelCancionEncontrada8Layout.setHorizontalGroup(
            panelCancionEncontrada8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion8, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada8Layout.setVerticalGroup(
            panelCancionEncontrada8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion8))
                            .addGroup(panelCancionEncontrada8Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada8);

        panelCancionEncontrada9.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada9.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion11.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion11.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion9.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion9.setText("Peperina");

        lblNombreArtistaCancion9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion9.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion9.setText("Seru Giran");

        btnPlay9.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay9.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay9.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion9.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion9.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion9.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada9Layout = new javax.swing.GroupLayout(panelCancionEncontrada9);
        panelCancionEncontrada9.setLayout(panelCancionEncontrada9Layout);
        panelCancionEncontrada9Layout.setHorizontalGroup(
            panelCancionEncontrada9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion9, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada9Layout.setVerticalGroup(
            panelCancionEncontrada9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion9))
                            .addGroup(panelCancionEncontrada9Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada9);

        panelCancionEncontrada10.setBackground(new java.awt.Color(27, 26, 26));
        panelCancionEncontrada10.setMinimumSize(new java.awt.Dimension(750, 100));

        imagenCancion12.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenCancion12.setPreferredSize(new java.awt.Dimension(50, 50));

        lblNombreCancion10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombreCancion10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCancion10.setText("Peperina");

        lblNombreArtistaCancion10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreArtistaCancion10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtistaCancion10.setText("Seru Giran");

        btnPlay10.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause.png"))); // NOI18N
        btnPlay10.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/play.png"))); // NOI18N
        btnPlay10.setPreferredSize(new java.awt.Dimension(28, 28));

        btnFavCancion10.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavCancion10.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavCancion10.setPreferredSize(new java.awt.Dimension(28, 28));

        javax.swing.GroupLayout panelCancionEncontrada10Layout = new javax.swing.GroupLayout(panelCancionEncontrada10);
        panelCancionEncontrada10.setLayout(panelCancionEncontrada10Layout);
        panelCancionEncontrada10Layout.setHorizontalGroup(
            panelCancionEncontrada10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnPlay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(imagenCancion12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(panelCancionEncontrada10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                        .addComponent(lblNombreArtistaCancion10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblNombreCancion10, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnFavCancion10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelCancionEncontrada10Layout.setVerticalGroup(
            panelCancionEncontrada10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                .addGroup(panelCancionEncontrada10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnFavCancion10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCancionEncontrada10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenCancion12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                                .addComponent(lblNombreCancion10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreArtistaCancion10))
                            .addGroup(panelCancionEncontrada10Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnPlay10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.add(panelCancionEncontrada10);

        jPanel3.add(jPanel4);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("         ");
        jPanel3.add(jLabel7);

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));
        jPanel5.setPreferredSize(new java.awt.Dimension(750, 850));

        panelArtista1.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista1.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista1.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista1.setText("Peperina");

        btnFavArtista1.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista1.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista1.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista1Layout = new javax.swing.GroupLayout(panelArtista1);
        panelArtista1.setLayout(panelArtista1Layout);
        panelArtista1Layout.setHorizontalGroup(
            panelArtista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista1)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista1Layout.setVerticalGroup(
            panelArtista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista1)
                    .addComponent(btnFavArtista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista1);

        panelArtista2.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista2.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista2.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista2.setText("Peperina");

        btnFavArtista2.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista2.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista2.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista2Layout = new javax.swing.GroupLayout(panelArtista2);
        panelArtista2.setLayout(panelArtista2Layout);
        panelArtista2Layout.setHorizontalGroup(
            panelArtista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista2)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista2Layout.setVerticalGroup(
            panelArtista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista2)
                    .addComponent(btnFavArtista2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista2);

        panelArtista3.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista3.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista4.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista4.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista4.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista4.setText("Peperina");

        btnFavArtista3.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista3.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista3.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista3Layout = new javax.swing.GroupLayout(panelArtista3);
        panelArtista3.setLayout(panelArtista3Layout);
        panelArtista3Layout.setHorizontalGroup(
            panelArtista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista4)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista3Layout.setVerticalGroup(
            panelArtista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista4)
                    .addComponent(btnFavArtista3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista3);

        panelArtista4.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista4.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista5.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista5.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista5.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista5.setText("Peperina");

        btnFavArtista4.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista4.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista4.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista4Layout = new javax.swing.GroupLayout(panelArtista4);
        panelArtista4.setLayout(panelArtista4Layout);
        panelArtista4Layout.setHorizontalGroup(
            panelArtista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista5)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista4Layout.setVerticalGroup(
            panelArtista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista5)
                    .addComponent(btnFavArtista4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista4);

        panelArtista5.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista5.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista6.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista6.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista6.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista6.setText("Peperina");

        btnFavArtista5.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista5.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista5.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista5Layout = new javax.swing.GroupLayout(panelArtista5);
        panelArtista5.setLayout(panelArtista5Layout);
        panelArtista5Layout.setHorizontalGroup(
            panelArtista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista5Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista6)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista5Layout.setVerticalGroup(
            panelArtista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista6)
                    .addComponent(btnFavArtista5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista5);

        panelArtista6.setBackground(new java.awt.Color(27, 26, 26));
        panelArtista6.setPreferredSize(new java.awt.Dimension(250, 250));

        imagenArtista10.setImagen(new javax.swing.ImageIcon(getClass().getResource("/albums/Peperina.jpg"))); // NOI18N
        imagenArtista10.setPreferredSize(new java.awt.Dimension(100, 100));

        lblNombreArtista10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNombreArtista10.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreArtista10.setText("Peperina");

        btnFavArtista6.setClickedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/starClick.png"))); // NOI18N
        btnFavArtista6.setNormalIcon(new javax.swing.ImageIcon(getClass().getResource("/images/star.png"))); // NOI18N
        btnFavArtista6.setPreferredSize(new java.awt.Dimension(28, 28));
        btnFavArtista6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavArtista6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelArtista6Layout = new javax.swing.GroupLayout(panelArtista6);
        panelArtista6.setLayout(panelArtista6Layout);
        panelArtista6Layout.setHorizontalGroup(
            panelArtista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArtista6Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelArtista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelArtista6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblNombreArtista10)
                        .addGap(41, 41, 41)
                        .addComponent(btnFavArtista6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenArtista10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        panelArtista6Layout.setVerticalGroup(
            panelArtista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArtista6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagenArtista10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelArtista6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreArtista10)
                    .addComponent(btnFavArtista6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel5.add(panelArtista6);

        jPanel3.add(jPanel5);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Artistas");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Canciones");

        jPanel43.setBackground(new java.awt.Color(27, 26, 26));
        jPanel43.setPreferredSize(new java.awt.Dimension(1275, 100));

        jPanel44.setBackground(new java.awt.Color(27, 26, 26));
        jPanel44.setForeground(new java.awt.Color(255, 255, 255));
        jPanel44.setToolTipText("");
        jPanel44.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel44);

        jLabel25.setText(" ");
        jPanel43.add(jLabel25);

        jPanel45.setBackground(new java.awt.Color(27, 26, 26));
        jPanel45.setForeground(new java.awt.Color(255, 255, 255));
        jPanel45.setToolTipText("");
        jPanel45.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel45);

        jLabel26.setText(" ");
        jPanel43.add(jLabel26);

        jPanel46.setBackground(new java.awt.Color(27, 26, 26));
        jPanel46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel46.setToolTipText("");
        jPanel46.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel46);

        jLabel27.setText(" ");
        jPanel43.add(jLabel27);

        jPanel47.setBackground(new java.awt.Color(27, 26, 26));
        jPanel47.setForeground(new java.awt.Color(255, 255, 255));
        jPanel47.setToolTipText("");
        jPanel47.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel47);

        jLabel6.setText(" ");
        jPanel43.add(jLabel6);

        jPanel48.setBackground(new java.awt.Color(27, 26, 26));
        jPanel48.setForeground(new java.awt.Color(255, 255, 255));
        jPanel48.setToolTipText("");
        jPanel48.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel48);

        jLabel28.setText(" ");
        jPanel43.add(jLabel28);

        jPanel49.setBackground(new java.awt.Color(27, 26, 26));
        jPanel49.setForeground(new java.awt.Color(255, 255, 255));
        jPanel49.setToolTipText("");
        jPanel49.setPreferredSize(new java.awt.Dimension(200, 130));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel43.add(jPanel49);

        panelAlbumes.setBackground(new java.awt.Color(27, 26, 26));

        jLabel12.setText(" ");
        panelAlbumes.add(jLabel12);

        jLabel13.setText(" ");
        panelAlbumes.add(jLabel13);

        jLabel14.setText(" ");
        panelAlbumes.add(jLabel14);

        jLabel15.setText(" ");
        panelAlbumes.add(jLabel15);

        jLabel16.setText(" ");
        panelAlbumes.add(jLabel16);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Albumes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(442, 442, 442))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAlbumes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel24)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed

    }//GEN-LAST:event_buscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        IConexionDB conexionDB = new ConexionDB("mongodb://localhost:27017", "SoundByte");
        IGeneroDAO generoDAO= new GeneroDAO(conexionDB);
        IGeneroNegocio generoNegocio= new GeneroNegocio(generoDAO);
        DialogFiltros popup = new DialogFiltros(frmPrincipal, true,generoNegocio); // 'frmPrincipal' is the parent frame
    popup.setLocationRelativeTo(frmPrincipal);
    
    popup.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_buscadorKeyPressed

    public void buscarCanciones(String filtro){
    
        //Eliminamos las canciones previamente desplegadas si existen        
        if(!cancionesDesplegadas.isEmpty())
            cancionesDesplegadas.clear();
        
        //Eliminamos las canciones que se estén mostrando en pantalla
        eliminaCanciones();
        
        int counter = 0;
        
        //Buscamos las canciones con el filtro especificado
        try {
            List<AlbumDTO> albumes = frmPrincipal.albumNegocio.obtenerCancionesPorBusqueda(filtro, frmPrincipal.getLoggedUser());
            
            //Si nos regresa datos vacíos, terminamos ejecución
            if(albumes == null)
                return;
            
            //Iteramos por cada album que nos regresa
            for(AlbumDTO album : albumes){
                
                //Iteramos por cada canción dentro del album
                for(CancionDoc cancion : album.getCanciones()){
                    
                    //Si ya están desplegadas más de 9 canciones terminamos la ejecución, ya que ya no hay espacio para mostrar
                    if(counter >= 9)
                        return;
                    
                    //Si el nombre de la canción es muy larga, lo cortamos
                    if(cancion.getNombre().length() >= 40){
                    
                        String nombreCortadoCancion = cancion.getNombre().substring(0, 40) + "...";
                        
                        labelsNombreCancion[counter].setText(nombreCortadoCancion);
                        
                    }
                    else
                        labelsNombreCancion[counter].setText(cancion.getNombre());

                    //Si el nombre del album es muy largo, lo cortamos
                    if(album.getNombre().length() >= 30){
                    
                        String nombreCortadoAlbum = album.getNombre().substring(0, 30) + "...";
                        
                        labelNombreAlbumCancion[counter].setText(nombreCortadoAlbum);
                        
                    }
                    else
                        labelNombreAlbumCancion[counter].setText(album.getNombre());
                    
                    //Le ponemos la imagen del album correspondiente
                    ImageIcon imagen = new ImageIcon(getClass().getResource(album.getImagen()));
                    imagenesAlbumesCancion[counter].setImagen(imagen);
                    
                    //Mostramos el panel con la información completa
                    panelesCanciones[counter].setVisible(true);
                    
                    //Agregamos la canción desplegada en la lista de canciones
                    cancionesDesplegadas.add(cancion);
                    
                    counter++;
                    
                }
                
            }
                
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar las canciones" + ex);
        }
        
        
    }
    
    public void buscarAlbumes(String filtro){
    
        
        
        //Eliminamos los albumes previamente desplegadas si existen        
        if(!albumesDesplegados.isEmpty())
            albumesDesplegados.clear();
        
        //Eliminamos los albumes que se estén mostrando en pantalla
        panelAlbumes.removeAll();
        
        int counter = 0;
        
        //Buscamos los albumes con el filtro especificado
        try {
            List<AlbumDTO> albumes = frmPrincipal.albumNegocio.obtenerAlbumesPorBusqueda(filtro, frmPrincipal.getLoggedUser());
            
            //Si nos regresa datos vacíos, terminamos ejecución
            if(albumes == null)
                return;
            
            //Iteramos por cada album que nos regresa
            for(AlbumDTO album : albumes){
                
                    PanelAlbumDesplegado panel = new PanelAlbumDesplegado();
                    //Si ya están desplegadas más de 6 albumes terminamos la ejecución, ya que ya no hay espacio para mostrar
                    if(counter >= 6)
                        return;
              
                    //Agregamos el album desplegado en la lista de albumes
                    albumesDesplegados.add(album);
                    
                    panel.setAlbum(album);
                    panel.setUsuario(frmPrincipal.getLoggedUser());
                    
                    panel.iniciarAlbum();
                    
                    panelAlbumes.add(panel);
                    
                    counter++;
                    
            }
                
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar los albumes " + ex);
        }
        
    }
    
    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased

        buscarCanciones(buscador.getText());
        buscarAlbumes(buscador.getText());
        
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_buscadorKeyReleased


    private void btnFavCancion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavCancion1ActionPerformed

    }//GEN-LAST:event_btnFavCancion1ActionPerformed

    private void btnFavCancion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavCancion2ActionPerformed

    }//GEN-LAST:event_btnFavCancion2ActionPerformed

    private void btnFavArtista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista1ActionPerformed

    private void btnFavArtista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista2ActionPerformed

    private void btnFavArtista3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista3ActionPerformed

    private void btnFavArtista4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista4ActionPerformed

    private void btnFavArtista5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista5ActionPerformed

    private void btnFavArtista6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavArtista6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFavArtista6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.BotonToggle btnFavArtista1;
    private util.BotonToggle btnFavArtista2;
    private util.BotonToggle btnFavArtista3;
    private util.BotonToggle btnFavArtista4;
    private util.BotonToggle btnFavArtista5;
    private util.BotonToggle btnFavArtista6;
    private util.BotonToggle btnFavCancion1;
    private util.BotonToggle btnFavCancion10;
    private util.BotonToggle btnFavCancion2;
    private util.BotonToggle btnFavCancion3;
    private util.BotonToggle btnFavCancion4;
    private util.BotonToggle btnFavCancion5;
    private util.BotonToggle btnFavCancion6;
    private util.BotonToggle btnFavCancion7;
    private util.BotonToggle btnFavCancion8;
    private util.BotonToggle btnFavCancion9;
    private util.BotonToggle btnPlay1;
    private util.BotonToggle btnPlay10;
    private util.BotonToggle btnPlay2;
    private util.BotonToggle btnPlay3;
    private util.BotonToggle btnPlay4;
    private util.BotonToggle btnPlay5;
    private util.BotonToggle btnPlay6;
    private util.BotonToggle btnPlay7;
    private util.BotonToggle btnPlay8;
    private util.BotonToggle btnPlay9;
    private javax.swing.JTextField buscador;
    private util.ImagenPerfil imagenArtista1;
    private util.ImagenPerfil imagenArtista10;
    private util.ImagenPerfil imagenArtista2;
    private util.ImagenPerfil imagenArtista4;
    private util.ImagenPerfil imagenArtista5;
    private util.ImagenPerfil imagenArtista6;
    private util.ImagenPerfil imagenCancion10;
    private util.ImagenPerfil imagenCancion11;
    private util.ImagenPerfil imagenCancion12;
    private util.ImagenPerfil imagenCancion3;
    private util.ImagenPerfil imagenCancion4;
    private util.ImagenPerfil imagenCancion5;
    private util.ImagenPerfil imagenCancion6;
    private util.ImagenPerfil imagenCancion7;
    private util.ImagenPerfil imagenCancion8;
    private util.ImagenPerfil imagenCancion9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblNombreArtista1;
    private javax.swing.JLabel lblNombreArtista10;
    private javax.swing.JLabel lblNombreArtista2;
    private javax.swing.JLabel lblNombreArtista4;
    private javax.swing.JLabel lblNombreArtista5;
    private javax.swing.JLabel lblNombreArtista6;
    private javax.swing.JLabel lblNombreArtistaCancion1;
    private javax.swing.JLabel lblNombreArtistaCancion10;
    private javax.swing.JLabel lblNombreArtistaCancion2;
    private javax.swing.JLabel lblNombreArtistaCancion3;
    private javax.swing.JLabel lblNombreArtistaCancion4;
    private javax.swing.JLabel lblNombreArtistaCancion5;
    private javax.swing.JLabel lblNombreArtistaCancion6;
    private javax.swing.JLabel lblNombreArtistaCancion7;
    private javax.swing.JLabel lblNombreArtistaCancion8;
    private javax.swing.JLabel lblNombreArtistaCancion9;
    private javax.swing.JLabel lblNombreCancion1;
    private javax.swing.JLabel lblNombreCancion10;
    private javax.swing.JLabel lblNombreCancion2;
    private javax.swing.JLabel lblNombreCancion3;
    private javax.swing.JLabel lblNombreCancion4;
    private javax.swing.JLabel lblNombreCancion5;
    private javax.swing.JLabel lblNombreCancion6;
    private javax.swing.JLabel lblNombreCancion7;
    private javax.swing.JLabel lblNombreCancion8;
    private javax.swing.JLabel lblNombreCancion9;
    private javax.swing.JPanel panelAlbumes;
    private javax.swing.JPanel panelArtista1;
    private javax.swing.JPanel panelArtista2;
    private javax.swing.JPanel panelArtista3;
    private javax.swing.JPanel panelArtista4;
    private javax.swing.JPanel panelArtista5;
    private javax.swing.JPanel panelArtista6;
    private javax.swing.JPanel panelCancionEncontrada1;
    private javax.swing.JPanel panelCancionEncontrada10;
    private javax.swing.JPanel panelCancionEncontrada2;
    private javax.swing.JPanel panelCancionEncontrada3;
    private javax.swing.JPanel panelCancionEncontrada4;
    private javax.swing.JPanel panelCancionEncontrada5;
    private javax.swing.JPanel panelCancionEncontrada6;
    private javax.swing.JPanel panelCancionEncontrada7;
    private javax.swing.JPanel panelCancionEncontrada8;
    private javax.swing.JPanel panelCancionEncontrada9;
    // End of variables declaration//GEN-END:variables
}
