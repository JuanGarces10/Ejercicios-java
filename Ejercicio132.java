import java.util.Scanner;

public class Ejercicio132 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double saldo = 1000;

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar:");
                    double deposito = leer.nextDouble();
                    saldo += deposito;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar:");
                    double retiro = leer.nextDouble();
                    saldo -= retiro;
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);

        // Mostrar el saldo final
        System.out.println("El saldo final es: $" + saldo);

        leer.close();
    }
}
