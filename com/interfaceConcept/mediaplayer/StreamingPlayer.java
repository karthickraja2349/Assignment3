package mediaplayer;
public class StreamingPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Streaming Player is now playing.");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player has stopped.");
    }
}
