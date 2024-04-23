import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar el consumo en Kw
        System.out.println("Ingrese el consumo en Kw:");
        double consumo = leer.nextDouble();

        // Calcular el porcentaje de consumo
        double porcentaje = (consumo / 10000) * 100;

        // Determinar la eficiencia energética
        if (porcentaje >= 80 && porcentaje <= 100) {
            System.out.println("CONSUMO MEDIO");
        } else {
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        }

        leer.close();
    }
}
