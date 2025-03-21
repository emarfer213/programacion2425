package tema6.boletin1.ej8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Ruta {
    private String nombre;
    private String destino;
    private List<String> paradas;

    public Ruta(String nombre, String destino) {
        this.nombre = nombre;
        this.destino = destino;
        paradas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getParadas() {
        return paradas;
    }

    public String getDestino() {
        return destino;
    }

    /**
     * no admite valores nulos
     *
     * @param parada
     */
    public void addParada(String parada) {
        if (paradas.stream().anyMatch(p -> p.equalsIgnoreCase(parada.trim()))) {
            throw new AgenciaException("la parada ya existe");
        }
        paradas.add(parada.trim());
    }

    public void eliminarParada(String parada) {
        if (paradas.stream().noneMatch(p -> p.equalsIgnoreCase(parada.trim()))) {
            throw new AgenciaException("la parada ya existe");
        }
        paradas.remove(parada.trim());
    }

    public boolean contieneParadas(String nombre){
        return paradas.stream().noneMatch(p -> p.equalsIgnoreCase(nombre.trim()));
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + "\n" + "destino= " + destino + "\n" + "paradas= " + String.join(",", paradas) + "\n";
    }
}
