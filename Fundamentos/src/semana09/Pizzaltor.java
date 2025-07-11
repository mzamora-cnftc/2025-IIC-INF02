package semana09;

import utilitarios.Utils;

public class Pizzaltor {

    public static double calcularPorcentajeBorde(double diametroPizza, double borde) {
        double porcentaje, radio;

        radio = diametroPizza / 2;

        porcentaje = calcularDiferenciaAreaCirculos(radio, radio-borde) / calcularAreaCirculo(radio);

        return porcentaje;
    }

    public static double calcularDiferenciaAreaCirculos(double radio1, double radio2) {
        double mayor, menor, area;
        mayor = Math.max(radio1, radio2);
        menor = Math.min(radio1, radio2);

        area = calcularAreaCirculo(mayor) - calcularAreaCirculo(menor);

        return area;
    }

    /**
     * Esta función calcula el área de un círculo
     * @param radio
     * @return
     */
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }


    /**
     * Esta función devuelve el ratio del costo de la pizza entre las pulgadas cuadra de la misma.
     * @param diametroEnPulgadas Es el tamaño de la pizza.
     * @param costo Es el costo en dinero de lo que vale la pizza.
     * @return Es el ratio del costo entre área.
     */
    public static double calcularCostoPorPulgadaCuadrada(double diametroEnPulgadas, double costo) {
        double resultado = 0;
        double area, radio;

        radio = diametroEnPulgadas / 2;

        area = Math.pow(radio, 2) * Math.PI;

        resultado = costo / area;

        return resultado;
    }

    public static String generarSalidaPorcentajeBorde(double diametro, double borde) {
        return String.format("Porcentaje de borde es %.3f de una pizza de %.2f\" y el borde es %.2f\"", calcularPorcentajeBorde(diametro,borde),diametro,borde);
    }

    public static void main(String[] args) {
        double ratio;
        Utils.limpiarConsola();
        ratio = calcularCostoPorPulgadaCuadrada(14, 10990);
        System.out.println(ratio);
        System.out.println(generarSalidaPorcentajeBorde(10, 1));
        System.out.println(generarSalidaPorcentajeBorde(10, 1.25));
        System.out.println(generarSalidaPorcentajeBorde(10, 1.5));
        System.out.println(generarSalidaPorcentajeBorde(12, 1));
        System.out.println(generarSalidaPorcentajeBorde(12, 1.25));
        System.out.println(generarSalidaPorcentajeBorde(12, 1.5));        
        System.out.println(generarSalidaPorcentajeBorde(14, 1));
        System.out.println(generarSalidaPorcentajeBorde(14, 1.25));
        System.out.println(generarSalidaPorcentajeBorde(14, 1.5));        
    }
}