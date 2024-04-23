import java.util.Scanner;

public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar una frase
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();

        // Dividir la frase en palabras
        String[] palabras = frase.split(" ");

        // Mostrar cada palabra y el número de letras
        for (String palabra : palabras) {
            System.out.println(palabra);
            System.out.println("Número de letras: " + palabra.length());
        }

        leer.close();
    }
}
