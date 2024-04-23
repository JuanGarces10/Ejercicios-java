import java.util.Scanner;

public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el año
        System.out.println("Ingrese el año (formato de 4 dígitos):");
        int año = leer.nextInt();

        // Determinar si el año es bisiesto
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

        leer.close();
    }
}
