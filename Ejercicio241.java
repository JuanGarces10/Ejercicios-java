
import java.util.Scanner;

public class Ejercicio241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo:");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor:");
        int divisor = scanner.nextInt();

        int resultado = DivisionPorRestas.divisionPorRestas(dividendo, divisor);
        System.out.println("El resultado de la división es: " + resultado);

        scanner.close();
    }
}
