import java.util.Scanner;

public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar la longitud del lado del triángulo equilátero
        System.out.println("Ingrese la longitud del lado del triángulo equilátero:");
        double lado = leer.nextDouble();

        // Calcular el área del triángulo equilátero
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        // Mostrar el área del triángulo equilátero
        System.out.println("El área del triángulo equilátero es: " + area);

        // Verificar si el área es mayor a 1000 y mostrar "DATOS NO VÁLIDOS" si es el caso
        if (area > 1000) {
            System.out.println("DATOS NO VÁLIDOS");
        }

        leer.close();
    }
}
