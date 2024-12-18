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

    private int getNumeroMensajesEnviados() {
        for (int i = 0; i < mensajesEnviados.length; i++) {
            if (mensajesEnviados[i] == null) {
                return i;
            }
        }
        return tamBuzon;
    }

    private int getNumeroMensajesRecibidos() {
        for (int i = 0; i < mensajesRecibidos.length; i++) {
            if (mensajesRecibidos[i] == null) {
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
        assert destinatario != null : "el destinatario no puede ser nulo";

        if (destinatario == this) {
            throw new MensajeException("nu te puede mandar un mensaje a ti mismo");
        }

        if (contarMensajes(mensajesEnviados) == tamBuzon || contarMensajes(destinatario.mensajesRecibidos) == tamBuzon) {
            throw new MensajeException("no puedes enviar el mensaje porque la bandeja de mensajes enviados esta llena o\n" +
                    "la bandeja de mensajes del destinatario esta llena");
        }

        boolean encontrardoNullMensajeRecibido = false;
        boolean encontradoNullMensajeEnviado = false;
        Mensaje mensaje = new Mensaje(asunto, cuerpo, this, destinatario);

        for (int i = 0; i < tamBuzon; i++) {
            if (destinatario.mensajesRecibidos[i] == null && !encontrardoNullMensajeRecibido) {
                destinatario.mensajesRecibidos = new Mensaje[]{mensaje};
            }
        }

    }

    private static void borrarMensaje(Mensaje[] buzon) {
        buzon[0] = null;
        for (int i = 0; i < buzon.length - 1; i++) {
            buzon[i] = buzon[i + 1];
        }
        buzon[tamBuzon - 1] = null;
    }

    public void borrarMensajesRecibidos() {

    }

    public void borrarMensajesEnviados() {

    }

    private static int contarMensajes(Mensaje[] buzon) {

    }

}
