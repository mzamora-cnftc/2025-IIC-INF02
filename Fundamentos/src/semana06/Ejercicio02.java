package semana06;

import utilitarios.Utils;

public class Ejercicio02 {

    public static void main(String[] args) {
        int n;

        Utils.limpiarConsola();

        n = Utils.leerEntero("Digite el número N: ");

        for (int i = n; i >= 1; i--) {
            System.out.printf("Valor %3d\n",i);
        }
    }
}