package org.example;

import java.util.ArrayList;
import java.util.List;

public class Village{
    List<CompundGraphic> components;

    public void add(CompundGraphic compundGraphic){
        components = new ArrayList<>();
        components.add(compundGraphic);
    }

    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
