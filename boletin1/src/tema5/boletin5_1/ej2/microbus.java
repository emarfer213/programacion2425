package tema5.boletin5_1.ej2;

public class microbus extends Vehiculo {
    private static final double COSTE_PLAZAS = 5;
    private int numPlazas;

    public microbus(String matricula, TGama gama, int numPlazas) {
        super(matricula, gama);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    @Override
    public double calcularPrecioAlquiler(int numDias) {
        return (getGama().getPrecioBase() + numPlazas * COSTE_PLAZAS) * numDias;
    }
}
