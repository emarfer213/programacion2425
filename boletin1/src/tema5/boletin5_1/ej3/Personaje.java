package tema5.boletin5_1.ej3;

import tema4.personaException;

public class Personaje {
    private static final int fuerzaMaxima=20;
    private static final int fuerzaMinima=0;
    private static final int inteligenciaMaxima=20;
    private static final int inteligenciaMinima=0;
    private static final int VIDA_MIN=0;

    private String nombre;
    private TRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vida;
    private final int vidaMax;


    public Personaje(String nombre, TRaza raza, int fuerza, int inteligencia, int vida, int vidaMax, int vidaMax1) {
        this.nombre = nombre;
        this.raza = raza;
        this.vidaMax = vidaMax1;
        comprobarVidaMax(vidaMax);

    }

    public void setFuerza(int fuerza) throws personaException{
        if (fuerza<fuerzaMinima || fuerza>fuerzaMaxima) {
            throw new personaException("el valor de fuerza no es valido");
        }
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) throws personaException{
        if (inteligencia<inteligenciaMinima || inteligencia > inteligenciaMaxima){
            throw new personaException("el valor de inteligencia no es valido");
        }
        this.inteligencia = inteligencia;

    }

    public void setVida(int vida) throws personaException {
        if (vida<VIDA_MIN || vida>vidaMax){
            throw new personaException("valores de vida no validos");
        }

        this.vida = vida;
    }

    private void comprobarVidaMax(int vidaMax) throws personaException{
        if (vidaMax <= 0 || vidaMax >= 100) {
            throw new personaException("valor de vida np aceptado");
        }
    }


}
