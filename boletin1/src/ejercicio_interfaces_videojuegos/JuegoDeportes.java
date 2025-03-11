package ejercicio_interfaces_videojuegos;

public class JuegoDeportes extends Juego implements Multijugador{
    private String tipoDeporte;
    private boolean licenciaOficial;

    public JuegoDeportes(String titulo, String equipoDesarrollo, double costoBase, String tipoDeporte, boolean licenciaOficial) {
        super(titulo, equipoDesarrollo, costoBase);
        this.tipoDeporte = tipoDeporte;
        this.licenciaOficial = licenciaOficial;
    }

    @Override
    public boolean comprobarCompatibilidadServidor() {
        return false;
    }
}
