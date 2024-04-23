import java.util.Scanner;

public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] denominaciones = {1000, 500, 300, 200, 100};
        double[] cantidades = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la cantidad a pagar para el artículo " + (i + 1) + ": $");
            double monto = scanner.nextDouble();
            cantidades[i] = monto;
        }
        
        System.out.print("Ingrese el pago del cliente: $");
        double pagoCliente = scanner.nextDouble();
        
        double totalVenta = 0;
        for (int i = 0; i < 5; i++) {
            totalVenta += cantidades[i];
        }
        
        double cambio = pagoCliente - totalVenta;
        
        if (cambio < 0) {
            System.out.println("El pago del cliente es insuficiente.");
        } else {
            System.out.println("El cambio a devolver es: $" + cambio);
            System.out.println("Denominaciones monetarias:");
            for (int i = 0; i < 5; i++) {
                int cantidadDenominacion = (int) (cambio / denominaciones[i]);
                if (cantidadDenominacion > 0) {
                    System.out.println("$" + denominaciones[i] + " : " + cantidadDenominacion);
                    cambio %= denominaciones[i];
                }
            }
        }
        
        scanner.close();
    }
}
