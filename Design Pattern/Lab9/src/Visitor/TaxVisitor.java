package Visitor;

public class TaxVisitor implements Visitor{
    @Override
    public double visit(Sedan sedan) {
        System.out.println("Sedan car tax");
        return (double) sedan.getPrice() * 0.6;
    }

    @Override
    public double visit(SUV suv) {
        return (double) suv.getPrice() * 0.8;
    }
}
