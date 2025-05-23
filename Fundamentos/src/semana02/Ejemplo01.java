package semana02;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        double diametro, radio, area;

        Utils.limpiarConsola();

        diametro = Utils.leerDoble("Por favor digite el diametro: ");

        radio = diametro / 2;

        area = radio * radio * 3.141516;

        System.out.println("Area: " + area);

    }

}