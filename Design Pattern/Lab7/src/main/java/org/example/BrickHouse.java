package org.example;

import java.util.ArrayList;
import java.util.List;

public class BrickHouse extends House {
    List<CompundGraphic> components;

    public BrickHouse(){
        components = new ArrayList<>();
        components.add(new House());
        components.add(new Brick());
    }
    @Override
    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
