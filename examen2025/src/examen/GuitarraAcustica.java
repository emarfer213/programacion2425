package examen;

public class GuitarraAcustica extends InstrumentoMusical implements Portable, Tocable{
    /**
     * parametro particular para ver el peso
     */
    private double peso;

    /**
     * @param nombre
     * @param afinado
     * @param peso
     */
    public GuitarraAcustica(String nombre, boolean afinado, double peso) {
        super(nombre, TipoMaterial.madera, Familia.cuerda, afinado);
        this.peso = peso;
    }

    /**
     * llamado a las interfaces correspondientes a esta clase, para comprobar si es portatil, si esta afinada y para tocar el instrumento
     * @return
     */
    @Override

    /**
     * comprobara el peso y dira si es trasportable dependiendo de si es mayor a 3 o no
     */
    public String comprobarPortabilidad() {
        if (peso > 3){
            System.out.println("el instrumento no es transportanble");
        } else {
            System.out.println("el instrumento es facil de transportar");
        }
        return null;
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
