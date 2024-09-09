package Juego;
import java.util.Scanner;

public class Juego {
    int user;
    static int computadora;
    Scanner input;

    public Juego(){
        input = new Scanner(System.in);
    }

    public void game(){
        System.out.print("tijera (0), piedra (1), papel (2): ");
        user = input.nextInt();

        computadora = (int) (Math.random() * 2) + 0;

        switch (computadora) {
            case 0:
                if (user == 0){
                    System.out.print("Empate");
                } else if(user == 1){
                    System.out.print("Ganaste");
                } else if(user == 2) {
                    System.out.print("Perdiste");
                }
                break;
            case 1:
                if (user == 1){
                    System.out.print("Empate");
                } else if(user == 2){
                    System.out.print("Ganaste");
                } else if(user == 0) {
                    System.out.print("Perdiste");
                }
                break;
            case 2:
                if (user == 2){
                    System.out.print("Empate");
                } else if(user == 0){
                    System.out.print("Ganaste");
                } else if(user == 1){
                    System.out.print("Perdiste");
                }
                break;
            default:
                System.out.print("Ingrese un numero correcto");
                break;
        }
    }
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.game();
    }
}
