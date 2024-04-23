import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario el capital, el interés anual y el número de años
        System.out.println("Ingrese el capital del préstamo:");
        double capital = leer.nextDouble();
        System.out.println("Ingrese el interés anual:");
        double interesAnual = leer.nextDouble();
        System.out.println("Ingrese el número de años:");
        int años = leer.nextInt();
        leer.close();

        // Convertir el interés anual a interés mensual y el número de años a meses
        double interesMensual = interesAnual / 12 / 100;
        int meses = años * 12;

        // Calcular la cuota mensual utilizando la fórmula dada
        double cuota = capital * (interesMensual * Math.pow(1 + interesMensual, meses)) / (Math.pow(1 + interesMensual, meses) - 1);

        // Calcular el total a pagar
        double totalAPagar = cuota * meses;

        // Mostrar los resultados
        System.out.printf("El pago mensual es: %.2f%n", cuota);
        System.out.printf("El total a pagar es: %.2f%n", totalAPagar);
    }
}
