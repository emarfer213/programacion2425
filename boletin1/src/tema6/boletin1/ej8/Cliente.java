package tema6.boletin1.ej8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cliente {
    private String nombre;
    private int id;
    private static int idContador = 0;
    private Map<String, Ruta> rutas;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.id = ++idContador;
        rutas = new HashMap<>();
    }

    public Map<String, Ruta> getRutas() {
        return rutas;
    }

    public void addRuta(Ruta ruta) {
        if (rutas.containsKey(ruta.getNombre())) {
            throw new AgenciaException("ya existe esta ruta");
        }
        rutas.put(ruta.getNombre(), ruta);
    }

    public void removeRuta(Ruta ruta) {
        if (!rutas.containsKey(ruta.getNombre())) {
            throw new AgenciaException("la ruta no existe");
        }
        rutas.remove(ruta.getNombre());
    }

    public void addParadaARuta(String parada) {
        Ruta rutaBuscada = rutas.get(nombre);
        if (rutaBuscada != null) {
            rutaBuscada.addParada(parada);
        } else {
            throw new AgenciaException("la parada no existe");
        }
    }

    public String mostrarRutas() {
        StringBuilder sb = new StringBuilder();
        rutas.values().forEach(ruta -> {
            sb.append(ruta.getNombre());
            sb.append("destino:").append(ruta.getDestino());
            sb.append("paradas:").append(ruta.getParadas().stream()
                    .sorted().collect(Collectors.joining(",")));
        });
        return sb.toString();
    }

    public List<String> getParadasUnicasOrdenadas(Cliente cliente){
        return rutas.values().stream()
                .flatMap(ruta -> ruta.getParadas().stream())
                .distinct().sorted().toList();
    }

}
