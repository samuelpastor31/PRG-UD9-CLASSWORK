package activitat10.types;

import activitat10.Mascota;

public class RoboPerro implements Mascota {
    @Override
    public void serAmigable() {
        System.out.println("Mueve cabeza");
    }

    @Override
    public void jugar() {
        System.out.println("Resolver un crucigrama");
    }
}
