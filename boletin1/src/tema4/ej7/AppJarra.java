package tema4.ej7;

import comun.MiEntradaSalida;

public class AppJarra {
    public static void main(String[] args) {
        Jarra jarra1 = new Jarra(7);
        Jarra jarra2 = new Jarra(4);
        int opcion=0;
        do {
            opcion = MiEntradaSalida.seleccionaOpcion("selecciona una opcion",
                    new String[]{"llenar jarra", "vaciar jarra", "volcar jarra 1 en 2", "volcar jarra 2 en 1", "ver estado de las jarras", "salir"});
            switch (opcion){
                case 1:llenarJarra();
                case 2:vaciarJarra();
                case 3:volcarJarra1en2();
                case 4:volcarJarra2en1();
                case 5:verEstadoJarra();
            }
        } while (opcion != 6);
    }

    private static void llenarJarra() {
    }
    private static void vaciarJarra() {
    }
    private static void volcarJarra1en2() {
    }
    private static void volcarJarra2en1() {
    }
    private static void verEstadoJarra() {
    }
}
