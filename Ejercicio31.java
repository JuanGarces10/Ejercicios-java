import java.util.*;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la base del triangulo en milimetros: ");
        double base = entrada.nextDouble();
        System.out.println("Digite la altura del triangulo milimetros: ");
        double altura = entrada.nextDouble();

        double resultado = (base * altura) / 2;
        double cm = resultado / 100;
        double mc = resultado / 1000000;
        
        System.out.println("El área del triangulo en milimetros cuadrados es: " + resultado);
        System.out.println("El área del triangulo en centimetros cuadrados es: " + cm);
        System.out.println("El área del triangulo en metros cuadrados es: " + mc);
    }
}
