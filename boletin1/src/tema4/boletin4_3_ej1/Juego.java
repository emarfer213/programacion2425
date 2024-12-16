package tema4.boletin4_3_ej1;

import java.util.Random;

public class Juego {

    private Carta[] baraja;


    public Juego() {
        baraja = new Carta[12 * Carta.Palos.length];
        for (int i = 0; i < Carta.Palos.length; i++) {
            for (int j = 1; j <= 12; j++) {
                baraja[i * 12 + j - 1] = new Carta(Carta.Palos[i], j);

            }
        }
    }

    public String mostrarBaraja() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baraja.length; i++) {
            sb.append(baraja[i]).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void barajar(){
        Random random = new Random();
        for (int i = 0; i < baraja.length; i++) {
            int nuevaPosicion = random.nextInt(baraja.length);

        }

    }


}
