import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la base del triangulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite la altura del triangulo: ")
        double altura = entrada.nextDouble();

        double resultado = (base * altura) / 2;
        
        System.out.println("El área del triangulo es: " + resultado);
    }
}