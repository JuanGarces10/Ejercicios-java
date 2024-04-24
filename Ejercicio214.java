class Ejercicio214 {
    public static void main(String[] args) {

        double inversionPersona1 = 5000;
        double inversionPersona2 = 7000;
        double inversionPersona3 = 8000;

        double inversionTotal = inversionPersona1 + inversionPersona2 + inversionPersona3;

        double porcentajePersona1 = (inversionPersona1 / inversionTotal) * 100;
        double porcentajePersona2 = (inversionPersona2 / inversionTotal) * 100;
        double porcentajePersona3 = (inversionPersona3 / inversionTotal) * 100;

        System.out.println("Porcentaje de inversión de la persona 1: " + porcentajePersona1 + "%");
        System.out.println("Porcentaje de inversión de la persona 2: " + porcentajePersona2 + "%");
        System.out.println("Porcentaje de inversión de la persona 3: " + porcentajePersona3 + "%");
    }
}
