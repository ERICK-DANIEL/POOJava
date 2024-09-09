package Arcoiris;

public class Arcoiris {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 7);

        switch (numero) {
            case 1:
                System.out.println("violeta");
                break;
            case 2:
                System.out.println("añil");
                break;
            case 3:
                System.out.println("azul");
                break;
            case 4:
                System.out.println("verde");
                break;
            case 5:
                System.out.println("amarillo");
                break;
            case 6:
                System.out.println("naranja");
                break;
            case 7:
                System.out.println("rojo");
                break;
        }
    }
}
