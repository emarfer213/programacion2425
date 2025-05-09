package tema7.simulacionExamen;

public class Videojuego {
    String id;
    String titulo;
    String desarrolladora;
    int lanzamiento;
    String plataforma;
    String genero;
    String descripcion;

    public Videojuego(String id, String titulo, String desarrolladora, String plataforma, int lanzamiento, String genero, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.lanzamiento = lanzamiento;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
