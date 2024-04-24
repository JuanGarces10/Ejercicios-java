import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor en dólares: ");
        double dolares = scanner.nextDouble();

        double bolivianos = dolares * 8.08;

        System.out.println("El equivalente en Bolivianos es: " + bolivianos + " Bs.");

        scanner.close();
    }
}
