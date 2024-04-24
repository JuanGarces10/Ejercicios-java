import java.util.Scanner;

public class Ejercicio247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para calcular su cuadrado:");
        int n = scanner.nextInt();

        int cuadrado = 0;

        for (int i = 1; i <= n; i++) {
            cuadrado += (2 * i - 1); // Sumar los n primeros números impares
        }

        System.out.println("El cuadrado de " + n + " es: " + cuadrado);

        scanner.close();
    }
}
