import java.util.Scanner;

public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar las horas trabajadas y la tarifa por hora
        System.out.println("Ingrese las horas trabajadas:");
        double horasTrabajadas = leer.nextDouble();
        System.out.println("Ingrese la tarifa por hora:");
        double tarifaPorHora = leer.nextDouble();

        // Calcular el salario del trabajador
        double salario;
        if (horasTrabajadas > 40) {
            double horasExtras = horasTrabajadas - 40;
            salario = (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 1.25);
        } else {
            salario = horasTrabajadas * tarifaPorHora;
        }

        // Mostrar el salario del trabajador
        System.out.println("El salario del trabajador es: $" + salario);

        leer.close();
    }
}
