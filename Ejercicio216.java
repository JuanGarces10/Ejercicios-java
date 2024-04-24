import java.util.Scanner;

class Ejercicio216 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la calificación del examen de Matemáticas:");
        double examenMatematicas = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la primera tarea de Matemáticas:");
        double tareaMatematicas1 = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la segunda tarea de Matemáticas:");
        double tareaMatematicas2 = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la tercera tarea de Matemáticas:");
        double tareaMatematicas3 = scanner.nextDouble();

        System.out.println("Ingresa la calificación del examen de Física:");
        double examenFisica = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la primera tarea de Física:");
        double tareaFisica1 = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la segunda tarea de Física:");
        double tareaFisica2 = scanner.nextDouble();

        System.out.println("Ingresa la calificación del examen de Química:");
        double examenQuimica = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la primera tarea de Química:");
        double tareaQuimica1 = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la segunda tarea de Química:");
        double tareaQuimica2 = scanner.nextDouble();
        System.out.println("Ingresa la calificación de la tercera tarea de Química:");
        double tareaQuimica3 = scanner.nextDouble();

        double promedioMatematicas = (examenMatematicas * 0.9
                + (tareaMatematicas1 + tareaMatematicas2 + tareaMatematicas3) / 3 * 0.1) / 2;
        double promedioFisica = (examenFisica * 0.8 + (tareaFisica1 + tareaFisica2) / 2 * 0.2) / 2;
        double promedioQuimica = (examenQuimica * 0.85 + (tareaQuimica1 + tareaQuimica2 + tareaQuimica3) / 3 * 0.15)
                / 2;

        double promedioGeneral = (promedioMatematicas + promedioFisica + promedioQuimica) / 3;

        System.out.println("Promedio de Matemáticas: " + promedioMatematicas);
        System.out.println("Promedio de Física: " + promedioFisica);
        System.out.println("Promedio de Química: " + promedioQuimica);
        System.out.println("Promedio General: " + promedioGeneral);

        scanner.close();
    }
}
