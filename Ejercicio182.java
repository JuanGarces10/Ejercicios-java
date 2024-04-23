import java.util.Scanner;

public class Ejercicio182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número menor o igual a 1000: ");
        int numero = scanner.nextInt();
        
        if (numero < 1 || numero > 1000) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            String[] unidadesRomanas = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String[] decenasRomanas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] centenasRomanas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            
            int centenas = numero / 100;
            int decenas = (numero % 100) / 10;
            int unidades = numero % 10;
            
            String numeroRomano = centenasRomanas[centenas] + decenasRomanas[decenas] + unidadesRomanas[unidades];
            
            System.out.println("El número " + numero + " en números romanos es: " + numeroRomano);
        }
        
        scanner.close();
    }
}
