import java.util.Scanner;

public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = leer.nextInt();

        // Calcular la suma
        int suma = numero1 + numero2;

        // Verificar si la suma es par o impar
        if (suma % 2 == 0) {
            System.out.println("La suma de los dos números es par.");
        } else {
            System.out.println("La suma de los dos números es impar.");
        }

        leer.close();
    }
}
