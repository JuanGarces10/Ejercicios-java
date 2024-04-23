import java.util.Scanner;

public class Ejercicio137 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario los valores de a, b y c
        System.out.println("Ingrese el valor de a:");
        double a = leer.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b = leer.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c = leer.nextDouble();

        // Calcular el resultado de x
        double x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        // Mostrar el resultado
        System.out.println("El valor de x es: " + x);

        leer.close();
    }
}
