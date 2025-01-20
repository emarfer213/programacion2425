package tema4.boletin4_1_ej2;

import java.util.Scanner;

public class Cuenta {
    Scanner sc = new Scanner(System.in);
    private String numeroDeCuenta;
    private String titular;
    private double saldo;
    private int contadorIngreso;
    private int contadorRetirado;

    public Cuenta(String numeroDeCuenta, String titular, double saldoInicial) throws CuentaException {
        this.numeroDeCuenta = numeroDeCuenta;
        this.titular = titular;
        this.saldo = saldo;
        contadorRetirado = 0;
        contadorIngreso = 0;

        this.setSaldo(saldoInicial);
    }

    private void setSaldo(double saldoInicial) {
        if (saldo < 0) {
            throw new CuentaException("el saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirarDinero(double retirada) throws CuentaException {
        int cantidadRetirar = sc.nextInt();
        if (cantidadRetirar > saldo) {
            System.out.println("no puedes retirar mas dinero del que tienes");
        } else if (cantidadRetirar <= 0) {
            System.out.println("valor no valido a retirar");
        }
        this.saldo -= retirada;
        contadorRetirado++;
    }

    public void meterDinero(double ingreso) throws CuentaException {
        int cantidadMeter = sc.nextInt();
        if (ingreso <= 0){
            throw new CuentaException("el valor a meter no puede ser cero o menos");
        }
        this.saldo += ingreso;
        contadorIngreso++;
    }

    public void mostrarActividad(){
        System.out.println("su saldo es de " + this.saldo);
        System.out.println("ha retidado dinero " + contadorRetirado + " veces");
        System.out.println("ha ingresado dinero " + contadorIngreso + " veces");
    }

    public void finalizar(){
        System.out.println("has salido de la cuenta, su saldo es de " + saldo);
    }
}
