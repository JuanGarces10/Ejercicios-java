import java.util.*;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la distancia en KM para convertir a M: ");
        double dk = entrada.nextDouble();

        double r = dk * 1000;

        System.out.println(dk + " KIlometros son " + r + " Metros.");
    }
}
