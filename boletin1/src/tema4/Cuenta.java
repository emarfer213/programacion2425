package tema4;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private int contadorRetirada;
    private int contadoringreso;


    public Cuenta(String numeroCuenta, String titular, double saldoInicial) throws CuentaException {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        contadorRetirada = 0;
        contadoringreso = 0;

        this.setSaldo(saldoInicial);
    }

    public void setSaldo(double saldo) throws CuentaException {
        if (saldo < 0) {
            throw new CuentaException("el saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacarDinero(double retirada) {

        System.out.println("indicame cuanto dinero quieres retirar");
        int cantidadRetirar = sc.nextInt();

        if (cantidadRetirar > saldo) {
            System.out.println("no puedes sacar mas dinero del que ya tienes");
        } else if (cantidadRetirar <= 0) {
            System.out.println("no puedes retirar una cantidad negativa o cero");
        }
        this.saldo -= retirada;
        contadorRetirada--;
    }

    public void meterDinero(double ingreso) throws CuentaException {

        if (ingreso <= 0) {
            throw new CuentaException("el ingreso no puede ser cero o menor");
        }
        this.saldo += ingreso;
        contadoringreso++;
    }

    public void consultarSaldo() {
        System.out.println(this.saldo);
        System.out.println("Has sacado dinero " + contadorRetirada + " veces");
        System.out.println("Has metido dinero " + contadoringreso + " veces");
    }

    public void finalizar() {
        System.out.println("has salido de la cuenta, tu saldo es de " + saldo);
    }

    public int getContadorRetirada() {
        return contadorRetirada;
    }

    public int getContadoringreso() {
        return contadoringreso;
    }


}
