package tema5.boletin5_1.ej2;

public enum TCombustible {
    GASOLINA(3.5), DIESEL(2);
    private double precioCombustible;

    private TCombustible(double precioCombustible){
        this.precioCombustible=precioCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }
}
