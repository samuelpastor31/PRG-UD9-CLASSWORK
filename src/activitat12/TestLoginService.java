package activitat12;

import java.util.Scanner;

public class TestLoginService {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        TestLoginService testLoginService = new TestLoginService();
        testLoginService.iniciar();
    }

    private void iniciar() {

        LoginService loginService = new LoginService();
        for (int i = 0; i < LoginService.MAX_INTENTOS; i++) {
            try{
                loginService.comprobarCredenciales(getUserName(), getPassword());
                System.out.println("Usuario logueado Correctamente");
                return;
            }catch (CredencialesInvalidasException | MaximoIntentosAlcanzadosExcepcion ex){
                System.out.println(ex.getMessage());

            }
        }}

    private static String getUserName(){
        System.out.print("Introduce el nombre de usuario: ");
        return input.next();
    }

    private static String getPassword(){
        System.out.print("Introduce el password: ");
        return input.next();
    }
}