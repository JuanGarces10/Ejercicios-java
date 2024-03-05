import java.util.*;
public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el tiempo expresado en segundos: ");
        int tiemposeg = entrada.nextInt();
        Hora(tiemposeg);

    }
    
    public static void Hora(int tiemposeg){
        int hora = tiemposeg / 3600; 
        int minutos = (tiemposeg % 3600) / 60;    
        int segundos = tiemposeg % 60;

        System.out.println("Horas: " + hora);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
