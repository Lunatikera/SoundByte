/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import Colecciones.ArtistaColeccion;
import Colecciones.GeneroColeccion;
import Conexion.ConexionDB;
import DAO.GeneroDAO;
import DTO.AlbumDTO;
import DTO.ArtistaDTO;
import DTO.FiltroMusicaDTO;
import DTO.GeneroDTO;
import Docs.CancionDoc;
import InterfacesDAO.IConexionDB;
import InterfacesDAO.IGeneroDAO;
import InterfacesNegocio.IGeneroNegocio;
import Negocio.GeneroNegocio;
import excepciones.NegocioException;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.bson.types.ObjectId;
import util.PanelAlbumDesplegado;
import util.PanelArtistaDesplegado;
import util.PanelCancionDesplegada;

/**
 *
 * @author carli
 */
public class PanelArtistasFavoritos extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    PanelFavoritos pFavoritos;
    
    FiltroMusicaDTO filtroMusica = null;
    
    int cantidadArtistas = 0;
    
    List<ArtistaDTO> artistasTotal = new ArrayList<>();
    
    private int pagina=1;
    private int LIMITE=15;

    /**
     * Creates new form Prueba1
     */
    public PanelArtistasFavoritos(FrmPrincipal frmPrincipal1, PanelFavoritos pFavoritos) {
        initComponents();
        
        this.frmPrincipal = frmPrincipal1;
        this.pFavoritos = pFavoritos;
        this.revalidate();
        this.repaint();
        setDefaultTextAndAddFocusListener(buscador, "Buscar...");

    }
    
    public PanelArtistasFavoritos(FrmPrincipal frmPrincipal1, String filtro, FiltroMusicaDTO filtroMusica) {
        initComponents();
        
        this.filtroMusica = filtroMusica;
        this.frmPrincipal = frmPrincipal1;
        
        buscarArtistas(filtro);
        
        this.revalidate();
        this.repaint();
        setDefaultTextAndAddFocusListener(buscador, "Buscar...");
        buscador.setText(filtro);
    }

    public JPanel getPanelBusqueda() {
        return this.PanelBusquda;
    }

    public void setFiltroMusica(FiltroMusicaDTO filtroMusica) {
        this.filtroMusica = filtroMusica;
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
        panelArtistasDesplegados = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnPaginaMenos = new util.BotonMenu();
        jLabel2 = new javax.swing.JLabel();
        lblPagina = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPaginaMas = new util.BotonMenu();
        PanelBusquda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnFiltros = new javax.swing.JButton();
        buscador = new javax.swing.JTextField();
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

        panelArtistasDesplegados.setBackground(new java.awt.Color(27, 26, 26));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("         ");
        panelArtistasDesplegados.add(jLabel7);

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

        panelArtistasDesplegados.add(jPanel21);

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        btnPaginaMenos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftSelected.png"))); // NOI18N
        btnPaginaMenos.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        btnPaginaMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaginaMenos);

        jLabel2.setText("                        ");
        jPanel1.add(jLabel2);

        lblPagina.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPagina.setForeground(new java.awt.Color(255, 255, 255));
        lblPagina.setText("Página 1");
        jPanel1.add(lblPagina);

        jLabel1.setText("                        ");
        jPanel1.add(jLabel1);

        btnPaginaMas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightSelected.png"))); // NOI18N
        btnPaginaMas.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        btnPaginaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaginaMas);

        PanelBusquda.setBackground(new java.awt.Color(27, 26, 26));
        PanelBusquda.setPreferredSize(new java.awt.Dimension(1500, 261));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artistas");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N

        btnFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filtros.png"))); // NOI18N
        btnFiltros.setBorderPainted(false);
        btnFiltros.setContentAreaFilled(false);
        btnFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrosActionPerformed(evt);
            }
        });

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscadorKeyReleased(evt);
            }
        });

        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftSelected.png"))); // NOI18N
        btnAtras.setSimpleIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBusqudaLayout = new javax.swing.GroupLayout(PanelBusquda);
        PanelBusquda.setLayout(PanelBusqudaLayout);
        PanelBusqudaLayout.setHorizontalGroup(
            PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusqudaLayout.createSequentialGroup()
                .addGroup(PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBusqudaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(PanelBusqudaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltros)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        PanelBusqudaLayout.setVerticalGroup(
            PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBusqudaLayout.createSequentialGroup()
                .addGroup(PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBusqudaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3))
                    .addGroup(PanelBusqudaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBusqudaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltros)
                        .addGap(39, 39, 39))
                    .addGroup(PanelBusqudaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(PanelBusqudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscador)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelBusquda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(panelArtistasDesplegados, javax.swing.GroupLayout.PREFERRED_SIZE, 1628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PanelBusquda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(panelArtistasDesplegados, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrosActionPerformed

        cantidadArtistas = 0;
        panelArtistasDesplegados.removeAll();
        
        DialogFiltros popup = new DialogFiltros(frmPrincipal,this, frmPrincipal.generoNegocio, frmPrincipal.getLoggedUser(), filtroMusica);
        popup.setLocationRelativeTo(frmPrincipal);
        
        popup.setVisible(true);
        
    }//GEN-LAST:event_btnFiltrosActionPerformed

    private void buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscadorActionPerformed
    public void buscarArtistas(String filtro){
    
        LIMITE = 15;
        pagina = 1;
        lblPagina.setText("Página " + pagina);
        cantidadArtistas = 0;
        //Eliminamos las canciones previamente desplegadas si existen        
        if(!artistasTotal.isEmpty())
            artistasTotal.clear();
        
        //Eliminamos las canciones que se estén mostrando en pantalla
        panelArtistasDesplegados.removeAll();
        
        int counter = 0;
        
        //Buscamos las canciones con el filtro especificado
        List<ArtistaDTO> artistas = new ArrayList<>();
        
        if(filtroMusica == null)
            
            for(ArtistaColeccion artista : frmPrincipal.getLoggedUser().getFavoritos().getArtistas()){
             
                if(artista.getNombre().startsWith(filtro))
                    artistas.add(frmPrincipal.artistaNegocio.convertirArtistaDTO(artista));
            }
        
        else{
            
            
            boolean esEspecificado;
            
            HashMap<Integer, ObjectId> idsGeneros = new HashMap<>();
            
            for(int i = 0; i<=filtroMusica.getGeneros().size()-1; i++)
                idsGeneros.put(i, filtroMusica.getGeneros().get(i).getId());
            
            for(ArtistaColeccion artista : frmPrincipal.getLoggedUser().getFavoritos().getArtistas()){
                
                esEspecificado = false;
                
                for(GeneroColeccion genero : artista.getGeneros())
                    if(idsGeneros.containsValue(genero.getId()))
                        esEspecificado = true;
                
                if(artista.getNombre().startsWith(filtro))
                    if(esEspecificado)
                        artistas.add(frmPrincipal.artistaNegocio.convertirArtistaDTO(artista));
                
                
            }
            

        }

        artistasTotal = artistas;
        
        for(ArtistaDTO artista : artistas)
            cantidadArtistas++;
        
        //Iteramos por cada album que nos regresa
        for(ArtistaDTO artista : artistas){
            
            if(counter > LIMITE){
                return;
            }
            
            PanelArtistaDesplegado panel = new PanelArtistaDesplegado(frmPrincipal, this, artista, frmPrincipal.getLoggedUser(), frmPrincipal.usuarioNegocio, frmPrincipal.artistaNegocio);
            
            panelArtistasDesplegados.add(panel);
            
            counter++;
            
            
        }
    }
    
    public void paginacionAdelante(int contador){
    
        panelArtistasDesplegados.removeAll();
        
        this.revalidate();
        this.repaint();
        //Iteramos por cada album que nos regresa
        if(LIMITE < cantidadArtistas){
        for(int i = contador; i < LIMITE; i++){


                PanelArtistaDesplegado panel = new PanelArtistaDesplegado(frmPrincipal, this, artistasTotal.get(i), frmPrincipal.getLoggedUser(), frmPrincipal.usuarioNegocio, frmPrincipal.artistaNegocio);

                panelArtistasDesplegados.add(panel);


                

            }
        
        this.revalidate();
        this.repaint();
        }
                for(int i = contador; i < cantidadArtistas; i++){


                PanelArtistaDesplegado panel = new PanelArtistaDesplegado(frmPrincipal, this, artistasTotal.get(i), frmPrincipal.getLoggedUser(), frmPrincipal.usuarioNegocio, frmPrincipal.artistaNegocio);

                panelArtistasDesplegados.add(panel);


                

            }
        
        this.revalidate();
        this.repaint();
        
    }
    
    public void paginacionAtras(int contador){
    
        panelArtistasDesplegados.removeAll();
        
        this.revalidate();
        this.repaint();
        
        //Iteramos por cada album que nos regresa
        for(int i = contador; i < LIMITE ; i++){


                PanelArtistaDesplegado panel = new PanelArtistaDesplegado(frmPrincipal, this, artistasTotal.get(i), frmPrincipal.getLoggedUser(), frmPrincipal.usuarioNegocio, frmPrincipal.artistaNegocio);

                panelArtistasDesplegados.add(panel);

  
                

            }
    
        this.revalidate();
        this.repaint();

        
    }
    
    
    
    private void buscadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscadorKeyReleased
        
        if(buscador.getText().equals("")){

            cantidadArtistas = 0;
            panelArtistasDesplegados.removeAll();

            
            this.revalidate();
            this.repaint();
            return;
            
        }
        
        if(buscador.getText().equals("@all")){
         
            buscarArtistas("");

            
            this.revalidate();
            this.repaint();
            return;
            
        }

        else{
        
            buscarArtistas(buscador.getText());


            this.revalidate();
            this.repaint();
        
        
        }
            
        
    }//GEN-LAST:event_buscadorKeyReleased

    private void btnPaginaMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaMenosActionPerformed

        if(LIMITE <= 15){
            JOptionPane.showMessageDialog(this, "No hay más páginas para atrás");
            return;
        }
        
        pagina--;
        lblPagina.setText("Página " + pagina);
        
        int contador = LIMITE-30;
        LIMITE = LIMITE - 15;
        paginacionAtras(contador);

        
    }//GEN-LAST:event_btnPaginaMenosActionPerformed

    private void btnPaginaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaMasActionPerformed

        if(cantidadArtistas < LIMITE){
            JOptionPane.showMessageDialog(this, "No hay más páginas en frente");
            return;
        }
        
        pagina++;
        lblPagina.setText("Página " + pagina);
        int contador = LIMITE;
        LIMITE = LIMITE + 15;
        
        paginacionAdelante(contador);
        
    }//GEN-LAST:event_btnPaginaMasActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        if(pFavoritos != null)
        frmPrincipal.pintarPanelPrincipal(pFavoritos);

    }//GEN-LAST:event_btnAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBusquda;
    private util.BotonMenu btnAtras;
    private javax.swing.JButton btnFiltros;
    private util.BotonMenu btnPaginaMas;
    private util.BotonMenu btnPaginaMenos;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JLabel lblPagina;
    private javax.swing.JPanel panelArtistasDesplegados;
    // End of variables declaration//GEN-END:variables
}
