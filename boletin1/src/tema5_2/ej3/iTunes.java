package tema5_2.ej3;

public class iTunes implements OfflineMusicPlayer{

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }

    @Override
    public void play() {
        System.out.println("Playing music on iTunes");
    }

    @Override
    public void stop() {
        System.out.println("Stoping music on iTunes");
    }
}
