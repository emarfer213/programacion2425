package tema6.ejercicioEstacion;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Sensores {
    private String codigo;
    private Tipo tiposensor;
    private Map<LocalDateTime, Double> registroDeMediciones;

    public Sensores(String codigo, Tipo tiposensor) {
        this.codigo = codigo;
        this.tiposensor = tiposensor;
        this.registroDeMediciones = new HashMap<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public Tipo getTiposensor() {
        return tiposensor;
    }

    public void tomarMediciones() {
        registroDeMediciones.put(LocalDateTime.now(), Math.random());
    }

    public void addMedicion(LocalDateTime fechaYHora, double medicion) {
        registroDeMediciones.putIfAbsent(fechaYHora, medicion);
    }

    public void addMultiMediciones(Map<LocalDateTime, Double> mediciones) {
        registroDeMediciones.putAll(mediciones);
    }

    public Map<LocalDateTime, Double> historicoMediciones() {

        return new TreeMap<>(registroDeMediciones).reversed();

       /* return registroDeMediciones.entrySet().stream()
                .sorted(Map.Entry.<LocalDateTime, Double>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        */
    }
}
