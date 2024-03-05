public class Ejercicio49 {
    public static void main(String[] args) {
        String texto = "Juan Garces";
        char primeraletra = pletra(texto); 
        System.out.println("La primera letra es: " + primeraletra);
    }
    
    public static char pletra(String texto){
        return texto.charAt(0);
    }
}
