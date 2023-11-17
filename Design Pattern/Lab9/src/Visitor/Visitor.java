package Visitor;

public interface Visitor {
    double visit(Sedan sedan);
    double visit(SUV suv);
}
