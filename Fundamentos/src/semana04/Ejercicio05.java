package semana04;

import utilitarios.Utils;

public class Ejercicio05 {

    public static void main(String[] args) {
        double edad = 0;

        Utils.limpiarConsola();

        edad = Utils.leerDoble("Digite la edad de la piedra: ");

        if (edad <= 65.5 ) {
            System.out.println("Cenozoica");
        } else if (edad < 251) {
            System.out.println("Mesozoica");
        } else if (edad < 542) {
            System.out.println("Paleozoica");
        }else {
            System.out.println("Pre-Paleozoica");
        }
    }

}