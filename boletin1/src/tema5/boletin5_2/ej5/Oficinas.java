package tema5.boletin5_2.ej5;

public class Oficinas implements Edificio{
    private double superficie;

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public Oficinas(double superficie) {
        this.superficie = superficie;
    }
}
