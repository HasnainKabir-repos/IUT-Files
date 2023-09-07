public class Main {
    public static void main(String[] args){
        TextProcessor textProcessor = new TextProcessor(new UpperCaseFormatter());
        textProcessor.processText("abcdef");

        textProcessor = new TextProcessor(new LowerCaseFormatter());
        textProcessor.processText("IJKLMN");
    }
}
