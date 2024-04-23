import java.util.Scanner;

public class Ejercicio139 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario el número para calcular su factorial
        System.out.println("Ingrese un número para calcular su factorial:");
        int numero = leer.nextInt();

        // Calcular el factorial
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        leer.close();
    }
}
