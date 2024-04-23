import java.util.Scanner;

public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el tamaño de los vectores
        System.out.println("Ingrese el tamaño de los vectores:");
        int tamano = leer.nextInt();

        // Declarar los vectores
        int[] vector1 = new int[tamano];
        int[] vector2 = new int[tamano];

        // Solicitar al usuario ingresar los elementos del primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < tamano; i++) {
            vector1[i] = leer.nextInt();
        }

        // Solicitar al usuario ingresar los elementos del segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < tamano; i++) {
            vector2[i] = leer.nextInt();
        }

        // Calcular el producto escalar de los dos vectores
        int productoEscalar = 0;
        for (int i = 0; i < tamano; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        // Mostrar el resultado del producto escalar
        System.out.println("El producto escalar de los dos vectores es: " + productoEscalar);

        leer.close();
    }
}
