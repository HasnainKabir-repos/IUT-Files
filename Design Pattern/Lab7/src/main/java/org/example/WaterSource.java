package org.example;

public class WaterSource extends CompundGraphic {
    CompundGraphic group;

    public WaterSource(){
        group = new CompundGraphic();
        group.add(new Rectangle());

    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("WaterSource drawn");
    }
}
