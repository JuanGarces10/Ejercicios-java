import java.util.Scanner;

public class Ejercicio239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.println("Ingrese un número (o 999 para finalizar):");
            numero = scanner.nextInt();
            if (numero != 999) {
                suma += numero;
            }
        } while (numero != 999);

        System.out.println("La suma de los números ingresados es: " + suma);
        scanner.close();
    }
}
