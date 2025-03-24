package paquete1;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        MetodosObjects mdo = new MetodosObjects();
        MetodosMain mdm = new MetodosMain();
        
        // Arrego de personajes predeterminados
        ArrayList <Personaje> personajes = mdo.Personajes();
        // Arreglo de personajes a desbloquear
        Personaje [] personajesPlus = mdo.PersonajesADesbloquear();
        // Arreglo de copas
        Copa copas [] = mdo.Copas();
        // Arreglos de probabilidades de ganar de cada personaje
        ArrayList <Personaje> arrayProbalities = new ArrayList();
        
        // Icono de menu Principal
        ImageIcon icon = new ImageIcon("mario.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH));
        int op;
        do {
            // Inicio
            JOptionPane.showMessageDialog(null, icon); // Mostrar icono
            // Ingresar opcion utilizando JOptionPane
            op = Integer.parseInt(JOptionPane.showInputDialog("1. Jugar\n2. Opciones\n3. Salir\nIngresa el numero de la opcion"));
            switch(op) {
                case 1:
                    // Eleccion de personajes
                    int nPersonaje = mdm.EleccionDePersonaje(personajes);
                    // Guardar el personaje del usuario en una variable tipo Personaje
                    Personaje userPlayer = personajes.get(nPersonaje);
                    // Eleccion de vehiculo
                    userPlayer = mdm.TipoDeVehiculo(userPlayer);
                    // Confirmar jugar con el personaje actual
                    int opPlay = JOptionPane.showConfirmDialog(null, userPlayer.toString() + "\nStart?");
                    if (opPlay == 1 || opPlay == 2 || opPlay == -1) {
                        break;
                    } else {
                        // Elegir competidores aleatorios
                        ArrayList <Personaje> competidores = mdm.Competidores(personajes, userPlayer);
                        Ventanas v1 = new Ventanas(competidores, personajes);
                        int opRun = JOptionPane.showConfirmDialog(null, "A Correr?");
                        if (opRun == 0) {
                            v1.setVisible(false);
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    // Submenu
                    break;
                case 3:
                    break;
            }
        } while (op != 3);
        
    }
    
}
