import java.util.Scanner;

public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar la edad
        System.out.println("Ingrese su edad:");
        int edad = leer.nextInt();

        // Mostrar la edad ingresada
        System.out.println("La edad ingresada es: " + edad);

        leer.close();
    }
}
