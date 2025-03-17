package paquete1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
    
    public static void PrintPlayers(ArrayList <Personaje> per) {
        
        for (int i = 0; i < per.size(); i++) {
            System.out.println((i+1) + ". " + per.get(i).getNombre());
        }

    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Metodos md = new Metodos();
        // Arrego de personajes predeterminados
        ArrayList <Personaje> personajes = md.Personajes();
        // Arreglo de personajes a desbloquear
        Personaje [] personajesPlus = md.PeronajesADesbloquear();
        
        int op;
        do {
            System.out.println();
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Salir");
            System.out.print("Ingresa el numero de la opcion: ");
            op = input.nextInt();
            System.out.println();
            switch(op) {
                case 1:
                    System.out.println("Elige un personaje");
                    PrintPlayers(personajes);
                    break;

                case 2:
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
        } while (op != 2);
        
    }
    
}
