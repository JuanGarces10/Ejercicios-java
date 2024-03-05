import java.util.*;
public class Ejercicio47 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la cantidad comprada: ");
        double cantidadc = entrada.nextDouble();
        System.out.println("Digite el precio: ");
        double precio = entrada.nextDouble();
        System.out.println("Digite el total pagado: ");
        double totalp = entrada.nextDouble();
        double descuento = Porcentajed(cantidadc, precio,totalp);

        System.out.println("El porcentaje descontado sera " + descuento + " %.");
    }
    
    public static double Porcentajed(double cantidadc, double precio, double totalp){
        double descuento = precio - totalp;
        double pdescuento = (descuento / precio) * 100;
        return pdescuento;
    }
}
