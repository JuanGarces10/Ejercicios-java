import java.util.Scanner;

public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar tres voltajes distintos
        System.out.println("Ingrese tres voltajes distintos:");
        double voltaje1 = leer.nextDouble();
        double voltaje2 = leer.nextDouble();
        double voltaje3 = leer.nextDouble();

        // Calcular el promedio de los tres voltajes
        double promedio = (voltaje1 + voltaje2 + voltaje3) / 3;

        // Mostrar el promedio
        System.out.println("El promedio de los voltajes es: " + promedio);

        // Determinar el mensaje a mostrar según el valor del promedio
        if (promedio < 115) {
            System.out.println("VOLTAJE CORRECTO");
        } else if (promedio >= 115 && promedio < 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("PELIGRO");
        }

        leer.close();
    }
}
