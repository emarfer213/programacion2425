package tema4.ej6;

public class Producto {

    private static int numeroProducto = 0;
    private int id;
    private String descripcion;
    private double precioSinIVA;
    private static final double IVA = 20.0;

    public Producto(String descripcion, double precioSinIVA) {

        this.id = ++numeroProducto;
        this.descripcion = descripcion;
        this.precioSinIVA = precioSinIVA;

    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getprecioSinIVA() {
        return precioSinIVA;
    }

    public void setprecioSinIVA(double precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public double calculoPrecio() {
        return precioSinIVA * (1 + IVA / 100);
    }

    public String toString(){
        return "Producto{"+
                "id=" + id +
                ", descripcion=" + descripcion + '\'' +
                ", precioSinIVA=" + precioSinIVA +
                        '}';
    }

}
