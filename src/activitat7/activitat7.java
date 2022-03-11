package activitat7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class activitat7 {
    public static void main(String[] args) {
        try {
           int edad = getEdad();
            System.out.println("Tu edad es "+edad);
        }catch (InputMismatchException ex) {
            System.out.println("Error: edad incorrecta motivo " +ex.getMessage());
        }

    }

    private static int getEdad() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Dime tu edad");
        int edad = scanner.nextInt();

        if (edad < 10 || edad > 50) {
            throw new InputMismatchException("Valor fuera de rango");
        }

        return edad;
    }
}
