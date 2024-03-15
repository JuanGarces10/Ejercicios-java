import java.util.*;
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DIgite el valor de X (Base)");
        int x = entrada.nextInt();
        System.out.print("Digite el valor de Y (Exponente)");
        int y = entrada.nextInt();

        int resultado = Potencia(x, y);

        System.out.println(x + "^" + y + " = " + resultado);
    }
    public static int Potencia(int x, int y){
        int r = 1; 
        for(int i = 0; i < y; i++){
            r *= x;
        }
        return r;
    }
}
