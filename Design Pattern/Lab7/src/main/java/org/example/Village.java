package org.example;

import java.util.ArrayList;
import java.util.List;

public class Village{
    List<CompundGraphic> components;

    public Village(){
        components = new ArrayList<>();
    }

    public void add(CompundGraphic compundGraphic){
        components.add(compundGraphic);
    }

    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
