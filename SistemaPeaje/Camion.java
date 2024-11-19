package SistemaPeaje;

public class Camion extends Vehiculo {
    static int valorPeajeEje = 5000;
    int numeroEjes;

    Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeajeEje() {
        return valorPeajeEje;
    }
    
    void imprimir() {
        System.out.println("Placa = " + placa);
        System.out.println("Numero de ejes = " + numeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}

