import java.util.Scanner;

public class Ejercicio140 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Salir");
            System.out.println("2. Sumatoria");
            System.out.println("3. Factorial");
            System.out.println("Seleccione una opción:");
            opcion = leer.nextInt();

            // Realizar la operación correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("¡Hasta luego!");
                    break;
                case 2:
                    System.out.println("Ingrese un número para calcular su sumatoria:");
                    int numSum = leer.nextInt();
                    int sumatoria = 0;
                    for (int i = 1; i <= numSum; i++) {
                        sumatoria += i;
                    }
                    System.out.println("La sumatoria de los números hasta " + numSum + " es: " + sumatoria);
                    break;
                case 3:
                    System.out.println("Ingrese un número para calcular su factorial:");
                    int numFact = leer.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= numFact; i++) {
                        factorial *= i;
                    }
                    System.out.println("El factorial de " + numFact + " es: " + factorial);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 1);

        leer.close();
    }
}
