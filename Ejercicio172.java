import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el periodo en formato MM-AAAA: ");
        String periodo = scanner.nextLine();
        
        String[] partes = periodo.split("-");
        int mes = Integer.parseInt(partes[0]);
        int año = Integer.parseInt(partes[1]);
        
        for (int i = 0; i < 12; i++) {
            mes--;
            if (mes == 0) {
                mes = 12;
                año--;
            }
            System.out.printf("%02d-%d\n", mes, año);
        }
        
        scanner.close();
    }
}
