/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import DAO.GeneroDAO;
import DAO.UsuarioDAO;
import DTO.GeneroDTO;
import DTO.UsuarioDTO;
import Docs.RestriccionDoc;
import InterfacesDAO.IGeneroDAO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.GeneroNegocio;
import Negocio.UsuarioNegocio;
import InterfacesNegocio.IGeneroNegocio;
import excepciones.INegocioException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import org.bson.types.ObjectId;

/**
 *
 * @author carli
 */
public class PanelRestricciones extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    List<GeneroDTO> generos;
    List<GeneroDTO> generosARestringir = new ArrayList<>();
    DefaultListModel<String> listModel = new DefaultListModel<>(); 
    DefaultListModel<String> listModel1 = new DefaultListModel<>();
    
    public PanelRestricciones(FrmPrincipal frmPrincipal) {
        
        initComponents();
        this.frmPrincipal=frmPrincipal;
        
        IGeneroDAO generoDAO = new GeneroDAO();
        IGeneroNegocio generoNeg = new GeneroNegocio(generoDAO);
                
        
        generosARestringir = generoNeg.convertirListaGenerosColeccion(frmPrincipal.loggedUser.getRestringidos().getGeneros());
        
        listGeneros.setModel(listModel1);
        listGeneros.setVisible(true);
        
        listGeneroARestringir.setModel(listModel);

        
      try {
          generos = generoNeg.buscarTodosGeneros();
          
      } catch (INegocioException ex) {
        JOptionPane.showMessageDialog(this, "Error al llenar ListGeneros = " + ex);
      }
      
      llenarListGeneros(generos);
      
      if(frmPrincipal.loggedUser.getRestringidos() != null){
      
          llenarListGenerosYaRestringidos(frmPrincipal.loggedUser.getRestringidos());
          
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listGeneros = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGeneroARestringir = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scrollGeneros = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(27, 26, 26));

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        listGeneros.setBackground(new java.awt.Color(56, 56, 56));
        listGeneros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listGeneros.setForeground(new java.awt.Color(255, 255, 255));
        listGeneros.setDragEnabled(true);
        listGeneros.setMaximumSize(new java.awt.Dimension(400, 400));
        listGeneros.setMinimumSize(new java.awt.Dimension(400, 400));
        listGeneros.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane1.setViewportView(listGeneros);

        listGeneroARestringir.setBackground(new java.awt.Color(56, 56, 56));
        listGeneroARestringir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listGeneroARestringir.setForeground(new java.awt.Color(255, 255, 255));
        listGeneroARestringir.setMaximumSize(new java.awt.Dimension(400, 400));
        listGeneroARestringir.setMinimumSize(new java.awt.Dimension(400, 400));
        listGeneroARestringir.setPreferredSize(new java.awt.Dimension(400, 400));
        jScrollPane2.setViewportView(listGeneroARestringir);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/swap.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saveChanges.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Generos Restringidos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Generos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(scrollGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(346, 346, 346))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel4)
                    .addContainerGap(1038, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(scrollGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel4)
                    .addContainerGap(684, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(27, 26, 26));

        jPanel3.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Restricciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel2)
                .addGap(852, 852, 852)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(296, 296, 296))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jLabel2))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void llenarListGeneros(List<GeneroDTO> generos){
    
        
        int counter = 0;
        
        List<ObjectId> ids = new ArrayList<>();
        
        for(GeneroDTO genero : generosARestringir){
        
            ids.add(genero.getId());
            
        }

        for(GeneroDTO genero : generos){
            
            if(!ids.contains(genero.getId())){
            
                listModel1.add(counter, genero.getNombre());
                counter++;
                
            }
            
            
           
        }
       
       
    }
    
    private void llenarListGenerosYaRestringidos(RestriccionDoc restriccion){
        
        int counter = 0;

        
        for(GeneroDTO genero : generosARestringir){
            
           listModel.add(counter, genero.getNombre());
           counter++;
           
        }
       
       
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int indexSeleccionado1 = listGeneros.getSelectedIndex();
        
        int indexSeleccionado2 = listGeneroARestringir.getSelectedIndex();
        
        if(indexSeleccionado2 != -1){
        
            listModel1.add(listModel1.getSize(), generosARestringir.get(indexSeleccionado2).getNombre());
            generos.add(generosARestringir.get(indexSeleccionado2));
            
            listModel.remove(indexSeleccionado2);
            generosARestringir.remove(indexSeleccionado2);

            
            return;
            
        }
        
        if(indexSeleccionado1 == -1){
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un género" );
            return;
        }
        
        listModel.add(listModel.getSize(), generos.get(indexSeleccionado1).getNombre());
        
        generosARestringir.add(generos.get(indexSeleccionado1));
        
        generos.remove(indexSeleccionado1);
        listModel1.remove(indexSeleccionado1);
        



        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        IUsuarioDAO uDAO = new UsuarioDAO();
        IUsuarioNegocio uNeg = new UsuarioNegocio(uDAO);
        
        IGeneroDAO gDAO = new GeneroDAO();
        IGeneroNegocio gNeg = new GeneroNegocio(gDAO);
        
        
        UsuarioDTO usuarioActualizado = frmPrincipal.loggedUser;
        
        RestriccionDoc restricciones = new RestriccionDoc();
        
        restricciones.setGeneros(gNeg.convertirListaGenerosDTO(generosARestringir));
        
        usuarioActualizado.setRestringidos(restricciones);
        
        String generosSeleccionados = new String();
        
        for(GeneroDTO genero : generosARestringir){
            
            String generoS = genero.getNombre() + " ";
            generosSeleccionados = generosSeleccionados.concat(generoS);
            
        }
        
        if(JOptionPane.showConfirmDialog(this, "Esta seguro que quiere restringir los siguientes géneros ? \n" + generosSeleccionados) == JOptionPane.YES_OPTION)
        try {
            uNeg.actualizarUsuario(frmPrincipal.loggedUser, usuarioActualizado);
        } catch (INegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar usuario " + ex);
        }
        
        frmPrincipal.loggedUser = usuarioActualizado;
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listGeneroARestringir;
    private javax.swing.JList<String> listGeneros;
    private javax.swing.JScrollPane scrollGeneros;
    // End of variables declaration//GEN-END:variables
}
