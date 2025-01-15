package tema5.boletin5_1.ej2;

public enum TGama {
    BAJA (30), MEDIA(40), ALTA(50);
    private double precioBase;

     private TGama(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
