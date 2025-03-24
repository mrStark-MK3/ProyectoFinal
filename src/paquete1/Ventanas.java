package paquete1;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventanas extends JFrame{
    
    
    public Ventanas(ArrayList <Personaje> competidores, ArrayList <Personaje> personajes) { // Inicio de juego
        
        this.setTitle("COMPETIDORES");
        this.setSize(500, 500); // Establecer tamanio de la ventana
        this.setLocationRelativeTo(null); // Establecer ventana en el centro
        this.setLayout(new GridLayout(0,2)); // Establece un salto de linea | 0 significa filas y 1 columnas
        
        // Iconos
        ImageIcon icon1 = new ImageIcon("bebemarioIcon.jpg");
        ImageIcon icon2 = new ImageIcon("toadIcon.jpg");
        ImageIcon icon3 = new ImageIcon("marioIcon.jpg");
        ImageIcon icon4 = new ImageIcon("yoshiIcon.jpg");
        ImageIcon icon5 = new ImageIcon("warioIcon.jpg");
        ImageIcon icon6 = new ImageIcon("kongIcon.jpg");
        ImageIcon icon7 = new ImageIcon("bebepeachIcon.jpg");
        ImageIcon icon8 = new ImageIcon("kopaIcon.jpg");
        ImageIcon icon9 = new ImageIcon("luigiIcon.jpg");
        ImageIcon icon10 = new ImageIcon("peachIcon.jpg");
        ImageIcon icon11 = new ImageIcon("waluigiIcon.jpg");
        ImageIcon icon12 = new ImageIcon("bowserIcon.jpg");
        //--
        //--
        //--
        //--
        // Etiquetas | Mostrar competidores en formato: N. nombre [imagen]
        int i = 0;
        for (int c = 0; c < personajes.size(); c++) {
            if (competidores.contains(personajes.get(c))) {
                JLabel label = null;
                String nombre = personajes.get(c).getNombre().toLowerCase();

                switch (nombre) {
                    case "bebe mario":
                        label = new JLabel((i+1) + ". Bebe Mario", icon1, JLabel.LEFT);
                        i++;
                        break;
                    case "toad":
                        label = new JLabel((i+1) + ". Toad", icon2, JLabel.LEFT);
                        i++;
                        break;
                    case "mario":
                        label = new JLabel((i+1) + ". Mario", icon3, JLabel.LEFT);
                        i++;
                        break;
                    case "yoshi":
                        label = new JLabel((i+1) + ". Yoshi", icon4, JLabel.LEFT);
                        i++;
                        break;
                    case "wario":
                        label = new JLabel((i+1) + ". Wario", icon5, JLabel.LEFT);
                        i++;
                        break;
                    case "donkey kong":
                        label = new JLabel((i+1) + ". Donkey Kong", icon6, JLabel.LEFT);
                        i++;
                        break;
                    case "bebe peach":
                        label = new JLabel((i+1) + ". Bebe Peach", icon7, JLabel.LEFT);
                        i++;
                        break;
                    case "kopa":
                        label = new JLabel((i+1) + ". Kopa", icon8, JLabel.LEFT);
                        i++;
                        break;
                    case "luigi":
                        label = new JLabel((i+1) + ". Luigi", icon9, JLabel.LEFT);
                        i++;
                        break;
                    case "peach":
                        label = new JLabel((i+1) + ". Peach", icon10, JLabel.LEFT);
                        i++;
                        break;
                    case "waluigi":
                        label = new JLabel((i+1) + ". Waluigi", icon11, JLabel.LEFT);
                        i++;
                        break;
                    case "bowser":
                        label = new JLabel((i+1) + ". Bowser", icon12, JLabel.LEFT);
                        i++;
                        break;
                }
                // Agregar la etiqueta al JFrame si no es nula
                if (label != null) {
                    this.add(label);
                }
            }
        }
        
        this.setVisible(true); // Mostrar ventana en la ejecucion
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar ejecucion al cerrar la ventana
    }
    
}
