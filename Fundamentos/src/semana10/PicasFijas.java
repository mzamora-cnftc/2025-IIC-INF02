package semana10;

import utilitarios.Utils;

public class PicasFijas {
    public static void main(String[] args) {
        Utils.limpiarConsola();
        int numeroSecreto, numeroUsuario, intentos = 0;
        numeroSecreto = generarNumeroSecreto();
        do {
            System.out.printf("Intento #%d\n", (intentos + 1));
            numeroUsuario = leerNumeroSecreto();
            System.out.printf("Picas: %d\n", contarPicas(numeroSecreto, numeroUsuario));
            System.out.printf("Fijas: %d\n", contarFijas(numeroSecreto, numeroUsuario));
            intentos++;
        } while (intentos < 5 && numeroSecreto != numeroUsuario);
        if (numeroSecreto == numeroUsuario) {
            System.out.println("Felicidades adivino el número");
        } else {
            System.out.println("Ingrese dos monedas para continuar");
        }

        System.out.println(numeroSecreto);
    }

    public static int leerNumeroSecreto() {
        int numero = 0;
        do {
            numero = Utils.leerEntero("Digite un número de 4 digitos diferentes: ");
        } while (!esNumeroValido(numero));

        return numero;
    }

    public static int generarNumeroSecreto() {
        int numero = 0;
        do {
            numero = Utils.generarNumerosEntre(1000, 9999);
        } while (!esNumeroValido(numero));

        return numero;
    }

    public static boolean esNumeroValido(int numero) {
        boolean esValido = true;

        esValido = numero >= 1000 && numero <= 9999 && validarDigitosUnicos(numero);

        return esValido;
    }

    public static int analizarPica(int pica, int x, int y, int z) {
        int salida = 0;

        if (pica == x || pica == y || pica == z) {
            salida = 1;
        }

        return salida;
    }

    public static int contarPicas(int numero1, int numero2) {

        int cantidad = 0;

        int m1 = numero1 / 1000;
        int c1 = (numero1 / 100) % 10;
        int d1 = (numero1 / 10) % 10;
        int u1 = numero1 % 10;

        int m2 = numero2 / 1000;
        int c2 = (numero2 / 100) % 10;
        int d2 = (numero2 / 10) % 10;
        int u2 = numero2 % 10;

        cantidad += analizarPica(m1, c2, d2, u2);
        cantidad += analizarPica(c1, m2, d2, u2);
        cantidad += analizarPica(d1, m2, c2, u2);
        cantidad += analizarPica(u1, m2, c2, d2);

        return cantidad;
    }

    public static int contarFijas(int numero1, int numero2) {

        int cantidad = 0;

        int m1 = numero1 / 1000;
        int c1 = (numero1 / 100) % 10;
        int d1 = (numero1 / 10) % 10;
        int u1 = numero1 % 10;

        int m2 = numero2 / 1000;
        int c2 = (numero2 / 100) % 10;
        int d2 = (numero2 / 10) % 10;
        int u2 = numero2 % 10;

        if (m1 == m2) {
            cantidad = cantidad + 1;
        }

        cantidad = cantidad + ((c1 == c2) ? 1 : 0);
        cantidad = cantidad + ((d1 == d2) ? 1 : 0);
        cantidad = cantidad + ((u1 == u2) ? 1 : 0);

        return cantidad;
    }

    public static boolean validarDigitosUnicos(double numero) {
        int n = (int) numero;
        boolean salida = true;

        int digito1 = n / 1000;
        int digito2 = (n / 100) % 10;
        int digito3 = (n / 10) % 10;
        int digito4 = n % 10;

        if (digito1 == digito2 || digito1 == digito3 || digito1 == digito4 ||
                digito2 == digito3 || digito2 == digito4 || digito3 == digito4) {
            return false; // hay dígitos repetidos
        }
        return salida;
    }
}
