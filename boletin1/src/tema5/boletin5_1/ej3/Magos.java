package tema5.boletin5_1.ej3;

import tema4.personaException;

public class Magos extends Personaje{

    private static final int MIN_INTELIGENCIA = 17;
    private static final int MAX_FUERZA = 15;
    private static final int MAX_NUM_HECHIZOS = 4;
    private static final int VIDA_POR_HECHIZOS = 10;

    private String[] hechizosAprendidos;

    public Magos(String nombre, TRaza raza, int fuerza, int inteligencia, int vida, int vidaMax, int vidaMax1) {
        super(nombre, raza, fuerza, inteligencia, vida, vidaMax, vidaMax1);
        setInteligencia(inteligencia);
        setFuerza(fuerza);
        hechizosAprendidos=new String[MAX_NUM_HECHIZOS];
    }

    @Override
    public void setInteligencia(int inteligencia) throws personaException {
        if (inteligencia<MIN_INTELIGENCIA){
            throw new personaException("un mago no puede tener menos de el minimo");
        }
        super.setInteligencia(inteligencia);
    }

    public int getEspacioDisponible(String nombreHechizo) throws personaException {
        int espacioDisponible= -1;
        for (int i = 0; i < hechizosAprendidos.length; i++) {
            if (nombreHechizo.equalsIgnoreCase(hechizosAprendidos[i])){
                throw new personaException("este hechizo ya esta aprendido");
            }

            if (hechizosAprendidos[i] == null && espacioDisponible==-1){
                espacioDisponible = i;
            }
        }
        return espacioDisponible;
    }
}
