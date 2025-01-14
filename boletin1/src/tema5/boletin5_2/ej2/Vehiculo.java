package tema5.boletin5_2.ej2;

public abstract class Vehiculo {
    private String matricula;
    private TGama gama;

    public Vehiculo(String matricula, TGama gama) {
        this.matricula = matricula;
        this.gama = gama;
    }

    public abstract double calcularPrecioAlquiler(int numDias);

}
