import java.util.*;;
public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite numeros. cuando desee terminar digite '0' " );
        int contador = 0;

       while (true) {
        int num = entrada.nextInt();
            if (num > 0) {
            contador++;
           }else if(num == 0){
            break;
           }
       }

       System.out.println("Los numeros digitados mayores 0 en total fueron: " + contador);
        
    }
}
