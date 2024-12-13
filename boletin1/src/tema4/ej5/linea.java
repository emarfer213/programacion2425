package tema4.ej5;

import java.util.Objects;

public class linea {
    private coordenadas cordenadax;
    private coordenadas cordenaday;

    public linea() {
        this.cordenadax = new coordenadas();
        this.cordenaday = new coordenadas();
    }

    public linea(coordenadas cordenadax, coordenadas cordenaday) {
        this.cordenadax = cordenadax;
        this.cordenaday = cordenaday;
    }

    public linea(int cordenadax, int cordenaday) {
    }

    public linea(linea linea, linea linea1) {
    }

    public void setCordenadax(coordenadas cordenadax) {
        this.cordenadax = cordenadax;
    }
    
    public coordenadas getCordenadax() {
        return cordenadax;
    }

    public void setCordenaday(coordenadas cordenaday) {
        this.cordenaday = cordenaday;
    }

    public coordenadas getCordenaday() {
        return cordenaday;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        linea linea = (tema4.ej5.linea) o;
        return this.cordenadax.equals(linea.cordenadax) && this.cordenaday.equals(linea.cordenaday);
    }

    public void moverderecha(double movimiento) {
        assert movimiento > 0 : "el movimiento debe ser mayor que cero";
        movimiento = Math.abs(movimiento);
        cordenadax.setCordenadax(cordenadax.getCordenadax() + movimiento);
        cordenaday.setCordenaday(cordenaday.getCordenaday() + movimiento);
    }
    
    public void moverIzquierda(double movimiento){
        assert movimiento <= 0 : "el movimiento debe ser mayor que cero";
        movimiento = Math.abs(movimiento);
        cordenadax.setCordenadax(cordenadax.getCordenadax() - movimiento);
        cordenaday.setCordenaday(cordenaday.getCordenaday() - movimiento);
    }
    
    public void moverArriba(double movimiento){
        assert movimiento > 0 : "el movimiento debe ser mayor que cero";
        movimiento = Math.abs(movimiento);
        cordenadax.setCordenadax(cordenadax.getCordenadax() + movimiento);
        cordenaday.setCordenaday(cordenaday.getCordenaday() + movimiento);
    }
    
    public void moverAbajo(double movimiento){
        assert movimiento > 0 : "el movimiento debe ser mayor que cero";
        movimiento = Math.abs(movimiento);
        cordenadax.setCordenadax(cordenadax.getCordenadax() + movimiento);
        cordenaday.setCordenaday(cordenaday.getCordenaday() + movimiento);
    }
}
