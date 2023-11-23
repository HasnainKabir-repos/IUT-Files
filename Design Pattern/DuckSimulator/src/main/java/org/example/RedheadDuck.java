package org.example;

public class RedheadDuck implements Quackable{
    Observable observable;
    public RedheadDuck() {
        observable = new Observable(this);
    }
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
    @Override
    public String toString() {
        return "Redhead Duck";
    }
}
