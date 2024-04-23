import java.util.Scanner;

public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero como cadena: ");
        String cadenaEntero = scanner.nextLine();
        System.out.print("Ingrese un número real como cadena: ");
        String cadenaReal = scanner.nextLine();

        int entero = Integer.parseInt(cadenaEntero);
        double real = Double.parseDouble(cadenaReal);

        double suma = entero + real;
        System.out.println("La suma de los números es: " + suma);

        scanner.close();
    }
}
