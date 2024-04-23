import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario el número base y el exponente
        System.out.println("Ingrese un número:");
        double base = leer.nextDouble();
        System.out.println("Ingrese el exponente:");
        int exponente = leer.nextInt();

        // Calcular la potencia
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        // Mostrar el resultado
        System.out.println(base + " elevado a la potencia " + exponente + " es: " + resultado);

        leer.close();
    }
}
