class Ejercicio208 {
    public static void main(String[] args) {

        double parcial1 = 70;
        double parcial2 = 80;
        double parcial3 = 90;
        double practicas = 85;
        double asistencia = 95;
        double calificacionFinal = (parcial1 + parcial2 + parcial3) / 3 * 0.6 + practicas * 0.3 + asistencia * 0.1;
        System.out.println("Calificación final: " + calificacionFinal);
    }
}