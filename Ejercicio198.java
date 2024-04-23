import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = generarSudoku();
        mostrarSudoku(sudoku);
        jugarSudoku(sudoku);
    }

    // Generar un sudoku aleatorio
    public static int[][] generarSudoku() {
        int[][] sudoku = new int[9][9];
        // Lógica para generar un sudoku aleatorio
        // Aquí puedes implementar un algoritmo para generar un sudoku válido
        // por ejemplo, llenando la diagonal principal con números del 1 al 9
        // y luego aplicando un algoritmo de backtracking para completar el sudoku
        // pero por simplicidad, vamos a llenarlo con ceros
        return sudoku;
    }

    // Mostrar el sudoku en pantalla
    public static void mostrarSudoku(int[][] sudoku) {
        System.out.println("Sudoku:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
                if ((j + 1) % 3 == 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    // Jugar sudoku
    public static void jugarSudoku(int[][] sudoku) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese fila (1-9) y columna (1-9) separadas por un espacio (0 para salir):");
            int fila = scanner.nextInt();
            if (fila == 0) {
                System.out.println("Saliendo del juego de Sudoku.");
                break;
            }
            int columna = scanner.nextInt();
            if (fila < 1 || fila > 9 || columna < 1 || columna > 9) {
                System.out.println("Posición inválida. Debe ser entre 1 y 9.");
                continue;
            }
            System.out.println("Ingrese el número (1-9):");
            int numero = scanner.nextInt();
            if (numero < 1 || numero > 9) {
                System.out.println("Número inválido. Debe ser entre 1 y 9.");
                continue;
            }
            if (!esValido(sudoku, fila - 1, columna - 1, numero)) {
                System.out.println("Movimiento inválido. Intente nuevamente.");
                continue;
            }
            sudoku[fila - 1][columna - 1] = numero;
            mostrarSudoku(sudoku);
        }
        scanner.close();
    }

    // Validar movimiento
    public static boolean esValido(int[][] sudoku, int fila, int columna, int numero) {
        // Validar fila y columna
        for (int i = 0; i < 9; i++) {
            if (sudoku[fila][i] == numero || sudoku[i][columna] == numero) {
                return false;
            }
        }
        // Validar sector 3x3
        int sectorFila = fila - fila % 3;
        int sectorColumna = columna - columna % 3;
        for (int i = sectorFila; i < sectorFila + 3; i++) {
            for (int j = sectorColumna; j < sectorColumna + 3; j++) {
                if (sudoku[i][j] == numero) {
                    return false;
                }
            }
        }
        return true;
    }
}
