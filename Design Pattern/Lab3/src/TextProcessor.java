public class TextProcessor {
    private TextFormatter textFormatter;

    public TextProcessor(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String processText(String text) {
        System.out.println(textFormatter.format(text));
        return textFormatter.format(text);
    }
}
