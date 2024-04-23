import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio197 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("estado_cuenta.txt"));
            String line;
            System.out.println("Estado de cuenta:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
