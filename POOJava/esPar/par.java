package esPar;
import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingresa un numero: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                System.out.print("El numero es par");
            } else {
                System.out.print("El numero es impar");
            } 
        }
    }
}