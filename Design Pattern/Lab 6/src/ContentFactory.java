public class ContentFactory {
    public Content createContent(String contentType){
        if(contentType.equalsIgnoreCase("movie")){
            return new Movie();
        }else if(contentType.equalsIgnoreCase("tvshow")){
            return new TVShow();
        }

        return null;
    }
}
