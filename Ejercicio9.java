import java.util.*;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el precio de un producto: ");
        float producto = entrada.nextFloat();

        float iva = (float) (producto * 0.19);

        System.out.println("El IVA del producto es: $ " + iva);
    }
}