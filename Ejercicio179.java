import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese las calificaciones del alumno:");
        System.out.print("Matemáticas: ");
        double matematicas = scanner.nextDouble();
        System.out.print("Inglés: ");
        double ingles = scanner.nextDouble();
        System.out.print("Español: ");
        double espanol = scanner.nextDouble();
        
        double promedio = (matematicas + ingles + espanol) / 3;
        System.out.println("Promedio: " + promedio);
        
        int aprobadas = 0;
        if (matematicas >= 10) aprobadas++;
        if (ingles >= 10) aprobadas++;
        if (espanol >= 10) aprobadas++;
        int reprobadas = 3 - aprobadas;
        System.out.println("Materias aprobadas: " + aprobadas);
        System.out.println("Materias reprobadas: " + reprobadas);
        
        double menorCalificacion = Math.min(matematicas, Math.min(ingles, espanol));
        String materiaMenorCalificacion = "";
        if (menorCalificacion == matematicas) {
            materiaMenorCalificacion = "Matemáticas";
        } else if (menorCalificacion == ingles) {
            materiaMenorCalificacion = "Inglés";
        } else {
            materiaMenorCalificacion = "Español";
        }
        System.out.println("Materia con menor calificación: " + materiaMenorCalificacion);
        
        scanner.close();
    }
}
