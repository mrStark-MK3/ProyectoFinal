package paquete1;

public class Copa {
    
    // Atributos
    private final String nombre;
    private final String rank;
    private final int nivel;
    
    // Constructor
    public Copa(String nombre, String rank, int nivel) {
        this.nombre = nombre;
        this.rank = rank;
        this.nivel = nivel;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getRank() {
        return rank;
    }

    public int getNivel() {
        return nivel;
    }
    
    // ToString
    @Override
    public String toString() {
        return "Copa: " + nombre + " Rank: " + rank + " Nivel: " + nivel;
    }
    
}
