import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar cinco voltajes
        System.out.println("Ingrese cinco voltajes:");
        double voltaje1 = leer.nextDouble();
        double voltaje2 = leer.nextDouble();
        double voltaje3 = leer.nextDouble();
        double voltaje4 = leer.nextDouble();
        double voltaje5 = leer.nextDouble();

        // Calcular el promedio de los cinco voltajes
        double promedio = (voltaje1 + voltaje2 + voltaje3 + voltaje4 + voltaje5) / 5;

        // Mostrar el promedio
        System.out.println("El promedio de los voltajes es: " + promedio);

        // Verificar si el promedio es mayor a 220 y mostrar el resultado correspondiente
        if (promedio > 220) {
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("VOLTAJE CORRECTO");
        }

        leer.close();
    }
}
