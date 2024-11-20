package tema4;

public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String numeroCuenta, String titular, double saldoInicial) throws CuentaException{
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.setSaldo(saldoInicial);
    }

    private void setSaldo(double saldo) throws CuentaException {
        if (saldo < 0){
            throw new CuentaException("el saldo no puede ser negativo");
        }
        this.saldo=saldo;
    }

}
