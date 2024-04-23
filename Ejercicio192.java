import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto de hasta 255 caracteres:");
        String texto = scanner.nextLine();
        scanner.close();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("texto.txt"));
            writer.write(texto);
            writer.close();
            System.out.println("Texto guardado en el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
