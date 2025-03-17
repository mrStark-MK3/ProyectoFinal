package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void PrintPlayers(ArrayList <Personaje> per) {
        
        for (int i = 0; i < per.size(); i++) {
            System.out.println((i+1) + ". " + per.get(i).getNombre());
        }

    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        MetodosObjects mdo = new MetodosObjects();
        MetodosMain mdm = new MetodosMain();
        
        // Arrego de personajes predeterminados
        ArrayList <Personaje> personajes = mdo.Personajes();
        // Arreglo de personajes a desbloquear
        Personaje [] personajesPlus = mdo.PersonajesADesbloquear();
        
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
                    PrintPlayers(personajes); // Mostrar guia de personajes al usuario
                    System.out.print("Ingresa el numero de la opcion: ");
                    int nPersonaje = input.nextInt() - 1;
                    while (nPersonaje >= personajes.size()) { // Validar la posicion ingresada del usuario
                        System.out.println("La posicion ingresada no pertenece a ningun personaje");
                        System.out.print("Intenta de nuevo -> ");
                        nPersonaje = input.nextInt() - 1;
                    }
                    Personaje userPlayer = personajes.get(nPersonaje); // Guardar el personaje del usuario en una variable tipo Personaje
                    System.out.println("Personaje: " + userPlayer.getNombre());
                    System.out.println("Elije tu Vehiculo"); // Modificar el atributo de Vehiculo en el objeto tipo Personaje
                    System.out.println("1. Carro");
                    System.out.println("2. Moto");
                    System.out.print("Ingresa el numero de la opcion: ");
                    int typeVehiculo = input.nextInt();
                    while (typeVehiculo < 1 || typeVehiculo > 2) { // Validar si la opcion esta en el rango
                        System.out.println("Opcion no valida");
                        System.out.print("Intenta de nuevo -> ");
                        typeVehiculo = input.nextInt();
                    }
                    String vehiculo = mdm.TipoDeVehiculo(typeVehiculo);
                    userPlayer.setVehiculo(vehiculo); // Modificar el atributo de vehiculos para definir velocidad y peso
                    userPlayer.DefinirStats(); // Definir peso y velocidad de acuerdo al personaje
                    System.out.println(userPlayer.toString());
                    System.out.println("1. Iniciar Carrera");
                    System.out.println("2. Salir");
                    System.out.print("Ingresa el numero de la opcion: ");
                    int opPlay = input.nextInt();
                    while (opPlay < 1 || opPlay > 2) {
                        System.out.println("Opcion no valida");
                        System.out.print("Intenta de nuevo -> ");
                        opPlay = input.nextInt();
                    }
                    if (opPlay == 1) {
                        
                    } else {
                        break;
                    }
                    break;

                case 2:
                    break;
                default:
                    System.out.println("Opcion no Valida");
            }
        } while (op != 2);
        
    }
    
}
