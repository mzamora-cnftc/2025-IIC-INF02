package semana06;

import utilitarios.Utils;

public class Ejemplo01 {

    public static void main(String[] args) {
        int limite;
        double total = 0, valor = 0, promedio = 0;

        Utils.limpiarConsola();

        limite = Utils.leerEntero("Digite la cantidad de datos a digitar: ");

        // i++
        // i = i + 1

        // i--
        // i = i - 1
        
        for (int i = 0; i < limite; i++) {
            valor = Utils.leerDoble("Digite el valor: ");
            total = total + valor;
            // total += valor;
        }

        promedio = total / limite;

        System.out.println("Promedio: " + promedio);
    }
}