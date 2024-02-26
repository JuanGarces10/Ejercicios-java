import java.util.*;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero de empleados de la empresa: ");
        int n = entrada.nextInt();

        double salariototal = 0;
        int mujeres = 0;
        int hombres = 0;
        int mas700 = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Empleado #" + (i + 1));
            System.out.println("Digite su sexo (M/F): ");
            char  sexo = entrada.next().charAt(0);
            System.out.println("Digite su salario: ");
            double salario = entrada.nextDouble();

            salariototal += salario;

            if(sexo == 'F' || sexo == 'f'){
                mujeres++;
            }else if(sexo == 'M' || sexo == 'm'){
                hombres++;
            }

            if(salario > 700){
                mas700++;
            }

        }

        double psalario = (double) salariototal / n;
        double pmujeres = (double) mujeres / n * 100;
        double phombres = (double) hombres /n * 100;

        System.out.println("El total de persona que ganan mas de 700 es: " + mas700);
        System.out.println("El promedio de salarios es: " + psalario);
        System.out.println("El porcentaje de mujeres es " + pmujeres + "%");
        System.out.println("El porcentaje de hombres es " + phombres + "%");
    }
    
}
