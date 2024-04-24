import java.util.Scanner;

class Ejercicio226 {
    public static void main(String[] args) {
        // Ejercicio 226
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura:");
        int altura = scanner.nextInt();

        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}