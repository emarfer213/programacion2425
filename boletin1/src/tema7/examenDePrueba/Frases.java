package tema7.examenDePrueba;

import java.time.LocalDate;

public class Frases {
    String texto;
    String pelicula;
    String actor;
    LocalDate fechaIncorporacion;
    int valoracion;

    public Frases(String texto, String pelicula, String actor, int valoracion) {
        this.texto = texto;
        this.pelicula = pelicula;
        this.actor = actor;
        this.fechaIncorporacion = LocalDate.now();
        this.valoracion = valoracion;
    }

    public Frases(String texto) {
        this.texto = texto;
    }
}
