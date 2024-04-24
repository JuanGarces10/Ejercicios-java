import java.util.Scanner;

public class Ejercicio247-248-249{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de alumnos
        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = scanner.nextInt();

        // Inicializar variables para la suma, nota baja y nota alta
        double sumaNotas = 0;
        double notaBaja = Double.MAX_VALUE;
        double notaAlta = Double.MIN_VALUE;

        // Ingresar las notas de los alumnos y realizar los cálculos
        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Ingrese la nota del alumno " + i + ":");
            double nota = scanner.nextDouble();

            // Calcular suma y promedio
            sumaNotas += nota;

            // Determinar nota baja
            if (nota < notaBaja) {
                notaBaja = nota;
            }

            // Determinar nota alta
            if (nota > notaAlta) {
                notaAlta = nota;
            }
        }

        // Calcular promedio
        double promedio = sumaNotas / numAlumnos;

        // Imprimir resultados
        System.out.println("Suma de las notas: " + sumaNotas);
        System.out.println("Promedio de las notas: " + promedio);
        System.out.println("Nota más baja: " + notaBaja);
        System.out.println("Nota más alta: " + notaAlta);

        scanner.close();
    }
}
