public class SubtitleDecorator extends ContentDecorator{
    public SubtitleDecorator(Content content) {
        super(content);
    }

    @Override
    public String getDescription() {
        return content.getDescription() + " Added Subtitles ";
    }

}
