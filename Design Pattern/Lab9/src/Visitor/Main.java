package Visitor;

public class Main {
    public static void main(String[] args){
        TaxVisitor taxVisitor = new TaxVisitor();

        Sedan premio = new Sedan(800000);
        SUV cross = new SUV(1400000);

        System.out.println("Premio tax " + premio.accept(taxVisitor));
        System.out.println("Cross tax " + cross.accept(taxVisitor));
    }
}
