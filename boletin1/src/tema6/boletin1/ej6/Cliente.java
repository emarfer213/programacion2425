package tema6.boletin1.ej6;

public class Cliente {
    private int numCliente;
    private static int contadorCliente = 0;

    public Cliente() {
        this.numCliente = ++contadorCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

}
