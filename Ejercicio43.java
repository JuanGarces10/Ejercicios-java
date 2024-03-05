import java.util.*;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite otro numero: ");
        int n2 = entrada.nextInt();
        int nm = NumeroMenor(n1, n2);

        System.out.println("El numero menor es: " + nm);


    }
    
    public static int NumeroMenor(int n1, int n2){
        if(n1 < n2){
            return n1;
        }else{
            return n2;
        }
    }
}