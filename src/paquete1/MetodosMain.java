package paquete1;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class MetodosMain {
    
    public String PrintPlayers(ArrayList <Personaje> per) {
        
        String lista = "";
        for (int i = 0; i < per.size(); i++) {
            lista += (i+1) + ". " + per.get(i).getNombre() + "\n";
        }
        
        return lista;
    }
    public static String PrintCopas(Copa [] copas) {
        
        String lista = "";
        
        int i = 0;
        for (Copa copa : copas) {
            lista += (i+1) + ". " + copa.toString() + "\n";
            i ++;
        }
        
        return lista;
    }
    public int EleccionDePersonaje(ArrayList <Personaje> personajes) {
        
        // Eleccion de personajes
        String lista = PrintPlayers(personajes); // Lista de personajes
        int resp, nPersonaje;
        do {

            nPersonaje = Integer.parseInt(JOptionPane.showInputDialog("Elije a un personaje\n" + lista + "\nIngresa el numero del personaje que quieres")) -1; // Eleccion del personaje del usuario
            while (nPersonaje >= personajes.size() || nPersonaje < 0) { // Validar la posicion ingresada del usuario
                JOptionPane.showMessageDialog(null, "El personaje " + (nPersonaje+1) + " no existe\nIntenta de nuevo");
                nPersonaje = Integer.parseInt(JOptionPane.showInputDialog(lista + "Ingresa el numero del personaje que quieres")) -1; // Eleccion del personaje del usuario
            }    
            resp = JOptionPane.showConfirmDialog(null, "Seguro de elegir a " + personajes.get(nPersonaje).getNombre() + "?");
        } while (resp == 1 || resp == 2 || resp == -1);

        
        return nPersonaje;
    }
    public Personaje TipoDeVehiculo(Personaje userPlayer) {
        
        String vehiculo = "";
        // Mediante JOptionPane, solicitar al usuario la entrada del tipo de vehiculo
        int typeVehiculo = Integer.parseInt(JOptionPane.showInputDialog("--------------------"+"\nPersonaje\n" + "--------------------" + "\n" + userPlayer.getNombre() + "\n" + "--------------------" + "\n" + "Elije tu vehiculo:" + "\n" + "1. Carro" + "\n" + "2. Moto" + "\n" + "Ingresa el numero de la opcion"));
        while (typeVehiculo < 1 || typeVehiculo > 2) { // Validar si la opcion esta en el rango
            typeVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Opcion no valida, intenta otra vez\n" + "Elije tu vehiculo:" + "\n" + "1. Carro" + "\n" + "2. Moto" + "\n" + "Ingresa el numero de la opcion"));
        }
        // De acuerdo a la opcion, modificar el atributo "vehiculo" del userPlayer
        if (typeVehiculo == 1) {
            vehiculo = "Carro";
        } else {
            vehiculo = "Moto";
        }
        userPlayer.setVehiculo(vehiculo); // Modificar el atributo de vehiculos para definir velocidad y peso
        userPlayer.DefinirStats();
        
        return userPlayer;
    }
    public ArrayList <Personaje> Competidores(ArrayList <Personaje> array, Personaje userPersonaje) {
        
        ArrayList <Personaje> competidores = new ArrayList();
        // Agregar al usuario a lista de competidores
        competidores.add(userPersonaje);
        
        Random rd = new Random();
        // Llenar los siguientes 7 puestos aleatoriamente
        for (int i = 0; i < 7; i++) {
            int nPersonaje = rd.nextInt(0,array.size());
            while (competidores.contains(array.get(nPersonaje))) {
                nPersonaje = rd.nextInt(0,array.size());
            }
            competidores.add(array.get(nPersonaje));
        }

        return competidores;
    }
    
}
