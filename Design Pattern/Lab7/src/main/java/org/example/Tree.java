package org.example;

public class Tree extends CompundGraphic{
    CompundGraphic group;

    public Tree(){
        group = new CompundGraphic();
        group.add(new Circle());
        group.add(new Circle());
        group.add(new Cylinder());

    }

    @Override
    public void draw() {

        System.out.println("Tree drawn");
    }
}
