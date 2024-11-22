package tema4;

import java.util.Scanner;

public class MainRectangulo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangulo rectangulo1 = new Rectangulo();

        boolean parametroCorrecto = false;
        while (!parametroCorrecto){
            try {
                System.out.println("introduce la longitud del rectangulo");
                rectangulo1.setLongitud(sc.nextInt());
                parametroCorrecto = true;
            } catch (RectanguloException e1){
                System.out.println(e1.getMessage());
            }
        }

        parametroCorrecto = false;
        while (!parametroCorrecto){
            try {
                System.out.println("introduce el ancho del rectangulo");
                rectangulo1.setAncho(sc.nextInt());
                parametroCorrecto=true;
            } catch (RectanguloException e2){
                System.out.println(e2.getMessage());
            }
        }

        System.out.println("el perimetro del rectangulo 1 es: " + rectangulo1.perimetro());
        System.out.println("el area del rectangulo 1 es: " + rectangulo1.area());

    }

}
