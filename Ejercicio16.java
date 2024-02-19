import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la nota de su examen de matematicas: ");
        float nota = entrada.nextFloat();

        if(nota < 3.0){
            System.out.println("Su nota es " + nota + " a perdido el examen.");
        }else{
            System.out.println("Su nota es " + nota + " a ganado el examen.");
        }
    }
}

