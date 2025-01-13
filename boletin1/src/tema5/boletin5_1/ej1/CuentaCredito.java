package tema5.boletin5_1.ej1;

public class CuentaCredito extends Cuenta {
    private double creditoMax;
    private double creditoDisponible;
    private static final double maxCreditoAplicable = 300;

    public CuentaCredito(double saldoInicial, double creditoMax) {
        super(saldoInicial);
        this.creditoMax = creditoMax;
        this.creditoDisponible = creditoMax;
    }

    public CuentaCredito() {
        this(0.0, 100);
    }

    public double getCreditoMax() {
        return creditoMax;
    }

    public void setCreditoMax(double creditoMax) {
        this.creditoMax = creditoMax;
    }

    @Override
    public void sacarDinero(double cantidad) throws cuentaException {
        if (getSaldo() + creditoDisponible < cantidad) {
            throw new cuentaException("no puedes retirar tanto dinero");
        }

        if (getSaldo() >= cantidad) {
            super.sacarDinero(cantidad);
        } else {
            cantidad = cantidad - getSaldo();
            super.sacarDinero(getSaldo());
            creditoDisponible=creditoDisponible-cantidad;
        }

    }

}
