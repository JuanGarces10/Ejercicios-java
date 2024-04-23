import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el monto de la venta
        System.out.println("Ingrese el monto de la venta:");
        double montoVenta = leer.nextDouble();

        // Aplicar el descuento si el monto de la venta es mayor a 1000 pesos
        if (montoVenta > 1000) {
            double descuento = montoVenta * 0.10;
            double montoNeto = montoVenta - descuento;
            System.out.println("El monto neto de la venta con el descuento aplicado es: $" + montoNeto);
        } else {
            System.out.println("El monto de la venta no supera los 1000 pesos. No se aplica descuento.");
        }

        leer.close();
    }
}
