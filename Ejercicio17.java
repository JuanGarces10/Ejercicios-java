import java.util.*;
public class Ejercicio17{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite otro numero: ");
        int n2 = entrada.nextInt();

        if(n1 > n2){
            System.out.println("El numero mayor es: " + n1);
        }else{
            System.out.println("El numero mayor es: " + n2);
        }
    }
}
