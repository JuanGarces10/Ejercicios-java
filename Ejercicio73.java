public class Ejercicio73 {
    public static void main(String[] args) {
        double sueldo = 2500; // Cambia este valor por el sueldo del trabajador

        double descuento;
        double sueldoNeto;

        if (sueldo <= 1000) {
            descuento = sueldo * 0.10; // 10% de descuento
        } else if (sueldo <= 2000) {
            descuento = 1000 * 0.10 + (sueldo - 1000) * 0.05; // 10% del primer tramo y 5% del adicional
        } else {
            descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldo - 2000) * 0.03; // 10% del primer tramo, 5% del segundo tramo y 3% del adicional
        }

        sueldoNeto = sueldo - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}
