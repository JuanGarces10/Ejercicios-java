import java.util.*;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las horas trabajadas por el profesor: ");
        double horast = entrada.nextDouble();
        System.out.println("Digite la tarifa por hora trabajada: ");
        double tarijah = entrada.nextDouble();

        double sueldototal;

        if(horast > 40){
            double horasx = horast - 40;
            double tarifax = tarijah * 1.5;
            sueldototal = (40 * tarijah) + (horasx * tarifax);
        }else{
            sueldototal = horast * tarijah;
        }
        System.out.println("El salario del profesor es: $" + sueldototal);
    }
}
