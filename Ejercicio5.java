import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite la diagonal mayor del rombo ");
        double d1 = entrada.nextDouble();
        System.out.println("Digite la diagonal menor del rombo ");
        double d2 = entrada.nextDouble();

        double resultado = (d1 * d2) / 2;

        System.out.println("El área del rombo es: " + resultado);
    }   
}