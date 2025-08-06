package semana13;

import utilitarios.Utils;

public class Universidad {


    public static void llenarArregloString(String[] datos, String pregunta){
        System.out.println(pregunta);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = Utils.leerString("Digite el valor para la posición " + (i+1) + ": " );
        }
    }

    public static void main(String[] args) {
        double[][] notas = null;
        String[] estudiantes = null;
        String[] pruebas = null;
        int nEstudiantes;
        int nPruebas;
        
        nEstudiantes = Utils.leerEntero("Digite la cantidad de estudiantes: ");
        nPruebas = Utils.leerEntero("Digite la cantidad de pruebas: ");

        estudiantes = new String[nEstudiantes];
        pruebas = new String[nPruebas];

        notas = new double[nEstudiantes][nPruebas];
        
        llenarArregloString(estudiantes, "Digite el nombre de los estudiantes");
        llenarArregloString(pruebas, "Digite el nombre de las pruebas");

        

        
    }
}
