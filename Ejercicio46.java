import java.util.*;
public class Ejercicio46 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las millas que quiere convertir a metros: ");
        double millas = entrada.nextDouble();
        double metros = Convertir(millas);

        System.out.println(millas + " millas expresadas en metros son: " + metros);
    }
    
    public static double Convertir(double millas){
        return millas * 1852;
    }
}