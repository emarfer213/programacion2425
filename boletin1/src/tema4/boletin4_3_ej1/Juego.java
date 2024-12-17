package tema4.boletin4_3_ej1;

import java.util.Arrays;
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

    public void barajar() {
        Random random = new Random();
        for (int i = 0; i < baraja.length; i++) {
            int nuevaPosicion = random.nextInt(baraja.length);
            Carta temporal = baraja[i];
            baraja[i] = baraja[nuevaPosicion];
            baraja[nuevaPosicion] = temporal;
        }
    }

    public void repartir(int numJugadores, int numCartas) throws JuegoException {
        if (numJugadores * numCartas > baraja.length) {
            throw new JuegoException("no quedan cartas para repartir");
        }

        for (int i = 0; i < numJugadores; i++) {
            for (int j = 0; j < numCartas; j++) {
                System.out.printf("se reparte al jugador %d la carta %s \n", i + 1, baraja[numCartas * i + j]);
            }
        }

        this.baraja = Arrays.copyOfRange(this.baraja, numJugadores * numCartas, baraja.length);

    }

    public void cartasRestantes() {

    }


}
