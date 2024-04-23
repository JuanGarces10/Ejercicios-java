import java.util.Scanner;

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Ingrese el área o departamento: ");
        String areaDepartamento = scanner.nextLine();
        
        String[] partesNombre = nombreCompleto.split(" ");
        StringBuilder usuario = new StringBuilder();
        usuario.append(areaDepartamento.substring(0, 2).toLowerCase());
        for (String parte : partesNombre) {
            usuario.append(parte.substring(0, 2).toLowerCase());
        }
        
        System.out.println("Nombre de usuario generado: " + usuario);
        
        scanner.close();
    }
}
