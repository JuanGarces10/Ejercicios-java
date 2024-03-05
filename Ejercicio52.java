import java.util.*;
public class Ejercicio52 {
    public static void main(String[] args){
        TablaM();
    }
    
    public static void TablaM(){
        Scanner entrada = new Scanner(System.in);
        int num, r;
        int m = 1;
        System.out.println("Digite el numero al cual desea saber su tabla de multiplicar : ");
        num = entrada.nextInt();
         System.out.println("La tabla de multiplicar de " + num + " es:");

         for(m = 0; m <= 10; m++){
            r = num * m;
            
            System.out.println(num + " * " + m + " = " + r);
         }
    }
}

