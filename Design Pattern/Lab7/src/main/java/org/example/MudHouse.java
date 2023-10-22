package org.example;

import java.util.ArrayList;
import java.util.List;

public class MudHouse extends House{
    List<CompundGraphic> components;

    public MudHouse(){
        components = new ArrayList<>();
        components.add(new House());
        components.add(new Mud());
    }
    @Override
    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
