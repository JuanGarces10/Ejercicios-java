import java.util.*;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la base del rectangulo: ");
        double b = entrada.nextDouble();
        System.out.println("Digite la altura del rectangulo: ");
        double a = entrada.nextDouble();

        double area = b * a;

        System.out.println("El área del rectangulo es: " + area);

    }
    
}
