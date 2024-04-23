import java.util.Random;
import java.util.Scanner;

public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Piensa en un número entre 1 y 100. Intenta adivinarlo.");

        int intento;
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroAleatorio);

        System.out.println("¡Correcto! Has adivinado el número en " + intentos + " intentos.");
        scanner.close();
    }
}
