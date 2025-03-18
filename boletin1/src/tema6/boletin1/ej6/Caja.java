package tema6.boletin1.ej6;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Caja {
    private int numCaja;
    private boolean abierto;
    private Queue<Cliente> cola;

    public Caja(int numCaja) {
        this.numCaja = numCaja;
        this.abierto = false;
        this.cola = new LinkedList<Cliente>();
    }

    public int getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(int numCaja) {
        this.numCaja = numCaja;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public void abrirCaja() {
        if (!abierto) {
            abierto = true;
        } else {
            throw new CajaException("la caja ya ha sido abierta");
        }
    }

    public void cerrarCaja() {
        if (abierto) {
            if (!cola.isEmpty()) {
                throw new CajaException("no puedo cerrarla porque hay un cliente");
            }
            abierto = false;
        } else {
            throw new CajaException("la caja ya ha sido cerrada");
        }
    }

    public void nuevoCliente(Cliente cliente) {

        if (!abierto) {
            throw new CajaException("no se puede añadir cliente a cajas cerradas");
        }

        if (!cola.contains(cliente)) {
            cola.add(cliente);
        } else {
            throw new CajaException("el cliente ya esta en la cola");
        }
    }

    public Cliente atenderCliente() {
        if (abierto) {
            Cliente cliente = cola.poll();
            if (cliente == null){
                throw new CajaException("no hay clientes en la cola");
            }
            return cliente;
        }
        throw new CajaException("la caja esta cerrada, no puede atender a los clientes");
    }

    public int cantidadClientes(){
        return cola.size();
    }
}
