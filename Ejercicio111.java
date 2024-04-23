import java.util.Scanner;

public class Ejercicio111 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Solicitar al usuario ingresar un número de día
        System.out.println("Ingrese un número de día (1 al 7):");
        int numeroDia = leer.nextInt();

        // Determinar el nombre del día según el número ingresado
        String nombreDia;
        switch (numeroDia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miércoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }

        // Mostrar el nombre del día
        System.out.println("El número " + numeroDia + " corresponde a " + nombreDia);

        leer.close();
    }
}
