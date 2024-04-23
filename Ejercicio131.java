import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar la tarifa por hora y las horas trabajadas al usuario
        System.out.println("Ingrese la tarifa por hora:");
        double tarifaHora = leer.nextDouble();
        System.out.println("Ingrese las horas trabajadas:");
        int horasTrabajadas = leer.nextInt();

        // Calcular el salario
        double salario;
        if (horasTrabajadas > 40) {
            salario = 40 * tarifaHora + (horasTrabajadas - 40) * tarifaHora * 2;
        } else {
            salario = horasTrabajadas * tarifaHora;
        }

        // Mostrar el salario
        System.out.println("El salario del trabajador es: $" + salario);

        leer.close();
    }
}
