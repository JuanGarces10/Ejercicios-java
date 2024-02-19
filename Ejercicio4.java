import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el radio del círculo");
        double radio = entrada.nextDouble();

        double resultado = Math.PI * Math.pow(radio,2);

        System.out.println("El área del círculo es: " + resultado);
    }
}
