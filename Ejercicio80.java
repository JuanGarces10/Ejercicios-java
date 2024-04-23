import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un dato entero
        System.out.println("Ingrese un dato entero:");
        int datoEntero = leer.nextInt();

        // Solicitar al usuario ingresar un dato real
        System.out.println("Ingrese un dato real:");
        double datoReal = leer.nextDouble();

        // Mostrar los datos ingresados
        System.out.println("El dato entero ingresado es: " + datoEntero);
        System.out.println("El dato real ingresado es: " + datoReal);

        leer.close();
    }
}
