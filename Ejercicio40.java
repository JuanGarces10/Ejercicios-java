import java.util.*;
public class Ejercicio40 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double k_oro,p_por_onza,g_por_kilo,g_por_onza,g_oro,oz_oro,preciototal;
        g_por_kilo = 1000;
        g_por_onza = 28.3495;
        System.out.println("Digite la cantidad de kilos de oro: ");
        k_oro = entrada.nextDouble();
        System.out.println("Digite el precio por onza de oro en pesos: ");
        p_por_onza = entrada.nextDouble();

        g_oro = k_oro * g_por_kilo;
        oz_oro = g_oro / g_por_onza;
        preciototal = oz_oro * p_por_onza;

        System.out.println("La cantidad de oro sera: " + oz_oro);
        System.out.println("El valor en pesos es: " + preciototal);

    }
}

