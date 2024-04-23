import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la primera variable: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de la segunda variable: ");
        int b = scanner.nextInt();

        System.out.println("Valores originales:");
        System.out.println("Variable a: " + a);
        System.out.println("Variable b: " + b);

        // Intercambio de valores
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores intercambiados:");
        System.out.println("Variable a: " + a);
        System.out.println("Variable b: " + b);

        scanner.close();
    }
}
