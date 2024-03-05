import java.util.*;
public class Ejercicio51 {
    public static void main(String[] args) {
        OperacionAP();
    }
    
    public static void OperacionAP(){
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Digite la base del rectangulo: "); 
        double base = entrada.nextDouble();
        System.out.println("Digite la altura del rectangulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * base + 2 * altura;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
