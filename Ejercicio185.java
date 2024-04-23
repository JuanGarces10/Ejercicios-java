import java.util.Scanner;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();
        
        System.out.print("Ingrese su fecha de nacimiento (en formato AAAA-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();
        
        char primerApellido = obtenerPrimerConsonanteInterna(nombreCompleto.split(" ")[0]);
        char segundoApellido = obtenerPrimerConsonanteInterna(nombreCompleto.split(" ")[1]);
        char primerNombre = obtenerPrimerConsonanteInterna(nombreCompleto.split(" ")[2]);
        
        String ultimosDosAnios = fechaNacimiento.substring(2, 4);
        String ultimosDosMeses = fechaNacimiento.substring(5, 7);
        String ultimosDosDias = fechaNacimiento.substring(8);
        
        char digitoVerificador = obtenerDigitoVerificador(fechaNacimiento);
        
        String homoclave = generarHomoclave();
        
        String CURP = primerApellido + "" + segundoApellido + "" + primerNombre +
                      ultimosDosAnios + "" + ultimosDosMeses + "" + ultimosDosDias +
                      obtenerLetraSexo() + obtenerEntidadNacimiento() +
                      digitoVerificador + homoclave;
        
        System.out.println("CURP: " + CURP);
        
        scanner.close();
    }
    
    public static char obtenerPrimerConsonanteInterna(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (esConsonante(letra)) {
                return letra;
            }
        }
        return 'X'; // Valor por defecto si no se encuentra ninguna consonante interna
    }
    
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(letra) != -1;
    }
    
    public static char obtenerLetraSexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su sexo (F o M): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);
        scanner.close();
        return sexo;
    }
    
    public static String obtenerEntidadNacimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la entidad de nacimiento: ");
        String entidad = scanner.nextLine().toUpperCase();
        scanner.close();
        return entidad.substring(0, 2);
    }
    
    public static char obtenerDigitoVerificador(String fechaNacimiento) {
        int anio = Integer.parseInt(fechaNacimiento.substring(0, 4));
        return anio <= 1999 ? obtenerDigitoVerificadorMenor1999(anio) : obtenerDigitoVerificadorMayor1999(anio);
    }
    
    public static char obtenerDigitoVerificadorMenor1999(int anio) {
        return (char) ((anio % 10) + '0'); // Convertir el dígito a carácter
    }
    
    public static char obtenerDigitoVerificadorMayor1999(int anio) {
        return (char) ('A' + (anio - 2000)); // 'A' corresponde a 2000, 'B' a 2001, etc.
    }
    
    public static String generarHomoclave() {
        // Se genera una homoclave aleatoria
        String caracteresHomoclave = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder homoclave = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int indice = (int) (Math.random() * caracteresHomoclave.length());
            homoclave.append(caracteresHomoclave.charAt(indice));
        }
        return homoclave.toString();
    }
}
