public class Ejercicio194 {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 9, 2, 7, 4, 6, 10};
        ordenarBurbuja(numeros);
        System.out.println("Números ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void ordenarBurbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
