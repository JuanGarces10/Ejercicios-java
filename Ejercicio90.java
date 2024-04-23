import java.util.Scanner;

public class Ejercicio90 {
    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para contar la cantidad de números primos en un arreglo unidimensional (vector)
    public static int contarPrimosEnVector(int[] vector) {
        int contador = 0;
        for (int num : vector) {
            if (esPrimo(num)) {
                contador++;
            }
        }
        return contador;
    }

    // Función para contar la cantidad de números primos en una matriz
    public static int contarPrimosEnMatriz(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (esPrimo(num)) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar los elementos de la matriz
        System.out.println("Ingrese el número de filas de la matriz:");
        int filas = leer.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz:");
        int columnas = leer.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }

        // Solicitar al usuario ingresar los elementos del vector
        System.out.println("Ingrese el tamaño del vector:");
        int tamanoVector = leer.nextInt();
        int[] vector = new int[tamanoVector];
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < tamanoVector; i++) {
            vector[i] = leer.nextInt();
        }

        // Contar la cantidad de números primos en la matriz y el vector
        int cantidadPrimosMatriz = contarPrimosEnMatriz(matriz);
        int cantidadPrimosVector = contarPrimosEnVector(vector);

        // Mostrar el resultado
        System.out.println("La cantidad de números primos en la matriz es: " + cantidadPrimosMatriz);
        System.out.println("La cantidad de números primos en el vector es: " + cantidadPrimosVector);

        leer.close();
    }
}
