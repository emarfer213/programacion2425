package ejercicio_interfaces_videojuegos;

import java.util.Random;

public class JuegoEstrategia extends Juego implements Multijugador{
    private String sistemaRecursos;
    private int duracionCampania;

    public JuegoEstrategia(String titulo, String equipoDesarrollo, double costoBase, String sistemaRecursos, int duracionCampania) {
        super(titulo, equipoDesarrollo, costoBase);
        this.sistemaRecursos = sistemaRecursos;
        this.duracionCampania = duracionCampania;
    }

    public String getSistemaRecursos() {
        return sistemaRecursos;
    }

    public int getDuracionCampania() {
        return duracionCampania;
    }

    @Override
    public boolean comprobarCompatibilidadServidor() {
        Random r = new Random();
        return r.nextBoolean();
    }
}
