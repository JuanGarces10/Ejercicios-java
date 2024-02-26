import java.util.*;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el largo del milimetros rectangulo: ");
        double l = entrada.nextDouble();
        System.out.println("Digite el ancho del en milimetros rectangulo: ");
        double a = entrada.nextDouble();

        double area = l * a;
        double cm = area / 100;
        double mc = area / 1000000;

        System.out.println("El área del rectangulo en milimetros cuadrados es: " + area);
        System.out.println("El área del rectangulo en centimetros cuadrados es: " + cm);
        System.out.println("El área del rectangulo en metros cuadrados es: " + mc);

    }
}
