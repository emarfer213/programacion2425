package ejercicio_interfaces_videojuegos;

public class JuegoRPG extends  Juego implements Actualizable{
    private int dificultadHistoria;
    private String[] opcionesPersonalizacion;

    public JuegoRPG(String titulo, String equipoDesarrollo, double costoBase, int dificultadHistoria) {
        super(titulo, equipoDesarrollo, costoBase);
        this.dificultadHistoria = dificultadHistoria;
        this.opcionesPersonalizacion = new String[] {"nombre", "nivel", "velocidad", "ataque"};
    }

    public String[] getOpcionesPersonalizacion() {
        return opcionesPersonalizacion;
    }

    public int getDificultadHistoria() {
        return dificultadHistoria;
    }

    @Override
    public void actualizar() {

    }
}
