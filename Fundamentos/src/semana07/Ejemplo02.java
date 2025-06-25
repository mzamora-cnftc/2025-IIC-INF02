package semana07;

import utilitarios.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        int numero = 10;

        do {
            numero = Utils.leerEntero("Digite el número: ");
        } while (numero >= 0);
    }
}
