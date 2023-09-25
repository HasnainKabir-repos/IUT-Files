public class ContentDecorator implements Content{
    Content content;

    public ContentDecorator(Content content){
        this.content = content;
    }

    @Override
    public String getTitle() {
        return content.getTitle();
    }

    @Override
    public String getDescription() {
        return content.getDescription();
    }

    @Override
    public double getDuration() {
        return content.getDuration();
    }
}
