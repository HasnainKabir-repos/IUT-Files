package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pond extends WaterSource {
    List<CompundGraphic> components;

    public Pond(){
        components = new ArrayList<>();
        components.add(new WaterSource());
    }

    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
