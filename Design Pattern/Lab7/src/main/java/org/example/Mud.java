package org.example;

public class Mud extends CompundGraphic{

    CompundGraphic group;

    public Mud(){
        group = new CompundGraphic();
        group.add(new Rectangle());
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Mud drawn");
    }
}
