package com.HasnainKabir.Car;

//Decorator
public class CarWithNos extends Car{
    NOS nos;
    Car decoratedCar;
    public CarWithNos(Car decoratedCar, NOS nos){
        this.decoratedCar = decoratedCar;
        this.nos = nos;
    }

    @Override
    public void carInfo(){
        System.out.println("Car With Nos");
    }

    @Override
    public void start(){
        decoratedCar.start();
    }

    @Override
    public void stop(){
        decoratedCar.stop();
    }

    @Override
    public void accelerate(){
        decoratedCar.accelerate();
    }

    @Override
    public void applyTurbocharger(){
        decoratedCar.applyTurbocharger();
    }

    public void applyNos(){
        nos.applyNos();
    }
}
