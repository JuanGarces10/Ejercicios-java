import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        double numPulsaciones = (220 - edad) / 10.0;

        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + numPulsaciones);

        scanner.close();
    }
}
