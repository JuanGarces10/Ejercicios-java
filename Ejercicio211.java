class Ejercicio211 {
    public static void main(String[] args) {

        int unidadesBocadilloJamón = 2;
        int unidadesBocadilloQueso = 3;
        int unidadesPatatasFritas = 1;
        int unidadesRefresco = 4;
        int unidadesCerveza = 2;
        int precioBocadilloJamón = 15;
        int precioBocadilloQueso = 10;
        int precioPatatasFritas = 5;
        int precioRefresco = 3;
        int precioCerveza = 4;

        int total = unidadesBocadilloJamón * precioBocadilloJamón + unidadesBocadilloQueso * precioBocadilloQueso
                + unidadesPatatasFritas * precioPatatasFritas + unidadesRefresco * precioRefresco
                + unidadesCerveza * precioCerveza;
        System.out.println("Total a pagar: " + total + " Bs.");
    }
}
