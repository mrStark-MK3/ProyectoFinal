package paquete1;

import java.util.ArrayList;
import java.util.Random;

public class MetodosObjects {
    
    // Personajes
    // Personajes predeterminados
    public ArrayList <Personaje> Personajes() {
        
        ArrayList <Personaje> Personajes = new ArrayList();
        
        Personajes.add(new Personaje("Bebe Mario", "", 0, 0, 2));
        Personajes.add(new Personaje("Toad", "", 0, 0, 2));
        Personajes.add(new Personaje("Mario", "", 0, 0, 2));
        Personajes.add(new Personaje("Yoshi", "", 0, 0, 2));
        Personajes.add(new Personaje("Wario", "", 0, 0, 2));
        Personajes.add(new Personaje("Donkey Kong", "", 0, 0, 2));
        Personajes.add(new Personaje("Bebe Peach", "", 0, 0, 2));
        Personajes.add(new Personaje("Kopa", "", 0, 0, 2));
        Personajes.add(new Personaje("Luigi", "", 0, 0, 2));
        Personajes.add(new Personaje("Peach", "", 0, 0, 2));
        Personajes.add(new Personaje("Waluigi", "", 0, 0, 2));
        Personajes.add(new Personaje("Bowser", "", 0, 0, 2));
     
        return Personajes;
    }
    // Personajes por desbloquear
    public Personaje [] PersonajesADesbloquear() {
        
        Personaje [] Personajes = new Personaje [7];
        
        Personajes[0] = new Personaje("King Boo", "", 0, 0, 0);
        Personajes[1] = new Personaje("Dry Bones", "", 0, 0, 0);
        Personajes[2] = new Personaje("Daisy", "", 0, 0, 0);
        Personajes[3] = new Personaje("Diddy Kong", "", 0, 0, 0);
        Personajes[4] = new Personaje("Rosalina", "", 0, 0, 0);
        Personajes[5] = new Personaje("Mii", "", 0, 0, 0);
        Personajes[6] = new Personaje("Funky Kong", "", 0, 0, 0);
        
        return Personajes;
    }
    // Heroes
    public ArrayList <String> Heroes(){
        
        ArrayList <Personaje> arrayAll = Personajes();
        Personaje [] arrayAll2 = PersonajesADesbloquear();
        
        ArrayList <String> heroes = new ArrayList();
        
        heroes.add(arrayAll.get(2).getNombre());
        heroes.add(arrayAll.get(3).getNombre());
        heroes.add(arrayAll.get(8).getNombre());
        heroes.add(arrayAll.get(9).getNombre());
        heroes.add(arrayAll2[2].getNombre());
        heroes.add(arrayAll2[5].getNombre());

        return heroes;
    }
    // Villanos
    public ArrayList <String> Villanos(){
        
        ArrayList <Personaje> arrayAll = Personajes();
        Personaje [] arrayAll2 = PersonajesADesbloquear();
        
        ArrayList <String> villanos = new ArrayList();
        
        villanos.add(arrayAll.get(4).getNombre());
        villanos.add(arrayAll.get(5).getNombre());
        villanos.add(arrayAll.get(10).getNombre());
        villanos.add(arrayAll.get(11).getNombre());
        villanos.add(arrayAll2[0].getNombre());
        villanos.add(arrayAll2[6].getNombre());

        return villanos;
    }
    // Copas
    public Copa [] Copas() {
        
        Copa [] copas = new Copa [8];
        
        copas [0] = (new Copa("Mushroom Cup", "", 2));
        copas [1] = (new Copa("Flower Cup", "", 4));
        copas [2] = (new Copa("Star Cup", "", 6));
        copas [3] = (new Copa("Special Cup", "", 8));
        copas [4] = (new Copa("Shell Cup", "", 10));
        copas [5] = (new Copa("Banana Cup", "", 12));
        copas [6] = (new Copa("Leaf Cup", "", 14));
        copas [7] = (new Copa("Lightning Cup", "", 16));
        
        return copas;
    }
    
    // Probabilidades de ganar
    public ArrayList ProbabilidadesArray(ArrayList <Personaje> array) {
        
        Random rd = new Random();
        
        // Arreglo de personajes y su probanilidad de ganar (este es el que se utilizara en la simlacion de la carrera)
        ArrayList <Personaje> arrayProbs = new ArrayList();
        // Arreglo de heroes
        ArrayList <String> heroes = Heroes();
        // Arreglo de villanos
        ArrayList <String> villanos = Villanos();
        // Asignacion de probabilidades de ganar
        int puntos = 0;
        for (int i = 0; i < array.size(); i++) {
            Personaje personaje = array.get(i);
            if (heroes.contains(personaje.getNombre())) {
                if (personaje.getVehiculo().equalsIgnoreCase("carro")) {
                    int R = rd.nextInt(1,21);
                    if (R >= 1 && R <= 9) {
                        
                    }
                }
            }
        }
        
        
        
        return arrayProbs;
    }
    
    // Ganador
    public void Ganador(Personaje ganador) {
        
    }
    
}
