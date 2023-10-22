package org.example;

public class House extends CompundGraphic {

    CompundGraphic group;

    public House(){
        group = new CompundGraphic();
        group.add(new Square());
        group.add(new Triangle());

    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("House drawn");
    }
}
