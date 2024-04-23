import java.util.Scanner;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la coordenada de inicio del caballo (fila columna): ");
        int filaInicio = scanner.nextInt();
        int columnaInicio = scanner.nextInt();
        
        System.out.print("Ingrese la coordenada destino del caballo (fila columna): ");
        int filaDestino = scanner.nextInt();
        int columnaDestino = scanner.nextInt();
        
        if (movimientoValido(filaInicio, columnaInicio, filaDestino, columnaDestino)) {
            System.out.println("El movimiento del caballo es válido.");
        } else {
            System.out.println("El movimiento del caballo no es válido.");
        }
        
        scanner.close();
    }
    
    public static boolean movimientoValido(int filaInicio, int columnaInicio, int filaDestino, int columnaDestino) {
        int difFila = Math.abs(filaInicio - filaDestino);
        int difColumna = Math.abs(columnaInicio - columnaDestino);
        return (difFila == 1 && difColumna == 2) || (difFila == 2 && difColumna == 1);
    }
}
