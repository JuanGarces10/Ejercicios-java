import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] vocales = new char[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la " + (i + 1) + "ª vocal: ");
            vocales[i] = scanner.next().charAt(0);
        }
        
        Arrays.sort(vocales);
        
        System.out.println("Las vocales en orden son: ");
        for (char vocal : vocales) {
            System.out.print(vocal + " ");
        }
        
        scanner.close();
    }
}
