import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero de cuatro digitos: ");
        int n = entrada.nextInt();  

        int d1 = n / 1000;
        int d2 = (n % 1000) / 100;
        int d3 = (n % 100) / 10;
        int d4 = (n % 10);

        int suma = d1 + d2 + d3 + d4;

        System.out.println("La suma de los digitos del numero es: " + suma);
    }
    
}