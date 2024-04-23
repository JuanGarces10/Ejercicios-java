import java.util.Scanner;

public class Ejercicio166 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        double imc = peso / (estatura * estatura);
        
        System.out.println("Su IMC es: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Obesidad grado I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Obesidad grado II");
        } else {
            System.out.println("Obesidad grado III (mórbida)");
        }
        
        scanner.close();
    }
}
