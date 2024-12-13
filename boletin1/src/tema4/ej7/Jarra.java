package tema4.ej7;

public class Jarra {
    private double capacidad;
    private double cantidad;
    private double cantidadConsumida;

    public Jarra(double capacidad) {
        this.capacidad = capacidad;
        this.cantidad = 0;
        this.cantidadConsumida = 0;
    }

    public void llenarJarra() {
        this.cantidadConsumida += this.capacidad - this.cantidad;
        this.cantidad = this.capacidad;
    }

    public void vaciarJarra() {
        this.cantidad = 0;
    }

    public double volcar(Jarra otrajarra) {
        double cantidadTraspasada = 0;
        if (otrajarra.cantidad != otrajarra.capacidad && (this.cantidad != 0)) {
            double cantidadFaltante = otrajarra.capacidad - otrajarra.cantidad;
            if (this.cantidad >= cantidadFaltante) {
                otrajarra.cantidad = otrajarra.capacidad;
                cantidadTraspasada = cantidadFaltante;
                this.cantidad -= cantidadFaltante;
            } else {
                otrajarra.cantidad += this.cantidad;
                cantidadTraspasada = this.cantidad;
                this.cantidad = 0;
            }
        }
        return cantidadTraspasada;
    }

    @Override
    public String toString() {
        return String.format("la jarra tiene %.2f litros",this.cantidad);
    }
}
