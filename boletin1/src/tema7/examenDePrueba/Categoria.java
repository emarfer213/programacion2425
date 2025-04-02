package tema7.examenDePrueba;

import java.util.HashSet;
import java.util.Set;

public class Categoria {
    private String nombre;
    private Set<Frases> frases;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.frases = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setFrases(Set<Frases> frases) {
        this.frases = frases;
    }
}
