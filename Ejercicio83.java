import java.util.Scanner;

public class Ejercicio83 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar tres números
        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = leer.nextDouble();

        // Calcular el promedio de los tres números
        double promedio = (numero1 + numero2 + numero3) / 3;

        // Mostrar el promedio
        System.out.println("El promedio es: " + promedio);

        // Verificar si el promedio es mayor a 7 y mostrar el resultado correspondiente
        if (promedio > 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("MEJORE LA NOTA");
        }

        leer.close();
    }
}
