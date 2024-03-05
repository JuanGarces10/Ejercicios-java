import java.util.*;
public class Ejercicio41 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite su edad: ");
       int edad = entrada.nextInt();

       double m = 0.5;
       double a = m * 12;
       double r = a * edad;
       double metros = r / 100;

       System.out.println("El largo del cabello seria: " + metros + "m");

    }
}
