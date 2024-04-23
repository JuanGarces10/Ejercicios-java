import java.util.Scanner;

public class Ejercicio101 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números
        System.out.println("Ingrese el primer número:");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero2 = leer.nextInt();

        // Verificar si el primer número es divisible por el segundo
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }

        leer.close();
    }
}
