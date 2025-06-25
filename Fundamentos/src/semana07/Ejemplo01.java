package semana07;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int numero;

        numero = Utils.leerEntero("Digite el valor inicial: ");

        while (numero >= 0) {
            System.out.println("Dentro del ciclo");
            numero = Utils.leerEntero("Digite un número: ");
            
        }
    }
}
