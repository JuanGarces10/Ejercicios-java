import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre en MAYÚSCULAS: ");
        String nombre = scanner.nextLine();

        if (nombre.startsWith("A")) {
            nombre = nombre.toLowerCase();
            System.out.println("Nombre convertido a minúsculas: " + nombre);
        } else {
            System.out.println("Nombre no convertido a minúsculas.");
        }

        scanner.close();
    }
}
