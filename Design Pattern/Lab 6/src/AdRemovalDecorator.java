public class AdRemovalDecorator extends ContentDecorator{
    public AdRemovalDecorator(Content content) {
        super(content);
    }

    @Override
    public String getDescription() {
        return content.getDescription()+ " Ad free";
    }

}
