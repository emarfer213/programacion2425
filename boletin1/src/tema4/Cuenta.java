package tema4;
import java.util.Scanner;
public class Cuenta {
    Scanner sc = new Scanner(System.in);
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

    private double dineroRetirar(double saldo){

        System.out.println("indicame cuanto dinero quieres retirar");
        int cantidadRetirar = sc.nextInt();

        if (cantidadRetirar > saldo){
            System.out.println("no puedes sacar mas dinero del que ya tienes");
        }

        return cantidadRetirar;
    }

}
