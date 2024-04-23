import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        // Pedir al usuario 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = leer.nextInt();
            suma += numero;
        }

        // Mostrar la suma total de los números
        System.out.println("La suma total de los números es: " + suma);

        leer.close();
    }
}
