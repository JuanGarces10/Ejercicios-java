import java.util.*;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el dividendo: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite el divisor: ");
        int n2 = entrada.nextInt();

        int resultado = n1 % n2;

        System.out.println("El resto de esta division es: " + resultado);
    }
}
