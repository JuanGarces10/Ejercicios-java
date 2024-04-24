import java.util.Scanner;

public class Ejercicio233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el valor de N:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = scanner.nextInt();

            int numeroPositivo = Math.abs(numero);
            System.out.println("Número positivo equivalente: " + numeroPositivo);
        }

        scanner.close();
    }
}
