import java.util.Scanner;

public class Ejercicio130 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario el monto total y el plazo en meses
        System.out.println("Ingrese el monto total:");
        double montoTotal = leer.nextDouble();
        System.out.println("Ingrese el plazo en meses (12 o 24):");
        int plazoMeses = leer.nextInt();

        // Calcular el monto a pagar por mes
        double interesMensual = 0.02; // 2% de interés mensual
        double montoPorMes = montoTotal * ((interesMensual * plazoMeses) + 1);

        // Mostrar el monto total a pagar y el monto por mes
        double montoTotalAPagar = montoPorMes * plazoMeses;
        System.out.println("El monto total a pagar es: " + montoTotalAPagar);
        System.out.println("El monto por mes es: " + montoPorMes);

        leer.close();
    }
}
