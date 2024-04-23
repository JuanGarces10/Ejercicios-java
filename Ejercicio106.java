import java.util.Scanner;

public class Ejercicio106 {
    // Función para calcular el máximo común divisor usando el algoritmo de Euclides
    public static int calcularMCD(int m, int n) {
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números enteros positivos
        System.out.println("Ingrese el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        int num2 = leer.nextInt();

        // Verificar que num1 > num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Calcular y mostrar el máximo común divisor
        int mcd = calcularMCD(num1, num2);
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);

        leer.close();
    }
}
