import java.util.*;
public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la medida de un lado del cuadrado para calcular su area: ");
        double lado = entrada.nextDouble();
        double area = Area(lado);

        System.out.println("El area del cuadrado es: " + area);
    }
    
    public static double Area(double lado){
        double area = lado * lado;
        return area;
    }
}
