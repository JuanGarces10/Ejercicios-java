import java.util.*;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu genero? (Escribe M para masculino, F para femenino): ");
        String g = entrada.next();
        System.out.println("¿Cual es tu nombre?");
        String n = entrada.next();

        if(g.equalsIgnoreCase("M")){
            System.out.println("Bienvenido " + n);
        }else if(g.equalsIgnoreCase("F")){
            System.out.println("Bienvenida: " + n);
        }else{
            System.out.println("Hola indeciso. ");
        }


    }
    
}
