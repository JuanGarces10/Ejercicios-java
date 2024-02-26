import java.util.*;
 public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n;
        
        try {
            n = entrada.nextInt();
            if(n < 0){
                System.out.println("Digite un numero positivo. ");
                return;
            }
        } catch (Exception e) {
            System.out.println("Debes ingresar un numero entero. ");
            return;
        }
        cuentaa(n);
    }
   
    public static void cuentaa(int n){
        while (n >= 0 ) {
            System.out.println(n);
            --n;  
        }
    }
}
