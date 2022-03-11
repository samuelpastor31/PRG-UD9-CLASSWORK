package activitat10.animales;

import activitat10.Animal;
import activitat10.Mascota;
import activitat10.util.Comida;
import activitat10.util.Tamaño;

public class Gato extends Animal implements Mascota {
    public Gato(boolean vacunado, Comida comida, int hambre, Tamaño tamaño, String localización) {
        super(vacunado, comida, hambre, tamaño, localización);
    }


    @Override
    public void emitirSonido() {
        System.out.println("AGGGGGGGGGGGGGHHH");
    }

    @Override
    public void serAmigable(
    ) {
        System.out.println("Ronroeno");

    }

    @Override
    public void jugar() {
        System.out.println("Zarpazo");
    }
}
