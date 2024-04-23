import java.util.Scanner;

public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un año
        System.out.println("Ingrese un año:");
        int año = leer.nextInt();

        // Verificar si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año ingresado es bisiesto.");
        } else {
            System.out.println("El año ingresado no es bisiesto.");
        }

        leer.close();
    }
}
