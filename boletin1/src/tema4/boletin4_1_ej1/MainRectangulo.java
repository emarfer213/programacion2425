package tema4.boletin4_1_ej1;

import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangulo rectangulo1 = new rectangulo();

        boolean parametrocorrecto=false;
        while (!parametrocorrecto){
            try {
                System.out.println("introduce una longitud para el rectangulo");
                rectangulo1.setLongitud(sc.nextInt());
                parametrocorrecto=true;
            } catch (rectanguloException e1){
                System.out.println(e1.getMessage());
            }
        }

        parametrocorrecto=false;
        while (!parametrocorrecto){
            try {
                System.out.println("introduce un ancho para el rectangulo");
                rectangulo1.setAncho(sc.nextInt());
                parametrocorrecto=true;
            } catch (rectanguloException e2){
                System.out.println(e2.getMessage());
            }
        }

        System.out.println("el area del rectangulo es " + rectangulo1.calcularArea());
        System.out.println("el perimetro del rectangulo es " + rectangulo1.calcularPerimetro());
    }
}
