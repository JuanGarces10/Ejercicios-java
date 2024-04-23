import java.util.Scanner;

public class Ejercicio171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversión de unidades:");
        System.out.println("1 - Libras a kilogramos");
        System.out.println("2 - Millas a kilómetros");
        System.out.println("3 - Galones a litros");
        System.out.println("4 - Fahrenheit a Celsius");
        System.out.println("5 - Salir");
        
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de libras: ");
                double libras = scanner.nextDouble();
                double kilogramos = libras * 0.453592;
                System.out.println(libras + " libras equivalen a " + kilogramos + " kilogramos.");
                break;
            case 2:
                System.out.print("Ingrese la cantidad de millas: ");
                double millas = scanner.nextDouble();
                double kilometros = millas * 1.60934;
                System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
                break;
            case 3:
                System.out.print("Ingrese la cantidad de galones: ");
                double galones = scanner.nextDouble();
                double litros = galones * 3.78541;
                System.out.println(galones + " galones equivalen a " + litros + " litros.");
                break;
            case 4:
                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}
