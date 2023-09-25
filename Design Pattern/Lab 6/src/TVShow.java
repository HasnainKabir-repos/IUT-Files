public class TVShow implements Content{
    @Override
    public String getTitle() {
        return new String("Breaking Bad");
    }

    @Override
    public String getDescription() {
        return new String("Normal guy decides to earn more money");
    }

    @Override
    public double getDuration() {
        return 10*40;
    }
}
