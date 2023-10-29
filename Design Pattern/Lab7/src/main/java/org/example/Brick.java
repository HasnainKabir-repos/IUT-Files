package org.example;

public class Brick extends CompundGraphic{
    CompundGraphic group;

    public Brick(){
        group = new CompundGraphic();
        group.add(new Square());
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Brick Drawn");
    }
}
