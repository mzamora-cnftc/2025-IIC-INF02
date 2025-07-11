package semana09;

import utilitarios.Utils;

public class Ejercicio01 {

    public static double calcularHipotenusa(double cat1, double cat2) {
        return Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
    }

    public static void main(String[] args) {
        double c1, c2;
        Utils.limpiarConsola();
        c1 = Utils.leerDoble("Digite el primer cateto: ");
        c2 = Utils.leerDoble("Digite el segundo cateto: ");
        System.out.printf("La hipotenusa es: %.2f\n", calcularHipotenusa(c1, c2));
    }
}
