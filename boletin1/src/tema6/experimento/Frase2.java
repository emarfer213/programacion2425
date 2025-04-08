package tema6.experimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Frase2 {
    private String texto;
    private String pelicula;
    private String actor;
    private LocalDate fechaIncorporacion;
    private int valoracion;

    public Frase2(String texto, String pelicula, String actor, int valoracion) {
        this.texto = texto;
        this.pelicula = pelicula;
        this.actor = actor;
        this.fechaIncorporacion = LocalDate.now();
        this.valoracion = valoracion;
    }

    public String getTexto() {
        return texto;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getActor() {
        return actor;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public int getValoracion() {
        return valoracion;
    }

    @Override
    public String toString() {
        return "Frase: " + this.getTexto() +
                "\nActor: " + this.getActor() +
                "\nPelicula en la que Aparece: " + this.getPelicula() +
                "\nValoracion: " + this.getValoracion() +
                "\nFecha de Incorporacion: " + getFechaIncorporacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + "\n";
    }
}
