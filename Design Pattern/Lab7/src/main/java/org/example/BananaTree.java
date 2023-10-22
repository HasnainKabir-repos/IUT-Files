package org.example;

import java.util.ArrayList;
import java.util.List;

public class BananaTree extends Tree {
    List<CompundGraphic> components;

    public BananaTree(){
        components = new ArrayList<>();
        components.add(new Tree());
        components.add(new Banana());
    }

    @Override
    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
