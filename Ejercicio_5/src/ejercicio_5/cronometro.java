
package ejercicio_5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Laura
 */
public class cronometro extends javax.swing.JFrame {
private Timer tiempo;
private int centesimaSegundos=0, segundos=0, minutos=0, horas=0;

private ActionListener acciones = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        centesimaSegundos++;
        if (centesimaSegundos ==100){
        segundos++;
        centesimaSegundos =0;
        }
        
        if (segundos ==60){
        minutos++;
        segundos=0;
       
        }
        
        if (minutos==60){
        horas++;
        minutos=0;
        }
        
        actualizarEtiquetaTiempo();
  
    }

};

private void actualizarEtiquetaTiempo(){
    String texto = (horas<=9? "0":"")+horas+" : "+(minutos<=9?"0":"")+minutos+" : "+(segundos<=9?"0":"")+segundos+" : "+(centesimaSegundos<=9?"0":"")+centesimaSegundos;
    etiquetaContadorCronometro.setText(texto);

}
 
    public cronometro() {
        initComponents();
        setLocationRelativeTo(null); //Permite que la ventana quede en el centro de la pantalla
        tiempo = new Timer(10, acciones);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        etiquetaImagenCronometro = new javax.swing.JLabel();
        botonInicio = new javax.swing.JButton();
        botonDetener = new javax.swing.JButton();
        botonPausa = new javax.swing.JButton();
        etiquetaNombreCronometro = new javax.swing.JLabel();
        etiquetaContadorCronometro = new javax.swing.JLabel();
        etiquetaImagen = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronómetro");
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaImagenCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_5/Imagen/cronometro-removebg-preview.png"))); // NOI18N
        panel.add(etiquetaImagenCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 150));

        botonInicio.setBackground(new java.awt.Color(255, 204, 204));
        botonInicio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonInicio.setText("Iniciar");
        botonInicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        panel.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, 30));

        botonDetener.setBackground(new java.awt.Color(255, 204, 204));
        botonDetener.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonDetener.setText("Detener");
        botonDetener.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetenerActionPerformed(evt);
            }
        });
        panel.add(botonDetener, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, 30));

        botonPausa.setBackground(new java.awt.Color(255, 204, 204));
        botonPausa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        botonPausa.setText("Pausar");
        botonPausa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPausaActionPerformed(evt);
            }
        });
        panel.add(botonPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 30));

        etiquetaNombreCronometro.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaNombreCronometro.setText("Cronómetro");
        panel.add(etiquetaNombreCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        etiquetaContadorCronometro.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiquetaContadorCronometro.setText("00:00:00:00");
        panel.add(etiquetaContadorCronometro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_5/Imagen/fondo.jpg"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 159));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
        tiempo.start();
        botonInicio.setEnabled(false);
        botonInicio.setText("Reanudar");
        botonPausa.setEnabled(true);
        botonDetener.setEnabled(true);
       
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetenerActionPerformed
        if(tiempo.isRunning()){
        tiempo.stop();
        botonInicio.setEnabled(true);
        }
        botonInicio.setText("Iniciar");
        botonPausa.setEnabled(false);
        botonDetener.setEnabled(false);
        
        horas=0;
        minutos=0;
        segundos=0;
        centesimaSegundos=0;
        
        
    }//GEN-LAST:event_botonDetenerActionPerformed

    private void botonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPausaActionPerformed
        tiempo.stop();
        botonInicio.setEnabled(true);
        botonPausa.setEnabled(false);
        
    }//GEN-LAST:event_botonPausaActionPerformed


    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDetener;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonPausa;
    private javax.swing.JLabel etiquetaContadorCronometro;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaImagenCronometro;
    private javax.swing.JLabel etiquetaNombreCronometro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
