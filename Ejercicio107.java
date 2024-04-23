import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar la edad
        int edad;
        do {
            System.out.println("Ingrese la edad (entre 1 y 100 años):");
            edad = leer.nextInt();
        } while (edad < 1 || edad > 100);

        // Determinar si la persona es mayor o menor de edad
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }

        leer.close();
    }
}
