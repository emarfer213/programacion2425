package tema5.boletin5_2.ej2;

public class Televisor implements Encendible{
    @Override
    public void encender() {
        System.out.println("El televisor está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor está apagado");
    }
}
