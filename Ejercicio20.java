import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la primera nota: ");
        float n1 = entrada.nextFloat();
        System.out.println("Digite la segunda nota: ");
        float n2 = entrada.nextFloat();
        System.out.println("Digite la tercera nota: ");
        float n3 = entrada.nextFloat();
        System.out.println("Digite la cuarta nota: ");
        float n4 = entrada.nextFloat();
        System.out.println("Digite la quinta nota: ");
        float n5 = entrada.nextFloat();

        float suma = n1 + n2 + n3 + n4 + n5;
        float promedio = (suma) / 5;
        float doble = suma * 2;

        System.out.println("La suma de las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("El doble de las notas es: " + doble);
    }
    
}

