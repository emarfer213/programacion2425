package tema5_2.ej3;

public class Spotify implements OnlineMusicPlayer{

    @Override
    public void stream() {
        System.out.println("Streaming music on Spotify");
    }

    @Override
    public void play() {
        System.out.println("Playing music on Spotify");
    }

    @Override
    public void stop() {
        System.out.println("Stoping music on Spotify");
    }
}
