package semana03;

import utilitarios.Utils;

public class Ejemplo01 {
    public static void main(String[] args) {
        int numero = 0;

        Utils.limpiarConsola();
        //input
        numero = Utils.leerEntero("Digite el número: ");
        //process
        if (numero < 0) { // si el número es negativo
            numero = numero * -1;
        }
        //output
        System.out.println("Número absoluto es: " +  numero);
    }
}
