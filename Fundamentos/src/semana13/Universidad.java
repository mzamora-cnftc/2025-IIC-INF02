package semana13;

import utilitarios.Utils;

public class Universidad {

    public static void cargarNumerosAleatorios(double[][] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                valores[i][j] = Utils.generarNumerosEntre(60, 100);
            }
        }
    }

    public static void imprimir(String[] etiFilas, String[] etiCols, double[][] valores) {
        System.out.printf("%-15s","ESTUDIANTE");
        for (int i = 0; i < etiCols.length; i++) {
            System.out.printf("%15s",etiCols[i]);
        }
        System.out.println();
        for (int i = 0; i < etiFilas.length; i++) {
            System.out.printf("%-15s",etiFilas[i]);
            for (int j = 0; j < etiCols.length; j++) {
                System.out.printf("%15.2f",valores[i][j]);
            }
            System.out.println();
            
        }
    }


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

        Utils.limpiarConsola();
        
        //nEstudiantes = Utils.leerEntero("Digite la cantidad de estudiantes: ");
        //nPruebas = Utils.leerEntero("Digite la cantidad de pruebas: ");

        //estudiantes = new String[nEstudiantes];
        estudiantes = new String[] {"Paula", "Kath", "Trayce", "Linda"};
        //pruebas = new String[nPruebas];
        pruebas = new String[] {"Español", "Ciencias"};
        
        notas = new double[estudiantes.length][pruebas.length];
        cargarNumerosAleatorios(notas);
        
        //llenarArregloString(estudiantes, "Digite el nombre de los estudiantes");
        //llenarArregloString(pruebas, "Digite el nombre de las pruebas");

        imprimir(estudiantes, pruebas, notas);

        
    }
}
