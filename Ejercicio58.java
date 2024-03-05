import java.util.*;
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las horas trabajadas: ");
        int ht = entrada.nextInt();
        System.out.println("Digite el valor por hora trabajada: ");
        double vh = entrada.nextDouble();
        Sueldo(ht, vh);
    }

    public static void Sueldo(int ht,  double vh){
        double sueldo = ht * vh;
        System.out.println("El sueldo que le corresponde es: $" + sueldo);
    }
}