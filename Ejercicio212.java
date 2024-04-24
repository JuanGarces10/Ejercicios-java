class Ejercicio212 {
    public static void main(String[] args) {

        double costeVehiculo = 20000;
        double gananciaVendedor = 0.12;
        double impuestos = 0.06;

        double costeConsumidor = costeVehiculo * (1 + gananciaVendedor + impuestos);
        System.out.println("Coste para el consumidor: " + costeConsumidor);
    }
}