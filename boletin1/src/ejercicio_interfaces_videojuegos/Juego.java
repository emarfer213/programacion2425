package ejercicio_interfaces_videojuegos;

public abstract class Juego {
    private String titulo;
    private String equipoDesarrollo;
    private double costoBase;

    public Juego(String titulo, String equipoDesarrollo, double costoBase) {
        this.titulo = titulo;
        this.equipoDesarrollo = equipoDesarrollo;
        this.costoBase = costoBase;
    }

    public String getEquipoDesarrollo() {
        return equipoDesarrollo;
    }

    public void setEquipoDesarrollo(String equipoDesarrollo) {
        this.equipoDesarrollo = equipoDesarrollo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
}
