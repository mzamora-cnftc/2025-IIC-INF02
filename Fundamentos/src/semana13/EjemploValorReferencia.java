package semana13;

import java.util.Arrays;

public class EjemploValorReferencia {

    public static void sumar1(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] + 1;
        }
    }

    public static void sumar1(int variablePrimitiva) {
        System.out.println("Iniciando sumar1");
        System.out.println(variablePrimitiva);
        variablePrimitiva = variablePrimitiva + 1;
        System.out.println(variablePrimitiva);
        System.out.println("Saliendo de sumar1");
    }

    public static void imprimir(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        int[] valores = null;
        valores = new int[4];
        valores[0] = 35;
        valores[1] = 17;
        valores[2] = 8;
        valores[3] = 5;

        int trayce = 0;
        trayce = 10;
        System.out.println(trayce);
        // 10
        sumar1(trayce);
        System.out.println(trayce);
        // 10

        imprimir(valores);
        sumar1(valores);
        imprimir(valores);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                
            }
        }

    }
}
