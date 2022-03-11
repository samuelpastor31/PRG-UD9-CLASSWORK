package activitat2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat2 {
        private static final int NUM_LEIDOS = 6;

        public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i=0;
        int max= Integer.MIN_VALUE;
        do {
            try{
                int num = leerNumeroEntero(scanner);
                if (num>max){
                    max=num;
                }
                i++;
            }catch (InputMismatchException e){
                System.out.println("Error introduce un número");
                scanner.next();
            }
        }while (i<NUM_LEIDOS);
        System.out.println(max);
    }
    private static int leerNumeroEntero (Scanner scanner){
        System.out.println("Introduce un número");
        return  scanner.nextInt();
    }
}