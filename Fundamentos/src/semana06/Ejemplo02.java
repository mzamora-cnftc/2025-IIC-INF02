package semana06;

import utilitarios.Utils;

public class Ejemplo02 {
    public static void main(String[] args) {
        int nPizzas = 0, nPollos = 0, nHamburguesas = 0, personas = 0;
        char voto;
        // Character

        personas = Utils.leerEntero("Digite la cantidad de personas: ");

        for (int i = 0; i < personas; i++) {
            Utils.limpiarConsola();
            System.out.println("POR FAVOR VOTE POR LA OPCION QUE MAS LE GUSTE");
            System.out.printf("Usted es el voto %d de %d votos\n",i+1,personas);
            System.out.println("a - Pollo");
            System.out.println("b - Pizza");
            System.out.println("c - Hamburguesas");
            System.out.println("Digite a, b, c");

            voto = Utils.leerCaracter("Vote: ");

            switch (voto) {
                case 'a':
                    nPollos++;
                    break;
                case 'b':
                    nPizzas++;
                    break;
                case 'c':
                    nHamburguesas++;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

            Utils.limpiarConsola();
            System.out.println("Resultados:");
            System.out.printf("%-15s: %5.2f\n", "Pollos", (100d * nPollos / personas));
            System.out.printf("%-15s: %5.2f\n", "Pizzas", (100d * nPizzas / personas));
            System.out.printf("%-15s: %5.2f\n", "Hamburguesas", (100d * nHamburguesas / personas));
 
        }
    }
}
