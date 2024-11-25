package tema4;

import java.util.Scanner;

public class maquinadecafe {
    Scanner sc = new Scanner(System.in);
    private double dineroMonedero;
    private int depositoCafe;
    private int depositoLeche;
    private int depositoVasos;
    public static final double precioCafe = 1;
    public static final double precioLeche = 0.80;
    public static final double precioCafeconLeche = 1.50;

    public maquinadecafe() {
        this.dineroMonedero = 50;
        this.depositoCafe = 50;
        this.depositoLeche = 50;
        this.depositoVasos = 80;

    }

    public void comprobarDinero(double precioProducto) throws maquinadecafeException {
        System.out.println("introduzca el dinero por favor");
        double dineroMetido = sc.nextDouble();


        if (dineroMetido <= 0) {
            throw new maquinadecafeException("valor no valido");
        }

        if (precioProducto > dineroMetido) {
            throw new maquinadecafeException("no has introducido suficiente dinero");
        }

        if (precioProducto < dineroMetido) {
            throw new maquinadecafeException("has introducido mas dinero del necesario, recoga el cambio");
        }

        System.out.println("producto servido");

        this.dineroMonedero = dineroMonedero - dineroMetido;
    }

    public void servirCafe() throws maquinadecafeException {

        System.out.println("producto servido");
        depositoCafe = depositoCafe - 1;
        depositoVasos = depositoVasos - 1;

    }

    public void servirLeche(double dineroMonedero) throws maquinadecafeException {
        System.out.println("introduzca el dinero porfavor");
        double dineroMetido = sc.nextInt();

        this.dineroMonedero = dineroMonedero - dineroMetido;

        if (dineroMetido >= 0) {
            throw new maquinadecafeException("valor no valido");
        }

        if (dineroMetido < precioLeche) {
            double dineroFaltante = precioLeche - dineroMetido;
            System.out.printf("el dinero que has introducido es insuficiente le faltan %s €\n", dineroFaltante);
            servirLeche(dineroMonedero);
        }

        if (dineroMetido > precioLeche) {
            double dineroSobrante = dineroMonedero - precioLeche;
            System.out.printf("dinero sobrante, recoja su vuelta de %s cuando termine\n", dineroSobrante);
            this.dineroMonedero = dineroMonedero + dineroSobrante;
        }

        System.out.println("producto servido");
        depositoLeche = depositoLeche - 1;
        depositoVasos = depositoVasos - 1;
    }

    public void servirCafeconLeche(double dineroMonedero) throws maquinadecafeException {
        System.out.println("introduzca el dinero porfavor");
        double dineroMetido = sc.nextInt();

        this.dineroMonedero = dineroMonedero - dineroMetido;

        if (dineroMetido >= 0) {
            throw new maquinadecafeException("valor no valido");
        }

        if (dineroMetido < precioCafeconLeche) {
            double dineroFaltante = precioCafeconLeche - dineroMetido;
            System.out.printf("el dinero que has introducido es insuficiente le faltan %s €\n", dineroFaltante);
            servirLeche(dineroMonedero);
        }

        if (dineroMetido > precioCafeconLeche) {
            double dineroSobrante = dineroMonedero - precioCafeconLeche;
            System.out.printf("dinero sobrante, recoja su vuelta de %s cuando termine\n", dineroSobrante);
            this.dineroMonedero = dineroMonedero + dineroSobrante;
        }

        System.out.println("producto servido");
        depositoCafe = depositoCafe - 1;
        depositoLeche = depositoLeche - 1;
        depositoVasos = depositoVasos - 1;
    }


}
