package semana09;

import utilitarios.Utils;

public class Ejercicio08 {

    public static boolean probarPalabraPalindrome(String palabra) {
        boolean esPalindrome = true;

        int ultimaPos = palabra.length() - 1;
        int mitad = ultimaPos / 2;

        for (int i = 0; i < mitad; i++) {
            if (palabra.charAt(i) != palabra.charAt(ultimaPos - i)) {
                esPalindrome = false;
            }

        }

        return esPalindrome;
    }

    public static void main(String[] args) {
        Utils.limpiarConsola();
        boolean esPalindrome = true;
        esPalindrome = probarPalabraPalindrome("salas");
        if (esPalindrome) {
            System.out.println("Si es");
        } else {
            System.out.println("No es");
        }

    }
}
