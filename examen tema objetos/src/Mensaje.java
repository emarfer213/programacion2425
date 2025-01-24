public class Mensaje {
    private String textoMensaje;
    private boolean publico;
    private int contadorDeLikes;
    private String[] mensajes;


    public Mensaje(String textoMensaje, boolean publicoPrivado) {
        this.textoMensaje = textoMensaje;
        this.publico = publicoPrivado;
        this.contadorDeLikes = 0;

        if (textoMensaje.length() > 150) {
            throw new MensajeException("ha superado la longitud maxima");
        }
    }


    public String getTextoMensaje() {
        return textoMensaje;
    }

    public boolean isPublico() {
        return publico;
    }

    public int getContadorDeLikes() {
        return contadorDeLikes;
    }

    public void setContadorDeLikes() {
        this.contadorDeLikes++;
    }

    public String[] getMensajes() {
        return mensajes;
    }
}
