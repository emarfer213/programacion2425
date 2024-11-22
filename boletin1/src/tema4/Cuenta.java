package tema4;
import java.util.Scanner;
public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private int contadorRetirada;
    private int contadoringreso;


    public Cuenta(String numeroCuenta, String titular, double saldoInicial) throws CuentaException{
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        contadorRetirada=0;
        contadoringreso=0;

        this.setSaldo(saldoInicial);
    }

    public double getSaldo(double saldo){
        return saldo;
    }

    public void setSaldo(double saldo) throws CuentaException {
        if (saldo < 0){
            throw new CuentaException("el saldo no puede ser negativo");
        }
        this.saldo=saldo;
    }



    public void sacarDinero(double retirada){

        System.out.println("indicame cuanto dinero quieres retirar");
        int cantidadRetirar = sc.nextInt();

        if (cantidadRetirar > saldo){
            System.out.println("no puedes sacar mas dinero del que ya tienes");
        } else if (cantidadRetirar <= 0) {
            System.out.println("no puedes retirar una cantidad negativa o cero");
        }
        this.saldo -= retirada;
        contadorRetirada--;
    }

    public void meterDinero(double ingreso) throws CuentaException {
        System.out.println("indicame cuanto dinero quieres meter");
        int cantidadMeter = sc.nextInt();

        if (ingreso<=0){
            throw new CuentaException("el ingreso no puede ser cero o menor");
        }
        this.saldo += ingreso;
        contadoringreso++;
    }



}
