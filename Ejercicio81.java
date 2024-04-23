import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el radio del círculo
        System.out.println("Ingrese el radio del círculo:");
        double radio = leer.nextDouble();

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el área del círculo
        System.out.println("El área del círculo es: " + area);

        // Verificar si el área es mayor a 5000 y mostrar "DATOS ERRÓNEOS" si es el caso
        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        }

        leer.close();
    }
}
