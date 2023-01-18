
package ejercicio_8;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Laura
 */
public class ventana extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true; //Para que los botones esten activados, en el momento de ejecutarlos se desactivan.
    private boolean resterminado = false; //Operación no iniciada
    private boolean point = true;

    public ventana() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel1 = new javax.swing.JPanel();
        mostrador = new javax.swing.JLabel();
        funciones = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        raizCuadrada = new javax.swing.JButton();
        division = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        etiqueta7 = new javax.swing.JButton();
        etiqueta8 = new javax.swing.JButton();
        etiqueta9 = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        etiqueta4 = new javax.swing.JButton();
        etiqueta5 = new javax.swing.JButton();
        etiqueta6 = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        etiqueta1 = new javax.swing.JButton();
        etiqueta2 = new javax.swing.JButton();
        etiqueta3 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        masomenos = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        menuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        calculadora = new javax.swing.JMenuItem();
        divisa = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        salida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        panel1.setPreferredSize(new java.awt.Dimension(300, 450));
        panel1.setLayout(new java.awt.GridBagLayout());

        mostrador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        mostrador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel1.add(mostrador, gridBagConstraints);

        funciones.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        funciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        funciones.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel1.add(funciones, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(botonC, gridBagConstraints);

        raizCuadrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/raizCuadrada1-removebg-preview.png"))); // NOI18N
        raizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(raizCuadrada, gridBagConstraints);

        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/division1-removebg-preview.png"))); // NOI18N
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(division, gridBagConstraints);

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/borrar1-removebg-preview.png"))); // NOI18N
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(borrar, gridBagConstraints);

        etiqueta7.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta7.setText("7");
        etiqueta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta7, gridBagConstraints);

        etiqueta8.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta8.setText("8");
        etiqueta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta8, gridBagConstraints);

        etiqueta9.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta9.setText("9");
        etiqueta9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta9, gridBagConstraints);

        multiplicacion.setFont(new java.awt.Font("Arial", 0, 27)); // NOI18N
        multiplicacion.setText("X");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(multiplicacion, gridBagConstraints);

        etiqueta4.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta4.setText("4");
        etiqueta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta4, gridBagConstraints);

        etiqueta5.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta5.setText("5");
        etiqueta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta5, gridBagConstraints);

        etiqueta6.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta6.setText("6");
        etiqueta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta6, gridBagConstraints);

        resta.setFont(new java.awt.Font("Arial", 0, 60)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(resta, gridBagConstraints);

        etiqueta1.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta1.setText("1");
        etiqueta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta1, gridBagConstraints);

        etiqueta2.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta2.setText("2");
        etiqueta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta2, gridBagConstraints);

        etiqueta3.setBackground(new java.awt.Color(204, 204, 204));
        etiqueta3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        etiqueta3.setText("3");
        etiqueta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiqueta3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(etiqueta3, gridBagConstraints);

        suma.setFont(new java.awt.Font("Arial", 0, 42)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(suma, gridBagConstraints);

        masomenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/masomenos1-removebg-preview.png"))); // NOI18N
        masomenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masomenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(masomenos, gridBagConstraints);

        cero.setBackground(new java.awt.Color(204, 204, 204));
        cero.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(cero, gridBagConstraints);

        punto.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/point1-removebg-preview.png"))); // NOI18N
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(punto, gridBagConstraints);

        equal.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel1.add(equal, gridBagConstraints);

        menu1.setText("Menú");
        menu1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        calculadora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        calculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/calculadora1-removebg-preview.png"))); // NOI18N
        calculadora.setText("Calculadora");
        menu1.add(calculadora);

        divisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        divisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejercicio_8/Imagenes/mundo1-removebg-preview.png"))); // NOI18N
        divisa.setText("Cambio de divisa");
        divisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaActionPerformed(evt);
            }
        });
        menu1.add(divisa);
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

        menuBar1.add(menu1);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        System.exit(0); //Salida del menú
    }//GEN-LAST:event_salidaActionPerformed

    private void divisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaActionPerformed
        divisaMoneda conversor = new divisaMoneda();
        //Clase - Objeto
        conversor.setVisible(true); //Acción del objeto para que muestre en este caso la ventana de divisa-conversor.

        dispose(); //Cerrar ventana anterior
    }//GEN-LAST:event_divisaActionPerformed

    private void raizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizCuadradaActionPerformed
        numero1 = Double.parseDouble(cadenaNumeros);
        resultado = Math.sqrt(numero1); //Variable que guarda el resultado; este queda guardado en memoria.

        if (resultado % 1 == 0) { //(Decimal)

            funciones.setText(String.format("%.0f", resultado)); //Mostrar el resultado en JLabel inferior.
            mostrador.setText("sqrt(" + cadenaNumeros + ")"); //Mostrar operación en JLabel superior.
        } else { //No decimal
            funciones.setText(Double.toString(resultado));
            mostrador.setText("sqrt(" + cadenaNumeros + ")");
        }

        cadenaNumeros = String.valueOf(resultado); //Guarda el último resultado para seguir operando

        resterminado = true; //Operación finalizada
        point = true;

    }//GEN-LAST:event_raizCuadradaActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed

        if (point == true) {

            if (" ".equals(cadenaNumeros)) {
                cadenaNumeros += "0.";
            } else {
                cadenaNumeros += ".";
            }
            funciones.setText(cadenaNumeros); //Mostrar el resultado en JLabel inferior.

            point = false;
        }
    }//GEN-LAST:event_puntoActionPerformed

    private void etiqueta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta1ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;

    }//GEN-LAST:event_etiqueta1ActionPerformed

    private void etiqueta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta2ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta2ActionPerformed

    private void etiqueta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta3ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta3ActionPerformed

    private void etiqueta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta4ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta4ActionPerformed

    private void etiqueta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta5ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta5ActionPerformed

    private void etiqueta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta6ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta6ActionPerformed

    private void etiqueta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta7ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta7ActionPerformed

    private void etiqueta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta8ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta8ActionPerformed

    private void etiqueta9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiqueta9ActionPerformed

        operacionTerminada();

        if (funciones.getText() == "0") {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }

        funciones.setText(cadenaNumeros);
        activado = true;
        point = true;
    }//GEN-LAST:event_etiqueta9ActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed

        operacionTerminada();

        if (!"0".equals(cadenaNumeros)) {

            cadenaNumeros += "0";
            funciones.setText(cadenaNumeros);
            activado = true;
        }

    }//GEN-LAST:event_ceroActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        if (activado == true) {

            numero1 = Double.parseDouble(cadenaNumeros); //Cambiar la cadena de numeros de String a un Double; ya que numero 1 es un Double.
            mostrador.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";

            activado = false;
            point = true;
        }

    }//GEN-LAST:event_sumaActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        double numero2;

        if (operacion.equals("nula")) {
            funciones.setText(cadenaNumeros);
            
            
        } else if (operacion.equals("sumar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 + numero2;

            if (resultado % 1 == 0) {

                funciones.setText(String.format("%.0f", resultado));
                
                if (numero1 % 1 == 0 && numero2 % 1 == 0) {
                    mostrador.setText(String.format("%.0f", numero1) + " + " + (String.format("%.0f", numero2) + " = "));
                } else {
                    mostrador.setText((numero1) + " + " + (numero2) + " = ");
                }

            } else {
                funciones.setText(Double.toString(resultado));

                if (numero1 % 1 == 0) {

                    mostrador.setText(String.format("%.0f", numero1) + " + " + (Double.toString(numero2)) + " = ");

                } else if (numero2 % 1 == 0) {
                    mostrador.setText(Double.toString(numero1) + " + " + (String.format("%.0f", numero2) + " = "));

                } else {
                    mostrador.setText(Double.toString(numero1) + " + " + (Double.toString(numero2) + " = "));
                }

            }

            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
            
        } else if (operacion.equals("restar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 - numero2;

            if (resultado % 1 == 0) {

                funciones.setText(String.format("%.0f", resultado)); //Cero

                if (numero1 % 1 == 0 && numero2 % 1 == 0) {
                    mostrador.setText(String.format("%.0f", numero1) + " - " + (String.format("%.0f", numero2) + " = "));
                } else {
                    mostrador.setText((numero1) + " - " + (numero2) + " = ");
                }

            } else {
                funciones.setText(Double.toString(resultado));

                if (numero1 % 1 == 0) {

                    mostrador.setText(String.format("%.0f", numero1) + " - " + (Double.toString(numero2)) + " = "); //Arriba

                } else if (numero2 % 1 == 0) {
                    mostrador.setText(Double.toString(numero1) + " - " + (String.format("%.0f", numero2) + " = "));

                } else {
                    mostrador.setText(Double.toString(numero1) + " - " + (Double.toString(numero2) + " = "));
                }
            }

            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
            
        } else if (operacion.equals("multiplicar")) {
            numero2 = Double.parseDouble(cadenaNumeros);
            resultado = numero1 * numero2;

            if (resultado % 1 == 0) {

                funciones.setText(String.format("%.0f", resultado));
                mostrador.setText(String.format("%.0f", numero1) + " x " + (String.format("%.0f", numero2) + " = "));
            } else {
                funciones.setText(Double.toString(resultado));

                if (numero1 % 1 == 0) {

                    mostrador.setText(String.format("%.0f", numero1) + " x " + (Double.toString(numero2)) + " = ");

                } else if (numero2 % 1 == 0) {
                    mostrador.setText(Double.toString(numero1) + " x " + (String.format("%.0f", numero2) + " = "));

                } else {
                    mostrador.setText(Double.toString(numero1) + " x " + (Double.toString(numero2) + " = "));
                }

            }

            cadenaNumeros = String.valueOf(resultado);
            operacion = "nula";
            
            
        } else if (operacion.equals("dividir")) {
            numero2 = Double.parseDouble(cadenaNumeros);

            if (numero2 == 0) {
                funciones.setText("Operación inválida");

                if (numero1 % 1 != 0) {
                    funciones.setText("Operación inválida");
                    mostrador.setText(Double.toString(numero1) + " / " + (String.format("%.0f", numero2) + " = "));
                } else {
                    mostrador.setText(String.format("%.0f", numero1) + " / " + (String.format("%.0f", numero2) + " = "));
                }

            } else {
                resultado = numero1 / numero2;

                if (numero1 % 1 == 0 && numero2 % 1 == 0) {

                    if (numero1 % numero2 == 0) {
                        funciones.setText(String.format("%.0f", resultado));
                        mostrador.setText(String.format("%.0f", numero1) + " / " + (String.format("%.0f", numero2) + " = "));
                    } else {
                        funciones.setText(Double.toString(resultado));
                        mostrador.setText(String.format("%.0f", numero1) + " / " + (String.format("%.0f", numero2) + " = "));

                    }
                } else {
                    funciones.setText(Double.toString(resultado));

                    if (numero1 % 1 == 0) {
                        mostrador.setText(String.format("%.0f", numero1) + " / " + (Double.toString(numero2) + " = "));
                    } else if (numero2 % 1 == 0) {
                        mostrador.setText(Double.toString(numero1) + " / " + (String.format("%.0f", numero2) + " = "));
                    } else {

                        mostrador.setText(Double.toString(numero1) + " / " + (Double.toString(numero2) + " = "));
                    }

                    if (numero1 == numero2) {
                        funciones.setText("1");

                    }
                    cadenaNumeros = String.valueOf(resultado);
                }
            }

            operacion = "nula";
        }

        activado = true;
        resterminado = true;
    }//GEN-LAST:event_equalActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        int tamaño = cadenaNumeros.length();
        if (tamaño > 0) {
            if (tamaño == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            }

            funciones.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        mostrador.setText("");
        funciones.setText("");
        cadenaNumeros = "";
        operacion = "nula";
        activado = true;
        point = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void masomenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masomenosActionPerformed
        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = '-' + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());

        }

        funciones.setText(cadenaNumeros);
    }//GEN-LAST:event_masomenosActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        if (activado == true) {

            numero1 = Double.parseDouble(cadenaNumeros);
            mostrador.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";

            activado = false;
            point = true;
        }
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        if (activado == true) {

            numero1 = Double.parseDouble(cadenaNumeros);
            mostrador.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";

            activado = false;
            point = true;
        }
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        if (activado == true) {

            numero1 = Double.parseDouble(cadenaNumeros);
            mostrador.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";

            activado = false;
            point = true;
        }
    }//GEN-LAST:event_divisionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });

    }

    public void operacionTerminada() {

        if (resterminado == true) {

            funciones.setText("");
            mostrador.setText("");
            cadenaNumeros = "";

            resterminado = false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton botonC;
    private javax.swing.JMenuItem calculadora;
    private javax.swing.JButton cero;
    private javax.swing.JMenuItem divisa;
    private javax.swing.JButton division;
    private javax.swing.JButton equal;
    private javax.swing.JButton etiqueta1;
    private javax.swing.JButton etiqueta2;
    private javax.swing.JButton etiqueta3;
    private javax.swing.JButton etiqueta4;
    private javax.swing.JButton etiqueta5;
    private javax.swing.JButton etiqueta6;
    private javax.swing.JButton etiqueta7;
    private javax.swing.JButton etiqueta8;
    private javax.swing.JButton etiqueta9;
    private javax.swing.JLabel funciones;
    private javax.swing.JButton masomenos;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenuBar menuBar1;
    private javax.swing.JLabel mostrador;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JPanel panel1;
    private javax.swing.JButton punto;
    private javax.swing.JButton raizCuadrada;
    private javax.swing.JButton resta;
    private javax.swing.JMenuItem salida;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
