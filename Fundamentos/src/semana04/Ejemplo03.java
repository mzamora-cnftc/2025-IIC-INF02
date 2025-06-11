package semana04;

import utilitarios.Utils;

public class Ejemplo03 {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        int puntaje;
        puntaje = Utils.leerEntero("Digite su puntaje: ");
        if (puntaje >= 90) {
            System.out.println("A");
        } else if (puntaje >= 80) {
            System.out.println("B");
        } else if (puntaje >= 70) {
            System.out.println("C");
        } else { 
            System.out.println("D");
        }
    }
}
