import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio175 {
    public static void main(String[] args) {
        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        // Restar un día a la fecha actual
        LocalDate fechaAnterior = fechaActual.minusDays(1);
        
        // Formatear las fechas como texto en formato YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualTexto = fechaActual.format(formatter);
        String fechaAnteriorTexto = fechaAnterior.format(formatter);
        
        System.out.println("Fecha actual: " + fechaActualTexto);
        System.out.println("Fecha del día anterior: " + fechaAnteriorTexto);
    }
}
