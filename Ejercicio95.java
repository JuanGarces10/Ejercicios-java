import java.util.Arrays;
import java.util.Collections;

public class Ejercicio95 {
    public static void main(String[] args) {
        Integer[] vector = {5, 8, 2, 10, 3};
        Arrays.sort(vector, Collections.reverseOrder());
        System.out.println("Vector ordenado de mayor a menor: " + Arrays.toString(vector));
    }
}
