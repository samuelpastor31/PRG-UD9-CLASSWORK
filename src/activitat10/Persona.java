package activitat10;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saluda(){
        System.out.println("Hola que tal");
    }

    public void interactuar (Mascota mascota) {
        mascota.serAmigable();
        mascota.jugar();
    }
}
