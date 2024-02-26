import java.util.*;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el precio de su compra: $");
        double compra = entrada.nextDouble();
        double descuento;
        double totalpagar;

        if(compra > 1000){
            descuento = compra * 0.10;
            totalpagar = compra - descuento;
            System.out.println("El descuento es: $"+ descuento + " y el total a pagar es: $" + totalpagar);
        }else if(compra > 500 && compra <= 1000){
            descuento = compra * 0.20;
            totalpagar = compra - descuento;
            System.out.println("El descuento es: $"+ descuento + " y el total a pagar es: $" + totalpagar);
        }else if(compra <= 500){
            descuento = 0;
            totalpagar = compra - descuento;
            System.out.println("El descuento es: $"+ descuento + " y el total a pagar es: $" + totalpagar);
        }
    }
}
