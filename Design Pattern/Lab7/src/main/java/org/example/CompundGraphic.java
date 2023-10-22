package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompundGraphic implements Graphic{
    List<Graphic> components;

    public void add(Graphic graphic){
        components = new ArrayList<>();
        components.add(graphic);
    }

    @Override
    public void draw() {
        for(Graphic graphic: components){
            graphic.draw();
        }
    }
}
