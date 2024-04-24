class Ejercicio219 {
    public static void main(String[] args) {
        // Ejercicio 219
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de N:");
        int N = scanner.nextInt();
        scanner.close();

        int primerNumeroPar = 2;
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += primerNumeroPar;
            primerNumeroPar += 2;
        }

        System.out.println("La suma de los " + N + " primeros números pares es: " + suma);
    }
}