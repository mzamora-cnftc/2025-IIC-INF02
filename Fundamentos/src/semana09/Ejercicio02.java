package semana09;

import utilitarios.Utils;

public class Ejercicio02 {

    public static double convertirMetrosEnPulgadas(double metros) {
        double pulgadas;

        pulgadas = metros * 100 / 2.54;

        return pulgadas;
    }

    public static double convertirMetrosEnPies(double metros) {
        return convertirMetrosEnPulgadas(metros) / 12;
    }

    public static void main(String[] args) {
        double metros;
        Utils.limpiarConsola();
        metros = Utils.leerDoble("Digite la cantidad de metros: ");
        System.out.printf("En pulgadas es %.2f\n", convertirMetrosEnPulgadas(metros));
        System.out.printf("En pies es %.2f\n", convertirMetrosEnPies(metros));
    }
}
