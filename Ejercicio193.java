import java.util.Scanner;

public class Ejercicio193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 255: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num < 1 || num > 255) {
            System.out.println("El número debe estar entre 1 y 255.");
            return;
        }
        System.out.println("El número en binario es: " + Integer.toBinaryString(num));
    }
}
