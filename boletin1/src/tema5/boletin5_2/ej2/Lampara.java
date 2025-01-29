package tema5.boletin5_2.ej2;

public class Lampara implements Encendible{

    @Override
    public void encender() {
        System.out.println("La lámpara está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La lámpara está apagada");
    }
}
