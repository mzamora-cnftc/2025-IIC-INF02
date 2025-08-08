package semana13;

import java.util.Arrays;

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
        System.out.printf("%-15s", "ESTUDIANTE");
        for (int i = 0; i < etiCols.length; i++) {
            System.out.printf("%15s", etiCols[i]);
        }
        System.out.println();
        for (int i = 0; i < etiFilas.length; i++) {
            System.out.printf("%-15s", etiFilas[i]);
            for (int j = 0; j < etiCols.length; j++) {
                System.out.printf("%15.2f", valores[i][j]);
            }
            System.out.println();

        }
    }


    public static double identificarValorMayorArregloDobles(double[] arreglo) {
        double mayor = Double.MIN_VALUE;
        for (double valorIndividual : arreglo) {
            mayor = Math.max(mayor, valorIndividual);
        }
        return mayor;
    }

    public static double[] identificarValoresMayoresPorFila(double[][] valores) {
        int filas = valores.length;
        double[] fila;
        double[] mayorPorFila = new double[filas];
        Arrays.fill(mayorPorFila, Double.MIN_VALUE);
        for (int i = 0; i < valores.length; i++) {
            fila = valores[i];
            mayorPorFila[i] = identificarValorMayorArregloDobles(fila);
        }

        return mayorPorFila;

    }

    public static double[] identificarValoresMayoresPorColumna(double[][] valores) {
        int filas = valores.length;
        int columnas = valores[0].length;
        double[] mayorPorColumna = new double[columnas];
        Arrays.fill(mayorPorColumna, Double.MIN_VALUE);
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                mayorPorColumna[j] = Math.max(mayorPorColumna[j], valores[i][j]);
            }
        }

        return mayorPorColumna;

    }

    public static void llenarArregloString(String[] datos, String pregunta) {
        System.out.println(pregunta);
        for (int i = 0; i < datos.length; i++) {
            datos[i] = Utils.leerString("Digite el valor para la posición " + (i + 1) + ": ");
        }
    }

    public static double obtenerValorMayor(double[][] matriz) { 
        double mayor = Double.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mayor = Math.max(mayor, matriz[i][j]);
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        double[][] notas = null;
        String[] estudiantes = null;
        String[] pruebas = null;
        int nEstudiantes;
        int nPruebas;
        String[] opciones;
        String opcion;
        int iOpcion;

        // nEstudiantes = Utils.leerEntero("Digite la cantidad de estudiantes: ");
        // nPruebas = Utils.leerEntero("Digite la cantidad de pruebas: ");

        // estudiantes = new String[nEstudiantes];
        estudiantes = new String[] { "Paula", "Kath", "Trayce", "Linda" };
        // pruebas = new String[nPruebas];
        pruebas = new String[] { "Español", "Ciencias" };

        // notas = new double[estudiantes.length][pruebas.length];
        notas = new double[][] { { 90, 100 }, { 95, 95 }, { 97.5, 92.5 }, { 96, 94 } };
        // cargarNumerosAleatorios(notas);

        // llenarArregloString(estudiantes, "Digite el nombre de los estudiantes");
        // llenarArregloString(pruebas, "Digite el nombre de las pruebas");

        // imprimir(estudiantes, pruebas, notas);

        opciones = new String[] { "Inicializar", "Asignar estudiantes", "Asignar pruebas", "Asignar notas",
                "Obtener nota mayor global", "Obtener nota mayor por prueba", "Obtener nota mayor por estudiante",
                "Salir" };
        do {
            Utils.limpiarConsola();
            iOpcion = Utils.seleccionarElementoTexto("MENU", opciones);
            opcion = opciones[iOpcion - 1];
            System.out.println(opcion);
            switch (opcion) {
                case "Inicializar":

                    break;
                case "Asignar estudiantes":

                    break;
                case "Asignar pruebas":

                    break;
                case "Asignar notas":

                    break;
                case "Obtener nota mayor global":
                    imprimir(estudiantes, pruebas, notas);
                    System.out.printf("Mayor es %.2f\n", obtenerValorMayor(notas));
                    break;
                case "Obtener nota mayor por prueba":
                    double[] notasMayores = identificarValoresMayoresPorColumna(notas);
                    imprimir(estudiantes, pruebas, notas);
                    for (int i = 0; i < notasMayores.length; i++) {
                        System.out.printf("%-15s %15.2f\n",pruebas[i], notasMayores[i]);
                    }
                    break;
                case "Obtener nota mayor por estudiante":
                    double[] notasMayoresFila = identificarValoresMayoresPorFila(notas);
                    imprimir(estudiantes, pruebas, notas);
                    for (int i = 0; i < notasMayoresFila.length; i++) {
                        System.out.printf("%-15s %15.2f\n",estudiantes[i], notasMayoresFila[i]);
                    }
                    break;

            }
            Utils.pausar();
        } while (!"SALIR".equalsIgnoreCase(opcion));

    }
}
