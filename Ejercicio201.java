public class Ejercicio201 {
    public static void main(String[] args) {
        double calificacionParcial1 = 85;
        double calificacionParcial2 = 75;
        double calificacionParcial3 = 90;
        double calificacionExamenFinal = 70;
        double calificacionTrabajoFinal = 95;

        double calificacionFinal = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3 * 0.55
                + calificacionExamenFinal * 0.30
                + calificacionTrabajoFinal * 0.15;

        System.out.println("La calificación final en Algoritmos es: " + calificacionFinal);
    }
}
