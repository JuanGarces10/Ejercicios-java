import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 7, 10, 13, 15, 20, 23, 26, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};
        Arrays.sort(numeros);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int x = scanner.nextInt();
        scanner.close();
        int indice = busquedaBinaria(numeros, x);
        if (indice != -1) {
            System.out.println("El elemento " + x + " se encontró en el índice " + indice + ".");
        } else {
            System.out.println("El elemento " + x + " no se encontró en el arreglo.");
        }
    }

    public static int busquedaBinaria(int[] arr, int x) {
        int inicio = 0, fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == x) {
                return medio;
            }
            if (arr[medio] < x) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
