import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar la fecha al usuario en formato AAAA MM DD
        System.out.println("Ingrese la fecha en formato AAAA MM DD:");
        int año = leer.nextInt();
        int mes = leer.nextInt();
        int dia = leer.nextInt();

        // Convertir el mes a texto
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String nombreMes = meses[mes - 1];

        // Mostrar la fecha en formato texto
        System.out.println(dia + " " + nombreMes + " de " + año);

        leer.close();
    }
}
