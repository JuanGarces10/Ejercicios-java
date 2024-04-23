import java.util.Scanner;

public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprobadosTodos = 0, aprobadosAlMenosUno = 0, aprobadosUltimo = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i + ":");
            System.out.print("Ingrese calificación del primer examen: ");
            int examen1 = scanner.nextInt();
            System.out.print("Ingrese calificación del segundo examen: ");
            int examen2 = scanner.nextInt();
            System.out.print("Ingrese calificación del tercer examen: ");
            int examen3 = scanner.nextInt();

            if (examen1 >= 60 && examen2 >= 60 && examen3 >= 60) {
                aprobadosTodos++;
            }
            if (examen1 >= 60 || examen2 >= 60 || examen3 >= 60) {
                aprobadosAlMenosUno++;
            }
            if (examen3 >= 60 && (examen1 < 60 || examen2 < 60)) {
                aprobadosUltimo++;
            }
        }

        System.out.println("a) Alumnos que aprobaron todos los exámenes: " + aprobadosTodos);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + aprobadosAlMenosUno);
        System.out.println("c) Alumnos que aprobaron únicamente el último examen: " + aprobadosUltimo);
        scanner.close();
    }
}
