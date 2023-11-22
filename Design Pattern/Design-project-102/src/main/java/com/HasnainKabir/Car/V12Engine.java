package com.HasnainKabir.Car;

public class V12Engine implements EngineBehavior{
    @Override
    public void start() {
        System.out.println("Starting V12 Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping V12 Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating V12 Engine");
    }
}
