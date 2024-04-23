import java.util.Scanner;

public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();
        
        System.out.println("La cadena en orden inverso es: " + invertirCadena(cadena));
        
        scanner.close();
    }
    
    public static String invertirCadena(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultado.append(cadena.charAt(i));
        }
        return resultado.toString();
    }
}
