package activitat10.util;

import activitat10.Persona;
import activitat10.animales.Leon;
import activitat10.types.RoboPerro;

public class TestMascota {
    public static void main(String[] args) {
        Persona persona = new Persona("Pepe");
        Leon leon = new Leon(true,Comida.omnivoro,5,Tamaño.GRANDE,"Alcoy");
        RoboPerro roboperro = new RoboPerro();
        persona.interactuar(roboperro);


    }
}
