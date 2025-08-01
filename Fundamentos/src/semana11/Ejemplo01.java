package semana11;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int n, total = 0;
        double promedio;
        int[] datos = null;

        Utils.limpiarConsola();

        n = Utils.leerEntero("Digite la cantidad de datos: ");
        // voy a reservar memoria para crear el arreglo
        datos = new int[n];

        for (int i = 0; i < datos.length; i++) {
            datos[i]  =Utils.leerEntero(String.format("Datos #%d: ",i+1));

        }

        for (int i = 0; i < datos.length; i++) {
            total = total + datos[i];
            System.out.printf("Posición %3d : %d \n",i+1,datos[i]);
        }
        
        promedio = (double) total / n;

        System.out.println("Total = " + total);
        System.out.println("Promedio = " + promedio);

    }
}
