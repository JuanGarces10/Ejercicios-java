import java.util.Scanner;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir dos números al usuario
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();

        // Determinar el mayor y el menor
        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        leer.close();
    }
}
