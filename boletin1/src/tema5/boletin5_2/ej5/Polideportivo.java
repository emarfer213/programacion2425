package tema5.boletin5_2.ej5;

public class Polideportivo implements Edificio, InstalacionDeportiva {
    private double superficie;
    private String tipoDeInstalacion;

    @Override
    public double getSuperficieEdificio() {
        return 0;
    }

    @Override
    public String getTipoDeInstalacion() {
        return "";
    }

    public Polideportivo(double superficie, String tipoDeInstalacion) {
        this.superficie = superficie;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }
}
