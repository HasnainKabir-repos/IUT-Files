public class Movie implements Content{
    @Override
    public String getTitle() {
        return new String("Mystic River");
    }

    @Override
    public String getDescription() {
        return new String("Murder mystery and thriller");
    }

    @Override
    public double getDuration() {
        return 2.2 * 60;
    }
}
