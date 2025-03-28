package tema6.ejercicioEstacion;

import java.util.HashSet;
import java.util.Set;

public class EstacionMeteorologica {
    private int id;
    private String ubicacion;
    private double altitud;
    private Set<Sensores> conjuntoSensores;
    private static int contadorSensores = 0;

    public EstacionMeteorologica(String ubicacion, double altitud) {
        this.id = ++contadorSensores;
        this.ubicacion = ubicacion;
        this.altitud = altitud;
        this.conjuntoSensores = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getAltitud() {
        return altitud;
    }

    public void addSensor(Sensores sensores) {
        conjuntoSensores.add(sensores);
    }

    public void eliminarSensor(Sensores sensores) {
        conjuntoSensores.remove(sensores);
    }

    public double getMediaMediciones(Sensores sensores, int n){
        return sensores.getMediaUltimasMediciones(n);
    }


}
