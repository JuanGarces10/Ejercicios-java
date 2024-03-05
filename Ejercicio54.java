import java.util.*;
public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite una medida en centimetros para convertir a pulgadas: ");
        double cm = entrada.nextDouble();
        double pulgada = Conversion(cm);

        System.out.println(cm + " centimetros son " + pulgada + " pulgadas.");
    }
    
    public static double Conversion(double cm){
        double pulgada = cm / 2.54;
        return pulgada;
    }
}
