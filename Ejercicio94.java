import java.util.Scanner;

public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un número entero
        System.out.println("Ingrese un número entero:");
        int numero = leer.nextInt();

        // Calcular el valor absoluto del número
        int valorAbsoluto = Math.abs(numero);

        // Mostrar el valor absoluto del número
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

        leer.close();
    }
}
