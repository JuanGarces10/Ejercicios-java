import java.util.*;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite el tercer numero: ");
        int n3 = entrada.nextInt();

        int ud1 = n1 % 10;
        int ud2 = n2 % 10;
        int ud3 = n3 % 10;

        System.out.println("El ultimo digito del primer numero es: " + ud1);
        System.out.println("El ultimo digito del segundo numero es: " + ud2);
        System.out.println("El ultimo digito del tercer numero es: " + ud3);
    }
}
