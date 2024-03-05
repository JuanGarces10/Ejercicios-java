import java.util.*;
public class Ejercicio50 {
    public static void main(String[] args) {
       OperacionesMS();
    }
    
    public static void OperacionesMS(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero: ");
        double n1 = entrada.nextDouble(); 
        System.out.println("Digite el segundo numero: ");
        double n2 = entrada.nextDouble(); 
        System.out.println("Digite el tercer numero: ");
        double n3 = entrada.nextDouble(); 

        double suma = n1 + n2 + n3;
        double multiplicacion = n1 * n2 * n3;

        System.out.println("El resultado de la suma es: " + suma );
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
    }
}
