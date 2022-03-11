package activitat10;

import activitat10.animales.Leon;
import activitat10.animales.Perro;
import activitat10.util.ApareamientoInvalidoExcepcion;
import activitat10.util.Comida;
import activitat10.util.Tamaño;
import activitat9.TancPleException;

public class TestAnimal {
    public static void main(String[] args) throws ApareamientoInvalidoExcepcion {
        System.out.println("---- Antes de vacunarlos y alimentarlos ------");
        Leon leon = new Leon(false, Comida.carnivoro,8, Tamaño.GRANDE,"La Sabana");
        Perro perro = new Perro(false, Comida.carnivoro,8, Tamaño.GRANDE,"La Sab" +
                "");
        System.out.println(leon.toString());
        Veterinario veterinario = new Veterinario();
        veterinario.vacunarAnimal(leon);
        leon.comer();
        System.out.println(leon.toString());

        try {
            leon.aparearCon(perro);
        } catch (ApareamientoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }

        try {
            leon.aparearCon(leon);
        } catch (ApareamientoInvalidoExcepcion e) {
            System.out.println(e.getMessage());
        }


    }
}
