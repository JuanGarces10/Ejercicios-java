import java.util.Scanner;

public class Ejercicio246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        int sumaSerie = 0;

        for (int i = 1; i <= n; i++) {
            sumaSerie += i * (i + 1);
        }

        System.out.println("La suma de la serie es: " + sumaSerie);

        scanner.close();
    }
}
