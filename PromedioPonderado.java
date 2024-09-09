package PromedioPonderado;

import java.util.Scanner;

public class PromedioPonderado {
    Scanner input;
    float promedio;
    int experiencias;
    int totalCreditos = 0;
    int suma = 0;

    public PromedioPonderado() {
        input = new Scanner(System.in);
    }

    public void escaner() {
        System.out.print("Cuantas experiencias educativas tienes: ");
        experiencias = input.nextInt();

        int [] Creditos = new int[experiencias];
        int [] Calificaciones = new int[experiencias];

        for(int i = 0;  i < experiencias; i++) {
            System.out.printf("Ingrese los creditos de la experiencia %d: ", i + 1);
            Creditos[i] = input.nextInt();

            System.out.printf("Ingrese la calificacion de la experiencia %d: ", i + 1);
            Calificaciones[i] = input.nextInt();
        }

        System.out.printf("El promedio ponderado es: %.2f", promedio(Creditos, Calificaciones));
    }

    public float promedio(int[] Creditos, int[] Calificaciones) {
        for (int i = 0;  i < Creditos.length; i++) {
            suma += Creditos[i] * Calificaciones[i];
            totalCreditos += Creditos[i];
        }

        promedio = (float) suma / totalCreditos;

        return promedio;
    }

    public static void main(String[] args) {
        PromedioPonderado promedioponderado = new PromedioPonderado();
        promedioponderado.escaner();
    }
}
