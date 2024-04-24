class Ejercicio215 {
    public static void main(String[] args) {

        double kilometrajeAnterior = 120000;
        double kilometrajeActual = 121500;
        double litrosRepostados = 40;
        double cantidadGasolinaActual = 15;

        double kilometrosRecorridos = kilometrajeActual - kilometrajeAnterior;
        double litrosConsumidos = litrosRepostados - cantidadGasolinaActual;
        double consumoPromedio = (litrosConsumidos / kilometrosRecorridos) * 100;

        System.out.println("Consumo medio del coche: " + consumoPromedio + " litros cada 100 kilómetros");
    }
}
