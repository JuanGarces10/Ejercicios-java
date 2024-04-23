import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.println("Ingrese el primer número:");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = leer.nextDouble();

        // Calcular la suma y la resta de los números
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;

        // Verificar si la suma dividida entre la resta es exacta
        if (suma % resta == 0) {
            System.out.println("La suma dividida entre la resta es exacta.");
        } else {
            System.out.println("La suma dividida entre la resta no es exacta.");
        }

        leer.close();
    }
}
