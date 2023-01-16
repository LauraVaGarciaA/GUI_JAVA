
package ejercicio_2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import static javax.swing.UIManager.get;

/**
 *
 * @author Laura
 */
public class Ejercicio_2 extends JFrame {

    //Variables globales
    public JPanel panel;
    public JLabel etiqueta, imagen;
    public JRadioButton  radioBoton1,  radioBoton2,  radioBoton3,   radioBoton4;
    
    public Ejercicio_2(){
    this.setSize(700, 500);
    this.setTitle("Ejercicio 2");
          setResizable(false);
     this.setLocationRelativeTo(null);
     
     iniciarComponentes();
     
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
    colocarPaneles();
    colocarEtiquetas();
    colocarRadioBoton();
    }
    
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void colocarEtiquetas(){
       etiqueta = new JLabel();
       etiqueta.setText("Elegir el deporte favorito");
       etiqueta.setBounds(85, 10, 300, 80);
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
       etiqueta.setForeground(Color.magenta);
       etiqueta.setFont(new Font("century gothic", Font.BOLD, 25));
       panel.add(etiqueta);
    }
    
    private void colocarRadioBoton(){
    
        //Radio 1
  radioBoton1 = new JRadioButton();
        radioBoton1.setBounds(50, 150, 100, 50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Tenis");
        radioBoton1.setFont(new Font("century gothic", 0,15));
        panel.add(radioBoton1);
        
        //Radio 2
         radioBoton2 = new JRadioButton();
        radioBoton2.setBounds(50, 200, 100, 50);
        radioBoton2.setEnabled(true);
        radioBoton2.setText("Natación");
        radioBoton2.setFont(new Font("century gothic", 0,15));
        panel.add(radioBoton2);
        
        //Radio 3
         radioBoton3 = new JRadioButton();
        radioBoton3.setBounds(50, 250, 100, 50);
        radioBoton3.setEnabled(true);
        radioBoton3.setText("Fútbol");
        radioBoton3.setFont(new Font("century gothic", 0,15));
        panel.add(radioBoton3);
        
        //Radio 4
        radioBoton4 = new JRadioButton();
        radioBoton4.setBounds(50, 300, 100, 50);
        radioBoton4.setEnabled(true);
        radioBoton4.setText("Voleybol");
        radioBoton4.setFont(new Font("century gothic", 0,15));
        panel.add(radioBoton4);
        
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
        grupoRadioBotones.add(radioBoton4);
        
        eventoDeAccion();
    }
    
    private void eventoDeAccion(){
        
        imagen = new JLabel();
        imagen.setBounds(200, 80, 400, 250);
        panel.add(imagen);
        
        ImageIcon imagenTenis = new ImageIcon(getClass().getResource("/Imagenes/tenis.jpg"));
        ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Imagenes/natacion.jpg"));
        ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Imagenes/futbol.jpg"));
        ImageIcon imagenVoleibol = new ImageIcon(getClass().getResource("/Imagenes/voleibol.jpg"));
        
        ActionListener eventoAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenTenis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton1.addActionListener(eventoAccion1);
        
        ActionListener eventoAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton2.addActionListener(eventoAccion2);
        
        ActionListener eventoAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton3.addActionListener(eventoAccion3);
        
        ActionListener eventoAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenVoleibol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        radioBoton4.addActionListener(eventoAccion4);
        
    }
    
}
