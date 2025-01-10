package tema5.boletin5_1.ej1;

public class Cuenta {
    private double saldo;

    //constuctor
    /**
     * metodo predefinido
     */

    public Cuenta() {
        this.saldo = 0;
    }

    public Cuenta(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
