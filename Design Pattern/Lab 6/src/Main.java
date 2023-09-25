public class Main {
    public static void main(String[] args){
        ContentFactory factory = new ContentFactory();
        Content movie = factory.createContent("Movie");
        System.out.println(movie.getTitle() + " " + movie.getDescription() + " " + movie.getDuration());

        PlaybackStrategy hdStrategy = new HDStreamingStrategy();
        hdStrategy.play(movie);

        Content enhancedMovie = new SubtitleDecorator(movie);

        System.out.println(enhancedMovie.getDescription());

        Content adFreeMovie = new AdRemovalDecorator(enhancedMovie);
        System.out.println(adFreeMovie.getDescription());
    }
}
