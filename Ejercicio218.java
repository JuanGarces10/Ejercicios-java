class Ejercicio218 {
    public static void main(String[] args) {
        // Ejercicio 218
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de N:");
        int N = scanner.nextInt();
        scanner.close();

        if (N <= 0 || N % 2 != 0) {
            System.out.println("N debe ser un número positivo y par.");
            return;
        }

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("La suma de los " + N + " primeros números naturales es: " + suma);
    }
}
