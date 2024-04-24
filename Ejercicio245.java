import java.util.Scanner;

public class Ejercicio245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int sumaCuadrados = 0;

        for (int i = 1; i <= n; i++) {
            sumaCuadrados += i * i;
        }

        System.out.println("La suma de los cuadrados de los " + n + " primeros números naturales es: " + sumaCuadrados);

        scanner.close();
    }
}
