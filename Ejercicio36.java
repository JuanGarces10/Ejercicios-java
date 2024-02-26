import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las horas y minutos que uso el estacionamienot: $");
        System.out.println("Horas: ");
        double he = entrada.nextDouble();
        System.out.println("Minutos: ");
        double me = entrada.nextDouble();

        double totalh = he + me / 60.0;
        double totalp = totalh * 15.00;

        System.out.println("El cliente debe pagar: $" + totalp );

        

    }
}
