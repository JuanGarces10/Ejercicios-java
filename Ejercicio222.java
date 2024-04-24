
class Ejercicio222 {
    public static void main(String[] args) {
        // Ejercicio 222
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduce números enteros. Introduce 0 para terminar:");

        while ((numero = scanner.nextInt()) != 0) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            double media = (double) suma / contador;
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        }

        scanner.close();
    }
}
