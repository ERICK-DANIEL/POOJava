package SistemaPeaje;

public class Moto extends Vehiculo {
    static int valorPeaje = 5000;

    Moto(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Valor del peaje = " + valorPeaje);
    }

}
