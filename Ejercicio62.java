import java.util.*;
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sumat = 0;
        double temperaturamax = Double.MIN_VALUE;
        double temperaturamin = Double.MAX_VALUE;

        for(int i = 1;i <= 6; i++){
            System.out.print("Ingrese la temperatura en la hora "+ (i * 4) + ": ");
            double temperatura = entrada.nextDouble();

            sumat+= temperatura; 
            
            if(temperatura > temperaturamax){
                temperaturamax = temperatura;
            }
            if(temperatura > temperaturamin){
                temperaturamin = temperatura;
            }

        }

        double promedio = sumat / 6;

        System.out.println("\nTemperatura media del día: " + promedio);
        System.out.println("Temperatura más alta: " + temperaturamax);
        System.out.println("Temperatura más baja: " + temperaturamin);
    }
}
