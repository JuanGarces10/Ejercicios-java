public class InversionBancaria {
    public static void main(String[] args) {
        double capitalInicial = 1000; // Capital inicial en dólares
        double tasaInteresMensual = 1.5 / 100; // Tasa de interés mensual en porcentaje
        int meses = 2; // Número de meses

        // Calcular el monto total después de 2 meses
        double montoTotal = calcularInteresCompuesto(capitalInicial, tasaInteresMensual, meses);

        // Mostrar el monto total después de 2 meses
        System.out.println("El monto total después de 2 meses será: $" + montoTotal);
    }

    public static double calcularInteresCompuesto(double capitalInicial, double tasaInteresMensual, int meses) {
        // Calcular el monto total utilizando la fórmula del interés compuesto
        double montoTotal = capitalInicial * Math.pow((1 + tasaInteresMensual), meses);
        return montoTotal;
    }
}
