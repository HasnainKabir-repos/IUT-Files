public abstract class DocumentGenerator {

    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();

    public final void generate(){
        generateHeader();
        generateBody();
        generateFooter();
    }
}
