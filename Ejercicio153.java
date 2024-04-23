import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena de caracteres: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena de caracteres: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
            if (cadena1.compareTo(cadena2) > 0) {
                System.out.println("La primera cadena es mayor alfabéticamente.");
            } else {
                System.out.println("La segunda cadena es mayor alfabéticamente.");
            }
        }

        scanner.close();
    }
}
