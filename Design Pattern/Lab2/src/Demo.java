public class Demo {
    public static void main(String[] args){
        DocumentGenerator doc = new ContractDocument();
        doc.generate();
        DocumentGenerator doc2 = new LetterDocument();
        //doc2.generate();
    }
}
