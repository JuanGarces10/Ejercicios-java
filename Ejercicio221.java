import java.util.Scanner;

class Ejercicio221 {
    public static void main(String[] args) {
        // Ejercicio 221
        Scanner scanner = new Scanner(System.in);
        String claveCorrecta = "eureka";
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("Introduce la clave:");
            String clave = scanner.nextLine();

            if (clave.equals(claveCorrecta)) {
                System.out.println("¡Clave correcta!");
                break;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("Clave incorrecta. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Has agotado los 3 intentos.");
                }
            }
        }
    }
}