import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite el segundo numero: ");
        float n2 = entrada.nextFloat();
        System.out.println("Digite el tercer numero: ");
        float n3 = entrada.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.println("La media aritmetica de los tres numeros es: " + media);
    }
}

