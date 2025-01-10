package tema5.boletin5_1.ej1;

public class CuentaCredito extends Cuenta {
    private double credito;

    public CuentaCredito() {
        this.credito = 100;
    }

    public CuentaCredito(double saldo, double credito) {
        super(saldo);
        this.credito = credito;
    }

    public CuentaCredito(double saldo) {
        super(saldo);
        this.credito = 100;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
