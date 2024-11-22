/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import Negocio.UsuarioNegocio;
import excepciones.NegocioException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import util.ImageRenderer;

/**
 *
 * @author carli
 */
public class FrmRegistro extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogIn
     */
    
    Icon defaultImagen = new ImageIcon(getClass().getResource("/images/fotoDefaultPerfil.png"));
    UsuarioDAO uDAO = new UsuarioDAO();
    UsuarioNegocio uNeg = new UsuarioNegocio(uDAO);
    byte[] imagenPerfil = null;
    
    public FrmRegistro() {
        initComponents();
        imagenPerfil1.setImagen(defaultImagen);
            this.revalidate();
            this.repaint();



    }
    
    public byte[] convertirImagenABytes(File file) throws IOException {
        // Leer el archivo de imagen en un InputStream
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = inputStream.readAllBytes();
        inputStream.close();
        return bytes;
    }

    public BufferedImage ByteAImagen (byte[] a){
        
        // Supongamos que tienes un array de bytes llamado imageBytes
        byte[] imageBytes =  a;

        // Convierte los bytes en una imagen BufferedImage
        BufferedImage img = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(imageBytes);
            img = ImageIO.read(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ahora puedes usar la imagen (BufferedImage)
        if (img != null) {
            return img;
        } else {
                    JOptionPane.showMessageDialog(this, "Error al leer la imagen de perfil");
            return null;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fldUsername = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fldContraseña = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        fldCorreo = new javax.swing.JTextField();
        btnSeleccionarImagen = new javax.swing.JButton();
        imagenPerfil1 = new util.ImagenPerfil();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 26, 26));

        jPanel5.setBackground(new java.awt.Color(27, 26, 26));

        jPanel4.setBackground(new java.awt.Color(27, 26, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(48, 48, 48));

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));

        fldUsername.setBackground(new java.awt.Color(77, 76, 76));
        fldUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fldUsername.setForeground(new java.awt.Color(255, 255, 255));
        fldUsername.setText("Username");
        fldUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        fldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldUsernameActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrarse.png"))); // NOI18N
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginInfo.png"))); // NOI18N

        fldContraseña.setBackground(new java.awt.Color(77, 76, 76));
        fldContraseña.setForeground(new java.awt.Color(255, 255, 255));
        fldContraseña.setText("Password");
        fldContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        fldCorreo.setBackground(new java.awt.Color(77, 76, 76));
        fldCorreo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fldCorreo.setForeground(new java.awt.Color(255, 255, 255));
        fldCorreo.setText("Email");
        fldCorreo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        fldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldCorreoActionPerformed(evt);
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
                            .addComponent(fldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(fldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnRegistrar)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel4);

        btnSeleccionarImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seleccion Imagen.png"))); // NOI18N
        btnSeleccionarImagen.setBorderPainted(false);
        btnSeleccionarImagen.setContentAreaFilled(false);
        btnSeleccionarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeleccionarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenPerfil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 445, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addComponent(imagenPerfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnSeleccionarImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if ("Username".equals(fldUsername.getText()) || fldUsername.getText().isBlank() || "Email".equals(fldCorreo.getText()) || fldCorreo.getText().isBlank()|| "Password".equals(fldContraseña.getText()) || fldContraseña.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos obligatorios.");
            return;
        }
        
        try {
            // TODO add your handling code here:
            UsuarioDTO uD = new UsuarioDTO();
            uD.setUsername(fldUsername.getText());
            uD.setCorreoElectronico(fldCorreo.getText());
            uD.setContraseña(fldContraseña.getText());
            uD.setImagenPerfil(imagenPerfil);
            
            uNeg.crearUsuario(uD);
            
        } catch (NegocioException ex) {
            Logger.getLogger(FrmRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void fldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldUsernameActionPerformed

    private void fldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldCorreoActionPerformed

    private void btnSeleccionarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarImagenActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        // Mostrar el selector de archivos
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);

        // Verificar si se seleccionó un archivo
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();
            imagenPerfil1.setImagen(new ImageIcon(imagePath));
            this.revalidate();
            this.repaint();

            // Convertir la imagen a byte[]
            try
            {
                byte[] imageData = convertirImagenABytes(selectedFile);
                this.imagenPerfil = imageData;
                // Usar el byte[] para guardar o enviar según sea necesario;
            } catch (IOException ex)
            {
                ex.printStackTrace();
                // Manejar el error según sea necesario
            }
        }

    }//GEN-LAST:event_btnSeleccionarImagenActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionarImagen;
    private javax.swing.JPasswordField fldContraseña;
    private javax.swing.JTextField fldCorreo;
    private javax.swing.JTextField fldUsername;
    private util.ImagenPerfil imagenPerfil1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
