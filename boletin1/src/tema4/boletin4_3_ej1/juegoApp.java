package tema4.boletin4_3_ej1;

public class juegoApp {
    public static void main(String[] args){
        Juego juego = new Juego();
        System.out.println(juego.mostrarBaraja());
        juego.barajar();
        System.out.println(juego.mostrarBaraja());

        try {
            juego.repartir(4,2);
        } catch (JuegoException e){
            System.out.println(e.getMessage());
        }
        System.out.println(juego.mostrarBaraja());
    }

}
