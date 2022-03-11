package activitat12;

import java.util.HashMap;
import java.util.Scanner;

public class LoginService {

    public static final int MAX_INTENTOS = 3;

    private HashMap<String, String> credencialesValidas;

    private int intentos;

    public LoginService() {

        credencialesValidas = new HashMap<>();
        credencialesValidas.put("admin","admin");
        credencialesValidas.put("root","123456789");
        credencialesValidas.put("rhidalgo","_swqwr87f");

        this.intentos = 0;
    }

    public boolean login(String usuario, String contrasenya) {

        if (intentos < MAX_INTENTOS) {
            if (credencialesValidas.containsKey(usuario)) {
                String passwordAsociado = credencialesValidas.get(usuario);
                return contrasenya.equals(passwordAsociado); //es importante no hacer password.equals(contrasenya) para no poder obtener un NullPointerException
            }

            intentos++;
            return false;
        } else {
            System.out.println("Ha superado el máximo de intentos. Login bloqueado");
            return false;
        }
    }
    public void comprobarCredenciales(String usuario,String password)
            throws CredencialesInvalidasException, MaximoIntentosAlcanzadosExcepcion
    {
        if (intentos < MAX_INTENTOS) {
            if (credencialesValidas.containsKey(usuario)) {
                String passwordAsociado = credencialesValidas.get(usuario);
                if (password.equals(passwordAsociado)){
                    return;}
            }
            intentos++;
            throw new CredencialesInvalidasException();

        }
        else {
            throw new MaximoIntentosAlcanzadosExcepcion();
        }
    }
}
