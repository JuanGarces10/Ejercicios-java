import java.util.Scanner;

public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario los tres lados del triángulo
        System.out.println("Ingrese el primer lado del triángulo:");
        double lado1 = leer.nextDouble();
        System.out.println("Ingrese el segundo lado del triángulo:");
        double lado2 = leer.nextDouble();
        System.out.println("Ingrese el tercer lado del triángulo:");
        double lado3 = leer.nextDouble();

        // Verificar si los lados forman un triángulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Determinar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados no forman un triángulo válido.");
        }

        leer.close();
    }
}
