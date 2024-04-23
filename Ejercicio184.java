import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de la empresa o su nombre completo: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese la fecha de creación o su fecha de nacimiento (en formato AAAA-MM-DD): ");
        String fecha = scanner.nextLine();
        
        String iniciales = obtenerIniciales(nombre);
        String fechaRFC = fecha.substring(2, 4) + fecha.substring(5, 7) + fecha.substring(8);
        
        String RFC = iniciales.toUpperCase() + fechaRFC;
        
        System.out.println("RFC: " + RFC);
        
        scanner.close();
    }
    
    public static String obtenerIniciales(String nombre) {
        String iniciales = "";
        String[] palabras = nombre.split(" ");
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                iniciales += palabra.charAt(0);
            }
        }
        return iniciales;
    }
}
