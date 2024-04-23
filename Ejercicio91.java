import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el nombre
        System.out.println("Ingrese el nombre:");
        String nombre = leer.nextLine();

        // Solicitar al usuario ingresar el apellido
        System.out.println("Ingrese el apellido:");
        String apellido = leer.nextLine();

        // Solicitar al usuario ingresar la edad
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        leer.nextLine(); // Limpiar el buffer del salto de línea

        // Solicitar al usuario ingresar el número de celular
        System.out.println("Ingrese el número de celular:");
        String numeroCelular = leer.nextLine();

        // Mostrar los datos ingresados
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Número de celular: " + numeroCelular);

        leer.close();
    }
}
