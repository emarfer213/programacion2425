import java.lang.reflect.Array;
import java.util.Objects;

public class Usuario {
    private String nombre;
    private int maximoDeMensajes = 10;
    private int cantidadDeMensajes;
    private int contadorDeLikes;
    private String[] amigos;
    private Mensaje[] mensajes;


    public Usuario(String nombre) {
        this.nombre = nombre;
        this.amigos = new String[10];
        this.mensajes = new Mensaje[10];
    }

    public void publicarMensaje(String textoMensaje, boolean publico) {
        for (int i = 0; i < mensajes.length; i++) {
            if (mensajes[i] == null) {
                Mensaje mensaje = new Mensaje(textoMensaje, publico);
                mensajes[i] = mensaje;
                break;
            }
        }
        throw new MensajeException("ya has llegado a tu limite de mensajes");
    }

    public void darLike(Mensaje mensaje) {
        mensaje.setContadorDeLikes();
    }


    public void verMensajes(Usuario usuario) {
        for (int i = 0; i < usuario.getMensajes().length; i++) {
            if (usuario.getMensajes()[i] != null) {
                if (usuario.getMensajes()[i].isPublico()) {
                    System.out.println(usuario.getMensajes()[i].getTextoMensaje() + " (" + usuario.getMensajes()[i].getContadorDeLikes() + " likes)");
                } else if (this.sonAmigos(usuario) && usuario.sonAmigos(this)) {
                    System.out.println(usuario.getMensajes()[i].getTextoMensaje() + " (" + usuario.getMensajes()[i].getContadorDeLikes() + " likes)");
                }
            }
        }
    }

    public void agregarAmigo(Usuario usuario1) {
        for (int i = 0; i < amigos.length; i++) {
            if (amigos[i] == null) {
                amigos[i] += usuario1.nombre;
                break;
            }
        }
    }

    public Mensaje[] getMensajes() {
        return mensajes;
    }

    public boolean sonAmigos(Usuario usuario){
        for (int i = 0; i < amigos.length; i++) {
            if (amigos[i]!=null){
                if (Objects.equals(this.amigos[i], usuario.nombre)){
                    return true;
                }
            }
        }
        return false;
    }
}
