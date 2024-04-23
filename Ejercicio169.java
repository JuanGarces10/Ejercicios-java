import java.util.Scanner;

public class Ejercicio169 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();
        
        int edad = 2024 - añoNacimiento;
        
        if (edad >= 1 && edad <= 12) {
            System.out.println("Usted está en la niñez.");
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Usted está en la adolescencia.");
        } else if (edad >= 19 && edad <= 30) {
            System.out.println("Usted está en la juventud.");
        } else if (edad >= 31 && edad <= 60) {
            System.out.println("Usted está en la adultez.");
        } else if (edad > 60 && edad <= 100) {
            System.out.println("Usted está en la vejez.");
        } else {
            System.out.println("Ingrese una edad válida entre 1 y 100 años.");
        }
        
        scanner.close();
    }
}
