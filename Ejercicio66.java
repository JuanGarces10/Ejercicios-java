import java.util.*;
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el valor de n: ");
        int n = entrada.nextInt();

        int suma = SumaImpares(n);

        System.out.println("La suma de los numeros impares del 1 hasta " + (2*n -1) + " es: " + suma);
    }
    public static int SumaImpares(int n){
        return n * n;
    }
}
