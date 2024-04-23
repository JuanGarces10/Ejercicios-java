import java.util.Scanner;

public class Ejercicio105 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar las cuatro notas
        System.out.println("Ingrese la primera nota:");
        double nota1 = leer.nextDouble();
        System.out.println("Ingrese la segunda nota:");
        double nota2 = leer.nextDouble();
        System.out.println("Ingrese la tercera nota:");
        double nota3 = leer.nextDouble();
        System.out.println("Ingrese la cuarta nota:");
        double nota4 = leer.nextDouble();

        // Calcular el promedio de las notas
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        // Determinar el estado de aprobación
        if (promedio > 14.5) {
            System.out.println("APROBADO");
        } else if (promedio > 10) {
            System.out.println("SUPLETORIO");
        } else {
            System.out.println("PERDIDO EL AÑO");
        }

        leer.close();
    }
}
