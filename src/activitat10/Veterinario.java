package activitat10;

import activitat10.animales.Leon;
import activitat10.animales.Tigre;

public class Veterinario {
    public void vacunarAnimal(Animal animal) {
        if (animal instanceof Leon ) {
            animal.comer();
        }else if (animal instanceof Tigre) {
            animal.comer();
        }
        animal.vacunar();
    }
    public void alimentarAnimal (Animal animal) {
        animal.comer();
    }

}
