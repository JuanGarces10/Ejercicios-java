import java.util.Scanner;

public class Ejercicio243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número positivo para verificar si es primo:");
        int numero = scanner.nextInt();

        while (numero <= 0) {
            System.out.println("El número debe ser positivo. Ingrese nuevamente:");
            numero = scanner.nextInt();
        }

        int contador = 2;
        boolean esPrimo = true;

        while (contador <= numero / 2) {

            if (numero % contador == 0) {
                esPrimo = false;
                break;
            }
            contador++;
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}
