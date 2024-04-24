class Ejercicio220 {
    public static void main(String[] args) {
        // Ejercicio 220
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese una secuencia de números. Ingrese -1 para terminar:");

        while ((numero = scanner.nextInt()) != -1) {
            if (numero < 0) {
                System.out.println("Error: Ingrese solo números positivos.");
                continue;
            }

            suma += numero;
            contador++;
        }

        if (contador == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            double media = (double) suma / contador;
            System.out.println("La media aritmética es: " + media);
        }

        scanner.close();
    }
}
