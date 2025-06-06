package semana04;

import utilitarios.Utils;

public class Ejercicio02 {
    public static void main(String[] args) {
        boolean estaEnPromo = false, esParaMayores = false;
        int dia = 0;
        double estrellas = 0;

        Utils.limpiarConsola();

        dia = Utils.leerEntero("Día: ");

        estaEnPromo = Utils.leerBoolean("Esta en promo");

        estrellas = Utils.leerDoble("Estrellas: ");

        esParaMayores = Utils.leerBoolean("Es para mayores");

        if ((dia > 15 || estaEnPromo) && (estrellas > 4 || !esParaMayores)) {
            System.out.println("Vamos al cine!!");
        } else {
            System.out.println("Una noche de Amazon Prime!");
        }

        
    }
}
