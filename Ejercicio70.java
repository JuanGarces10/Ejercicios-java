public class Ejercicio70 {
    public static void main(String[] args) {
        int n = 10;

        int resultado = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                resultado -= i;
            } else {
                resultado += i;
            }
        }
        
        System.out.println("El resultado es: " + resultado);
    }
}
