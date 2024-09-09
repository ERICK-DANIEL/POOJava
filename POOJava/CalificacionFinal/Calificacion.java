package CalificacionFinal;

public class Calificacion {

    public static String printFinalGrade(int calificacion) {
        if (calificacion < 6){
            return "Mal";
        } else if (calificacion >= 6 && calificacion < 8){
            return "regular";
        } else if(calificacion >= 8 && calificacion < 9) {
            return "bien";
        } else if (calificacion >= 9){
            return "Excelente";
        }
        return printFinalGrade(calificacion);
    }
    public static void main(String[] args) {
        System.out.print(printFinalGrade(9));
    }
}
