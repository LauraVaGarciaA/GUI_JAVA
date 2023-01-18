
package ejercicio_8;

import javax.swing.UIManager;

/**
 *
 * @author Laura
 */
public class divisaMoneda extends javax.swing.JFrame {
private String divisa1 ="";
private String divisa2 ="";
private String cadenaNumeros="";
private boolean activado = true;
 private boolean resterminado = false;
 private boolean point = true;
 private double dinero, cambio;

    
    public divisaMoneda() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        etiquetaCambio1 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboBox2 = new javax.swing.JComboBox<>();
        botonC = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPoint = new javax.swing.JButton();
        barraMenu2 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        calculadora = new javax.swing.JMenuItem();
        cambioDivisa = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        salida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambio de divisa");
        setPreferredSize(new java.awt.Dimension(300, 450));

        panel.setPreferredSize(new java.awt.Dimension(300, 450));
        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaDivisa1, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        etiquetaCambio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaCambio1, gridBagConstraints);

        comboBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dolar", "Colombia - Peso", "Unión Europea - Euro" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboBox1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        etiquetaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        panel.add(etiquetaCambio2, gridBagConstraints);

        comboBox2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos - Dolar", "Colombia - Peso", "Unión Europea - Euro" }));
        comboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panel.add(comboBox2, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(botonC, gridBagConstraints);

        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/borrar1-removebg-preview.png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        boton0.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton0, gridBagConstraints);

        botonPoint.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        botonPoint.setText(".");
        botonPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPointActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonPoint, gridBagConstraints);

        menu1.setText("Menú");
        menu1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        calculadora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/calculadora1-removebg-preview.png"))); // NOI18N
        calculadora.setText("Calculadora");
        calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraActionPerformed(evt);
            }
        });
        menu1.add(calculadora);

        cambioDivisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cambioDivisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/mundo1-removebg-preview.png"))); // NOI18N
        cambioDivisa.setText("Cambio de divisa");
        menu1.add(cambioDivisa);
        menu1.add(separador1);

        salida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/nocheck1-removebg-preview.png"))); // NOI18N
        salida.setText("Salir");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        menu1.add(salida);

        barraMenu2.add(menu1);

        setJMenuBar(barraMenu2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salidaActionPerformed

    private void calculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraActionPerformed
        ventana conversor = new ventana();
        conversor.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_calculadoraActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        divisa1 = (String)comboBox1.getSelectedItem();
        
        if(divisa1.equals("Estados Unidos - Dolar")){
         etiquetaDivisa1.setText("USD");
        }
        
        else if (divisa1.equals("Colombia - Peso")){
        etiquetaDivisa1.setText("$");
        }
        
        else if (divisa1.equals("Unión Europea - Euro")){
        etiquetaDivisa1.setText("€");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboBox1ActionPerformed

    private void comboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox2ActionPerformed
        divisa2 = (String)comboBox2.getSelectedItem();
        
        if(divisa2.equals("Estados Unidos - Dolar")){
         etiquetaDivisa2.setText("USD");
        }
        
        else if (divisa2.equals("Colombia - Peso")){
        etiquetaDivisa2.setText("$");
        }
        
        else if (divisa2.equals("Unión Europea - Euro")){
        etiquetaDivisa2.setText("€");
        }
        obtenerDinero();
    }//GEN-LAST:event_comboBox2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "1";
        }
        
         else{
           cadenaNumeros += "1";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "2";
        }
        
         else{
           cadenaNumeros += "2";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "3";
        }
        
         else{
           cadenaNumeros += "3";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "4";
        }
        
         else{
           cadenaNumeros += "4";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "5";
        }
        
         else{
           cadenaNumeros += "5";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "6";
        }
        
         else{
           cadenaNumeros += "6";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "7";
        }
        
         else{
           cadenaNumeros += "7";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "8";
        }
        
         else{
           cadenaNumeros += "8";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
         if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "9";
        }
        
         else{
           cadenaNumeros += "9";
        }
        
        operacionTerminada();
         etiquetaCambio1.setText(cadenaNumeros);
         activado = true;
         obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        operacionTerminada();
        
        if (cadenaNumeros != ""){
        
            if (etiquetaCambio1.getText() == "0"){
             cadenaNumeros = "0";
        }
        
         else{
           cadenaNumeros += "0";
        }
             etiquetaCambio1.setText(cadenaNumeros);
             activado = true;
             obtenerDinero();
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int  tamaño = cadenaNumeros.length();
        if (tamaño>0){
            if(tamaño ==1){
                cadenaNumeros = "0";
            }
            else {
            cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length()-1);
            }
           
           etiquetaCambio1.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPointActionPerformed
        if (point == true){
        
            if (cadenaNumeros == " "){
                 cadenaNumeros = "0.";       
             }
        
             else {
                 cadenaNumeros += ".";
              }
              etiquetaCambio1.setText(cadenaNumeros);
              
              point = false;
         }
    }//GEN-LAST:event_botonPointActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        
        etiquetaCambio1.setText("");
        cadenaNumeros = "";
        activado = true;
        point = true;
    }//GEN-LAST:event_botonCActionPerformed

   private void obtenerDinero(){
   cadenaNumeros = etiquetaCambio1.getText();
   dinero = Double.parseDouble(cadenaNumeros);
   cambioDivisas();
   dinero *= cambio;
   etiquetaCambio2.setText(String.format("%.2f", dinero));
   }
   
   private void cambioDivisas(){
   if (divisa1.equals(divisa2)){
       cambio = 1;
   }
   else if (divisa1.equals("Estados Unidos - Dolar") && divisa2.equals("Colombia - Peso")){
        cambio = 4463;
   }
   else if (divisa1.equals("Estados Unidos - Dolar") && divisa2.equals("Unión Europea - Euro")){
         cambio = 1.01;
   }
   else if (divisa1.equals("Colombia - Peso") && divisa2.equals("Estados Unidos - Dolar")){
           cambio = 0.00022;
   }
   else if (divisa1.equals("Colombia - Peso") && divisa2.equals("Unión Europea - Euro")){
            cambio = 0.00022;
   }
   else if (divisa1.equals("Unión Europea - Euro") && divisa2.equals("Estados Unidos - Dolar")){
            cambio = 0.99;
   }
   else if (divisa1.equals("Unión Europea - Euro") && divisa2.equals("Colombia - Peso")){
            cambio = 4437;
   }
   }
   
    public static void main(String args[]) {
       
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(divisaMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(divisaMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(divisaMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(divisaMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new divisaMoneda().setVisible(true);
            }
        });
    }
    
    public void operacionTerminada(){
    
     if (resterminado == true ){
        
            etiquetaCambio1.setText("");
            
            cadenaNumeros = "";
            
            resterminado = false;      
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu2;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonPoint;
    private javax.swing.JMenuItem calculadora;
    private javax.swing.JMenuItem cambioDivisa;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JMenu menu1;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salida;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
