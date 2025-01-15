package tema5.boletin5_1.ej2;

public class EmpresaVehiculo {
    private final int capacidadMaximaVehiculos = 200;
    protected Vehiculo[] garaje;

    public EmpresaVehiculo() {
        this.garaje = new Vehiculo[capacidadMaximaVehiculos];
    }

    public Vehiculo[] getGaraje() {
        return garaje;
    }

    public void anadirVehiculo(Vehiculo vehiculo) throws vehiculoExcepcion {
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] == null) {
                garaje[i] = vehiculo;
                return;
            }
        }
        throw new vehiculoExcepcion("el garaje esta lleno");
    }

    public Vehiculo buscarVehiculo(String matricula) throws vehiculoExcepcion{
        for (int i = 0; i < garaje.length; i++) {
            if (garaje[i] != null) {
                if (matricula.equalsIgnoreCase(garaje[i].getMatricula())) {
                    return garaje[i];
                }
            } else {
                throw new vehiculoExcepcion("no se encuentra la matricula");
            }
        }
        throw new vehiculoExcepcion("no se encuentra el vehiculo");
    }

}
