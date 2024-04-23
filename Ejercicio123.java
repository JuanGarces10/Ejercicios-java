import java.util.Scanner;

public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el capital, el interés y los días
        System.out.println("Ingrese el capital:");
        double capital = leer.nextDouble();
        System.out.println("Ingrese el interés (en porcentaje):");
        double interes = leer.nextDouble();
        System.out.println("Ingrese la cantidad de días:");
        int dias = leer.nextInt();

        // Calcular el capital final
        double capitalFinal = capital * (1 + (interes / 100) * dias);

        // Mostrar el capital final
        System.out.println("El capital final es: " + capitalFinal);

        leer.close();
    }
}
