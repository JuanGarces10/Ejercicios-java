import java.util.*;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vnaranja = 0.05;
        double knaranja = vnaranja / 1000;
    
        System.out.println("Digite la cantidad de kilovoltios que necesita el sistema de iluminacion: ");
        double ckilov = entrada.nextDouble();

        double kilon = (ckilov * 20000);
        double tnaranja = 0.000006 * kilon ;

        System.out.println("Una naranja en kilovoltios es: " + knaranja + " kilovoltios. ");
        System.out.println("Se necesitan "+ kilon + " narajas, para alcanzar " + ckilov + " kilovoltios.");
        System.out.println("Las toneladas de narajas necesarias son: " + tnaranja);
    }
}
