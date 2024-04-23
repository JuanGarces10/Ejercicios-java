import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena1 = scanner.nextLine();

        char[] arreglo1 = cadena1.toCharArray();
        char[] arreglo2 = new char[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo2[i] = arreglo1[i];
        }

        System.out.print("Copia de la cadena: ");
        for (char c : arreglo2) {
            System.out.print(c);
        }
        scanner.close();
    }
}
