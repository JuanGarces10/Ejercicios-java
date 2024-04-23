import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Saludar al usuario
        System.out.println("Hola usuario!");

        // Preguntar al usuario si desea continuar
        char opcion;
        do {
            System.out.println("¿Desea que continúe imprimiendo el saludo? [S/N]:");
            opcion = leer.next().charAt(0);
        } while (opcion != 'N' && opcion != 'n');

        leer.close();
    }
}
