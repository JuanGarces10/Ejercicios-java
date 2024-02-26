import java.util.*;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] digitos = DigitosAleatorios();
        System.out.println("                                 ¡BIENVENIDO!                               ");
        System.out.println("Digite tres numeros diferentes entre el 0 y el 9");
        System.out.println("Tienes maximo 4 intentos para adivinar los 3 numeros generados aleatoriamente");
        int intentos = 0;

        while (intentos < 4) {
            intentos ++;
            System.out.println("Intento # " + intentos);
            int[] intento = new int[3];

            for(int i = 0; i < 3; i++){
                intento[i] = entrada.nextInt();
            }

            String pista = Pista(digitos,intento);
            System.out.println("Pista: " + pista);

            if(pista.equals(" Verde Verde Verde")){
                System.out.println("¡FELICIDADES!. has adivinado los digitos");
            }else if(intentos == 4){
                System.out.println("Has agotado tus 4 intentos. los numeros eran: " + Arrays.toString(digitos));
            }else{
                System.out.println("Sigue intentando...");
            }
        }
    }

    public static int[] DigitosAleatorios(){
        int [] digitos = new int[3];
        for(int i = 0; i < 3; i++){
            digitos[i] = (int) (Math.random() * 10);
        }
        while (digitos[0] == digitos[1] || digitos[0] == digitos[2] || digitos[1] == digitos[2]) {
            for(int i = 0; i < 3; i++){
                digitos[i] = (int) (Math.random() * 10);
            }
        }
        return digitos;
    }

    public static String Pista(int[] numeros, int[] intentos){
        StringBuilder pista = new StringBuilder();
        for(int i = 0; i < 3; i++){
            int indice =  i;
            if(numeros[i] == intentos[i]){
                pista.append(" Verde ");
            }else if(Arrays.stream(numeros).anyMatch(x -> x == intentos[indice])){
                pista.append(" Amarillo ");
            }else{
                pista.append(" Rojo ");
            }
        }
        return pista.toString().trim();
    }
}


