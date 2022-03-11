package activitat12;

public class CredencialesInvalidasException extends Exception{
    public CredencialesInvalidasException(){
        super("Usuario o contraseñas incorrectas");
    }
}
