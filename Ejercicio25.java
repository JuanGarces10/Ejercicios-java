import java.util.*;
public class Ejercicio25 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centigrados que desea convertir a grados fahrenheit: ");
        double gc = entrada.nextDouble();

        double r = ((gc * 9) / 5) + 32;

        System.out.println(gc + " Grados centigrados son " + r + " grados fahrenheit. ");

    }
}
