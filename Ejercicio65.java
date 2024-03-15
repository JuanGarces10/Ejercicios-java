import java.util.*;;
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el numero hasta donde desea realiazr la suma: ");
        int numero = entrada.nextInt();

        int suma = Suma(numero);

        System.out.println("La suma de los numeros del 1 hasta "+ numero + " es: " + suma);
    }
    public static int Suma(int numero){
        return numero * (numero + 1) / 2;
    }
}
