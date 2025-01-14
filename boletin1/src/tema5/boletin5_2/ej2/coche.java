package tema5.boletin5_2.ej2;

public class coche extends Vehiculo {
    private TCombustible combustible;

    public coche(String matricula, TGama gama, TCombustible combustible) {
        super(matricula, gama);
        this.combustible = combustible;
    }

    public TCombustible getCombustible() {
        return combustible;
    }

    @Override
    public double calcularPrecioAlquiler(int numDias) {
        return 0;
    }

}
