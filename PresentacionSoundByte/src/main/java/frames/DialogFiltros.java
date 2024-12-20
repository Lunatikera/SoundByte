/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frames;

import Colecciones.GeneroColeccion;
import DAO.GeneroDAO;
import DTO.FiltroMusicaDTO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import InterfacesDAO.IGeneroDAO;
import InterfacesNegocio.IGeneroNegocio;
import Negocio.GeneroNegocio;
import excepciones.NegocioException;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.bson.types.ObjectId;
import util.ScrollBar;

/**
 *
 * @author carli
 */
public class DialogFiltros extends javax.swing.JDialog {

    /**
     * Creates new form DialogFiltros
     */
    
    List<GeneroDTO> generos = new ArrayList<>();
    List<GeneroDTO> generosAFiltrar = new ArrayList<>();
    FiltroMusicaDTO filtros;
    
    FrmPrincipal frmPrincipal;
    PanelAlbumes pAlbumes;
    PanelAlbumesFavoritos pAlbumesFav;
    PanelBusqueda pBusqueda;
    PanelArtistas pArtistas;
    PanelArtistasFavoritos pArtistasFav;
    PanelCanciones pCanciones;
    PanelCancionesFavoritas pCancionesFav;
    
    
    DefaultListModel<String> todosGeneros = new DefaultListModel<>();
    DefaultListModel<String> generosFiltrados = new DefaultListModel<>();

    public DialogFiltros(FrmPrincipal frmPrincipal, PanelBusqueda panelBusqueda, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pBusqueda = panelBusqueda;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelCanciones panelCanciones, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pCanciones = panelCanciones;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelCancionesFavoritas pCancionesFav, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pCancionesFav = pCancionesFav;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelAlbumes pAlbumes, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pAlbumes = pAlbumes;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelAlbumesFavoritos pAlbumesFav, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pAlbumesFav = pAlbumesFav;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelArtistas pArtistas, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pArtistas = pArtistas;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }
    
    public DialogFiltros(FrmPrincipal frmPrincipal, PanelArtistasFavoritos pArtistasFav, IGeneroNegocio generoNegocio, UsuarioDTO loggedUser, FiltroMusicaDTO filtros) {
        
 
        initComponents();

        this.setTitle("Filtros");

        this.frmPrincipal = frmPrincipal;
        this.pArtistasFav = pArtistasFav;
        this.filtros = filtros;
        
        inicializaFiltros(filtros);
        
        switchAlbumes.setVisible(false);
        switchCanciones.setVisible(false);
        switchArtistas.setVisible(false);
        
        lblAlbumes.setVisible(false);
        lblCanciones.setVisible(false);
        lblArtistas.setVisible(false);
        
        this.setLayout(new GridLayout(1,1));
        
        this.jScrollPane4.setVerticalScrollBar(new ScrollBar());
        this.jScrollPane5.setVerticalScrollBar(new ScrollBar());

        listGeneros.setModel(todosGeneros);
        listGenerosFiltrados.setModel(generosFiltrados);

        try {
            
            
            HashMap<Integer, ObjectId> mapIds = new HashMap<>();
            
            for(int i = 0; i<=loggedUser.getRestringidos().getGeneros().size()-1; i++)
                mapIds.put(i, loggedUser.getRestringidos().getGeneros().get(i).getId());

            if(filtros != null){
                
                generosAFiltrar = filtros.getGeneros();
                
                for(int i = 0; i<=filtros.getGeneros().size()-1;i++){
                    
                    int size = i + loggedUser.getRestringidos().getGeneros().size();
                    
                    mapIds.put(size, filtros.getGeneros().get(i).getId());
                    
                    
                }
            }
            
            for(GeneroDTO generoAux : generoNegocio.buscarTodosGeneros()){
            
                if(!mapIds.containsValue(generoAux.getId()))
                    generos.add(generoAux);
                
            }

        llenarListGeneros(generos);
        llenarListGenerosYaRestringidos();

        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
        }
    }

    public FiltroMusicaDTO getFiltros() {
        return filtros;
    }

    public void inicializaFiltros(FiltroMusicaDTO filtro){
    
        if(filtro == null)
            return;
        
        if(filtro.getAlbumes())
           switchAlbumes.setSelected(true);
       
        if(filtro.getArtistas())
           switchArtistas.setSelected(true);
       
        if(filtro.getCanciones())
           switchCanciones.setSelected(true);
       
            
       
        if(filtro.getGeneros() != null)
            this.generosAFiltrar = filtro.getGeneros();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblCanciones = new javax.swing.JLabel();
        switchCanciones = new util.SwitchButton();
        switchAlbumes = new util.SwitchButton();
        lblAlbumes = new javax.swing.JLabel();
        lblArtistas = new javax.swing.JLabel();
        switchArtistas = new util.SwitchButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listGeneros = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCambiarAFiltrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listGenerosFiltrados = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnGuardarFiltros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtros");
        jPanel3.add(jLabel1);

        jPanel4.setBackground(new java.awt.Color(48, 48, 48));

        jPanel5.setBackground(new java.awt.Color(48, 48, 48));

        lblCanciones.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCanciones.setForeground(new java.awt.Color(255, 255, 255));
        lblCanciones.setText("Canciones");

        lblAlbumes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAlbumes.setForeground(new java.awt.Color(255, 255, 255));
        lblAlbumes.setText("Albumes");

        lblArtistas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblArtistas.setForeground(new java.awt.Color(255, 255, 255));
        lblArtistas.setText("Artistas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblArtistas)
                        .addGap(47, 47, 47)
                        .addComponent(switchArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCanciones)
                            .addComponent(lblAlbumes))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(switchAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switchCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCanciones))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(switchAlbumes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlbumes))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblArtistas)
                    .addComponent(switchArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        jPanel9.setBackground(new java.awt.Color(48, 48, 48));

        jPanel10.setBackground(new java.awt.Color(48, 48, 48));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listGeneros.setBackground(new java.awt.Color(56, 56, 56));
        listGeneros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listGeneros.setForeground(new java.awt.Color(255, 255, 255));
        listGeneros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listGeneros.setMaximumSize(new java.awt.Dimension(400, 400));
        listGeneros.setMinimumSize(new java.awt.Dimension(400, 400));
        listGeneros.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane4.setViewportView(listGeneros);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Generos");

        jLabel2.setText("  ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(110, 110, 110))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel9.add(jPanel10);

        jLabel12.setText("  ");
        jPanel9.add(jLabel12);

        btnCambiarAFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/swap.png"))); // NOI18N
        btnCambiarAFiltrar.setBorderPainted(false);
        btnCambiarAFiltrar.setContentAreaFilled(false);
        btnCambiarAFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarAFiltrarActionPerformed(evt);
            }
        });
        jPanel9.add(btnCambiarAFiltrar);

        jLabel3.setText("  ");
        jPanel9.add(jLabel3);

        jPanel11.setBackground(new java.awt.Color(48, 48, 48));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        listGenerosFiltrados.setBackground(new java.awt.Color(56, 56, 56));
        listGenerosFiltrados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listGenerosFiltrados.setForeground(new java.awt.Color(255, 255, 255));
        listGenerosFiltrados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listGenerosFiltrados.setMaximumSize(new java.awt.Dimension(400, 400));
        listGenerosFiltrados.setMinimumSize(new java.awt.Dimension(400, 400));
        listGenerosFiltrados.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane5.setViewportView(listGenerosFiltrados);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Seleccionados");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addComponent(jLabel11))
                .addGap(27, 27, 27))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(48, 48, 48));

        btnGuardarFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aceptar.png"))); // NOI18N
        btnGuardarFiltros.setBorderPainted(false);
        btnGuardarFiltros.setContentAreaFilled(false);
        btnGuardarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFiltrosActionPerformed(evt);
            }
        });
        jPanel12.add(btnGuardarFiltros);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void llenarListGenerosYaRestringidos(){
        
        int counter = 0;

        for(GeneroDTO genero : generosAFiltrar){
            
           generosFiltrados.add(counter, genero.getNombre());
           counter++;
           
        }
       
       
    }
    private void llenarListGeneros(List<GeneroDTO> generos) {

        int counter = 0;

        for (GeneroDTO genero : generos) {

            todosGeneros.add(counter, genero.getNombre());
            counter++;

        }

    }

    private void btnGuardarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFiltrosActionPerformed

        FiltroMusicaDTO filtros = new FiltroMusicaDTO();
        
        filtros.setAlbumes(switchAlbumes.isSelected());
        filtros.setCanciones(switchCanciones.isSelected());
        filtros.setArtistas(switchArtistas.isSelected());
        
        if(filtros.getAlbumes() == false && filtros.getArtistas() == false && filtros.getCanciones() == false){
        
            filtros.setAlbumes(true);
            filtros.setArtistas(true);
            filtros.setCanciones(true);
            
            
        }
        
        if(!generosAFiltrar.isEmpty())
            filtros.setGeneros(generosAFiltrar);
        else
            filtros.setGeneros(generos);
        
        this.filtros = filtros;
        
        if(pAlbumes != null)
            pAlbumes.filtroMusica = filtros;
        
        if(pAlbumesFav != null)
            pAlbumesFav.filtroMusica = filtros;
        
        if(pArtistas != null)
            pArtistas.filtroMusica = filtros;
        
        if(pBusqueda != null)
            pBusqueda.filtroMusica = filtros;
        
        if(pCanciones != null)    
            pCanciones.setFiltroMusica(filtros);
        
        if(pArtistasFav != null)
            pArtistasFav.filtroMusica = filtros;
        
        if(pCancionesFav != null)
            pCancionesFav.filtroMusica = filtros;

        
        this.dispose();

    }//GEN-LAST:event_btnGuardarFiltrosActionPerformed

    private void btnCambiarAFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarAFiltrarActionPerformed

        int indexSeleccionado1 = listGeneros.getSelectedIndex();

        int indexSeleccionado2 = listGenerosFiltrados.getSelectedIndex();

        if (indexSeleccionado2 != -1) {

            todosGeneros.add(todosGeneros.getSize(), generosAFiltrar.get(indexSeleccionado2).getNombre());
            generos.add(generosAFiltrar.get(indexSeleccionado2));

            generosFiltrados.remove(indexSeleccionado2);
            generosAFiltrar.remove(indexSeleccionado2);

            return;

        }

        if (indexSeleccionado1 == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un género");
            return;
        }

        generosFiltrados.add(generosFiltrados.getSize(), generos.get(indexSeleccionado1).getNombre());

        generosAFiltrar.add(generos.get(indexSeleccionado1));

        generos.remove(indexSeleccionado1);
        todosGeneros.remove(indexSeleccionado1);


    }//GEN-LAST:event_btnCambiarAFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarAFiltrar;
    private javax.swing.JButton btnGuardarFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblAlbumes;
    private javax.swing.JLabel lblArtistas;
    private javax.swing.JLabel lblCanciones;
    private javax.swing.JList<String> listGeneros;
    private javax.swing.JList<String> listGenerosFiltrados;
    private util.SwitchButton switchAlbumes;
    private util.SwitchButton switchArtistas;
    private util.SwitchButton switchCanciones;
    // End of variables declaration//GEN-END:variables
}
