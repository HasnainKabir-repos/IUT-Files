package com.HasnainKabir.Car;

public class V8Engine implements EngineBehavior{
    @Override
    public void start() {
        System.out.println("Starting V8 Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping V8 Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating V8 Engine");
    }
}
