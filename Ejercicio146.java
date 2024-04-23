import java.util.Scanner;

public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número límite para la serie Fibonacci: ");
        int limite = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Serie Fibonacci hasta " + limite + ": ");
        while (a <= limite) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        scanner.close();
    }
}
