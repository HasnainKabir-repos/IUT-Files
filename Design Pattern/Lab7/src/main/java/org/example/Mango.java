package org.example;

public class Mango extends CompundGraphic{
    CompundGraphic group;

    public Mango(){
        group = new CompundGraphic();
        group.add(new Circle());

    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Mango drawn");
    }
}
