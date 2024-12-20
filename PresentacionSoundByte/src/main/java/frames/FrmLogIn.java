/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IArtistaNegocio;
import InterfacesNegocio.IDatosPruebaNegocio;
import InterfacesNegocio.IGeneroNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.UsuarioNegocio;
import excepciones.NegocioException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author carli
 */
public class FrmLogIn extends javax.swing.JFrame {

    IUsuarioNegocio usuarioNegocio;
    IAlbumNegocio albumNegocio;
    IGeneroNegocio generoNegocio;
    IArtistaNegocio artistaNegocio;
    IDatosPruebaNegocio datosNegocio;
    
    
    public FrmLogIn( IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio, IGeneroNegocio generoNegocio, IArtistaNegocio artistaNegocio, IDatosPruebaNegocio datosNegocio) {
        initComponents();
        this.usuarioNegocio=usuarioNegocio;
        this.albumNegocio=albumNegocio;
        this.generoNegocio=generoNegocio;
        this.artistaNegocio=artistaNegocio;
        this.datosNegocio= datosNegocio;
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setTitle("Log In");
        this.setLocationRelativeTo(null);
        this.jLabel1.setFocusable(true);
        this.btnInsercion.setVisible(!datosNegocio.verificarExixstenciaDatos());
        setDefaultTextAndAddFocusListener(txtEmail, "Email *");
        setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena, "Contraseña *");
        noEspaciosKeyListener(txtEmail);
        noEspaciosKeyListener(jPassContrasena);
        
          // Añadir un ActionListener al botón
        btnMostrarContrasena1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jPassContrasena.getEchoChar() == '*') {
                    // Cambiar a JTextField para mostrar la contraseña
                    jPassContrasena.setEchoChar((char) 0); // 0 es el carácter que indica que no hay eco
                } else {
                    if (!jPassContrasena.getText().equals("Contraseña")) {
                        jPassContrasena.setEchoChar('*');
                    }
                }
            }
        });
    }

    private void setDefaultTextAndAddFocusListener(javax.swing.JTextField campoTexto, String textoDefault) {
        campoTexto.setText(textoDefault);
        campoTexto.setForeground(Color.GRAY);
        campoTexto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campoTexto.getText().equals(textoDefault)) {
                    campoTexto.setText("");
                    campoTexto.setForeground(Color.WHITE);
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

    private void noEspaciosKeyListener(javax.swing.JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                
                if( c == '@' || c == '.')
                    return;
                
                if (!Character.isLetterOrDigit(c)) {
                    e.consume();
                }
            }
        });
    }

    private void setPasswordFieldDefaultTextAndAddFocusListener(javax.swing.JPasswordField campoContrasena, String textoDefault) {
        campoContrasena.setText(textoDefault);
        campoContrasena.setForeground(Color.GRAY);
        campoContrasena.setEchoChar((char) 0);
        campoContrasena.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(campoContrasena.getPassword()).equals(textoDefault)) {
                    campoContrasena.setText("");
                    campoContrasena.setForeground(Color.WHITE);
                    campoContrasena.setEchoChar('*');
                    campoContrasena.setBorder(BorderFactory.createLineBorder(new Color(135, 116, 249), 4));

                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(campoContrasena.getPassword()).isEmpty()) {
                    campoContrasena.setText(textoDefault);
                    campoContrasena.setForeground(Color.GRAY);
                    campoContrasena.setEchoChar((char) 0);
                    campoContrasena.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPassContrasena = new javax.swing.JPasswordField();
        btnMostrarContrasena1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnInsercion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));

        jPanel4.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));

        txtEmail.setBackground(new java.awt.Color(77, 76, 76));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Login.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log In");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginInfo.png"))); // NOI18N

        jPassContrasena.setBackground(new java.awt.Color(77, 76, 76));
        jPassContrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPassContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jPassContrasena.setText("jPasswordField1");
        jPassContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        btnMostrarContrasena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btnMostrarContrasena1.setBorderPainted(false);
        btnMostrarContrasena1.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(jPassContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPassContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1))
                    .addComponent(btnMostrarContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/¿No eres un miembro_ Registrate aqui.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnInsercion.setBackground(new java.awt.Color(48, 48, 48));
        btnInsercion.setForeground(new java.awt.Color(255, 255, 255));
        btnInsercion.setText("Insercion de datos");
        btnInsercion.setBorderPainted(false);
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsercion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtEmail.getText().contains("Email *") || jPassContrasena.getText().contains("Contraseña *")){
        
            
            System.out.println(txtEmail.getText());
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos obligatorios");
            return;
            
        }
        
        
        try {
            // TODO add your handling code here:
            UsuarioDTO loggingUser = new UsuarioDTO();
            UsuarioDTO loggedUser;
            loggingUser.setCorreoElectronico(txtEmail.getText());
            loggingUser.setContraseña(jPassContrasena.getText());
            
           
            
            loggedUser = usuarioNegocio.obtenerUsuarioPorCredenciales(loggingUser);
            
            if(loggedUser == null){
                 JOptionPane.showMessageDialog(this, "Correo o contraseña incorrecta");
                 return;
            }
            
            FrmPrincipal f = new FrmPrincipal(loggedUser, usuarioNegocio, albumNegocio, generoNegocio, artistaNegocio);
            f.setVisible(true);
            this.dispose();
            
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar usuario en la BD" + ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmRegistro registro=new FrmRegistro(usuarioNegocio, albumNegocio, generoNegocio,artistaNegocio,datosNegocio);
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed
        datosNegocio.insercionMasiva();
        btnInsercion.setVisible(false);
    }//GEN-LAST:event_btnInsercionActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsercion;
    private javax.swing.JButton btnMostrarContrasena1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassContrasena;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
