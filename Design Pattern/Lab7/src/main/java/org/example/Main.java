package org.example;

public class Main {
    public static void main(String[] args) {
        Village village1 = new Village();
        village1.add(new BrickHouse());
        village1.add(new SwimmingPool());
        village1.add(new MangoTree());
        village1.draw();

        Village village2 = new Village();
        village2.add(new MudHouse());
        village2.add(new Pond());
        village2.add(new BananaTree());
        village2.draw();
    }
}