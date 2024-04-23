import java.util.Scanner;

public class Ejercicio150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        System.out.print("Descomposición en factores primos de " + numero + ": ");

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i);
                numero /= i;
                if (numero != 1) {
                    System.out.print(" * ");
                }
            }
        }
        scanner.close();
    }
}
