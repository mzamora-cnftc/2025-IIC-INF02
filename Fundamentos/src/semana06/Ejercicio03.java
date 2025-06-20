package semana06;

import utilitarios.Utils;

public class Ejercicio03 {
    public static void main(String[] args) {
        int factorial = 1, n;

        n = Utils.leerEntero("Digite el factorial n!: ");

        // cambio 0 por 1, porque ocupo que inicie en 1, y necesito que llegue inclusive al 
        // ultimo valor, por eso el es <= n
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.printf("El resultado de %d! es %d\n",n, factorial);
    }
}
