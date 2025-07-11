package semana09;

import utilitarios.Utils;

public class Ejercicio04 {


    public static int obtenerMayorDos(int a, int b) {
        int salida;
        if (a > b) {
            salida = a;
        } else {
            salida = b;
        }
        return salida;
    }

    public static int obtenerMayor(int a, int b, int c) {
        int ganador = obtenerMayorDos(a, b);
        return obtenerMayorDos(ganador, c);
    }

    public static void main(String[] args) {
        Utils.limpiarConsola();
        System.out.println(obtenerMayor(1, 2, 3));
        System.out.println(obtenerMayor(10, 9, 8));
        System.out.println(obtenerMayor(1, 5, 1));
    }
}
