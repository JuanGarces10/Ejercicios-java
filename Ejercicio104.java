import java.util.Scanner;

public class Ejercicio104 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el número y el índice de la raíz
        System.out.println("Ingrese el número:");
        double numero = leer.nextDouble();
        System.out.println("Ingrese el índice de la raíz:");
        double indice = leer.nextDouble();

        // Calcular la raíz
        double raiz = Math.pow(numero, 1.0 / indice);

        // Mostrar la raíz
        System.out.println("La raíz " + indice + " de " + numero + " es: " + raiz);

        leer.close();
    }
}
