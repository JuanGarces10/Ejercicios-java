import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar la distancia en metros
        System.out.println("Ingrese la distancia en metros:");
        double distanciaMetros = leer.nextDouble();

        // Convertir la distancia de metros a kilómetros
        double distanciaKilometros = distanciaMetros / 1000;

        // Mostrar la distancia en kilómetros
        System.out.println("La distancia en kilómetros es: " + distanciaKilometros + " km");

        leer.close();
    }
}
