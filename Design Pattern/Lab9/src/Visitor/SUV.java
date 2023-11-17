package Visitor;

public class SUV implements Visitable{
    private double price;

    public SUV(int price){
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
