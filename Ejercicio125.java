import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el número múltiplo
        System.out.println("Ingrese el número múltiplo:");
        int multiplo = leer.nextInt();

        // Mostrar todos los múltiplos del número ingresado en el rango del 1 al 3000
        for (int i = 1; i <= 3000; i++) {
            if (i % multiplo == 0) {
                System.out.println(i);
            }
        }

        leer.close();
    }
}
