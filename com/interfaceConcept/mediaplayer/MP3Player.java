package mediaplayer;
public class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 Player is now playing.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player has stopped.");
    }
}
