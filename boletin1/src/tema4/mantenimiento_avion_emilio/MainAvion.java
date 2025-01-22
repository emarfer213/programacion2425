package tema4.mantenimiento_avion_emilio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MainAvion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Avion avion1 = new Avion( "ssc", "emperor", 20, 22200, 22200);

        Revision revision1 = new Revision(LocalDate.of(2000, 5, 3), false, Period.of(0, 3, 0));
        Revision revision2 = new Revision(LocalDate.of(2003, 10, 7), true, Period.of(0, 3, 0));
        Revision revision3 = new Revision(LocalDate.of(2012, 7, 10), false, Period.of(1, 5, 0));
        Revision revision4 = new Revision(LocalDate.of(2024, 12, 29), true, Period.of(0, 3, 0));

        avion1.revisiones[0] = revision1;
        avion1.revisiones[1] = revision2;
        avion1.revisiones[2] = revision3;
        avion1.revisiones[3] = revision4;


        System.out.println("introduzca la distancia de su viaje");


        try {
            if (avion1.comprobaciones()){
                System.out.println("el avion puede llegar a su destino");
                System.out.println(avion1.toString());
            } else {
                System.out.println("El avión no puede llegar al destino");
                System.out.println(avion1.toString());
            }
        } catch (AvionException e){
            System.out.println(e.getMessage());
        }
    }



}
