package activitat11;

public class SalgoAgotadoException extends Exception{
    public SalgoAgotadoException() {
        super("No te queda saldo");
    }
}
