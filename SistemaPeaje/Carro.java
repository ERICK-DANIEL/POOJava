package SistemaPeaje;

public class Carro extends Vehiculo {
    static int valorPeaje = 10000;

    Carro(String placa) {
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
