import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double suma = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Ingrese un número positivo (0 para terminar): ");
            double numero = scanner.nextDouble();
            
            if (numero == 0) {
                break;
            }
            
            if (numero > 0) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Ingrese un número positivo.");
            }
        }
        
        if (contador == 0) {
            System.out.println("No se han ingresado números positivos.");
        } else {
            double promedio = suma / contador;
            System.out.println("El promedio de los números ingresados es: " + promedio);
        }
        
        scanner.close();
    }
}
