import java.util.*;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n = entrada.nextInt();

        if(n > 0){
            System.out.println("El " + n + " es positivo." );
        }else{
            System.out.println("El " + n + " es negativo.");
        }
    }    
}