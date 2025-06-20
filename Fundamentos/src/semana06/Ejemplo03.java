package semana06;

import utilitarios.Utils;

public class Ejemplo03 {
    public static void main(String[] args) {
        int cantidad1, cantidad2, cantidad3;
        String salida = "";


        salida = salida + String.format("%s, %s, %s\n", "Cantidad", "Costo", "Total");
        for (int i = 0; i < 1000; i++) {
            cantidad1 = Utils.generarNumerosEntre(500, 600);
            cantidad2 = Utils.generarNumerosEntre(5, 10)*5000;
            cantidad3 = cantidad1 * cantidad2;
            salida = salida + String.format("%d, %d, %d\n", cantidad1, cantidad2, cantidad3);
        }

        Utils.escribirArchivo("salida.csv", salida);
    }    
}
