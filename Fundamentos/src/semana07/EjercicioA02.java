package semana07;

import utilitarios.Utils;

public class EjercicioA02 {

    public static void main(String[] args) {
        boolean esResidente, esRepartidor, estaAcompañado, tieneCarneVigente, hayMasVisitas, esPaqueteUrgente,
                puedePasar, esVisitate;
        int hora, cantidadResidentes = 0, cantidadVisitante = 0, cantidadRepartidores = 0;

        do {
            puedePasar = false;
            esResidente = Utils.leerBoolean("Es residente");
            if (esResidente) {
                tieneCarneVigente = Utils.leerBoolean("Tiene carné vigente");
                if (tieneCarneVigente) {
                    puedePasar = true;
                    cantidadResidentes++;
                }
            } else {
                esVisitate = Utils.leerBoolean("Es visitante");
                if (esVisitate) {
                    estaAcompañado = Utils.leerBoolean("Viene acompañado de un residente");
                    puedePasar = estaAcompañado;
                    cantidadVisitante = cantidadVisitante + (puedePasar ? 1 : 0);

                } else {
                    esRepartidor = Utils.leerBoolean("Es repartidor");
                    if (esRepartidor) {
                        esPaqueteUrgente = Utils.leerBoolean("Tiene un paquete urgente");
                        if (esPaqueteUrgente) {
                            puedePasar = true;
                            cantidadRepartidores++;
                        } else {
                            hora = Utils.leerRangosEnteros("Digite la hora: ", 0, 23);
                            if (hora >= 12 && hora <= 14) {
                                puedePasar = true;
                                cantidadRepartidores++;
                            }
                        }
                    }
                }
            }
            if (puedePasar) {
                System.out.println("Si pase");
            } else {
                System.out.println("no pase :)");
            }
            hayMasVisitas = Utils.leerBoolean("Hay más visitas");
        } while (hayMasVisitas);
        // reporte
    }
}