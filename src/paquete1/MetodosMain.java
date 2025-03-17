package paquete1;

public class MetodosMain {
    
    public String TipoDeVehiculo(int typeVehiculo) {
        
        String vehiculo = "";
        
        if (typeVehiculo == 1) {
            vehiculo = "Carro";
        } else {
            vehiculo = "Moto";
        }
        
        return vehiculo;
    }
    
}
