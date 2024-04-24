import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en Bolivianos: ");
        double bolivianos = scanner.nextDouble();

        System.out.print("Ingrese el tipo de cambio (1 $us. = X Bs.): ");
        double tipoCambio = scanner.nextDouble();

        double dolares = bolivianos / tipoCambio;

        System.out.println("El equivalente en Dólares es: " + dolares + " $us.");

        scanner.close();
    }
}
