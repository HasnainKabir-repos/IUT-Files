package org.example;

public class Banana extends CompundGraphic{
    CompundGraphic group;

    public Banana(){
        group = new CompundGraphic();
        group.add(new Cylinder());
        group.add(new Triangle());
        this.draw();

    }

    @Override
    public void draw() {

        System.out.println("Banana drawn");
    }
}
