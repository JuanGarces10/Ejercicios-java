import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario seleccionar un transporte
        System.out.println("Seleccione el medio de transporte (1=Motocicleta, 2=Automóvil, 3=Pickup):");
        int opcion = leer.nextInt();

        // Calcular el gasto total de gasolina según el transporte seleccionado
        double rendimiento, distancia = 500;
        switch (opcion) {
            case 1:
                rendimiento = 20; // km/lt
                break;
            case 2:
                rendimiento = 10; // km/lt
                break;
            case 3:
                rendimiento = 5; // km/lt
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }
        double gastoGasolina = distancia / rendimiento;

        // Mostrar el gasto total de gasolina
        System.out.println("El gasto total de gasolina es: " + gastoGasolina + " litros.");

        leer.close();
    }
}
