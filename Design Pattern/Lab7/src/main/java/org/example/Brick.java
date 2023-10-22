package org.example;

public class Brick extends CompundGraphic{
    CompundGraphic group;

    public Brick(){
        group = new CompundGraphic();
        group.add(new Square());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Brick Drawn");
    }
}
