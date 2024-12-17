package tema4.boletin4_3_ej2;

public class persona {
    public static final int tamBuzon = 5;
    private String nombre;
    private Mensaje[] mensajesRecibidos;
    private Mensaje[] mensajesEnviados;

    public persona(String nombre) {
        this.nombre = nombre;
        this.mensajesRecibidos = new Mensaje[tamBuzon];
        this.mensajesEnviados = new Mensaje[tamBuzon];
    }

    private int getNumeroMensajesEnviados(){
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i]==null){
                return i;
            }
        }
        return tamBuzon;
    }

    private int getNumeroMensajesRecibidos(){
        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensajesRecibidos[i]==null){
                return i;
            }
        }
        return tamBuzon;
    }

    public void enviarMensaje(String asunto, String cuerpo, persona destinatario) throws MensajeException {
        if (asunto.isBlank()) {
            throw new MensajeException("el asunto no puede estar en blanco");
        }

        if (cuerpo.isBlank()) {
            throw new MensajeException("el cuerpo no puede estar en blanco");
        }
        assert destinatario != null:"el destinatario no puede ser nulo";

        if (destinatario == this){
            throw new MensajeException("nu te puede mandar un mensaje a ti mismo");
        }


    }

}
