package tema5.boletin5_1.ej1;

public class Cuenta {
    private double saldo;
    private double saldoInicial;
    //constuctor
    /**
     * metodo predefinido
     */

    public Cuenta(double saldoInicial){
        this.saldoInicial=saldoInicial;
    }

    public double getsaldoInicial() {
        return saldoInicial;
    }

    public void setsaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double ingresarDinero(double cantidad){
        assert cantidad > 0 : "valor no valido, debe ser mayor que 0";
        return saldoInicial += cantidad;
    }


    public void sacarDinero(double cantidad){
        assert cantidad > 0 && cantidad <= saldoInicial : "valor no valido, debe ser mayor que 0 y menor que saldo";
    }

    public void mostrarSaldo(){

    }

}
