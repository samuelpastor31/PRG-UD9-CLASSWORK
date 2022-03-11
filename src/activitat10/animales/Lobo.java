package activitat10.animales;

import activitat10.Animal;
import activitat10.util.Comida;
import activitat10.util.Tamaño;

public class Lobo extends Animal {
    public Lobo(boolean vacunado, Comida comida, int hambre, Tamaño tamaño, String localización) {
        super(vacunado, comida, hambre, tamaño, localización);
    }

    @Override
    public void emitirSonido() {
        System.out.println("comes verga");
    }
}
