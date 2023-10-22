package org.example;

import java.util.ArrayList;
import java.util.List;

public class MangoTree extends Tree{
    List<CompundGraphic> components;

    public MangoTree(){
        components = new ArrayList<>();
        components.add(new Tree());
        components.add(new Mango());
    }
    @Override
    public void draw(){
        for(CompundGraphic component : components){
            component.draw();
        }
    }
}
