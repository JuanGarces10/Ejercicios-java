import java.util.*;
public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Digite el año actual: ");
        int ac = entrada.nextInt();
        System.out.println("Digite el año de su nacimiento: ");
        int an = entrada.nextInt();

        int edada = ac - an;
        int totald = edada * 365;
        int diasd = (int) (totald * 0.34);

        System.out.println(nombre + " ha dormido " + diasd + " dias en toda su vida.");

    }
}
