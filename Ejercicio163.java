import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int b = scanner.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int residuo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Residuo: " + residuo);

        scanner.close();
    }
}
