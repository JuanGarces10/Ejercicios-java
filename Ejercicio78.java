import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Solicitar al usuario el monto
        System.out.println("Ingrese el monto:");
        double monto = leer.nextDouble();
        leer.close();
        
        // Calcular el descuento
        double descuento;
        if (monto > 10000) {
            descuento = monto * 0.20; // 20% de descuento
        } else {
            descuento = monto * 0.10; // 10% de descuento
        }
        
        // Mostrar el descuento
        System.out.println("El descuento es: " + descuento);
    }
}
