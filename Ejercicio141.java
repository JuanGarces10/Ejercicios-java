import java.util.Scanner;

public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario un número para calcular su raíz cuadrada
        System.out.println("Ingrese un número para calcular su raíz cuadrada:");
        double numero = leer.nextDouble();

        // Calcular la raíz cuadrada usando el método de Newton
        double estimacion = numero / 2; // Estimación inicial
        double raizCuadrada = 0;
        while (true) {
            raizCuadrada = (estimacion + numero / estimacion) / 2;
            if (Math.abs(raizCuadrada - estimacion) < 0.0001) {
                break; // Salir del bucle si la diferencia es muy pequeña
            }
            estimacion = raizCuadrada;
        }

        // Mostrar el resultado
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        leer.close();
    }
}
