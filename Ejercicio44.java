import java.lang.Math;
public class Ejercicio44 {
     public static void main(String[] args) {
        double pi = Math.PI;
        for (int i = 2; i <= 10; i++){
            double potencia = Math.pow(pi, i);

            System.out.println("Pontencia " + i + " de PI. = " + potencia);
        }
        double raiz = Math.sqrt(pi);
        System.out.println("Raiz cuadrada de PI = " + raiz);
    }
}            