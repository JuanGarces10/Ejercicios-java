import java.util.Scanner;

class Ejercicio230 {
    public static void main(String[] args) {
        // Ejercicio 230
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.println("Ingrese el primer número (mayor que cero):");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número (mayor que cero y menor que el primero):");
            num2 = scanner.nextInt();

            if (num1 <= 0 || num2 <= 0 || num2 >= num1) {
                System.out.println("Los números deben ser positivos y el segundo menor que el primero.");
            } else {
                double division = (double) num1 / num2;
                System.out.println("El resultado de la división es: " + division);
            }
        } while (num1 <= 0 || num2 <= 0 || num2 >= num1);

        scanner.close();
    }
}