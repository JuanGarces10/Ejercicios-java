public class Ejercicio116 {
    public static void main(String[] args) {
        int sumaPares = 0;
        long productoImpares = 1;

        // Sumar los números enteros pares entre 1 y 1000
        for (int i = 2; i <= 1000; i += 2) {
            sumaPares += i;
        }

        // Multiplicar los números enteros impares entre 1 y 50
        for (int i = 1; i <= 50; i += 2) {
            productoImpares *= i;
        }

        // Mostrar resultados
        System.out.println("La suma de los números enteros pares entre 1 y 1000 es: " + sumaPares);
        System.out.println("El producto de los números enteros impares entre 1 y 50 es: " + productoImpares);
    }
}
