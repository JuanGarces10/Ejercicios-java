import java.util.Scanner;

public class Ejercicio234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        boolean esCapicua = esCapicua(numero);

        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();
    }

    public static boolean esCapicua(int numero) {
        int numeroInvertido = 0;
        int original = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return original == numeroInvertido;
    }
}
