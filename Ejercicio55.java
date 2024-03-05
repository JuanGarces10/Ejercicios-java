import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero positivo");
        int n = entrada.nextInt();
        int resultado = Resultado(n);

        System.out.println("El resultado es: " + resultado);
    }

    public static int Resultado(int n){
        if(n % 2 != 0){
            return 1;
        }else{
            return 0;
        }
    }
}   
