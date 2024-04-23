import java.util.Scanner;

public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       
        System.out.println("Ingrese el tiempo en minutos:");
        int minutos = leer.nextInt();

      
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        int segundos = minutosRestantes * 60;


        System.out.println("Tiempo ingresado:");
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutosRestantes);
        System.out.println("Segundos: " + segundos);

        leer.close();
    }
}
