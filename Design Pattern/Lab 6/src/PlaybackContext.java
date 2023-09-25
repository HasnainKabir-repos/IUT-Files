public class PlaybackContext {
    private PlaybackStrategy playbackStrategy;

    public void setPlaybackStrategy(PlaybackStrategy strategy){
        playbackStrategy = strategy;
    }

    public void play(Content content){
        playbackStrategy.play(content);
    }
}
