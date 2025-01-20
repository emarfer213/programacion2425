package tema4.boletin4_1_ej3;

import tema4.maquinadecafeException;

import java.util.Scanner;

public class maquinaDeCafe {
    Scanner sc = new Scanner(System.in);
    private double dineroMonedero;
    private int cantidadCafe;
    private int cantidadLeche;
    private int cantidadVasos;
    private static final double precioCafe = 1;
    private static final double precioLeche = 0.80;
    private static final double precioCafeConLeche = 1.50;

    public maquinaDeCafe(double dineroMonedero, int cantidadCafe, int cantidadLeche, int cantidadVasos) {
        this.dineroMonedero = 50;
        this.cantidadCafe = 50;
        this.cantidadLeche = 50;
        this.cantidadVasos = 80;
    }

    public void comprobarDinero(double precioProducto) throws MaquinaDeCafeException {
        System.out.println("introduzca el dinero porfavor");
        double dineroMetido = sc.nextInt();

        if (dineroMetido <= 0) {
            throw new MaquinaDeCafeException("no puede introducir 0 o negativo");
        }

        if (precioProducto > dineroMetido) {
            throw new MaquinaDeCafeException("dinero introducido insuficiente");
        }

        if (precioProducto < dineroMetido) {
            throw new MaquinaDeCafeException("has introducido mas dinero del necesario, recoga su pedido y el cambio de" + (dineroMetido - precioProducto));
        }
        System.out.println("recoja su pedido");
        this.dineroMonedero = dineroMonedero - dineroMetido;

    }

    public void servirCafe() throws MaquinaDeCafeException {

        if (cantidadCafe == 0 || cantidadVasos == 0) {
            System.out.println("no se puede servir su producto por falta de existecias");
        }

        comprobarDinero(precioCafe);
        cantidadCafe = cantidadCafe - 1;
        cantidadVasos = cantidadVasos - 1;
    }

    public void servirLeche() throws MaquinaDeCafeException {
        if (cantidadLeche == 0 || cantidadVasos == 0) {
            System.out.println("no se puede servir su producto por falta de existecias");
        }

        comprobarDinero(precioLeche);
        cantidadLeche = cantidadLeche - 1;
        cantidadVasos = cantidadVasos - 1;
    }

    public void servirCafeConLeche() throws MaquinaDeCafeException {
        comprobarDinero(precioCafeConLeche);
        cantidadCafe = cantidadCafe - 1;
        cantidadVasos = cantidadVasos - 1;
        cantidadLeche = cantidadLeche - 1;
    }

    public void estadoMaquina() {
        System.out.println("cantidad de dinero en el monedero: " + dineroMonedero);
        System.out.println("la cantidad de cafe es: " + cantidadCafe);
        System.out.println("la cantidad de leche es: " + cantidadLeche);
        System.out.println("cantidad de vasos " + cantidadVasos);
    }
}
