package tema5.boletin5_1.ej1;

public class CuentaCredito extends Cuenta {
    private double creditoMax;
    private double creditoDisponible;
    private double creditoInicial;
    private static final double maxCreditoAplicable = 300;

    public CuentaCredito(double saldoInicial, double creditoMax, double creditoInicial) {
        super(saldoInicial);
        this.creditoMax = creditoMax;
        this.creditoDisponible = creditoMax;
        this.creditoInicial = creditoInicial;
    }

    public CuentaCredito() {
        this(0.0, 300,100);
    }

    public double getCreditoMax() {
        return creditoMax;
    }

    public void setCreditoMax(double creditoMax) {
        this.creditoMax = creditoMax;
    }

    public double getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(double creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    @Override
    public void sacarDinero(double cantidad) throws cuentaException {
        if (cantidad<=0) {
            throw new cuentaException("la cantidad debe ser mayor que 0");
        } else if (cantidad > getSaldo() + creditoDisponible) {
            throw new cuentaException("su cuenta no dispone de esa cantidad");
        }


    }

    public void ingresarDinero(double cantidad) throws cuentaException {
        if (cantidad <= 0) {
            throw new cuentaException("la cantidad tiene que ser mayor de 0");
        } else if (cantidad >= creditoDisponible - creditoInicial) {
            cantidad -= creditoInicial - creditoDisponible;
            setSaldo(getSaldo() + cantidad);
            setCreditoDisponible(creditoInicial);
        } else {
            setCreditoDisponible(getCreditoDisponible() + cantidad);
        }
    }

}
