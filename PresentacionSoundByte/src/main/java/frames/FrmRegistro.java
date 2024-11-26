/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import InterfacesDAO.IUsuarioDAO;
import InterfacesNegocio.IAlbumNegocio;
import InterfacesNegocio.IUsuarioNegocio;
import Negocio.UsuarioNegocio;
import excepciones.NegocioException;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author carli
 */
public class FrmRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogIn
     */
    IUsuarioNegocio usuarioNegocio;
    IAlbumNegocio albumNegocio;
    byte[] imagenPerfilNueva;

    public FrmRegistro(IUsuarioNegocio usuarioNegocio, IAlbumNegocio albumNegocio) {
        initComponents();
        this.usuarioNegocio = usuarioNegocio;
        this.albumNegocio = albumNegocio;
        this.setTitle("Registrate");
        this.jLabel1.setFocusable(true);
        this.setLocationRelativeTo(null);
        setDefaultTextAndAddFocusListener(txtEmail, "Email *");
        setDefaultTextAndAddFocusListener(txtUsuario, "Nombre de Usuario *");

        setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena, "Contraseña *");
        setPasswordFieldDefaultTextAndAddFocusListener(jPassContrasena2, "Confirmar Contraseña *");

        noEspaciosKeyListener(txtEmail);
        noEspaciosKeyListener(txtUsuario);
        noEspaciosKeyListener(jPassContrasena);
        noEspaciosKeyListener(jPassContrasena2);

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

        ImageIcon iDefault = new ImageIcon((getClass().getResource("/images/fotoDefaultPerfil.png")));
        imagenPerfil.setImagen(iDefault);
        this.revalidate();
        this.repaint();
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

                if (c == '@' || c == '.') {
                    return;
                }

                if (!Character.isLetterOrDigit(c) || c == '@' || c == '.') {
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
        jPanel3 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPassContrasena2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        btnMostrarContrasena1 = new javax.swing.JButton();
        jPassContrasena = new javax.swing.JPasswordField();
        btnMostrarContrasena2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnAgregarImagen = new javax.swing.JButton();
        imagenPerfil = new util.ImagenPerfil();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));

        jPanel4.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));

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

        btnRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrarse.png"))); // NOI18N
        btnRegistrarUsuario.setBorderPainted(false);
        btnRegistrarUsuario.setContentAreaFilled(false);
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginInfo.png"))); // NOI18N

        jPassContrasena2.setBackground(new java.awt.Color(77, 76, 76));
        jPassContrasena2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPassContrasena2.setForeground(new java.awt.Color(255, 255, 255));
        jPassContrasena2.setText("jPasswordField1");
        jPassContrasena2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

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

        btnMostrarContrasena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btnMostrarContrasena1.setBorderPainted(false);
        btnMostrarContrasena1.setContentAreaFilled(false);

        jPassContrasena.setBackground(new java.awt.Color(77, 76, 76));
        jPassContrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPassContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jPassContrasena.setText("jPasswordField1");
        jPassContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        btnMostrarContrasena2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        btnMostrarContrasena2.setBorderPainted(false);
        btnMostrarContrasena2.setContentAreaFilled(false);
        btnMostrarContrasena2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContrasena2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(492, 492, 492))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(2, 2, 2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPassContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMostrarContrasena2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPassContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMostrarContrasena1))))
                    .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnMostrarContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarContrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPassContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPassContrasena2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarUsuario)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel4);

        jPanel7.setBackground(new java.awt.Color(27, 26, 26));

        btnAgregarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccion Imagen.png"))); // NOI18N
        btnAgregarImagen.setBorderPainted(false);
        btnAgregarImagen.setContentAreaFilled(false);
        btnAgregarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImagenActionPerformed(evt);
            }
        });

        imagenPerfil.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/fotoDefaultPerfil.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(btnAgregarImagen)
                .addGap(91, 91, 91))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(imagenPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(imagenPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnAgregarImagen)
                .addGap(83, 83, 83))
        );

        jPanel5.add(jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed

        if (txtEmail.getText().contains("Email *") || jPassContrasena.getText().contains("Contraseña *") || jPassContrasena2.getText().contains("Contraseña *") || txtUsuario.getText().contains("Usuario *")) {

            JOptionPane.showMessageDialog(this, "Por favor rellene todos los campos obligatorios");

            return;

        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(txtEmail.getText());

        if (!matcher.matches()) {

            JOptionPane.showMessageDialog(this, "Por favor introduzca un Email válido");
            return;

        }

        if (jPassContrasena.getText().length() <= 7) {

            JOptionPane.showMessageDialog(this, "La contraseña debe ser mínimo de 8 caracteres");
            return;

        }

        if (!jPassContrasena.getText().contains(jPassContrasena2.getText())) {

            JOptionPane.showMessageDialog(this, "Las contraseñas ingresadas no son iguales");
            return;

        }

        UsuarioDTO usuarioNuevo = new UsuarioDTO();

        usuarioNuevo.setContraseña(jPassContrasena.getText());
        usuarioNuevo.setCorreoElectronico(txtEmail.getText());
        usuarioNuevo.setUsername(txtUsuario.getText());
        usuarioNuevo.setImagenPerfil(imagenPerfilNueva);
        usuarioNuevo.setFavoritos(null);
        usuarioNuevo.setRestringidos(null);

        try {
            this.usuarioNegocio.crearUsuario(usuarioNuevo);
            JOptionPane.showMessageDialog(this, "Usuario creado con éxito");
            FrmLogIn login = new FrmLogIn(usuarioNegocio, albumNegocio);
            login.setVisible(true);
            this.dispose();
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, "Error al crear usuario :" + ex);
        }


    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnMostrarContrasena2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContrasena2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarContrasena2ActionPerformed

    public byte[] convertirImagenABytes(File file) throws IOException {
        // Leer el archivo de imagen en un InputStream
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = inputStream.readAllBytes();
        inputStream.close();
        return bytes;
    }

    private void btnAgregarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImagenActionPerformed
        // Mostrar el selector de archivos
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        // Verificar si se seleccionó un archivo
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            System.out.println(imagePath);

            // Convertir la imagen a byte[]
            try {
                byte[] imageData = convertirImagenABytes(selectedFile);
                ImageIcon imagen = new ImageIcon(imageData);
                imagenPerfil.setImagen(imagen);
                this.revalidate();
                this.repaint();
                this.imagenPerfilNueva = imageData;
                // Usar el byte[] para guardar o enviar según sea necesario
            } catch (IOException ex) {
                ex.printStackTrace();
                // Manejar el error según sea necesario
            }
        }


    }//GEN-LAST:event_btnAgregarImagenActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnMostrarContrasena1;
    private javax.swing.JButton btnMostrarContrasena2;
    private javax.swing.JButton btnRegistrarUsuario;
    private util.ImagenPerfil imagenPerfil;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPassContrasena;
    private javax.swing.JPasswordField jPassContrasena2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
