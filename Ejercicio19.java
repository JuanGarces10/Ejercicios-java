import java.util.*;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su sueldo: ");
        float sueldo = entrada.nextFloat();
        System.out.println("Digite el total ganado por horas extras: ");
        float he = entrada.nextFloat();

        float descuento = (float) ((sueldo + he) * 0.20);
        float sueldot = sueldo + he;
        float totalp = sueldot - descuento;

        System.out.println("El sueldo basico es: $" + sueldo);
        System.out.println("El descuento es: $" + descuento);
        System.out.println("El sueldo total: $" + totalp);    
    }
}
