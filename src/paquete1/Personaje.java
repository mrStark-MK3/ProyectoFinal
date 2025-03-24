package paquete1;

import java.util.ArrayList;

public class Personaje {
    
    // Atributos
    private String nombre;
    private String vehiculo; // Carro o Moto
    private int velocidad;
    private int peso; // Tanto la velocidad como el peso van de 1 a 10. (1 el mas bajo y 10 el mas alto)
    private int nivel; // Este se modifica de acuerdo el usuario jueguepr 
    private int puntos; // Este imidica la puntos de ganar de cada personaje
    private Personaje personaje; // Personaje cont los atributos basicos
    
    // Constructor
    public Personaje(String nombre, String vehiculo, int velocidad, int peso, int nivel) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.velocidad = velocidad;
        this.peso = peso;
        this.nivel = nivel;
    }
    // Este constructore es el que se utilizara en la simulacion de la carrera
    public Personaje(Personaje personaje, int puntos) {
        this.personaje = personaje;
        this.puntos = puntos;
    }
    
    // Funciones
    public void DefinirStats() {
        
        MetodosObjects mdo = new MetodosObjects();
        
        ArrayList <String> heroes = mdo.Heroes();
        ArrayList <String> villanos = mdo.Villanos();
        
        if (heroes.contains(nombre)) {
            if (vehiculo.equalsIgnoreCase("carro")) {
                velocidad = 5;
                peso = 5;
            } else {
                velocidad = 6;
                peso = 4;
            }
        } else if (villanos.contains(nombre)) {
            if (vehiculo.equalsIgnoreCase("carro")) {
                velocidad = 4;
                peso = 6;
            } else {
                velocidad = 5;
                peso = 5;
            }
        } else {
            if (vehiculo.equalsIgnoreCase("carro")) {
                velocidad = 6;
                peso = 4;
            } else {
                velocidad = 7;
                peso = 3;
            }
        }
        
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    
    // ToString
    @Override
    public String toString() {
        return "Nombre: " + nombre + 
                "\nVehiculo: " + vehiculo + 
                "\nVelocidad: " + velocidad + 
                "\nPeso: " + peso + 
                "\nNivel: " + nivel;
    }
    
}
