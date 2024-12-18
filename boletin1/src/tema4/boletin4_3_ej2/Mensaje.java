package tema4.boletin4_3_ej2;

import java.time.LocalDate;

public class Mensaje {
    private String asunto;
    private String cuerpo;
    private LocalDate fechaEnvio;
    private persona remitente;
    private persona destinatario;


    public Mensaje(String asunto, String cuerpo, persona remitente, persona destinatario) {
        this.asunto=asunto;
        this.cuerpo=cuerpo;
        this.remitente=remitente;
        this.destinatario=destinatario;
        this.fechaEnvio=fechaEnvio;
    }
}
