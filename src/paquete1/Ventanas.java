package paquete1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventanas extends JFrame{
    
    // Bibliotecas
    public String [] Nombres() {
        
        String [] nombres = new String[19];
        
        nombres[0] = "Bebe Mario";
        nombres[1] = "Toad";
        nombres[2] = "Mario";
        nombres[3] = "Yoshi";
        nombres[4] = "Wario";
        nombres[5] = "Donkey Kong";
        nombres[6] = "Bebe Peach";
        nombres[7] = "Kopa";
        nombres[8] = "Luigi";
        nombres[9] = "Peach";
        nombres[10] = "Waluigi";
        nombres[11] = "Bowser";
        
        nombres[12] = "King Boo";
        nombres[13] = "Dry Bones";
        nombres[14] = "Daisy";
        nombres[15] = "Diddy Kong";
        nombres[16] = "Rosalina";
        nombres[17] = "Mii";
        nombres[18] = "Funky Kong";
        
        return nombres;
    }
    public String [] Iconos() {
        
        String [] imagenes = new String[19];
        
        imagenes[0] = "bebemarioIcon.jpg";
        imagenes[1] = "toadIcon.jpg";
        imagenes[2] = "marioIcon.jpg";
        imagenes[3] = "yoshiIcon.jpg";
        imagenes[4] = "warioIcon.jpg";
        imagenes[5] = "kongIcon.jpg";
        imagenes[6] = "bebepeachIcon.jpg";
        imagenes[7] = "kopaIcon.jpg";
        imagenes[8] = "luigiIcon.jpg";
        imagenes[9] = "peachIcon.jpg";
        imagenes[10] = "waluigiIcon.jpg";
        imagenes[11] = "bowserIcon.jpg";
        
        imagenes[12] = "kingbooIcon.jpg";
        imagenes[13] = "drybonesIcon.jpg";
        imagenes[14] = "daisyIcon.jpg";
        imagenes[15] = "diddykongIcon.jpg";
        imagenes[16] = "rosalinaIcon.jpg";
        imagenes[17] = "miiIcon.jpg";
        imagenes[18] = "funkykongIcon.jpg";
        
        return imagenes;
    }
    
    public Ventanas(ArrayList <Personaje> competidores, ArrayList <Personaje> personajes) { // Inicio de juego
        
        this.setTitle("COMPETIDORES");
        this.setSize(500, 500); // Establecer tamanio de la ventana
        this.setLocationRelativeTo(null); // Establecer ventana en el centro
        this.setLayout(new GridLayout(0,2)); // Establece un salto de linea | 0 significa filas y 1 columnas

        // Etiquetas | Mostrar competidores en formato: N. nombre [imagen]
        String [] nombres = Nombres();
        String [] iconos = Iconos();
        int i = 0;
        for (int c = 0; c < personajes.size(); c++) {
            if (competidores.contains(personajes.get(c))) {
                JLabel label = null;
                ImageIcon icon = new ImageIcon(iconos[c]);
                label = new JLabel((i+1) + ". " + nombres[c], icon, JLabel.LEFT);
                i ++;
                this.add(label);
            }
        }
        
        this.setVisible(true); // Mostrar ventana en la ejecucion
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar ejecucion al cerrar la ventana
    }
    
}
