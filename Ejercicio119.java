import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "passwd";
        int intentos = 0;

        // Pedir la contraseña al usuario hasta que sea correcta o se excedan los intentos
        while (intentos < 3) {
            System.out.println("Ingrese la contraseña:");
            String contrasena = leer.next();
            if (contrasena.equals(CONTRASENA_CORRECTA)) {
                System.out.println("Contraseña aceptada.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
                intentos++;
            }
        }

        // Mostrar mensaje si se exceden los intentos
        if (intentos >= 3) {
            System.out.println("Intentos excedidos.");
        }

        leer.close();
    }
}
