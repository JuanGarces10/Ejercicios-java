import java.util.Scanner;

public class Ejercicio236 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero, segundoNumero;

        do {
            System.out.println("Ingrese el primer número:");
            primerNumero = scanner.nextInt();
            System.out.println("Ingrese el segundo número:");
            segundoNumero = scanner.nextInt();

            if (primerNumero >= segundoNumero) {
                System.out.println("El segundo número debe ser mayor que el primero.");
            }
        } while (primerNumero >= segundoNumero);

        System.out.println("Números pares entre " + primerNumero + " y " + segundoNumero + ":");

        for (int i = primerNumero; i <= segundoNumero; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
