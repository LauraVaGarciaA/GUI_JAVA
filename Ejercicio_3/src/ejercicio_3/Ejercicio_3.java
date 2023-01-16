
package ejercicio_3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Laura
 */
public class Ejercicio_3 extends JFrame {

    //Variables globales
    public JPanel panel;
    public JLabel etiqueta;
    public JButton b1, b2, b3;
    private int pulsado =0;
    private int contadorRojo=0, contadorVerde=0, contadorAzul=0;
    
    public Ejercicio_3(){
    this.setSize(500, 500);
    this.setTitle("Ejercicio 3");
    this.setResizable(false);
    this.setLocationRelativeTo(null);
     
     iniciarComponentes();
     
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
    colocarPaneles();
    colocarEtiquetas();
    colocarBotones();
    }
    
    private void colocarPaneles(){
    panel = new JPanel();
    panel.setLayout(null);
    this.getContentPane().add(panel);
    
    eventoRuedaDeRaton();
    }
    
    private void colocarEtiquetas(){
    etiqueta = new JLabel();
    etiqueta.setText("Color: Rojo, Verde, Azul");
    etiqueta.setBounds(85, 10, 250, 80);
    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
    etiqueta.setForeground(Color.magenta);
    etiqueta.setFont(new Font("century gothic", Font.BOLD, 18));
     panel.add(etiqueta);
    }
    
    private void colocarBotones(){
        
        //Botón 1
    b1 = new JButton();
    b1.setText("Rojo");
    b1.setBounds(50, 250, 100, 40);
    b1.setEnabled(true);
    b1.setForeground(Color.red);
    b1.setFont(new Font ("century gothic", Font.BOLD, 15));
    panel.add(b1);
    
    b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            pulsado = 1;
           
        }
        }) ;
    
    //Botón 2
    b2 = new JButton();
    b2.setText("Verde");
    b2.setBounds(180, 250, 100, 40);
    b2.setEnabled(true);
    b2.setForeground(Color.green);
    b2.setFont(new Font ("century gothic", Font.BOLD, 15));
    panel.add(b2);
    
    b2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            pulsado = 2;
           
        }
        }) ;
    
    //Botón 3
    b3 = new JButton();
    b3.setText("Azul");
    b3.setBounds(310, 250, 100, 40);
    b3.setEnabled(true);
    b3.setForeground(Color.blue);
    b3.setFont(new Font ("century gothic", Font.BOLD, 15));
    panel.add(b3);
    
    b3.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            pulsado =3 ;
           
        }
        }) ;
    }
    
    private void eventoRuedaDeRaton(){
        MouseWheelListener eventoRueda = new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                
                if(pulsado !=0){ //Verde, rojo u azul
                   if (pulsado ==1){ //Rojo
                    contadorRojo += e.getWheelRotation()*(-1);
                    if (contadorRojo < 0){
                        contadorRojo = 0;
                    }
                    
                    if(contadorRojo >255){
                        contadorRojo = 255;
                    }
                }
                
                else if (pulsado ==2){
                    contadorVerde += e.getWheelRotation()*(-1);
                    if (contadorVerde < 0){
                        contadorVerde = 0;
                    }
                    
                    if(contadorVerde >255){
                        contadorVerde = 255;
                    }
                    
                }
                
                else {
                    contadorAzul += e.getWheelRotation()*(-1);
                    if (contadorAzul < 0){
                        contadorAzul = 0;
                    }
                    if(contadorAzul >255){
                        contadorAzul = 255;
                    }
                    
                          }
                   }
                etiqueta.setText("Color: Rojo = "+contadorRojo+", Verde = "+contadorVerde+", Azul ="+contadorAzul+"");
                panel.setBackground(new Color(contadorRojo, contadorVerde, contadorAzul));
          }
        
        };
        
        panel.addMouseWheelListener(eventoRueda);
    }
}