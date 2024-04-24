import java.util.Scanner;

public class Ejercicio148 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int cantidadNumeros = leer.nextInt();

        double suma = 0;
        double minimo = Double.POSITIVE_INFINITY;
        double maximo = Double.NEGATIVE_INFINITY;

        System.out.println("Ingrese los números:");

        for (int i = 0; i < cantidadNumeros; i++) {
            double numero = leer.nextDouble();
            suma += numero;
            minimo = Math.min(minimo, numero);
            maximo = Math.max(maximo, numero);
        }

        double promedio = suma / cantidadNumeros;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        leer.close();
    }
}

