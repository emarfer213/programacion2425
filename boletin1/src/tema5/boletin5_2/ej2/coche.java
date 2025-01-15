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
        return (getGama().getPrecioBase() + combustible.getPrecioCombustible()) * numDias;
    }

    @Override
    public double calculaAlquiler(int numDias) {
        return super.calculaAlquiler(numDias) + combustible.getPrecioCombustible() * numDias;
    }
}
