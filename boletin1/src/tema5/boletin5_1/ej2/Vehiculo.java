package tema5.boletin5_1.ej2;

public abstract class Vehiculo {
    private String matricula;
    private TGama gama;

    public Vehiculo(String matricula, TGama gama) {
        this.matricula = matricula;
        this.gama = gama;
    }

    public TGama getGama() {
        return gama;
    }

    public abstract double calcularPrecioAlquiler(int numDias);

    public double calculaAlquiler(int numDias) {
        return gama.getPrecioBase() * numDias;
    }

    public String getMatricula() {
        return matricula;
    }
}
