package tema6.boletin1.ej6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Almacen {

    private List<Caja> listaDeCajas;
    private final static int maxCajas = 20;

    public Almacen(int numCaja) {
        if (numCaja <= 0 || numCaja > maxCajas) {
            throw new CajaException("el almacen debe tener entre 0 y " + maxCajas + " cajas");
        }
        this.listaDeCajas = new ArrayList<>(numCaja);
        for (int i = 0; i < numCaja; i++) {
            listaDeCajas.add(new Caja(i + 1));
        }
    }

    public void abrirCaja(int numCaja) {
        Caja c = listaDeCajas.stream()
                .filter(cajant -> cajant.getNumCaja() == numCaja)
                .findFirst()
                .orElseThrow(() -> new CajaException("error"));
        c.abrirCaja();
    }

    public void cerrarCaja(int numCaja) {
        Caja c = listaDeCajas.stream()
                .filter(cajant -> cajant.getNumCaja() == numCaja)
                .findFirst()
                .orElseThrow(() -> new CajaException("error"));
        c.cerrarCaja();
    }

    public void nuevoCliente() {
        Cliente cliente = new Cliente();
        Caja caja = listaDeCajas.stream()
                .filter(Caja::isAbierto)
                .min(Comparator.comparingInt(Caja::cantidadClientes))
                .orElseThrow(() -> new CajaException("no hay cajas abiertas"));
        caja.nuevoCliente(cliente);
    }

    public static void main(String[] args) {

    }

}
