import java.util.*;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        int edad = entrada.nextInt();

        if(edad < 18){
            System.out.println("Eres menor de edad. ");
        }else if(edad >= 18){
            System.out.println("Eres mayor de edad. ");
        }
    }  
}

