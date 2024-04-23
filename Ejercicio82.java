import java.util.Scanner;

public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.println("Ingrese un número:");
        double numero = leer.nextDouble();

        // Verificar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es cero.");
        }

        leer.close();
    }
}
