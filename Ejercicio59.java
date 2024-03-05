import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, r;
        int m = 1;
        System.out.println("Digite un numero del 1 al 10 para ver su tabla de multiplicar: ");
        num = entrada.nextInt();

        if(num >= 1 && num <= 10){
            for(m=1; m<11; m++){
                r = num * m;
               
                System.out.println(num + " * " + m + " = " + r);
             }
        }else{
            System.out.println("El numero digitado no esta entre 1 y 10.");
        }
         
    }
}


