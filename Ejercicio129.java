import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario el número de mes y el año
        System.out.println("Ingrese el número de mes (1-12):");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int año = leer.nextInt();

        // Determinar el número de días del mes
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = diasPorMes[mes - 1];

        // Si el mes es febrero y el año es bisiesto, se ajusta el número de días
        if (mes == 2 && ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))) {
            dias = 29;
        }

        // Mostrar el número de días
        System.out.println("El número de días del mes " + mes + " del año " + año + " es: " + dias);

        leer.close();
    }
}
