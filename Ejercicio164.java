import java.util.Scanner;

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBoletos = 0;
        int ventaBruta = 0;
        int ventaAdultos = 0;
        int ventaNiños = 0;
        int ventaPromociones = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Venta " + (i + 1));
            System.out.print("Ingrese el tipo de boleto (1 - Adulto, 2 - Niño, 3 - Promociones): ");
            int tipoBoleto = scanner.nextInt();
            System.out.print("Ingrese la cantidad de boletos vendidos: ");
            int cantidadBoletos = scanner.nextInt();

            totalBoletos += cantidadBoletos;

            switch (tipoBoleto) {
                case 1:
                    ventaBruta += cantidadBoletos * 60;
                    ventaAdultos += cantidadBoletos;
                    break;
                case 2:
                    ventaBruta += cantidadBoletos * 30;
                    ventaNiños += cantidadBoletos;
                    break;
                case 3:
                    ventaBruta += cantidadBoletos * 20;
                    ventaPromociones += cantidadBoletos;
                    break;
                default:
                    System.out.println("Tipo de boleto inválido. No se contabiliza la venta.");
            }
        }

        System.out.println("Resumen de ventas:");
        System.out.println("Total de boletos vendidos: " + totalBoletos);
        System.out.println("Venta bruta total: " + ventaBruta);
        System.out.println("Venta de boletos para adultos: " + ventaAdultos);
        System.out.println("Venta de boletos para niños: " + ventaNiños);
        System.out.println("Venta de boletos promocionales: " + ventaPromociones);

        scanner.close();
    }
}
