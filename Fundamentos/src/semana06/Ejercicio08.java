package semana06;

import utilitarios.Utils;

public class Ejercicio08 {

    public static void main(String[] args) {
        int hormigas, meses;

        Utils.limpiarConsola();
        hormigas = Utils.leerEntero("Digite la población inicial de hormigas: ");
        meses = Utils.leerEntero("Digite la cantidad de meses: ");

        String reporte = "REPORTE DE HORMIGAS EN LA ISLA DEL EDEN\n";
        reporte = reporte + String.format("%3s %12s %12s\n","Mes", "Ctd Inicial", "Ctd Final");

        for (int i = 0; i < meses; i++) {
            reporte = reporte + String.format("%3d ", i+1);
            reporte = reporte + String.format("%12d ", hormigas);
            if (hormigas > 28000) {
                hormigas = (int) (hormigas * 1.31);
            } else {
                hormigas = (int) (hormigas * 1.4);
            }

            if (hormigas >= 7000) {
                hormigas = hormigas - 7000;
            } else {
                hormigas = 0;
            }
            reporte = reporte + String.format("%12d\n", hormigas);
        }

        System.out.println(reporte);

    }
}
