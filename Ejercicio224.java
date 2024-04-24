import java.util.Scanner;

class Ejercicio224 {
    public static void main(String[] args) {
        // Ejercicio 224
        Scanner scanner = new Scanner(System.in);
        String nombreAlumno;

        while (true) {
            System.out.println("Introduce el nombre del alumno (o deja vacío para salir):");
            nombreAlumno = scanner.nextLine();

            if (nombreAlumno.isEmpty()) {
                break;
            }

            double notaPractica, notaProblemas, notaTeorica;

            System.out.println("Introduce la nota práctica:");
            notaPractica = scanner.nextDouble();
            System.out.println("Introduce la nota de problemas:");
            notaProblemas = scanner.nextDouble();
            System.out.println("Introduce la nota teórica:");
            notaTeorica = scanner.nextDouble();

            if (notaPractica < 0 || notaPractica > 10 || notaProblemas < 0 || notaProblemas > 10 || notaTeorica < 0
                    || notaTeorica > 10) {
                System.out.println("Las notas deben estar entre 0 y 10. Introduce las notas nuevamente.");
                scanner.nextLine(); // Limpiar el buffer de entrada
                continue;
            }

            double notaFinal = notaPractica * 0.1 + notaProblemas * 0.5 + notaTeorica * 0.4;
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);

            scanner.nextLine(); // Limpiar el buffer de entrada
        }

        scanner.close();
    }
}