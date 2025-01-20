package tema4.boletin4_1_ej1;

public class rectangulo {
    private int longitud;
    private int ancho;

    public rectangulo() {
        this.longitud = 1;
        this.ancho = 1;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        if (longitud <= 0 || longitud >= 20) {
            throw new rectanguloException("longitud no valida");
        }
        this.longitud = longitud;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho <= 0 || ancho >= 20) {
            throw new rectanguloException("ancho no valido");
        }
        this.ancho = ancho;
    }

    public float calcularPerimetro() {
        return (longitud * 2) + (ancho * 2);
    }

    public float calcularArea() {
        return longitud * ancho;
    }
}
