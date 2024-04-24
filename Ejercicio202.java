import java.util.Scanner;

public class Ejercicio202 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        int edad = 2024 - anioNacimiento;

        System.out.println("La edad de la persona es: " + edad + " años.");

        scanner.close();
    }
}
