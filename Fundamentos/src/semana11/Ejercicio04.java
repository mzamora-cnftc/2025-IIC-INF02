package semana11;

import utilitarios.Utils;

public class Ejercicio04 {

    public static void leerClientes(String[] clientes, double[] saldos) {
        for (int i = 0; i < saldos.length; i++) {
            System.out.println("Digite el cliente #" + (i+1));
            clientes[i] = Utils.leerString("Digite el nombre: ");
            saldos[i] = Utils.leerEntero("Digite el saldo: ");
        }
    }

    public static void imprimirCliente(String[] clientes, double[] saldos) {
        System.out.printf("%4s %20s %12s\n", " ID ", "Nombre","Saldo");
        for (int i = 0; i < saldos.length; i++) {
            System.out.printf("%4d %-20s %12.2f\n", (i+1), clientes[i], saldos[i]);
        }
    }

    public static int contarValoresIguales(double[] valores, double valor) {
        int contador = 0;

        for (double v : valores) {
            if (v == valor) {
                contador++;
            }
        }

        return contador;
    }

    public static double calcularPromedio(double[] valores) {
        double acumulador;
        acumulador = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < acumulador) {
                acumulador = acumulador + valores[i];
            }
        }

        return acumulador / valores.length;
    }

    public static double encontrarValorMenor(double[] valores) {
        double menor;
        menor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        return menor;
    }

    public static double encontrarValorMayor(double[] valores) {
        double mayor;
        mayor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > mayor) {
                mayor = valores[i];
            }
        }

        return mayor;
    }

    public static void main(String[] args) {
        


        String[] opcionesMenu = {"Inicializar", "Registrar todos clientes", "Actualizar Cliente", "Imprimir clientes", "Salir"};
        String  opcion = "";
        int opcionSeleccionada;
        String[] nombres = null;
        double[] saldos = null;
        int n;


        do {
            Utils.limpiarConsola();
            opcionSeleccionada = Utils.seleccionarElementoTexto("MENU", opcionesMenu) - 1;
            opcion = opcionesMenu[opcionSeleccionada];
            System.out.println("Usted escogio la opción " + opcion);
            
            switch (opcion) {
                case "Inicializar":
                    n = Utils.leerEntero("Digite la cantidad de clientes: ");
                    nombres = new String[n];
                    saldos = new double[n];
                    break;
                case "Registrar todos clientes":
                    leerClientes(nombres, saldos);
                    break;
                case "Actualizar Cliente":
                    n = Utils.seleccionarElementoTexto("Seleccione el cliente", nombres) -1;
                    saldos[n] = Utils.leerDoble("Digite el nuevo saldo: ");
                    break;
                case "Imprimir clientes":
                    imprimirCliente(nombres, saldos);
                    Utils.pausar();
                    break;
                case "Salir":
                    System.out.println("CIAO");
                    break;
            }
        } while (!"Salir".equalsIgnoreCase(opcion));

    }

}
