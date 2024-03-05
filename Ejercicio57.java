import java.util.*;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n = entrada.nextInt();
        Suma(n);
    }
    
    public static int Suma(int n){
        int suma = 0;
        while (n != 0) {
            suma += n % 10;
            n /= 10;
        }
        System.out.println("La suma de los digitos es: " + suma);
        return suma;
    }
}
