public class Ejercicio72 {
    public static void main(String[] args) {
        int horasTrabajadas = 45; // Cambia este valor según las horas trabajadas
        double tarifaPorHora = 10.0; // Cambia este valor según la tarifa por hora

        double salario;

        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;
            double tarifaNormal = tarifaPorHora;
            double tarifaExtra = tarifaPorHora * 1.5; // Incremento del 50%

            salario = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        System.out.println("El salario del trabajador es: " + salario);
    }
}
