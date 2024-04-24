import java.util.Scanner;

class Ejercicio229 {
    public static void main(String[] args) {
        // Ejercicio 229
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Ingrese el primer número par:");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número par:");
            num2 = scanner.nextInt();

            if (num1 % 2 != 0 || num2 % 2 != 0) {
                System.out.println("Ambos números deben ser pares.");
            } else {
                int suma = num1 + num2;
                System.out.println("La suma de los números es: " + suma);
            }
        } while (num1 != 0 || num2 != 0);

        scanner.close();
    }
}
