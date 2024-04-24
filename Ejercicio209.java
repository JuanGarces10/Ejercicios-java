class Ejercicio209 {
    public static void main(String[] args) {

        int reprobados = 5;
        int aprobados = 20;
        int sobresalientes = 3;

        int totalAlumnos = reprobados + aprobados + sobresalientes;
        double porcentajeSuperado = (double) (aprobados + sobresalientes) / totalAlumnos * 100;
        double porcentajeReprobados = (double) reprobados / totalAlumnos * 100;
        double porcentajeAprobados = (double) aprobados / totalAlumnos * 100;
        double porcentajeSobresalientes = (double) sobresalientes / totalAlumnos * 100;

        System.out.println("Porcentaje de alumnos que han superado la asignatura: " + porcentajeSuperado + "%");
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de sobresalientes: " + porcentajeSobresalientes + "%");
    }
}
