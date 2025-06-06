package semana04;

import utilitarios.Utils;

public class Casting {
    public static void main(String[] args) {
        int x = 1, y = 3, z = 100, r = 0, conPerdida;
        double r2;
        Utils.limpiarConsola();
        System.out.println("Enteros");
        r = (x/y)*100;
        System.out.println(r);

        System.out.println("Casting");
        r2 = ( (double) x/y)*100;
        System.out.println(r2);

        System.out.println("Cambie el 100 entero a 100 con decimales");
        r2 = ( x/y)*100.0;
        System.out.println(r2);        

        System.out.println("Pongo una constante double a mulplicar");
        r2 = ( 1.0*x/y)*100;
        System.out.println(r2);           

        System.out.println("Coloncan postfijos a los números");
        r2 = ( 1d *x/y)*100;
        System.out.println(r2);  

        conPerdida = (int) r2;
        System.out.println("Con pérdida de información permitida: "+conPerdida);
    }
}
