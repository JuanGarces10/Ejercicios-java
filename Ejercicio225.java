import java.util.Scanner;

class Ejercicio225 {
    public static void main(String[] args) {
        // Ejercicio 225
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del cuadrado:");
        int lado = scanner.nextInt();

        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}