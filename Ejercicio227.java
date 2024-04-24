import java.util.Scanner;

class Ejercicio227 {
    public static void main(String[] args) {
        // Ejercicio 227
        Scanner scanner = new Scanner(System.in);
        int unidadesBocadilloJamón, unidadesRefresco, unidadesCerveza;

        System.out.println("Ingrese el número de bocadillos de jamón:");
        unidadesBocadilloJamón = scanner.nextInt();
        System.out.println("Ingrese el número de refrescos:");
        unidadesRefresco = scanner.nextInt();
        System.out.println("Ingrese el número de cervezas:");
        unidadesCerveza = scanner.nextInt();

        double precioBocadilloJamón = 1.5;
        double precioRefresco = 1.05;
        double precioCerveza = 0.75;

        double total = unidadesBocadilloJamón * precioBocadilloJamón
                + unidadesRefresco * precioRefresco
                + unidadesCerveza * precioCerveza;

        System.out.println("Total a pagar: " + total);

        scanner.close();
    }
}
