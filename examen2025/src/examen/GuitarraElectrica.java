package examen;

public class GuitarraElectrica extends InstrumentoMusical implements Tocable, Portable, Amplificable{
    /**
     * parametro particular para ver el peso
     */
    private double peso;

    /**
     * @param nombre
     * @param afinado
     * @param peso
     */
    public GuitarraElectrica(String nombre, boolean afinado, double peso) {
        super(nombre, TipoMaterial.metal, Familia.cuerda, afinado);
        this.peso = peso;
    }

    /**
     * comprobara el peso y dira si es trasportable dependiendo de si es mayor a 3 o no
     * @return
     */
    @Override
    public String comprobarPortabilidad() {
        if (peso > 3){
            System.out.println("el instrumento no es transportanble");
        } else {
            System.out.println("el instrumento es facil de transportar");
        }
        return null;
    }

    /**
     *  comprobara si esta afinado o no y si no lo esta enviara un mensaje de que esta afinando el instrumento
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

    /**
     * enviara un mensaje de que se esta conectando al amplificador
     * @return
     */
    @Override
    public String conectarAmplificador() {
        System.out.println("conectando la guitarra electrica al amplificador");
        return null;
    }

    /**
     * enviara un mensaje de que se ha cambiado el volumen
     * @return
     */
    @Override
    public String ajustarVolumen() {
        System.out.println("ajustando volumen del amplificador al 10");
        return null;
    }
}
