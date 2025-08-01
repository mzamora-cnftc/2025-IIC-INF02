package semana11;

import utilitarios.Utils;

public class Ejemplo02 {

    public static void leerValores(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = Utils.leerEntero("Digite el valor de la posición " + (i+1) +": ");
        }
    }

    public static void imprimirValores(int[] valores) {
        for (int valor : valores) {
            System.out.printf("%10d\n", valor);
        }
    }

    public static int contarValoresPositivos(int[] arreglo) {
        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarValoresNegativos(int[] arreglo) {
        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarValoresIgualesCero(int[] arreglo) {
        int contadorIguales = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == 0) {
                contadorIguales++;
            }
        }

        return contadorIguales;
    }

    public static void main(String[] args) {
        int n;
        int[] arreglo;

        n = Utils.leerEntero("Digite la cantidad de elementos: ");
        arreglo = new int[n];

        Utils.limpiarConsola();
        System.out.println("Digite los valores");
        leerValores(arreglo);

        System.out.println("Ver los valores");
        imprimirValores(arreglo);

        System.out.printf("Cantidad de valores en cero : %d\n", contarValoresIgualesCero(arreglo));
        System.out.printf("Cantidad de valores positivos : %d\n", contarValoresPositivos(arreglo));
        System.out.printf("Cantidad de valores negativos : %d\n", contarValoresNegativos(arreglo));
    }
}