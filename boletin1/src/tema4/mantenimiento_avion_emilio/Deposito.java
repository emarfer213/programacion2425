package tema4.mantenimiento_avion_emilio;

public class Deposito {
    private double capacidadMaxima;
    private double capacidadActual;

    public Deposito(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

}