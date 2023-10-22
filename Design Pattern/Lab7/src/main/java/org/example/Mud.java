package org.example;

public class Mud extends CompundGraphic{

    CompundGraphic group;

    public Mud(){
        group = new CompundGraphic();
        group.add(new Rectangle());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Mud drawn");
    }
}
