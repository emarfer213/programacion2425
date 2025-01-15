package tema5.boletin5_1.ej2;

public class furgoneta extends Vehiculo {
    public static final double PRECIO_PMA = 0.5;
    private double pesoMaximoAutorizado;

    public furgoneta(String matricula, TGama gama, double pesoMaximoAutorizado) {
        super(matricula, gama);
        this.pesoMaximoAutorizado = pesoMaximoAutorizado;
    }

    public double getPesoMaximoAutorizado() {
        return pesoMaximoAutorizado;
    }

    @Override
    public double calcularPrecioAlquiler(int numDias) {
        return (getGama().getPrecioBase() + pesoMaximoAutorizado * PRECIO_PMA) * numDias;
    }
}
