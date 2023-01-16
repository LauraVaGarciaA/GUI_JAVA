
package ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagen = new javax.swing.JLabel();
        IngresoUsuario = new javax.swing.JTextField();
        usuario = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();
        imagenContraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        botonIngreso = new javax.swing.JButton();
        salidaUsuario = new javax.swing.JToggleButton();
        IngresoContraseña = new javax.swing.JPasswordField();
        etiquetaFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_6/Imagenes/login2.png"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 130));

        IngresoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        IngresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoUsuarioActionPerformed(evt);
            }
        });
        panel.add(IngresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 180, 40));

        usuario.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        panel.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 60, 30));

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_6/Imagenes/usuario2.png"))); // NOI18N
        imagenUsuario.setText("jLabel1");
        panel.add(imagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 40, 40));

        imagenContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_6/Imagenes/candado2.png"))); // NOI18N
        panel.add(imagenContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 30, 30));

        contraseña.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");
        panel.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, 20));

        botonIngreso.setBackground(new java.awt.Color(204, 255, 204));
        botonIngreso.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        botonIngreso.setText("Ingresar Usuario");
        botonIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresoActionPerformed(evt);
            }
        });
        panel.add(botonIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 120, 30));

        salidaUsuario.setBackground(new java.awt.Color(153, 204, 255));
        salidaUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        salidaUsuario.setText("Salir");
        salidaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salidaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaUsuarioActionPerformed(evt);
            }
        });
        panel.add(salidaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 60, 30));

        IngresoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoContraseñaActionPerformed(evt);
            }
        });
        panel.add(IngresoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 180, 40));

        etiquetaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_6/Imagenes/fondo.png"))); // NOI18N
        panel.add(etiquetaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 480));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresoActionPerformed
       String  usuarioCorrecto = "laura";
       String contraseñaCorrecta = "lvga";
       
       if (usuarioCorrecto.equals(IngresoUsuario.getText())){
           String contraseña = "";
           
           for (int i=0; i < IngresoContraseña.getPassword().length; i++){
               contraseña += IngresoContraseña.getPassword() [i];
               
           }
           
           if (contraseñaCorrecta.equals(contraseña)){
               JOptionPane.showMessageDialog(null, "¡Usuario encontrado!");
           }
           
                 else{
                 JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                 }
       
       }
       
       else {
       JOptionPane.showMessageDialog(null, "Error, usuario no encontrado");
       }
    }//GEN-LAST:event_botonIngresoActionPerformed

    private void salidaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaUsuarioActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaUsuarioActionPerformed

    private void IngresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoUsuarioActionPerformed

    private void IngresoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoContraseñaActionPerformed

  
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField IngresoContraseña;
    private javax.swing.JTextField IngresoUsuario;
    private javax.swing.JButton botonIngreso;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel etiquetaFondo;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel imagenContraseña;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JPanel panel;
    private javax.swing.JToggleButton salidaUsuario;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
