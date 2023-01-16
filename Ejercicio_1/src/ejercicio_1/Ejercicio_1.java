
package ejercicio_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Laura
 */
public class Ejercicio_1 extends JFrame {
    
    //Variables globales
    public JPanel panel;
    public JLabel etiqueta;
    public JButton boton;
    private int contador =0;
    
    
    
    public Ejercicio_1 (){
        this.setSize(500, 500);
        this.setTitle("Ejercicio 1");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
    colocarPaneles();
    colocarEtiquetas();
    colocarBoton();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
    etiqueta = new JLabel();
    etiqueta.setText("Número de clicks");
    etiqueta.setBounds(85, 10, 300, 80);
    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta.setForeground(Color.pink);
    etiqueta.setFont(new Font("century gothic", Font.BOLD, 15));
     panel.add(etiqueta);
    }
    
    private void colocarBoton(){
     boton = new JButton("Click");
     boton.setBounds(180, 250, 100, 40);
     boton.setEnabled(true);
     boton.setForeground(Color.black);
     boton.setFont(new Font ("century gothic", Font.BOLD, 15));
     panel.add(boton);
     
     eventoDeAccion();
    }
    
    private void eventoDeAccion(){
        
        ActionListener eventoAccion = new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent ae){
                contador++;
                if (contador == 1){
                etiqueta.setText("Ha presionado el botón 1 vez");
                }
                else {
                    etiqueta.setText("Se ha presionado el botón "+contador+" veces");
                }
                
            }
        };
        
        boton.addActionListener(eventoAccion);
    }
    
}
