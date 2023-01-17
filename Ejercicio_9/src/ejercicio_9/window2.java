
package ejercicio_9;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Laura
 */
public class window2 extends javax.swing.JFrame {
    private boolean casilla [] [] = new boolean [3] [3];
    private String turno = "usuario1";
    private int matriz [][] = new int [3][3];
    private String usuarioA, usuarioB;
    private int vecesGanoA =0, vecesGanoB=0, vecesEmpato =0;

    /**
     * Creates new form window2
     */
    public window2(String usuarioA, String usuarioB) {
        this.usuarioA = usuarioA;
        this.usuarioB = usuarioB;
        
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        llenarCasillas();
        llenarMatriz();
        
        
    }
    
    private void llenarCasillas(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                casilla [i][j] = true;
            }
         }
    }
    private void llenarMatriz(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                matriz [i][j] = 0;
            }
         }
    }
    
    

    private void dibujarX(JButton boton){
    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x1-removebg-preview.png")));
    }
    
    private void dibujarO(JButton boton){
    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/o1-removebg-preview.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        barraMenu1 = new javax.swing.JMenuBar();
        etiquetaJuego = new javax.swing.JMenu();
        opc1Juego = new javax.swing.JMenuItem();
        opc2Juego = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opc3Juego = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego");

        panel1.setPreferredSize(new java.awt.Dimension(400, 400));
        panel1.setLayout(new java.awt.GridLayout(3, 3));

        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        panel1.add(boton1);

        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        panel1.add(boton2);

        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        panel1.add(boton3);

        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        panel1.add(boton4);

        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        panel1.add(boton5);

        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        panel1.add(boton6);

        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        panel1.add(boton7);

        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        panel1.add(boton8);

        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        panel1.add(boton9);

        etiquetaJuego.setText("Juego");
        etiquetaJuego.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        opc1Juego.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opc1Juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/again1-removebg-preview.png"))); // NOI18N
        opc1Juego.setText("Comenzar de nuevo");
        opc1Juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1JuegoActionPerformed(evt);
            }
        });
        etiquetaJuego.add(opc1Juego);

        opc2Juego.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opc2Juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablatexto1-removebg-preview.png"))); // NOI18N
        opc2Juego.setText("Mostrar tabla de resultados");
        opc2Juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2JuegoActionPerformed(evt);
            }
        });
        etiquetaJuego.add(opc2Juego);
        etiquetaJuego.add(jSeparator1);

        opc3Juego.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        opc3Juego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nocheck1-removebg-preview.png"))); // NOI18N
        opc3Juego.setText("Salir");
        opc3Juego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3JuegoActionPerformed(evt);
            }
        });
        etiquetaJuego.add(opc3Juego);

        barraMenu1.add(etiquetaJuego);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        barraMenu1.add(jMenu2);

        setJMenuBar(barraMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opc3JuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3JuegoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opc3JuegoActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(casilla [0][0] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton1);
                    matriz [0][0] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton1);
                    matriz [0][0] = 2;
                    turno = "usuario1"; 
            }
                casilla[0][0] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(casilla [0][1] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton2);
                    matriz [0][1] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton2);
                    matriz [0][1] = 2;
                    turno = "usuario1"; 
            }
                casilla[0][1] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(casilla [0][2] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton3);
                    matriz [0][2] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton3);
                    matriz [0][2] = 2;
                    turno = "usuario1"; 
            }
                casilla[0][2] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(casilla [1][0] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton4);
                    matriz [1][0] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton4);
                    matriz [1][0] = 2;
                    turno = "usuario1"; 
            }
                casilla[1][0] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(casilla [1][1] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton5);
                    matriz [1][1] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton5);
                    matriz [1][1] = 2;
                    turno = "usuario1"; 
            }
                casilla[1][1] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(casilla [1][2] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton6);
                    matriz [1][2] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton6);
                    matriz [1][2] = 2;
                    turno = "usuario1"; 
            }
                casilla[1][2] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(casilla [2][0] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton7);
                    matriz [2][0] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton7);
                    matriz [2][0] = 2;
                    turno = "usuario1"; 
            }
                casilla[2][0] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(casilla [2][1] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton8);
                    matriz [2][1] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton8);
                    matriz [2][1] = 2;
                    turno = "usuario1"; 
            }
                casilla[2][1] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(casilla [2][2] == true){
                if(turno.equals("usuario1")){
                    dibujarX(boton9);
                    matriz [2][2] = 1;
                    turno = "usuario2";
                     }
                  else {
                    dibujarO(boton9);
                    matriz [2][2] = 2;
                    turno = "usuario1"; 
            }
                casilla[2][2] = false;
                comprobarGanador();
        }
    }//GEN-LAST:event_boton9ActionPerformed

    private void opc2JuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2JuegoActionPerformed
        window5 ventana5 = new window5(this, true, usuarioA, usuarioB, vecesGanoA, vecesGanoB, vecesEmpato);
        ventana5.setVisible(true);
    }//GEN-LAST:event_opc2JuegoActionPerformed

    private void opc1JuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1JuegoActionPerformed
       vecesGanoA =0; vecesGanoB=0; vecesEmpato =0;
        reiniciarJuego();
    }//GEN-LAST:event_opc1JuegoActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.cope.es/actualidad/vivir/juegos-tradicionales/noticias/juegos-para-aislamiento-las-tres-raya-20200522_730488#:~:text=En%20un%20papel%20se%20hacen,sea%20vertical%2C%20horizontal%20o%20diagonal."));
        } catch (URISyntaxException ex) {
           // Logger.getLogger(window2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(window2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void comprobarGanador(){
        boolean ganador1 =  false;
        boolean ganador2 = false;
        int casillaLlena =0;
        
        ganador1 = comprobar(1);
        ganador2 = comprobar(2);
        
        if (ganador1==true){
           
            window3 ventanaG = new window3(this, true, usuarioA);   
           ventanaG.setVisible(true);
           vecesGanoA ++;
           reiniciarJuego();
        }
        
        else if (ganador2==true){
            
         window3 ventanaG = new window3(this, true, usuarioB);
         ventanaG.setVisible(true);
         vecesGanoB ++;
          reiniciarJuego();
        }   
        else {
            for(int i=0; i<3; i++){
                  for (int j=0; j<3; j++){
                           if (matriz[i][j] !=0){
                                    casillaLlena++;
                           }
                  }
            }
            
            if (casillaLlena == 9){
                
                window4 ventanaE = new window4(this, true);
                
                ventanaE.setVisible(true);
                vecesEmpato ++;
                reiniciarJuego();
            }
            else {
                  casillaLlena =0;
            }
        }
    }
    
    private boolean comprobar (int num){
        boolean ganador = false;
      
        //Matriz horizontal 1 [0,1][0,2][0,3]
        if (matriz[0][0]==num && matriz[0][1]==num && matriz[0][2]==num){
            ganador = true;
         }
        
        //Matriz horizontal 2 [1,0][1,1][1,2]
        else if (matriz[1][0]==num && matriz[1][1]==num && matriz[1][2]==num){
            ganador = true;
        }
        
        //Matriz  horizontal 3 [2,0][2,1][2,2]
        else if (matriz[2][0]==num && matriz[2][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        
        //Matriz vertical 1 [2,0][2,1][2,2]
        else if (matriz[0][0]==num && matriz[1][0]==num && matriz[2][0]==num){
            ganador = true;
        }
        
        //Matriz vertical 2 [0,1][1,1][2,1]
        else if (matriz[0][1]==num && matriz[1][1]==num && matriz[2][1]==num){
            ganador = true;
    }
        
        //Matriz vertical 3 [0,2][1,2][2,2]
        else if (matriz[0][2]==num && matriz[1][2]==num && matriz[2][2]==num){
            ganador = true;
        }
        
        //Matriz diagonal 1 [0,0][1,1][2,2]
        else if(matriz[0][0]==num && matriz[1][1]==num && matriz[2][2]==num){
            ganador = true;
        }
        
        else if(matriz[0][2]==num && matriz[1][1]==num && matriz[2][0]==num){
            ganador = true;
        }
        return ganador;
    }
    
    private void reiniciarJuego(){
        llenarCasillas();
        llenarMatriz();
        
        boton1.setIcon(null);
        boton2.setIcon(null);
        boton3.setIcon(null);
        boton4.setIcon(null);
        boton5.setIcon(null);
        boton6.setIcon(null);
        boton7.setIcon(null);
        boton8.setIcon(null);
        boton9.setIcon(null);
        
       
    }
    
   
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
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window2(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu1;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JMenu etiquetaJuego;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem opc1Juego;
    private javax.swing.JMenuItem opc2Juego;
    private javax.swing.JMenuItem opc3Juego;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
