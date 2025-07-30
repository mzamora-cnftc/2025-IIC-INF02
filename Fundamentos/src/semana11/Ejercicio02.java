package semana11;

import utilitarios.Utils;

public class Ejercicio02 {

    public static int encontrarMenor(int[] controlRemoto) {
        int menor;
        menor = controlRemoto[0];

        for (int i = 0; i < controlRemoto.length; i++) {
            if (controlRemoto[i] < menor) {
                menor = controlRemoto[i];
            }
        }

        return menor;
    }

    public static int encontrarMayor(int[] controlRemoto) {
        int mayor;
        mayor = controlRemoto[0];

        for (int i = 0; i < controlRemoto.length; i++) {
            if (controlRemoto[i] > mayor) {
                mayor = controlRemoto[i];
            }
        }

        return mayor;
    }

    public static void leerNotas(int[] controlRemoto) {
        for (int i = 0; i < controlRemoto.length; i++) {
            controlRemoto[i] = Utils.leerEntero("Digite la nota #" + (i+1)+": ");
        }
    }

    public static void imprimirNotas(int[] controlRemoto) {
        System.out.printf("%3s %10s\n"," # ","Nota");
        for (int i = 0; i < controlRemoto.length; i++) {
            System.out.printf("%3d %10d\n",i+1,controlRemoto[i]);
        }
    }

    public static void main(String[] args) {
        int n;
        int[] notas; // defino un puntero que a punta a un arreglo de enteros

        Utils.limpiarConsola();
        n = Utils.leerEntero("Digite la cantidad de notas: ");
        notas = new int[n]; //creo el arreglo y lo asigno al puntero

        leerNotas(notas);
        imprimirNotas(notas);
        System.out.println("Mayor: " + encontrarMayor(notas));
        System.out.println("Menor: " + encontrarMenor(notas));
    }
}
