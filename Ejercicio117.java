import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadNumeros = 0;

        // Leer números hasta que se ingrese 0
        int numero;
        do {
            System.out.println("Ingrese un número (0 para finalizar):");
            numero = leer.nextInt();
            if (numero != 0) {
                cantidadNumeros++;
            }
        } while (numero != 0);

        // Mostrar la cantidad de números leídos
        System.out.println("Se leyeron " + cantidadNumeros + " números.");

        leer.close();
    }
}
