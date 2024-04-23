import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        if (esPalindroma(palabra)) {
            System.out.println("La palabra \"" + palabra + "\" es palíndroma.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es palíndroma.");
        }

        scanner.close();
    }

    public static boolean esPalindroma(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
