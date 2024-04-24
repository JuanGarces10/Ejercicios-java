class Ejercicio223 {
    public static void main(String[] args) {
        // Ejercicio 223
        int cuenta = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                cuenta++;
            }
        }
        System.out.println("Hay " + cuenta + " números entre 1 y 100 que son múltiplos de 2 o de 3.");
    }
}
