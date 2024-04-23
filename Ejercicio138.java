import java.util.Scanner;

public class Ejercicio138 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Menú:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un triángulo");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción:");
            opcion = leer.nextInt();

            // Realizar el cálculo correspondiente según la opción seleccionada
            double area;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = leer.nextDouble();
                    area = Math.PI * Math.pow(radio, 2);
                    System.out.println("El área del círculo es: " + area);
                    break;
                case 2:
                    System.out.println("Ingrese la base del triángulo:");
                    double base = leer.nextDouble();
                    System.out.println("Ingrese la altura del triángulo:");
                    double altura = leer.nextDouble();
                    area = base * altura / 2;
                    System.out.println("El área del triángulo es: " + area);
                    break;
                case 3:
                    System.out.println("Ingrese la base del rectángulo:");
                    double baseRect = leer.nextDouble();
                    System.out.println("Ingrese la altura del rectángulo:");
                    double alturaRect = leer.nextDouble();
                    area = baseRect * alturaRect;
                    System.out.println("El área del rectángulo es: " + area);
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        leer.close();
    }
}
