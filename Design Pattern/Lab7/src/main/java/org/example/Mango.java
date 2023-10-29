package org.example;

public class Mango extends CompundGraphic{
    CompundGraphic group;

    public Mango(){
        group = new CompundGraphic();
        group.add(new Circle());
        this.draw();
    }

    @Override
    public void draw() {

        System.out.println("Mango drawn");
    }
}
