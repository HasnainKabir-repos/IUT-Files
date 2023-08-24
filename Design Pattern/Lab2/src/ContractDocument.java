public class ContractDocument extends DocumentGenerator {
    @Override
    void generateHeader() {
        System.out.println("Name of 1st party: Nibir");
        System.out.println("Name of 2nd party: Mamunur");
    }

    @Override
    void generateBody() {
        System.out.println("1st party will have to buy the 2nd party stuff if Man united wins");
        System.out.println("2nd party will have to buy the 1st party stuff if Man City wins");
    }

    @Override
    void generateFooter() {
        System.out.println("Signed by Nibir");
        System.out.println("Signed by Mamunur");
    }
}
