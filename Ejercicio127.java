import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar la fecha al usuario (día, mes, año)
        System.out.println("Ingrese la fecha (día mes año):");
        int dia = leer.nextInt();
        int mes = leer.nextInt();

        // Determinar la estación del año
        String estacion;
        if (mes >= 3 && mes <= 5) {
            estacion = "primavera";
        } else if (mes >= 6 && mes <= 8) {
            estacion = "verano";
        } else if (mes >= 9 && mes <= 11) {
            estacion = "otoño";
        } else {
            estacion = "invierno";
        }

        // Mostrar la estación del año
        System.out.println("La fecha ingresada corresponde a la estación: " + estacion);

        leer.close();
    }
}
