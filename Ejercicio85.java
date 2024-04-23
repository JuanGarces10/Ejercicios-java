import java.util.Scanner;

public class Ejercicio85 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.println("Ingrese un número:");
        int numero = leer.nextInt();

        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }

        leer.close();
    }
}
