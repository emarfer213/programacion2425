package tema4.boletin4_3_ej1;

import java.lang.reflect.Array;

public class Carta {
    public static final String[] Palos = {"espadas", "oro", "bastos", "copas"};
    private String palo;
    private int numero;


    public Carta(String palo, int numero) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public String toString(){
        return numero + " de " + palo;
    }
}
