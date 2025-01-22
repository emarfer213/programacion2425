package tema4.mantenimiento_avion_emilio;

import java.time.LocalDate;
import java.time.Period;

public class Revision {
    private LocalDate fecha;
    private boolean estado;
    private Period periodoValido = Period.ofDays(120);

    public Revision(LocalDate fecha, boolean estado, Period periodoValido) {
        this.fecha = fecha;
        this.estado = estado;
        this.periodoValido = periodoValido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Period getPeriodoValido() {
        return periodoValido;
    }

    public boolean isEstado() {
        return estado;
    }
}
