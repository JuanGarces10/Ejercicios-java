public class Ejercicio71 {
    public static void main(String[] args) {
        int n = 10; // Puedes cambiar este valor por la cantidad de números Fibonacci que desees generar

        int a = 1;
        int b = 1;
        int c;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
