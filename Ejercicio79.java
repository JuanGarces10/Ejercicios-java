public class Ejercicio79 {
    public static void main(String[] args) {
        // Voltaje de un bombillo en voltios
        int voltajeBombillo = 120;

        // Número de bombillos
        int numeroBombillos = 3;

        // Calcular el voltaje total en voltios
        int voltajeTotal = voltajeBombillo * numeroBombillos;

        // Convertir el voltaje total a kilovoltios
        double voltajeTotalKilovoltios = voltajeTotal / 1000.0;

        // Mostrar el voltaje total en kilovoltios
        System.out.println("El voltaje total de los tres bombillos es: " + voltajeTotalKilovoltios + " kV");
    }
}
