import java.util.*;
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Digite numeros enteros. Digite un numero en el rango (20-30] o 0 para terminar.");

        do {
            System.out.print("Ingrese un numero entero: ");
            numero = entrada.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        } while (numero != 0 && (numero <= 20 || numero > 30));

        System.out.println("La suma de los valores mayores a 0 introducidos es: " + suma);
    }
}
