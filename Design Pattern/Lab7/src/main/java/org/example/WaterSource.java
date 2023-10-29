package org.example;

public class WaterSource extends CompundGraphic {
    CompundGraphic group;

    public WaterSource(){
        group = new CompundGraphic();
        group.add(new Rectangle());
        this.draw();
    }

    @Override
    public void draw() {

        System.out.println("WaterSource drawn");
    }
}
