package Calculadora;
import java.util.Scanner;

public class Calculadora {
    Scanner teclado;
    int operador;
    float a;
    float b;
    float resultado;

    public Calculadora() {
        teclado = new Scanner(System.in);
    }

    public void loop() {
        do {
            mostrarMenu();

            operador = teclado.nextInt();

            if (operador != 0) {
                escanearNumeros(a, b);

                switch (operador) {
                    case 1:
                        resultado = sumar(a, b);
                        mostrarMensaje(resultado);
                        break;
                    case 2:
                        resultado = restar(a, b);
                        mostrarMensaje(resultado);
                        break;
                    case 3:
                        resultado = multiplicar(a, b);
                        mostrarMensaje(resultado);
                        break;
                    case 4:
                        resultado = dividir(a, b);
                        mostrarMensaje(resultado); 
                        break;
                    default:
                        System.out.print("Introduzca un comando correcto");
                        break;
                }
            }
        }while(operador != 0);
    }

    public void mostrarMenu() {
        System.out.println("Operaciones que puede realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.print("Ingrese la operacion a realizar: ");
    }

    public void escanearNumeros(float a, float b) {
        System.out.print("Ingrese el primer numero: ");
        a = teclado.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        b = teclado.nextFloat();
    }

    public void mostrarMensaje(float resultado) {
        System.out.print("El resultado es: " + resultado);
    }

    public float sumar(float a, float b) {
        return a + b;
    }

    public float restar(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        try {
            return a / b;
        } catch (Exception e) {
            throw new IllegalArgumentException("No disponible la division entre 0");
        }
    }
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.loop();	
    }
}
