package semana02;

import utilitarios.Utils;

public class Ejercicio01 {

    public static double PORCENTAJE_IMPUESTO = 0.13;
    public static void main(String[] args) {
        String nombreProducto = null;
        double precio = 0, precioFinal = 0, montoImpuesto = 0;

        Utils.limpiarConsola();

        // Entrada
        nombreProducto = Utils.leerString("Digite el nombre del producto: ");

        precio = Utils.leerDoble("Digite el precio del producto: ");

        // Proceso
        montoImpuesto = precio * PORCENTAJE_IMPUESTO;
        precioFinal = precio + montoImpuesto;


        // Salida
        System.out.println(nombreProducto + " " + precioFinal);

    }
}
