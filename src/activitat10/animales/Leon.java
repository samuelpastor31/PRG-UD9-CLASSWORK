package activitat10.animales;

import activitat10.Animal;
import activitat10.util.Comida;
import activitat10.util.Tamaño;

public class Leon extends Animal {

    public Leon(boolean vacunado, Comida comida, int hambre, Tamaño tamaño, String localización) {
        super(vacunado, comida, hambre, tamaño, localización);
        ser = "leon";
    }

    @Override
    public void emitirSonido() {
        System.out.println("ARGGGGGGG");
    }


}
