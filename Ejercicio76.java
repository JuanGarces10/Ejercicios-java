import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        int numero = leer.nextInt();
        leer.close();

        int cifras = 0;
        int numeroAbsoluto = Math.abs(numero); // Tomamos el valor absoluto para manejar números negativos

        if (numeroAbsoluto == 0) {
            cifras = 1; // Si el número es 0, tiene una cifra
        } else {
            while (numeroAbsoluto != 0) {
                numeroAbsoluto /= 10;
                cifras++;
            }
        }

        System.out.println("El número de cifras es: " + cifras);
    }
}
