import java.util.Scanner;

public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("El tablero de ajedrez es de 8x8. Las coordenadas van desde (1,1) hasta (8,8).");
        
        System.out.print("Ingrese la fila de la reina (1-8): ");
        int filaReina = scanner.nextInt();
        System.out.print("Ingrese la columna de la reina (1-8): ");
        int columnaReina = scanner.nextInt();
        
        System.out.print("Ingrese la fila a la cual se moverá la reina (1-8): ");
        int nuevaFila = scanner.nextInt();
        System.out.print("Ingrese la columna a la cual se moverá la reina (1-8): ");
        int nuevaColumna = scanner.nextInt();
        
        if (movimientoValido(filaReina, columnaReina, nuevaFila, nuevaColumna)) {
            System.out.println("El movimiento es válido.");
        } else {
            System.out.println("El movimiento no es válido.");
        }
        
        scanner.close();
    }
    
    public static boolean movimientoValido(int filaReina, int columnaReina, int nuevaFila, int nuevaColumna) {
        return filaReina == nuevaFila || columnaReina == nuevaColumna || Math.abs(filaReina - nuevaFila) == Math.abs(columnaReina - nuevaColumna);
    }
}
