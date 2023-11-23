package org.example;

public class DuckFactory implements AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
