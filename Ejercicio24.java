import java.util.*;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de pulgadas que desea convertir a centimetros: ");
        double plg = entrada.nextDouble();

        double c = plg * 2.54;

        System.out.println(plg + " Pulgadas son " + c + " centimetros.");
    }
    
}
