import java.util.*;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las horas y minutos que uso el estacionamienot: $");
        System.out.println("Horas: ");
        double he = entrada.nextDouble();
        System.out.println("Minutos: ");
        double me = entrada.nextDouble();

        double totalp;
        double totalh;

        if(me > 10){
            totalh = he + 1;
            totalp = totalh * 15.00;
            System.out.println("El total a pagar por el cliente es: $" + totalp);
        }else if(me < 10){
            totalh = he;
            totalp = he * 15.00;
            System.out.println("El total a pagar por el cliente es: $" + totalp);
        }
    }
}