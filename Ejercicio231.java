import java.util.Scanner;

public class Ejercicio231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = scanner.nextInt();
            if (numero > 0) {
                System.out.println("Número positivo: " + numero);
                suma += numero;
            }
        }

        System.out.println("La suma de los números positivos es: " + suma);
        scanner.close();
    }
}
