package tema6.boletin1.ej8;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    List<Cliente> listadoClientes;

    public Agencia() {
        this.listadoClientes = new ArrayList<>();
    }

    public List<Cliente> listadoClientesContieneParadas(String nombreParada) {
        return listadoClientes.stream()
                .filter(cliente -> cliente.getRutas().values().stream()
                        .anyMatch(ruta -> ruta.contieneParadas(nombreParada))).toList();
    }

    /*public List<String> listadoParadasDeCliente(Cliente cliente){

    }*/
}
