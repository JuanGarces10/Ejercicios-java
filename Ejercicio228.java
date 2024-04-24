import java.util.Scanner;

class Ejercicio228 {
    public static void main(String[] args) {
        // Ejercicio 228
        Scanner scanner = new Scanner(System.in);
        String codigoUsuario, contraseña;

        do {
            System.out.println("Ingrese el código de usuario:");
            codigoUsuario = scanner.nextLine();
            System.out.println("Ingrese la contraseña:");
            contraseña = scanner.nextLine();
        } while (!codigoUsuario.equals("1") || !contraseña.equals("1234"));

        System.out.println("Inicio de sesión exitoso.");

        scanner.close();
    }
}
