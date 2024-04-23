public class Ejercicio136 {
    public static void main(String[] args) {
        for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    try {
                        Thread.sleep(1000); // Esperar 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
