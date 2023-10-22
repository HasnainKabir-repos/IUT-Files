package org.example;

public class Banana extends CompundGraphic{
    CompundGraphic group;

    public Banana(){
        group = new CompundGraphic();
        group.add(new Cylinder());
        group.add(new Triangle());

    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Banana drawn");
    }
}
