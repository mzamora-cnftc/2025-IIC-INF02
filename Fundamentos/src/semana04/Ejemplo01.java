package semana04;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        double montoFinal = 0, cantidadCompras = 0, montoCompras = 0;

        Utils.limpiarConsola();

        cantidadCompras = Utils.leerDoble("Digite la cantidad de compras: ");

        montoCompras = Utils.leerDoble("Digite el monto de las compras: ");

        if (cantidadCompras >= 6 && montoCompras >= 10000) {
            Utils.establecerColorVerde();
            montoFinal = montoCompras - montoCompras * 0.35;
        } else {
            Utils.establecerColorRojo();
            montoFinal = montoCompras;
        }

        System.out.println("Monto final: " + montoFinal);

        Utils.reiniciarColores();

    }
}
