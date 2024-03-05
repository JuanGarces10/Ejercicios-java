import java.util.*;
public class Ejercicio48 {
    public static void main(String[] args){
        Operaciones();
   }
   
   public static void Operaciones(){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite un numero: ");
    double n1 = entrada.nextDouble();
    System.out.println("Digite otro numero: ");
    double n2 = entrada.nextDouble();

    double suma = n1 + n2;
    double resta = n1 - n2;
    double multiplicacion = n1 * n2;

    System.out.println("Suma = " + suma );
    System.out.println("Resta = " + resta );
    System.out.println("Multiplicacion = " + multiplicacion );

    if(n2 != 0){
        double division = n1 / n2;
        double resto =  n1 % n2;
        System.out.println("Division = " + division );
        System.out.println("Resto = " + resto );
    }else{
        System.out.println("Digite un numero diferente a 0 para realizar la division y el resto.");
    }
   }
}
