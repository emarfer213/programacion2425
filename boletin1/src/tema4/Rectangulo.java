package tema4;

public class Rectangulo {
    private int longitud;
    private int ancho;

    public Rectangulo(){
        this.longitud=1;
        this.ancho=1;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) throws RectanguloException {
        if (longitud <= 0 || longitud >= 20) {
            throw new RectanguloException("la longitud no es correcta");
        }
        this.longitud = longitud;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws RectanguloException {
        if (ancho < 0 || ancho > 20) {
            throw new RectanguloException("el ancho no es correcta");
        }
        this.ancho = ancho;
    }

    public float area () {
        return longitud * ancho;
    }

    public float perimetro(){
        return (longitud * 2) + (ancho * 2);
    }
}
