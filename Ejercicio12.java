import java.util.*;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float n2 = entrada.nextFloat();
        System.out.println("Digite el tercer numero: ");
        float n3 = entrada.nextFloat();

        float promedio = (float) ((n1 + n2 + n3) / 3);
        float suma = (float) (n1 + n2 + n3);
        float doble = (float) (n1 * 2);
        float triple = (float) (n2 * 3);
        float cuadrado = (float) (Math.pow(n3,2));

        System.out.println("El promedio de los tres numeros es: " + promedio);
        System.out.println("La suma de los tres numeros es: " + suma);
        System.out.println("El doble del primer numero es: " + doble);
        System.out.println("El triple del segundo numero es: " + triple);
        System.out.println("El cuadrado del tercer numero es: " + cuadrado);
    }
}
