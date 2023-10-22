package org.example;

import java.util.ArrayList;
import java.util.List;

public class SwimmingPool extends WaterSource {
    List<CompundGraphic> components;

    public SwimmingPool(){
        components = new ArrayList<>();
        components.add(new WaterSource());
    }
    @Override
    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
