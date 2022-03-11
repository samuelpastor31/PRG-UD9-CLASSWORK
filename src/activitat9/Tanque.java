package activitat9;

public class Tanque
{
    int capacidad;
    int carga;

    public Tanque(int capacidad) {
        this.capacidad = capacidad;
        this.carga =0;
    }
    public void agregarCarga(int cantidad) throws TancPleException{
        if (carga<cantidad)
        {
            carga=carga+cantidad;
            System.out.println("Carga añadida");
        }
        throw new TancPleException();
    }
    public void retirarCarga(int cantidad) throws TancBuitException{
        if (cantidad>0)
        {
            carga=carga-cantidad;
            System.out.println("Carga quitada");
        }
        throw new TancBuitException();
    }

}