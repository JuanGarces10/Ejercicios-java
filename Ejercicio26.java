import java.util.*;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.println("Digite la medida del cateto adyacente: ");
        double ca = entrada.nextDouble();
        System.out.println("Digite la medida del cateto opuesto: ");
        double co = entrada.nextDouble();

        double h = Math.sqrt(Math.pow(ca,2) + Math.pow(co,2));  
        
        System.out.println("La hipotenusa es: " + h);
    }
}
