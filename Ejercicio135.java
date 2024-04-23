import java.util.Scanner;

public class Ejercicio135 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario la cantidad de números a ingresar
        System.out.println("Ingrese la cantidad de números:");
        int cantidadNumeros = leer.nextInt();

        // Pedir al usuario los números
        System.out.println("Ingrese los números:");
        int numero = leer.nextInt();
        int mayor = numero;
        int menor = numero;

        // Iterar para obtener el mayor y el menor
        for (int i = 1; i < cantidadNumeros; i++) {
            numero = leer.nextInt();
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        leer.close();
    }
}
