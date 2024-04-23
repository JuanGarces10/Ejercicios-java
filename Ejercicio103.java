import java.util.Scanner;

public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar tres números distintos
        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();
        System.out.println("Ingrese el tercer número:");
        double numero3 = leer.nextDouble();

        // Determinar cuál es el número menor
        double menor = Math.min(Math.min(numero1, numero2), numero3);

        // Mostrar el número menor
        System.out.println("El número menor ingresado es: " + menor);

        leer.close();
    }
}
