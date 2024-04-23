import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;

        // Leer números hasta que se ingrese un cero
        int numero;
        do {
            System.out.println("Ingrese un número (0 para finalizar):");
            numero = leer.nextInt();
            suma += numero;
        } while (numero != 0);

        // Mostrar la suma total de los números
        System.out.println("La suma total de los números es: " + suma);

        leer.close();
    }
}
