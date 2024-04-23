import java.util.Scanner;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalFactura = 0;
        int cantidadTotalProductos = 0;
        
        while (true) {
            System.out.print("Introduzca la cantidad vendida (0 para terminar): ");
            int cantidad = scanner.nextInt();
            
            if (cantidad == 0) {
                break;
            }
            
            System.out.print("Introduzca el precio: ");
            double precio = scanner.nextDouble();
            
            double totalProducto = cantidad * precio;
            totalFactura += totalProducto;
            cantidadTotalProductos += cantidad;
            
            System.out.println("Total del producto: " + totalProducto);
        }
        
        System.out.println("Cantidad total de productos: " + cantidadTotalProductos);
        System.out.println("Total de la factura: " + totalFactura);
        
        scanner.close();
    }
}
