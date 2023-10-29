package org.example;

public class House extends CompundGraphic {
    CompundGraphic group;

    public House(){
        group = new CompundGraphic();
        group.add(new Square());
        group.add(new Triangle());
        this.draw();
    }

    @Override
    public void draw() {

        System.out.println("House drawn");
    }
}
