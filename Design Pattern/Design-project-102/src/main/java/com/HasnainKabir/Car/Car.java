package com.HasnainKabir.Car;

public abstract class Car {
    EngineBehavior engineBehavior;
    TurbochargerBehavior turbochargerBehavior;

    public void setEngineBehavior(EngineBehavior engineBehavior) {
        this.engineBehavior = engineBehavior;
    }

    public void setTurbochargerBehavior(TurbochargerBehavior turbochargerBehavior) {
        this.turbochargerBehavior = turbochargerBehavior;
    }

    public abstract void carInfo();

    public void start() {
        engineBehavior.start();
    }

    public void stop() {
        engineBehavior.stop();
    }

    public void accelerate() {
        engineBehavior.accelerate();
    }

    public void applyTurbocharger() {
        turbochargerBehavior.applyTurbocharger();
    }
}
