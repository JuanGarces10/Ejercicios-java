import java.util.Scanner;

public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre completo de la persona: ");
        String nombreCompleto = scanner.nextLine();
        
        int totalVocales = 0;
        int[] frecuenciaVocales = new int[5]; // 'a', 'e', 'i', 'o', 'u'
        nombreCompleto = nombreCompleto.toLowerCase();
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                totalVocales++;
                switch (letra) {
                    case 'a':
                        frecuenciaVocales[0]++;
                        break;
                    case 'e':
                        frecuenciaVocales[1]++;
                        break;
                    case 'i':
                        frecuenciaVocales[2]++;
                        break;
                    case 'o':
                        frecuenciaVocales[3]++;
                        break;
                    case 'u':
                        frecuenciaVocales[4]++;
                        break;
                }
            }
        }
        
        System.out.println("Total de vocales en el nombre: " + totalVocales);
        System.out.println("Frecuencia de cada vocal:");
        System.out.println("a: " + frecuenciaVocales[0]);
        System.out.println("e: " + frecuenciaVocales[1]);
        System.out.println("i: " + frecuenciaVocales[2]);
        System.out.println("o: " + frecuenciaVocales[3]);
        System.out.println("u: " + frecuenciaVocales[4]);
        
        scanner.close();
    }
}
