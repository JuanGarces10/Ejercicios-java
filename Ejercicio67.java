import java.util.*;;
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero el cual desea saber su factorial: ");
        int numero = entrada.nextInt();
        
        float factorial = Factorial(numero);

        System.out.println("El factorial de " + numero + " es:" + factorial);
    }
    public static long Factorial(int numero){
        if(numero == 0){
            return 1;
        } 

        long r = 1;
        for(int i = 1; i <= numero; i++){
            r *= i;
        } 
        return r;
    }
}
