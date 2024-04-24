import java.util.Scanner;

public class Ejercicio244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número positivo menor que 20 para verificar si es primo:");
        int numero = scanner.nextInt();

        while (numero <= 0 || numero >= 20) {
            System.out.println("El número debe ser positivo y menor que 20. Ingrese nuevamente:");
            numero = scanner.nextInt();
        }

        boolean esPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {

            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}
