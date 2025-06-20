package semana06;

import utilitarios.Utils;

public class Ejemplo04 {
    public static void main(String[] args) {
        int mayor, menor;
        boolean esAzul = true;

        Utils.limpiarConsola();

        menor = Utils.leerEntero("Digite el límite inferior a evaluar: ");
        mayor = Utils.leerEntero("Digite el límite superior a evaluar: ");

        for (int i = menor; i <= mayor; i++) {
            if(i % 3 == 0) {
                if (esAzul) {
                    Utils.establecerColorAzul();
                } else {
                    Utils.establecerColorRojo();

                }
                System.out.println(i);
                esAzul = !esAzul;
            }

        }
    }
}
