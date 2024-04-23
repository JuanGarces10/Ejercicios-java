import java.util.Scanner;

public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;
        int edadPersonaMasJoven = Integer.MAX_VALUE;
        
        while (true) {
            System.out.print("Ingrese la edad de la persona (o 0 para terminar): ");
            int edad = scanner.nextInt();
            if (edad == 0) {
                break;
            }
            
            System.out.print("Ingrese el sexo de la persona (H para hombre, M para mujer): ");
            char sexo = scanner.next().charAt(0);
            
            if (edad < 18) {
                System.out.println("No se permiten menores de edad a la fiesta.");
                continue;
            }
            
            totalPersonas++;
            
            if (sexo == 'H' || sexo == 'h') {
                totalHombres++;
                sumaEdadHombres += edad;
            } else if (sexo == 'M' || sexo == 'm') {
                totalMujeres++;
                sumaEdadMujeres += edad;
            }
            
            edadPersonaMasJoven = Math.min(edad, edadPersonaMasJoven);
        }
        
        double promedioEdadHombres = totalHombres > 0 ? (double) sumaEdadHombres / totalHombres : 0;
        double promedioEdadMujeres = totalMujeres > 0 ? (double) sumaEdadMujeres / totalMujeres : 0;
        
        System.out.println("Total de personas: " + totalPersonas);
        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Promedio de edad de hombres: " + promedioEdadHombres);
        System.out.println("Promedio de edad de mujeres: " + promedioEdadMujeres);
        System.out.println("Edad de la persona más joven que asistió: " + edadPersonaMasJoven);
        
        scanner.close();
    }
}
