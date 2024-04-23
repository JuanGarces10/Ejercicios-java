import java.util.Scanner;

public class Ejercicio134 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir tres números al usuario
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número:");
        int num3 = leer.nextInt();

        // Validar que los tres números no sean iguales
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Por favor, ingrese tres números distintos.");
        } else {
            // Determinar el mayor y el menor
            int mayor = Math.max(num1, Math.max(num2, num3));
            int menor = Math.min(num1, Math.min(num2, num3));

            // Mostrar el resultado
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        }

        leer.close();
    }
}
