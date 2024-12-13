package tema4.ej5;

public class coordenadas {
    private double cordenadax, cordenaday;

    public void punto() {
        cordenadax = 0;
        cordenaday = 0;
    }

    public void punto(double cordenadax, double cordenaday) {
        this.cordenadax = cordenadax;
        this.cordenaday = cordenaday;
    }

    public void setCordenadax(double cordenadax) {
        this.cordenadax = cordenadax;
    }

    public double getCordenadax() {
        return cordenadax;
    }

    public void setCordenaday(double cordenaday) {
        this.cordenaday = cordenaday;
    }

    public double getCordenaday() {
        return cordenaday;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        coordenadas coordenadas = (coordenadas) o;
        return this.cordenadax == coordenadas.cordenadax && this.cordenaday == coordenadas.cordenaday;
    }
}
