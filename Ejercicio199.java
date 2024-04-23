import java.util.Scanner;

public class Ajedrez {
    public static void main(String[] args) {
        char[][] tablero = {
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'},
            {'_', '_', '_', '_', '_', '_', '_', '_'}
        };
        mostrarTablero(tablero);

        Scanner scanner = new Scanner(System.in);
        int puntosBlancas = 0;
        int puntosNegras = 0;

        while (true) {
            System.out.println("Jugador 1 (blancas), ingrese coordenadas (fila columna):");
            int filaBlanca = scanner.nextInt();
            int columnaBlanca = scanner.nextInt();
            if (filaBlanca == -1 && columnaBlanca == -1) {
                System.out.println("Fin del juego.");
                break;
            }
            if (!esMovimientoValido(tablero, filaBlanca, columnaBlanca, 'B')) {
                System.out.println("Movimiento no válido. Intente nuevamente.");
                continue;
            }
            tablero[filaBlanca][columnaBlanca] = 'B';
            puntosBlancas++;
            mostrarTablero(tablero);

            System.out.println("Jugador 2 (negras), ingrese coordenadas (fila columna):");
            int filaNegra = scanner.nextInt();
            int columnaNegra = scanner.nextInt();
            if (filaNegra == -1 && columnaNegra == -1) {
                System.out.println("Fin del juego.");
                break;
            }
            if (!esMovimientoValido(tablero, filaNegra, columnaNegra, 'N')) {
                System.out.println("Movimiento no válido. Intente nuevamente.");
                continue;
            }
            tablero[filaNegra][columnaNegra] = 'N';
            puntosNegras++;
            mostrarTablero(tablero);
        }

        System.out.println("Puntos blancas: " + puntosBlancas);
        System.out.println("Puntos negras: " + puntosNegras);

        scanner.close();
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esMovimientoValido(char[][] tablero, int fila, int columna, char jugador) {
        if (fila < 0 || fila >= 8 || columna < 0 || columna >= 8) {
            return false;
        }
        if (jugador == 'B' && fila == 0) {
            return false; // Blancas no pueden avanzar en primera fila
        }
        if (jugador == 'N' && fila == 7) {
            return false; // Negras no pueden avanzar en última fila
        }
        if (tablero[fila][columna] != '_') {
            return false; // Casilla ocupada
        }
        if (jugador == 'B' && fila != 0 && tablero[fila - 1][columna] != 'N') {
            return false; // Blancas solo pueden comer a negras
        }
        if (jugador == 'N' && fila != 7 && tablero[fila + 1][columna] != 'B') {
            return false; // Negras solo pueden comer a blancas
        }
        return true;
    }
}
