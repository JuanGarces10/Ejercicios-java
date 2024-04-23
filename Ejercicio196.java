public class Ejercicio196 {
    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];
        // Llenar el arreglo de ingresos con valores aleatorios
        // (simulando ingresos de cada vendedor en cada producto)
        // Aquí se puede agregar lógica para ingresar datos manualmente o desde un archivo
        // ...

        // Revisar el total de ingresos de cada vendedor
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            System.out.println("Total de ingresos del vendedor " + (i + 1) + ": " + totalVendedor);
        }

        // Calcular el promedio por producto
        for (int j = 0; j < 10; j++) {
            double totalProducto = 0;
            for (int i = 0; i < 18; i++) {
                totalProducto += ingresos[i][j];
            }
            double promedioProducto = totalProducto / 18;
            System.out.println("Promedio del producto " + (j + 1) + ": " + promedioProducto);
        }

        // Calcular el promedio por vendedor
        for (int i = 0; i < 18; i++) {
            double totalVendedor = 0;
            for (int j = 0; j < 10; j++) {
                totalVendedor += ingresos[i][j];
            }
            double promedioVendedor = totalVendedor / 10;
            System.out.println("Promedio del vendedor " + (i + 1) + ": " + promedioVendedor);
        }

        // Calcular los ingresos totales
        double ingresosTotales = 0;
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 10; j++) {
                ingresosTotales += ingresos[i][j];
            }
        }
        System.out.println("Ingresos totales: " + ingresosTotales);
    }
}
