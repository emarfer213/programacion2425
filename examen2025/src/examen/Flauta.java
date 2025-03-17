package examen;

public class Flauta extends InstrumentoMusical implements Tocable, Portable{
    private double peso;

    public Flauta(String nombre, boolean afinado, double peso) {
        super(nombre, TipoMaterial.plastico, Familia.viento, afinado);
        this.peso = peso;
    }


    /**
     * comprobara el peso y dira si es trasportable dependiendo de si es mayor a 3 o no
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
