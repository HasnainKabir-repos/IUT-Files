public class LetterDocument extends DocumentGenerator{
    @Override
    void generateHeader() {
        System.out.println("Dear X,");
    }

    @Override
    void generateBody() {
        System.out.println("You owe me Kacchi Biriyani. Please see to it that I am fed properly.");
    }

    @Override
    void generateFooter() {
        System.out.println("Sincerely Yours,");
        System.out.println("Nibir");
    }
}
