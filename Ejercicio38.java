import java.util.*;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad: ");
        int edad = entrada.nextInt();

        double kg = 8;
        double gr = kg * 1000;
        double gramosc = edad * gr;
        double manzanac = gramosc / 4;

        System.out.println("En toda tu vida has consumido: " + gramosc);
        System.out.println("Es probable que hays comido " + manzanac + " manzanas en toda tu vida.");
    }
}
