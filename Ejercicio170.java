import java.util.Scanner;

public class Ejercicio170 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la primera fracción:");
        System.out.print("Numerador: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador1 = scanner.nextInt();
        
        System.out.println("Ingrese la segunda fracción (mismo denominador):");
        System.out.print("Numerador: ");
        int numerador2 = scanner.nextInt();
        // El denominador se asume igual al de la primera fracción
        int denominador2 = denominador1;
        
        int sumaNumeradores = numerador1 + numerador2;
        int restaNumeradores = numerador1 - numerador2;
        int denominadorComun = denominador1;
        
        System.out.println("La suma de las fracciones es: " + sumaNumeradores + "/" + denominadorComun);
        System.out.println("La resta de las fracciones es: " + restaNumeradores + "/" + denominadorComun);
        
        scanner.close();
    }
}
