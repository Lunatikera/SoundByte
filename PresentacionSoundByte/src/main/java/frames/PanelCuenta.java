/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;

/**
 *
 * @author carli
 */
public class PanelCuenta extends javax.swing.JPanel {

    FrmPrincipal frmPrincipal;
    private boolean cambiarContrasena = false;

    /**
     * Creates new form Prueba1
     */
    public PanelCuenta(FrmPrincipal frmPrincipal) {
        initComponents();
        this.frmPrincipal = frmPrincipal;
        setDefaultTextAndAddFocusListener(txtEmail, "Email");
        setDefaultTextAndAddFocusListener(txtUsuario, "Nombre de Usuario");
        jPassContrasena.setVisible(false);
        jPassContrasena2.setVisible(false);
        btnMostrarContrasena1.setVisible(false);
        btnMostrarContrasena2.setVisible(false);

        setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena, "Contraseña");
        setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena2, "Confirmar Contraseña");
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
        btnMostrarContrasena2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jPassContrasena2.getEchoChar() == '*') {
                    // Cambiar a JTextField para mostrar la contraseña
                    jPassContrasena2.setEchoChar((char) 0); // 0 es el carácter que indica que no hay eco
                } else {
                    if (!jPassContrasena2.getText().equals("Confirmar Contraseña")) {
                        jPassContrasena2.setEchoChar('*');
                    }

                }
            }
        });

        btnCambiarContrasena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cambiarContrasena) {
                    jPassContrasena.setVisible(true);
                    jPassContrasena2.setVisible(true);
                    btnMostrarContrasena1.setVisible(true);
                    btnMostrarContrasena2.setVisible(true);
                    cambiarContrasena = !cambiarContrasena;
                } else {

                    jPassContrasena.setVisible(false);
                    jPassContrasena2.setVisible(false);
                    btnMostrarContrasena1.setVisible(false);
                    btnMostrarContrasena2.setVisible(false);

                    setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena, "Contraseña");
                    setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena2, "Confirmar Contraseña");;
                    jPassContrasena.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
                    jPassContrasena2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

                    cambiarContrasena = !cambiarContrasena;

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
        txtUsuario = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jPassContrasena = new javax.swing.JPasswordField();
        jPassContrasena2 = new javax.swing.JPasswordField();
        btnCambiarContrasena = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMostrarContrasena1 = new javax.swing.JButton();
        btnMostrarContrasena2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imagenPerfil1 = new util.ImagenPerfil();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(27, 26, 26));

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        txtUsuario.setBackground(new java.awt.Color(77, 76, 76));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Nombre de Usuario");
        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

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

        jPassContrasena.setBackground(new java.awt.Color(77, 76, 76));
        jPassContrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPassContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jPassContrasena.setText("jPasswordField1");
        jPassContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        jPassContrasena2.setBackground(new java.awt.Color(77, 76, 76));
        jPassContrasena2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPassContrasena2.setForeground(new java.awt.Color(255, 255, 255));
        jPassContrasena2.setText("jPasswordField1");
        jPassContrasena2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        btnCambiarContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cambiarContrasena.png"))); // NOI18N
        btnCambiarContrasena.setBorderPainted(false);
        btnCambiarContrasena.setContentAreaFilled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EditarCuenta.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        btnMostrarContrasena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btnMostrarContrasena1.setBorderPainted(false);
        btnMostrarContrasena1.setContentAreaFilled(false);

        btnMostrarContrasena2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btnMostrarContrasena2.setBorderPainted(false);
        btnMostrarContrasena2.setContentAreaFilled(false);
        btnMostrarContrasena2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContrasena2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCambiarContrasena)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPassContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarContrasena1)
                            .addComponent(btnMostrarContrasena2))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPassContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMostrarContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnCambiarContrasena))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnMostrarContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jPanel2.setBackground(new java.awt.Color(27, 26, 26));

        jPanel3.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuenta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel2)
                .addGap(927, 927, 927)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
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

        imagenPerfil1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/fotoDefaultPerfil.png"))); // NOI18N

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addImagen.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        imagenPerfil1.add(jButton3);
        jButton3.setBounds(310, 330, 140, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(imagenPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(imagenPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnMostrarContrasena2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContrasena2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarContrasena2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContrasena;
    private javax.swing.JButton btnMostrarContrasena1;
    private javax.swing.JButton btnMostrarContrasena2;
    private util.ImagenPerfil imagenPerfil1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPassContrasena;
    private javax.swing.JPasswordField jPassContrasena2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
