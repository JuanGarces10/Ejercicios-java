import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {
        String frase = "Hola que tal";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        String mensajeCompleto = frase + " (" + nombre + ")";
        System.out.println("Mensaje completo: " + mensajeCompleto);

        scanner.close();
    }
}
