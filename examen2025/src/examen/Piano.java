package examen;

public class Piano extends InstrumentoMusical implements Tocable{
    /**
     * @param nombre
     * @param afinado
     */
    public Piano(String nombre, boolean afinado) {
        super(nombre, TipoMaterial.madera, Familia.cuerda, afinado);
    }

    /**
     * comprobara si esta afinado o no y si no lo esta enviara un mensaje de que esta afinando el instrumento
     * @return
     */
    @Override
    public String comprobarAfinado() {
        if (!isAfinado()){
            System.out.printf("Afinando el instrumento musical %s\n", getNombre());
        }
        return null;
    }

    /**
     * enviara un mensaje de que se esta tocando el instrumento
     * @return
     */
    @Override
    public String tocarInstrumento() {
        System.out.printf("Tocando el instrumento musical %s\n", getNombre());
        return null;
    }
}
