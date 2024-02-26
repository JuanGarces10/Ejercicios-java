import java.util.*;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero para calcular su cubo: ");
        float n = entrada.nextFloat();

        float c = (float) (Math.pow(n, 3));

        System.out.println("El cubo de " + n + " es: " + c);
    }
}
