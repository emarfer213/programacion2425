package tema5_2.ej3;

public class MusicApp {

    public static void main(String[] args) {
        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new iTunes(), new MP3Player()};
        MusicApp app = new MusicApp();
        app.startMusic(players);
    }

    public void startMusic(MusicPlayer[] players){
        for (int i = 0; i < players.length; i++) {
            if (players[i] instanceof OnlineMusicPlayer o){
                o.stream();
            }
            if (players[i] instanceof OfflineMusicPlayer o) {
                o.load();
            }
            players[i].play();
            players[i].stop();
        }
    }
}
