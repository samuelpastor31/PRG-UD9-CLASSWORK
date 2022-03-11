package activitat10;

import activitat10.animales.Leon;
import activitat10.animales.Tigre;
import activitat10.util.ApareamientoInvalidoExcepcion;
import activitat10.util.Comida;
import activitat10.util.Tamaño;
import activitat9.TancPleException;

import java.util.Objects;

public abstract class Animal {
    private boolean vacunado;
    private Comida comida;
    private int hambre;
    private Tamaño tamaño;
    private String localización;
    protected String ser;

    public Animal(boolean vacunado, Comida comida, int hambre, Tamaño tamaño, String localización) {
        this.vacunado = false;
        this.comida = comida;
        this.hambre = 8;
        this.tamaño = tamaño;
        this.localización = localización;
    }

    public abstract void emitirSonido();

    public void comer() {
        if (comida == Comida.herbivoro) {
            this.hambre = this.hambre - 2;
        }
        if(comida == Comida.carnivoro) {
            this.hambre=this.hambre-1;
        }
        if(comida == Comida.omnivoro) {
            this.hambre=this.hambre-3;
        }
    }

    public void vacunar(){
        this.vacunado = true;
        System.out.println("VACUNANDO a un "+ser);
        this.emitirSonido();
    }
    public void aparearCon(Animal animal) throws ApareamientoInvalidoExcepcion {
        if (this.equals(animal)) {
            System.out.println("Animal almacenado");
        }else {
            throw new ApareamientoInvalidoExcepcion();
        }
    }
    @Override
    public String toString() {
        return "Animal{" +
                "vacunado=" + vacunado +
                ", comida=" + comida +
                ", hambre=" + hambre +
                ", tamaño=" + tamaño +
                ", localización='" + localización + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vacunado, comida, hambre, tamaño, localización, ser);
    }
}
