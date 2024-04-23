import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena en minúsculas: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena en minúsculas: ");
        String cadena2 = scanner.nextLine();

        String mayusculas1 = cadena1.toUpperCase();
        String mayusculas2 = cadena2.toUpperCase();

        System.out.println("Cadena 1 en mayúsculas: " + mayusculas1);
        System.out.println("Cadena 2 en mayúsculas: " + mayusculas2);

        if (mayusculas1.equals(mayusculas2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }

        scanner.close();
    }
}
