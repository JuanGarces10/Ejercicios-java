import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una dirección de correo electrónico: ");
        String correo = scanner.nextLine();
        
        if (validarCorreo(correo)) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
        
        scanner.close();
    }
    
    public static boolean validarCorreo(String correo) {
        String expresionRegular = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }
}
