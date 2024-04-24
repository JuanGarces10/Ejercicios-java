import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, positivos = 0, negativos = 0, neutros = 0;

        System.out.println("Ingrese el valor de N:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ":");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                neutros++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números neutros: " + neutros);

        scanner.close();
    }
}
