import java.util.Scanner;

public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracion = scanner.nextInt();
        
        double costo = 0;
        if (duracion <= 3) {
            costo = 3.0;
        } else if (duracion <= 7) {
            costo = 3.0 + (duracion - 3) * 1.5;
        } else {
            costo = 3.0 + 4 * 1.5 + (duracion - 7) * 3.0;
        }
        
        System.out.println("El costo de la llamada es: $" + costo);
        
        scanner.close();
    }
}
