import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double total = 0;

        // Pedir los montos de 10 artículos
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el monto del artículo " + i + ":");
            double monto = leer.nextDouble();
            total += monto;
        }

        // Mostrar el monto total a pagar
        System.out.println("El monto total a pagar es: " + total);

        leer.close();
    }
}
