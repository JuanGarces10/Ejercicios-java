import java.util.*;
public class Ejercicio45 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero real: ");
        double n = entrada.nextDouble();
        int resultado = Resultado(n);
        System.out.println("Resultado = " + resultado);
        
    }
    
    public static int Resultado(double n){
        if(n > 0){
            return 1;
        }else if(n < 0){
            return -1;
        }else{
            return 0;
        }
    }
}