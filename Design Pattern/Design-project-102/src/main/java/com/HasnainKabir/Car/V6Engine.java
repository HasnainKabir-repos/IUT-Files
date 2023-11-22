package com.HasnainKabir.Car;

public class V6Engine implements EngineBehavior{
    @Override
    public void start() {
        System.out.println("Starting V6 Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping V6 Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating with V6 Engine");
    }
}
