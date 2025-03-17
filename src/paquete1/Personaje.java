package paquete1;

public class Personaje {
    
    // Atributos
    private String nombre;
    private String vehiculo;
    private int velocidad;
    private int peso; // Tanto la velocidad como el peso van de 1 a 10. (1 el mas bajo y 10 el mas alto)
    private int nivel; // Este se modifica de acuerdo el usuario juegue
    
    // Constructor
    public Personaje(String nombre, String vehiculo, int velocidad, int peso, int nivel) {
        this.nombre = nombre;
        this.vehiculo = vehiculo;
        this.velocidad = velocidad;
        this.peso = peso;
        this.nivel = nivel;
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
