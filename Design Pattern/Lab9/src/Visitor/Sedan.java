package Visitor;

public class Sedan implements Visitable{

    private double price;

    public Sedan(int price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
